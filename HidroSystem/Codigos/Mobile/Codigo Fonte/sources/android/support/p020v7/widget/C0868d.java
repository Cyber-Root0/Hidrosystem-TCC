package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p017i.C0367c;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0624a;
import android.support.p020v7.view.menu.ActionMenuItemView;
import android.support.p020v7.view.menu.C0641b;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0667n;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.view.menu.C0675s;
import android.support.p020v7.view.menu.C0679u;
import android.support.p020v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.d */
class C0868d extends C0641b implements C0367c.C0368a {

    /* renamed from: A */
    private C0870b f2935A;

    /* renamed from: g */
    C0872d f2936g;

    /* renamed from: h */
    C0874e f2937h;

    /* renamed from: i */
    C0869a f2938i;

    /* renamed from: j */
    C0871c f2939j;

    /* renamed from: k */
    final C0875f f2940k = new C0875f();

    /* renamed from: l */
    int f2941l;

    /* renamed from: m */
    private Drawable f2942m;

    /* renamed from: n */
    private boolean f2943n;

    /* renamed from: o */
    private boolean f2944o;

    /* renamed from: p */
    private boolean f2945p;

    /* renamed from: q */
    private int f2946q;

    /* renamed from: r */
    private int f2947r;

    /* renamed from: s */
    private int f2948s;

    /* renamed from: t */
    private boolean f2949t;

    /* renamed from: u */
    private boolean f2950u;

    /* renamed from: v */
    private boolean f2951v;

    /* renamed from: w */
    private boolean f2952w;

    /* renamed from: x */
    private int f2953x;

    /* renamed from: y */
    private final SparseBooleanArray f2954y = new SparseBooleanArray();

    /* renamed from: z */
    private View f2955z;

