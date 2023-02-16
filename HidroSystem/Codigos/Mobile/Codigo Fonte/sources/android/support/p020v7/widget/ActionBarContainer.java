package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f2031a;

    /* renamed from: b */
    Drawable f2032b;

    /* renamed from: c */
    Drawable f2033c;

    /* renamed from: d */
    boolean f2034d;

    /* renamed from: e */
    boolean f2035e;

    /* renamed from: f */
    private boolean f2036f;

    /* renamed from: g */
    private View f2037g;

    /* renamed from: h */
    private View f2038h;

    /* renamed from: i */
    private View f2039i;

    /* renamed from: j */
    private int f2040j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0388q.m1644a((View) this, Build.VERSION.SDK_INT >= 21 ? new C0867c(this) : new C0832b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.ActionBar);
        this.f2031a = obtainStyledAttributes.getDrawable(C0526a.C0536j.ActionBar_background);
        this.f2032b = obtainStyledAttributes.getDrawable(C0526a.C0536j.ActionBar_backgroundStacked);
        this.f2040j = obtainStyledAttributes.getDimensionPixelSize(C0526a.C0536j.ActionBar_height, -1);
        if (getId() == C0526a.C0532f.split_action_bar) {
            this.f2034d = true;
            this.f2033c = obtainStyledAttributes.getDrawable(C0526a.C0536j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f2034d ? this.f2031a == null && this.f2032b == null : this.f2033c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private boolean m3228a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m3229b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2031a;
        if (drawable != null && drawable.isStateful()) {
            this.f2031a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2032b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2032b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2033c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f2033c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f2037g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2031a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2032b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2033c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2038h = findViewById(C0526a.C0532f.action_bar);
        this.f2039i = findViewById(C0526a.C0532f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2036f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f2037g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f2034d) {
            Drawable drawable3 = this.f2033c;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f2031a != null) {
                if (this.f2038h.getVisibility() == 0) {
                    drawable2 = this.f2031a;
                    left = this.f2038h.getLeft();
                    top = this.f2038h.getTop();
                    right = this.f2038h.getRight();
                    view = this.f2038h;
                } else {
                    View view3 = this.f2039i;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f2031a.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f2031a;
                        left = this.f2039i.getLeft();
                        top = this.f2039i.getTop();
                        right = this.f2039i.getRight();
                        view = this.f2039i;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f2035e = z4;
            if (!z4 || (drawable = this.f2032b) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2038h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f2040j
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f2038h
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f2037g
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f2038h
            boolean r0 = r3.m3228a(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f2038h
        L_0x0042:
            int r0 = r3.m3229b(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f2039i
            boolean r0 = r3.m3228a(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f2039i
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f2037g
            int r1 = r3.m3229b(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2031a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2031a);
        }
        this.f2031a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2038h;
            if (view != null) {
                this.f2031a.setBounds(view.getLeft(), this.f2038h.getTop(), this.f2038h.getRight(), this.f2038h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2034d ? !(this.f2031a == null && this.f2032b == null) : this.f2033c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2033c;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2033c);
        }
        this.f2033c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2034d && (drawable2 = this.f2033c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2034d ? this.f2031a == null && this.f2032b == null : this.f2033c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2032b;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2032b);
        }
        this.f2032b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2035e && (drawable2 = this.f2032b) != null) {
                drawable2.setBounds(this.f2037g.getLeft(), this.f2037g.getTop(), this.f2037g.getRight(), this.f2037g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2034d ? !(this.f2031a == null && this.f2032b == null) : this.f2033c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0833ba baVar) {
        View view = this.f2037g;
        if (view != null) {
            removeView(view);
        }
        this.f2037g = baVar;
        if (baVar != null) {
            addView(baVar);
            ViewGroup.LayoutParams layoutParams = baVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            baVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2036f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2031a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2032b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2033c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2031a && !this.f2034d) || (drawable == this.f2032b && this.f2035e) || ((drawable == this.f2033c && this.f2034d) || super.verifyDrawable(drawable));
    }
}
