package android.support.p005v4.widget;

import android.content.Context;
import android.support.p005v4.p017i.C0388q;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.p */
public class C0522p {

    /* renamed from: v */
    private static final Interpolator f1362v = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f1363a;

    /* renamed from: b */
    private int f1364b;

    /* renamed from: c */
    private int f1365c = -1;

    /* renamed from: d */
    private float[] f1366d;

    /* renamed from: e */
    private float[] f1367e;

    /* renamed from: f */
    private float[] f1368f;

    /* renamed from: g */
    private float[] f1369g;

    /* renamed from: h */
    private int[] f1370h;

    /* renamed from: i */
    private int[] f1371i;

    /* renamed from: j */
    private int[] f1372j;

    /* renamed from: k */
    private int f1373k;

    /* renamed from: l */
    private VelocityTracker f1374l;

    /* renamed from: m */
    private float f1375m;

    /* renamed from: n */
    private float f1376n;

    /* renamed from: o */
    private int f1377o;

    /* renamed from: p */
    private int f1378p;

    /* renamed from: q */
    private OverScroller f1379q;

    /* renamed from: r */
    private final C0525a f1380r;

    /* renamed from: s */
    private View f1381s;

    /* renamed from: t */
    private boolean f1382t;

    /* renamed from: u */
    private final ViewGroup f1383u;

    /* renamed from: w */
    private final Runnable f1384w = new Runnable() {
        public void run() {
            C0522p.this.mo2187c(0);
        }
    };

    /* renamed from: android.support.v4.widget.p$a */
    public static abstract class C0525a {
        /* renamed from: a */
        public int mo367a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo368a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo369a(int i) {
        }

        /* renamed from: a */
        public void mo1919a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo370a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo371a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo372a(View view, int i);

        /* renamed from: b */
        public int mo563b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo373b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo1922b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo564b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo1923b(int i) {
            return false;
        }

        /* renamed from: c */
        public int mo2195c(int i) {
            return i;
        }
    }

    private C0522p(Context context, ViewGroup viewGroup, C0525a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f1383u = viewGroup;
            this.f1380r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1377o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1364b = viewConfiguration.getScaledTouchSlop();
            this.f1375m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1376n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1379q = new OverScroller(context, f1362v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m2376a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: a */
    private int m2377a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f1383u.getWidth();
        float f = (float) (width / 2);
        float b = f + (m2386b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: a */
    private int m2378a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m2387b(i3, (int) this.f1376n, (int) this.f1375m);
        int b2 = m2387b(i4, (int) this.f1376n, (int) this.f1375m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (b2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m2377a(i, b, this.f1380r.mo563b(view))) * f5) + (((float) m2377a(i2, b2, this.f1380r.mo367a(view))) * f6));
    }

    /* renamed from: a */
    public static C0522p m2379a(ViewGroup viewGroup, float f, C0525a aVar) {
        C0522p a = m2380a(viewGroup, aVar);
        a.f1364b = (int) (((float) a.f1364b) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C0522p m2380a(ViewGroup viewGroup, C0525a aVar) {
        return new C0522p(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m2381a(float f, float f2) {
        this.f1382t = true;
        this.f1380r.mo370a(this.f1381s, f, f2);
        this.f1382t = false;
        if (this.f1363a == 1) {
            mo2187c(0);
        }
    }

    /* renamed from: a */
    private void m2382a(float f, float f2, int i) {
        m2394f(i);
        float[] fArr = this.f1366d;
        this.f1368f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1367e;
        this.f1369g[i] = f2;
        fArr2[i] = f2;
        this.f1370h[i] = m2391e((int) f, (int) f2);
        this.f1373k |= 1 << i;
    }

    /* renamed from: a */
    private boolean m2383a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1370h[i] & i2) != i2 || (this.f1378p & i2) == 0 || (this.f1372j[i] & i2) == i2 || (this.f1371i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f1364b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f1380r.mo1923b(i2)) {
            return (this.f1371i[i] & i2) == 0 && abs > ((float) this.f1364b);
        }
        int[] iArr = this.f1372j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m2384a(int i, int i2, int i3, int i4) {
        int left = this.f1381s.getLeft();
        int top = this.f1381s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1379q.abortAnimation();
            mo2187c(0);
            return false;
        }
        this.f1379q.startScroll(left, top, i5, i6, m2378a(this.f1381s, i5, i6, i3, i4));
        mo2187c(2);
        return true;
    }

    /* renamed from: a */
    private boolean m2385a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1380r.mo563b(view) > 0;
        boolean z2 = this.f1380r.mo367a(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1364b) : z2 && Math.abs(f2) > ((float) this.f1364b);
        }
        int i = this.f1364b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: b */
    private float m2386b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: b */
    private int m2387b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: b */
    private void m2388b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2383a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2383a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2383a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2383a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1371i;
            iArr[i] = iArr[i] | i2;
            this.f1380r.mo1922b(i2, i);
        }
    }

