package android.support.p020v7.view;

import android.support.p005v4.p017i.C0409u;
import android.support.p005v4.p017i.C0413v;
import android.support.p005v4.p017i.C0414w;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0635h {

    /* renamed from: a */
    final ArrayList<C0409u> f1789a = new ArrayList<>();

    /* renamed from: b */
    C0413v f1790b;

    /* renamed from: c */
    private long f1791c = -1;

    /* renamed from: d */
    private Interpolator f1792d;

    /* renamed from: e */
    private boolean f1793e;

    /* renamed from: f */
    private final C0414w f1794f = new C0414w() {

        /* renamed from: b */
        private boolean f1796b = false;

        /* renamed from: c */
        private int f1797c = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2540a() {
            this.f1797c = 0;
            this.f1796b = false;
            C0635h.this.mo2538b();
        }

        /* renamed from: a */
        public void mo1643a(View view) {
            if (!this.f1796b) {
                this.f1796b = true;
                if (C0635h.this.f1790b != null) {
                    C0635h.this.f1790b.mo1643a((View) null);
                }
            }
        }

        /* renamed from: b */
        public void mo1644b(View view) {
            int i = this.f1797c + 1;
            this.f1797c = i;
            if (i == C0635h.this.f1789a.size()) {
                if (C0635h.this.f1790b != null) {
                    C0635h.this.f1790b.mo1644b((View) null);
                }
                mo2540a();
            }
        }
    };

    /* renamed from: a */
    public C0635h mo2532a(long j) {
        if (!this.f1793e) {
            this.f1791c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0635h mo2533a(C0409u uVar) {
        if (!this.f1793e) {
            this.f1789a.add(uVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0635h mo2534a(C0409u uVar, C0409u uVar2) {
        this.f1789a.add(uVar);
        uVar2.mo1636b(uVar.mo1629a());
        this.f1789a.add(uVar2);
        return this;
    }

    /* renamed from: a */
    public C0635h mo2535a(C0413v vVar) {
        if (!this.f1793e) {
            this.f1790b = vVar;
        }
        return this;
    }

    /* renamed from: a */
    public C0635h mo2536a(Interpolator interpolator) {
        if (!this.f1793e) {
            this.f1792d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void mo2537a() {
        if (!this.f1793e) {
            Iterator<C0409u> it = this.f1789a.iterator();
            while (it.hasNext()) {
                C0409u next = it.next();
                long j = this.f1791c;
                if (j >= 0) {
                    next.mo1631a(j);
                }
                Interpolator interpolator = this.f1792d;
                if (interpolator != null) {
                    next.mo1634a(interpolator);
                }
                if (this.f1790b != null) {
                    next.mo1632a((C0413v) this.f1794f);
                }
                next.mo1638c();
            }
            this.f1793e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2538b() {
        this.f1793e = false;
    }

    /* renamed from: c */
    public void mo2539c() {
        if (this.f1793e) {
            Iterator<C0409u> it = this.f1789a.iterator();
            while (it.hasNext()) {
                it.next().mo1637b();
            }
            this.f1793e = false;
        }
    }
}
