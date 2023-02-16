package android.support.p005v4.widget;

import android.os.Build;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0388q;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.k */
public final class C0507k {

    /* renamed from: a */
    static final C0511d f1354a = (Build.VERSION.SDK_INT >= 23 ? new C0510c() : Build.VERSION.SDK_INT >= 21 ? new C0509b() : Build.VERSION.SDK_INT >= 19 ? new C0508a() : new C0511d());

    /* renamed from: android.support.v4.widget.k$a */
    static class C0508a extends C0511d {
        C0508a() {
        }

        /* renamed from: a */
        public void mo2161a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.k$b */
    static class C0509b extends C0508a {

        /* renamed from: a */
        private static Field f1355a;

        static {
            try {
                f1355a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1355a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        C0509b() {
        }

        /* renamed from: a */
        public void mo2162a(PopupWindow popupWindow, boolean z) {
            Field field = f1355a;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.k$c */
    static class C0510c extends C0509b {
        C0510c() {
        }

        /* renamed from: a */
        public void mo2163a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        /* renamed from: a */
        public void mo2162a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }
    }

    /* renamed from: android.support.v4.widget.k$d */
    static class C0511d {

        /* renamed from: a */
        private static Method f1356a;

        /* renamed from: b */
        private static boolean f1357b;

        C0511d() {
        }

        /* renamed from: a */
        public void mo2163a(PopupWindow popupWindow, int i) {
            if (!f1357b) {
                Class<PopupWindow> cls = PopupWindow.class;
                try {
                    f1356a = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f1356a.setAccessible(true);
                } catch (Exception unused) {
                }
                f1357b = true;
            }
            Method method = f1356a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: a */
        public void mo2161a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0370d.m1575a(i3, C0388q.m1658e(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo2162a(PopupWindow popupWindow, boolean z) {
        }
    }

    /* renamed from: a */
    public static void m2357a(PopupWindow popupWindow, int i) {
        f1354a.mo2163a(popupWindow, i);
    }

    /* renamed from: a */
    public static void m2358a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f1354a.mo2161a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m2359a(PopupWindow popupWindow, boolean z) {
        f1354a.mo2162a(popupWindow, z);
    }
}
