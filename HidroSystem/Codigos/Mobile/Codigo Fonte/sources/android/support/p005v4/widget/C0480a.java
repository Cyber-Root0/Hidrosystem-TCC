package android.support.p005v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p005v4.p017i.C0388q;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0480a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f1267r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0481a f1268a = new C0481a();

    /* renamed from: b */
    final View f1269b;

    /* renamed from: c */
    boolean f1270c;

    /* renamed from: d */
    boolean f1271d;

    /* renamed from: e */
    boolean f1272e;

    /* renamed from: f */
    private final Interpolator f1273f = new AccelerateInterpolator();

    /* renamed from: g */
    private Runnable f1274g;

    /* renamed from: h */
    private float[] f1275h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f1276i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f1277j;

    /* renamed from: k */
    private int f1278k;

    /* renamed from: l */
    private float[] f1279l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f1280m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f1281n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f1282o;

    /* renamed from: p */
    private boolean f1283p;

    /* renamed from: q */
    private boolean f1284q;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0481a {

        /* renamed from: a */
        private int f1285a;

        /* renamed from: b */
        private int f1286b;

        /* renamed from: c */
        private float f1287c;

        /* renamed from: d */
        private float f1288d;

        /* renamed from: e */
        private long f1289e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1290f = 0;

        /* renamed from: g */
        private int f1291g = 0;

        /* renamed from: h */
        private int f1292h = 0;

        /* renamed from: i */
        private long f1293i = -1;

        /* renamed from: j */
        private float f1294j;

        /* renamed from: k */
        private int f1295k;

        C0481a() {
        }

        /* renamed from: a */
        private float m2247a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m2248a(long j) {
            if (j < this.f1289e) {
                return 0.0f;
            }
            long j2 = this.f1293i;
            if (j2 < 0 || j < j2) {
                return C0480a.m2225a(((float) (j - this.f1289e)) / ((float) this.f1285a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1294j;
            return (1.0f - f) + (f * C0480a.m2225a(((float) j3) / ((float) this.f1295k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void mo2063a() {
            this.f1289e = AnimationUtils.currentAnimationTimeMillis();
            this.f1293i = -1;
            this.f1290f = this.f1289e;
            this.f1294j = 0.5f;
            this.f1291g = 0;
            this.f1292h = 0;
        }

        /* renamed from: a */
        public void mo2064a(float f, float f2) {
            this.f1287c = f;
            this.f1288d = f2;
        }

        /* renamed from: a */
        public void mo2065a(int i) {
            this.f1285a = i;
        }

        /* renamed from: b */
        public void mo2066b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1295k = C0480a.m2228a((int) (currentAnimationTimeMillis - this.f1289e), 0, this.f1286b);
            this.f1294j = m2248a(currentAnimationTimeMillis);
            this.f1293i = currentAnimationTimeMillis;
        }

        /* renamed from: b */
        public void mo2067b(int i) {
            this.f1286b = i;
        }

        /* renamed from: c */
        public boolean mo2068c() {
            return this.f1293i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1293i + ((long) this.f1295k);
        }

        /* renamed from: d */
        public void mo2069d() {
            if (this.f1290f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m2247a(m2248a(currentAnimationTimeMillis));
                this.f1290f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f1290f)) * a;
                this.f1291g = (int) (this.f1287c * f);
                this.f1292h = (int) (f * this.f1288d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: e */
        public int mo2070e() {
            float f = this.f1287c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo2071f() {
            float f = this.f1288d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public int mo2072g() {
            return this.f1291g;
        }

        /* renamed from: h */
        public int mo2073h() {
            return this.f1292h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0482b implements Runnable {
        C0482b() {
        }

        public void run() {
            if (C0480a.this.f1272e) {
                if (C0480a.this.f1270c) {
                    C0480a aVar = C0480a.this;
                    aVar.f1270c = false;
                    aVar.f1268a.mo2063a();
                }
                C0481a aVar2 = C0480a.this.f1268a;
                if (aVar2.mo2068c() || !C0480a.this.mo2051a()) {
                    C0480a.this.f1272e = false;
                    return;
                }
                if (C0480a.this.f1271d) {
                    C0480a aVar3 = C0480a.this;
                    aVar3.f1271d = false;
                    aVar3.mo2054b();
                }
                aVar2.mo2069d();
                C0480a.this.mo2050a(aVar2.mo2072g(), aVar2.mo2073h());
                C0388q.m1647a(C0480a.this.f1269b, (Runnable) this);
            }
        }
    }

    public C0480a(View view) {
        this.f1269b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = (float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f));
        mo2047a(f, f);
        float f2 = (float) ((int) ((displayMetrics.density * 315.0f) + 0.5f));
        mo2052b(f2, f2);
        mo2048a(1);
        mo2059e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2057d(0.2f, 0.2f);
        mo2055c(1.0f, 1.0f);
        mo2053b(f1267r);
        mo2056c(500);
        mo2058d(500);
    }

    /* renamed from: a */
    static float m2225a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m2226a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m2225a(f * f2, 0.0f, f3);
        float f6 = m2231f(f2 - f4, a) - m2231f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1273f.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1273f.getInterpolation(f6);
        }
        return m2225a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m2227a(int i, float f, float f2, float f3) {
        float a = m2226a(this.f1275h[i], f2, this.f1276i[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1279l[i];
        float f5 = this.f1280m[i];
        float f6 = this.f1281n[i];
        float f7 = f4 * f3;
        return a > 0.0f ? m2225a(a * f7, f5, f6) : -m2225a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m2228a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m2229c() {
        int i;
        if (this.f1274g == null) {
            this.f1274g = new C0482b();
        }
        this.f1272e = true;
        this.f1270c = true;
        if (this.f1282o || (i = this.f1278k) <= 0) {
            this.f1274g.run();
        } else {
            C0388q.m1648a(this.f1269b, this.f1274g, (long) i);
        }
        this.f1282o = true;
    }

    /* renamed from: d */
    private void m2230d() {
        if (this.f1270c) {
            this.f1272e = false;
        } else {
            this.f1268a.mo2066b();
        }
    }

    /* renamed from: f */
    private float m2231f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1277j;
        switch (i) {
            case 0:
            case 1:
                if (f < f2) {
                    return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1272e || i != 1) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
        }
    }

    /* renamed from: a */
    public C0480a mo2047a(float f, float f2) {
        float[] fArr = this.f1281n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0480a mo2048a(int i) {
        this.f1277j = i;
        return this;
    }

    /* renamed from: a */
    public C0480a mo2049a(boolean z) {
        if (this.f1283p && !z) {
            m2230d();
        }
        this.f1283p = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo2050a(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2051a() {
        C0481a aVar = this.f1268a;
        int f = aVar.mo2071f();
        int e = aVar.mo2070e();
        return (f != 0 && mo2061f(f)) || (e != 0 && mo2060e(e));
    }

    /* renamed from: b */
    public C0480a mo2052b(float f, float f2) {
        float[] fArr = this.f1280m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0480a mo2053b(int i) {
        this.f1278k = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2054b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1269b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    public C0480a mo2055c(float f, float f2) {
        float[] fArr = this.f1279l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0480a mo2056c(int i) {
        this.f1268a.mo2065a(i);
        return this;
    }

    /* renamed from: d */
    public C0480a mo2057d(float f, float f2) {
        float[] fArr = this.f1275h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0480a mo2058d(int i) {
        this.f1268a.mo2067b(i);
        return this;
    }

    /* renamed from: e */
    public C0480a mo2059e(float f, float f2) {
        float[] fArr = this.f1276i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: e */
    public abstract boolean mo2060e(int i);

    /* renamed from: f */
    public abstract boolean mo2061f(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f1283p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1271d = true;
                this.f1282o = false;
                break;
            case 1:
            case 3:
                m2230d();
                break;
            case 2:
                break;
        }
        this.f1268a.mo2064a(m2227a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1269b.getWidth()), m2227a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1269b.getHeight()));
        if (!this.f1272e && mo2051a()) {
            m2229c();
        }
        return this.f1284q && this.f1272e;
    }
}
