package android.support.p005v4.p016h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.h.h */
abstract class C0303h<K, V> {

    /* renamed from: b */
    C0303h<K, V>.b f911b;

    /* renamed from: c */
    C0303h<K, V>.c f912c;

    /* renamed from: d */
    C0303h<K, V>.e f913d;

    /* renamed from: android.support.v4.h.h$a */
    final class C0304a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f914a;

        /* renamed from: b */
        int f915b;

        /* renamed from: c */
        int f916c;

        /* renamed from: d */
        boolean f917d = false;

        C0304a(int i) {
            this.f914a = i;
            this.f915b = C0303h.this.mo1250a();
        }

        public boolean hasNext() {
            return this.f916c < this.f915b;
        }

        public T next() {
            if (hasNext()) {
                T a = C0303h.this.mo1252a(this.f916c, this.f914a);
                this.f916c++;
                this.f917d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f917d) {
                this.f916c--;
                this.f915b--;
                this.f917d = false;
                C0303h.this.mo1254a(this.f916c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.h.h$b */
    final class C0305b implements Set<Map.Entry<K, V>> {
        C0305b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = C0303h.this.mo1250a();
            for (Map.Entry entry : collection) {
                C0303h.this.mo1255a(entry.getKey(), entry.getValue());
            }
            return a != C0303h.this.mo1250a();
        }

        public void clear() {
            C0303h.this.mo1258c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C0303h.this.mo1251a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0298c.m1336a(C0303h.this.mo1252a(a, 1), entry.getValue());
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
            return C0303h.m1360a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0303h.this.mo1250a() - 1; a >= 0; a--) {
                Object a2 = C0303h.this.mo1252a(a, 0);
                Object a3 = C0303h.this.mo1252a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0303h.this.mo1250a() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0307d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0303h.this.mo1250a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.h.h$c */
    final class C0306c implements Set<K> {
        C0306c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0303h.this.mo1258c();
        }

        public boolean contains(Object obj) {
            return C0303h.this.mo1251a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0303h.m1359a(C0303h.this.mo1257b(), collection);
        }

        public boolean equals(Object obj) {
            return C0303h.m1360a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0303h.this.mo1250a() - 1; a >= 0; a--) {
                Object a2 = C0303h.this.mo1252a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0303h.this.mo1250a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0304a(0);
        }

        public boolean remove(Object obj) {
            int a = C0303h.this.mo1251a(obj);
            if (a < 0) {
                return false;
            }
            C0303h.this.mo1254a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0303h.m1361b(C0303h.this.mo1257b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0303h.m1362c(C0303h.this.mo1257b(), collection);
        }

        public int size() {
            return C0303h.this.mo1250a();
        }

        public Object[] toArray() {
            return C0303h.this.mo1302b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0303h.this.mo1301a(tArr, 0);
        }
    }

    /* renamed from: android.support.v4.h.h$d */
    final class C0307d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f921a;

        /* renamed from: b */
        int f922b;

        /* renamed from: c */
        boolean f923c = false;

        C0307d() {
            this.f921a = C0303h.this.mo1250a() - 1;
            this.f922b = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f922b++;
                this.f923c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final boolean equals(Object obj) {
            if (!this.f923c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0298c.m1336a(entry.getKey(), C0303h.this.mo1252a(this.f922b, 0)) && C0298c.m1336a(entry.getValue(), C0303h.this.mo1252a(this.f922b, 1));
            }
        }

        public K getKey() {
            if (this.f923c) {
                return C0303h.this.mo1252a(this.f922b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f923c) {
                return C0303h.this.mo1252a(this.f922b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f922b < this.f921a;
        }

        public final int hashCode() {
            if (this.f923c) {
                int i = 0;
                Object a = C0303h.this.mo1252a(this.f922b, 0);
                Object a2 = C0303h.this.mo1252a(this.f922b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f923c) {
                C0303h.this.mo1254a(this.f922b);
                this.f922b--;
                this.f921a--;
                this.f923c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f923c) {
                return C0303h.this.mo1253a(this.f922b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.h.h$e */
    final class C0308e implements Collection<V> {
        C0308e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0303h.this.mo1258c();
        }

        public boolean contains(Object obj) {
            return C0303h.this.mo1256b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0303h.this.mo1250a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0304a(1);
        }

        public boolean remove(Object obj) {
            int b = C0303h.this.mo1256b(obj);
            if (b < 0) {
                return false;
            }
            C0303h.this.mo1254a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = C0303h.this.mo1250a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0303h.this.mo1252a(i, 1))) {
                    C0303h.this.mo1254a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = C0303h.this.mo1250a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0303h.this.mo1252a(i, 1))) {
                    C0303h.this.mo1254a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0303h.this.mo1250a();
        }

        public Object[] toArray() {
            return C0303h.this.mo1302b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0303h.this.mo1301a(tArr, 1);
        }
    }

    C0303h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m1359a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m1360a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m1361b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m1362c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1250a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1251a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1252a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1253a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1254a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1255a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo1301a(T[] tArr, int i) {
        int a = mo1250a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo1252a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1256b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo1257b();

    /* renamed from: b */
    public Object[] mo1302b(int i) {
        int a = mo1250a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo1252a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo1258c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo1303d() {
        if (this.f911b == null) {
            this.f911b = new C0305b();
        }
        return this.f911b;
    }

    /* renamed from: e */
    public Set<K> mo1304e() {
        if (this.f912c == null) {
            this.f912c = new C0306c();
        }
        return this.f912c;
    }

    /* renamed from: f */
    public Collection<V> mo1305f() {
        if (this.f913d == null) {
            this.f913d = new C0308e();
        }
        return this.f913d;
    }
}
