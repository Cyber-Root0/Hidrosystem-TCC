package android.support.p020v7.view.menu;

import android.content.Context;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.widget.C0846bi;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0653h.C0655b, C0671p, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f1811a = {16842964, 16843049};

    /* renamed from: b */
    private C0653h f1812b;

    /* renamed from: c */
    private int f1813c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0846bi a = C0846bi.m4625a(context, attributeSet, f1811a, i, 0);
        if (a.mo4305g(0)) {
            setBackgroundDrawable(a.mo4291a(0));
        }
        if (a.mo4305g(1)) {
            setDivider(a.mo4291a(1));
        }
        a.mo4292a();
    }

    /* renamed from: a */
    public void mo200a(C0653h hVar) {
        this.f1812b = hVar;
    }

    /* renamed from: a */
    public boolean mo2574a(C0657j jVar) {
        return this.f1812b.mo2697a((MenuItem) jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1813c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2574a((C0657j) getAdapter().getItem(i));
    }
}
