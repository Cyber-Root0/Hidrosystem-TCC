package android.support.p005v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.p005v4.p017i.C0388q;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.b */
class C0483b extends ImageView {

    /* renamed from: a */
    int f1297a;

    /* renamed from: b */
    private Animation.AnimationListener f1298b;

    /* renamed from: android.support.v4.widget.b$a */
    private class C0484a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f1300b;

        /* renamed from: c */
        private Paint f1301c = new Paint();

        C0484a(int i) {
            C0483b.this.f1297a = i;
            m2262a((int) rect().width());
        }

        /* renamed from: a */
        private void m2262a(int i) {
            float f = (float) (i / 2);
            this.f1300b = new RadialGradient(f, f, (float) C0483b.this.f1297a, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f1301c.setShader(this.f1300b);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0483b.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0483b.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f1301c);
            canvas.drawCircle(f, height, (float) (width - C0483b.this.f1297a), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2262a((int) f);
        }
    }

    C0483b(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f1297a = (int) (3.5f * f);
        if (m2260a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0388q.m1638a((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0484a(this.f1297a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1297a, (float) i3, (float) i2, 503316480);
            int i4 = this.f1297a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0388q.m1644a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m2260a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo2075a(Animation.AnimationListener animationListener) {
        this.f1298b = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1298b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1298b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m2260a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1297a * 2), getMeasuredHeight() + (this.f1297a * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
