package android.support.p020v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.app.C0550a;
import android.support.p020v7.view.C0637i;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.widget.C0738af;
import android.support.p020v7.widget.C0847bj;
import android.support.p020v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.q */
class C0601q extends C0550a {

    /* renamed from: a */
    C0738af f1637a;

    /* renamed from: b */
    boolean f1638b;

    /* renamed from: c */
    Window.Callback f1639c;

    /* renamed from: d */
    private boolean f1640d;

    /* renamed from: e */
    private boolean f1641e;

    /* renamed from: f */
    private ArrayList<C0550a.C0552b> f1642f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f1643g = new Runnable() {
        public void run() {
            C0601q.this.mo2411i();
        }
    };

    /* renamed from: h */
    private final Toolbar.C0725c f1644h = new Toolbar.C0725c() {
        /* renamed from: a */
        public boolean mo2413a(MenuItem menuItem) {
            return C0601q.this.f1639c.onMenuItemSelected(0, menuItem);
        }
    };

    /* renamed from: android.support.v7.app.q$a */
    private final class C0604a implements C0669o.C0670a {

        /* renamed from: b */
        private boolean f1648b;

        C0604a() {
        }

        /* renamed from: a */
        public void mo2384a(C0653h hVar, boolean z) {
            if (!this.f1648b) {
                this.f1648b = true;
                C0601q.this.f1637a.mo3555n();
                if (C0601q.this.f1639c != null) {
                    C0601q.this.f1639c.onPanelClosed(108, hVar);
                }
                this.f1648b = false;
            }
        }

        /* renamed from: a */
        public boolean mo2385a(C0653h hVar) {
            if (C0601q.this.f1639c == null) {
                return false;
            }
            C0601q.this.f1639c.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.q$b */
    private final class C0605b implements C0653h.C0654a {
        C0605b() {
        }

        /* renamed from: a */
        public void mo548a(C0653h hVar) {
            if (C0601q.this.f1639c == null) {
                return;
            }
            if (C0601q.this.f1637a.mo3550i()) {
                C0601q.this.f1639c.onPanelClosed(108, hVar);
            } else if (C0601q.this.f1639c.onPreparePanel(0, (View) null, hVar)) {
                C0601q.this.f1639c.onMenuOpened(108, hVar);
            }
        }

        /* renamed from: a */
        public boolean mo549a(C0653h hVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v7.app.q$c */
    private class C0606c extends C0637i {
        public C0606c(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0601q.this.f1637a.mo3537b()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C0601q.this.f1638b) {
                C0601q.this.f1637a.mo3554m();
                C0601q.this.f1638b = true;
            }
            return onPreparePanel;
        }
    }

    C0601q(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1637a = new C0847bj(toolbar, false);
        this.f1639c = new C0606c(callback);
        this.f1637a.mo3534a(this.f1639c);
        toolbar.setOnMenuItemClickListener(this.f1644h);
        this.f1637a.mo3535a(charSequence);
    }

    /* renamed from: j */
    private Menu m2731j() {
        if (!this.f1640d) {
            this.f1637a.mo3531a((C0669o.C0670a) new C0604a(), (C0653h.C0654a) new C0605b());
            this.f1640d = true;
        }
        return this.f1637a.mo3558q();
    }

    /* renamed from: a */
    public int mo2225a() {
        return this.f1637a.mo3556o();
    }

    /* renamed from: a */
    public void mo2227a(float f) {
        C0388q.m1638a((View) this.f1637a.mo3528a(), f);
    }

    /* renamed from: a */
    public void mo2228a(int i) {
        this.f1637a.mo3544d(i);
    }

    /* renamed from: a */
    public void mo2409a(int i, int i2) {
        this.f1637a.mo3541c((i & i2) | ((i2 ^ -1) & this.f1637a.mo3556o()));
    }

    /* renamed from: a */
    public void mo2229a(Configuration configuration) {
        super.mo2229a(configuration);
    }

    /* renamed from: a */
    public void mo2230a(Drawable drawable) {
        this.f1637a.mo3539b(drawable);
    }

    /* renamed from: a */
    public void mo2231a(CharSequence charSequence) {
        this.f1637a.mo3535a(charSequence);
    }

    /* renamed from: a */
    public void mo2232a(boolean z) {
        mo2409a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public boolean mo2233a(int i, KeyEvent keyEvent) {
        Menu j = m2731j();
        if (j == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        j.setQwertyMode(z);
        return j.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo2234a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2238c();
        }
        return true;
    }

    /* renamed from: b */
    public Context mo2235b() {
        return this.f1637a.mo3537b();
    }

    /* renamed from: b */
    public void mo2236b(boolean z) {
    }

    /* renamed from: c */
    public boolean mo2238c() {
        return this.f1637a.mo3552k();
    }

    /* renamed from: d */
    public void mo2239d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo2240d() {
        return this.f1637a.mo3553l();
    }

    /* renamed from: e */
    public void mo2241e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo2242e() {
        this.f1637a.mo3528a().removeCallbacks(this.f1643g);
        C0388q.m1647a((View) this.f1637a.mo3528a(), this.f1643g);
        return true;
    }

    /* renamed from: f */
    public void mo2243f(boolean z) {
        if (z != this.f1641e) {
            this.f1641e = z;
            int size = this.f1642f.size();
            for (int i = 0; i < size; i++) {
                this.f1642f.get(i).mo2246a(z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo2244f() {
        if (!this.f1637a.mo3542c()) {
            return false;
        }
        this.f1637a.mo3543d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2245g() {
        this.f1637a.mo3528a().removeCallbacks(this.f1643g);
    }

    /* renamed from: h */
    public Window.Callback mo2410h() {
        return this.f1639c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2411i() {
        Menu j = m2731j();
        C0653h hVar = j instanceof C0653h ? (C0653h) j : null;
        if (hVar != null) {
            hVar.mo2729g();
        }
        try {
            j.clear();
            if (!this.f1639c.onCreatePanelMenu(0, j) || !this.f1639c.onPreparePanel(0, (View) null, j)) {
                j.clear();
            }
        } finally {
            if (hVar != null) {
                hVar.mo2731h();
            }
        }
    }
}
