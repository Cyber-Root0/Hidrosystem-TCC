package android.support.p020v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.widget.C0489d;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.l */
class C0892l {

    /* renamed from: a */
    private final CompoundButton f3015a;

    /* renamed from: b */
    private ColorStateList f3016b = null;

    /* renamed from: c */
    private PorterDuff.Mode f3017c = null;

    /* renamed from: d */
    private boolean f3018d = false;

    /* renamed from: e */
    private boolean f3019e = false;

    /* renamed from: f */
    private boolean f3020f;

    C0892l(CompoundButton compoundButton) {
        this.f3015a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = android.support.p005v4.widget.C0489d.m2310a(r2.f3015a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4444a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f3015a
            android.graphics.drawable.Drawable r0 = android.support.p005v4.widget.C0489d.m2310a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0892l.mo4444a(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo4445a() {
        return this.f3016b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4446a(ColorStateList colorStateList) {
        this.f3016b = colorStateList;
        this.f3018d = true;
        mo4451d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4447a(PorterDuff.Mode mode) {
        this.f3017c = mode;
        this.f3019e = true;
        mo4451d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4448a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f3015a.getContext().obtainStyledAttributes(attributeSet, C0526a.C0536j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0526a.C0536j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0526a.C0536j.CompoundButton_android_button, 0)) != 0) {
                this.f3015a.setButtonDrawable(C0616b.m2831b(this.f3015a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0526a.C0536j.CompoundButton_buttonTint)) {
                C0489d.m2311a(this.f3015a, obtainStyledAttributes.getColorStateList(C0526a.C0536j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0526a.C0536j.CompoundButton_buttonTintMode)) {
                C0489d.m2312a(this.f3015a, C0750ah.m3838a(obtainStyledAttributes.getInt(C0526a.C0536j.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo4449b() {
        return this.f3017c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4450c() {
        if (this.f3020f) {
            this.f3020f = false;
            return;
        }
        this.f3020f = true;
        mo4451d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4451d() {
        Drawable a = C0489d.m2310a(this.f3015a);
        if (a == null) {
            return;
        }
        if (this.f3018d || this.f3019e) {
            Drawable mutate = C0240a.m1134f(a).mutate();
            if (this.f3018d) {
                C0240a.m1124a(mutate, this.f3016b);
            }
            if (this.f3019e) {
                C0240a.m1127a(mutate, this.f3017c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3015a.getDrawableState());
            }
            this.f3015a.setButtonDrawable(mutate);
        }
    }
}
