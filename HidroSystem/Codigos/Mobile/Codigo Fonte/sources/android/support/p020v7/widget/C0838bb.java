package android.support.p020v7.widget;

import android.support.p020v7.widget.C0787av;
import android.view.View;

/* renamed from: android.support.v7.widget.bb */
public abstract class C0838bb extends C0787av.C0798e {

    /* renamed from: h */
    boolean f2836h = true;

    /* renamed from: a */
    public final void mo4259a(C0787av.C0826w wVar, boolean z) {
        mo4262d(wVar, z);
        mo3947f(wVar);
    }

    /* renamed from: a */
    public abstract boolean mo3562a(C0787av.C0826w wVar);

    /* renamed from: a */
    public abstract boolean mo3563a(C0787av.C0826w wVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo3941a(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2) {
        int i = cVar.f2696a;
        int i2 = cVar.f2697b;
        View view = wVar.f2785a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2696a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2697b;
        if (wVar.mo4172q() || (i == left && i2 == top)) {
            return mo3562a(wVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3563a(wVar, i, i2, left, top);
    }

    /* renamed from: a */
    public abstract boolean mo3564a(C0787av.C0826w wVar, C0787av.C0826w wVar2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo3942a(C0787av.C0826w wVar, C0787av.C0826w wVar2, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2696a;
        int i4 = cVar.f2697b;
        if (wVar2.mo4158c()) {
            int i5 = cVar.f2696a;
            i = cVar.f2697b;
            i2 = i5;
        } else {
            i2 = cVar2.f2696a;
            i = cVar2.f2697b;
        }
        return mo3564a(wVar, wVar2, i3, i4, i2, i);
    }

    /* renamed from: b */
    public final void mo4260b(C0787av.C0826w wVar, boolean z) {
        mo4261c(wVar, z);
    }

    /* renamed from: b */
    public abstract boolean mo3568b(C0787av.C0826w wVar);

    /* renamed from: b */
    public boolean mo3943b(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2) {
        if (cVar == null || (cVar.f2696a == cVar2.f2696a && cVar.f2697b == cVar2.f2697b)) {
            return mo3568b(wVar);
        }
        return mo3563a(wVar, cVar.f2696a, cVar.f2697b, cVar2.f2696a, cVar2.f2697b);
    }

    /* renamed from: c */
    public void mo4261c(C0787av.C0826w wVar, boolean z) {
    }

    /* renamed from: c */
    public boolean mo3944c(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2) {
        if (cVar.f2696a == cVar2.f2696a && cVar.f2697b == cVar2.f2697b) {
            mo4264j(wVar);
            return false;
        }
        return mo3563a(wVar, cVar.f2696a, cVar.f2697b, cVar2.f2696a, cVar2.f2697b);
    }

    /* renamed from: d */
    public void mo4262d(C0787av.C0826w wVar, boolean z) {
    }

    /* renamed from: h */
    public boolean mo3951h(C0787av.C0826w wVar) {
        return !this.f2836h || wVar.mo4169n();
    }

    /* renamed from: i */
    public final void mo4263i(C0787av.C0826w wVar) {
        mo4270p(wVar);
        mo3947f(wVar);
    }

    /* renamed from: j */
    public final void mo4264j(C0787av.C0826w wVar) {
        mo4274t(wVar);
        mo3947f(wVar);
    }

    /* renamed from: k */
    public final void mo4265k(C0787av.C0826w wVar) {
        mo4272r(wVar);
        mo3947f(wVar);
    }

    /* renamed from: l */
    public final void mo4266l(C0787av.C0826w wVar) {
        mo4269o(wVar);
    }

    /* renamed from: m */
    public final void mo4267m(C0787av.C0826w wVar) {
        mo4273s(wVar);
    }

    /* renamed from: n */
    public final void mo4268n(C0787av.C0826w wVar) {
        mo4271q(wVar);
    }

    /* renamed from: o */
    public void mo4269o(C0787av.C0826w wVar) {
    }

    /* renamed from: p */
    public void mo4270p(C0787av.C0826w wVar) {
    }

    /* renamed from: q */
    public void mo4271q(C0787av.C0826w wVar) {
    }

    /* renamed from: r */
    public void mo4272r(C0787av.C0826w wVar) {
    }

    /* renamed from: s */
    public void mo4273s(C0787av.C0826w wVar) {
    }

    /* renamed from: t */
    public void mo4274t(C0787av.C0826w wVar) {
    }
}
