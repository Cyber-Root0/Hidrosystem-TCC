package android.support.design.widget;

import android.support.p005v4.p016h.C0314k;
import android.support.p005v4.p016h.C0319m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.design.widget.d */
final class C0126d<T> {

    /* renamed from: a */
    private final C0314k.C0315a<ArrayList<T>> f375a = new C0314k.C0316b(10);

    /* renamed from: b */
    private final C0319m<T, ArrayList<T>> f376b = new C0319m<>();

    /* renamed from: c */
    private final ArrayList<T> f377c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f378d = new HashSet<>();

    C0126d() {
    }

    /* renamed from: a */
    private void m479a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f376b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m479a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m480a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f375a.mo1368a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m481c() {
        ArrayList<T> a = this.f375a.mo1367a();
        return a == null ? new ArrayList<>() : a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo611a() {
        int size = this.f376b.size();
        for (int i = 0; i < size; i++) {
            ArrayList c = this.f376b.mo1376c(i);
            if (c != null) {
                m480a(c);
            }
        }
        this.f376b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo612a(T t) {
        if (!this.f376b.containsKey(t)) {
            this.f376b.put(t, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo613a(T t, T t2) {
        if (!this.f376b.containsKey(t) || !this.f376b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f376b.get(t);
        if (arrayList == null) {
            arrayList = m481c();
            this.f376b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<T> mo614b() {
        this.f377c.clear();
        this.f378d.clear();
        int size = this.f376b.size();
        for (int i = 0; i < size; i++) {
            m479a(this.f376b.mo1375b(i), this.f377c, this.f378d);
        }
        return this.f377c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo615b(T t) {
        return this.f376b.containsKey(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List mo616c(T t) {
        return this.f376b.get(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<T> mo617d(T t) {
        int size = this.f376b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList c = this.f376b.mo1376c(i);
            if (c != null && c.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f376b.mo1375b(i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo618e(T t) {
        int size = this.f376b.size();
        for (int i = 0; i < size; i++) {
            ArrayList c = this.f376b.mo1376c(i);
            if (c != null && c.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
