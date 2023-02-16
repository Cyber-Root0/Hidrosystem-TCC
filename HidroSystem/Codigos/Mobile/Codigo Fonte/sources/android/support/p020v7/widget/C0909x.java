package android.support.p020v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.x */
class C0909x extends C0905t {

    /* renamed from: a */
    private final SeekBar f3061a;

    /* renamed from: b */
    private Drawable f3062b;

    /* renamed from: c */
    private ColorStateList f3063c = null;

    /* renamed from: d */
    private PorterDuff.Mode f3064d = null;

    /* renamed from: e */
    private boolean f3065e = false;

    /* renamed from: f */
    private boolean f3066f = false;

    C0909x(SeekBar seekBar) {
        super(seekBar);
        this.f3061a = seekBar;
    }

    /* renamed from: d */
    private void m4911d() {
        if (this.f3062b == null) {
            return;
        }
        if (this.f3065e || this.f3066f) {
            this.f3062b = C0240a.m1134f(this.f3062b.mutate());
            if (this.f3065e) {
                C0240a.m1124a(this.f3062b, this.f3063c);
            }
            if (this.f3066f) {
                C0240a.m1127a(this.f3062b, this.f3064d);
            }
            if (this.f3062b.isStateful()) {
                this.f3062b.setState(this.f3061a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4511a(Canvas canvas) {
        if (this.f3062b != null) {
            int max = this.f3061a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3062b.getIntrinsicWidth();
                int intrinsicHeight = this.f3062b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f3062b.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f3061a.getWidth() - this.f3061a.getPaddingLeft()) - this.f3061a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3061a.getPaddingLeft(), (float) (this.f3061a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3062b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4512a(Drawable drawable) {
        Drawable drawable2 = this.f3062b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3062b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3061a);
            C0240a.m1130b(drawable, C0388q.m1658e(this.f3061a));
            if (drawable.isStateful()) {
                drawable.setState(this.f3061a.getDrawableState());
            }
            m4911d();
        }
        this.f3061a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4501a(AttributeSet attributeSet, int i) {
        super.mo4501a(attributeSet, i);
        C0846bi a = C0846bi.m4625a(this.f3061a.getContext(), attributeSet, C0526a.C0536j.AppCompatSeekBar, i, 0);
        Drawable b = a.mo4295b(C0526a.C0536j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f3061a.setThumb(b);
        }
        mo4512a(a.mo4291a(C0526a.C0536j.AppCompatSeekBar_tickMark));
        if (a.mo4305g(C0526a.C0536j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3064d = C0750ah.m3838a(a.mo4289a(C0526a.C0536j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3064d);
            this.f3066f = true;
        }
        if (a.mo4305g(C0526a.C0536j.AppCompatSeekBar_tickMarkTint)) {
            this.f3063c = a.mo4301e(C0526a.C0536j.AppCompatSeekBar_tickMarkTint);
            this.f3065e = true;
        }
        a.mo4292a();
        m4911d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4513b() {
        Drawable drawable = this.f3062b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4514c() {
        Drawable drawable = this.f3062b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3061a.getDrawableState())) {
            this.f3061a.invalidateDrawable(drawable);
        }
    }
}
