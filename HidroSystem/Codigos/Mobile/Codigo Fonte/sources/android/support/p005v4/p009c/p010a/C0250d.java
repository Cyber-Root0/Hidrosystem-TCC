package android.support.p005v4.p009c.p010a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.p010a.C0247c;

/* renamed from: android.support.v4.c.a.d */
class C0250d extends C0247c {

    /* renamed from: android.support.v4.c.a.d$a */
    private static class C0251a extends C0247c.C0248a {
        C0251a(C0247c.C0248a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0250d(this, resources);
        }
    }

    C0250d(Drawable drawable) {
        super(drawable);
    }

    C0250d(C0247c.C0248a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0247c.C0248a mo1132b() {
        return new C0251a(this.f794b, (Resources) null);
    }

    public boolean isAutoMirrored() {
        return this.f795c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.f795c.setAutoMirrored(z);
    }
}
