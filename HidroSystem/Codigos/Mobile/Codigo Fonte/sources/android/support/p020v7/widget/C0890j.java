package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.widget.C0520n;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: android.support.v7.widget.j */
public class C0890j extends CheckBox implements C0520n {

    /* renamed from: a */
    private final C0892l f3012a;

    public C0890j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.checkboxStyle);
    }

    public C0890j(Context context, AttributeSet attributeSet, int i) {
        super(C0843bf.m4620a(context), attributeSet, i);
        this.f3012a = new C0892l(this);
        this.f3012a.mo4448a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0892l lVar = this.f3012a;
        return lVar != null ? lVar.mo4444a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0892l lVar = this.f3012a;
        if (lVar != null) {
            return lVar.mo4445a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0892l lVar = this.f3012a;
        if (lVar != null) {
            return lVar.mo4449b();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0616b.m2831b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0892l lVar = this.f3012a;
        if (lVar != null) {
            lVar.mo4450c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0892l lVar = this.f3012a;
        if (lVar != null) {
            lVar.mo4446a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0892l lVar = this.f3012a;
        if (lVar != null) {
            lVar.mo4447a(mode);
        }
    }
}
