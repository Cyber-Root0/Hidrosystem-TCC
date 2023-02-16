package android.support.p020v7.widget;

import android.support.p005v4.p016h.C0294a;
import android.support.p005v4.p016h.C0301f;
import android.support.p005v4.p016h.C0314k;
import android.support.p020v7.widget.C0787av;

/* renamed from: android.support.v7.widget.bp */
class C0863bp {

    /* renamed from: a */
    final C0294a<C0787av.C0826w, C0864a> f2928a = new C0294a<>();

    /* renamed from: b */
    final C0301f<C0787av.C0826w> f2929b = new C0301f<>();

    /* renamed from: android.support.v7.widget.bp$a */
    static class C0864a {

        /* renamed from: d */
        static C0314k.C0315a<C0864a> f2930d = new C0314k.C0316b(20);

        /* renamed from: a */
        int f2931a;

        /* renamed from: b */
        C0787av.C0798e.C0801c f2932b;

        /* renamed from: c */
        C0787av.C0798e.C0801c f2933c;

        private C0864a() {
        }

        /* renamed from: a */
        static C0864a m4735a() {
            C0864a a = f2930d.mo1367a();
            return a == null ? new C0864a() : a;
        }

        /* renamed from: a */
        static void m4736a(C0864a aVar) {
            aVar.f2931a = 0;
            aVar.f2932b = null;
            aVar.f2933c = null;
            f2930d.mo1368a(aVar);
        }

        /* renamed from: b */
        static void m4737b() {
            do {
            } while (f2930d.mo1367a() != null);
        }
    }

    /* renamed from: android.support.v7.widget.bp$b */
    interface C0865b {
        /* renamed from: a */
        void mo3910a(C0787av.C0826w wVar);

        /* renamed from: a */
        void mo3911a(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2);

        /* renamed from: b */
        void mo3912b(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2);

        /* renamed from: c */
        void mo3913c(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar, C0787av.C0798e.C0801c cVar2);
    }

    C0863bp() {
    }

    /* renamed from: a */
    private C0787av.C0798e.C0801c m4718a(C0787av.C0826w wVar, int i) {
        C0864a c;
        C0787av.C0798e.C0801c cVar;
        int a = this.f2928a.mo1370a((Object) wVar);
        if (a < 0 || (c = this.f2928a.mo1376c(a)) == null || (c.f2931a & i) == 0) {
            return null;
        }
        c.f2931a &= i ^ -1;
        if (i == 4) {
            cVar = c.f2932b;
        } else if (i == 8) {
            cVar = c.f2933c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((c.f2931a & 12) == 0) {
            this.f2928a.mo1380d(a);
            C0864a.m4736a(c);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0787av.C0826w mo4332a(long j) {
        return this.f2929b.mo1283a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4333a() {
        this.f2928a.clear();
        this.f2929b.mo1291c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4334a(long j, C0787av.C0826w wVar) {
        this.f2929b.mo1289b(j, wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4335a(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar) {
        C0864a aVar = this.f2928a.get(wVar);
        if (aVar == null) {
            aVar = C0864a.m4735a();
            this.f2928a.put(wVar, aVar);
        }
        aVar.f2932b = cVar;
        aVar.f2931a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4336a(C0865b bVar) {
        C0787av.C0798e.C0801c cVar;
        C0787av.C0798e.C0801c cVar2;
        for (int size = this.f2928a.size() - 1; size >= 0; size--) {
            C0787av.C0826w b = this.f2928a.mo1375b(size);
            C0864a d = this.f2928a.mo1380d(size);
            if ((d.f2931a & 3) != 3) {
                if ((d.f2931a & 1) == 0) {
                    if ((d.f2931a & 14) != 14) {
                        if ((d.f2931a & 12) == 12) {
                            bVar.mo3913c(b, d.f2932b, d.f2933c);
                        } else if ((d.f2931a & 4) != 0) {
                            cVar = d.f2932b;
                            cVar2 = null;
                        } else if ((d.f2931a & 8) == 0) {
                            int i = d.f2931a;
                        }
                        C0864a.m4736a(d);
                    }
                    bVar.mo3912b(b, d.f2932b, d.f2933c);
                    C0864a.m4736a(d);
                } else if (d.f2932b != null) {
                    cVar = d.f2932b;
                    cVar2 = d.f2933c;
                }
                bVar.mo3911a(b, cVar, cVar2);
                C0864a.m4736a(d);
            }
            bVar.mo3910a(b);
            C0864a.m4736a(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4337a(C0787av.C0826w wVar) {
        C0864a aVar = this.f2928a.get(wVar);
        return (aVar == null || (aVar.f2931a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0787av.C0798e.C0801c mo4338b(C0787av.C0826w wVar) {
        return m4718a(wVar, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4339b() {
        C0864a.m4737b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4340b(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar) {
        C0864a aVar = this.f2928a.get(wVar);
        if (aVar == null) {
            aVar = C0864a.m4735a();
            this.f2928a.put(wVar, aVar);
        }
        aVar.f2931a |= 2;
        aVar.f2932b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0787av.C0798e.C0801c mo4341c(C0787av.C0826w wVar) {
        return m4718a(wVar, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4342c(C0787av.C0826w wVar, C0787av.C0798e.C0801c cVar) {
        C0864a aVar = this.f2928a.get(wVar);
        if (aVar == null) {
            aVar = C0864a.m4735a();
            this.f2928a.put(wVar, aVar);
        }
        aVar.f2933c = cVar;
        aVar.f2931a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4343d(C0787av.C0826w wVar) {
        C0864a aVar = this.f2928a.get(wVar);
        return (aVar == null || (aVar.f2931a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4344e(C0787av.C0826w wVar) {
        C0864a aVar = this.f2928a.get(wVar);
        if (aVar == null) {
            aVar = C0864a.m4735a();
            this.f2928a.put(wVar, aVar);
        }
        aVar.f2931a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4345f(C0787av.C0826w wVar) {
        C0864a aVar = this.f2928a.get(wVar);
        if (aVar != null) {
            aVar.f2931a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4346g(C0787av.C0826w wVar) {
        int b = this.f2929b.mo1286b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (wVar == this.f2929b.mo1290c(b)) {
                this.f2929b.mo1285a(b);
                break;
            } else {
                b--;
            }
        }
        C0864a remove = this.f2928a.remove(wVar);
        if (remove != null) {
            C0864a.m4736a(remove);
        }
    }

    /* renamed from: h */
    public void mo4347h(C0787av.C0826w wVar) {
        mo4345f(wVar);
    }
}
