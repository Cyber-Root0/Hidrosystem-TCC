package android.support.p005v4.p015g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.g.c */
public class C0288c {

    /* renamed from: a */
    private final Object f858a = new Object();

    /* renamed from: b */
    private HandlerThread f859b;

    /* renamed from: c */
    private Handler f860c;

    /* renamed from: d */
    private int f861d;

    /* renamed from: e */
    private Handler.Callback f862e = new Handler.Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0288c.this.m1296a();
                    return true;
                case 1:
                    C0288c.this.m1300b((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: f */
    private final int f863f;

    /* renamed from: g */
    private final int f864g;

    /* renamed from: h */
    private final String f865h;

    /* renamed from: android.support.v4.g.c$a */
    public interface C0293a<T> {
        /* renamed from: a */
        void mo1228a(T t);
    }

    public C0288c(String str, int i, int i2) {
        this.f865h = str;
        this.f864g = i;
        this.f863f = i2;
        this.f861d = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1296a() {
        synchronized (this.f858a) {
            if (!this.f860c.hasMessages(1)) {
                this.f859b.quit();
                this.f859b = null;
                this.f860c = null;
            }
        }
    }

    /* renamed from: a */
    private void m1299a(Runnable runnable) {
        synchronized (this.f858a) {
            if (this.f859b == null) {
                this.f859b = new HandlerThread(this.f865h, this.f864g);
                this.f859b.start();
                this.f860c = new Handler(this.f859b.getLooper(), this.f862e);
                this.f861d++;
            }
            this.f860c.removeMessages(0);
            this.f860c.sendMessage(this.f860c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1300b(Runnable runnable) {
        runnable.run();
        synchronized (this.f858a) {
            this.f860c.removeMessages(0);
            this.f860c.sendMessageDelayed(this.f860c.obtainMessage(0), (long) this.f863f);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo1239a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            android.support.v4.g.c$3 r11 = new android.support.v4.g.c$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m1299a((java.lang.Runnable) r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p015g.C0288c.mo1239a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* renamed from: a */
    public <T> void mo1240a(final Callable<T> callable, final C0293a<T> aVar) {
        final Handler handler = new Handler();
        m1299a((Runnable) new Runnable() {
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    public void run() {
                        aVar.mo1228a(obj);
                    }
                });
            }
        });
    }
}
