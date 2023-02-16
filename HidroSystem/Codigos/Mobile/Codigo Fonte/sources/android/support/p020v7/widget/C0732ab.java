package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p017i.C0387p;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ab */
public class C0732ab extends TextView implements C0387p {

    /* renamed from: a */
    private final C0888h f2374a;

    /* renamed from: b */
    private final C0917z f2375b;

    public C0732ab(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0732ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0732ab(Context context, AttributeSet attributeSet, int i) {
        super(C0843bf.m4620a(context), attributeSet, i);
        this.f2374a = new C0888h(this);
        this.f2374a.mo4414a(attributeSet, i);
        this.f2375b = C0917z.m4931a((TextView) this);
        this.f2375b.mo3462a(attributeSet, i);
        this.f2375b.mo3461a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            hVar.mo4417c();
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo3461a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeMaxTextSize();
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            return zVar.mo4570g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeMinTextSize();
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            return zVar.mo4569f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeStepGranularity();
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            return zVar.mo4568e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0917z zVar = this.f2375b;
        return zVar != null ? zVar.mo4571h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            return zVar.mo4567d();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            return hVar.mo4409a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            return hVar.mo4415b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo4563a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2375b != null && Build.VERSION.SDK_INT < 26 && this.f2375b.mo4566c()) {
            this.f2375b.mo4565b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo4559a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo4564a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo4557a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            hVar.mo4413a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            hVar.mo4410a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            hVar.mo4411a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0888h hVar = this.f2374a;
        if (hVar != null) {
            hVar.mo4412a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo4560a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setTextSize(i, f);
            return;
        }
        C0917z zVar = this.f2375b;
        if (zVar != null) {
            zVar.mo4558a(i, f);
        }
    }
}
