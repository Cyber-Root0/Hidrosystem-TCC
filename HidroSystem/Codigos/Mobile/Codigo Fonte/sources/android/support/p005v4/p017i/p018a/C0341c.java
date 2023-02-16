package android.support.p005v4.p017i.p018a;

import android.os.Build;
import android.os.Bundle;
import android.support.p005v4.p017i.p018a.C0348d;
import android.support.p005v4.p017i.p018a.C0351e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.i.a.c */
public class C0341c {

    /* renamed from: a */
    private static final C0342a f983a = (Build.VERSION.SDK_INT >= 19 ? new C0345c() : Build.VERSION.SDK_INT >= 16 ? new C0343b() : new C0347d());

    /* renamed from: b */
    private final Object f984b;

    /* renamed from: android.support.v4.i.a.c$a */
    interface C0342a {
        /* renamed from: a */
        Object mo1484a(C0341c cVar);
    }

    /* renamed from: android.support.v4.i.a.c$b */
    private static class C0343b extends C0347d {
        C0343b() {
        }

        /* renamed from: a */
        public Object mo1484a(final C0341c cVar) {
            return C0348d.m1531a(new C0348d.C0350a() {
                /* renamed from: a */
                public Object mo1485a(int i) {
                    C0328b a = cVar.mo1479a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.mo1412a();
                }

                /* renamed from: a */
                public List<Object> mo1486a(String str, int i) {
                    List<C0328b> a = cVar.mo1481a(str, i);
                    if (a == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(a.get(i2).mo1412a());
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public boolean mo1487a(int i, int i2, Bundle bundle) {
                    return cVar.mo1482a(i, i2, bundle);
                }
            });
        }
    }

    /* renamed from: android.support.v4.i.a.c$c */
    private static class C0345c extends C0347d {
        C0345c() {
        }

        /* renamed from: a */
        public Object mo1484a(final C0341c cVar) {
            return C0351e.m1535a(new C0351e.C0353a() {
                /* renamed from: a */
                public Object mo1488a(int i) {
                    C0328b a = cVar.mo1479a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.mo1412a();
                }

                /* renamed from: a */
                public List<Object> mo1489a(String str, int i) {
                    List<C0328b> a = cVar.mo1481a(str, i);
                    if (a == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(a.get(i2).mo1412a());
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public boolean mo1490a(int i, int i2, Bundle bundle) {
                    return cVar.mo1482a(i, i2, bundle);
                }

                /* renamed from: b */
                public Object mo1491b(int i) {
                    C0328b b = cVar.mo1483b(i);
                    if (b == null) {
                        return null;
                    }
                    return b.mo1412a();
                }
            });
        }
    }

    /* renamed from: android.support.v4.i.a.c$d */
    static class C0347d implements C0342a {
        C0347d() {
        }

        /* renamed from: a */
        public Object mo1484a(C0341c cVar) {
            return null;
        }
    }

    public C0341c() {
        this.f984b = f983a.mo1484a(this);
    }

    public C0341c(Object obj) {
        this.f984b = obj;
    }

    /* renamed from: a */
    public C0328b mo1479a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo1480a() {
        return this.f984b;
    }

    /* renamed from: a */
    public List<C0328b> mo1481a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo1482a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0328b mo1483b(int i) {
        return null;
    }
}
