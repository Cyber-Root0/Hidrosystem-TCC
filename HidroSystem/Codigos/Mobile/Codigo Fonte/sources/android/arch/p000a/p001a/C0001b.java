package android.arch.p000a.p001a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.a.b */
public class C0001b<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0005c<K, V> f1a;

    /* renamed from: b */
    private C0005c<K, V> f2b;

    /* renamed from: c */
    private WeakHashMap<Object<K, V>, Boolean> f3c = new WeakHashMap<>();

    /* renamed from: d */
    private int f4d = 0;

    /* renamed from: android.arch.a.a.b$a */
    static class C0003a<K, V> extends C0007e<K, V> {
        C0003a(C0005c<K, V> cVar, C0005c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0005c<K, V> mo10a(C0005c<K, V> cVar) {
            return cVar.f7c;
        }
    }

    /* renamed from: android.arch.a.a.b$b */
    private static class C0004b<K, V> extends C0007e<K, V> {
        C0004b(C0005c<K, V> cVar, C0005c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0005c<K, V> mo10a(C0005c<K, V> cVar) {
            return cVar.f8d;
        }
    }

    /* renamed from: android.arch.a.a.b$c */
    static class C0005c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f5a;

        /* renamed from: b */
        final V f6b;

        /* renamed from: c */
        C0005c<K, V> f7c;

        /* renamed from: d */
        C0005c<K, V> f8d;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0005c)) {
                return false;
            }
            C0005c cVar = (C0005c) obj;
            return this.f5a.equals(cVar.f5a) && this.f6b.equals(cVar.f6b);
        }

        public K getKey() {
            return this.f5a;
        }

        public V getValue() {
            return this.f6b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f5a + "=" + this.f6b;
        }
    }

    /* renamed from: android.arch.a.a.b$d */
    private class C0006d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private C0005c<K, V> f10b;

        /* renamed from: c */
        private boolean f11c;

        private C0006d() {
            this.f11c = true;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            C0005c<K, V> cVar;
            if (this.f11c) {
                this.f11c = false;
                cVar = C0001b.this.f1a;
            } else {
                C0005c<K, V> cVar2 = this.f10b;
                cVar = cVar2 != null ? cVar2.f7c : null;
            }
            this.f10b = cVar;
            return this.f10b;
        }

        public boolean hasNext() {
            if (this.f11c) {
                return C0001b.this.f1a != null;
            }
            C0005c<K, V> cVar = this.f10b;
            return (cVar == null || cVar.f7c == null) ? false : true;
        }
    }

    /* renamed from: android.arch.a.a.b$e */
    private static abstract class C0007e<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        C0005c<K, V> f12a;

        /* renamed from: b */
        C0005c<K, V> f13b;

        C0007e(C0005c<K, V> cVar, C0005c<K, V> cVar2) {
            this.f12a = cVar2;
            this.f13b = cVar;
        }

        /* renamed from: b */
        private C0005c<K, V> m10b() {
            C0005c<K, V> cVar = this.f13b;
            C0005c<K, V> cVar2 = this.f12a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo10a(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0005c<K, V> mo10a(C0005c<K, V> cVar);

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            C0005c<K, V> cVar = this.f13b;
            this.f13b = m10b();
            return cVar;
        }

        public boolean hasNext() {
            return this.f13b != null;
        }
    }

    /* renamed from: a */
    public int mo2a() {
        return this.f4d;
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo3b() {
        C0004b bVar = new C0004b(this.f2b, this.f1a);
        this.f3c.put(bVar, false);
        return bVar;
    }

    /* renamed from: c */
    public C0001b<K, V>.d mo4c() {
        C0001b<K, V>.d dVar = new C0006d();
        this.f3c.put(dVar, false);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo5d() {
        return this.f1a;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo6e() {
        return this.f2b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0001b)) {
            return false;
        }
        C0001b bVar = (C0001b) obj;
        if (mo2a() != bVar.mo2a()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C0003a aVar = new C0003a(this.f1a, this.f2b);
        this.f3c.put(aVar, false);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
