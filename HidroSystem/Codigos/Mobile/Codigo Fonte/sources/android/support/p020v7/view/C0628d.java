package android.support.p020v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.p020v7.p021a.C0526a;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0628d extends ContextWrapper {

    /* renamed from: a */
    private int f1730a;

    /* renamed from: b */
    private Resources.Theme f1731b;

    /* renamed from: c */
    private LayoutInflater f1732c;

    /* renamed from: d */
    private Configuration f1733d;

    /* renamed from: e */
    private Resources f1734e;

    public C0628d() {
        super((Context) null);
    }

    public C0628d(Context context, int i) {
        super(context);
        this.f1730a = i;
    }

    public C0628d(Context context, Resources.Theme theme) {
        super(context);
        this.f1731b = theme;
    }

    /* renamed from: b */
    private Resources m2878b() {
        Resources resources;
        if (this.f1734e == null) {
            if (this.f1733d == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.f1733d).getResources();
            }
            this.f1734e = resources;
        }
        return this.f1734e;
    }

    /* renamed from: c */
    private void m2879c() {
        boolean z = this.f1731b == null;
        if (z) {
            this.f1731b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1731b.setTo(theme);
            }
        }
        mo2498a(this.f1731b, this.f1730a, z);
    }

    /* renamed from: a */
    public int mo2497a() {
        return this.f1730a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2498a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m2878b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1732c == null) {
            this.f1732c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1732c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1731b;
        if (theme != null) {
            return theme;
        }
        if (this.f1730a == 0) {
            this.f1730a = C0526a.C0535i.Theme_AppCompat_Light;
        }
        m2879c();
        return this.f1731b;
    }

    public void setTheme(int i) {
        if (this.f1730a != i) {
            this.f1730a = i;
            m2879c();
        }
    }
}
