package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p007b.p008a.C0233b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bi */
public class C0846bi {

    /* renamed from: a */
    private final Context f2876a;

    /* renamed from: b */
    private final TypedArray f2877b;

    /* renamed from: c */
    private TypedValue f2878c;

    private C0846bi(Context context, TypedArray typedArray) {
        this.f2876a = context;
        this.f2877b = typedArray;
    }

    /* renamed from: a */
    public static C0846bi m4623a(Context context, int i, int[] iArr) {
        return new C0846bi(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0846bi m4624a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0846bi(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0846bi m4625a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0846bi(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo4288a(int i, float f) {
        return this.f2877b.getFloat(i, f);
    }

    /* renamed from: a */
    public int mo4289a(int i, int i2) {
        return this.f2877b.getInt(i, i2);
    }

    /* renamed from: a */
    public Typeface mo4290a(int i, int i2, TextView textView) {
        int resourceId = this.f2877b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2878c == null) {
            this.f2878c = new TypedValue();
        }
        return C0233b.m1089a(this.f2876a, resourceId, this.f2878c, i2, textView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f2877b.getResourceId(r3, 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo4291a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2877b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f2877b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f2876a
            android.graphics.drawable.Drawable r3 = android.support.p020v7.p022b.p023a.C0616b.m2831b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f2877b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0846bi.mo4291a(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public void mo4292a() {
        this.f2877b.recycle();
    }

    /* renamed from: a */
    public boolean mo4293a(int i, boolean z) {
        return this.f2877b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo4294b(int i, int i2) {
        return this.f2877b.getColor(i, i2);
    }

    /* renamed from: b */
    public Drawable mo4295b(int i) {
        int resourceId;
        if (!this.f2877b.hasValue(i) || (resourceId = this.f2877b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0893m.m4863a().mo4453a(this.f2876a, resourceId, true);
    }

    /* renamed from: c */
    public int mo4296c(int i, int i2) {
        return this.f2877b.getInteger(i, i2);
    }

    /* renamed from: c */
    public CharSequence mo4297c(int i) {
        return this.f2877b.getText(i);
    }

    /* renamed from: d */
    public int mo4298d(int i, int i2) {
        return this.f2877b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public String mo4299d(int i) {
        return this.f2877b.getString(i);
    }

    /* renamed from: e */
    public int mo4300e(int i, int i2) {
        return this.f2877b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = android.support.p020v7.p022b.p023a.C0616b.m2828a(r2.f2876a, (r0 = r2.f2877b.getResourceId(r3, 0)));
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo4301e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2877b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f2877b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f2876a
            android.content.res.ColorStateList r0 = android.support.p020v7.p022b.p023a.C0616b.m2828a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f2877b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0846bi.mo4301e(int):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    public int mo4302f(int i, int i2) {
        return this.f2877b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo4303f(int i) {
        return this.f2877b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo4304g(int i, int i2) {
        return this.f2877b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo4305g(int i) {
        return this.f2877b.hasValue(i);
    }
}
