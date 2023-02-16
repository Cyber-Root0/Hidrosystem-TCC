package android.support.p005v4.p007b;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: android.support.v4.b.a */
public class C0227a {

    /* renamed from: a */
    private static final Object f769a = new Object();

    /* renamed from: b */
    private static TypedValue f770b;

    /* renamed from: a */
    public static final Drawable m1070a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT < 16) {
            synchronized (f769a) {
                if (f770b == null) {
                    f770b = new TypedValue();
                }
                context.getResources().getValue(i, f770b, true);
                i = f770b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m1071a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: b */
    public static final ColorStateList m1072b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static final int m1073c(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }
}
