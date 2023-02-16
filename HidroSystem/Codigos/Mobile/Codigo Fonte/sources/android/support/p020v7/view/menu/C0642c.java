package android.support.p020v7.view.menu;

import android.content.Context;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p011d.p012a.C0270c;
import android.support.p005v4.p016h.C0294a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0642c<T> extends C0643d<T> {

    /* renamed from: a */
    final Context f1861a;

    /* renamed from: c */
    private Map<C0269b, MenuItem> f1862c;

    /* renamed from: d */
    private Map<C0270c, SubMenu> f1863d;

    C0642c(Context context, T t) {
        super(t);
        this.f1861a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo2633a(MenuItem menuItem) {
        if (!(menuItem instanceof C0269b)) {
            return menuItem;
        }
        C0269b bVar = (C0269b) menuItem;
        if (this.f1862c == null) {
            this.f1862c = new C0294a();
        }
        MenuItem menuItem2 = this.f1862c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0673q.m3189a(this.f1861a, bVar);
        this.f1862c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo2634a(SubMenu subMenu) {
        if (!(subMenu instanceof C0270c)) {
            return subMenu;
        }
        C0270c cVar = (C0270c) subMenu;
        if (this.f1863d == null) {
            this.f1863d = new C0294a();
        }
        SubMenu subMenu2 = this.f1863d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = C0673q.m3190a(this.f1861a, cVar);
        this.f1863d.put(cVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2635a() {
        Map<C0269b, MenuItem> map = this.f1862c;
        if (map != null) {
            map.clear();
        }
        Map<C0270c, SubMenu> map2 = this.f1863d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2636a(int i) {
        Map<C0269b, MenuItem> map = this.f1862c;
        if (map != null) {
            Iterator<C0269b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2637b(int i) {
        Map<C0269b, MenuItem> map = this.f1862c;
        if (map != null) {
            Iterator<C0269b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
