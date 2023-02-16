package android.support.p005v4.p016h;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.h.m */
public class C0319m<K, V> {

    /* renamed from: b */
    static Object[] f932b;

    /* renamed from: c */
    static int f933c;

    /* renamed from: d */
    static Object[] f934d;

    /* renamed from: e */
    static int f935e;

    /* renamed from: f */
    int[] f936f;

    /* renamed from: g */
    Object[] f937g;

    /* renamed from: h */
    int f938h;

    public C0319m() {
        this.f936f = C0298c.f893a;
        this.f937g = C0298c.f895c;
        this.f938h = 0;
    }

    public C0319m(int i) {
        if (i == 0) {
            this.f936f = C0298c.f893a;
            this.f937g = C0298c.f895c;
        } else {
            m1393e(i);
        }
        this.f938h = 0;
    }

    /* renamed from: a */
    private static int m1391a(int[] iArr, int i, int i2) {
        try {
            return C0298c.m1334a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m1392a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0294a.class) {
                if (f935e < 10) {
                    objArr[0] = f934d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f934d = objArr;
                    f935e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0294a.class) {
                if (f933c < 10) {
                    objArr[0] = f932b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f932b = objArr;
                    f933c++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m1393e(int i) {
        if (i == 8) {
            synchronized (C0294a.class) {
                if (f934d != null) {
                    Object[] objArr = f934d;
                    this.f937g = objArr;
                    f934d = (Object[]) objArr[0];
                    this.f936f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f935e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0294a.class) {
                if (f932b != null) {
                    Object[] objArr2 = f932b;
                    this.f937g = objArr2;
                    f932b = (Object[]) objArr2[0];
                    this.f936f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f933c--;
                    return;
                }
            }
        }
        this.f936f = new int[i];
        this.f937g = new Object[(i << 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1369a() {
        int i = this.f938h;
        if (i == 0) {
            return -1;
        }
        int a = m1391a(this.f936f, i, 0);
        if (a < 0 || this.f937g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f936f[i2] == 0) {
            if (this.f937g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f936f[i3] == 0) {
            if (this.f937g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public int mo1370a(Object obj) {
        return obj == null ? mo1369a() : mo1371a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1371a(Object obj, int i) {
        int i2 = this.f938h;
        if (i2 == 0) {
            return -1;
        }
        int a = m1391a(this.f936f, i2, i);
        if (a < 0 || obj.equals(this.f937g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f936f[i3] == i) {
            if (obj.equals(this.f937g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f936f[i4] == i) {
            if (obj.equals(this.f937g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public V mo1372a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f937g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo1373a(int i) {
        int i2 = this.f938h;
        int[] iArr = this.f936f;
        if (iArr.length < i) {
            Object[] objArr = this.f937g;
            m1393e(i);
            if (this.f938h > 0) {
                System.arraycopy(iArr, 0, this.f936f, 0, i2);
                System.arraycopy(objArr, 0, this.f937g, 0, i2 << 1);
            }
            m1392a(iArr, objArr, i2);
        }
        if (this.f938h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1374b(Object obj) {
        int i = this.f938h * 2;
        Object[] objArr = this.f937g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo1375b(int i) {
        return this.f937g[i << 1];
    }

    /* renamed from: c */
    public V mo1376c(int i) {
        return this.f937g[(i << 1) + 1];
    }

    public void clear() {
        int i = this.f938h;
        if (i > 0) {
            int[] iArr = this.f936f;
            Object[] objArr = this.f937g;
            this.f936f = C0298c.f893a;
            this.f937g = C0298c.f895c;
            this.f938h = 0;
            m1392a(iArr, objArr, i);
        }
        if (this.f938h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo1370a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo1374b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo1380d(int i) {
        int i2;
        V[] vArr = this.f937g;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f938h;
        if (i4 <= 1) {
            m1392a(this.f936f, (Object[]) vArr, i4);
            this.f936f = C0298c.f893a;
            this.f937g = C0298c.f895c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f936f;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f936f;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f937g;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f937g;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f936f;
                Object[] objArr3 = this.f937g;
                m1393e(i5);
                if (i4 == this.f938h) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f936f, 0, i);
                        System.arraycopy(objArr3, 0, this.f937g, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f936f, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f937g, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f938h) {
            this.f938h = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0319m) {
            C0319m mVar = (C0319m) obj;
            if (size() != mVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f938h) {
                try {
                    Object b = mo1375b(i);
                    Object c = mo1376c(i);
                    Object obj2 = mVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !mVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f938h) {
                try {
                    Object b2 = mo1375b(i2);
                    Object c2 = mo1376c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo1370a(obj);
        if (a >= 0) {
            return this.f937g[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f936f;
        Object[] objArr = this.f937g;
        int i = this.f938h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f938h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f938h;
        if (k == null) {
            i2 = mo1369a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo1371a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f937g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f936f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f936f;
            Object[] objArr = this.f937g;
            m1393e(i6);
            if (i3 == this.f938h) {
                int[] iArr2 = this.f936f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f937g, 0, objArr.length);
                }
                m1392a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f936f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f937g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f938h - i5) << 1);
        }
        int i8 = this.f938h;
        if (i3 == i8) {
            int[] iArr4 = this.f936f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f937g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f938h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int a = mo1370a(obj);
        if (a >= 0) {
            return mo1380d(a);
        }
        return null;
    }

    public int size() {
        return this.f938h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f938h * 28);
        sb.append('{');
        for (int i = 0; i < this.f938h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1375b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo1376c(i);
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
