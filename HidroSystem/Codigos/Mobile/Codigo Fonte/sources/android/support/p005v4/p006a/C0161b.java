package android.support.p005v4.p006a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: android.support.v4.a.b */
public final class C0161b {
    /* renamed from: a */
    public static int m612a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }

    /* renamed from: a */
    public static String m613a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
