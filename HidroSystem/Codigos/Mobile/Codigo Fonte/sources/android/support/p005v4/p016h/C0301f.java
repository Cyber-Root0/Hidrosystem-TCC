package android.support.p005v4.p016h;

/* renamed from: android.support.v4.h.f */
public class C0301f<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f898a = new Object();

    /* renamed from: b */
    private boolean f899b;

    /* renamed from: c */
    private long[] f900c;

    /* renamed from: d */
    private Object[] f901d;

    /* renamed from: e */
    private int f902e;

    public C0301f() {
        this(10);
    }

    public C0301f(int i) {
        Object[] objArr;
        this.f899b = false;
        if (i == 0) {
            this.f900c = C0298c.f894b;
            objArr = C0298c.f895c;
        } else {
            int b = C0298c.m1337b(i);
            this.f900c = new long[b];
            objArr = new Object[b];
        }
        this.f901d = objArr;
        this.f902e = 0;
    }

    /* renamed from: d */
    private void m1341d() {
        int i = this.f902e;
        long[] jArr = this.f900c;
        Object[] objArr = this.f901d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f898a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f899b = false;
        this.f902e = i2;
    }

    /* renamed from: a */
    public C0301f<E> clone() {
        try {
            C0301f<E> fVar = (C0301f) super.clone();
            try {
                fVar.f900c = (long[]) this.f900c.clone();
                fVar.f901d = (Object[]) this.f901d.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo1283a(long j) {
        return mo1284a(j, (Object) null);
    }

    /* renamed from: a */
    public E mo1284a(long j, E e) {
        int a = C0298c.m1335a(this.f900c, this.f902e, j);
        if (a >= 0) {
            E[] eArr = this.f901d;
            if (eArr[a] != f898a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: a */
    public void mo1285a(int i) {
        Object[] objArr = this.f901d;
        Object obj = objArr[i];
        Object obj2 = f898a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f899b = true;
        }
    }

    /* renamed from: b */
    public int mo1286b() {
        if (this.f899b) {
            m1341d();
        }
        return this.f902e;
    }

    /* renamed from: b */
    public long mo1287b(int i) {
        if (this.f899b) {
            m1341d();
        }
        return this.f900c[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f901d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1288b(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f900c
            int r1 = r2.f902e
            int r3 = android.support.p005v4.p016h.C0298c.m1335a((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f901d
            r0 = r4[r3]
            java.lang.Object r1 = f898a
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f899b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p016h.C0301f.mo1288b(long):void");
    }

    /* renamed from: b */
    public void mo1289b(long j, E e) {
        int a = C0298c.m1335a(this.f900c, this.f902e, j);
        if (a >= 0) {
            this.f901d[a] = e;
            return;
        }
        int i = a ^ -1;
        if (i < this.f902e) {
            Object[] objArr = this.f901d;
            if (objArr[i] == f898a) {
                this.f900c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f899b && this.f902e >= this.f900c.length) {
            m1341d();
            i = C0298c.m1335a(this.f900c, this.f902e, j) ^ -1;
        }
        int i2 = this.f902e;
        if (i2 >= this.f900c.length) {
            int b = C0298c.m1337b(i2 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.f900c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f901d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f900c = jArr;
            this.f901d = objArr2;
        }
        int i3 = this.f902e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f900c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f901d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f902e - i);
        }
        this.f900c[i] = j;
        this.f901d[i] = e;
        this.f902e++;
    }

    /* renamed from: c */
    public E mo1290c(int i) {
        if (this.f899b) {
            m1341d();
        }
        return this.f901d[i];
    }

    /* renamed from: c */
    public void mo1291c() {
        int i = this.f902e;
        Object[] objArr = this.f901d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f902e = 0;
        this.f899b = false;
    }

    public String toString() {
        if (mo1286b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f902e * 28);
        sb.append('{');
        for (int i = 0; i < this.f902e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1287b(i));
            sb.append('=');
            Object c = mo1290c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
