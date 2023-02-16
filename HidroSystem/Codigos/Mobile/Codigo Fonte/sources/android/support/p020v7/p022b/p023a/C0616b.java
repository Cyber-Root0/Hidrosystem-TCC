package android.support.p020v7.p022b.p023a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p007b.C0227a;
import android.support.p020v7.widget.C0893m;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.b.a.b */
public final class C0616b {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1707a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0617a>> f1708b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f1709c = new Object();

    /* renamed from: android.support.v7.b.a.b$a */
    private static class C0617a {

        /* renamed from: a */
        final ColorStateList f1710a;

        /* renamed from: b */
        final Configuration f1711b;

        C0617a(ColorStateList colorStateList, Configuration configuration) {
            this.f1710a = colorStateList;
            this.f1711b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m2828a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m2833d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m2832c(context, i);
        if (c == null) {
            return C0227a.m1072b(context, i);
        }
        m2830a(context, i, c);
        return c;
    }

    /* renamed from: a */
    private static TypedValue m2829a() {
        TypedValue typedValue = f1707a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1707a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m2830a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1709c) {
            SparseArray sparseArray = f1708b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f1708b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0617a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m2831b(Context context, int i) {
        return C0893m.m4863a().mo4452a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m2832c(Context context, int i) {
        if (m2834e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0615a.m2824a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2833d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f1709c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.b.a.b$a>> r1 = f1708b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.b.a.b$a r2 = (android.support.p020v7.p022b.p023a.C0616b.C0617a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f1711b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f1710a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.p022b.p023a.C0616b.m2833d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    private static boolean m2834e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m2829a();
        resources.getValue(i, a, true);
        return a.type >= 28 && a.type <= 31;
    }
}
