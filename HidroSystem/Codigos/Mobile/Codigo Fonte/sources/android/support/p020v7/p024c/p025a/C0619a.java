package android.support.p020v7.p024c.p025a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.p010a.C0240a;

/* renamed from: android.support.v7.c.a.a */
public class C0619a extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f1713a;

    public C0619a(Drawable drawable) {
        mo2444a(drawable);
    }

    /* renamed from: a */
    public void mo2444a(Drawable drawable) {
        Drawable drawable2 = this.f1713a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1713a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* renamed from: b */
    public Drawable mo2445b() {
        return this.f1713a;
    }

    public void draw(Canvas canvas) {
        this.f1713a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1713a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1713a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1713a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1713a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1713a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1713a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1713a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1713a.getPadding(rect);
    }

    public int[] getState() {
        return this.f1713a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1713a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0240a.m1129b(this.f1713a);
    }

    public boolean isStateful() {
        return this.f1713a.isStateful();
    }

    public void jumpToCurrentState() {
        C0240a.m1120a(this.f1713a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1713a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1713a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1713a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0240a.m1128a(this.f1713a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1713a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1713a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1713a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1713a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0240a.m1121a(this.f1713a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0240a.m1123a(this.f1713a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1713a.setState(iArr);
    }

    public void setTint(int i) {
        C0240a.m1122a(this.f1713a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0240a.m1124a(this.f1713a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0240a.m1127a(this.f1713a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1713a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
