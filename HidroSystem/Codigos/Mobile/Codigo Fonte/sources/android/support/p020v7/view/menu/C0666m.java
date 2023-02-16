package android.support.p020v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.m */
abstract class C0666m implements C0669o, C0675s, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1993a;

    C0666m() {
    }

    /* renamed from: a */
    protected static int m3140a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0652g m3141a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0652g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0652g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m3142b(C0653h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo2638a(int i);

    /* renamed from: a */
    public void mo222a(Context context, C0653h hVar) {
    }

    /* renamed from: a */
    public void mo2879a(Rect rect) {
        this.f1993a = rect;
    }

    /* renamed from: a */
    public abstract void mo2639a(C0653h hVar);

    /* renamed from: a */
    public abstract void mo2640a(View view);

    /* renamed from: a */
    public abstract void mo2641a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public boolean mo233a(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: b */
    public int mo235b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo2642b(int i);

    /* renamed from: b */
    public abstract void mo2643b(boolean z);

    /* renamed from: b */
    public boolean mo239b(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo2644c(int i);

    /* renamed from: c */
    public abstract void mo2645c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo2650h() {
        return true;
    }

    /* renamed from: i */
    public Rect mo2880i() {
        return this.f1993a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m3141a(listAdapter).f1914b.mo2698a((MenuItem) listAdapter.getItem(i), (C0669o) this, mo2650h() ? 0 : 4);
    }
}
