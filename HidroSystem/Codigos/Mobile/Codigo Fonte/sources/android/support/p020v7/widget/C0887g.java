package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0387p;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.g */
public class C0887g extends AutoCompleteTextView implements C0387p {

    /* renamed from: a */
    private static final int[] f3001a = {16843126};

    /* renamed from: b */
    private final C0888h f3002b;

    /* renamed from: c */
    private final C0917z f3003c;

    public C0887g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.autoCompleteTextViewStyle);
    }

    public C0887g(Context context, AttributeSet attributeSet, int i) {
        super(C0843bf.m4620a(context), attributeSet, i);
        C0846bi a = C0846bi.m4625a(getContext(), attributeSet, f3001a, i, 0);
        if (a.mo4305g(0)) {
            setDropDownBackgroundDrawable(a.mo4291a(0));
        }
        a.mo4292a();
        this.f3002b = new C0888h(this);
        this.f3002b.mo4414a(attributeSet, i);
        this.f3003c = C0917z.m4931a((TextView) this);
        this.f3003c.mo3462a(attributeSet, i);
        this.f3003c.mo3461a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            hVar.mo4417c();
        }
        C0917z zVar = this.f3003c;
        if (zVar != null) {
            zVar.mo3461a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            return hVar.mo4409a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            return hVar.mo4415b();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            hVar.mo4413a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            hVar.mo4410a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0616b.m2831b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            hVar.mo4411a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0888h hVar = this.f3002b;
        if (hVar != null) {
            hVar.mo4412a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0917z zVar = this.f3003c;
        if (zVar != null) {
            zVar.mo4560a(context, i);
        }
    }
}
