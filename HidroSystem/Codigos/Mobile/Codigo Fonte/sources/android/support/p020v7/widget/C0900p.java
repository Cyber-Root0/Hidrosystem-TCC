package android.support.p020v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p005v4.widget.C0501h;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.p */
public class C0900p {

    /* renamed from: a */
    private final ImageView f3041a;

    /* renamed from: b */
    private C0844bg f3042b;

    /* renamed from: c */
    private C0844bg f3043c;

    /* renamed from: d */
    private C0844bg f3044d;

    public C0900p(ImageView imageView) {
        this.f3041a = imageView;
    }

    /* renamed from: a */
    private boolean m4893a(Drawable drawable) {
        if (this.f3044d == null) {
            this.f3044d = new C0844bg();
        }
        C0844bg bgVar = this.f3044d;
        bgVar.mo4287a();
        ColorStateList a = C0501h.m2336a(this.f3041a);
        if (a != null) {
            bgVar.f2874d = true;
            bgVar.f2871a = a;
        }
        PorterDuff.Mode b = C0501h.m2339b(this.f3041a);
        if (b != null) {
            bgVar.f2873c = true;
            bgVar.f2872b = b;
        }
        if (!bgVar.f2874d && !bgVar.f2873c) {
            return false;
        }
        C0893m.m4866a(drawable, bgVar, this.f3041a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m4894e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3042b != null : i == 21;
    }

    /* renamed from: a */
    public void mo4473a(int i) {
        if (i != 0) {
            Drawable b = C0616b.m2831b(this.f3041a.getContext(), i);
            if (b != null) {
                C0750ah.m3839a(b);
            }
            this.f3041a.setImageDrawable(b);
        } else {
            this.f3041a.setImageDrawable((Drawable) null);
        }
        mo4480d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4474a(ColorStateList colorStateList) {
        if (this.f3043c == null) {
            this.f3043c = new C0844bg();
        }
        C0844bg bgVar = this.f3043c;
        bgVar.f2871a = colorStateList;
        bgVar.f2874d = true;
        mo4480d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4475a(PorterDuff.Mode mode) {
        if (this.f3043c == null) {
            this.f3043c = new C0844bg();
        }
        C0844bg bgVar = this.f3043c;
        bgVar.f2872b = mode;
        bgVar.f2873c = true;
        mo4480d();
    }

    /* renamed from: a */
    public void mo4476a(AttributeSet attributeSet, int i) {
        int g;
        C0846bi a = C0846bi.m4625a(this.f3041a.getContext(), attributeSet, C0526a.C0536j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3041a.getDrawable();
            if (!(drawable != null || (g = a.mo4304g(C0526a.C0536j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0616b.m2831b(this.f3041a.getContext(), g)) == null)) {
                this.f3041a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0750ah.m3839a(drawable);
            }
            if (a.mo4305g(C0526a.C0536j.AppCompatImageView_tint)) {
                C0501h.m2337a(this.f3041a, a.mo4301e(C0526a.C0536j.AppCompatImageView_tint));
            }
            if (a.mo4305g(C0526a.C0536j.AppCompatImageView_tintMode)) {
                C0501h.m2338a(this.f3041a, C0750ah.m3838a(a.mo4289a(C0526a.C0536j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4292a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4477a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f3041a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo4478b() {
        C0844bg bgVar = this.f3043c;
        if (bgVar != null) {
            return bgVar.f2871a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo4479c() {
        C0844bg bgVar = this.f3043c;
        if (bgVar != null) {
            return bgVar.f2872b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4480d() {
        Drawable drawable = this.f3041a.getDrawable();
        if (drawable != null) {
            C0750ah.m3839a(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m4894e() || !m4893a(drawable)) {
            C0844bg bgVar = this.f3043c;
            if (bgVar != null || (bgVar = this.f3042b) != null) {
                C0893m.m4866a(drawable, bgVar, this.f3041a.getDrawableState());
            }
        }
    }
}
