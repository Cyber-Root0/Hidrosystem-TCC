package android.support.p020v7.view.menu;

import android.content.Context;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0671p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0641b implements C0669o {

    /* renamed from: a */
    protected Context f1851a;

    /* renamed from: b */
    protected Context f1852b;

    /* renamed from: c */
    protected C0653h f1853c;

    /* renamed from: d */
    protected LayoutInflater f1854d;

    /* renamed from: e */
    protected LayoutInflater f1855e;

    /* renamed from: f */
    protected C0671p f1856f;

    /* renamed from: g */
    private C0669o.C0670a f1857g;

    /* renamed from: h */
    private int f1858h;

    /* renamed from: i */
    private int f1859i;

    /* renamed from: j */
    private int f1860j;

    public C0641b(Context context, int i, int i2) {
        this.f1851a = context;
        this.f1854d = LayoutInflater.from(context);
        this.f1858h = i;
        this.f1859i = i2;
    }

    /* renamed from: a */
    public C0671p mo2624a(ViewGroup viewGroup) {
        if (this.f1856f == null) {
            this.f1856f = (C0671p) this.f1854d.inflate(this.f1858h, viewGroup, false);
            this.f1856f.mo200a(this.f1853c);
            mo231a(true);
        }
        return this.f1856f;
    }

    /* renamed from: a */
    public View mo2625a(C0657j jVar, View view, ViewGroup viewGroup) {
        C0671p.C0672a b = view instanceof C0671p.C0672a ? (C0671p.C0672a) view : mo2631b(viewGroup);
        mo2627a(jVar, b);
        return (View) b;
    }

    /* renamed from: a */
    public void mo2626a(int i) {
        this.f1860j = i;
    }

    /* renamed from: a */
    public void mo222a(Context context, C0653h hVar) {
        this.f1852b = context;
        this.f1855e = LayoutInflater.from(this.f1852b);
        this.f1853c = hVar;
    }

    /* renamed from: a */
    public void mo227a(C0653h hVar, boolean z) {
        C0669o.C0670a aVar = this.f1857g;
        if (aVar != null) {
            aVar.mo2384a(hVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo2627a(C0657j jVar, C0671p.C0672a aVar);

    /* renamed from: a */
    public void mo229a(C0669o.C0670a aVar) {
        this.f1857g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2628a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1856f).addView(view, i);
    }

    /* renamed from: a */
    public void mo231a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1856f;
        if (viewGroup != null) {
            C0653h hVar = this.f1853c;
            int i = 0;
            if (hVar != null) {
                hVar.mo2735j();
                ArrayList<C0657j> i2 = this.f1853c.mo2733i();
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0657j jVar = i2.get(i4);
                    if (mo2629a(i3, jVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        C0657j itemData = childAt instanceof C0671p.C0672a ? ((C0671p.C0672a) childAt).getItemData() : null;
                        View a = mo2625a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo2628a(a, i3);
                        }
                        i3++;
                    }
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo2630a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo232a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo2629a(int i, C0657j jVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo233a(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo234a(C0679u uVar) {
        C0669o.C0670a aVar = this.f1857g;
        if (aVar != null) {
            return aVar.mo2385a(uVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2630a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public int mo235b() {
        return this.f1860j;
    }

    /* renamed from: b */
    public C0671p.C0672a mo2631b(ViewGroup viewGroup) {
        return (C0671p.C0672a) this.f1854d.inflate(this.f1859i, viewGroup, false);
    }

    /* renamed from: b */
    public boolean mo239b(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: d */
    public C0669o.C0670a mo2632d() {
        return this.f1857g;
    }
}
