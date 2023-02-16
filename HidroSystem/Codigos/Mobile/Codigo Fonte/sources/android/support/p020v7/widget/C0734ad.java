package android.support.p020v7.widget;

import android.support.p020v7.widget.C0787av;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.ad */
class C0734ad {

    /* renamed from: a */
    final C0736b f2388a;

    /* renamed from: b */
    final C0735a f2389b = new C0735a();

    /* renamed from: c */
    final List<View> f2390c = new ArrayList();

    /* renamed from: android.support.v7.widget.ad$a */
    static class C0735a {

        /* renamed from: a */
        long f2391a = 0;

        /* renamed from: b */
        C0735a f2392b;

        C0735a() {
        }

        /* renamed from: b */
        private void m3759b() {
            if (this.f2392b == null) {
                this.f2392b = new C0735a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3508a() {
            this.f2391a = 0;
            C0735a aVar = this.f2392b;
            if (aVar != null) {
                aVar.mo3508a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3509a(int i) {
            if (i >= 64) {
                m3759b();
                this.f2392b.mo3509a(i - 64);
                return;
            }
            this.f2391a |= 1 << i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3510a(int i, boolean z) {
            if (i >= 64) {
                m3759b();
                this.f2392b.mo3510a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2391a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2391a;
            this.f2391a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                mo3509a(i);
            } else {
                mo3511b(i);
            }
            if (z2 || this.f2392b != null) {
                m3759b();
                this.f2392b.mo3510a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3511b(int i) {
            if (i >= 64) {
                C0735a aVar = this.f2392b;
                if (aVar != null) {
                    aVar.mo3511b(i - 64);
                    return;
                }
                return;
            }
            this.f2391a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3512c(int i) {
            if (i < 64) {
                return (this.f2391a & (1 << i)) != 0;
            }
            m3759b();
            return this.f2392b.mo3512c(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3513d(int i) {
            if (i >= 64) {
                m3759b();
                return this.f2392b.mo3513d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2391a & j) != 0;
            this.f2391a &= j ^ -1;
            long j2 = j - 1;
            long j3 = this.f2391a;
            this.f2391a = Long.rotateRight(j3 & (j2 ^ -1), 1) | (j3 & j2);
            C0735a aVar = this.f2392b;
            if (aVar != null) {
                if (aVar.mo3512c(0)) {
                    mo3509a(63);
                }
                this.f2392b.mo3513d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3514e(int i) {
            C0735a aVar = this.f2392b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f2391a) : Long.bitCount(this.f2391a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2391a & ((1 << i) - 1)) : aVar.mo3514e(i - 64) + Long.bitCount(this.f2391a);
        }

        public String toString() {
            if (this.f2392b == null) {
                return Long.toBinaryString(this.f2391a);
            }
            return this.f2392b.toString() + "xx" + Long.toBinaryString(this.f2391a);
        }
    }

    /* renamed from: android.support.v7.widget.ad$b */
    interface C0736b {
        /* renamed from: a */
        int mo3516a();

        /* renamed from: a */
        int mo3517a(View view);

        /* renamed from: a */
        void mo3518a(int i);

        /* renamed from: a */
        void mo3519a(View view, int i);

        /* renamed from: a */
        void mo3520a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        C0787av.C0826w mo3521b(View view);

        /* renamed from: b */
        View mo3522b(int i);

        /* renamed from: b */
        void mo3523b();

        /* renamed from: c */
        void mo3524c(int i);

        /* renamed from: c */
        void mo3525c(View view);

        /* renamed from: d */
        void mo3526d(View view);
    }

    C0734ad(C0736b bVar) {
        this.f2388a = bVar;
    }

    /* renamed from: f */
    private int m3739f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f2388a.mo3516a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f2389b.mo3514e(i2));
            if (e == 0) {
                while (this.f2389b.mo3512c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* renamed from: g */
    private void m3740g(View view) {
        this.f2390c.add(view);
        this.f2388a.mo3525c(view);
    }

    /* renamed from: h */
    private boolean m3741h(View view) {
        if (!this.f2390c.remove(view)) {
            return false;
        }
        this.f2388a.mo3526d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3490a() {
        this.f2389b.mo3508a();
        for (int size = this.f2390c.size() - 1; size >= 0; size--) {
            this.f2388a.mo3526d(this.f2390c.get(size));
            this.f2390c.remove(size);
        }
        this.f2388a.mo3523b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3491a(int i) {
        int f = m3739f(i);
        View b = this.f2388a.mo3522b(f);
        if (b != null) {
            if (this.f2389b.mo3513d(f)) {
                m3741h(b);
            }
            this.f2388a.mo3518a(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3492a(View view) {
        int a = this.f2388a.mo3517a(view);
        if (a >= 0) {
            if (this.f2389b.mo3513d(a)) {
                m3741h(view);
            }
            this.f2388a.mo3518a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3493a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.f2388a.mo3516a() : m3739f(i);
        this.f2389b.mo3510a(a, z);
        if (z) {
            m3740g(view);
        }
        this.f2388a.mo3520a(view, a, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3494a(View view, int i, boolean z) {
        int a = i < 0 ? this.f2388a.mo3516a() : m3739f(i);
        this.f2389b.mo3510a(a, z);
        if (z) {
            m3740g(view);
        }
        this.f2388a.mo3519a(view, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3495a(View view, boolean z) {
        mo3494a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3496b() {
        return this.f2388a.mo3516a() - this.f2390c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3497b(View view) {
        int a = this.f2388a.mo3517a(view);
        if (a != -1 && !this.f2389b.mo3512c(a)) {
            return a - this.f2389b.mo3514e(a);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3498b(int i) {
        return this.f2388a.mo3522b(m3739f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3499c() {
        return this.f2388a.mo3516a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo3500c(int i) {
        int size = this.f2390c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2390c.get(i2);
            C0787av.C0826w b = this.f2388a.mo3521b(view);
            if (b.mo4159d() == i && !b.mo4169n() && !b.mo4172q()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3501c(View view) {
        return this.f2390c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo3502d(int i) {
        return this.f2388a.mo3522b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3503d(View view) {
        int a = this.f2388a.mo3517a(view);
        if (a >= 0) {
            this.f2389b.mo3509a(a);
            m3740g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3504e(int i) {
        int f = m3739f(i);
        this.f2389b.mo3513d(f);
        this.f2388a.mo3524c(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3505e(View view) {
        int a = this.f2388a.mo3517a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2389b.mo3512c(a)) {
            this.f2389b.mo3511b(a);
            m3741h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo3506f(View view) {
        int a = this.f2388a.mo3517a(view);
        if (a == -1) {
            m3741h(view);
            return true;
        } else if (!this.f2389b.mo3512c(a)) {
            return false;
        } else {
            this.f2389b.mo3513d(a);
            m3741h(view);
            this.f2388a.mo3518a(a);
            return true;
        }
    }

    public String toString() {
        return this.f2389b.toString() + ", hidden list:" + this.f2390c.size();
    }
}
