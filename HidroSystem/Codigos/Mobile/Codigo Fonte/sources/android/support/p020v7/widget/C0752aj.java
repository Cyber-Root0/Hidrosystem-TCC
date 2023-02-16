package android.support.p020v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.widget.C0787av;
import android.view.MotionEvent;

/* renamed from: android.support.v7.widget.aj */
class C0752aj extends C0787av.C0803g implements C0787av.C0812l {

    /* renamed from: g */
    private static final int[] f2451g = {16842919};

    /* renamed from: h */
    private static final int[] f2452h = new int[0];

    /* renamed from: A */
    private final int[] f2453A = new int[2];
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ValueAnimator f2454B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f2455C = 0;

    /* renamed from: D */
    private final Runnable f2456D = new Runnable() {
        public void run() {
            C0752aj.this.mo3597a(500);
        }
    };

    /* renamed from: E */
    private final C0787av.C0813m f2457E = new C0787av.C0813m() {
        /* renamed from: a */
        public void mo3607a(C0787av avVar, int i, int i2) {
            C0752aj.this.mo3598a(avVar.computeHorizontalScrollOffset(), avVar.computeVerticalScrollOffset());
        }
    };

    /* renamed from: a */
    int f2458a;

    /* renamed from: b */
    int f2459b;

    /* renamed from: c */
    float f2460c;

    /* renamed from: d */
    int f2461d;

    /* renamed from: e */
    int f2462e;

    /* renamed from: f */
    float f2463f;

    /* renamed from: i */
    private final int f2464i;

    /* renamed from: j */
    private final int f2465j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final StateListDrawable f2466k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Drawable f2467l;

    /* renamed from: m */
    private final int f2468m;

    /* renamed from: n */
    private final int f2469n;

    /* renamed from: o */
    private final StateListDrawable f2470o;

    /* renamed from: p */
    private final Drawable f2471p;

    /* renamed from: q */
    private final int f2472q;

    /* renamed from: r */
    private final int f2473r;

    /* renamed from: s */
    private int f2474s = 0;

    /* renamed from: t */
    private int f2475t = 0;

    /* renamed from: u */
    private C0787av f2476u;

    /* renamed from: v */
    private boolean f2477v = false;

    /* renamed from: w */
    private boolean f2478w = false;

    /* renamed from: x */
    private int f2479x = 0;

    /* renamed from: y */
    private int f2480y = 0;

    /* renamed from: z */
    private final int[] f2481z = new int[2];

    /* renamed from: android.support.v7.widget.aj$a */
    private class C0755a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f2485b;

