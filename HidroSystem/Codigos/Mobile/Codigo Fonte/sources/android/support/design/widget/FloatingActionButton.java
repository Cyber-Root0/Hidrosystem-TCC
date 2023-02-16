package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0045a;
import android.support.design.widget.C0127e;
import android.support.design.widget.CoordinatorLayout;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.widget.C0900p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

@CoordinatorLayout.C0089b(mo463a = Behavior.class)
public class FloatingActionButton extends C0154r {

    /* renamed from: a */
    int f290a;

    /* renamed from: b */
    boolean f291b;

    /* renamed from: c */
    final Rect f292c;

    /* renamed from: d */
    private ColorStateList f293d;

    /* renamed from: e */
    private PorterDuff.Mode f294e;

    /* renamed from: f */
    private int f295f;

    /* renamed from: g */
    private int f296g;

    /* renamed from: h */
    private int f297h;

    /* renamed from: i */
    private final Rect f298i;

    /* renamed from: j */
    private C0900p f299j;

    /* renamed from: k */
    private C0127e f300k;

    public static class Behavior extends CoordinatorLayout.C0088a<FloatingActionButton> {

        /* renamed from: a */
        private Rect f303a;

        /* renamed from: b */
        private C0097a f304b;

        /* renamed from: c */
        private boolean f305c;

        public Behavior() {
            this.f305c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.FloatingActionButton_Behavior_Layout);
            this.f305c = obtainStyledAttributes.getBoolean(C0045a.C0054i.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m400a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f292c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0091d dVar = (CoordinatorLayout.C0091d) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= dVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= dVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0388q.m1653b((View) floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0388q.m1656c(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private boolean m401a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m403a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f303a == null) {
                this.f303a = new Rect();
            }
            Rect rect = this.f303a;
            C0150n.m591b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo494b(this.f304b, false);
                return true;
            }
            floatingActionButton.mo492a(this.f304b, false);
            return true;
        }

        /* renamed from: a */
        private static boolean m402a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0091d) {
                return ((CoordinatorLayout.C0091d) layoutParams).mo474b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m403a(View view, FloatingActionButton floatingActionButton) {
            return this.f305c && ((CoordinatorLayout.C0091d) floatingActionButton.getLayoutParams()).mo466a() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: b */
        private boolean m404b(View view, FloatingActionButton floatingActionButton) {
            if (!m403a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0091d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo494b(this.f304b, false);
                return true;
            }
            floatingActionButton.mo492a(this.f304b, false);
            return true;
        }

        /* renamed from: a */
        public void mo452a(CoordinatorLayout.C0091d dVar) {
            if (dVar.f277h == 0) {
                dVar.f277h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo324a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> c = coordinatorLayout.mo408c((View) floatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m402a(view) && m404b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m401a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo394a((View) floatingActionButton, i);
            m400a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo454a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f292c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo349b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m401a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m402a(view)) {
                return false;
            } else {
                m404b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0097a {
        /* renamed from: a */
        public void mo525a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo526b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C0098b implements C0141j {
        C0098b() {
        }

        /* renamed from: a */
        public float mo527a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo528a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f292c.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f290a, i2 + FloatingActionButton.this.f290a, i3 + FloatingActionButton.this.f290a, i4 + FloatingActionButton.this.f290a);
        }

        /* renamed from: a */
        public void mo529a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo530b() {
            return FloatingActionButton.this.f291b;
        }
    }

    /* renamed from: a */
    private int m390a(int i) {
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m390a(1) : m390a(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C0045a.C0048c.design_fab_size_normal : C0045a.C0048c.design_fab_size_mini);
    }

    /* renamed from: a */
    private static int m391a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? i : size : Math.min(i, size);
    }

    /* renamed from: a */
    private C0127e.C0133c m392a(final C0097a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0127e.C0133c() {
            /* renamed from: a */
            public void mo520a() {
                aVar.mo525a(FloatingActionButton.this);
            }

            /* renamed from: b */
            public void mo521b() {
                aVar.mo526b(FloatingActionButton.this);
            }
        };
    }

    /* renamed from: a */
    private C0127e m393a() {
        return Build.VERSION.SDK_INT >= 21 ? new C0136f(this, new C0098b()) : new C0127e(this, new C0098b());
    }

    private C0127e getImpl() {
        if (this.f300k == null) {
            this.f300k = m393a();
        }
        return this.f300k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo492a(C0097a aVar, boolean z) {
        getImpl().mo630b(m392a(aVar), z);
    }

    /* renamed from: a */
    public boolean mo493a(Rect rect) {
        if (!C0388q.m1676w(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.f292c.left;
        rect.top += this.f292c.top;
        rect.right -= this.f292c.right;
        rect.bottom -= this.f292c.bottom;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo494b(C0097a aVar, boolean z) {
        getImpl().mo626a(m392a(aVar), z);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo627a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f293d;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f294e;
    }

    public float getCompatElevation() {
        return getImpl().mo619a();
    }

    public Drawable getContentBackground() {
        return getImpl().mo631c();
    }

    public int getRippleColor() {
        return this.f295f;
    }

    public int getSize() {
        return this.f296g;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m390a(this.f296g);
    }

    public boolean getUseCompatPadding() {
        return this.f291b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo628b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo634f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo635g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f290a = (sizeDimension - this.f297h) / 2;
        getImpl().mo633e();
        int min = Math.min(m391a(sizeDimension, i), m391a(sizeDimension, i2));
        setMeasuredDimension(this.f292c.left + min + this.f292c.right, min + this.f292c.top + this.f292c.bottom);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && mo493a(this.f298i) && !this.f298i.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f293d != colorStateList) {
            this.f293d = colorStateList;
            getImpl().mo623a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f294e != mode) {
            this.f294e = mode;
            getImpl().mo624a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo620a(f);
    }

    public void setImageResource(int i) {
        this.f299j.mo4473a(i);
    }

    public void setRippleColor(int i) {
        if (this.f295f != i) {
            this.f295f = i;
            getImpl().mo622a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.f296g) {
            this.f296g = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f291b != z) {
            this.f291b = z;
            getImpl().mo632d();
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
