package android.support.p005v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.d */
public final class C0489d {

    /* renamed from: a */
    private static final C0492c f1336a = (Build.VERSION.SDK_INT >= 23 ? new C0491b() : Build.VERSION.SDK_INT >= 21 ? new C0490a() : new C0492c());

    /* renamed from: android.support.v4.widget.d$a */
    static class C0490a extends C0492c {
        C0490a() {
        }

        /* renamed from: a */
        public void mo2129a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo2130a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.d$b */
    static class C0491b extends C0490a {
        C0491b() {
        }

        /* renamed from: a */
        public Drawable mo2131a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: android.support.v4.widget.d$c */
    static class C0492c {

        /* renamed from: a */
        private static Field f1337a;

        /* renamed from: b */
        private static boolean f1338b;

        C0492c() {
        }

        /* renamed from: a */
        public Drawable mo2131a(CompoundButton compoundButton) {
            if (!f1338b) {
                try {
                    f1337a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f1337a.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f1338b = true;
            }
            Field field = f1337a;
            if (field != null) {
                try {
                    return (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f1337a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2129a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0520n) {
                ((C0520n) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2130a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            if (compoundButton instanceof C0520n) {
                ((C0520n) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    /* renamed from: a */
    public static Drawable m2310a(CompoundButton compoundButton) {
        return f1336a.mo2131a(compoundButton);
    }

    /* renamed from: a */
    public static void m2311a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f1336a.mo2129a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m2312a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f1336a.mo2130a(compoundButton, mode);
    }
}
