package android.support.p020v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.p005v4.p011d.p012a.C0268a;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p011d.p012a.C0270c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0673q {
    /* renamed from: a */
    public static Menu m3188a(Context context, C0268a aVar) {
        return new C0674r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m3189a(Context context, C0269b bVar) {
        return Build.VERSION.SDK_INT >= 16 ? new C0664l(context, bVar) : new C0659k(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m3190a(Context context, C0270c cVar) {
        return new C0680v(context, cVar);
    }
}
