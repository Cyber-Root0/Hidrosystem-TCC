package android.support.p020v7.widget;

import android.support.p005v4.p016h.C0314k;
import android.support.p020v7.widget.C0782at;
import android.support.p020v7.widget.C0787av;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.f */
class C0884f implements C0782at.C0783a {

    /* renamed from: a */
    final ArrayList<C0886b> f2989a;

    /* renamed from: b */
    final ArrayList<C0886b> f2990b;

    /* renamed from: c */
    final C0885a f2991c;

    /* renamed from: d */
    Runnable f2992d;

    /* renamed from: e */
    final boolean f2993e;

    /* renamed from: f */
    final C0782at f2994f;

    /* renamed from: g */
    private C0314k.C0315a<C0886b> f2995g;

    /* renamed from: h */
    private int f2996h;

    /* renamed from: android.support.v7.widget.f$a */
    interface C0885a {
        /* renamed from: a */
        C0787av.C0826w mo3914a(int i);

        /* renamed from: a */
        void mo3915a(int i, int i2);

        /* renamed from: a */
        void mo3916a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo3917a(C0886b bVar);

        /* renamed from: b */
        void mo3918b(int i, int i2);

        /* renamed from: b */
        void mo3919b(C0886b bVar);

        /* renamed from: c */
        void mo3920c(int i, int i2);

        /* renamed from: d */
        void mo3922d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.f$b */
    static class C0886b {

        /* renamed from: a */
        int f2997a;

        /* renamed from: b */
        int f2998b;

        /* renamed from: c */
        Object f2999c;

        /* renamed from: d */
        int f3000d;

