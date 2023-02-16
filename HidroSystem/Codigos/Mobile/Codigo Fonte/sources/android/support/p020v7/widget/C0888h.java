package android.support.p020v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.h */
class C0888h {

    /* renamed from: a */
    private final View f3004a;

    /* renamed from: b */
    private final C0893m f3005b;

    /* renamed from: c */
    private int f3006c = -1;

    /* renamed from: d */
    private C0844bg f3007d;

    /* renamed from: e */
    private C0844bg f3008e;

    /* renamed from: f */
    private C0844bg f3009f;

    C0888h(View view) {
        this.f3004a = view;
        this.f3005b = C0893m.m4863a();
    }

    /* renamed from: b */
    private boolean m4838b(Drawable drawable) {
        if (this.f3009f == null) {
            this.f3009f = new C0844bg();
        }
        C0844bg bgVar = this.f3009f;
        bgVar.mo4287a();
        ColorStateList s = C0388q.m1672s(this.f3004a);
        if (s != null) {
            bgVar.f2874d = true;
            bgVar.f2871a = s;
        }
        PorterDuff.Mode t = C0388q.m1673t(this.f3004a);
        if (t != null) {
            bgVar.f2873c = true;
            bgVar.f2872b = t;
        }
        if (!bgVar.f2874d && !bgVar.f2873c) {
            return false;
        }
        C0893m.m4866a(drawable, bgVar, this.f3004a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m4839d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3007d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo4409a() {
        C0844bg bgVar = this.f3008e;
        if (bgVar != null) {
            return bgVar.f2871a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4410a(int i) {
        this.f3006c = i;
        C0893m mVar = this.f3005b;
        mo4416b(mVar != null ? mVar.mo4456b(this.f3004a.getContext(), i) : null);
        mo4417c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4411a(ColorStateList colorStateList) {
        if (this.f3008e == null) {
            this.f3008e = new C0844bg();
        }
        C0844bg bgVar = this.f3008e;
        bgVar.f2871a = colorStateList;
        bgVar.f2874d = true;
        mo4417c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4412a(PorterDuff.Mode mode) {
        if (this.f3008e == null) {
            this.f3008e = new C0844bg();
        }
        C0844bg bgVar = this.f3008e;
        bgVar.f2872b = mode;
        bgVar.f2873c = true;
        mo4417c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4413a(Drawable drawable) {
        this.f3006c = -1;
        mo4416b((ColorStateList) null);
        mo4417c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4414a(AttributeSet attributeSet, int i) {
        C0846bi a = C0846bi.m4625a(this.f3004a.getContext(), attributeSet, C0526a.C0536j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo4305g(C0526a.C0536j.ViewBackgroundHelper_android_background)) {
                this.f3006c = a.mo4304g(C0526a.C0536j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3005b.mo4456b(this.f3004a.getContext(), this.f3006c);
                if (b != null) {
                    mo4416b(b);
                }
            }
            if (a.mo4305g(C0526a.C0536j.ViewBackgroundHelper_backgroundTint)) {
                C0388q.m1642a(this.f3004a, a.mo4301e(C0526a.C0536j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo4305g(C0526a.C0536j.ViewBackgroundHelper_backgroundTintMode)) {
                C0388q.m1643a(this.f3004a, C0750ah.m3838a(a.mo4289a(C0526a.C0536j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4292a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo4415b() {
        C0844bg bgVar = this.f3008e;
        if (bgVar != null) {
            return bgVar.f2872b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4416b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3007d == null) {
                this.f3007d = new C0844bg();
            }
            C0844bg bgVar = this.f3007d;
            bgVar.f2871a = colorStateList;
            bgVar.f2874d = true;
        } else {
            this.f3007d = null;
        }
        mo4417c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4417c() {
        Drawable background = this.f3004a.getBackground();
        if (background == null) {
            return;
        }
        if (!m4839d() || !m4838b(background)) {
            C0844bg bgVar = this.f3008e;
            if (bgVar != null || (bgVar = this.f3007d) != null) {
                C0893m.m4866a(background, bgVar, this.f3004a.getDrawableState());
            }
        }
    }
}
