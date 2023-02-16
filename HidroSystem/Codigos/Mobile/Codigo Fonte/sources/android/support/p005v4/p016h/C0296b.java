package android.support.p005v4.p016h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.h.b */
public final class C0296b<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    static Object[] f881a;

    /* renamed from: b */
    static int f882b;

    /* renamed from: c */
    static Object[] f883c;

    /* renamed from: d */
    static int f884d;

    /* renamed from: j */
    private static final int[] f885j = new int[0];

    /* renamed from: k */
    private static final Object[] f886k = new Object[0];

    /* renamed from: e */
    final boolean f887e;

    /* renamed from: f */
    int[] f888f;

    /* renamed from: g */
    Object[] f889g;

    /* renamed from: h */
    int f890h;

    /* renamed from: i */
    C0303h<E, E> f891i;

    public C0296b() {
        this(0, false);
    }

    public C0296b(int i, boolean z) {
        this.f887e = z;
        if (i == 0) {
            this.f888f = f885j;
            this.f889g = f886k;
        } else {
            m1319d(i);
        }
        this.f890h = 0;
    }

    /* renamed from: a */
    private int m1315a() {
        int i = this.f890h;
        if (i == 0) {
            return -1;
        }
        int a = C0298c.m1334a(this.f888f, i, 0);
        if (a < 0 || this.f889g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f888f[i2] == 0) {
            if (this.f889g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f888f[i3] == 0) {
            if (this.f889g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    private int m1316a(Object obj, int i) {
        int i2 = this.f890h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0298c.m1334a(this.f888f, i2, i);
        if (a < 0 || obj.equals(this.f889g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f888f[i3] == i) {
            if (obj.equals(this.f889g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f888f[i4] == i) {
            if (obj.equals(this.f889g[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m1317a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0296b.class) {
                if (f884d < 10) {
                    objArr[0] = f883c;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f883c = objArr;
                    f884d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0296b.class) {
                if (f882b < 10) {
                    objArr[0] = f881a;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f881a = objArr;
                    f882b++;
                }
            }
        }
    }

    /* renamed from: b */
    private C0303h<E, E> m1318b() {
        if (this.f891i == null) {
            this.f891i = new C0303h<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1250a() {
                    return C0296b.this.f890h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1251a(Object obj) {
                    return C0296b.this.mo1259a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1252a(int i, int i2) {
                    return C0296b.this.f889g[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public E mo1253a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1254a(int i) {
                    C0296b.this.mo1264c(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1255a(E e, E e2) {
                    C0296b.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1256b(Object obj) {
                    return C0296b.this.mo1259a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<E, E> mo1257b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1258c() {
                    C0296b.this.clear();
                }
            };
        }
        return this.f891i;
    }

    /* renamed from: d */
    private void m1319d(int i) {
        if (i == 8) {
            synchronized (C0296b.class) {
                if (f883c != null) {
                    Object[] objArr = f883c;
                    this.f889g = objArr;
                    f883c = (Object[]) objArr[0];
                    this.f888f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f884d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0296b.class) {
                if (f881a != null) {
                    Object[] objArr2 = f881a;
                    this.f889g = objArr2;
                    f881a = (Object[]) objArr2[0];
                    this.f888f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f882b--;
                    return;
                }
            }
        }
        this.f888f = new int[i];
        this.f889g = new Object[i];
    }

    /* renamed from: a */
    public int mo1259a(Object obj) {
        if (obj == null) {
            return m1315a();
        }
        return m1316a(obj, this.f887e ? System.identityHashCode(obj) : obj.hashCode());
    }

    /* renamed from: a */
    public void mo1260a(int i) {
        int[] iArr = this.f888f;
        if (iArr.length < i) {
            Object[] objArr = this.f889g;
            m1319d(i);
            int i2 = this.f890h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f888f, 0, i2);
                System.arraycopy(objArr, 0, this.f889g, 0, this.f890h);
            }
            m1317a(iArr, objArr, this.f890h);
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m1315a();
            i = 0;
        } else {
            int identityHashCode = this.f887e ? System.identityHashCode(e) : e.hashCode();
            i = identityHashCode;
            i2 = m1316a(e, identityHashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f890h;
        if (i4 >= this.f888f.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f888f;
            Object[] objArr = this.f889g;
            m1319d(i5);
            int[] iArr2 = this.f888f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f889g, 0, objArr.length);
            }
            m1317a(iArr, objArr, this.f890h);
        }
        int i6 = this.f890h;
        if (i3 < i6) {
            int[] iArr3 = this.f888f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f889g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f890h - i3);
        }
        this.f888f[i3] = i;
        this.f889g[i3] = e;
        this.f890h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo1260a(this.f890h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public E mo1263b(int i) {
        return this.f889g[i];
    }

    /* renamed from: c */
    public E mo1264c(int i) {
        E[] eArr = this.f889g;
        E e = eArr[i];
        int i2 = this.f890h;
        if (i2 <= 1) {
            m1317a(this.f888f, eArr, i2);
            this.f888f = f885j;
            this.f889g = f886k;
            this.f890h = 0;
        } else {
            int[] iArr = this.f888f;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f890h--;
                int i4 = this.f890h;
                if (i < i4) {
                    int[] iArr2 = this.f888f;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f889g;
                    System.arraycopy(objArr, i5, objArr, i, this.f890h - i);
                }
                this.f889g[this.f890h] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f888f;
                Object[] objArr2 = this.f889g;
                m1319d(i3);
                this.f890h--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f888f, 0, i);
                    System.arraycopy(objArr2, 0, this.f889g, 0, i);
                }
                int i6 = this.f890h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f888f, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f889g, i, this.f890h - i);
                }
            }
        }
        return e;
    }

    public void clear() {
        int i = this.f890h;
        if (i != 0) {
            m1317a(this.f888f, this.f889g, i);
            this.f888f = f885j;
            this.f889g = f886k;
            this.f890h = 0;
        }
    }

    public boolean contains(Object obj) {
        return mo1259a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f890h) {
                try {
                    if (!set.contains(mo1263b(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f888f;
        int i = this.f890h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public boolean isEmpty() {
        return this.f890h <= 0;
    }

    public Iterator<E> iterator() {
        return m1318b().mo1304e().iterator();
    }

    public boolean remove(Object obj) {
        int a = mo1259a(obj);
        if (a < 0) {
            return false;
        }
        mo1264c(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f890h - 1; i >= 0; i--) {
            if (!collection.contains(this.f889g[i])) {
                mo1264c(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f890h;
    }

    public Object[] toArray() {
        int i = this.f890h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f889g, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f890h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f890h);
        }
        System.arraycopy(this.f889g, 0, tArr, 0, this.f890h);
        int length = tArr.length;
        int i = this.f890h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f890h * 14);
        sb.append('{');
        for (int i = 0; i < this.f890h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1263b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
