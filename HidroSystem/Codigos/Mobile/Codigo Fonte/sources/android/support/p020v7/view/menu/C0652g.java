package android.support.p020v7.view.menu;

import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0671p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0652g extends BaseAdapter {

    /* renamed from: a */
    static final int f1913a = C0526a.C0533g.abc_popup_menu_item_layout;

    /* renamed from: b */
    C0653h f1914b;

    /* renamed from: c */
    private int f1915c = -1;

    /* renamed from: d */
    private boolean f1916d;

    /* renamed from: e */
    private final boolean f1917e;

    /* renamed from: f */
    private final LayoutInflater f1918f;

    public C0652g(C0653h hVar, LayoutInflater layoutInflater, boolean z) {
        this.f1917e = z;
        this.f1918f = layoutInflater;
        this.f1914b = hVar;
        mo2675b();
    }

    /* renamed from: a */
    public C0653h mo2672a() {
        return this.f1914b;
    }

    /* renamed from: a */
    public C0657j getItem(int i) {
        ArrayList<C0657j> l = this.f1917e ? this.f1914b.mo2737l() : this.f1914b.mo2733i();
        int i2 = this.f1915c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return l.get(i);
    }

    /* renamed from: a */
    public void mo2674a(boolean z) {
        this.f1916d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2675b() {
        C0657j r = this.f1914b.mo2745r();
        if (r != null) {
            ArrayList<C0657j> l = this.f1914b.mo2737l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (l.get(i) == r) {
                    this.f1915c = i;
                    return;
                }
            }
        }
        this.f1915c = -1;
    }

    public int getCount() {
        ArrayList<C0657j> l = this.f1917e ? this.f1914b.mo2737l() : this.f1914b.mo2733i();
        return this.f1915c < 0 ? l.size() : l.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1918f.inflate(f1913a, viewGroup, false);
        }
        C0671p.C0672a aVar = (C0671p.C0672a) view;
        if (this.f1916d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.mo187a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo2675b();
        super.notifyDataSetChanged();
    }
}
