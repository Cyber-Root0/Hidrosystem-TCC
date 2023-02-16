package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p020v7.p021a.C0526a;

/* renamed from: android.support.design.widget.m */
class C0149m {

    /* renamed from: a */
    private static final int[] f461a = {C0526a.C0527a.colorPrimary};

    /* renamed from: a */
    static void m588a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f461a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
