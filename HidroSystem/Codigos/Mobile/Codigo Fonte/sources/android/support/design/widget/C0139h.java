package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.p005v4.p013e.C0271a;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0416y;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: android.support.design.widget.h */
abstract class C0139h extends C0151o<View> {

    /* renamed from: a */
    final Rect f424a = new Rect();

    /* renamed from: b */
    final Rect f425b = new Rect();

    /* renamed from: c */
    private int f426c = 0;

    /* renamed from: d */
    private int f427d;

    public C0139h() {
    }

    public C0139h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static int m543c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo343a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo653a() {
        return this.f426c;
    }

    /* renamed from: a */
    public boolean mo325a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View b;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (b = mo348b(coordinatorLayout.mo408c(view))) == null) {
            return false;
        }
        if (!C0388q.m1669p(b) || C0388q.m1669p(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            C0388q.m1649a(view, true);
            if (C0388q.m1669p(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.mo395a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - b.getMeasuredHeight()) + mo347b(b), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo347b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract View mo348b(List<View> list);

    /* renamed from: b */
    public final void mo654b(int i) {
        this.f427d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo655b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View b = mo348b(coordinatorLayout.mo408c(view));
        if (b != null) {
            CoordinatorLayout.C0091d dVar = (CoordinatorLayout.C0091d) view.getLayoutParams();
            Rect rect = this.f424a;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, b.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            C0416y lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0388q.m1669p(coordinatorLayout) && !C0388q.m1669p(view)) {
                rect.left += lastWindowInsets.mo1647a();
                rect.right -= lastWindowInsets.mo1650c();
            }
            Rect rect2 = this.f425b;
            C0370d.m1576a(m543c(dVar.f272c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo656c(b);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            i2 = rect2.top - b.getBottom();
        } else {
            super.mo655b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f426c = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo656c(View view) {
        if (this.f427d == 0) {
            return 0;
        }
        float a = mo343a(view);
        int i = this.f427d;
        return C0271a.m1254a((int) (a * ((float) i)), 0, i);
    }

    /* renamed from: d */
    public final int mo657d() {
        return this.f427d;
    }
}