        private C0755a() {
            this.f2485b = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2485b = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2485b) {
                this.f2485b = false;
            } else if (((Float) C0752aj.this.f2454B.getAnimatedValue()).floatValue() == 0.0f) {
                int unused = C0752aj.this.f2455C = 0;
                C0752aj.this.m3854b(0);
            } else {
                int unused2 = C0752aj.this.f2455C = 2;
                C0752aj.this.m3862d();
            }
        }
    }

    /* renamed from: android.support.v7.widget.aj$b */
    private class C0756b implements ValueAnimator.AnimatorUpdateListener {
        private C0756b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0752aj.this.f2466k.setAlpha(floatValue);
            C0752aj.this.f2467l.setAlpha(floatValue);
            C0752aj.this.m3862d();
        }
    }

    C0752aj(C0787av avVar, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f2466k = stateListDrawable;
        this.f2467l = drawable;
        this.f2470o = stateListDrawable2;
        this.f2471p = drawable2;
        this.f2468m = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2469n = Math.max(i, drawable.getIntrinsicWidth());
        this.f2472q = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2473r = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2464i = i2;
        this.f2465j = i3;
        this.f2466k.setAlpha(255);
        this.f2467l.setAlpha(255);
        this.f2454B.addListener(new C0755a());
        this.f2454B.addUpdateListener(new C0756b());
        mo3600a(avVar);
    }

    /* renamed from: a */
    private int m3847a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m3850a(float f) {
        int[] g = m3865g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f2459b) - max) >= 2.0f) {
            int a = m3847a(this.f2460c, max, g, this.f2476u.computeVerticalScrollRange(), this.f2476u.computeVerticalScrollOffset(), this.f2475t);
            if (a != 0) {
                this.f2476u.scrollBy(0, a);
            }
            this.f2460c = max;
        }
    }

    /* renamed from: a */
    private void m3851a(Canvas canvas) {
        int i = this.f2474s;
        int i2 = this.f2468m;
        int i3 = i - i2;
        int i4 = this.f2459b;
        int i5 = this.f2458a;
        int i6 = i4 - (i5 / 2);
        this.f2466k.setBounds(0, 0, i2, i5);
        this.f2467l.setBounds(0, 0, this.f2469n, this.f2475t);
        if (m3863e()) {
            this.f2467l.draw(canvas);
            canvas.translate((float) this.f2468m, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2466k.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f2468m;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f2467l.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f2466k.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: b */
    private void m3852b() {
        this.f2476u.mo3761a((C0787av.C0803g) this);
        this.f2476u.mo3763a((C0787av.C0812l) this);
        this.f2476u.mo3764a(this.f2457E);
    }

    /* renamed from: b */
    private void m3853b(float f) {
        int[] h = m3866h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f2462e) - max) >= 2.0f) {
            int a = m3847a(this.f2463f, max, h, this.f2476u.computeHorizontalScrollRange(), this.f2476u.computeHorizontalScrollOffset(), this.f2474s);
            if (a != 0) {
                this.f2476u.scrollBy(a, 0);
            }
            this.f2463f = max;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3854b(int i) {
        int i2;
        if (i == 2 && this.f2479x != 2) {
            this.f2466k.setState(f2451g);
            m3864f();
        }
        if (i == 0) {
            m3862d();
        } else {
            mo3596a();
        }
        if (this.f2479x != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f2479x = i;
        }
        this.f2466k.setState(f2452h);
        i2 = 1200;
        m3860c(i2);
        this.f2479x = i;
    }

    /* renamed from: b */
    private void m3855b(Canvas canvas) {
        int i = this.f2475t;
        int i2 = this.f2472q;
        int i3 = i - i2;
        int i4 = this.f2462e;
        int i5 = this.f2461d;
        int i6 = i4 - (i5 / 2);
        this.f2470o.setBounds(0, 0, i5, i2);
        this.f2471p.setBounds(0, 0, this.f2474s, this.f2473r);
        canvas.translate(0.0f, (float) i3);
        this.f2471p.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f2470o.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: c */
    private void m3859c() {
        this.f2476u.mo3780b((C0787av.C0803g) this);
        this.f2476u.mo3781b((C0787av.C0812l) this);
        this.f2476u.mo3782b(this.f2457E);
        m3864f();
    }

    /* renamed from: c */
    private void m3860c(int i) {
        m3864f();
        this.f2476u.postDelayed(this.f2456D, (long) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m3862d() {
        this.f2476u.invalidate();
    }

    /* renamed from: e */
    private boolean m3863e() {
        return C0388q.m1658e(this.f2476u) == 1;
    }

    /* renamed from: f */
    private void m3864f() {
        this.f2476u.removeCallbacks(this.f2456D);
    }

    /* renamed from: g */
    private int[] m3865g() {
        int[] iArr = this.f2481z;
        int i = this.f2465j;
        iArr[0] = i;
        iArr[1] = this.f2475t - i;
        return iArr;
    }

    /* renamed from: h */
    private int[] m3866h() {
        int[] iArr = this.f2453A;
        int i = this.f2465j;
        iArr[0] = i;
        iArr[1] = this.f2474s - i;
        return iArr;
    }

    /* renamed from: a */
    public void mo3596a() {
        int i = this.f2455C;
        if (i != 0) {
            if (i == 3) {
                this.f2454B.cancel();
            } else {
                return;
            }
        }
        this.f2455C = 1;
        ValueAnimator valueAnimator = this.f2454B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2454B.setDuration(500);
        this.f2454B.setStartDelay(0);
        this.f2454B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3597a(int i) {
        switch (this.f2455C) {
            case 1:
                this.f2454B.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f2455C = 3;
        ValueAnimator valueAnimator = this.f2454B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f2454B.setDuration((long) i);
        this.f2454B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3598a(int i, int i2) {
        int computeVerticalScrollRange = this.f2476u.computeVerticalScrollRange();
        int i3 = this.f2475t;
        this.f2477v = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2464i;
        int computeHorizontalScrollRange = this.f2476u.computeHorizontalScrollRange();
        int i4 = this.f2474s;
        this.f2478w = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2464i;
        if (this.f2477v || this.f2478w) {
            if (this.f2477v) {
                float f = (float) i3;
                this.f2459b = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f2458a = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f2478w) {
                float f2 = (float) i4;
                this.f2462e = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f2461d = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f2479x;
            if (i5 == 0 || i5 == 1) {
                m3854b(1);
            }
        } else if (this.f2479x != 0) {
            m3854b(0);
        }
    }

    /* renamed from: a */
    public void mo3599a(Canvas canvas, C0787av avVar, C0787av.C0823t tVar) {
        if (this.f2474s != this.f2476u.getWidth() || this.f2475t != this.f2476u.getHeight()) {
            this.f2474s = this.f2476u.getWidth();
            this.f2475t = this.f2476u.getHeight();
            m3854b(0);
        } else if (this.f2455C != 0) {
            if (this.f2477v) {
                m3851a(canvas);
            }
            if (this.f2478w) {
                m3855b(canvas);
            }
        }
    }

    /* renamed from: a */
    public void mo3600a(C0787av avVar) {
        C0787av avVar2 = this.f2476u;
        if (avVar2 != avVar) {
            if (avVar2 != null) {
                m3859c();
            }
            this.f2476u = avVar;
            if (this.f2476u != null) {
                m3852b();
            }
        }
    }

    /* renamed from: a */
    public void mo3601a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3602a(float f, float f2) {
        if (!m3863e() ? f >= ((float) (this.f2474s - this.f2468m)) : f <= ((float) (this.f2468m / 2))) {
            int i = this.f2459b;
            int i2 = this.f2458a;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: a */
    public boolean mo3603a(C0787av avVar, MotionEvent motionEvent) {
        int i = this.f2479x;
        if (i != 1) {
            return i == 2;
        }
        boolean a = mo3602a(motionEvent.getX(), motionEvent.getY());
        boolean b = mo3605b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!a && !b) {
            return false;
        }
        if (b) {
            this.f2480y = 1;
            this.f2463f = (float) ((int) motionEvent.getX());
        } else if (a) {
            this.f2480y = 2;
            this.f2460c = (float) ((int) motionEvent.getY());
        }
        m3854b(2);
    }

    /* renamed from: b */
    public void mo3604b(C0787av avVar, MotionEvent motionEvent) {
        if (this.f2479x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = mo3602a(motionEvent.getX(), motionEvent.getY());
                boolean b = mo3605b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f2480y = 1;
                        this.f2463f = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f2480y = 2;
                        this.f2460c = (float) ((int) motionEvent.getY());
                    }
                    m3854b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2479x == 2) {
                this.f2460c = 0.0f;
                this.f2463f = 0.0f;
                m3854b(1);
                this.f2480y = 0;
            } else if (motionEvent.getAction() == 2 && this.f2479x == 2) {
                mo3596a();
                if (this.f2480y == 1) {
                    m3853b(motionEvent.getX());
                }
                if (this.f2480y == 2) {
                    m3850a(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3605b(float f, float f2) {
        if (f2 >= ((float) (this.f2475t - this.f2472q))) {
            int i = this.f2462e;
            int i2 = this.f2461d;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }
}
