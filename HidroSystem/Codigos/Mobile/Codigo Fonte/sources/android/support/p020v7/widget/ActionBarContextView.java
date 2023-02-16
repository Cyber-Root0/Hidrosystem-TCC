package android.support.p020v7.widget;

import android.content.Context;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0409u;
import android.support.p020v7.p021a.C0526a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0729a {

    /* renamed from: g */
    private CharSequence f2041g;

    /* renamed from: h */
    private CharSequence f2042h;

    /* renamed from: i */
    private View f2043i;

    /* renamed from: j */
    private View f2044j;

    /* renamed from: k */
    private LinearLayout f2045k;

    /* renamed from: l */
    private TextView f2046l;

    /* renamed from: m */
    private TextView f2047m;

    /* renamed from: n */
    private int f2048n;

    /* renamed from: o */
    private int f2049o;

    /* renamed from: p */
    private boolean f2050p;

    /* renamed from: q */
    private int f2051q;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0846bi a = C0846bi.m4625a(context, attributeSet, C0526a.C0536j.ActionMode, i, 0);
        C0388q.m1644a((View) this, a.mo4291a(C0526a.C0536j.ActionMode_background));
        this.f2048n = a.mo4304g(C0526a.C0536j.ActionMode_titleTextStyle, 0);
        this.f2049o = a.mo4304g(C0526a.C0536j.ActionMode_subtitleTextStyle, 0);
        this.f2365e = a.mo4302f(C0526a.C0536j.ActionMode_height, 0);
        this.f2051q = a.mo4304g(C0526a.C0536j.ActionMode_closeItemLayout, C0526a.C0533g.abc_action_mode_close_item_material);
        a.mo4292a();
    }

    /* renamed from: e */
    private void m3230e() {
        if (this.f2045k == null) {
            LayoutInflater.from(getContext()).inflate(C0526a.C0533g.abc_action_bar_title_item, this);
            this.f2045k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2046l = (TextView) this.f2045k.findViewById(C0526a.C0532f.action_bar_title);
            this.f2047m = (TextView) this.f2045k.findViewById(C0526a.C0532f.action_bar_subtitle);
            if (this.f2048n != 0) {
                this.f2046l.setTextAppearance(getContext(), this.f2048n);
            }
            if (this.f2049o != 0) {
                this.f2047m.setTextAppearance(getContext(), this.f2049o);
            }
        }
        this.f2046l.setText(this.f2041g);
        this.f2047m.setText(this.f2042h);
        boolean z = !TextUtils.isEmpty(this.f2041g);
        boolean z2 = !TextUtils.isEmpty(this.f2042h);
        int i = 0;
        this.f2047m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f2045k;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f2045k.getParent() == null) {
            addView(this.f2045k);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0409u mo2961a(int i, long j) {
        return super.mo2961a(i, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2962a(final android.support.p020v7.view.C0625b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2043i
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f2051q
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f2043i = r0
        L_0x0015:
            android.view.View r0 = r3.f2043i
            r3.addView(r0)
            goto L_0x0022
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f2043i
            int r1 = android.support.p020v7.p021a.C0526a.C0532f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.ActionBarContextView$1 r1 = new android.support.v7.widget.ActionBarContextView$1
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo2434b()
            android.support.v7.view.menu.h r4 = (android.support.p020v7.view.menu.C0653h) r4
            android.support.v7.widget.d r0 = r3.f2364d
            if (r0 == 0) goto L_0x0041
            android.support.v7.widget.d r0 = r3.f2364d
            r0.mo4357h()
        L_0x0041:
            android.support.v7.widget.d r0 = new android.support.v7.widget.d
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f2364d = r0
            android.support.v7.widget.d r0 = r3.f2364d
            r1 = 1
            r0.mo4352c((boolean) r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.d r1 = r3.f2364d
            android.content.Context r2 = r3.f2362b
            r4.mo2693a((android.support.p020v7.view.menu.C0669o) r1, (android.content.Context) r2)
            android.support.v7.widget.d r4 = r3.f2364d
            android.support.v7.view.menu.p r4 = r4.mo2624a((android.view.ViewGroup) r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.p020v7.widget.ActionMenuView) r4
            r3.f2363c = r4
            android.support.v7.widget.ActionMenuView r4 = r3.f2363c
            r1 = 0
            android.support.p005v4.p017i.C0388q.m1644a((android.view.View) r4, (android.graphics.drawable.Drawable) r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f2363c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.ActionBarContextView.mo2962a(android.support.v7.view.b):void");
    }

    /* renamed from: a */
    public boolean mo2963a() {
        if (this.f2364d != null) {
            return this.f2364d.mo4355f();
        }
        return false;
    }

    /* renamed from: b */
    public void mo2964b() {
        if (this.f2043i == null) {
            mo2965c();
        }
    }

    /* renamed from: c */
    public void mo2965c() {
        removeAllViews();
        this.f2044j = null;
        this.f2363c = null;
    }

    /* renamed from: d */
    public boolean mo2966d() {
        return this.f2050p;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2042h;
    }

    public CharSequence getTitle() {
        return this.f2041g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2364d != null) {
            this.f2364d.mo4356g();
            this.f2364d.mo4358i();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2041g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0866bq.m4743a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2043i;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2043i.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m3700a(paddingRight, i6, a);
            i5 = m3700a(a2 + mo3458a(this.f2043i, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f2045k;
        if (!(linearLayout == null || this.f2044j != null || linearLayout.getVisibility() == 8)) {
            i5 += mo3458a(this.f2045k, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f2044j;
        if (view2 != null) {
            mo3458a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f2363c != null) {
            mo3458a(this.f2363c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.f2365e > 0 ? this.f2365e : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.f2043i;
            if (view != null) {
                int a = mo3457a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2043i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f2363c != null && this.f2363c.getParent() == this) {
                paddingLeft = mo3457a(this.f2363c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f2045k;
            if (linearLayout != null && this.f2044j == null) {
                if (this.f2050p) {
                    this.f2045k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f2045k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f2045k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo3457a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f2044j;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.f2044j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.f2365e <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f2365e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2044j;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2044j = view;
        if (!(view == null || (linearLayout = this.f2045k) == null)) {
            removeView(linearLayout);
            this.f2045k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2042h = charSequence;
        m3230e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2041g = charSequence;
        m3230e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2050p) {
            requestLayout();
        }
        this.f2050p = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
