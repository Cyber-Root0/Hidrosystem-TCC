package android.support.p005v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.g */
public final class C0498g {

    /* renamed from: a */
    private static final C0500b f1351a = (Build.VERSION.SDK_INT >= 21 ? new C0499a() : new C0500b());

    /* renamed from: android.support.v4.widget.g$a */
    static class C0499a extends C0500b {
        C0499a() {
        }

        /* renamed from: a */
        public void mo2156a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: android.support.v4.widget.g$b */
    static class C0500b {
        C0500b() {
        }

        /* renamed from: a */
        public void mo2156a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: a */
    public static void m2333a(EdgeEffect edgeEffect, float f, float f2) {
        f1351a.mo2156a(edgeEffect, f, f2);
    }
}
