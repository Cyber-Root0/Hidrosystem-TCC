package android.support.p005v4.p006a;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.a.x */
class C0224x implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f765a;

    /* renamed from: b */
    private ViewTreeObserver f766b;

    /* renamed from: c */
    private final Runnable f767c;

    private C0224x(View view, Runnable runnable) {
        this.f765a = view;
        this.f766b = view.getViewTreeObserver();
        this.f767c = runnable;
    }

    /* renamed from: a */
    public static C0224x m1065a(View view, Runnable runnable) {
        C0224x xVar = new C0224x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    /* renamed from: a */
    public void mo1085a() {
        (this.f766b.isAlive() ? this.f766b : this.f765a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f765a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo1085a();
        this.f767c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f766b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo1085a();
    }
}
