package android.support.p005v4.p016h;

/* renamed from: android.support.v4.h.n */
public class C0320n<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f939a = new Object();

    /* renamed from: b */
    private boolean f940b;

    /* renamed from: c */
    private int[] f941c;

    /* renamed from: d */
    private Object[] f942d;

    /* renamed from: e */
    private int f943e;

    public C0320n() {
        this(10);
    }

    public C0320n(int i) {
        Object[] objArr;
        this.f940b = false;
        if (i == 0) {
            this.f941c = C0298c.f893a;
            objArr = C0298c.f895c;
        } else {
            int a = C0298c.m1333a(i);
            this.f941c = new int[a];
            objArr = new Object[a];
        }
        this.f942d = objArr;
        this.f943e = 0;
    }

    /* renamed from: d */
    private void m1403d() {
        int i = this.f943e;
        int[] iArr = this.f941c;
        Object[] objArr = this.f942d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f939a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f940b = false;
        this.f943e = i2;
    }

    /* renamed from: a */
    public C0320n<E> clone() {
        try {
            C0320n<E> nVar = (C0320n) super.clone();
            try {
                nVar.f941c = (int[]) this.f941c.clone();
                nVar.f942d = (Object[]) this.f942d.clone();
                return nVar;
            } catch (CloneNotSupportedException unused) {
                return nVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo1390a(int i) {
        return mo1391a(i, (Object) null);
    }

    /* renamed from: a */
    public E mo1391a(int i, E e) {
        int a = C0298c.m1334a(this.f941c, this.f943e, i);
        if (a >= 0) {
            E[] eArr = this.f942d;
            if (eArr[a] != f939a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public int mo1392b() {
        if (this.f940b) {
            m1403d();
        }
        return this.f943e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f942d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1393b(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f941c
            int r1 = r3.f943e
            int r4 = android.support.p005v4.p016h.C0298c.m1334a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f942d
            r1 = r0[r4]
            java.lang.Object r2 = f939a
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f940b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p016h.C0320n.mo1393b(int):void");
    }

    /* renamed from: b */
    public void mo1394b(int i, E e) {
        int a = C0298c.m1334a(this.f941c, this.f943e, i);
        if (a >= 0) {
            this.f942d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 < this.f943e) {
            Object[] objArr = this.f942d;
            if (objArr[i2] == f939a) {
                this.f941c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f940b && this.f943e >= this.f941c.length) {
            m1403d();
            i2 = C0298c.m1334a(this.f941c, this.f943e, i) ^ -1;
        }
        int i3 = this.f943e;
        if (i3 >= this.f941c.length) {
            int a2 = C0298c.m1333a(i3 + 1);
            int[] iArr = new int[a2];
            Object[] objArr2 = new Object[a2];
            int[] iArr2 = this.f941c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f942d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f941c = iArr;
            this.f942d = objArr2;
        }
        int i4 = this.f943e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f941c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f942d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f943e - i2);
        }
        this.f941c[i2] = i;
        this.f942d[i2] = e;
        this.f943e++;
    }

    /* renamed from: c */
    public void mo1395c() {
        int i = this.f943e;
        Object[] objArr = this.f942d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f943e = 0;
        this.f940b = false;
    }

    /* renamed from: c */
    public void mo1396c(int i) {
        mo1393b(i);
    }

    /* renamed from: c */
    public void mo1397c(int i, E e) {
        int i2 = this.f943e;
        if (i2 == 0 || i > this.f941c[i2 - 1]) {
            if (this.f940b && this.f943e >= this.f941c.length) {
                m1403d();
            }
            int i3 = this.f943e;
            if (i3 >= this.f941c.length) {
                int a = C0298c.m1333a(i3 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                int[] iArr2 = this.f941c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f942d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f941c = iArr;
                this.f942d = objArr;
            }
            this.f941c[i3] = i;
            this.f942d[i3] = e;
            this.f943e = i3 + 1;
            return;
        }
        mo1394b(i, e);
    }

    /* renamed from: d */
    public int mo1399d(int i) {
        if (this.f940b) {
            m1403d();
        }
        return this.f941c[i];
    }

    /* renamed from: e */
    public E mo1400e(int i) {
        if (this.f940b) {
            m1403d();
        }
        return this.f942d[i];
    }

    public String toString() {
        if (mo1392b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f943e * 28);
        sb.append('{');
        for (int i = 0; i < this.f943e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1399d(i));
            sb.append('=');
            Object e = mo1400e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
