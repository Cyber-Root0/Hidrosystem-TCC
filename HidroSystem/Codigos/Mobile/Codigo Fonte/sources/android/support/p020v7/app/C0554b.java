package android.support.p020v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.widget.DrawerLayout;
import android.support.p020v7.app.C0563c;
import android.support.p020v7.p024c.p025a.C0620b;
import android.support.p020v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.app.b */
public class C0554b implements DrawerLayout.C0460c {

    /* renamed from: a */
    boolean f1496a;

    /* renamed from: b */
    View.OnClickListener f1497b;

    /* renamed from: c */
    private final C0556a f1498c;

    /* renamed from: d */
    private final DrawerLayout f1499d;

    /* renamed from: e */
    private C0620b f1500e;

    /* renamed from: f */
    private boolean f1501f;

    /* renamed from: g */
    private Drawable f1502g;

    /* renamed from: h */
    private final int f1503h;

    /* renamed from: i */
    private final int f1504i;

    /* renamed from: j */
    private boolean f1505j;

    /* renamed from: android.support.v7.app.b$a */
    public interface C0556a {
        /* renamed from: a */
        Drawable mo2259a();

        /* renamed from: a */
        void mo2260a(int i);

        /* renamed from: a */
        void mo2261a(Drawable drawable, int i);

        /* renamed from: b */
        Context mo2262b();

        /* renamed from: c */
        boolean mo2263c();
    }

    /* renamed from: android.support.v7.app.b$b */
    public interface C0557b {
        /* renamed from: b */
        C0556a mo2264b();
    }

    /* renamed from: android.support.v7.app.b$c */
    static class C0558c implements C0556a {

        /* renamed from: a */
        final Activity f1507a;

        C0558c(Activity activity) {
            this.f1507a = activity;
        }

        /* renamed from: a */
        public Drawable mo2259a() {
            return null;
        }

        /* renamed from: a */
        public void mo2260a(int i) {
        }

        /* renamed from: a */
        public void mo2261a(Drawable drawable, int i) {
        }

        /* renamed from: b */
        public Context mo2262b() {
            return this.f1507a;
        }

        /* renamed from: c */
        public boolean mo2263c() {
            return true;
        }
    }

    /* renamed from: android.support.v7.app.b$d */
    private static class C0559d implements C0556a {

        /* renamed from: a */
        final Activity f1508a;

        /* renamed from: b */
        C0563c.C0564a f1509b;

        C0559d(Activity activity) {
            this.f1508a = activity;
        }

        /* renamed from: a */
        public Drawable mo2259a() {
            return C0563c.m2526a(this.f1508a);
        }

        /* renamed from: a */
        public void mo2260a(int i) {
            this.f1509b = C0563c.m2527a(this.f1509b, this.f1508a, i);
        }

