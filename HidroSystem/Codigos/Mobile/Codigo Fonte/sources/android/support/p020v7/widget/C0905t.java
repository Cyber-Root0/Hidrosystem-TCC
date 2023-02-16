package android.support.p020v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p005v4.p009c.p010a.C0246b;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.t */
class C0905t {

    /* renamed from: a */
    private static final int[] f3055a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f3056b;

    /* renamed from: c */
    private Bitmap f3057c;

    C0905t(ProgressBar progressBar) {
        this.f3056b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo4512a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m4907a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m4907a(Drawable drawable, boolean z) {
        if (drawable instanceof C0246b) {
            C0246b bVar = (C0246b) drawable;
            Drawable a = bVar.mo1129a();
            if (a == null) {
                return drawable;
            }
            bVar.mo1130a(m4907a(a, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m4907a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3057c == null) {
                this.f3057c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo4513b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }

    /* renamed from: b */
    private Shape mo4513b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo4500a() {
        return this.f3057c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4501a(AttributeSet attributeSet, int i) {
        C0846bi a = C0846bi.m4625a(this.f3056b.getContext(), attributeSet, f3055a, i, 0);
        Drawable b = a.mo4295b(0);
        if (b != null) {
            this.f3056b.setIndeterminateDrawable(mo4512a(b));
        }
        Drawable b2 = a.mo4295b(1);
        if (b2 != null) {
            this.f3056b.setProgressDrawable(m4907a(b2, false));
        }
        a.mo4292a();
    }
}
