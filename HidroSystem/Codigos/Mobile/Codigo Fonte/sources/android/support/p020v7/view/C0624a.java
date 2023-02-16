package android.support.p020v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0624a {

    /* renamed from: a */
    private Context f1727a;

    private C0624a(Context context) {
        this.f1727a = context;
    }

    /* renamed from: a */
    public static C0624a m2847a(Context context) {
        return new C0624a(context);
    }

    /* renamed from: a */
    public int mo2485a() {
        Configuration configuration = this.f1727a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: b */
    public boolean mo2486b() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f1727a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public int mo2487c() {
        return this.f1727a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo2488d() {
        return this.f1727a.getResources().getBoolean(C0526a.C0528b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int mo2489e() {
        TypedArray obtainStyledAttributes = this.f1727a.obtainStyledAttributes((AttributeSet) null, C0526a.C0536j.ActionBar, C0526a.C0527a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0526a.C0536j.ActionBar_height, 0);
        Resources resources = this.f1727a.getResources();
        if (!mo2488d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0526a.C0530d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo2490f() {
        return this.f1727a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int mo2491g() {
        return this.f1727a.getResources().getDimensionPixelSize(C0526a.C0530d.abc_action_bar_stacked_tab_max_width);
    }
}
