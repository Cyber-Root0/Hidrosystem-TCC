package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0045a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p005v4.p013e.C0271a;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.widget.C0522p;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0088a<V> {

    /* renamed from: a */
    int f214a;

    /* renamed from: b */
    int f215b;

    /* renamed from: c */
    boolean f216c;

    /* renamed from: d */
    int f217d = 4;

    /* renamed from: e */
    C0522p f218e;

    /* renamed from: f */
    int f219f;

    /* renamed from: g */
    WeakReference<V> f220g;

    /* renamed from: h */
    WeakReference<View> f221h;

    /* renamed from: i */
    int f222i;

    /* renamed from: j */
    boolean f223j;

    /* renamed from: k */
    private float f224k;

    /* renamed from: l */
    private int f225l;

    /* renamed from: m */
    private boolean f226m;

    /* renamed from: n */
    private int f227n;

    /* renamed from: o */
    private boolean f228o;

    /* renamed from: p */
    private boolean f229p;

    /* renamed from: q */
    private int f230q;

    /* renamed from: r */
    private boolean f231r;

    /* renamed from: s */
    private C0082a f232s;

    /* renamed from: t */
    private VelocityTracker f233t;

    /* renamed from: u */
    private int f234u;

    /* renamed from: v */
    private final C0522p.C0525a f235v = new C0522p.C0525a() {
        /* renamed from: a */
        public int mo367a(View view) {
            return (BottomSheetBehavior.this.f216c ? BottomSheetBehavior.this.f219f : BottomSheetBehavior.this.f215b) - BottomSheetBehavior.this.f214a;
        }

        /* renamed from: a */
        public int mo368a(View view, int i, int i2) {
            return C0271a.m1254a(i, BottomSheetBehavior.this.f214a, BottomSheetBehavior.this.f216c ? BottomSheetBehavior.this.f219f : BottomSheetBehavior.this.f215b);
        }

        /* renamed from: a */
        public void mo369a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo362b(1);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (java.lang.Math.abs(r6 - r3.f236a.f214a) < java.lang.Math.abs(r6 - r3.f236a.f215b)) goto L_0x0007;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo370a(android.view.View r4, float r5, float r6) {
            /*
                r3 = this;
                r5 = 4
                r0 = 3
                r1 = 0
                int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x000c
            L_0x0007:
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                int r5 = r5.f214a
                goto L_0x0045
            L_0x000c:
                android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                boolean r2 = r2.f216c
                if (r2 == 0) goto L_0x0021
                android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                boolean r2 = r2.mo361a(r4, r6)
                if (r2 == 0) goto L_0x0021
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                int r5 = r5.f219f
                r6 = 5
                r0 = 5
                goto L_0x0045
            L_0x0021:
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 != 0) goto L_0x003f
                int r6 = r4.getTop()
                android.support.design.widget.BottomSheetBehavior r1 = android.support.design.widget.BottomSheetBehavior.this
                int r1 = r1.f214a
                int r1 = r6 - r1
                int r1 = java.lang.Math.abs(r1)
                android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                int r2 = r2.f215b
                int r6 = r6 - r2
                int r6 = java.lang.Math.abs(r6)
                if (r1 >= r6) goto L_0x003f
                goto L_0x0007
            L_0x003f:
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                int r6 = r6.f215b
                r5 = r6
                r0 = 4
            L_0x0045:
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                android.support.v4.widget.p r6 = r6.f218e
                int r1 = r4.getLeft()
                boolean r5 = r6.mo2176a((int) r1, (int) r5)
                if (r5 == 0) goto L_0x0064
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                r6 = 2
                r5.mo362b((int) r6)
                android.support.design.widget.BottomSheetBehavior$c r5 = new android.support.design.widget.BottomSheetBehavior$c
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                r5.<init>(r4, r0)
                android.support.p005v4.p017i.C0388q.m1647a((android.view.View) r4, (java.lang.Runnable) r5)
                goto L_0x0069
            L_0x0064:
                android.support.design.widget.BottomSheetBehavior r4 = android.support.design.widget.BottomSheetBehavior.this
                r4.mo362b((int) r0)
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.C00811.mo370a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public void mo371a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo365c(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            r6 = (android.view.View) r4.f236a.f221h.get();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo372a(android.view.View r5, int r6) {
            /*
                r4 = this;
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f217d
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x0009
                return r2
            L_0x0009:
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                boolean r0 = r0.f223j
                if (r0 == 0) goto L_0x0010
                return r2
            L_0x0010:
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f217d
                r3 = 3
                if (r0 != r3) goto L_0x0031
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f222i
                if (r0 != r6) goto L_0x0031
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                java.lang.ref.WeakReference<android.view.View> r6 = r6.f221h
                java.lang.Object r6 = r6.get()
                android.view.View r6 = (android.view.View) r6
                if (r6 == 0) goto L_0x0031
                r0 = -1
                boolean r6 = r6.canScrollVertically(r0)
                if (r6 == 0) goto L_0x0031
                return r2
            L_0x0031:
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                java.lang.ref.WeakReference<V> r6 = r6.f220g
                if (r6 == 0) goto L_0x0042
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                java.lang.ref.WeakReference<V> r6 = r6.f220g
                java.lang.Object r6 = r6.get()
                if (r6 != r5) goto L_0x0042
                goto L_0x0043
            L_0x0042:
                r1 = 0
            L_0x0043:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.C00811.mo372a(android.view.View, int):boolean");
        }

        /* renamed from: b */
        public int mo373b(View view, int i, int i2) {
            return view.getLeft();
        }
    };

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0082a {
        /* renamed from: a */
        public abstract void mo374a(View view, float f);

        /* renamed from: a */
        public abstract void mo375a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    protected static class C0083b extends C0321a {
        public static final Parcelable.Creator<C0083b> CREATOR = new Parcelable.ClassLoaderCreator<C0083b>() {
            /* renamed from: a */
            public C0083b createFromParcel(Parcel parcel) {
                return new C0083b(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0083b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0083b(parcel, classLoader);
            }

            /* renamed from: a */
            public C0083b[] newArray(int i) {
                return new C0083b[i];
            }
        };

        /* renamed from: a */
        final int f237a;

        public C0083b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f237a = parcel.readInt();
        }

        public C0083b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f237a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f237a);
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$c */
    private class C0085c implements Runnable {

        /* renamed from: b */
        private final View f239b;

        /* renamed from: c */
        private final int f240c;

        C0085c(View view, int i) {
            this.f239b = view;
            this.f240c = i;
        }

        public void run() {
            if (BottomSheetBehavior.this.f218e == null || !BottomSheetBehavior.this.f218e.mo2179a(true)) {
                BottomSheetBehavior.this.mo362b(this.f240c);
            } else {
                C0388q.m1647a(this.f239b, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0045a.C0054i.BottomSheetBehavior_Layout_behavior_peekHeight);
        mo355a((peekValue == null || peekValue.data != -1) ? obtainStyledAttributes.getDimensionPixelSize(C0045a.C0054i.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : peekValue.data);
        mo357a(obtainStyledAttributes.getBoolean(C0045a.C0054i.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo363b(obtainStyledAttributes.getBoolean(C0045a.C0054i.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f224k = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private void m255a() {
        this.f222i = -1;
        VelocityTracker velocityTracker = this.f233t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f233t = null;
        }
    }

    /* renamed from: b */
    private float m256b() {
        this.f233t.computeCurrentVelocity(1000, this.f224k);
        return this.f233t.getYVelocity(this.f222i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo354a(View view) {
        if (C0388q.m1674u(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo354a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo355a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f226m
            if (r4 != 0) goto L_0x0015
            r3.f226m = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f226m
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f225l
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f226m = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f225l = r1
            int r1 = r3.f219f
            int r1 = r1 - r4
            r3.f215b = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f217d
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f220g
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo355a(int):void");
    }

    /* renamed from: a */
    public void mo315a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0083b bVar = (C0083b) parcelable;
        super.mo315a(coordinatorLayout, v, bVar.mo1402a());
        this.f217d = (bVar.f237a == 1 || bVar.f237a == 2) ? 4 : bVar.f237a;
    }

    /* renamed from: a */
    public void mo356a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        int i3;
        if (view == ((View) this.f221h.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = this.f214a;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    C0388q.m1653b((View) v, -iArr[1]);
                    i3 = 3;
                } else {
                    iArr[1] = i2;
                    C0388q.m1653b((View) v, -i2);
                    mo362b(1);
                    mo365c(v.getTop());
                    this.f230q = i2;
                    this.f231r = true;
                }
            } else {
                if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.f215b;
                    if (i4 <= i6 || this.f216c) {
                        iArr[1] = i2;
                        C0388q.m1653b((View) v, -i2);
                        mo362b(1);
                    } else {
                        iArr[1] = top - i6;
                        C0388q.m1653b((View) v, -iArr[1]);
                        i3 = 4;
                    }
                }
                mo365c(v.getTop());
                this.f230q = i2;
                this.f231r = true;
            }
            mo362b(i3);
            mo365c(v.getTop());
            this.f230q = i2;
            this.f231r = true;
        }
    }

    /* renamed from: a */
    public void mo357a(boolean z) {
        this.f216c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo324a(android.support.design.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
            r5 = this;
            boolean r0 = android.support.p005v4.p017i.C0388q.m1669p(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = android.support.p005v4.p017i.C0388q.m1669p(r7)
            if (r0 != 0) goto L_0x0010
            android.support.p005v4.p017i.C0388q.m1649a((android.view.View) r7, (boolean) r1)
        L_0x0010:
            int r0 = r7.getTop()
            r6.mo394a((android.view.View) r7, (int) r8)
            int r8 = r6.getHeight()
            r5.f219f = r8
            boolean r8 = r5.f226m
            if (r8 == 0) goto L_0x0043
            int r8 = r5.f227n
            if (r8 != 0) goto L_0x0031
            android.content.res.Resources r8 = r6.getResources()
            int r2 = android.support.design.C0045a.C0048c.design_bottom_sheet_peek_height_min
            int r8 = r8.getDimensionPixelSize(r2)
            r5.f227n = r8
        L_0x0031:
            int r8 = r5.f227n
            int r2 = r5.f219f
            int r3 = r6.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0045
        L_0x0043:
            int r8 = r5.f225l
        L_0x0045:
            r2 = 0
            int r3 = r5.f219f
            int r4 = r7.getHeight()
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            r5.f214a = r2
            int r2 = r5.f219f
            int r2 = r2 - r8
            int r8 = r5.f214a
            int r8 = java.lang.Math.max(r2, r8)
            r5.f215b = r8
            int r8 = r5.f217d
            r2 = 3
            if (r8 != r2) goto L_0x0069
            int r8 = r5.f214a
        L_0x0065:
            android.support.p005v4.p017i.C0388q.m1653b((android.view.View) r7, (int) r8)
            goto L_0x0088
        L_0x0069:
            boolean r2 = r5.f216c
            if (r2 == 0) goto L_0x0073
            r2 = 5
            if (r8 != r2) goto L_0x0073
            int r8 = r5.f219f
            goto L_0x0065
        L_0x0073:
            int r8 = r5.f217d
            r2 = 4
            if (r8 != r2) goto L_0x007b
            int r8 = r5.f215b
            goto L_0x0065
        L_0x007b:
            if (r8 == r1) goto L_0x0080
            r2 = 2
            if (r8 != r2) goto L_0x0088
        L_0x0080:
            int r8 = r7.getTop()
            int r0 = r0 - r8
            android.support.p005v4.p017i.C0388q.m1653b((android.view.View) r7, (int) r0)
        L_0x0088:
            android.support.v4.widget.p r8 = r5.f218e
            if (r8 != 0) goto L_0x0094
            android.support.v4.widget.p$a r8 = r5.f235v
            android.support.v4.widget.p r6 = android.support.p005v4.widget.C0522p.m2380a((android.view.ViewGroup) r6, (android.support.p005v4.widget.C0522p.C0525a) r8)
            r5.f218e = r6
        L_0x0094:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r7)
            r5.f220g = r6
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.view.View r7 = r5.mo354a((android.view.View) r7)
            r6.<init>(r7)
            r5.f221h = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo324a(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: a */
    public boolean mo358a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.f229p = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m255a();
        }
        if (this.f233t == null) {
            this.f233t = VelocityTracker.obtain();
        }
        this.f233t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f234u = (int) motionEvent.getY();
                    WeakReference<View> weakReference = this.f221h;
                    View view = weakReference != null ? (View) weakReference.get() : null;
                    if (view != null && coordinatorLayout.mo401a(view, x, this.f234u)) {
                        this.f222i = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f223j = true;
                    }
                    this.f229p = this.f222i == -1 && !coordinatorLayout.mo401a((View) v, x, this.f234u);
                    break;
                case 1:
                    break;
            }
        }
        this.f223j = false;
        this.f222i = -1;
        if (this.f229p) {
            this.f229p = false;
            return false;
        }
        if (!this.f229p && this.f218e.mo2177a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f221h.get();
        return actionMasked == 2 && view2 != null && !this.f229p && this.f217d != 1 && !coordinatorLayout.mo401a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f234u) - motionEvent.getY()) > ((float) this.f218e.mo2189d());
    }

    /* renamed from: a */
    public boolean mo359a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f221h.get() && (this.f217d != 3 || super.mo359a(coordinatorLayout, v, view, f, f2));
    }

    /* renamed from: a */
    public boolean mo360a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f230q = 0;
        this.f231r = false;
        return (i & 2) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo361a(View view, float f) {
        if (this.f228o) {
            return true;
        }
        return view.getTop() >= this.f215b && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f215b)) / ((float) this.f225l) > 0.5f;
    }

    /* renamed from: b */
    public Parcelable mo331b(CoordinatorLayout coordinatorLayout, V v) {
        return new C0083b(super.mo331b(coordinatorLayout, v), this.f217d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo362b(int i) {
        C0082a aVar;
        if (this.f217d != i) {
            this.f217d = i;
            View view = (View) this.f220g.get();
            if (view != null && (aVar = this.f232s) != null) {
                aVar.mo375a(view, i);
            }
        }
    }

    /* renamed from: b */
    public void mo363b(boolean z) {
        this.f228o = z;
    }

    /* renamed from: b */
    public boolean mo364b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f217d == 1 && actionMasked == 0) {
            return true;
        }
        this.f218e.mo2181b(motionEvent);
        if (actionMasked == 0) {
            m255a();
        }
        if (this.f233t == null) {
            this.f233t = VelocityTracker.obtain();
        }
        this.f233t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f229p && Math.abs(((float) this.f234u) - motionEvent.getY()) > ((float) this.f218e.mo2189d())) {
            this.f218e.mo2175a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f229p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo365c(int i) {
        C0082a aVar;
        float f;
        float f2;
        View view = (View) this.f220g.get();
        if (view != null && (aVar = this.f232s) != null) {
            int i2 = this.f215b;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.f219f - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - this.f214a);
            }
            aVar.mo374a(view, f / f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (java.lang.Math.abs(r4 - r3.f214a) < java.lang.Math.abs(r4 - r3.f215b)) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo366c(android.support.design.widget.CoordinatorLayout r4, V r5, android.view.View r6) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r0 = r3.f214a
            r1 = 3
            if (r4 != r0) goto L_0x000d
            r3.mo362b((int) r1)
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f221h
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x0072
            boolean r4 = r3.f231r
            if (r4 != 0) goto L_0x001c
            goto L_0x0072
        L_0x001c:
            int r4 = r3.f230q
            r6 = 4
            if (r4 <= 0) goto L_0x0024
        L_0x0021:
            int r4 = r3.f214a
            goto L_0x0053
        L_0x0024:
            boolean r4 = r3.f216c
            if (r4 == 0) goto L_0x0036
            float r4 = r3.m256b()
            boolean r4 = r3.mo361a(r5, r4)
            if (r4 == 0) goto L_0x0036
            int r4 = r3.f219f
            r1 = 5
            goto L_0x0053
        L_0x0036:
            int r4 = r3.f230q
            if (r4 != 0) goto L_0x0050
            int r4 = r5.getTop()
            int r0 = r3.f214a
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r2 = r3.f215b
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            int r4 = r3.f215b
            r1 = 4
        L_0x0053:
            android.support.v4.widget.p r6 = r3.f218e
            int r0 = r5.getLeft()
            boolean r4 = r6.mo2178a((android.view.View) r5, (int) r0, (int) r4)
            if (r4 == 0) goto L_0x006c
            r4 = 2
            r3.mo362b((int) r4)
            android.support.design.widget.BottomSheetBehavior$c r4 = new android.support.design.widget.BottomSheetBehavior$c
            r4.<init>(r5, r1)
            android.support.p005v4.p017i.C0388q.m1647a((android.view.View) r5, (java.lang.Runnable) r4)
            goto L_0x006f
        L_0x006c:
            r3.mo362b((int) r1)
        L_0x006f:
            r4 = 0
            r3.f231r = r4
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo366c(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):void");
    }
}