        C0886b(int i, int i2, int i3, Object obj) {
            this.f2997a = i;
            this.f2998b = i2;
            this.f3000d = i3;
            this.f2999c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4400a() {
            int i = this.f2997a;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0886b bVar = (C0886b) obj;
            int i = this.f2997a;
            if (i != bVar.f2997a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3000d - this.f2998b) == 1 && this.f3000d == bVar.f2998b && this.f2998b == bVar.f3000d) {
                return true;
            }
            if (this.f3000d != bVar.f3000d || this.f2998b != bVar.f2998b) {
                return false;
            }
            Object obj2 = this.f2999c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2999c)) {
                    return false;
                }
            } else if (bVar.f2999c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2997a * 31) + this.f2998b) * 31) + this.f3000d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4400a() + ",s:" + this.f2998b + "c:" + this.f3000d + ",p:" + this.f2999c + "]";
        }
    }

    C0884f(C0885a aVar) {
        this(aVar, false);
    }

    C0884f(C0885a aVar, boolean z) {
        this.f2995g = new C0314k.C0316b(30);
        this.f2989a = new ArrayList<>();
        this.f2990b = new ArrayList<>();
        this.f2996h = 0;
        this.f2991c = aVar;
        this.f2993e = z;
        this.f2994f = new C0782at(this);
    }

    /* renamed from: b */
    private int m4807b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f2990b.size() - 1; size >= 0; size--) {
            C0886b bVar = this.f2990b.get(size);
            if (bVar.f2997a == 8) {
                if (bVar.f2998b < bVar.f3000d) {
                    i5 = bVar.f2998b;
                    i4 = bVar.f3000d;
                } else {
                    i5 = bVar.f3000d;
                    i4 = bVar.f2998b;
                }
                if (i < i5 || i > i4) {
                    if (i < bVar.f2998b) {
                        if (i2 == 1) {
                            bVar.f2998b++;
                            i6 = bVar.f3000d + 1;
                        } else if (i2 == 2) {
                            bVar.f2998b--;
                            i6 = bVar.f3000d - 1;
                        }
                        bVar.f3000d = i6;
                    }
                } else if (i5 == bVar.f2998b) {
                    if (i2 == 1) {
                        i8 = bVar.f3000d + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = bVar.f3000d - 1;
                        }
                        i++;
                    }
                    bVar.f3000d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = bVar.f2998b + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = bVar.f2998b - 1;
                        }
                        i--;
                    }
                    bVar.f2998b = i7;
                    i--;
                }
            } else if (bVar.f2998b > i) {
                if (i2 == 1) {
                    i3 = bVar.f2998b + 1;
                } else if (i2 == 2) {
                    i3 = bVar.f2998b - 1;
                }
                bVar.f2998b = i3;
            } else if (bVar.f2997a == 1) {
                i -= bVar.f3000d;
            } else if (bVar.f2997a == 2) {
                i += bVar.f3000d;
            }
        }
        for (int size2 = this.f2990b.size() - 1; size2 >= 0; size2--) {
            C0886b bVar2 = this.f2990b.get(size2);
            if (bVar2.f2997a == 8) {
                if (bVar2.f3000d != bVar2.f2998b && bVar2.f3000d >= 0) {
                }
            } else if (bVar2.f3000d > 0) {
            }
            this.f2990b.remove(size2);
            mo3734a(bVar2);
        }
        return i;
    }

    /* renamed from: b */
    private void m4808b(C0886b bVar) {
        m4814g(bVar);
    }

    /* renamed from: c */
    private void m4809c(C0886b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f2998b;
        int i2 = bVar.f2998b + bVar.f3000d;
        int i3 = bVar.f2998b;
        int i4 = 0;
        char c2 = 65535;
        while (i3 < i2) {
            if (this.f2991c.mo3914a(i3) != null || m4811d(i3)) {
                if (c2 == 0) {
                    m4812e(mo3733a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m4814g(mo3733a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3000d) {
            mo3734a(bVar);
            bVar = mo3733a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m4812e(bVar);
        } else {
            m4814g(bVar);
        }
    }

    /* renamed from: d */
    private void m4810d(C0886b bVar) {
        int i = bVar.f2998b;
        int i2 = bVar.f2998b + bVar.f3000d;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        for (int i5 = bVar.f2998b; i5 < i2; i5++) {
            if (this.f2991c.mo3914a(i5) != null || m4811d(i5)) {
                if (c == 0) {
                    m4812e(mo3733a(4, i3, i4, bVar.f2999c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m4814g(mo3733a(4, i3, i4, bVar.f2999c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
        }
        if (i4 != bVar.f3000d) {
            Object obj = bVar.f2999c;
            mo3734a(bVar);
            bVar = mo3733a(4, i3, i4, obj);
        }
        if (c == 0) {
            m4812e(bVar);
        } else {
            m4814g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m4811d(int i) {
        int size = this.f2990b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0886b bVar = this.f2990b.get(i2);
            if (bVar.f2997a == 8) {
                if (mo4388a(bVar.f3000d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f2997a == 1) {
                int i3 = bVar.f2998b + bVar.f3000d;
                for (int i4 = bVar.f2998b; i4 < i3; i4++) {
                    if (mo4388a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m4812e(C0886b bVar) {
        int i;
        if (bVar.f2997a == 1 || bVar.f2997a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m4807b(bVar.f2998b, bVar.f2997a);
        int i2 = bVar.f2998b;
        int i3 = bVar.f2997a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i4 = b;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f3000d; i7++) {
            int b2 = m4807b(bVar.f2998b + (i * i7), bVar.f2997a);
            int i8 = bVar.f2997a;
            if (i8 == 2 ? b2 == i4 : i8 == 4 && b2 == i4 + 1) {
                i6++;
            } else {
                C0886b a = mo3733a(bVar.f2997a, i4, i6, bVar.f2999c);
                mo4390a(a, i5);
                mo3734a(a);
                if (bVar.f2997a == 4) {
                    i5 += i6;
                }
                i4 = b2;
                i6 = 1;
            }
        }
        Object obj = bVar.f2999c;
        mo3734a(bVar);
        if (i6 > 0) {
            C0886b a2 = mo3733a(bVar.f2997a, i4, i6, obj);
            mo4390a(a2, i5);
            mo3734a(a2);
        }
    }

    /* renamed from: f */
    private void m4813f(C0886b bVar) {
        m4814g(bVar);
    }

    /* renamed from: g */
    private void m4814g(C0886b bVar) {
        this.f2990b.add(bVar);
        int i = bVar.f2997a;
        if (i == 4) {
            this.f2991c.mo3916a(bVar.f2998b, bVar.f3000d, bVar.f2999c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f2991c.mo3920c(bVar.f2998b, bVar.f3000d);
                    return;
                case 2:
                    this.f2991c.mo3918b(bVar.f2998b, bVar.f3000d);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
            }
        } else {
            this.f2991c.mo3922d(bVar.f2998b, bVar.f3000d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4388a(int i, int i2) {
        int size = this.f2990b.size();
        while (i2 < size) {
            C0886b bVar = this.f2990b.get(i2);
            if (bVar.f2997a == 8) {
                if (bVar.f2998b == i) {
                    i = bVar.f3000d;
                } else {
                    if (bVar.f2998b < i) {
                        i--;
                    }
                    if (bVar.f3000d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f2998b > i) {
                continue;
            } else if (bVar.f2997a == 2) {
                if (i < bVar.f2998b + bVar.f3000d) {
                    return -1;
                }
                i -= bVar.f3000d;
            } else if (bVar.f2997a == 1) {
                i += bVar.f3000d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public C0886b mo3733a(int i, int i2, int i3, Object obj) {
        C0886b a = this.f2995g.mo1367a();
        if (a == null) {
            return new C0886b(i, i2, i3, obj);
        }
        a.f2997a = i;
        a.f2998b = i2;
        a.f3000d = i3;
        a.f2999c = obj;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4389a() {
        mo4391a((List<C0886b>) this.f2989a);
        mo4391a((List<C0886b>) this.f2990b);
        this.f2996h = 0;
    }

    /* renamed from: a */
    public void mo3734a(C0886b bVar) {
        if (!this.f2993e) {
            bVar.f2999c = null;
            this.f2995g.mo1368a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4390a(C0886b bVar, int i) {
        this.f2991c.mo3917a(bVar);
        int i2 = bVar.f2997a;
        if (i2 == 2) {
            this.f2991c.mo3915a(i, bVar.f3000d);
        } else if (i2 == 4) {
            this.f2991c.mo3916a(i, bVar.f3000d, bVar.f2999c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4391a(List<C0886b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3734a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4392a(int i) {
        return (i & this.f2996h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4393b(int i) {
        return mo4388a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4394b() {
        this.f2994f.mo3730a(this.f2989a);
        int size = this.f2989a.size();
        for (int i = 0; i < size; i++) {
            C0886b bVar = this.f2989a.get(i);
            int i2 = bVar.f2997a;
            if (i2 == 4) {
                m4810d(bVar);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        m4813f(bVar);
                        break;
                    case 2:
                        m4809c(bVar);
                        break;
                }
            } else {
                m4808b(bVar);
            }
            Runnable runnable = this.f2992d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2989a.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4395c(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<android.support.v7.widget.f$b> r0 = r5.f2989a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x004a
            java.util.ArrayList<android.support.v7.widget.f$b> r2 = r5.f2989a
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.widget.f$b r2 = (android.support.p020v7.widget.C0884f.C0886b) r2
            int r3 = r2.f2997a
            r4 = 8
            if (r3 == r4) goto L_0x0034
            switch(r3) {
                case 1: goto L_0x002c;
                case 2: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0047
        L_0x001b:
            int r3 = r2.f2998b
            if (r3 > r6) goto L_0x0047
            int r3 = r2.f2998b
            int r4 = r2.f3000d
            int r3 = r3 + r4
            if (r3 <= r6) goto L_0x0028
            r6 = -1
            return r6
        L_0x0028:
            int r2 = r2.f3000d
            int r6 = r6 - r2
            goto L_0x0047
        L_0x002c:
            int r3 = r2.f2998b
            if (r3 > r6) goto L_0x0047
            int r2 = r2.f3000d
            int r6 = r6 + r2
            goto L_0x0047
        L_0x0034:
            int r3 = r2.f2998b
            if (r3 != r6) goto L_0x003b
            int r6 = r2.f3000d
            goto L_0x0047
        L_0x003b:
            int r3 = r2.f2998b
            if (r3 >= r6) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            int r2 = r2.f3000d
            if (r2 > r6) goto L_0x0047
            int r6 = r6 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0884f.mo4395c(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4396c() {
        int size = this.f2990b.size();
        for (int i = 0; i < size; i++) {
            this.f2991c.mo3919b(this.f2990b.get(i));
        }
        mo4391a((List<C0886b>) this.f2990b);
        this.f2996h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4397d() {
        return this.f2989a.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4398e() {
        mo4396c();
        int size = this.f2989a.size();
        for (int i = 0; i < size; i++) {
            C0886b bVar = this.f2989a.get(i);
            int i2 = bVar.f2997a;
            if (i2 == 4) {
                this.f2991c.mo3919b(bVar);
                this.f2991c.mo3916a(bVar.f2998b, bVar.f3000d, bVar.f2999c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f2991c.mo3919b(bVar);
                        this.f2991c.mo3920c(bVar.f2998b, bVar.f3000d);
                        break;
                    case 2:
                        this.f2991c.mo3919b(bVar);
                        this.f2991c.mo3915a(bVar.f2998b, bVar.f3000d);
                        break;
                }
            } else {
                this.f2991c.mo3919b(bVar);
                this.f2991c.mo3922d(bVar.f2998b, bVar.f3000d);
            }
            Runnable runnable = this.f2992d;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4391a((List<C0886b>) this.f2989a);
        this.f2996h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo4399f() {
        return !this.f2990b.isEmpty() && !this.f2989a.isEmpty();
    }
}
