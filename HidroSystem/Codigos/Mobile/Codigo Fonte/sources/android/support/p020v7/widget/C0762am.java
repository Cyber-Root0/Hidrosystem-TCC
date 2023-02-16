package android.support.p020v7.widget;

import android.support.p005v4.p014f.C0279c;
import android.support.p020v7.widget.C0787av;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.am */
final class C0762am implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C0762am> f2498a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C0765b> f2499e = new Comparator<C0765b>() {
        /* renamed from: a */
        public int compare(C0765b bVar, C0765b bVar2) {
            if ((bVar.f2511d == null) != (bVar2.f2511d == null)) {
                return bVar.f2511d == null ? 1 : -1;
            }
            if (bVar.f2508a != bVar2.f2508a) {
                return bVar.f2508a ? -1 : 1;
            }
            int i = bVar2.f2509b - bVar.f2509b;
            if (i != 0) {
                return i;
            }
            int i2 = bVar.f2510c - bVar2.f2510c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    };

    /* renamed from: b */
    ArrayList<C0787av> f2500b = new ArrayList<>();

    /* renamed from: c */
    long f2501c;

    /* renamed from: d */
    long f2502d;

    /* renamed from: f */
    private ArrayList<C0765b> f2503f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.am$a */
    static class C0764a implements C0787av.C0804h.C0807a {

        /* renamed from: a */
        int f2504a;

        /* renamed from: b */
        int f2505b;

        /* renamed from: c */
        int[] f2506c;

        /* renamed from: d */
        int f2507d;

