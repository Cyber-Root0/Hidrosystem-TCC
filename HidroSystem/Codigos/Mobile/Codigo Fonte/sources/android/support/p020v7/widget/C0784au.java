package android.support.p020v7.widget;

import android.graphics.Rect;
import android.support.p020v7.widget.C0787av;
import android.view.View;

/* renamed from: android.support.v7.widget.au */
public abstract class C0784au {

    /* renamed from: a */
    protected final C0787av.C0804h f2599a;

    /* renamed from: b */
    final Rect f2600b;

    /* renamed from: c */
    private int f2601c;

    private C0784au(C0787av.C0804h hVar) {
        this.f2601c = Integer.MIN_VALUE;
        this.f2600b = new Rect();
        this.f2599a = hVar;
    }

    /* renamed from: a */
    public static C0784au m3990a(C0787av.C0804h hVar) {
        return new C0784au(hVar) {
            /* renamed from: a */
            public int mo3735a(View view) {
                return this.f2599a.mo4029h(view) - ((C0787av.C0809i) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public void mo3737a(int i) {
                this.f2599a.mo3289i(i);
            }

            /* renamed from: b */
            public int mo3739b(View view) {
                return this.f2599a.mo4032j(view) + ((C0787av.C0809i) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: c */
            public int mo3740c() {
                return this.f2599a.mo4050z();
            }

            /* renamed from: c */
            public int mo3741c(View view) {
                this.f2599a.mo3987a(view, true, this.f2600b);
                return this.f2600b.right;
            }

            /* renamed from: d */
            public int mo3742d() {
                return this.f2599a.mo4048x() - this.f2599a.mo3964B();
            }

            /* renamed from: d */
            public int mo3743d(View view) {
                this.f2599a.mo3987a(view, true, this.f2600b);
                return this.f2600b.left;
            }

            /* renamed from: e */
            public int mo3744e() {
                return this.f2599a.mo4048x();
            }

            /* renamed from: e */
            public int mo3745e(View view) {
                C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
                return this.f2599a.mo4023f(view) + iVar.leftMargin + iVar.rightMargin;
            }

            /* renamed from: f */
            public int mo3746f() {
                return (this.f2599a.mo4048x() - this.f2599a.mo4050z()) - this.f2599a.mo3964B();
            }

            /* renamed from: f */
            public int mo3747f(View view) {
                C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
                return this.f2599a.mo4027g(view) + iVar.topMargin + iVar.bottomMargin;
            }

            /* renamed from: g */
            public int mo3748g() {
                return this.f2599a.mo3964B();
            }

            /* renamed from: h */
            public int mo3749h() {
                return this.f2599a.mo4046v();
            }

            /* renamed from: i */
            public int mo3750i() {
                return this.f2599a.mo4047w();
            }
        };
    }

    /* renamed from: a */
    public static C0784au m3991a(C0787av.C0804h hVar, int i) {
        switch (i) {
            case 0:
                return m3990a(hVar);
            case 1:
                return m3992b(hVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: b */
    public static C0784au m3992b(C0787av.C0804h hVar) {
        return new C0784au(hVar) {
            /* renamed from: a */
            public int mo3735a(View view) {
                return this.f2599a.mo4031i(view) - ((C0787av.C0809i) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public void mo3737a(int i) {
                this.f2599a.mo3292j(i);
            }

            /* renamed from: b */
            public int mo3739b(View view) {
                return this.f2599a.mo4033k(view) + ((C0787av.C0809i) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: c */
            public int mo3740c() {
                return this.f2599a.mo3963A();
            }

            /* renamed from: c */
            public int mo3741c(View view) {
                this.f2599a.mo3987a(view, true, this.f2600b);
                return this.f2600b.bottom;
            }

            /* renamed from: d */
            public int mo3742d() {
                return this.f2599a.mo4049y() - this.f2599a.mo3965C();
            }

            /* renamed from: d */
            public int mo3743d(View view) {
                this.f2599a.mo3987a(view, true, this.f2600b);
                return this.f2600b.top;
            }

            /* renamed from: e */
            public int mo3744e() {
                return this.f2599a.mo4049y();
            }

            /* renamed from: e */
            public int mo3745e(View view) {
                C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
                return this.f2599a.mo4027g(view) + iVar.topMargin + iVar.bottomMargin;
            }

            /* renamed from: f */
            public int mo3746f() {
                return (this.f2599a.mo4049y() - this.f2599a.mo3963A()) - this.f2599a.mo3965C();
            }

            /* renamed from: f */
            public int mo3747f(View view) {
                C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
                return this.f2599a.mo4023f(view) + iVar.leftMargin + iVar.rightMargin;
            }

            /* renamed from: g */
            public int mo3748g() {
                return this.f2599a.mo3965C();
            }

            /* renamed from: h */
            public int mo3749h() {
                return this.f2599a.mo4047w();
            }

            /* renamed from: i */
            public int mo3750i() {
                return this.f2599a.mo4046v();
            }
        };
    }

    /* renamed from: a */
    public abstract int mo3735a(View view);

    /* renamed from: a */
    public void mo3736a() {
        this.f2601c = mo3746f();
    }

    /* renamed from: a */
    public abstract void mo3737a(int i);

    /* renamed from: b */
    public int mo3738b() {
        if (Integer.MIN_VALUE == this.f2601c) {
            return 0;
        }
        return mo3746f() - this.f2601c;
    }

    /* renamed from: b */
    public abstract int mo3739b(View view);

    /* renamed from: c */
    public abstract int mo3740c();

    /* renamed from: c */
    public abstract int mo3741c(View view);

    /* renamed from: d */
    public abstract int mo3742d();

    /* renamed from: d */
    public abstract int mo3743d(View view);

    /* renamed from: e */
    public abstract int mo3744e();

    /* renamed from: e */
    public abstract int mo3745e(View view);

    /* renamed from: f */
    public abstract int mo3746f();

    /* renamed from: f */
    public abstract int mo3747f(View view);

    /* renamed from: g */
    public abstract int mo3748g();

    /* renamed from: h */
    public abstract int mo3749h();

    /* renamed from: i */
    public abstract int mo3750i();
}
