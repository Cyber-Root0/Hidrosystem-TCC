package android.support.p005v4.p017i;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.i.c */
public abstract class C0367c {

    /* renamed from: a */
    private final Context f1005a;

    /* renamed from: b */
    private C0368a f1006b;

    /* renamed from: c */
    private C0369b f1007c;

    /* renamed from: android.support.v4.i.c$a */
    public interface C0368a {
        /* renamed from: b */
        void mo1542b(boolean z);
    }

    /* renamed from: android.support.v4.i.c$b */
    public interface C0369b {
        /* renamed from: a */
        void mo1543a(boolean z);
    }

    public C0367c(Context context) {
        this.f1005a = context;
    }

    /* renamed from: a */
    public abstract View mo1531a();

    /* renamed from: a */
    public View mo1532a(MenuItem menuItem) {
        return mo1531a();
    }

    /* renamed from: a */
    public void mo1533a(C0368a aVar) {
        this.f1006b = aVar;
    }

    /* renamed from: a */
    public void mo1534a(C0369b bVar) {
        if (!(this.f1007c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1007c = bVar;
    }

    /* renamed from: a */
    public void mo1535a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo1536a(boolean z) {
        C0368a aVar = this.f1006b;
        if (aVar != null) {
            aVar.mo1542b(z);
        }
    }

    /* renamed from: b */
    public boolean mo1537b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1538c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo1539d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1540e() {
        return false;
    }

    /* renamed from: f */
    public void mo1541f() {
        this.f1007c = null;
        this.f1006b = null;
    }
}
