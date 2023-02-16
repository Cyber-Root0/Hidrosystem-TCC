package android.support.p005v4.p009c.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p005v4.p009c.p010a.C0247c;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.c.a.e */
class C0252e extends C0250d {

    /* renamed from: d */
    private static Method f804d;

    /* renamed from: android.support.v4.c.a.e$a */
    private static class C0253a extends C0247c.C0248a {
        C0253a(C0247c.C0248a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0252e(this, resources);
        }
    }

    C0252e(Drawable drawable) {
        super(drawable);
        m1182d();
    }

    C0252e(C0247c.C0248a aVar, Resources resources) {
        super(aVar, resources);
        m1182d();
    }

    /* renamed from: d */
    private void m1182d() {
        if (f804d == null) {
            try {
                f804d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0247c.C0248a mo1132b() {
        return new C0253a(this.f794b, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1133c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f795c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f795c.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f795c.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f795c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f795c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo1133c()) {
            super.setTint(i);
        } else {
            this.f795c.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1133c()) {
            super.setTintList(colorStateList);
        } else {
            this.f795c.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1133c()) {
            super.setTintMode(mode);
        } else {
            this.f795c.setTintMode(mode);
        }
    }
}
