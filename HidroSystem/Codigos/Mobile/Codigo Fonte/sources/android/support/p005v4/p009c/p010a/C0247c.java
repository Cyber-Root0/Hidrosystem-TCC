package android.support.p005v4.p009c.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.c.a.c */
class C0247c extends Drawable implements Drawable.Callback, C0246b, C0254f {

    /* renamed from: a */
    static final PorterDuff.Mode f793a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0248a f794b;

    /* renamed from: c */
    Drawable f795c;

    /* renamed from: d */
    private int f796d;

    /* renamed from: e */
    private PorterDuff.Mode f797e;

    /* renamed from: f */
    private boolean f798f;

    /* renamed from: g */
    private boolean f799g;

    /* renamed from: android.support.v4.c.a.c$a */
    protected static abstract class C0248a extends Drawable.ConstantState {

        /* renamed from: a */
        int f800a;

        /* renamed from: b */
        Drawable.ConstantState f801b;

        /* renamed from: c */
        ColorStateList f802c = null;

        /* renamed from: d */
        PorterDuff.Mode f803d = C0247c.f793a;

        C0248a(C0248a aVar, Resources resources) {
            if (aVar != null) {
                this.f800a = aVar.f800a;
                this.f801b = aVar.f801b;
                this.f802c = aVar.f802c;
                this.f803d = aVar.f803d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1161a() {
            return this.f801b != null;
        }

        public int getChangingConfigurations() {
            int i = this.f800a;
            Drawable.ConstantState constantState = this.f801b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: android.support.v4.c.a.c$b */
    private static class C0249b extends C0248a {
        C0249b(C0248a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0247c(this, resources);
        }
    }

    C0247c(Drawable drawable) {
        this.f794b = mo1132b();
        mo1130a(drawable);
    }

    C0247c(C0248a aVar, Resources resources) {
        this.f794b = aVar;
        m1173a(resources);
    }

    /* renamed from: a */
    private void m1173a(Resources resources) {
        C0248a aVar = this.f794b;
        if (aVar != null && aVar.f801b != null) {
            mo1130a(mo1131a(this.f794b.f801b, resources));
        }
    }

    /* renamed from: a */
    private boolean m1174a(int[] iArr) {
        if (!mo1133c()) {
            return false;
        }
        ColorStateList colorStateList = this.f794b.f802c;
        PorterDuff.Mode mode = this.f794b.f803d;
        if (colorStateList == null || mode == null) {
            this.f798f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f798f && colorForState == this.f796d && mode == this.f797e)) {
                setColorFilter(colorForState, mode);
                this.f796d = colorForState;
                this.f797e = mode;
                this.f798f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo1129a() {
        return this.f795c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo1131a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    /* renamed from: a */
    public final void mo1130a(Drawable drawable) {
        Drawable drawable2 = this.f795c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f795c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0248a aVar = this.f794b;
            if (aVar != null) {
                aVar.f801b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0248a mo1132b() {
        return new C0249b(this.f794b, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1133c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f795c.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0248a aVar = this.f794b;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f795c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0248a aVar = this.f794b;
        if (aVar == null || !aVar.mo1161a()) {
            return null;
        }
        this.f794b.f800a = getChangingConfigurations();
        return this.f794b;
    }

    public Drawable getCurrent() {
        return this.f795c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f795c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f795c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f795c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f795c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f795c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f795c.getPadding(rect);
    }

    public int[] getState() {
        return this.f795c.getState();
    }

    public Region getTransparentRegion() {
        return this.f795c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f794b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo1133c()
            if (r0 == 0) goto L_0x000d
            android.support.v4.c.a.c$a r0 = r1.f794b
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f802c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f795c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p009c.p010a.C0247c.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f795c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f799g && super.mutate() == this) {
            this.f794b = mo1132b();
            Drawable drawable = this.f795c;
            if (drawable != null) {
                drawable.mutate();
            }
            C0248a aVar = this.f794b;
            if (aVar != null) {
                Drawable drawable2 = this.f795c;
                aVar.f801b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f799g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f795c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f795c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f795c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f795c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f795c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f795c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f795c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1174a(iArr) || this.f795c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f794b.f802c = colorStateList;
        m1174a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f794b.f803d = mode;
        m1174a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f795c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
