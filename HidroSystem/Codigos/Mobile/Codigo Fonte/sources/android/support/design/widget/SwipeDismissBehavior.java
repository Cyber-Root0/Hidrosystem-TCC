package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.widget.C0522p;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0088a<V> {

    /* renamed from: a */
    private boolean f316a;

    /* renamed from: b */
    C0522p f317b;

    /* renamed from: c */
    C0104a f318c;

    /* renamed from: d */
    int f319d = 2;

    /* renamed from: e */
    float f320e = 0.5f;

    /* renamed from: f */
    float f321f = 0.0f;

    /* renamed from: g */
    float f322g = 0.5f;

    /* renamed from: h */
    private float f323h = 0.0f;

    /* renamed from: i */
    private boolean f324i;

    /* renamed from: j */
    private final C0522p.C0525a f325j = new C0522p.C0525a() {

        /* renamed from: b */
        private int f327b;

        /* renamed from: c */
        private int f328c = -1;

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m439a(android.view.View r6, float r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003e
                int r6 = android.support.p005v4.p017i.C0388q.m1658e(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                android.support.design.widget.SwipeDismissBehavior r3 = android.support.design.widget.SwipeDismissBehavior.this
                int r3 = r3.f319d
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                android.support.design.widget.SwipeDismissBehavior r3 = android.support.design.widget.SwipeDismissBehavior.this
                int r3 = r3.f319d
                if (r3 != 0) goto L_0x002b
                if (r6 == 0) goto L_0x0025
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x002a
                goto L_0x0029
            L_0x0025:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x002a
            L_0x0029:
                r1 = 1
            L_0x002a:
                return r1
            L_0x002b:
                android.support.design.widget.SwipeDismissBehavior r3 = android.support.design.widget.SwipeDismissBehavior.this
                int r3 = r3.f319d
                if (r3 != r2) goto L_0x003d
                if (r6 == 0) goto L_0x0038
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x003d
                goto L_0x003c
            L_0x0038:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x003d
            L_0x003c:
                r1 = 1
            L_0x003d:
                return r1
            L_0x003e:
                int r7 = r6.getLeft()
                int r0 = r5.f327b
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                android.support.design.widget.SwipeDismissBehavior r0 = android.support.design.widget.SwipeDismissBehavior.this
                float r0 = r0.f320e
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x005b
                r1 = 1
            L_0x005b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.C01031.m439a(android.view.View, float):boolean");
        }

        /* renamed from: a */
        public int mo368a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo369a(int i) {
            if (SwipeDismissBehavior.this.f318c != null) {
                SwipeDismissBehavior.this.f318c.mo565a(i);
            }
        }

        /* renamed from: a */
        public void mo370a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f328c = -1;
            int width = view.getWidth();
            if (m439a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f327b;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f327b;
                z = false;
            }
            if (SwipeDismissBehavior.this.f317b.mo2176a(i, view.getTop())) {
                C0388q.m1647a(view, (Runnable) new C0105b(view, z));
            } else if (z && SwipeDismissBehavior.this.f318c != null) {
                SwipeDismissBehavior.this.f318c.mo566a(view);
            }
        }

        /* renamed from: a */
        public void mo371a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f327b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f321f);
            float width2 = ((float) this.f327b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f322g);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m428a(0.0f, 1.0f - SwipeDismissBehavior.m431b(width, width2, f), 1.0f));
            }
        }

        /* renamed from: a */
        public boolean mo372a(View view, int i) {
            return this.f328c == -1 && SwipeDismissBehavior.this.mo561a(view);
        }

        /* renamed from: b */
        public int mo563b(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f327b;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo373b(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = android.support.p005v4.p017i.C0388q.m1658e(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                android.support.design.widget.SwipeDismissBehavior r1 = android.support.design.widget.SwipeDismissBehavior.this
                int r1 = r1.f319d
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f327b
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f327b
                goto L_0x003b
            L_0x001c:
                int r5 = r2.f327b
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x003b
            L_0x0024:
                android.support.design.widget.SwipeDismissBehavior r1 = android.support.design.widget.SwipeDismissBehavior.this
                int r1 = r1.f319d
                if (r1 != r0) goto L_0x002d
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x002d:
                int r5 = r2.f327b
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f327b
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x003b:
                int r3 = android.support.design.widget.SwipeDismissBehavior.m429a((int) r5, (int) r4, (int) r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.C01031.mo373b(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public void mo564b(View view, int i) {
            this.f328c = i;
            this.f327b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    };

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0104a {
        /* renamed from: a */
        void mo565a(int i);

        /* renamed from: a */
        void mo566a(View view);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    private class C0105b implements Runnable {

        /* renamed from: b */
        private final View f330b;

        /* renamed from: c */
        private final boolean f331c;

        C0105b(View view, boolean z) {
            this.f330b = view;
            this.f331c = z;
        }

        public void run() {
            if (SwipeDismissBehavior.this.f317b != null && SwipeDismissBehavior.this.f317b.mo2179a(true)) {
                C0388q.m1647a(this.f330b, (Runnable) this);
            } else if (this.f331c && SwipeDismissBehavior.this.f318c != null) {
                SwipeDismissBehavior.this.f318c.mo566a(this.f330b);
            }
        }
    }

    /* renamed from: a */
    static float m428a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m429a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m430a(ViewGroup viewGroup) {
        if (this.f317b == null) {
            this.f317b = this.f324i ? C0522p.m2379a(viewGroup, this.f323h, this.f325j) : C0522p.m2380a(viewGroup, this.f325j);
        }
    }

    /* renamed from: b */
    static float m431b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo558a(float f) {
        this.f321f = m428a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void mo559a(int i) {
        this.f319d = i;
    }

    /* renamed from: a */
    public void mo560a(C0104a aVar) {
        this.f318c = aVar;
    }

    /* renamed from: a */
    public boolean mo358a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f316a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f316a = coordinatorLayout.mo401a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f316a;
                    break;
                case 1:
                    break;
            }
        }
        this.f316a = false;
        if (!z) {
            return false;
        }
        m430a((ViewGroup) coordinatorLayout);
        return this.f317b.mo2177a(motionEvent);
    }

    /* renamed from: a */
    public boolean mo561a(View view) {
        return true;
    }

    /* renamed from: b */
    public void mo562b(float f) {
        this.f322g = m428a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo364b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0522p pVar = this.f317b;
        if (pVar == null) {
            return false;
        }
        pVar.mo2181b(motionEvent);
        return true;
    }
}
