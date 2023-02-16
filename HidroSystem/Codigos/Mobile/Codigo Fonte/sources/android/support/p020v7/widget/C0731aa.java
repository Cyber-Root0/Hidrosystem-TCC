package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.aa */
class C0731aa extends C0917z {

    /* renamed from: b */
    private C0844bg f2372b;

    /* renamed from: c */
    private C0844bg f2373c;

    C0731aa(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3461a() {
        super.mo3461a();
        if (this.f2372b != null || this.f2373c != null) {
            Drawable[] compoundDrawablesRelative = this.f3089a.getCompoundDrawablesRelative();
            mo4561a(compoundDrawablesRelative[0], this.f2372b);
            mo4561a(compoundDrawablesRelative[2], this.f2373c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3462a(AttributeSet attributeSet, int i) {
        super.mo3462a(attributeSet, i);
        Context context = this.f3089a.getContext();
        C0893m a = C0893m.m4863a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextHelper_android_drawableStart)) {
            this.f2372b = m4930a(context, a, obtainStyledAttributes.getResourceId(C0526a.C0536j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextHelper_android_drawableEnd)) {
            this.f2373c = m4930a(context, a, obtainStyledAttributes.getResourceId(C0526a.C0536j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
