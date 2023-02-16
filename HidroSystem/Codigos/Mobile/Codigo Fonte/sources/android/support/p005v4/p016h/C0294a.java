package android.support.p005v4.p016h;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.h.a */
public class C0294a<K, V> extends C0319m<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0303h<K, V> f879a;

    public C0294a() {
    }

    public C0294a(int i) {
        super(i);
    }

    /* renamed from: b */
    private C0303h<K, V> m1304b() {
        if (this.f879a == null) {
            this.f879a = new C0303h<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1250a() {
                    return C0294a.this.f938h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1251a(Object obj) {
                    return C0294a.this.mo1370a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1252a(int i, int i2) {
                    return C0294a.this.f937g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public V mo1253a(int i, V v) {
                    return C0294a.this.mo1372a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1254a(int i) {
                    C0294a.this.mo1380d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1255a(K k, V v) {
                    C0294a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1256b(Object obj) {
                    return C0294a.this.mo1374b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<K, V> mo1257b() {
                    return C0294a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1258c() {
                    C0294a.this.clear();
                }
            };
        }
        return this.f879a;
    }

    /* renamed from: a */
    public boolean mo1245a(Collection<?> collection) {
        return C0303h.m1362c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m1304b().mo1303d();
    }

    public Set<K> keySet() {
        return m1304b().mo1304e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo1373a(this.f938h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m1304b().mo1305f();
    }
}
