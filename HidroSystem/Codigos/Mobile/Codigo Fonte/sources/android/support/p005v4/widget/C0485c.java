package android.support.p005v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p016h.C0318l;
import android.support.p005v4.p017i.p019b.C0364b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v4.widget.c */
public class C0485c extends Drawable implements Animatable {

    /* renamed from: a */
    private static final Interpolator f1302a = new LinearInterpolator();

    /* renamed from: b */
    private static final Interpolator f1303b = new C0364b();

    /* renamed from: c */
    private static final int[] f1304c = {-16777216};

    /* renamed from: d */
    private final C0488a f1305d = new C0488a();

    /* renamed from: e */
    private float f1306e;

    /* renamed from: f */
    private Resources f1307f;

    /* renamed from: g */
    private Animator f1308g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f1309h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f1310i;

    /* renamed from: android.support.v4.widget.c$a */
    private static class C0488a {

        /* renamed from: a */
        final RectF f1315a = new RectF();

        /* renamed from: b */
        final Paint f1316b = new Paint();

        /* renamed from: c */
        final Paint f1317c = new Paint();

        /* renamed from: d */
        final Paint f1318d = new Paint();

        /* renamed from: e */
        float f1319e = 0.0f;

        /* renamed from: f */
        float f1320f = 0.0f;

        /* renamed from: g */
        float f1321g = 0.0f;

        /* renamed from: h */
        float f1322h = 5.0f;

        /* renamed from: i */
        int[] f1323i;

        /* renamed from: j */
        int f1324j;

        /* renamed from: k */
        float f1325k;

        /* renamed from: l */
        float f1326l;

        /* renamed from: m */
        float f1327m;

        /* renamed from: n */
        boolean f1328n;

        /* renamed from: o */
        Path f1329o;

        /* renamed from: p */
        float f1330p = 1.0f;

        /* renamed from: q */
        float f1331q;

        /* renamed from: r */
        int f1332r;

        /* renamed from: s */
        int f1333s;

        /* renamed from: t */
        int f1334t = 255;

        /* renamed from: u */
        int f1335u;

