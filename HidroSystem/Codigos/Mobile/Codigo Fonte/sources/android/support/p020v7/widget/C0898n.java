package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0387p;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.n */
public class C0898n extends EditText implements C0387p {

    /* renamed from: a */
    private final C0888h f3037a;

    /* renamed from: b */
    private final C0917z f3038b;

    public C0898n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.editTextStyle);
    }

    public C0898n(Context context, AttributeSet attributeSet, int i) {
        super(C0843bf.m4620a(context), attributeSet, i);
        this.f3037a = new C0888h(this);
        this.f3037a.mo4414a(attributeSet, i);
        this.f3038b = C0917z.m4931a((TextView) this);
        this.f3038b.mo3462a(attributeSet, i);
        this.f3038b.mo3461a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            hVar.mo4417c();
        }
        C0917z zVar = this.f3038b;
        if (zVar != null) {
            zVar.mo3461a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            return hVar.mo4409a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            return hVar.mo4415b();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            hVar.mo4413a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            hVar.mo4410a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            hVar.mo4411a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0888h hVar = this.f3037a;
        if (hVar != null) {
            hVar.mo4412a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0917z zVar = this.f3038b;
        if (zVar != null) {
            zVar.mo4560a(context, i);
        }
    }
}
