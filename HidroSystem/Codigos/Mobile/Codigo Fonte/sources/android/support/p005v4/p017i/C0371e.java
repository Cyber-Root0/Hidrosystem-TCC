package android.support.p005v4.p017i;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.i.e */
public final class C0371e {

    /* renamed from: a */
    static final C0373b f1008a = (Build.VERSION.SDK_INT >= 21 ? new C0372a() : new C0373b());

    /* renamed from: b */
    private static Field f1009b;

    /* renamed from: c */
    private static boolean f1010c;

    /* renamed from: android.support.v4.i.e$a */
    static class C0372a extends C0373b {
        C0372a() {
        }

        /* renamed from: a */
        public void mo1544a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: android.support.v4.i.e$b */
    static class C0373b {
        C0373b() {
        }

        /* renamed from: a */
        public void mo1544a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                C0371e.m1577a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                C0371e.m1577a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: a */
    static void m1577a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f1010c) {
            try {
                f1009b = LayoutInflater.class.getDeclaredField("mFactory2");
                f1009b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f1010c = true;
        }
        Field field = f1009b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m1578b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        f1008a.mo1544a(layoutInflater, factory2);
    }
}