        C0488a() {
            this.f1316b.setStrokeCap(Paint.Cap.SQUARE);
            this.f1316b.setAntiAlias(true);
            this.f1316b.setStyle(Paint.Style.STROKE);
            this.f1317c.setStyle(Paint.Style.FILL);
            this.f1317c.setAntiAlias(true);
            this.f1318d.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2102a() {
            return this.f1323i[mo2111b()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2103a(float f) {
            this.f1322h = f;
            this.f1316b.setStrokeWidth(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2104a(float f, float f2) {
            this.f1332r = (int) f;
            this.f1333s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2105a(int i) {
            this.f1335u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2106a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f1328n) {
                Path path = this.f1329o;
                if (path == null) {
                    this.f1329o = new Path();
                    this.f1329o.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f1329o.moveTo(0.0f, 0.0f);
                this.f1329o.lineTo(((float) this.f1332r) * this.f1330p, 0.0f);
                Path path2 = this.f1329o;
                float f3 = this.f1330p;
                path2.lineTo((((float) this.f1332r) * f3) / 2.0f, ((float) this.f1333s) * f3);
                this.f1329o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f1332r) * this.f1330p) / 2.0f), rectF.centerY() + (this.f1322h / 2.0f));
                this.f1329o.close();
                this.f1317c.setColor(this.f1335u);
                this.f1317c.setAlpha(this.f1334t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1329o, this.f1317c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2107a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1315a;
            float f = this.f1331q;
            float f2 = (this.f1322h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f1332r) * this.f1330p) / 2.0f, this.f1322h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f1319e;
            float f4 = this.f1321g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f1320f + f4) * 360.0f) - f5;
            this.f1316b.setColor(this.f1335u);
            this.f1316b.setAlpha(this.f1334t);
            float f7 = this.f1322h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1318d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f1316b);
            mo2106a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2108a(ColorFilter colorFilter) {
            this.f1316b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2109a(boolean z) {
            if (this.f1328n != z) {
                this.f1328n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2110a(int[] iArr) {
            this.f1323i = iArr;
            mo2113b(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo2111b() {
            return (this.f1324j + 1) % this.f1323i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2112b(float f) {
            this.f1319e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2113b(int i) {
            this.f1324j = i;
            this.f1335u = this.f1323i[this.f1324j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2114c() {
            mo2113b(mo2111b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2115c(float f) {
            this.f1320f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2116c(int i) {
            this.f1334t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo2117d() {
            return this.f1334t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2118d(float f) {
            this.f1321g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public float mo2119e() {
            return this.f1319e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2120e(float f) {
            this.f1331q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public float mo2121f() {
            return this.f1325k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2122f(float f) {
            if (f != this.f1330p) {
                this.f1330p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo2123g() {
            return this.f1326l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo2124h() {
            return this.f1323i[this.f1324j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo2125i() {
            return this.f1320f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo2126j() {
            return this.f1327m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo2127k() {
            this.f1325k = this.f1319e;
            this.f1326l = this.f1320f;
            this.f1327m = this.f1321g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2128l() {
            this.f1325k = 0.0f;
            this.f1326l = 0.0f;
            this.f1327m = 0.0f;
            mo2112b(0.0f);
            mo2115c(0.0f);
            mo2118d(0.0f);
        }
    }

    public C0485c(Context context) {
        this.f1307f = ((Context) C0318l.m1390a(context)).getResources();
        this.f1305d.mo2110a(f1304c);
        mo2082a(2.5f);
        m2265a();
    }

    /* renamed from: a */
    private int m2264a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m2265a() {
        final C0488a aVar = this.f1305d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0485c.this.m2267a(floatValue, aVar);
                C0485c.this.m2268a(floatValue, aVar, false);
                C0485c.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1302a);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
                C0485c.this.m2268a(1.0f, aVar, true);
                aVar.mo2127k();
                aVar.mo2114c();
                if (C0485c.this.f1310i) {
                    boolean unused = C0485c.this.f1310i = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo2109a(false);
                    return;
                }
                C0485c cVar = C0485c.this;
                float unused2 = cVar.f1309h = cVar.f1309h + 1.0f;
            }

            public void onAnimationStart(Animator animator) {
                float unused = C0485c.this.f1309h = 0.0f;
            }
        });
        this.f1308g = ofFloat;
    }

    /* renamed from: a */
    private void m2266a(float f, float f2, float f3, float f4) {
        C0488a aVar = this.f1305d;
        float f5 = this.f1307f.getDisplayMetrics().density;
        aVar.mo2103a(f2 * f5);
        aVar.mo2120e(f * f5);
        aVar.mo2113b(0);
        aVar.mo2104a(f3 * f5, f4 * f5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2267a(float f, C0488a aVar) {
        aVar.mo2105a(f > 0.75f ? m2264a((f - 0.75f) / 0.25f, aVar.mo2124h(), aVar.mo2102a()) : aVar.mo2124h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2268a(float f, C0488a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f1310i) {
            m2274b(f, aVar);
        } else if (f != 1.0f || z) {
            float j = aVar.mo2126j();
            if (f < 0.5f) {
                float f4 = aVar.mo2121f();
                float f5 = f4;
                f2 = (f1303b.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f4;
                f3 = f5;
            } else {
                f2 = aVar.mo2121f() + 0.79f;
                f3 = f2 - (((1.0f - f1303b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            aVar.mo2112b(f3);
            aVar.mo2115c(f2);
            aVar.mo2118d(j + (0.20999998f * f));
            m2275d((f + this.f1309h) * 216.0f);
        }
    }

    /* renamed from: b */
    private void m2274b(float f, C0488a aVar) {
        m2267a(f, aVar);
        aVar.mo2112b(aVar.mo2121f() + (((aVar.mo2123g() - 0.01f) - aVar.mo2121f()) * f));
        aVar.mo2115c(aVar.mo2123g());
        aVar.mo2118d(aVar.mo2126j() + ((((float) (Math.floor((double) (aVar.mo2126j() / 0.8f)) + 1.0d)) - aVar.mo2126j()) * f));
    }

    /* renamed from: d */
    private void m2275d(float f) {
        this.f1306e = f;
    }

    /* renamed from: a */
    public void mo2082a(float f) {
        this.f1305d.mo2103a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2083a(float f, float f2) {
        this.f1305d.mo2112b(f);
        this.f1305d.mo2115c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2084a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        m2266a(f, f4, f3, f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2085a(boolean z) {
        this.f1305d.mo2109a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2086a(int... iArr) {
        this.f1305d.mo2110a(iArr);
        this.f1305d.mo2113b(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo2087b(float f) {
        this.f1305d.mo2122f(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo2088c(float f) {
        this.f1305d.mo2118d(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1306e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1305d.mo2107a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f1305d.mo2117d();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f1308g.isRunning();
    }

    public void setAlpha(int i) {
        this.f1305d.mo2116c(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1305d.mo2108a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f1308g.cancel();
        this.f1305d.mo2127k();
        if (this.f1305d.mo2125i() != this.f1305d.mo2119e()) {
            this.f1310i = true;
            animator = this.f1308g;
            j = 666;
        } else {
            this.f1305d.mo2113b(0);
            this.f1305d.mo2128l();
            animator = this.f1308g;
            j = 1332;
        }
        animator.setDuration(j);
        this.f1308g.start();
    }

    public void stop() {
        this.f1308g.cancel();
        m2275d(0.0f);
        this.f1305d.mo2109a(false);
        this.f1305d.mo2113b(0);
        this.f1305d.mo2128l();
        invalidateSelf();
    }
}
