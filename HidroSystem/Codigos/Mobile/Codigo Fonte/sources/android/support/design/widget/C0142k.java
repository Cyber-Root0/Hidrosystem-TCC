package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.k */
class C0142k {

    /* renamed from: a */
    private static C0142k f445a;

    /* renamed from: b */
    private final Object f446b = new Object();

    /* renamed from: c */
    private final Handler f447c = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0142k.this.mo669a((C0145b) message.obj);
            return true;
        }
    });

    /* renamed from: d */
    private C0145b f448d;

    /* renamed from: e */
    private C0145b f449e;

    /* renamed from: android.support.design.widget.k$a */
    interface C0144a {
        /* renamed from: a */
        void mo675a();

        /* renamed from: a */
        void mo676a(int i);
    }

    /* renamed from: android.support.design.widget.k$b */
    private static class C0145b {

        /* renamed from: a */
        final WeakReference<C0144a> f451a;

        /* renamed from: b */
        int f452b;

        /* renamed from: c */
        boolean f453c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo677a(C0144a aVar) {
            return aVar != null && this.f451a.get() == aVar;
        }
    }

    private C0142k() {
    }

    /* renamed from: a */
    static C0142k m567a() {
        if (f445a == null) {
            f445a = new C0142k();
        }
        return f445a;
    }

    /* renamed from: a */
    private boolean m568a(C0145b bVar, int i) {
        C0144a aVar = (C0144a) bVar.f451a.get();
        if (aVar == null) {
            return false;
        }
        this.f447c.removeCallbacksAndMessages(bVar);
        aVar.mo676a(i);
        return true;
    }

    /* renamed from: b */
    private void m569b() {
        C0145b bVar = this.f449e;
        if (bVar != null) {
            this.f448d = bVar;
            this.f449e = null;
            C0144a aVar = (C0144a) this.f448d.f451a.get();
            if (aVar != null) {
                aVar.mo675a();
            } else {
                this.f448d = null;
            }
        }
    }

    /* renamed from: b */
    private void m570b(C0145b bVar) {
        if (bVar.f452b != -2) {
            int i = 2750;
            if (bVar.f452b > 0) {
                i = bVar.f452b;
            } else if (bVar.f452b == -1) {
                i = 1500;
            }
            this.f447c.removeCallbacksAndMessages(bVar);
            Handler handler = this.f447c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    /* renamed from: f */
    private boolean m571f(C0144a aVar) {
        C0145b bVar = this.f448d;
        return bVar != null && bVar.mo677a(aVar);
    }

    /* renamed from: g */
    private boolean m572g(C0144a aVar) {
        C0145b bVar = this.f449e;
        return bVar != null && bVar.mo677a(aVar);
    }

    /* renamed from: a */
    public void mo667a(C0144a aVar) {
        synchronized (this.f446b) {
            if (m571f(aVar)) {
                this.f448d = null;
                if (this.f449e != null) {
                    m569b();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo668a(C0144a aVar, int i) {
        C0145b bVar;
        synchronized (this.f446b) {
            if (m571f(aVar)) {
                bVar = this.f448d;
            } else if (m572g(aVar)) {
                bVar = this.f449e;
            }
            m568a(bVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo669a(C0145b bVar) {
        synchronized (this.f446b) {
            if (this.f448d == bVar || this.f449e == bVar) {
                m568a(bVar, 2);
            }
        }
    }

    /* renamed from: b */
    public void mo670b(C0144a aVar) {
        synchronized (this.f446b) {
            if (m571f(aVar)) {
                m570b(this.f448d);
            }
        }
    }

    /* renamed from: c */
    public void mo671c(C0144a aVar) {
        synchronized (this.f446b) {
            if (m571f(aVar) && !this.f448d.f453c) {
                this.f448d.f453c = true;
                this.f447c.removeCallbacksAndMessages(this.f448d);
            }
        }
    }

    /* renamed from: d */
    public void mo672d(C0144a aVar) {
        synchronized (this.f446b) {
            if (m571f(aVar) && this.f448d.f453c) {
                this.f448d.f453c = false;
                m570b(this.f448d);
            }
        }
    }

    /* renamed from: e */
    public boolean mo673e(C0144a aVar) {
        boolean z;
        synchronized (this.f446b) {
            if (!m571f(aVar)) {
                if (!m572g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
