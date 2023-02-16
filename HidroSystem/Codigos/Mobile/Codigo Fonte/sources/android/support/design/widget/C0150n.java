package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.design.widget.n */
class C0150n {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f462a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f463b = new ThreadLocal<>();

    /* renamed from: a */
    static void m589a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f462a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f462a.set(matrix);
        } else {
            matrix.reset();
        }
        m590a((ViewParent) viewGroup, view, matrix);
        RectF rectF = f463b.get();
        if (rectF == null) {
            rectF = new RectF();
            f463b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m590a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m590a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    static void m591b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m589a(viewGroup, view, rect);
    }
}
