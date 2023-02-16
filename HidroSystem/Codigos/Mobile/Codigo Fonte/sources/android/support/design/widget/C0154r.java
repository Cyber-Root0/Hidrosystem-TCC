package android.support.design.widget;

import android.widget.ImageButton;

/* renamed from: android.support.design.widget.r */
class C0154r extends ImageButton {

    /* renamed from: a */
    private int f473a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo686a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f473a = i;
        }
    }

    /* access modifiers changed from: package-private */
    public final int getUserSetVisibility() {
        return this.f473a;
    }

    public void setVisibility(int i) {
        mo686a(i, true);
    }
}