    /* renamed from: android.support.v7.widget.d$a */
    private class C0869a extends C0667n {
        public C0869a(Context context, C0679u uVar, View view) {
            super(context, uVar, view, false, C0526a.C0527a.actionOverflowMenuStyle);
            if (!((C0657j) uVar.getItem()).mo2794j()) {
                mo2885a(C0868d.this.f2936g == null ? (View) C0868d.this.f1856f : C0868d.this.f2936g);
            }
            mo2884a((C0669o.C0670a) C0868d.this.f2940k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo2892e() {
            C0868d dVar = C0868d.this;
            dVar.f2938i = null;
            dVar.f2941l = 0;
            super.mo2892e();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    private class C0870b extends ActionMenuItemView.C0639b {
        C0870b() {
        }

        /* renamed from: a */
        public C0675s mo2573a() {
            if (C0868d.this.f2938i != null) {
                return C0868d.this.f2938i.mo2889b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.d$c */
    private class C0871c implements Runnable {

        /* renamed from: b */
        private C0874e f2959b;

        public C0871c(C0874e eVar) {
            this.f2959b = eVar;
        }

        public void run() {
            if (C0868d.this.f1853c != null) {
                C0868d.this.f1853c.mo2727f();
            }
            View view = (View) C0868d.this.f1856f;
            if (!(view == null || view.getWindowToken() == null || !this.f2959b.mo2890c())) {
                C0868d.this.f2937h = this.f2959b;
            }
            C0868d.this.f2939j = null;
        }
    }

    /* renamed from: android.support.v7.widget.d$d */
    private class C0872d extends C0901q implements ActionMenuView.C0687a {

        /* renamed from: b */
        private final float[] f2961b = new float[2];

        public C0872d(Context context) {
            super(context, (AttributeSet) null, C0526a.C0527a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0850bk.m4690a(this, getContentDescription());
            setOnTouchListener(new C0759al(this, C0868d.this) {
                /* renamed from: a */
                public C0675s mo2571a() {
                    if (C0868d.this.f2937h == null) {
                        return null;
                    }
                    return C0868d.this.f2937h.mo2889b();
                }

                /* renamed from: b */
                public boolean mo2572b() {
                    C0868d.this.mo4355f();
                    return true;
                }

                /* renamed from: c */
                public boolean mo3611c() {
                    if (C0868d.this.f2939j != null) {
                        return false;
                    }
                    C0868d.this.mo4356g();
                    return true;
                }
            });
        }

        /* renamed from: c */
        public boolean mo2556c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo2557d() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0868d.this.mo4355f();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0240a.m1123a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.d$e */
    private class C0874e extends C0667n {
        public C0874e(Context context, C0653h hVar, View view, boolean z) {
            super(context, hVar, view, z, C0526a.C0527a.actionOverflowMenuStyle);
            mo2883a(8388613);
            mo2884a((C0669o.C0670a) C0868d.this.f2940k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo2892e() {
            if (C0868d.this.f1853c != null) {
                C0868d.this.f1853c.close();
            }
            C0868d.this.f2937h = null;
            super.mo2892e();
        }
    }

    /* renamed from: android.support.v7.widget.d$f */
    private class C0875f implements C0669o.C0670a {
        C0875f() {
        }

        /* renamed from: a */
        public void mo2384a(C0653h hVar, boolean z) {
            if (hVar instanceof C0679u) {
                hVar.mo2741p().mo2711b(false);
            }
            C0669o.C0670a d = C0868d.this.mo2632d();
            if (d != null) {
                d.mo2384a(hVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo2385a(C0653h hVar) {
            if (hVar == null) {
                return false;
            }
            C0868d.this.f2941l = ((C0679u) hVar).getItem().getItemId();
            C0669o.C0670a d = C0868d.this.mo2632d();
            if (d != null) {
                return d.mo2385a(hVar);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.d$g */
    private static class C0876g implements Parcelable {
        public static final Parcelable.Creator<C0876g> CREATOR = new Parcelable.Creator<C0876g>() {
            /* renamed from: a */
            public C0876g createFromParcel(Parcel parcel) {
                return new C0876g(parcel);
            }

            /* renamed from: a */
            public C0876g[] newArray(int i) {
                return new C0876g[i];
            }
        };

        /* renamed from: a */
        public int f2966a;

        C0876g() {
        }

        C0876g(Parcel parcel) {
            this.f2966a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2966a);
        }
    }

    public C0868d(Context context) {
        super(context, C0526a.C0533g.abc_action_menu_layout, C0526a.C0533g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m4746a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1856f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0671p.C0672a) && ((C0671p.C0672a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0671p mo2624a(ViewGroup viewGroup) {
        C0671p pVar = this.f1856f;
        C0671p a = super.mo2624a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo2625a(C0657j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo2798n()) {
            actionView = super.mo2625a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo222a(Context context, C0653h hVar) {
        super.mo222a(context, hVar);
        Resources resources = context.getResources();
        C0624a a = C0624a.m2847a(context);
        if (!this.f2945p) {
            this.f2944o = a.mo2486b();
        }
        if (!this.f2951v) {
            this.f2946q = a.mo2487c();
        }
        if (!this.f2949t) {
            this.f2948s = a.mo2485a();
        }
        int i = this.f2946q;
        if (this.f2944o) {
            if (this.f2936g == null) {
                this.f2936g = new C0872d(this.f1851a);
                if (this.f2943n) {
                    this.f2936g.setImageDrawable(this.f2942m);
                    this.f2942m = null;
                    this.f2943n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2936g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2936g.getMeasuredWidth();
        } else {
            this.f2936g = null;
        }
        this.f2947r = i;
        this.f2953x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2955z = null;
    }

    /* renamed from: a */
    public void mo4349a(Configuration configuration) {
        if (!this.f2949t) {
            this.f2948s = C0624a.m2847a(this.f1852b).mo2485a();
        }
        if (this.f1853c != null) {
            this.f1853c.mo264a(true);
        }
    }

    /* renamed from: a */
    public void mo4350a(Drawable drawable) {
        C0872d dVar = this.f2936g;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f2943n = true;
        this.f2942m = drawable;
    }

    /* renamed from: a */
    public void mo225a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof C0876g) {
            C0876g gVar = (C0876g) parcelable;
            if (gVar.f2966a > 0 && (findItem = this.f1853c.findItem(gVar.f2966a)) != null) {
                mo234a((C0679u) findItem.getSubMenu());
            }
        }
    }

    /* renamed from: a */
    public void mo227a(C0653h hVar, boolean z) {
        mo4357h();
        super.mo227a(hVar, z);
    }

    /* renamed from: a */
    public void mo2627a(C0657j jVar, C0671p.C0672a aVar) {
        aVar.mo187a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1856f);
        if (this.f2935A == null) {
            this.f2935A = new C0870b();
        }
        actionMenuItemView.setPopupCallback(this.f2935A);
    }

    /* renamed from: a */
    public void mo4351a(ActionMenuView actionMenuView) {
        this.f1856f = actionMenuView;
        actionMenuView.mo200a(this.f1853c);
    }

    /* renamed from: a */
    public void mo231a(boolean z) {
        super.mo231a(z);
        ((View) this.f1856f).requestLayout();
        boolean z2 = false;
        if (this.f1853c != null) {
            ArrayList<C0657j> k = this.f1853c.mo2736k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                C0367c a = k.get(i).mo1185a();
                if (a != null) {
                    a.mo1533a((C0367c.C0368a) this);
                }
            }
        }
        ArrayList<C0657j> l = this.f1853c != null ? this.f1853c.mo2737l() : null;
        if (this.f2944o && l != null) {
            int size2 = l.size();
            if (size2 == 1) {
                z2 = !l.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2936g == null) {
                this.f2936g = new C0872d(this.f1851a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2936g.getParent();
            if (viewGroup != this.f1856f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2936g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1856f;
                actionMenuView.addView(this.f2936g, actionMenuView.mo3041c());
            }
        } else {
            C0872d dVar = this.f2936g;
            if (dVar != null && dVar.getParent() == this.f1856f) {
                ((ViewGroup) this.f1856f).removeView(this.f2936g);
            }
        }
        ((ActionMenuView) this.f1856f).setOverflowReserved(this.f2944o);
    }

    /* renamed from: a */
    public boolean mo232a() {
        int i;
        ArrayList<C0657j> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        C0868d dVar = this;
        int i5 = 0;
        if (dVar.f1853c != null) {
            arrayList = dVar.f1853c.mo2733i();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = dVar.f2948s;
        int i7 = dVar.f2947r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) dVar.f1856f;
        int i8 = i6;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0657j jVar = arrayList.get(i11);
            if (jVar.mo2796l()) {
                i9++;
            } else if (jVar.mo2795k()) {
                i10++;
            } else {
                z2 = true;
            }
            if (dVar.f2952w && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (dVar.f2944o && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = dVar.f2954y;
        sparseBooleanArray.clear();
        if (dVar.f2950u) {
            int i13 = dVar.f2953x;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0657j jVar2 = arrayList.get(i15);
            if (jVar2.mo2796l()) {
                View a = dVar.mo2625a(jVar2, dVar.f2955z, viewGroup);
                if (dVar.f2955z == null) {
                    dVar.f2955z = a;
                }
                if (dVar.f2950u) {
                    i2 -= ActionMenuView.m3265a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                jVar2.mo2770d(z);
                i4 = i;
                i16 = measuredWidth;
            } else if (jVar2.mo2795k()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i14 > 0 && (!dVar.f2950u || i2 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = dVar.mo2625a(jVar2, dVar.f2955z, viewGroup);
                    i4 = i;
                    if (dVar.f2955z == null) {
                        dVar.f2955z = a2;
                    }
                    if (dVar.f2950u) {
                        int a3 = ActionMenuView.m3265a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z4 = z5 & (!dVar.f2950u ? i14 + i16 > 0 : i14 >= 0);
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0657j jVar3 = arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo2794j()) {
                                i12++;
                            }
                            jVar3.mo2770d(false);
                        }
                        i17++;
                    }
                }
                if (z4) {
                    i12--;
                }
                jVar2.mo2770d(z4);
            } else {
                i4 = i;
                jVar2.mo2770d(false);
                i15++;
                i = i4;
                dVar = this;
                i5 = 0;
            }
            i15++;
            i = i4;
            dVar = this;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2629a(int i, C0657j jVar) {
        return jVar.mo2794j();
    }

    /* renamed from: a */
    public boolean mo234a(C0679u uVar) {
        boolean z = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        C0679u uVar2 = uVar;
        while (uVar2.mo2925s() != this.f1853c) {
            uVar2 = (C0679u) uVar2.mo2925s();
        }
        View a = m4746a(uVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f2941l = uVar.getItem().getItemId();
        int size = uVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2938i = new C0869a(this.f1852b, uVar, a);
        this.f2938i.mo2887a(z);
        this.f2938i.mo2882a();
        super.mo234a(uVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo2630a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2936g) {
            return false;
        }
        return super.mo2630a(viewGroup, i);
    }

    /* renamed from: b */
    public void mo1542b(boolean z) {
        if (z) {
            super.mo234a((C0679u) null);
        } else if (this.f1853c != null) {
            this.f1853c.mo2711b(false);
        }
    }

    /* renamed from: c */
    public Parcelable mo240c() {
        C0876g gVar = new C0876g();
        gVar.f2966a = this.f2941l;
        return gVar;
    }

    /* renamed from: c */
    public void mo4352c(boolean z) {
        this.f2944o = z;
        this.f2945p = true;
    }

    /* renamed from: d */
    public void mo4353d(boolean z) {
        this.f2952w = z;
    }

    /* renamed from: e */
    public Drawable mo4354e() {
        C0872d dVar = this.f2936g;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f2943n) {
            return this.f2942m;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo4355f() {
        if (!this.f2944o || mo4359j() || this.f1853c == null || this.f1856f == null || this.f2939j != null || this.f1853c.mo2737l().isEmpty()) {
            return false;
        }
        this.f2939j = new C0871c(new C0874e(this.f1852b, this.f1853c, this.f2936g, true));
        ((View) this.f1856f).post(this.f2939j);
        super.mo234a((C0679u) null);
        return true;
    }

    /* renamed from: g */
    public boolean mo4356g() {
        if (this.f2939j == null || this.f1856f == null) {
            C0874e eVar = this.f2937h;
            if (eVar == null) {
                return false;
            }
            eVar.mo2891d();
            return true;
        }
        ((View) this.f1856f).removeCallbacks(this.f2939j);
        this.f2939j = null;
        return true;
    }

    /* renamed from: h */
    public boolean mo4357h() {
        return mo4356g() | mo4358i();
    }

    /* renamed from: i */
    public boolean mo4358i() {
        C0869a aVar = this.f2938i;
        if (aVar == null) {
            return false;
        }
        aVar.mo2891d();
        return true;
    }

    /* renamed from: j */
    public boolean mo4359j() {
        C0874e eVar = this.f2937h;
        return eVar != null && eVar.mo2893f();
    }

    /* renamed from: k */
    public boolean mo4360k() {
        return this.f2939j != null || mo4359j();
    }
}
