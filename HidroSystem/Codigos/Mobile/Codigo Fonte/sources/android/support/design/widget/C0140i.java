package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.p020v7.p024c.p025a.C0619a;

/* renamed from: android.support.design.widget.i */
class C0140i extends C0619a {

    /* renamed from: a */
    static final double f428a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    final Paint f429b;

    /* renamed from: c */
    final Paint f430c;

    /* renamed from: d */
    final RectF f431d;

    /* renamed from: e */
    float f432e;

    /* renamed from: f */
    Path f433f;

    /* renamed from: g */
    float f434g;

    /* renamed from: h */
    float f435h;

    /* renamed from: i */
    float f436i;

    /* renamed from: j */
    float f437j;

    /* renamed from: k */
    private boolean f438k;

    /* renamed from: l */
    private final int f439l;

    /* renamed from: m */
    private final int f440m;

    /* renamed from: n */
    private final int f441n;

    /* renamed from: o */
    private boolean f442o;

    /* renamed from: p */
    private float f443p;

    /* renamed from: q */
    private boolean f444q;

    /* renamed from: a */
    public static float m553a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f428a) * d2));
    }

    /* renamed from: a */
    private void m554a(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f443p, this.f431d.centerX(), this.f431d.centerY());
        float f5 = this.f432e;
        float f6 = (-f5) - this.f436i;
        float f7 = f5 * 2.0f;
        boolean z = this.f431d.width() - f7 > 0.0f;
        boolean z2 = this.f431d.height() - f7 > 0.0f;
        float f8 = this.f437j;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        canvas2.translate(this.f431d.left + f5, this.f431d.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f433f, this.f429b);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f431d.width() - f7, -this.f432e, this.f430c);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.f431d.right - f5, this.f431d.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f433f, this.f429b);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f431d.width() - f7, (-this.f432e) + this.f436i, this.f430c);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f431d.left + f5, this.f431d.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f433f, this.f429b);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f431d.height() - f7, -this.f432e, this.f430c);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.f431d.right - f5, this.f431d.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f433f, this.f429b);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f431d.height() - f7, -this.f432e, this.f430c);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: a */
    private void m555a(Rect rect) {
        float f = this.f435h * 1.5f;
        this.f431d.set(((float) rect.left) + this.f435h, ((float) rect.top) + f, ((float) rect.right) - this.f435h, ((float) rect.bottom) - f);
        mo2445b().setBounds((int) this.f431d.left, (int) this.f431d.top, (int) this.f431d.right, (int) this.f431d.bottom);
        m558c();
    }

    /* renamed from: b */
    public static float m556b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f428a) * d2));
    }

    /* renamed from: c */
    private static int m557c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    /* renamed from: c */
    private void m558c() {
        float f = this.f432e;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f436i;
        rectF2.inset(-f2, -f2);
        Path path = this.f433f;
        if (path == null) {
            this.f433f = new Path();
        } else {
            path.reset();
        }
        this.f433f.setFillType(Path.FillType.EVEN_ODD);
        this.f433f.moveTo(-this.f432e, 0.0f);
        this.f433f.rLineTo(-this.f436i, 0.0f);
        this.f433f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f433f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f433f.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f432e / f3;
            Paint paint = this.f429b;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f439l, this.f440m, this.f441n}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        this.f430c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f439l, this.f440m, this.f441n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f430c.setAntiAlias(false);
    }

    /* renamed from: a */
    public float mo658a() {
        return this.f437j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo659a(float f) {
        if (this.f443p != f) {
            this.f443p = f;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo660a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) m557c(f);
        float c2 = (float) m557c(f2);
        if (c > c2) {
            if (!this.f444q) {
                this.f444q = true;
            }
            c = c2;
        }
        if (this.f437j != c || this.f435h != c2) {
            this.f437j = c;
            this.f435h = c2;
            this.f436i = (float) Math.round(c * 1.5f);
            this.f434g = c2;
            this.f438k = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo661b(float f) {
        mo660a(f, this.f435h);
    }

    public void draw(Canvas canvas) {
        if (this.f438k) {
            m555a(getBounds());
            this.f438k = false;
        }
        m554a(canvas);
        super.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m553a(this.f435h, this.f432e, this.f442o));
        int ceil2 = (int) Math.ceil((double) m556b(this.f435h, this.f432e, this.f442o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f438k = true;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f429b.setAlpha(i);
        this.f430c.setAlpha(i);
    }
}
