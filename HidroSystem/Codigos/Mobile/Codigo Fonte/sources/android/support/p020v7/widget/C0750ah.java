package android.support.p020v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.p005v4.p009c.p010a.C0246b;
import android.support.p020v7.p024c.p025a.C0619a;

/* renamed from: android.support.v7.widget.ah */
public class C0750ah {

    /* renamed from: a */
    public static final Rect f2444a = new Rect();

    /* renamed from: b */
    private static Class<?> f2445b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2445b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static PorterDuff.Mode m3838a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.valueOf("ADD") : mode;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    static void m3839a(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m3841c(drawable);
        }
    }

    /* renamed from: b */
    public static boolean m3840b(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable b : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m3840b(b)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof C0246b) {
            drawable2 = ((C0246b) drawable).mo1129a();
        } else if (drawable instanceof C0619a) {
            drawable2 = ((C0619a) drawable).mo2445b();
        } else if (!(drawable instanceof ScaleDrawable)) {
            return true;
        } else {
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return m3840b(drawable2);
    }

    /* renamed from: c */
    private static void m3841c(Drawable drawable) {
        int[] state = drawable.getState();
        drawable.setState((state == null || state.length == 0) ? C0841bd.f2861e : C0841bd.f2864h);
        drawable.setState(state);
    }
}
