package android.support.p005v4.p006a;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.a.g */
public final class C0168g {

    /* renamed from: android.support.v4.a.g$a */
    static class C0169a {

        /* renamed from: a */
        private static Method f521a;

        /* renamed from: b */
        private static boolean f522b;

        /* renamed from: a */
        public static IBinder m636a(Bundle bundle, String str) {
            if (!f522b) {
                try {
                    f521a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f521a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f522b = true;
            }
            Method method = f521a;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f521a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m635a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0169a.m636a(bundle, str);
    }
}
