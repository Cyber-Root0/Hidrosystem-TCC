package android.support.p003b.p004a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p009c.p010a.C0254f;

/* renamed from: android.support.b.a.h */
abstract class C0036h extends Drawable implements C0254f {

    /* renamed from: b */
    Drawable f68b;

    C0036h() {
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            C0240a.m1125a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            return C0240a.m1133e(drawable);
        }
        return null;
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            C0240a.m1120a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            C0240a.m1121a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f68b;
        if (drawable != null) {
            C0240a.m1123a(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f68b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
