package android.support.p020v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p020v7.view.menu.C0653h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C0679u extends C0653h implements SubMenu {

    /* renamed from: d */
    private C0653h f2029d;

    /* renamed from: e */
    private C0657j f2030e;

    public C0679u(Context context, C0653h hVar, C0657j jVar) {
        super(context);
        this.f2029d = hVar;
        this.f2030e = jVar;
    }

    /* renamed from: a */
    public String mo2688a() {
        C0657j jVar = this.f2030e;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo2688a() + ":" + itemId;
    }

    /* renamed from: a */
    public void mo2690a(C0653h.C0654a aVar) {
        this.f2029d.mo2690a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2696a(C0653h hVar, MenuItem menuItem) {
        return super.mo2696a(hVar, menuItem) || this.f2029d.mo2696a(hVar, menuItem);
    }

    /* renamed from: b */
    public boolean mo2712b() {
        return this.f2029d.mo2712b();
    }

    /* renamed from: c */
    public boolean mo2716c() {
        return this.f2029d.mo2716c();
    }

    /* renamed from: c */
    public boolean mo2717c(C0657j jVar) {
        return this.f2029d.mo2717c(jVar);
    }

    /* renamed from: d */
    public boolean mo2724d(C0657j jVar) {
        return this.f2029d.mo2724d(jVar);
    }

    public MenuItem getItem() {
        return this.f2030e;
    }

    /* renamed from: p */
    public C0653h mo2741p() {
        return this.f2029d.mo2741p();
    }

    /* renamed from: s */
    public Menu mo2925s() {
        return this.f2029d;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo2726e(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo2683a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo2722d(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo2685a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo2684a(view);
    }

    public SubMenu setIcon(int i) {
        this.f2030e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2030e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f2029d.setQwertyMode(z);
    }
}
