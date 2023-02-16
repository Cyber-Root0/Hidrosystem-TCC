package android.support.p020v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p020v7.app.C0570h;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.view.C0630f;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;

/* renamed from: android.support.v7.app.k */
class C0577k extends C0576j {

    /* renamed from: t */
    private int f1548t = -100;

    /* renamed from: u */
    private boolean f1549u;

    /* renamed from: v */
    private boolean f1550v = true;

    /* renamed from: w */
    private C0579b f1551w;

    /* renamed from: android.support.v7.app.k$a */
    class C0578a extends C0570h.C0573b {
        C0578a(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo2352a(ActionMode.Callback callback) {
            C0630f.C0631a aVar = new C0630f.C0631a(C0577k.this.f1529a, callback);
            C0625b b = C0577k.this.mo2365b((C0625b.C0626a) aVar);
            if (b != null) {
                return aVar.mo2522b(b);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C0577k.this.mo2337p() ? mo2352a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* renamed from: android.support.v7.app.k$b */
    final class C0579b {

        /* renamed from: b */
        private C0608s f1554b;

        /* renamed from: c */
        private boolean f1555c;

        /* renamed from: d */
        private BroadcastReceiver f1556d;

        /* renamed from: e */
        private IntentFilter f1557e;

        C0579b(C0608s sVar) {
            this.f1554b = sVar;
            this.f1555c = sVar.mo2416a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo2354a() {
            this.f1555c = this.f1554b.mo2416a();
            return this.f1555c ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo2355b() {
            boolean a = this.f1554b.mo2416a();
            if (a != this.f1555c) {
                this.f1555c = a;
                C0577k.this.mo2326j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo2356c() {
            mo2357d();
            if (this.f1556d == null) {
                this.f1556d = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C0579b.this.mo2355b();
                    }
                };
            }
            if (this.f1557e == null) {
                this.f1557e = new IntentFilter();
                this.f1557e.addAction("android.intent.action.TIME_SET");
                this.f1557e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1557e.addAction("android.intent.action.TIME_TICK");
            }
            C0577k.this.f1529a.registerReceiver(this.f1556d, this.f1557e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo2357d() {
            if (this.f1556d != null) {
                C0577k.this.f1529a.unregisterReceiver(this.f1556d);
                this.f1556d = null;
            }
        }
    }

    C0577k(Context context, Window window, C0568f fVar) {
        super(context, window, fVar);
    }

    /* renamed from: h */
    private boolean m2614h(int i) {
        Resources resources = this.f1529a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2617z()) {
            ((Activity) this.f1529a).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0600p.m2726a(resources);
        return true;
    }

    /* renamed from: x */
    private int m2615x() {
        int i = this.f1548t;
        return i != -100 ? i : m2559k();
    }

    /* renamed from: y */
    private void m2616y() {
        if (this.f1551w == null) {
            this.f1551w = new C0579b(C0608s.m2762a(this.f1529a));
        }
    }

    /* renamed from: z */
    private boolean m2617z() {
        if (!this.f1549u || !(this.f1529a instanceof Activity)) {
            return false;
        }
        try {
            return (this.f1529a.getPackageManager().getActivityInfo(new ComponentName(this.f1529a, this.f1529a.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2328a(Window.Callback callback) {
        return new C0578a(callback);
    }

    /* renamed from: a */
    public void mo2308a(Bundle bundle) {
        super.mo2308a(bundle);
        if (bundle != null && this.f1548t == -100) {
            this.f1548t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: c */
    public void mo2317c() {
        super.mo2317c();
        mo2326j();
    }

    /* renamed from: c */
    public void mo2318c(Bundle bundle) {
        super.mo2318c(bundle);
        int i = this.f1548t;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2351d(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        m2616y();
        return this.f1551w.mo2354a();
    }

    /* renamed from: d */
    public void mo2320d() {
        super.mo2320d();
        C0579b bVar = this.f1551w;
        if (bVar != null) {
            bVar.mo2357d();
        }
    }

    /* renamed from: g */
    public void mo2323g() {
        super.mo2323g();
        C0579b bVar = this.f1551w;
        if (bVar != null) {
            bVar.mo2357d();
        }
    }

    /* renamed from: j */
    public boolean mo2326j() {
        int x = m2615x();
        int d = mo2351d(x);
        boolean h = d != -1 ? m2614h(d) : false;
        if (x == 0) {
            m2616y();
            this.f1551w.mo2356c();
        }
        this.f1549u = true;
        return h;
    }

    /* renamed from: p */
    public boolean mo2337p() {
        return this.f1550v;
    }
}
