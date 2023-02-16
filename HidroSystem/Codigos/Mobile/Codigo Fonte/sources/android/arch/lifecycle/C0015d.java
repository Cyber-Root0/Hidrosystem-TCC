package android.arch.lifecycle;

import android.arch.lifecycle.C0011b;
import android.arch.p000a.p001a.C0000a;
import android.arch.p000a.p001a.C0001b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.lifecycle.d */
public class C0015d extends C0011b {

    /* renamed from: a */
    private C0000a<Object, C0017a> f27a = new C0000a<>();

    /* renamed from: b */
    private C0011b.C0013b f28b;

    /* renamed from: c */
    private final C0014c f29c;

    /* renamed from: d */
    private int f30d = 0;

    /* renamed from: e */
    private boolean f31e = false;

    /* renamed from: f */
    private boolean f32f = false;

    /* renamed from: g */
    private ArrayList<C0011b.C0013b> f33g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.d$a */
    static class C0017a {

        /* renamed from: a */
        C0011b.C0013b f36a;

        /* renamed from: b */
        C0010a f37b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28a(C0014c cVar, C0011b.C0012a aVar) {
            C0011b.C0013b b = C0015d.m24b(aVar);
            this.f36a = C0015d.m22a(this.f36a, b);
            this.f37b.mo22a(cVar, aVar);
            this.f36a = b;
        }
    }

    public C0015d(C0014c cVar) {
        this.f29c = cVar;
        this.f28b = C0011b.C0013b.INITIALIZED;
    }

    /* renamed from: a */
    static C0011b.C0013b m22a(C0011b.C0013b bVar, C0011b.C0013b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private boolean m23a() {
        if (this.f27a.mo2a() == 0) {
            return true;
        }
        C0011b.C0013b bVar = this.f27a.mo5d().getValue().f36a;
        C0011b.C0013b bVar2 = this.f27a.mo6e().getValue().f36a;
        return bVar == bVar2 && this.f28b == bVar2;
    }

    /* renamed from: b */
    static C0011b.C0013b m24b(C0011b.C0012a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0011b.C0013b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0011b.C0013b.STARTED;
            case ON_RESUME:
                return C0011b.C0013b.RESUMED;
            case ON_DESTROY:
                return C0011b.C0013b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: b */
    private void m25b() {
        ArrayList<C0011b.C0013b> arrayList = this.f33g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: b */
    private void m26b(C0011b.C0013b bVar) {
        this.f33g.add(bVar);
    }

    /* renamed from: c */
    private static C0011b.C0012a m27c(C0011b.C0013b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0011b.C0012a.ON_DESTROY;
            case STARTED:
                return C0011b.C0012a.ON_STOP;
            case RESUMED:
                return C0011b.C0012a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: c */
    private void m28c() {
        C0001b<K, V>.d c = this.f27a.mo4c();
        while (c.hasNext() && !this.f32f) {
            Map.Entry entry = (Map.Entry) c.next();
            C0017a aVar = (C0017a) entry.getValue();
            while (aVar.f36a.compareTo(this.f28b) < 0 && !this.f32f && this.f27a.mo1a(entry.getKey())) {
                m26b(aVar.f36a);
                aVar.mo28a(this.f29c, m29d(aVar.f36a));
                m25b();
            }
        }
    }

    /* renamed from: d */
    private static C0011b.C0012a m29d(C0011b.C0013b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0011b.C0012a.ON_CREATE;
            case CREATED:
                return C0011b.C0012a.ON_START;
            case STARTED:
                return C0011b.C0012a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: d */
    private void m30d() {
        Iterator<Map.Entry<Object, C0017a>> b = this.f27a.mo3b();
        while (b.hasNext() && !this.f32f) {
            Map.Entry next = b.next();
            C0017a aVar = (C0017a) next.getValue();
            while (aVar.f36a.compareTo(this.f28b) > 0 && !this.f32f && this.f27a.mo1a(next.getKey())) {
                C0011b.C0012a c = m27c(aVar.f36a);
                m26b(m24b(c));
                aVar.mo28a(this.f29c, c);
                m25b();
            }
        }
    }

    /* renamed from: e */
    private void m31e() {
        while (!m23a()) {
            this.f32f = false;
            if (this.f28b.compareTo(this.f27a.mo5d().getValue().f36a) < 0) {
                m30d();
            }
            Map.Entry<Object, C0017a> e = this.f27a.mo6e();
            if (!this.f32f && e != null && this.f28b.compareTo(e.getValue().f36a) > 0) {
                m28c();
            }
        }
        this.f32f = false;
    }

    /* renamed from: a */
    public void mo26a(C0011b.C0012a aVar) {
        this.f28b = m24b(aVar);
        if (this.f31e || this.f30d != 0) {
            this.f32f = true;
            return;
        }
        this.f31e = true;
        m31e();
        this.f31e = false;
    }

    /* renamed from: a */
    public void mo27a(C0011b.C0013b bVar) {
        this.f28b = bVar;
    }
}
