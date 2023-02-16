package android.support.p005v4.p017i;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: android.support.v4.i.r */
public final class C0400r {

    /* renamed from: a */
    private static Method f1032a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1032a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static float m1771a(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : m1773c(viewConfiguration, context);
    }

    /* renamed from: b */
    public static float m1772b(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : m1773c(viewConfiguration, context);
    }

    /* renamed from: c */
    private static float m1773c(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f1032a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
