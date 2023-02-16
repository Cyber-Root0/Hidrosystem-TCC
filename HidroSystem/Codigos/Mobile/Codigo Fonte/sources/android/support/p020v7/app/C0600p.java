package android.support.p020v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.p */
class C0600p {

    /* renamed from: a */
    private static Field f1629a;

    /* renamed from: b */
    private static boolean f1630b;

    /* renamed from: c */
    private static Class f1631c;

    /* renamed from: d */
    private static boolean f1632d;

    /* renamed from: e */
    private static Field f1633e;

    /* renamed from: f */
    private static boolean f1634f;

    /* renamed from: g */
    private static Field f1635g;

    /* renamed from: h */
    private static boolean f1636h;

    /* renamed from: a */
    static boolean m2726a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m2730d(resources);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return m2729c(resources);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return m2728b(resources);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2727a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1632d) {
            try {
                f1631c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1632d = true;
        }
        Class cls = f1631c;
        if (cls == null) {
            return false;
        }
        if (!f1634f) {
            try {
                f1633e = cls.getDeclaredField("mUnthemedEntries");
                f1633e.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f1634f = true;
        }
        Field field = f1633e;
        if (field == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    /* renamed from: b */
    private static boolean m2728b(Resources resources) {
        Map map;
        if (!f1630b) {
            try {
                f1629a = Resources.class.getDeclaredField("mDrawableCache");
                f1629a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1630b = true;
        }
        Field field = f1629a;
        if (field == null) {
            return false;
        }
        try {
            map = (Map) field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            map = null;
        }
        if (map == null) {
            return false;
        }
        map.clear();
        return true;
    }

    /* renamed from: c */
    private static boolean m2729c(Resources resources) {
        if (!f1630b) {
            try {
                f1629a = Resources.class.getDeclaredField("mDrawableCache");
                f1629a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1630b = true;
        }
        Object obj = null;
        Field field = f1629a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        return (obj == null || obj == null || !m2727a(obj)) ? false : true;
    }

    /* renamed from: d */
    private static boolean m2730d(Resources resources) {
        Object obj;
        if (!f1636h) {
            try {
                f1635g = Resources.class.getDeclaredField("mResourcesImpl");
                f1635g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1636h = true;
        }
        Field field = f1635g;
        if (field == null) {
            return false;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f1630b) {
            try {
                f1629a = obj.getClass().getDeclaredField("mDrawableCache");
                f1629a.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f1630b = true;
        }
        Field field2 = f1629a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        return obj2 != null && m2727a(obj2);
    }
}
