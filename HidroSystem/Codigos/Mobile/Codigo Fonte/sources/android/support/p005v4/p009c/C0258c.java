package android.support.p005v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.support.p005v4.p007b.p008a.C0228a;
import android.support.p005v4.p015g.C0281b;
import android.support.p005v4.p016h.C0302g;
import android.widget.TextView;

/* renamed from: android.support.v4.c.c */
public class C0258c {

    /* renamed from: a */
    private static final C0259a f809a = (Build.VERSION.SDK_INT >= 26 ? new C0262f() : (Build.VERSION.SDK_INT < 24 || !C0261e.m1211a()) ? Build.VERSION.SDK_INT >= 21 ? new C0260d() : new C0263g() : new C0261e());

    /* renamed from: b */
    private static final C0302g<String, Typeface> f810b = new C0302g<>(16);

    /* renamed from: android.support.v4.c.c$a */
    interface C0259a {
        /* renamed from: a */
        Typeface mo1172a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: a */
        Typeface mo1173a(Context context, CancellationSignal cancellationSignal, C0281b.C0287b[] bVarArr, int i);

        /* renamed from: a */
        Typeface mo1174a(Context context, C0228a.C0230b bVar, Resources resources, int i);
    }

    /* renamed from: a */
    public static Typeface m1200a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f809a.mo1172a(context, resources, i, str, i2);
        if (a != null) {
            f810b.mo1295a(m1204b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m1201a(Context context, CancellationSignal cancellationSignal, C0281b.C0287b[] bVarArr, int i) {
        return f809a.mo1173a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m1202a(Context context, C0228a.C0229a aVar, Resources resources, int i, int i2, TextView textView) {
        Typeface typeface;
        if (aVar instanceof C0228a.C0232d) {
            C0228a.C0232d dVar = (C0228a.C0232d) aVar;
            typeface = C0281b.m1272a(context, dVar.mo1097a(), textView, dVar.mo1098b(), dVar.mo1099c(), i2);
        } else {
            typeface = f809a.mo1174a(context, (C0228a.C0230b) aVar, resources, i2);
        }
        if (typeface != null) {
            f810b.mo1295a(m1204b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m1203a(Resources resources, int i, int i2) {
        return f810b.mo1294a(m1204b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1204b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
