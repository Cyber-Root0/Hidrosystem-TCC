package android.support.p020v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0671p;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C0650f implements C0669o, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1901a;

    /* renamed from: b */
    LayoutInflater f1902b;

    /* renamed from: c */
    C0653h f1903c;

    /* renamed from: d */
    ExpandedMenuView f1904d;

    /* renamed from: e */
    int f1905e;

    /* renamed from: f */
    int f1906f;

    /* renamed from: g */
    int f1907g;

    /* renamed from: h */
    C0651a f1908h;

    /* renamed from: i */
    private C0669o.C0670a f1909i;

    /* renamed from: j */
    private int f1910j;

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C0651a extends BaseAdapter {

        /* renamed from: b */
        private int f1912b = -1;

        public C0651a() {
            mo2666a();
        }

        /* renamed from: a */
        public C0657j getItem(int i) {
            ArrayList<C0657j> l = C0650f.this.f1903c.mo2737l();
            int i2 = i + C0650f.this.f1905e;
            int i3 = this.f1912b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return l.get(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2666a() {
            C0657j r = C0650f.this.f1903c.mo2745r();
            if (r != null) {
                ArrayList<C0657j> l = C0650f.this.f1903c.mo2737l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (l.get(i) == r) {
                        this.f1912b = i;
                        return;
                    }
                }
            }
            this.f1912b = -1;
        }

        public int getCount() {
            int size = C0650f.this.f1903c.mo2737l().size() - C0650f.this.f1905e;
            return this.f1912b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0650f.this.f1902b.inflate(C0650f.this.f1907g, viewGroup, false);
            }
            ((C0671p.C0672a) view).mo187a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo2666a();
            super.notifyDataSetChanged();
        }
    }

    public C0650f(int i, int i2) {
        this.f1907g = i;
        this.f1906f = i2;
    }

    public C0650f(Context context, int i) {
        this(i, 0);
        this.f1901a = context;
        this.f1902b = LayoutInflater.from(this.f1901a);
    }

    /* renamed from: a */
    public C0671p mo2660a(ViewGroup viewGroup) {
        if (this.f1904d == null) {
            this.f1904d = (ExpandedMenuView) this.f1902b.inflate(C0526a.C0533g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1908h == null) {
                this.f1908h = new C0651a();
            }
            this.f1904d.setAdapter(this.f1908h);
            this.f1904d.setOnItemClickListener(this);
        }
        return this.f1904d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f1902b == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo222a(android.content.Context r3, android.support.p020v7.view.menu.C0653h r4) {
        /*
            r2 = this;
            int r0 = r2.f1906f
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1901a = r1
        L_0x000b:
            android.content.Context r3 = r2.f1901a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1902b = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f1901a
            if (r0 == 0) goto L_0x001f
            r2.f1901a = r3
            android.view.LayoutInflater r3 = r2.f1902b
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f1903c = r4
            android.support.v7.view.menu.f$a r3 = r2.f1908h
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.view.menu.C0650f.mo222a(android.content.Context, android.support.v7.view.menu.h):void");
    }

    /* renamed from: a */
    public void mo2661a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1904d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: a */
    public void mo225a(Parcelable parcelable) {
        mo2662b((Bundle) parcelable);
    }

    /* renamed from: a */
    public void mo227a(C0653h hVar, boolean z) {
        C0669o.C0670a aVar = this.f1909i;
        if (aVar != null) {
            aVar.mo2384a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo229a(C0669o.C0670a aVar) {
        this.f1909i = aVar;
    }

    /* renamed from: a */
    public void mo231a(boolean z) {
        C0651a aVar = this.f1908h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo232a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo233a(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo234a(C0679u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new C0656i(uVar).mo2754a((IBinder) null);
        C0669o.C0670a aVar = this.f1909i;
        if (aVar == null) {
            return true;
        }
        aVar.mo2385a(uVar);
        return true;
    }

    /* renamed from: b */
    public int mo235b() {
        return this.f1910j;
    }

    /* renamed from: b */
    public void mo2662b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1904d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: b */
    public boolean mo239b(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo240c() {
        if (this.f1904d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo2661a(bundle);
        return bundle;
    }

    /* renamed from: d */
    public ListAdapter mo2663d() {
        if (this.f1908h == null) {
            this.f1908h = new C0651a();
        }
        return this.f1908h;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1903c.mo2698a((MenuItem) this.f1908h.getItem(i), (C0669o) this, 0);
    }
}
