package android.support.p005v4.p009c.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.c.a.a */
public final class C0240a {

    /* renamed from: a */
    static final C0245e f788a = (Build.VERSION.SDK_INT >= 23 ? new C0244d() : Build.VERSION.SDK_INT >= 21 ? new C0243c() : Build.VERSION.SDK_INT >= 19 ? new C0242b() : Build.VERSION.SDK_INT >= 17 ? new C0241a() : new C0245e());

    /* renamed from: android.support.v4.c.a.a$a */
    static class C0241a extends C0245e {

        /* renamed from: a */
        private static Method f789a;

        /* renamed from: b */
        private static boolean f790b;

        /* renamed from: c */
        private static Method f791c;

        /* renamed from: d */
        private static boolean f792d;

        C0241a() {
        }

        /* renamed from: a */
        public int mo1113a(Drawable drawable) {
            if (!f792d) {
                try {
                    f791c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f791c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompatApi17", "Failed to retrieve getLayoutDirection() method", e);
                }
                f792d = true;
            }
            Method method = f791c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompatApi17", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f791c = null;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public boolean mo1114a(Drawable drawable, int i) {
            if (!f790b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    f789a = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f789a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f790b = true;
            }
            Method method = f789a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f789a = null;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.c.a.a$b */
    static class C0242b extends C0241a {
        C0242b() {
        }

        /* renamed from: a */
        public void mo1115a(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        /* renamed from: b */
        public boolean mo1116b(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: c */
        public Drawable mo1117c(Drawable drawable) {
            return !(drawable instanceof C0254f) ? new C0250d(drawable) : drawable;
        }

        /* renamed from: d */
        public int mo1118d(Drawable drawable) {
            return drawable.getAlpha();
        }
    }

    /* renamed from: android.support.v4.c.a.a$c */
    static class C0243c extends C0242b {
        C0243c() {
        }

        /* renamed from: a */
        public void mo1119a(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: a */
        public void mo1120a(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1121a(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo1122a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: a */
        public void mo1123a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: a */
        public void mo1124a(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        /* renamed from: b */
        public void mo1125b(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: c */
        public Drawable mo1117c(Drawable drawable) {
            return !(drawable instanceof C0254f) ? new C0252e(drawable) : drawable;
        }

        /* renamed from: e */
        public boolean mo1126e(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: f */
        public ColorFilter mo1127f(Drawable drawable) {
            return drawable.getColorFilter();
        }
    }

    /* renamed from: android.support.v4.c.a.a$d */
    static class C0244d extends C0243c {
        C0244d() {
        }

        /* renamed from: a */
        public int mo1113a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: a */
        public boolean mo1114a(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        /* renamed from: c */
        public Drawable mo1117c(Drawable drawable) {
            return drawable;
        }
    }

    /* renamed from: android.support.v4.c.a.a$e */
    static class C0245e {
        C0245e() {
        }

        /* renamed from: a */
        public int mo1113a(Drawable drawable) {
            return 0;
        }

        /* renamed from: a */
        public void mo1119a(Drawable drawable, float f, float f2) {
        }

        /* renamed from: a */
        public void mo1120a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo1121a(Drawable drawable, ColorStateList colorStateList) {
            if (drawable instanceof C0254f) {
                ((C0254f) drawable).setTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo1122a(Drawable drawable, Resources.Theme theme) {
        }

        /* renamed from: a */
        public void mo1123a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }

        /* renamed from: a */
        public void mo1124a(Drawable drawable, PorterDuff.Mode mode) {
            if (drawable instanceof C0254f) {
                ((C0254f) drawable).setTintMode(mode);
            }
        }

        /* renamed from: a */
        public void mo1115a(Drawable drawable, boolean z) {
        }

        /* renamed from: a */
        public boolean mo1114a(Drawable drawable, int i) {
            return false;
        }

        /* renamed from: b */
        public void mo1125b(Drawable drawable, int i) {
            if (drawable instanceof C0254f) {
                ((C0254f) drawable).setTint(i);
            }
        }

        /* renamed from: b */
        public boolean mo1116b(Drawable drawable) {
            return false;
        }

        /* renamed from: c */
        public Drawable mo1117c(Drawable drawable) {
            return !(drawable instanceof C0254f) ? new C0247c(drawable) : drawable;
        }

        /* renamed from: d */
        public int mo1118d(Drawable drawable) {
            return 0;
        }

        /* renamed from: e */
        public boolean mo1126e(Drawable drawable) {
            return false;
        }

        /* renamed from: f */
        public ColorFilter mo1127f(Drawable drawable) {
            return null;
        }

        /* renamed from: g */
        public void mo1128g(Drawable drawable) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: a */
    public static void m1120a(Drawable drawable) {
        f788a.mo1128g(drawable);
    }

    /* renamed from: a */
    public static void m1121a(Drawable drawable, float f, float f2) {
        f788a.mo1119a(drawable, f, f2);
    }

    /* renamed from: a */
    public static void m1122a(Drawable drawable, int i) {
        f788a.mo1125b(drawable, i);
    }

    /* renamed from: a */
    public static void m1123a(Drawable drawable, int i, int i2, int i3, int i4) {
        f788a.mo1120a(drawable, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m1124a(Drawable drawable, ColorStateList colorStateList) {
        f788a.mo1121a(drawable, colorStateList);
    }

    /* renamed from: a */
    public static void m1125a(Drawable drawable, Resources.Theme theme) {
        f788a.mo1122a(drawable, theme);
    }

    /* renamed from: a */
    public static void m1126a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f788a.mo1123a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: a */
    public static void m1127a(Drawable drawable, PorterDuff.Mode mode) {
        f788a.mo1124a(drawable, mode);
    }

    /* renamed from: a */
    public static void m1128a(Drawable drawable, boolean z) {
        f788a.mo1115a(drawable, z);
    }

    /* renamed from: b */
    public static boolean m1129b(Drawable drawable) {
        return f788a.mo1116b(drawable);
    }

    /* renamed from: b */
    public static boolean m1130b(Drawable drawable, int i) {
        return f788a.mo1114a(drawable, i);
    }

    /* renamed from: c */
    public static int m1131c(Drawable drawable) {
        return f788a.mo1118d(drawable);
    }

    /* renamed from: d */
    public static boolean m1132d(Drawable drawable) {
        return f788a.mo1126e(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m1133e(Drawable drawable) {
        return f788a.mo1127f(drawable);
    }

    /* renamed from: f */
    public static Drawable m1134f(Drawable drawable) {
        return f788a.mo1117c(drawable);
    }

    /* renamed from: g */
    public static int m1135g(Drawable drawable) {
        return f788a.mo1113a(drawable);
    }
}
