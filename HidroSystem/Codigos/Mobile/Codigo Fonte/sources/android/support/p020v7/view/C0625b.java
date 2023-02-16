package android.support.p020v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0625b {

    /* renamed from: a */
    private Object f1728a;

    /* renamed from: b */
    private boolean f1729b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C0626a {
        /* renamed from: a */
        void mo2386a(C0625b bVar);

        /* renamed from: a */
        boolean mo2387a(C0625b bVar, Menu menu);

        /* renamed from: a */
        boolean mo2388a(C0625b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo2389b(C0625b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo2429a();

    /* renamed from: a */
    public abstract void mo2430a(int i);

    /* renamed from: a */
    public abstract void mo2431a(View view);

    /* renamed from: a */
    public abstract void mo2432a(CharSequence charSequence);

    /* renamed from: a */
    public void mo2492a(Object obj) {
        this.f1728a = obj;
    }

    /* renamed from: a */
    public void mo2433a(boolean z) {
        this.f1729b = z;
    }

    /* renamed from: b */
    public abstract Menu mo2434b();

    /* renamed from: b */
    public abstract void mo2435b(int i);

    /* renamed from: b */
    public abstract void mo2436b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo2437c();

    /* renamed from: d */
    public abstract void mo2438d();

    /* renamed from: f */
    public abstract CharSequence mo2440f();

    /* renamed from: g */
    public abstract CharSequence mo2441g();

    /* renamed from: h */
    public boolean mo2442h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo2443i();

    /* renamed from: j */
    public Object mo2493j() {
        return this.f1728a;
    }

    /* renamed from: k */
    public boolean mo2494k() {
        return this.f1729b;
    }
}
