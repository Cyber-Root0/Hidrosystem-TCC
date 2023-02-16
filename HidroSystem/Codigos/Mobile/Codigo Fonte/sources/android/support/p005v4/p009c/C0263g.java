package android.support.p005v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p005v4.p007b.p008a.C0228a;
import android.support.p005v4.p009c.C0258c;
import android.support.p005v4.p015g.C0281b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.c.g */
class C0263g implements C0258c.C0259a {

    /* renamed from: android.support.v4.c.g$a */
    private interface C0266a<T> {
        /* renamed from: a */
        boolean mo1178a(T t);

        /* renamed from: b */
        int mo1179b(T t);
    }

    C0263g() {
    }

    /* renamed from: a */
    private C0228a.C0231c m1226a(C0228a.C0230b bVar, int i) {
        return (C0228a.C0231c) m1227a(bVar.mo1092a(), i, new C0266a<C0228a.C0231c>() {
            /* renamed from: a */
            public int mo1179b(C0228a.C0231c cVar) {
                return cVar.mo1094b();
            }

            /* renamed from: b */
            public boolean mo1178a(C0228a.C0231c cVar) {
                return cVar.mo1095c();
            }
        });
    }

    /* renamed from: a */
    private static <T> T m1227a(T[] tArr, int i, C0266a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo1179b(t2) - i2) * 2) + (aVar.mo1178a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo1172a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0267h.m1243a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0267h.m1248a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo1173a(Context context, CancellationSignal cancellationSignal, C0281b.C0287b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo1176a(bVarArr, i).mo1234a());
            try {
                Typeface a = mo1175a(context, inputStream);
                C0267h.m1247a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0267h.m1247a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0267h.m1247a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0267h.m1247a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0267h.m1247a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo1174a(Context context, C0228a.C0230b bVar, Resources resources, int i) {
        C0228a.C0231c a = m1226a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0258c.m1200a(context, resources, a.mo1096d(), a.mo1093a(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1175a(Context context, InputStream inputStream) {
        File a = C0267h.m1243a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0267h.m1249a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0281b.C0287b mo1176a(C0281b.C0287b[] bVarArr, int i) {
        return (C0281b.C0287b) m1227a(bVarArr, i, new C0266a<C0281b.C0287b>() {
            /* renamed from: a */
            public int mo1179b(C0281b.C0287b bVar) {
                return bVar.mo1236c();
            }

            /* renamed from: b */
            public boolean mo1178a(C0281b.C0287b bVar) {
                return bVar.mo1237d();
            }
        });
    }
}
