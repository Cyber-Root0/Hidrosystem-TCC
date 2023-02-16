package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.C0239a;

/* renamed from: android.support.design.widget.c */
class C0125c extends Drawable {

    /* renamed from: a */
    final Paint f363a;

    /* renamed from: b */
    final Rect f364b;

    /* renamed from: c */
    final RectF f365c;

    /* renamed from: d */
    float f366d;

    /* renamed from: e */
    private int f367e;

    /* renamed from: f */
    private int f368f;

    /* renamed from: g */
    private int f369g;

    /* renamed from: h */
    private int f370h;

    /* renamed from: i */
    private ColorStateList f371i;

    /* renamed from: j */
    private int f372j;

    /* renamed from: k */
    private boolean f373k;

    /* renamed from: l */
    private float f374l;

    /* renamed from: a */
    private Shader m476a() {
        Rect rect = this.f364b;
        copyBounds(rect);
        float height = this.f366d / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0239a.m1116a(this.f367e, this.f372j), C0239a.m1116a(this.f368f, this.f372j), C0239a.m1116a(C0239a.m1118b(this.f368f, 0), this.f372j), C0239a.m1116a(C0239a.m1118b(this.f370h, 0), this.f372j), C0239a.m1116a(this.f370h, this.f372j), C0239a.m1116a(this.f369g, this.f372j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo601a(float f) {
        if (f != this.f374l) {
            this.f374l = f;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo602a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f372j = colorStateList.getColorForState(getState(), this.f372j);
        }
        this.f371i = colorStateList;
        this.f373k = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (this.f373k) {
            this.f363a.setShader(m476a());
            this.f373k = false;
        }
        float strokeWidth = this.f363a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f365c;
        copyBounds(this.f364b);
        rectF.set(this.f364b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f374l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f363a);
        canvas.restore();
    }

    public int getOpacity() {
        return this.f366d > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f366d);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f371i;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f373k = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f371i;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f372j)) == this.f372j)) {
            this.f373k = true;
            this.f372j = colorForState;
        }
        if (this.f373k) {
            invalidateSelf();
        }
        return this.f373k;
    }

    public void setAlpha(int i) {
        this.f363a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f363a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
