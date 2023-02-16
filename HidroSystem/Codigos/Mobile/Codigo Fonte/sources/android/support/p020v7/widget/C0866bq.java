package android.support.p020v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.p005v4.p017i.C0388q;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.bq */
public class C0866bq {

    /* renamed from: a */
    private static Method f2934a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2934a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f2934a.isAccessible()) {
                    f2934a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m4742a(View view, Rect rect, Rect rect2) {
        Method method = f2934a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4743a(View view) {
        return C0388q.m1658e(view) == 1;
    }

    /* renamed from: b */
    public static void m4744b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            }
        }
    }
}
