package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f2129a;

    /* renamed from: b */
    private int f2130b = -1;

    /* renamed from: c */
    private int f2131c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f2131c = 0;
        z = getResources().getConfiguration().screenHeightDp >= 320 ? true : z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.ButtonBarLayout);
        this.f2129a = obtainStyledAttributes.getBoolean(C0526a.C0536j.ButtonBarLayout_allowStacking, z);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m3310a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m3311a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0526a.C0532f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f2131c, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f2129a) {
            if (size > this.f2130b && m3311a()) {
                setStacked(false);
            }
            this.f2130b = size;
        }
        if (m3311a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f2129a && !m3311a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m3310a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m3311a()) {
                int a2 = m3310a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0388q.m1663j(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f2129a != z) {
            this.f2129a = z;
            if (!this.f2129a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
