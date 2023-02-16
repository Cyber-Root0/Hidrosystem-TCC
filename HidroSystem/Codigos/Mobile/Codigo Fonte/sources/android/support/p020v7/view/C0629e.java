package android.support.p020v7.view;

import android.content.Context;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C0629e extends C0625b implements C0653h.C0654a {

    /* renamed from: a */
    private Context f1735a;

    /* renamed from: b */
    private ActionBarContextView f1736b;

    /* renamed from: c */
    private C0625b.C0626a f1737c;

    /* renamed from: d */
    private WeakReference<View> f1738d;

    /* renamed from: e */
    private boolean f1739e;

    /* renamed from: f */
    private boolean f1740f;

    /* renamed from: g */
    private C0653h f1741g;

    public C0629e(Context context, ActionBarContextView actionBarContextView, C0625b.C0626a aVar, boolean z) {
        this.f1735a = context;
        this.f1736b = actionBarContextView;
        this.f1737c = aVar;
        this.f1741g = new C0653h(actionBarContextView.getContext()).mo2682a(1);
        this.f1741g.mo2690a((C0653h.C0654a) this);
        this.f1740f = z;
    }

    /* renamed from: a */
    public MenuInflater mo2429a() {
        return new C0632g(this.f1736b.getContext());
    }

    /* renamed from: a */
    public void mo2430a(int i) {
        mo2436b((CharSequence) this.f1735a.getString(i));
    }

    /* renamed from: a */
    public void mo548a(C0653h hVar) {
        mo2438d();
        this.f1736b.mo2963a();
    }

    /* renamed from: a */
    public void mo2431a(View view) {
        this.f1736b.setCustomView(view);
        this.f1738d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo2432a(CharSequence charSequence) {
        this.f1736b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo2433a(boolean z) {
        super.mo2433a(z);
        this.f1736b.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo549a(C0653h hVar, MenuItem menuItem) {
        return this.f1737c.mo2388a((C0625b) this, menuItem);
    }

    /* renamed from: b */
    public Menu mo2434b() {
        return this.f1741g;
    }

    /* renamed from: b */
    public void mo2435b(int i) {
        mo2432a((CharSequence) this.f1735a.getString(i));
    }

    /* renamed from: b */
    public void mo2436b(CharSequence charSequence) {
        this.f1736b.setTitle(charSequence);
    }

    /* renamed from: c */
    public void mo2437c() {
        if (!this.f1739e) {
            this.f1739e = true;
            this.f1736b.sendAccessibilityEvent(32);
            this.f1737c.mo2386a(this);
        }
    }

    /* renamed from: d */
    public void mo2438d() {
        this.f1737c.mo2389b(this, this.f1741g);
    }

    /* renamed from: f */
    public CharSequence mo2440f() {
        return this.f1736b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo2441g() {
        return this.f1736b.getSubtitle();
    }

    /* renamed from: h */
    public boolean mo2442h() {
        return this.f1736b.mo2966d();
    }

    /* renamed from: i */
    public View mo2443i() {
        WeakReference<View> weakReference = this.f1738d;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
