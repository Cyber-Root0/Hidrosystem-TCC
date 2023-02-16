package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p020v7.p021a.C0526a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.z */
class C0917z {

    /* renamed from: a */
    final TextView f3089a;

    /* renamed from: b */
    private C0844bg f3090b;

    /* renamed from: c */
    private C0844bg f3091c;

    /* renamed from: d */
    private C0844bg f3092d;

    /* renamed from: e */
    private C0844bg f3093e;

    /* renamed from: f */
    private final C0733ac f3094f;

    /* renamed from: g */
    private int f3095g = 0;

    /* renamed from: h */
    private Typeface f3096h;

    C0917z(TextView textView) {
        this.f3089a = textView;
        this.f3094f = new C0733ac(this.f3089a);
    }

    /* renamed from: a */
    protected static C0844bg m4930a(Context context, C0893m mVar, int i) {
        ColorStateList b = mVar.mo4456b(context, i);
        if (b == null) {
            return null;
        }
        C0844bg bgVar = new C0844bg();
        bgVar.f2874d = true;
        bgVar.f2871a = b;
        return bgVar;
    }

    /* renamed from: a */
    static C0917z m4931a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new C0731aa(textView) : new C0917z(textView);
    }

    /* renamed from: a */
    private void m4932a(Context context, C0846bi biVar) {
        this.f3095g = biVar.mo4289a(C0526a.C0536j.TextAppearance_android_textStyle, this.f3095g);
        if (biVar.mo4305g(C0526a.C0536j.TextAppearance_android_fontFamily) || biVar.mo4305g(C0526a.C0536j.TextAppearance_fontFamily)) {
            this.f3096h = null;
            int i = biVar.mo4305g(C0526a.C0536j.TextAppearance_android_fontFamily) ? C0526a.C0536j.TextAppearance_android_fontFamily : C0526a.C0536j.TextAppearance_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f3096h = biVar.mo4290a(i, this.f3095g, this.f3089a);
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3096h == null) {
                this.f3096h = Typeface.create(biVar.mo4299d(i), this.f3095g);
            }
        }
    }

    /* renamed from: b */
    private void m4933b(int i, float f) {
        this.f3094f.mo3480a(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3461a() {
        if (this.f3090b != null || this.f3091c != null || this.f3092d != null || this.f3093e != null) {
            Drawable[] compoundDrawables = this.f3089a.getCompoundDrawables();
            mo4561a(compoundDrawables[0], this.f3090b);
            mo4561a(compoundDrawables[1], this.f3091c);
            mo4561a(compoundDrawables[2], this.f3092d);
            mo4561a(compoundDrawables[3], this.f3093e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4557a(int i) {
        this.f3094f.mo3479a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4558a(int i, float f) {
        if (Build.VERSION.SDK_INT < 26 && !mo4566c()) {
            m4933b(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4559a(int i, int i2, int i3, int i4) {
        this.f3094f.mo3481a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4560a(Context context, int i) {
        ColorStateList e;
        C0846bi a = C0846bi.m4623a(context, i, C0526a.C0536j.TextAppearance);
        if (a.mo4305g(C0526a.C0536j.TextAppearance_textAllCaps)) {
            mo4562a(a.mo4293a(C0526a.C0536j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo4305g(C0526a.C0536j.TextAppearance_android_textColor) && (e = a.mo4301e(C0526a.C0536j.TextAppearance_android_textColor)) != null) {
            this.f3089a.setTextColor(e);
        }
        m4932a(context, a);
        a.mo4292a();
        Typeface typeface = this.f3096h;
        if (typeface != null) {
            this.f3089a.setTypeface(typeface, this.f3095g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4561a(Drawable drawable, C0844bg bgVar) {
        if (drawable != null && bgVar != null) {
            C0893m.m4866a(drawable, bgVar, this.f3089a.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3462a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f3089a.getContext();
        C0893m a = C0893m.m4863a();
        C0846bi a2 = C0846bi.m4625a(context, attributeSet, C0526a.C0536j.AppCompatTextHelper, i, 0);
        int g = a2.mo4304g(C0526a.C0536j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo4305g(C0526a.C0536j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3090b = m4930a(context, a, a2.mo4304g(C0526a.C0536j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo4305g(C0526a.C0536j.AppCompatTextHelper_android_drawableTop)) {
            this.f3091c = m4930a(context, a, a2.mo4304g(C0526a.C0536j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo4305g(C0526a.C0536j.AppCompatTextHelper_android_drawableRight)) {
            this.f3092d = m4930a(context, a, a2.mo4304g(C0526a.C0536j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo4305g(C0526a.C0536j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3093e = m4930a(context, a, a2.mo4304g(C0526a.C0536j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.mo4292a();
        boolean z3 = this.f3089a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0846bi a3 = C0846bi.m4623a(context, g, C0526a.C0536j.TextAppearance);
            if (z3 || !a3.mo4305g(C0526a.C0536j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo4293a(C0526a.C0536j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m4932a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList e = a3.mo4305g(C0526a.C0536j.TextAppearance_android_textColor) ? a3.mo4301e(C0526a.C0536j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo4305g(C0526a.C0536j.TextAppearance_android_textColorHint) ? a3.mo4301e(C0526a.C0536j.TextAppearance_android_textColorHint) : null;
                if (a3.mo4305g(C0526a.C0536j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a3.mo4301e(C0526a.C0536j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = e;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo4292a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        C0846bi a4 = C0846bi.m4625a(context, attributeSet, C0526a.C0536j.TextAppearance, i, 0);
        if (z3 || !a4.mo4305g(C0526a.C0536j.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a4.mo4293a(C0526a.C0536j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.mo4305g(C0526a.C0536j.TextAppearance_android_textColor)) {
                colorStateList3 = a4.mo4301e(C0526a.C0536j.TextAppearance_android_textColor);
            }
            if (a4.mo4305g(C0526a.C0536j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.mo4301e(C0526a.C0536j.TextAppearance_android_textColorHint);
            }
            if (a4.mo4305g(C0526a.C0536j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.mo4301e(C0526a.C0536j.TextAppearance_android_textColorLink);
            }
        }
        m4932a(context, a4);
        a4.mo4292a();
        if (colorStateList3 != null) {
            this.f3089a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f3089a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f3089a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            mo4562a(z);
        }
        Typeface typeface = this.f3096h;
        if (typeface != null) {
            this.f3089a.setTypeface(typeface, this.f3095g);
        }
        this.f3094f.mo3482a(attributeSet, i);
        if (Build.VERSION.SDK_INT >= 26 && this.f3094f.mo3478a() != 0) {
            int[] e2 = this.f3094f.mo3487e();
            if (e2.length <= 0) {
                return;
            }
            if (((float) this.f3089a.getAutoSizeStepGranularity()) != -1.0f) {
                this.f3089a.setAutoSizeTextTypeUniformWithConfiguration(this.f3094f.mo3485c(), this.f3094f.mo3486d(), this.f3094f.mo3484b(), 0);
            } else {
                this.f3089a.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4562a(boolean z) {
        this.f3089a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4563a(boolean z, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT < 26) {
            mo4565b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4564a(int[] iArr, int i) {
        this.f3094f.mo3483a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4565b() {
        this.f3094f.mo3488f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4566c() {
        return this.f3094f.mo3489g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo4567d() {
        return this.f3094f.mo3478a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo4568e() {
        return this.f3094f.mo3484b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo4569f() {
        return this.f3094f.mo3485c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4570g() {
        return this.f3094f.mo3486d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo4571h() {
        return this.f3094f.mo3487e();
    }
}
