package android.support.p005v4.p006a;

import android.app.Activity;
import android.os.Build;
import android.support.p005v4.p007b.C0227a;

/* renamed from: android.support.v4.a.a */
public class C0155a extends C0227a {
    /* renamed from: a */
    public static void m603a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
