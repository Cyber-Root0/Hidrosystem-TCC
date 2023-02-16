package android.support.p020v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p011d.p012a.C0270c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C0680v extends C0674r implements SubMenu {
    C0680v(Context context, C0270c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public C0270c mo2933b() {
        return (C0270c) this.f1864b;
    }

    public void clearHeader() {
        mo2933b().clearHeader();
    }

    public MenuItem getItem() {
        return mo2633a(mo2933b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        mo2933b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo2933b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo2933b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo2933b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo2933b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        mo2933b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo2933b().setIcon(drawable);
        return this;
    }
}
