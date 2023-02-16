package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0045a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p005v4.p013e.C0271a;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0416y;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.C0089b(mo463a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f189a;

    /* renamed from: b */
    private int f190b;

    /* renamed from: c */
    private int f191c;

    /* renamed from: d */
    private boolean f192d;

    /* renamed from: e */
    private int f193e;

    /* renamed from: f */
    private C0416y f194f;

    /* renamed from: g */
    private List<C0080b> f195g;

    /* renamed from: h */
    private boolean f196h;

    /* renamed from: i */
    private boolean f197i;

    /* renamed from: j */
    private int[] f198j;

    public static class Behavior extends C0137g<AppBarLayout> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f199b;

        /* renamed from: c */
        private ValueAnimator f200c;

        /* renamed from: d */
        private int f201d = -1;

        /* renamed from: e */
        private boolean f202e;

        /* renamed from: f */
        private float f203f;

        /* renamed from: g */
        private WeakReference<View> f204g;

        /* renamed from: h */
        private C0076a f205h;

        /* renamed from: android.support.design.widget.AppBarLayout$Behavior$a */
        public static abstract class C0076a {
            /* renamed from: a */
            public abstract boolean mo335a(AppBarLayout appBarLayout);
        }

        /* renamed from: android.support.design.widget.AppBarLayout$Behavior$b */
        protected static class C0077b extends C0321a {
            public static final Parcelable.Creator<C0077b> CREATOR = new Parcelable.ClassLoaderCreator<C0077b>() {
                /* renamed from: a */
                public C0077b createFromParcel(Parcel parcel) {
                    return new C0077b(parcel, (ClassLoader) null);
                }

                /* renamed from: a */
                public C0077b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0077b(parcel, classLoader);
                }

                /* renamed from: a */
                public C0077b[] newArray(int i) {
                    return new C0077b[i];
                }
            };

            /* renamed from: a */
            int f209a;

            /* renamed from: b */
            float f210b;

            /* renamed from: c */
            boolean f211c;

            public C0077b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f209a = parcel.readInt();
                this.f210b = parcel.readFloat();
                this.f211c = parcel.readByte() != 0;
            }

            public C0077b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f209a);
                parcel.writeFloat(this.f210b);
                parcel.writeByte(this.f211c ? (byte) 1 : 0);
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private int m196a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        private void m197a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int abs = Math.abs(mo305a() - i);
            float abs2 = Math.abs(f);
            m198a(coordinatorLayout, appBarLayout, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m198a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int i2) {
            int a = mo305a();
            if (a == i) {
                ValueAnimator valueAnimator = this.f200c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f200c.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f200c;
            if (valueAnimator2 == null) {
                this.f200c = new ValueAnimator();
                this.f200c.setInterpolator(C0106a.f336e);
                this.f200c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.mo650a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f200c.setDuration((long) Math.min(i2, 600));
            this.f200c.setIntValues(new int[]{a, i});
            this.f200c.start();
        }

        /* renamed from: a */
        private void m199a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View c = m202c(appBarLayout, i);
            if (c != null) {
                int a = ((C0079a) c.getLayoutParams()).mo350a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int j = C0388q.m1663j(c);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (c.getBottom() - j) - appBarLayout.getTopInset()) : (-i) >= (c.getBottom() - j) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a2 = appBarLayout.mo283a(z2);
                if (Build.VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (a2 && m204d(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private static boolean m200a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: b */
        private int m201b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                C0079a aVar = (C0079a) childAt.getLayoutParams();
                Interpolator b = aVar.mo351b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = aVar.mo350a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + aVar.topMargin + aVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0388q.m1663j(childAt);
                        }
                    }
                    if (C0388q.m1669p(childAt)) {
                        i2 -= appBarLayout.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private static View m202c(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: c */
        private void m203c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a = mo305a();
            int a2 = m196a(appBarLayout, a);
            if (a2 >= 0) {
                View childAt = appBarLayout.getChildAt(a2);
                int a3 = ((C0079a) childAt.getLayoutParams()).mo350a();
                if ((a3 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a2 == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (m200a(a3, 2)) {
                        i2 += C0388q.m1663j(childAt);
                    } else if (m200a(a3, 5)) {
                        int j = C0388q.m1663j(childAt) + i2;
                        if (a < j) {
                            i = j;
                        } else {
                            i2 = j;
                        }
                    }
                    if (a < (i2 + i) / 2) {
                        i = i2;
                    }
                    m197a(coordinatorLayout, appBarLayout, C0271a.m1254a(i, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: d */
        private boolean m204d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> d = coordinatorLayout.mo414d((View) appBarLayout);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.C0088a b = ((CoordinatorLayout.C0091d) d.get(i).getLayoutParams()).mo474b();
                if (b instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) b).mo657d() != 0;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo305a() {
            return mo327b() + this.f199b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo307a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int a = mo305a();
            int i4 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f199b = 0;
            } else {
                int a2 = C0271a.m1254a(i, i2, i3);
                if (a != a2) {
                    int b = appBarLayout.mo284b() ? m201b(appBarLayout, a2) : a2;
                    boolean a3 = mo319a(b);
                    i4 = a - a2;
                    this.f199b = a2 - b;
                    if (!a3 && appBarLayout.mo284b()) {
                        coordinatorLayout.mo404b((View) appBarLayout);
                    }
                    appBarLayout.mo281a(mo327b());
                    m199a(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo314a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m203c(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public void mo315a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof C0077b) {
                C0077b bVar = (C0077b) parcelable;
                super.mo315a(coordinatorLayout, appBarLayout, bVar.mo1402a());
                this.f201d = bVar.f209a;
                this.f203f = bVar.f210b;
                this.f202e = bVar.f211c;
                return;
            }
            super.mo315a(coordinatorLayout, appBarLayout, parcelable);
            this.f201d = -1;
        }

        /* renamed from: a */
        public void mo316a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                m203c(coordinatorLayout, appBarLayout);
            }
            this.f204g = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo317a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo651b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo318a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -appBarLayout.getTotalScrollRange();
                    i5 = i6;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo651b(coordinatorLayout, appBarLayout, i2, i5, i4);
                }
            }
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo319a(int i) {
            return super.mo319a(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo333c(AppBarLayout appBarLayout) {
            C0076a aVar = this.f205h;
            if (aVar != null) {
                return aVar.mo335a(appBarLayout);
            }
            WeakReference<View> weakReference = this.f204g;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* renamed from: a */
        public boolean mo324a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean a = super.mo324a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f201d;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                mo650a_(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f202e ? C0388q.m1663j(childAt) + appBarLayout.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f203f)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m197a(coordinatorLayout, appBarLayout, i3, 0.0f);
                    } else {
                        mo650a_(coordinatorLayout, appBarLayout, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m197a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo650a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.mo287d();
            this.f201d = -1;
            mo319a(C0271a.m1254a(mo327b(), -appBarLayout.getTotalScrollRange(), 0));
            m199a(coordinatorLayout, appBarLayout, mo327b(), 0, true);
            appBarLayout.mo281a(mo327b());
            return a;
        }

        /* renamed from: a */
        public boolean mo325a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0091d) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo325a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo395a((View) appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo326a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && appBarLayout.mo285c() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            if (z && (valueAnimator = this.f200c) != null) {
                valueAnimator.cancel();
            }
            this.f204g = null;
            return z;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo327b() {
            return super.mo327b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo329b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo331b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable b = super.mo331b(coordinatorLayout, appBarLayout);
            int b2 = mo327b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    C0077b bVar = new C0077b(b);
                    bVar.f209a = i;
                    if (bottom == C0388q.m1663j(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    bVar.f211c = z;
                    bVar.f210b = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo308a(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }
    }

    public static class ScrollingViewBehavior extends C0139h {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.ScrollingViewBehavior_Layout);
            mo654b(obtainStyledAttributes.getDimensionPixelSize(C0045a.C0054i.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m238a(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0088a b = ((CoordinatorLayout.C0091d) appBarLayout.getLayoutParams()).mo474b();
            if (b instanceof Behavior) {
                return ((Behavior) b).mo305a();
            }
            return 0;
        }

        /* renamed from: e */
        private void m239e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.C0088a b = ((CoordinatorLayout.C0091d) view2.getLayoutParams()).mo474b();
            if (b instanceof Behavior) {
                C0388q.m1653b(view, (((view2.getBottom() - view.getTop()) + ((Behavior) b).f199b) + mo653a()) - mo656c(view2));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo343a(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m238a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AppBarLayout mo348b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo319a(int i) {
            return super.mo319a(i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo324a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo324a(coordinatorLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo325a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo325a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public boolean mo345a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo348b(coordinatorLayout.mo408c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f424a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo282a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo346a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo327b() {
            return super.mo327b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo347b(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo347b(view);
        }

        /* renamed from: b */
        public boolean mo349b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m239e(coordinatorLayout, view, view2);
            return false;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$a */
    public static class C0079a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f212a = 1;

        /* renamed from: b */
        Interpolator f213b;

        public C0079a(int i, int i2) {
            super(i, i2);
        }

        public C0079a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.AppBarLayout_Layout);
            this.f212a = obtainStyledAttributes.getInt(C0045a.C0054i.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0045a.C0054i.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f213b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0045a.C0054i.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0079a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0079a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0079a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo350a() {
            return this.f212a;
        }

        /* renamed from: b */
        public Interpolator mo351b() {
            return this.f213b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo352c() {
            int i = this.f212a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$b */
    public interface C0080b {
        /* renamed from: a */
        void mo353a(AppBarLayout appBarLayout, int i);
    }

    /* renamed from: a */
    private void m182a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f193e = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m183b(boolean z) {
        if (this.f196h == z) {
            return false;
        }
        this.f196h = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private void m184e() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (((C0079a) getChildAt(i).getLayoutParams()).mo352c()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        m183b(z);
    }

    /* renamed from: f */
    private void m185f() {
        this.f189a = -1;
        this.f190b = -1;
        this.f191c = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0079a generateDefaultLayoutParams() {
        return new C0079a(-1, -2);
    }

    /* renamed from: a */
    public C0079a generateLayoutParams(AttributeSet attributeSet) {
        return new C0079a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0079a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0079a((ViewGroup.MarginLayoutParams) layoutParams) : new C0079a(layoutParams) : new C0079a((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo281a(int i) {
        List<C0080b> list = this.f195g;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0080b bVar = this.f195g.get(i2);
                if (bVar != null) {
                    bVar.mo353a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo282a(boolean z, boolean z2) {
        m182a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo283a(boolean z) {
        if (this.f197i == z) {
            return false;
        }
        this.f197i = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo284b() {
        return this.f192d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo285c() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0079a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo287d() {
        this.f193e = 0;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i = this.f190b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0079a aVar = (C0079a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.f212a;
            if ((i3 & 5) == 5) {
                int i4 = i2 + aVar.topMargin + aVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 = i4 + C0388q.m1663j(childAt);
                } else {
                    i2 = i4 + (measuredHeight - ((i3 & 2) != 0 ? C0388q.m1663j(childAt) : getTopInset()));
                }
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.f190b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f191c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0079a aVar = (C0079a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + aVar.topMargin + aVar.bottomMargin;
            int i4 = aVar.f212a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0388q.m1663j(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f191c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int j = C0388q.m1663j(this);
        if (j == 0) {
            int childCount = getChildCount();
            j = childCount >= 1 ? C0388q.m1663j(getChildAt(childCount - 1)) : 0;
            if (j == 0) {
                return getHeight() / 3;
            }
        }
        return (j * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f193e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0416y yVar = this.f194f;
        if (yVar != null) {
            return yVar.mo1649b();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f189a;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0079a aVar = (C0079a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f212a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + aVar.topMargin + aVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C0388q.m1663j(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f189a = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f198j == null) {
            this.f198j = new int[2];
        }
        int[] iArr = this.f198j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f196h ? C0045a.C0047b.state_collapsible : -C0045a.C0047b.state_collapsible;
        iArr[1] = (!this.f196h || !this.f197i) ? -C0045a.C0047b.state_collapsed : C0045a.C0047b.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m185f();
        int i5 = 0;
        this.f192d = false;
        int childCount = getChildCount();
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C0079a) getChildAt(i5).getLayoutParams()).mo351b() != null) {
                this.f192d = true;
                break;
            } else {
                i5++;
            }
        }
        m184e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m185f();
    }

    public void setExpanded(boolean z) {
        mo282a(z, C0388q.m1676w(this));
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0153q.m601a(this, f);
        }
    }
}