    /* renamed from: b */
    private void m2389b(int i, int i2, int i3, int i4) {
        int left = this.f1381s.getLeft();
        int top = this.f1381s.getTop();
        if (i3 != 0) {
            i = this.f1380r.mo373b(this.f1381s, i, i3);
            C0388q.m1656c(this.f1381s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f1380r.mo368a(this.f1381s, i2, i4);
            C0388q.m1653b(this.f1381s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f1380r.mo371a(this.f1381s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    private void m2390c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2396g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1368f[pointerId] = x;
                this.f1369g[pointerId] = y;
            }
        }
    }

    /* renamed from: e */
    private int m2391e(int i, int i2) {
        int i3 = i < this.f1383u.getLeft() + this.f1377o ? 1 : 0;
        if (i2 < this.f1383u.getTop() + this.f1377o) {
            i3 |= 4;
        }
        if (i > this.f1383u.getRight() - this.f1377o) {
            i3 |= 2;
        }
        return i2 > this.f1383u.getBottom() - this.f1377o ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private void m2392e(int i) {
        if (this.f1366d != null && mo2182b(i)) {
            this.f1366d[i] = 0.0f;
            this.f1367e[i] = 0.0f;
            this.f1368f[i] = 0.0f;
            this.f1369g[i] = 0.0f;
            this.f1370h[i] = 0;
            this.f1371i[i] = 0;
            this.f1372j[i] = 0;
            this.f1373k = ((1 << i) ^ -1) & this.f1373k;
        }
    }

    /* renamed from: f */
    private void m2393f() {
        float[] fArr = this.f1366d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1367e, 0.0f);
            Arrays.fill(this.f1368f, 0.0f);
            Arrays.fill(this.f1369g, 0.0f);
            Arrays.fill(this.f1370h, 0);
            Arrays.fill(this.f1371i, 0);
            Arrays.fill(this.f1372j, 0);
            this.f1373k = 0;
        }
    }

    /* renamed from: f */
    private void m2394f(int i) {
        float[] fArr = this.f1366d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f1366d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f1367e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f1368f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f1369g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f1370h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1371i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1372j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1366d = fArr2;
            this.f1367e = fArr3;
            this.f1368f = fArr4;
            this.f1369g = fArr5;
            this.f1370h = iArr;
            this.f1371i = iArr2;
            this.f1372j = iArr3;
        }
    }

    /* renamed from: g */
    private void m2395g() {
        this.f1374l.computeCurrentVelocity(1000, this.f1375m);
        m2381a(m2376a(this.f1374l.getXVelocity(this.f1365c), this.f1376n, this.f1375m), m2376a(this.f1374l.getYVelocity(this.f1365c), this.f1376n, this.f1375m));
    }

