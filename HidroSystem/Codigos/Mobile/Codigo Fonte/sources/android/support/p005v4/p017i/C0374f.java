package android.support.p005v4.p017i;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.v4.i.f */
public final class C0374f {
    /* renamed from: a */
    public static int m1581a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    /* renamed from: b */
    public static int m1582b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }
}