        /* renamed from: a */
        public void mo2261a(Drawable drawable, int i) {
            ActionBar actionBar = this.f1508a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.f1509b = C0563c.m2528a(this.f1509b, this.f1508a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        /* renamed from: b */
        public Context mo2262b() {
            return this.f1508a;
        }

        /* renamed from: c */
        public boolean mo2263c() {
            ActionBar actionBar = this.f1508a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.b$e */
    private static class C0560e extends C0559d {
        C0560e(Activity activity) {
            super(activity);
        }

        /* renamed from: b */
        public Context mo2262b() {
            ActionBar actionBar = this.f1508a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f1508a;
        }
    }

    /* renamed from: android.support.v7.app.b$f */
    private static class C0561f implements C0556a {

        /* renamed from: a */
        final Activity f1510a;

        C0561f(Activity activity) {
            this.f1510a = activity;
        }

        /* renamed from: a */
        public Drawable mo2259a() {
            TypedArray obtainStyledAttributes = mo2262b().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: a */
        public void mo2260a(int i) {
            ActionBar actionBar = this.f1510a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo2261a(Drawable drawable, int i) {
            ActionBar actionBar = this.f1510a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: b */
        public Context mo2262b() {
            ActionBar actionBar = this.f1510a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f1510a;
        }

        /* renamed from: c */
        public boolean mo2263c() {
            ActionBar actionBar = this.f1510a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.b$g */
    static class C0562g implements C0556a {

        /* renamed from: a */
        final Toolbar f1511a;

        /* renamed from: b */
        final Drawable f1512b;

        /* renamed from: c */
        final CharSequence f1513c;

        C0562g(Toolbar toolbar) {
            this.f1511a = toolbar;
            this.f1512b = toolbar.getNavigationIcon();
            this.f1513c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public Drawable mo2259a() {
            return this.f1512b;
        }

        /* renamed from: a */
        public void mo2260a(int i) {
            if (i == 0) {
                this.f1511a.setNavigationContentDescription(this.f1513c);
            } else {
                this.f1511a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo2261a(Drawable drawable, int i) {
            this.f1511a.setNavigationIcon(drawable);
            mo2260a(i);
        }

        /* renamed from: b */
        public Context mo2262b() {
            return this.f1511a.getContext();
        }

        /* renamed from: c */
        public boolean mo2263c() {
            return true;
        }
    }

    public C0554b(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, (Toolbar) null, drawerLayout, (C0620b) null, i, i2);
    }

    C0554b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0620b bVar, int i, int i2) {
        this.f1501f = true;
        this.f1496a = true;
        this.f1505j = false;
        if (toolbar != null) {
            this.f1498c = new C0562g(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (C0554b.this.f1496a) {
                        C0554b.this.mo2255b();
                    } else if (C0554b.this.f1497b != null) {
                        C0554b.this.f1497b.onClick(view);
                    }
                }
            });
        } else if (activity instanceof C0557b) {
            this.f1498c = ((C0557b) activity).mo2264b();
        } else {
            this.f1498c = Build.VERSION.SDK_INT >= 18 ? new C0561f(activity) : Build.VERSION.SDK_INT >= 14 ? new C0560e(activity) : Build.VERSION.SDK_INT >= 11 ? new C0559d(activity) : new C0558c(activity);
        }
        this.f1499d = drawerLayout;
        this.f1503h = i;
        this.f1504i = i2;
        if (bVar == null) {
            this.f1500e = new C0620b(this.f1498c.mo2262b());
        } else {
            this.f1500e = bVar;
        }
        this.f1502g = mo2257c();
    }

    /* renamed from: a */
    private void m2488a(float f) {
        C0620b bVar;
        boolean z;
        if (f == 1.0f) {
            bVar = this.f1500e;
            z = true;
        } else {
            if (f == 0.0f) {
                bVar = this.f1500e;
                z = false;
            }
            this.f1500e.mo2478c(f);
        }
        bVar.mo2477b(z);
        this.f1500e.mo2478c(f);
    }

    /* renamed from: a */
    public void mo2252a() {
        m2488a(this.f1499d.mo1874g(8388611) ? 1.0f : 0.0f);
        if (this.f1496a) {
            mo2253a((Drawable) this.f1500e, this.f1499d.mo1874g(8388611) ? this.f1504i : this.f1503h);
        }
    }

    /* renamed from: a */
    public void mo1908a(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2253a(Drawable drawable, int i) {
        if (!this.f1505j && !this.f1498c.mo2263c()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f1505j = true;
        }
        this.f1498c.mo2261a(drawable, i);
    }

    /* renamed from: a */
    public void mo1909a(View view) {
        m2488a(1.0f);
        if (this.f1496a) {
            mo2256b(this.f1504i);
        }
    }

    /* renamed from: a */
    public void mo1910a(View view, float f) {
        if (this.f1501f) {
            m2488a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m2488a(0.0f);
        }
    }

    /* renamed from: a */
    public boolean mo2254a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f1496a) {
            return false;
        }
        mo2255b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2255b() {
        int a = this.f1499d.mo1840a(8388611);
        if (this.f1499d.mo1882h(8388611) && a != 2) {
            this.f1499d.mo1872f(8388611);
        } else if (a != 1) {
            this.f1499d.mo1871e(8388611);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2256b(int i) {
        this.f1498c.mo2260a(i);
    }

    /* renamed from: b */
    public void mo1911b(View view) {
        m2488a(0.0f);
        if (this.f1496a) {
            mo2256b(this.f1503h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Drawable mo2257c() {
        return this.f1498c.mo2259a();
    }
}
