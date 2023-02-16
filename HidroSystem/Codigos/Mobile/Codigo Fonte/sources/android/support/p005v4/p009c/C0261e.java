package android.support.p005v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p005v4.p007b.p008a.C0228a;
import android.support.p005v4.p015g.C0281b;
import android.support.p005v4.p016h.C0319m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.c.e */
class C0261e extends C0263g {

    /* renamed from: a */
    private static final Class f811a;

    /* renamed from: b */
    private static final Constructor f812b;

    /* renamed from: c */
    private static final Method f813c;

    /* renamed from: d */
    private static final Method f814d;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f812b = constructor;
        f811a = cls;
        f813c = method;
        f814d = method2;
    }

    C0261e() {
    }

    /* renamed from: a */
    private static Typeface m1210a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f811a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f814d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m1211a() {
        if (f813c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f813c != null;
    }

    /* renamed from: a */
    private static boolean m1212a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f813c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m1213b() {
        try {
            return f812b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1173a(Context context, CancellationSignal cancellationSignal, C0281b.C0287b[] bVarArr, int i) {
        Object b = m1213b();
        C0319m mVar = new C0319m();
        for (C0281b.C0287b bVar : bVarArr) {
            Uri a = bVar.mo1234a();
            ByteBuffer byteBuffer = (ByteBuffer) mVar.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0267h.m1245a(context, cancellationSignal, a);
                mVar.put(a, byteBuffer);
            }
            if (!m1212a(b, byteBuffer, bVar.mo1235b(), bVar.mo1236c(), bVar.mo1237d())) {
                return null;
            }
        }
        return m1210a(b);
    }

    /* renamed from: a */
    public Typeface mo1174a(Context context, C0228a.C0230b bVar, Resources resources, int i) {
        Object b = m1213b();
        for (C0228a.C0231c cVar : bVar.mo1092a()) {
            if (!m1212a(b, C0267h.m1244a(context, resources, cVar.mo1096d()), 0, cVar.mo1094b(), cVar.mo1095c())) {
                return null;
            }
        }
        return m1210a(b);
    }
}