    /* renamed from: g */
    private boolean m2396g(int i) {
        if (mo2182b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    public int mo2172a() {
        return this.f1363a;
    }

    /* renamed from: a */
    public void mo2173a(float f) {
        this.f1376n = f;
    }

    /* renamed from: a */
    public void mo2174a(int i) {
        this.f1378p = i;
    }

    /* renamed from: a */
    public void mo2175a(View view, int i) {
        if (view.getParent() == this.f1383u) {
            this.f1381s = view;
            this.f1365c = i;
            this.f1380r.mo564b(view, i);
            mo2187c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1383u + ")");
    }

    /* renamed from: a */
    public boolean mo2176a(int i, int i2) {
        if (this.f1382t) {
            return m2384a(i, i2, (int) this.f1374l.getXVelocity(this.f1365c), (int) this.f1374l.getYVelocity(this.f1365c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if (r12 != r11) goto L_0x00da;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2177a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo2192e()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f1374l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1374l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f1374l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            switch(r2) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00f3;
                case 2: goto L_0x0064;
                case 3: goto L_0x00f3;
                case 4: goto L_0x0025;
                case 5: goto L_0x0030;
                case 6: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            r5 = 0
            goto L_0x0129
        L_0x0028:
            int r1 = r1.getPointerId(r3)
            r0.m2392e(r1)
            goto L_0x0025
        L_0x0030:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m2382a((float) r7, (float) r1, (int) r2)
            int r3 = r0.f1363a
            if (r3 != 0) goto L_0x0054
            int[] r1 = r0.f1370h
            r1 = r1[r2]
            int r3 = r0.f1378p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0025
            android.support.v4.widget.p$a r4 = r0.f1380r
            r1 = r1 & r3
            r4.mo1919a((int) r1, (int) r2)
            goto L_0x0025
        L_0x0054:
            if (r3 != r4) goto L_0x0025
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo2190d(r3, r1)
            android.view.View r3 = r0.f1381s
            if (r1 != r3) goto L_0x0025
            r0.mo2184b((android.view.View) r1, (int) r2)
            goto L_0x0025
        L_0x0064:
            float[] r2 = r0.f1366d
            if (r2 == 0) goto L_0x0025
            float[] r2 = r0.f1367e
            if (r2 != 0) goto L_0x006d
            goto L_0x0025
        L_0x006d:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x0072:
            if (r3 >= r2) goto L_0x00ee
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m2396g(r4)
            if (r7 != 0) goto L_0x0080
            goto L_0x00eb
        L_0x0080:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f1366d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f1367e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo2190d(r7, r8)
            if (r7 == 0) goto L_0x00a4
            boolean r8 = r0.m2385a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00a4
            r8 = 1
            goto L_0x00a5
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            if (r8 == 0) goto L_0x00da
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.p$a r14 = r0.f1380r
            int r12 = r14.mo373b(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.p$a r5 = r0.f1380r
            int r5 = r5.mo368a((android.view.View) r7, (int) r15, (int) r14)
            android.support.v4.widget.p$a r14 = r0.f1380r
            int r14 = r14.mo563b((android.view.View) r7)
            android.support.v4.widget.p$a r15 = r0.f1380r
            int r15 = r15.mo367a((android.view.View) r7)
            if (r14 == 0) goto L_0x00d3
            if (r14 <= 0) goto L_0x00da
            if (r12 != r11) goto L_0x00da
        L_0x00d3:
            if (r15 == 0) goto L_0x00ee
            if (r15 <= 0) goto L_0x00da
            if (r5 != r13) goto L_0x00da
            goto L_0x00ee
        L_0x00da:
            r0.m2388b((float) r9, (float) r10, (int) r4)
            int r5 = r0.f1363a
            if (r5 != r6) goto L_0x00e2
            goto L_0x00ee
        L_0x00e2:
            if (r8 == 0) goto L_0x00eb
            boolean r4 = r0.mo2184b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            int r3 = r3 + 1
            goto L_0x0072
        L_0x00ee:
            r16.m2390c((android.view.MotionEvent) r17)
            goto L_0x0025
        L_0x00f3:
            r16.mo2192e()
            goto L_0x0025
        L_0x00f8:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m2382a((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo2190d(r2, r3)
            android.view.View r3 = r0.f1381s
            if (r2 != r3) goto L_0x0119
            int r3 = r0.f1363a
            if (r3 != r4) goto L_0x0119
            r0.mo2184b((android.view.View) r2, (int) r1)
        L_0x0119:
            int[] r2 = r0.f1370h
            r2 = r2[r1]
            int r3 = r0.f1378p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0129
            android.support.v4.widget.p$a r4 = r0.f1380r
            r2 = r2 & r3
            r4.mo1919a((int) r2, (int) r1)
        L_0x0129:
            int r1 = r0.f1363a
            if (r1 != r6) goto L_0x012e
            r5 = 1
        L_0x012e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.widget.C0522p.mo2177a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo2178a(View view, int i, int i2) {
        this.f1381s = view;
        this.f1365c = -1;
        boolean a = m2384a(i, i2, 0, 0);
        if (!a && this.f1363a == 0 && this.f1381s != null) {
            this.f1381s = null;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2179a(boolean z) {
        if (this.f1363a == 2) {
            boolean computeScrollOffset = this.f1379q.computeScrollOffset();
            int currX = this.f1379q.getCurrX();
            int currY = this.f1379q.getCurrY();
            int left = currX - this.f1381s.getLeft();
            int top = currY - this.f1381s.getTop();
            if (left != 0) {
                C0388q.m1656c(this.f1381s, left);
            }
            if (top != 0) {
                C0388q.m1653b(this.f1381s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1380r.mo371a(this.f1381s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1379q.getFinalX() && currY == this.f1379q.getFinalY()) {
                this.f1379q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1383u.post(this.f1384w);
                } else {
                    mo2187c(0);
                }
            }
        }
        return this.f1363a == 2;
    }

    /* renamed from: b */
    public int mo2180b() {
        return this.f1377o;
    }

    /* renamed from: b */
    public void mo2181b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo2192e();
        }
        if (this.f1374l == null) {
            this.f1374l = VelocityTracker.obtain();
        }
        this.f1374l.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View d = mo2190d((int) x, (int) y);
                m2382a(x, y, pointerId);
                mo2184b(d, pointerId);
                int i3 = this.f1370h[pointerId];
                int i4 = this.f1378p;
                if ((i3 & i4) != 0) {
                    this.f1380r.mo1919a(i3 & i4, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f1363a == 1) {
                    m2395g();
                    break;
                }
                break;
            case 2:
                if (this.f1363a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m2396g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f1366d[pointerId2];
                            float f2 = y2 - this.f1367e[pointerId2];
                            m2388b(f, f2, pointerId2);
                            if (this.f1363a != 1) {
                                View d2 = mo2190d((int) x2, (int) y2);
                                if (m2385a(d2, f, f2) && mo2184b(d2, pointerId2)) {
                                }
                            }
                        }
                        i2++;
                    }
                } else if (m2396g(this.f1365c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1365c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f1368f;
                    int i5 = this.f1365c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f1369g[i5]);
                    m2389b(this.f1381s.getLeft() + i6, this.f1381s.getTop() + i7, i6, i7);
                } else {
                    return;
                }
                m2390c(motionEvent);
                return;
            case 3:
                if (this.f1363a == 1) {
                    m2381a(0.0f, 0.0f);
                    break;
                }
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m2382a(x4, y4, pointerId3);
                if (this.f1363a == 0) {
                    mo2184b(mo2190d((int) x4, (int) y4), pointerId3);
                    int i8 = this.f1370h[pointerId3];
                    int i9 = this.f1378p;
                    if ((i8 & i9) != 0) {
                        this.f1380r.mo1919a(i8 & i9, pointerId3);
                        return;
                    }
                    return;
                } else if (mo2188c((int) x4, (int) y4)) {
                    mo2184b(this.f1381s, pointerId3);
                    return;
                } else {
                    return;
                }
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f1363a == 1 && pointerId4 == this.f1365c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f1365c) {
                                View d3 = mo2190d((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.f1381s;
                                if (d3 == view && mo2184b(view, pointerId5)) {
                                    i = this.f1365c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m2395g();
                    }
                }
                m2392e(pointerId4);
                return;
            default:
                return;
        }
        mo2192e();
    }

    /* renamed from: b */
    public boolean mo2182b(int i) {
        return ((1 << i) & this.f1373k) != 0;
    }

    /* renamed from: b */
    public boolean mo2183b(int i, int i2) {
        if (!mo2182b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f1368f[i2] - this.f1366d[i2];
        float f2 = this.f1369g[i2] - this.f1367e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1364b) : z2 && Math.abs(f2) > ((float) this.f1364b);
        }
        int i3 = this.f1364b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2184b(View view, int i) {
        if (view == this.f1381s && this.f1365c == i) {
            return true;
        }
        if (view == null || !this.f1380r.mo372a(view, i)) {
            return false;
        }
        this.f1365c = i;
        mo2175a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo2185b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: c */
    public View mo2186c() {
        return this.f1381s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2187c(int i) {
        this.f1383u.removeCallbacks(this.f1384w);
        if (this.f1363a != i) {
            this.f1363a = i;
            this.f1380r.mo369a(i);
            if (this.f1363a == 0) {
                this.f1381s = null;
            }
        }
    }

    /* renamed from: c */
    public boolean mo2188c(int i, int i2) {
        return mo2185b(this.f1381s, i, i2);
    }

    /* renamed from: d */
    public int mo2189d() {
        return this.f1364b;
    }

    /* renamed from: d */
    public View mo2190d(int i, int i2) {
        for (int childCount = this.f1383u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1383u.getChildAt(this.f1380r.mo2195c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo2191d(int i) {
        int length = this.f1366d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo2183b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo2192e() {
        this.f1365c = -1;
        m2393f();
        VelocityTracker velocityTracker = this.f1374l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1374l = null;
        }
    }
}
