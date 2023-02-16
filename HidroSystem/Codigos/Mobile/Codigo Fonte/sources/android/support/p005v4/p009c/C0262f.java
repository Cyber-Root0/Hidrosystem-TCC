package android.support.p005v4.p009c;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.p005v4.p007b.p008a.C0228a;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.c.f */
public class C0262f extends C0260d {

    /* renamed from: a */
    private static final Class f815a;

    /* renamed from: b */
    private static final Constructor f816b;

    /* renamed from: c */
    private static final Method f817c;

    /* renamed from: d */
    private static final Method f818d;

    /* renamed from: e */
    private static final Method f819e;

    /* renamed from: f */
    private static final Method f820f;

    /* renamed from: g */
    private static final Method f821g;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method4 = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method3 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            method5.setAccessible(true);
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        f816b = constructor;
        f815a = cls;
        f817c = method4;
        f818d = method3;
        f819e = method2;
        f820f = method;
        f821g = method5;
    }

    /* renamed from: a */
    private static Typeface m1216a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f815a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f821g.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m1217a() {
        if (f817c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f817c != null;
    }

    /* renamed from: a */
    private static boolean m1218a(Context context, Object obj, String str, int i, int i2, int i3) {
        try {
            return ((Boolean) f817c.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m1219a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f818d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m1220b() {
        try {
            return f816b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static boolean m1221b(Object obj) {
        try {
            return ((Boolean) f819e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static boolean m1222c(Object obj) {
        try {
            return ((Boolean) f820f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1172a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1217a()) {
            return super.mo1172a(context, resources, i, str, i2);
        }
        Object b = m1220b();
        if (!m1218a(context, b, str, 0, -1, -1)) {
            m1222c(b);
            return null;
        } else if (!m1221b(b)) {
            return null;
        } else {
            return m1216a(b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r7 = r11;
        r11 = r10;
        r10 = r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo1173a(android.content.Context r9, android.os.CancellationSignal r10, android.support.p005v4.p015g.C0281b.C0287b[] r11, int r12) {
        /*
            r8 = this;
            int r0 = r11.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = m1217a()
            if (r0 != 0) goto L_0x005c
            android.support.v4.g.b$b r11 = r8.mo1176a((android.support.p005v4.p015g.C0281b.C0287b[]) r11, (int) r12)
            android.content.ContentResolver r9 = r9.getContentResolver()
            android.net.Uri r12 = r11.mo1234a()     // Catch:{ IOException -> 0x005b }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r9 = r9.openFileDescriptor(r12, r0, r10)     // Catch:{ IOException -> 0x005b }
            android.graphics.Typeface$Builder r10 = new android.graphics.Typeface$Builder     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            java.io.FileDescriptor r12 = r9.getFileDescriptor()     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            r10.<init>(r12)     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            int r12 = r11.mo1236c()     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            android.graphics.Typeface$Builder r10 = r10.setWeight(r12)     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            boolean r11 = r11.mo1237d()     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            android.graphics.Typeface$Builder r10 = r10.setItalic(r11)     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            android.graphics.Typeface r10 = r10.build()     // Catch:{ Throwable -> 0x0044, all -> 0x0041 }
            if (r9 == 0) goto L_0x0040
            r9.close()     // Catch:{ IOException -> 0x005b }
        L_0x0040:
            return r10
        L_0x0041:
            r10 = move-exception
            r11 = r2
            goto L_0x004a
        L_0x0044:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r11 = move-exception
            r7 = r11
            r11 = r10
            r10 = r7
        L_0x004a:
            if (r9 == 0) goto L_0x005a
            if (r11 == 0) goto L_0x0057
            r9.close()     // Catch:{ Throwable -> 0x0052 }
            goto L_0x005a
        L_0x0052:
            r9 = move-exception
            r11.addSuppressed(r9)     // Catch:{ IOException -> 0x005b }
            goto L_0x005a
        L_0x0057:
            r9.close()     // Catch:{ IOException -> 0x005b }
        L_0x005a:
            throw r10     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            return r2
        L_0x005c:
            java.util.Map r9 = android.support.p005v4.p015g.C0281b.m1277a((android.content.Context) r9, (android.support.p005v4.p015g.C0281b.C0287b[]) r11, (android.os.CancellationSignal) r10)
            java.lang.Object r10 = m1220b()
            int r12 = r11.length
            r0 = 0
            r3 = 0
        L_0x0067:
            if (r0 >= r12) goto L_0x0092
            r4 = r11[r0]
            android.net.Uri r5 = r4.mo1234a()
            java.lang.Object r5 = r9.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0078
            goto L_0x008f
        L_0x0078:
            int r3 = r4.mo1235b()
            int r6 = r4.mo1236c()
            boolean r4 = r4.mo1237d()
            boolean r3 = m1219a((java.lang.Object) r10, (java.nio.ByteBuffer) r5, (int) r3, (int) r6, (int) r4)
            if (r3 != 0) goto L_0x008e
            m1222c(r10)
            return r2
        L_0x008e:
            r3 = 1
        L_0x008f:
            int r0 = r0 + 1
            goto L_0x0067
        L_0x0092:
            if (r3 != 0) goto L_0x0098
            m1222c(r10)
            return r2
        L_0x0098:
            boolean r9 = m1221b(r10)
            if (r9 != 0) goto L_0x009f
            return r2
        L_0x009f:
            android.graphics.Typeface r9 = m1216a(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p009c.C0262f.mo1173a(android.content.Context, android.os.CancellationSignal, android.support.v4.g.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo1174a(Context context, C0228a.C0230b bVar, Resources resources, int i) {
        if (!m1217a()) {
            return super.mo1174a(context, bVar, resources, i);
        }
        Object b = m1220b();
        for (C0228a.C0231c cVar : bVar.mo1092a()) {
            if (!m1218a(context, b, cVar.mo1093a(), 0, cVar.mo1094b(), cVar.mo1095c() ? 1 : 0)) {
                m1222c(b);
                return null;
            }
        }
        if (!m1221b(b)) {
            return null;
        }
        return m1216a(b);
    }
}
