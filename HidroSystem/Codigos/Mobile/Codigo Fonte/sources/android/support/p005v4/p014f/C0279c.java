package android.support.p005v4.p014f;

import android.os.Build;
import android.os.Trace;

/* renamed from: android.support.v4.f.c */
public final class C0279c {
    /* renamed from: a */
    public static void m1262a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m1263a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