        C0764a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3625a() {
            int[] iArr = this.f2506c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2507d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3626a(int i, int i2) {
            this.f2504a = i;
            this.f2505b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3627a(C0787av avVar, boolean z) {
            this.f2507d = 0;
            int[] iArr = this.f2506c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0787av.C0804h hVar = avVar.f2669m;
            if (avVar.f2668l != null && hVar != null && hVar.mo4039o()) {
                if (z) {
                    if (!avVar.f2661e.mo4397d()) {
                        hVar.mo3160a(avVar.f2668l.mo247a(), (C0787av.C0804h.C0807a) this);
                    }
                } else if (!avVar.mo3904w()) {
                    hVar.mo3159a(this.f2504a, this.f2505b, avVar.f2613B, (C0787av.C0804h.C0807a) this);
                }
                if (this.f2507d > hVar.f2717x) {
                    hVar.f2717x = this.f2507d;
                    hVar.f2718y = z;
                    avVar.f2660d.mo4090b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3628a(int i) {
            if (this.f2506c != null) {
                int i2 = this.f2507d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2506c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo3629b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f2507d * 2;
                int[] iArr = this.f2506c;
                if (iArr == null) {
                    this.f2506c = new int[4];
                    Arrays.fill(this.f2506c, -1);
                } else if (i3 >= iArr.length) {
                    this.f2506c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f2506c, 0, iArr.length);
                }
                int[] iArr2 = this.f2506c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f2507d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }
    }

    /* renamed from: android.support.v7.widget.am$b */
    static class C0765b {

        /* renamed from: a */
        public boolean f2508a;

        /* renamed from: b */
        public int f2509b;

        /* renamed from: c */
        public int f2510c;

        /* renamed from: d */
        public C0787av f2511d;

        /* renamed from: e */
        public int f2512e;

        C0765b() {
        }

        /* renamed from: a */
        public void mo3630a() {
            this.f2508a = false;
            this.f2509b = 0;
            this.f2510c = 0;
            this.f2511d = null;
            this.f2512e = 0;
        }
    }

    C0762am() {
    }

    /* renamed from: a */
    private C0787av.C0826w m3889a(C0787av avVar, int i, long j) {
        if (m3893a(avVar, i)) {
            return null;
        }
        C0787av.C0816o oVar = avVar.f2660d;
        try {
            avVar.mo3853l();
            C0787av.C0826w a = oVar.mo4075a(i, false, j);
            if (a != null) {
                if (!a.mo4171p() || a.mo4169n()) {
                    oVar.mo4085a(a, false);
                } else {
                    oVar.mo4086a(a.f2785a);
                }
            }
            return a;
        } finally {
            avVar.mo3784b(false);
        }
    }

    /* renamed from: a */
    private void m3890a() {
        C0765b bVar;
        int size = this.f2500b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0787av avVar = this.f2500b.get(i2);
            if (avVar.getWindowVisibility() == 0) {
                avVar.f2612A.mo3627a(avVar, false);
                i += avVar.f2612A.f2507d;
            }
        }
        this.f2503f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0787av avVar2 = this.f2500b.get(i4);
            if (avVar2.getWindowVisibility() == 0) {
                C0764a aVar = avVar2.f2612A;
                int abs = Math.abs(aVar.f2504a) + Math.abs(aVar.f2505b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f2507d * 2; i6 += 2) {
                    if (i5 >= this.f2503f.size()) {
                        bVar = new C0765b();
                        this.f2503f.add(bVar);
                    } else {
                        bVar = this.f2503f.get(i5);
                    }
                    int i7 = aVar.f2506c[i6 + 1];
                    bVar.f2508a = i7 <= abs;
                    bVar.f2509b = abs;
                    bVar.f2510c = i7;
                    bVar.f2511d = avVar2;
                    bVar.f2512e = aVar.f2506c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f2503f, f2499e);
    }

    /* renamed from: a */
    private void m3891a(C0765b bVar, long j) {
        C0787av.C0826w a = m3889a(bVar.f2511d, bVar.f2512e, bVar.f2508a ? Long.MAX_VALUE : j);
        if (a != null && a.f2786b != null && a.mo4171p() && !a.mo4169n()) {
            m3892a((C0787av) a.f2786b.get(), j);
        }
    }

    /* renamed from: a */
    private void m3892a(C0787av avVar, long j) {
        if (avVar != null) {
            if (avVar.f2679w && avVar.f2662f.mo3499c() != 0) {
                avVar.mo3788c();
            }
            C0764a aVar = avVar.f2612A;
            aVar.mo3627a(avVar, true);
            if (aVar.f2507d != 0) {
                try {
                    C0279c.m1263a("RV Nested Prefetch");
                    avVar.f2613B.mo4131a(avVar.f2668l);
                    for (int i = 0; i < aVar.f2507d * 2; i += 2) {
                        m3889a(avVar, aVar.f2506c[i], j);
                    }
                } finally {
                    C0279c.m1262a();
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m3893a(C0787av avVar, int i) {
        int c = avVar.f2662f.mo3499c();
        for (int i2 = 0; i2 < c; i2++) {
            C0787av.C0826w e = C0787av.m4073e(avVar.f2662f.mo3502d(i2));
            if (e.f2787c == i && !e.mo4169n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m3894b(long j) {
        int i = 0;
        while (i < this.f2503f.size()) {
            C0765b bVar = this.f2503f.get(i);
            if (bVar.f2511d != null) {
                m3891a(bVar, j);
                bVar.mo3630a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3618a(long j) {
        m3890a();
        m3894b(j);
    }

    /* renamed from: a */
    public void mo3619a(C0787av avVar) {
        this.f2500b.add(avVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3620a(C0787av avVar, int i, int i2) {
        if (avVar.isAttachedToWindow() && this.f2501c == 0) {
            this.f2501c = avVar.getNanoTime();
            avVar.post(this);
        }
        avVar.f2612A.mo3626a(i, i2);
    }

    /* renamed from: b */
    public void mo3621b(C0787av avVar) {
        this.f2500b.remove(avVar);
    }

    public void run() {
        try {
            C0279c.m1263a("RV Prefetch");
            if (!this.f2500b.isEmpty()) {
                int size = this.f2500b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    C0787av avVar = this.f2500b.get(i);
                    if (avVar.getWindowVisibility() == 0) {
                        j = Math.max(avVar.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo3618a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2502d);
                    this.f2501c = 0;
                    C0279c.m1262a();
                }
            }
        } finally {
            this.f2501c = 0;
            C0279c.m1262a();
        }
    }
}
