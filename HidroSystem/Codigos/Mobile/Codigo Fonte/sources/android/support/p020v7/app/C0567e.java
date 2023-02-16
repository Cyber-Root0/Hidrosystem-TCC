package android.support.p020v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p005v4.p006a.C0155a;
import android.support.p005v4.p006a.C0157ab;
import android.support.p005v4.p006a.C0176i;
import android.support.p005v4.p006a.C0223w;
import android.support.p020v7.app.C0554b;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.widget.C0859bn;
import android.support.p020v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.e */
public class C0567e extends C0176i implements C0157ab.C0158a, C0554b.C0557b, C0568f {

    /* renamed from: l */
    private C0569g f1521l;

    /* renamed from: m */
    private int f1522m = 0;

    /* renamed from: n */
    private Resources f1523n;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2537a(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.C0567e.m2537a(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public C0625b mo2276a(C0625b.C0626a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2277a(C0157ab abVar) {
        abVar.mo690a((Activity) this);
    }

    /* renamed from: a */
    public void mo2278a(C0625b bVar) {
    }

    /* renamed from: a */
    public void mo2279a(Toolbar toolbar) {
        mo2294j().mo2309a(toolbar);
    }

    /* renamed from: a */
    public boolean mo2280a(Intent intent) {
        return C0223w.m1061a((Activity) this, intent);
    }

    /* renamed from: a_ */
    public Intent mo696a_() {
        return C0223w.m1059a(this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2294j().mo2316b(view, layoutParams);
    }

    /* renamed from: b */
    public C0554b.C0556a mo2264b() {
        return mo2294j().mo2324h();
    }

    /* renamed from: b */
    public void mo2282b(Intent intent) {
        C0223w.m1064b((Activity) this, intent);
    }

    /* renamed from: b */
    public void mo2283b(C0157ab abVar) {
    }

    /* renamed from: b */
    public void mo2284b(C0625b bVar) {
    }

    public void closeOptionsMenu() {
        C0550a g = mo2288g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo2240d()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public void mo841d() {
        mo2294j().mo2322f();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0550a g = mo2288g();
        if (keyCode != 82 || g == null || !g.mo2234a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo2294j().mo2306a(i);
    }

    /* renamed from: g */
    public C0550a mo2288g() {
        return mo2294j().mo2305a();
    }

    public MenuInflater getMenuInflater() {
        return mo2294j().mo2313b();
    }

    public Resources getResources() {
        if (this.f1523n == null && C0859bn.m4704a()) {
            this.f1523n = new C0859bn(this, super.getResources());
        }
        Resources resources = this.f1523n;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public boolean mo2291h() {
        Intent a_ = mo696a_();
        if (a_ == null) {
            return false;
        }
        if (mo2280a(a_)) {
            C0157ab a = C0157ab.m605a((Context) this);
            mo2277a(a);
            mo2283b(a);
            a.mo693a();
            try {
                C0155a.m603a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo2282b(a_);
            return true;
        }
    }

    @Deprecated
    /* renamed from: i */
    public void mo2292i() {
    }

    public void invalidateOptionsMenu() {
        mo2294j().mo2322f();
    }

    /* renamed from: j */
    public C0569g mo2294j() {
        if (this.f1521l == null) {
            this.f1521l = C0569g.m2556a((Activity) this, (C0568f) this);
        }
        return this.f1521l;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo2294j().mo2307a(configuration);
        if (this.f1523n != null) {
            this.f1523n.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo2292i();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0569g j = mo2294j();
        j.mo2325i();
        j.mo2308a(bundle);
        if (j.mo2326j() && this.f1522m != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1522m, false);
            } else {
                setTheme(this.f1522m);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo2294j().mo2323g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m2537a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0550a g = mo2288g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.mo2225a() & 4) == 0) {
            return false;
        }
        return mo2291h();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo2294j().mo2315b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2294j().mo2321e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2294j().mo2318c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo2294j().mo2317c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2294j().mo2320d();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo2294j().mo2312a(charSequence);
    }

    public void openOptionsMenu() {
        C0550a g = mo2288g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo2238c()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo2294j().mo2314b(i);
    }

    public void setContentView(View view) {
        mo2294j().mo2310a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2294j().mo2311a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f1522m = i;
    }
}
