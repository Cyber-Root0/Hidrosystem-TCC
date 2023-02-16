package android.support.p005v4.p007b;

import android.content.Context;
import android.os.Process;
import android.support.p005v4.p006a.C0161b;

/* renamed from: android.support.v4.b.c */
public final class C0238c {
    /* renamed from: a */
    public static int m1114a(Context context, String str) {
        return m1115a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m1115a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0161b.m613a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0161b.m612a(context, a, str2) != 0 ? -2 : 0;
    }
}
