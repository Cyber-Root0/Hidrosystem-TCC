package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p005v4.p009c.C0239a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bd */
class C0841bd {

    /* renamed from: a */
    static final int[] f2857a = {-16842910};

    /* renamed from: b */
    static final int[] f2858b = {16842908};

    /* renamed from: c */
    static final int[] f2859c = {16843518};

    /* renamed from: d */
    static final int[] f2860d = {16842919};

    /* renamed from: e */
    static final int[] f2861e = {16842912};

    /* renamed from: f */
    static final int[] f2862f = {16842913};

    /* renamed from: g */
    static final int[] f2863g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f2864h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f2865i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f2866j = new int[1];

    /* renamed from: a */
    public static int m4613a(Context context, int i) {
        int[] iArr = f2866j;
        iArr[0] = i;
        C0846bi a = C0846bi.m4624a(context, (AttributeSet) null, iArr);
        try {
            return a.mo4294b(0, 0);
        } finally {
            a.mo4292a();
        }
    }

    /* renamed from: a */
    static int m4614a(Context context, int i, float f) {
        int a = m4613a(context, i);
        return C0239a.m1118b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    private static TypedValue m4615a() {
        TypedValue typedValue = f2865i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2865i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static ColorStateList m4616b(Context context, int i) {
        int[] iArr = f2866j;
        iArr[0] = i;
        C0846bi a = C0846bi.m4624a(context, (AttributeSet) null, iArr);
        try {
            return a.mo4301e(0);
        } finally {
            a.mo4292a();
        }
    }

    /* renamed from: c */
    public static int m4617c(Context context, int i) {
        ColorStateList b = m4616b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f2857a, b.getDefaultColor());
        }
        TypedValue a = m4615a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m4614a(context, i, a.getFloat());
    }
}
