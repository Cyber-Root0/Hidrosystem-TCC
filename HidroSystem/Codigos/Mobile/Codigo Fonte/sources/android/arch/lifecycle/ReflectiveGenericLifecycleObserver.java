package android.arch.lifecycle;

import android.arch.lifecycle.C0011b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReflectiveGenericLifecycleObserver implements C0010a {

    /* renamed from: a */
    static final Map<Class, C0008a> f14a = new HashMap();

    /* renamed from: b */
    private final Object f15b;

    /* renamed from: c */
    private final C0008a f16c = m13a(this.f15b.getClass());

    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a */
    static class C0008a {

        /* renamed from: a */
        final Map<C0011b.C0012a, List<C0009b>> f17a = new HashMap();

        /* renamed from: b */
        final Map<C0009b, C0011b.C0012a> f18b;

        C0008a(Map<C0009b, C0011b.C0012a> map) {
            this.f18b = map;
            for (Map.Entry next : map.entrySet()) {
                C0011b.C0012a aVar = (C0011b.C0012a) next.getValue();
                List list = this.f17a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f17a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }
    }

    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$b */
    static class C0009b {

        /* renamed from: a */
        final int f19a;

        /* renamed from: b */
        final Method f20b;

        C0009b(int i, Method method) {
            this.f19a = i;
            this.f20b = method;
            this.f20b.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0009b bVar = (C0009b) obj;
            return this.f19a == bVar.f19a && this.f20b.getName().equals(bVar.f20b.getName());
        }

        public int hashCode() {
            return (this.f19a * 31) + this.f20b.getName().hashCode();
        }
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f15b = obj;
    }

    /* renamed from: a */
    private static C0008a m13a(Class cls) {
        C0008a aVar = f14a.get(cls);
        return aVar != null ? aVar : m18b(cls);
    }

    /* renamed from: a */
    private void m14a(C0008a aVar, C0014c cVar, C0011b.C0012a aVar2) {
        m16a(aVar.f17a.get(aVar2), cVar, aVar2);
        m16a(aVar.f17a.get(C0011b.C0012a.ON_ANY), cVar, aVar2);
    }

    /* renamed from: a */
    private void m15a(C0009b bVar, C0014c cVar, C0011b.C0012a aVar) {
        try {
            switch (bVar.f19a) {
                case 0:
                    bVar.f20b.invoke(this.f15b, new Object[0]);
                    return;
                case 1:
                    bVar.f20b.invoke(this.f15b, new Object[]{cVar});
                    return;
                case 2:
                    bVar.f20b.invoke(this.f15b, new Object[]{cVar, aVar});
                    return;
                default:
                    return;
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Failed to call observer method", e.getCause());
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    private void m16a(List<C0009b> list, C0014c cVar, C0011b.C0012a aVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m15a(list.get(size), cVar, aVar);
            }
        }
    }

    /* renamed from: a */
    private static void m17a(Map<C0009b, C0011b.C0012a> map, C0009b bVar, C0011b.C0012a aVar, Class cls) {
        C0011b.C0012a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f20b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: b */
    private static C0008a m18b(Class cls) {
        int i;
        C0008a a;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a = m13a(superclass)) == null)) {
            hashMap.putAll(a.f18b);
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Class a2 : cls.getInterfaces()) {
            for (Map.Entry next : m13a(a2).f18b.entrySet()) {
                m17a(hashMap, (C0009b) next.getKey(), (C0011b.C0012a) next.getValue(), cls);
            }
        }
        for (Method method : declaredMethods) {
            C0019f fVar = (C0019f) method.getAnnotation(C0019f.class);
            if (fVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0014c.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0011b.C0012a a3 = fVar.mo30a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0011b.C0012a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a3 == C0011b.C0012a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m17a(hashMap, new C0009b(i, method), a3, cls);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0008a aVar = new C0008a(hashMap);
        f14a.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo22a(C0014c cVar, C0011b.C0012a aVar) {
        m14a(this.f16c, cVar, aVar);
    }
}
