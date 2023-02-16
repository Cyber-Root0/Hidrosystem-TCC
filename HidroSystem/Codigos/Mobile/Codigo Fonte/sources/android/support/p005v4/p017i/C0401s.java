package android.support.p005v4.p017i;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.v4.i.s */
public final class C0401s {

    /* renamed from: a */
    static final C0404c f1033a = (Build.VERSION.SDK_INT >= 21 ? new C0403b() : Build.VERSION.SDK_INT >= 18 ? new C0402a() : new C0404c());

    /* renamed from: android.support.v4.i.s$a */
    static class C0402a extends C0404c {
        C0402a() {
        }
    }

    /* renamed from: android.support.v4.i.s$b */
    static class C0403b extends C0402a {
        C0403b() {
        }
    }

    /* renamed from: android.support.v4.i.s$c */
    static class C0404c {
        C0404c() {
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m1774a(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }
}
