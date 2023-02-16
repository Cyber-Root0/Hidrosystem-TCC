package android.support.design.widget;

import android.support.p005v4.p017i.C0388q;
import android.view.View;

/* renamed from: android.support.design.widget.p */
class C0152p {

    /* renamed from: a */
    private final View f467a;

    /* renamed from: b */
    private int f468b;

    /* renamed from: c */
    private int f469c;

    /* renamed from: d */
    private int f470d;

    /* renamed from: e */
    private int f471e;

    public C0152p(View view) {
        this.f467a = view;
    }

    /* renamed from: c */
    private void m596c() {
        View view = this.f467a;
        C0388q.m1653b(view, this.f470d - (view.getTop() - this.f468b));
        View view2 = this.f467a;
        C0388q.m1656c(view2, this.f471e - (view2.getLeft() - this.f469c));
    }

    /* renamed from: a */
    public void mo682a() {
        this.f468b = this.f467a.getTop();
        this.f469c = this.f467a.getLeft();
        m596c();
    }

    /* renamed from: a */
    public boolean mo683a(int i) {
        if (this.f470d == i) {
            return false;
        }
        this.f470d = i;
        m596c();
        return true;
    }

    /* renamed from: b */
    public int mo684b() {
        return this.f470d;
    }

    /* renamed from: b */
    public boolean mo685b(int i) {
        if (this.f471e == i) {
            return false;
        }
        this.f471e = i;
        m596c();
        return true;
    }
}
