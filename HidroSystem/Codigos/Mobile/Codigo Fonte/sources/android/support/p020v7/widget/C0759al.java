package android.support.p020v7.widget;

import android.os.SystemClock;
import android.support.p020v7.view.menu.C0675s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.al */
public abstract class C0759al implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f2487a;

    /* renamed from: b */
    private final int f2488b;

    /* renamed from: c */
    final View f2489c;

    /* renamed from: d */
    private final int f2490d;

    /* renamed from: e */
    private Runnable f2491e;

    /* renamed from: f */
    private Runnable f2492f;

    /* renamed from: g */
    private boolean f2493g;

    /* renamed from: h */
    private int f2494h;

    /* renamed from: i */
    private final int[] f2495i = new int[2];

    /* renamed from: android.support.v7.widget.al$a */
    private class C0760a implements Runnable {
        C0760a() {
        }

        public void run() {
            ViewParent parent = C0759al.this.f2489c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.al$b */
    private class C0761b implements Runnable {
        C0761b() {
        }

        public void run() {
            C0759al.this.mo3612d();
        }
    }

    public C0759al(View view) {
        this.f2489c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2487a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2488b = ViewConfiguration.getTapTimeout();
        this.f2490d = (this.f2488b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m3879a(MotionEvent motionEvent) {
        View view = this.f2489c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f2494h = motionEvent.getPointerId(0);
                if (this.f2491e == null) {
                    this.f2491e = new C0760a();
                }
                view.postDelayed(this.f2491e, (long) this.f2488b);
                if (this.f2492f == null) {
                    this.f2492f = new C0761b();
                }
                view.postDelayed(this.f2492f, (long) this.f2490d);
                break;
            case 1:
            case 3:
                m3884e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f2494h);
                if (findPointerIndex >= 0 && !m3880a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f2487a)) {
                    m3884e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3880a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m3881a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2495i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m3882b(MotionEvent motionEvent) {
        C0751ai aiVar;
        View view = this.f2489c;
        C0675s a = mo2571a();
        if (a == null || !a.mo2648f() || (aiVar = (C0751ai) a.mo2649g()) == null || !aiVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m3883b(view, obtainNoHistory);
        m3881a(aiVar, obtainNoHistory);
        boolean a2 = aiVar.mo3590a(obtainNoHistory, this.f2494h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: b */
    private boolean m3883b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2495i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: e */
    private void m3884e() {
        Runnable runnable = this.f2492f;
        if (runnable != null) {
            this.f2489c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2491e;
        if (runnable2 != null) {
            this.f2489c.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0675s mo2571a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2572b() {
        C0675s a = mo2571a();
        if (a == null || a.mo2648f()) {
            return true;
        }
        a.mo2646d();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3611c() {
        C0675s a = mo2571a();
        if (a == null || !a.mo2648f()) {
            return true;
        }
        a.mo2647e();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3612d() {
        m3884e();
        View view = this.f2489c;
        if (view.isEnabled() && !view.isLongClickable() && mo2572b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2493g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f2493g;
        if (z2) {
            z = m3882b(motionEvent) || !mo3611c();
        } else {
            z = m3879a(motionEvent) && mo2572b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2489c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f2493g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2493g = false;
        this.f2494h = -1;
        Runnable runnable = this.f2491e;
        if (runnable != null) {
            this.f2489c.removeCallbacks(runnable);
        }
    }
}
