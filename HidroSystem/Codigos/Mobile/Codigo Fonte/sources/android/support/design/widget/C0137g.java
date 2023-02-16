package android.support.design.widget;

import android.content.Context;
import android.support.p005v4.p013e.C0271a;
import android.support.p005v4.p017i.C0388q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* renamed from: android.support.design.widget.g */
abstract class C0137g<V extends View> extends C0151o<V> {

    /* renamed from: a */
    OverScroller f414a;

    /* renamed from: b */
    private Runnable f415b;

    /* renamed from: c */
    private boolean f416c;

    /* renamed from: d */
    private int f417d = -1;

    /* renamed from: e */
    private int f418e;

    /* renamed from: f */
    private int f419f = -1;

    /* renamed from: g */
    private VelocityTracker f420g;

    /* renamed from: android.support.design.widget.g$a */
    private class C0138a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f422b;

        /* renamed from: c */
        private final V f423c;

        C0138a(CoordinatorLayout coordinatorLayout, V v) {
            this.f422b = coordinatorLayout;
            this.f423c = v;
        }

        public void run() {
            if (this.f423c != null && C0137g.this.f414a != null) {
                if (C0137g.this.f414a.computeScrollOffset()) {
                    C0137g gVar = C0137g.this;
                    gVar.mo650a_(this.f422b, this.f423c, gVar.f414a.getCurrY());
                    C0388q.m1647a((View) this.f423c, (Runnable) this);
                    return;
                }
                C0137g.this.mo314a(this.f422b, this.f423c);
            }
        }
    }

    public C0137g() {
    }

    public C0137g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m531d() {
        if (this.f420g == null) {
            this.f420g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo305a() {
        return mo327b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo307a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int a;
        int b = mo327b();
        if (i2 == 0 || b < i2 || b > i3 || b == (a = C0271a.m1254a(i, i2, i3))) {
            return 0;
        }
        mo319a(a);
        return b - a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo308a(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo314a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo649a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f415b;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f415b = null;
        }
        if (this.f414a == null) {
            this.f414a = new OverScroller(v.getContext());
        }
        this.f414a.fling(0, mo327b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f414a.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f415b = new C0138a(coordinatorLayout, v);
            C0388q.m1647a((View) v, this.f415b);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo314a(coordinatorLayout, v);
        return false;
    }

    /* renamed from: a */
    public boolean mo358a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f419f < 0) {
            this.f419f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f416c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f416c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo333c(v) && coordinatorLayout.mo401a((View) v, x, y)) {
                    this.f418e = y;
                    this.f417d = motionEvent.getPointerId(0);
                    m531d();
                    break;
                }
            case 1:
            case 3:
                this.f416c = false;
                this.f417d = -1;
                VelocityTracker velocityTracker = this.f420g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f420g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f417d;
                if (!(i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1)) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    if (Math.abs(y2 - this.f418e) > this.f419f) {
                        this.f416c = true;
                        this.f418e = y2;
                        break;
                    }
                }
                break;
        }
        VelocityTracker velocityTracker2 = this.f420g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.f416c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a_ */
    public int mo650a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo307a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo651b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo307a(coordinatorLayout, v, mo305a() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo329b(V v) {
        return -v.getHeight();
    }

    /* renamed from: b */
    public boolean mo364b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        if (this.f419f < 0) {
            this.f419f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.mo401a((View) v, (int) motionEvent.getX(), y) && mo333c(v)) {
                    this.f418e = y;
                    this.f417d = motionEvent.getPointerId(0);
                    m531d();
                    break;
                } else {
                    return false;
                }
                break;
            case 1:
                VelocityTracker velocityTracker = this.f420g;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.f420g.computeCurrentVelocity(1000);
                    mo649a(coordinatorLayout, v, -mo308a(v), 0, this.f420g.getYVelocity(this.f417d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f417d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f418e - y2;
                    if (!this.f416c && Math.abs(i2) > (i = this.f419f)) {
                        this.f416c = true;
                        i2 = i2 > 0 ? i2 - i : i2 + i;
                    }
                    int i3 = i2;
                    if (this.f416c) {
                        this.f418e = y2;
                        mo651b(coordinatorLayout, v, i3, mo329b(v), 0);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f416c = false;
        this.f417d = -1;
        VelocityTracker velocityTracker2 = this.f420g;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f420g = null;
        }
        VelocityTracker velocityTracker3 = this.f420g;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo333c(V v) {
        return false;
    }
}
