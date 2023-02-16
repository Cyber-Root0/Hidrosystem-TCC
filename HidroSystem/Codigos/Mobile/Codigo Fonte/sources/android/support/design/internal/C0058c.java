package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0045a;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0416y;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.view.menu.C0679u;
import android.support.p020v7.widget.C0787av;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: android.support.design.internal.c */
public class C0058c implements C0669o {

    /* renamed from: a */
    LinearLayout f161a;

    /* renamed from: b */
    C0653h f162b;

    /* renamed from: c */
    C0061b f163c;

    /* renamed from: d */
    LayoutInflater f164d;

    /* renamed from: e */
    int f165e;

    /* renamed from: f */
    boolean f166f;

    /* renamed from: g */
    ColorStateList f167g;

    /* renamed from: h */
    ColorStateList f168h;

    /* renamed from: i */
    Drawable f169i;

    /* renamed from: j */
    int f170j;

    /* renamed from: k */
    final View.OnClickListener f171k = new View.OnClickListener() {
        public void onClick(View view) {
            C0058c.this.mo238b(true);
            C0657j itemData = ((NavigationMenuItemView) view).getItemData();
            boolean a = C0058c.this.f162b.mo2698a((MenuItem) itemData, (C0669o) C0058c.this, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                C0058c.this.f163c.mo253a(itemData);
            }
            C0058c.this.mo238b(false);
            C0058c.this.mo231a(false);
        }
    };

    /* renamed from: l */
    private NavigationMenuView f172l;

    /* renamed from: m */
    private C0669o.C0670a f173m;

    /* renamed from: n */
    private int f174n;

    /* renamed from: o */
    private int f175o;

    /* renamed from: android.support.design.internal.c$a */
    private static class C0060a extends C0069j {
        public C0060a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$b */
    private class C0061b extends C0787av.C0794a<C0069j> {

        /* renamed from: b */
        private final ArrayList<C0063d> f178b = new ArrayList<>();

        /* renamed from: c */
        private C0657j f179c;

        /* renamed from: d */
        private boolean f180d;

        C0061b() {
            m158f();
        }

        /* renamed from: a */
        private void m157a(int i, int i2) {
            while (i < i2) {
                ((C0065f) this.f178b.get(i)).f183a = true;
                i++;
            }
        }

        /* renamed from: f */
        private void m158f() {
            if (!this.f180d) {
                this.f180d = true;
                this.f178b.clear();
                this.f178b.add(new C0062c());
                int size = C0058c.this.f162b.mo2733i().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0657j jVar = C0058c.this.f162b.mo2733i().get(i3);
                    if (jVar.isChecked()) {
                        mo253a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.mo2763a(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f178b.add(new C0064e(C0058c.this.f170j, 0));
                            }
                            this.f178b.add(new C0065f(jVar));
                            int size2 = this.f178b.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0657j jVar2 = (C0657j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.mo2763a(false);
                                    }
                                    if (jVar.isChecked()) {
                                        mo253a(jVar);
                                    }
                                    this.f178b.add(new C0065f(jVar2));
                                }
                            }
                            if (z2) {
                                m157a(size2, this.f178b.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f178b.size();
                            boolean z3 = jVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                this.f178b.add(new C0064e(C0058c.this.f170j, C0058c.this.f170j));
                            }
                            z = z3;
                        } else if (!z && jVar.getIcon() != null) {
                            m157a(i2, this.f178b.size());
                            z = true;
                        }
                        C0065f fVar = new C0065f(jVar);
                        fVar.f183a = z;
                        this.f178b.add(fVar);
                        i = groupId;
                    }
                }
                this.f180d = false;
            }
        }

        /* renamed from: a */
        public int mo247a() {
            return this.f178b.size();
        }

        /* renamed from: a */
        public long mo248a(int i) {
            return (long) i;
        }

        /* renamed from: a */
        public C0069j mo258b(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C0066g(C0058c.this.f164d, viewGroup, C0058c.this.f171k);
                case 1:
                    return new C0068i(C0058c.this.f164d, viewGroup);
                case 2:
                    return new C0067h(C0058c.this.f164d, viewGroup);
                case 3:
                    return new C0060a(C0058c.this.f161a);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public void mo250a(Bundle bundle) {
            C0657j a;
            View actionView;
            C0071e eVar;
            C0657j a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f180d = true;
                int size = this.f178b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C0063d dVar = this.f178b.get(i2);
                    if ((dVar instanceof C0065f) && (a2 = ((C0065f) dVar).mo263a()) != null && a2.getItemId() == i) {
                        mo253a(a2);
                        break;
                    }
                    i2++;
                }
                this.f180d = false;
                m158f();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f178b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0063d dVar2 = this.f178b.get(i3);
                    if (!(!(dVar2 instanceof C0065f) || (a = ((C0065f) dVar2).mo263a()) == null || (actionView = a.getActionView()) == null || (eVar = (C0071e) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(eVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo254a(C0069j jVar) {
            if (jVar instanceof C0066g) {
                ((NavigationMenuItemView) jVar.f2785a).mo186a();
            }
        }

        /* renamed from: a */
        public void mo255a(C0069j jVar, int i) {
            switch (mo257b(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.f2785a;
                    navigationMenuItemView.setIconTintList(C0058c.this.f168h);
                    if (C0058c.this.f166f) {
                        navigationMenuItemView.setTextAppearance(C0058c.this.f165e);
                    }
                    if (C0058c.this.f167g != null) {
                        navigationMenuItemView.setTextColor(C0058c.this.f167g);
                    }
                    C0388q.m1644a((View) navigationMenuItemView, C0058c.this.f169i != null ? C0058c.this.f169i.getConstantState().newDrawable() : null);
                    C0065f fVar = (C0065f) this.f178b.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(fVar.f183a);
                    navigationMenuItemView.mo187a(fVar.mo263a(), 0);
                    return;
                case 1:
                    ((TextView) jVar.f2785a).setText(((C0065f) this.f178b.get(i)).mo263a().getTitle());
                    return;
                case 2:
                    C0064e eVar = (C0064e) this.f178b.get(i);
                    jVar.f2785a.setPadding(0, eVar.mo261a(), 0, eVar.mo262b());
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void mo253a(C0657j jVar) {
            if (this.f179c != jVar && jVar.isCheckable()) {
                C0657j jVar2 = this.f179c;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f179c = jVar;
                jVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void mo256a(boolean z) {
            this.f180d = z;
        }

        /* renamed from: b */
        public int mo257b(int i) {
            C0063d dVar = this.f178b.get(i);
            if (dVar instanceof C0064e) {
                return 2;
            }
            if (dVar instanceof C0062c) {
                return 3;
            }
            if (dVar instanceof C0065f) {
                return ((C0065f) dVar).mo263a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: b */
        public void mo259b() {
            m158f();
            mo3934e();
        }

        /* renamed from: c */
        public Bundle mo260c() {
            Bundle bundle = new Bundle();
            C0657j jVar = this.f179c;
            if (jVar != null) {
                bundle.putInt("android:menu:checked", jVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f178b.size();
            for (int i = 0; i < size; i++) {
                C0063d dVar = this.f178b.get(i);
                if (dVar instanceof C0065f) {
                    C0657j a = ((C0065f) dVar).mo263a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        C0071e eVar = new C0071e();
                        actionView.saveHierarchyState(eVar);
                        sparseArray.put(a.getItemId(), eVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }
    }

    /* renamed from: android.support.design.internal.c$c */
    private static class C0062c implements C0063d {
        C0062c() {
        }
    }

    /* renamed from: android.support.design.internal.c$d */
    private interface C0063d {
    }

    /* renamed from: android.support.design.internal.c$e */
    private static class C0064e implements C0063d {

        /* renamed from: a */
        private final int f181a;

        /* renamed from: b */
        private final int f182b;

        public C0064e(int i, int i2) {
            this.f181a = i;
            this.f182b = i2;
        }

        /* renamed from: a */
        public int mo261a() {
            return this.f181a;
        }

        /* renamed from: b */
        public int mo262b() {
            return this.f182b;
        }
    }

    /* renamed from: android.support.design.internal.c$f */
    private static class C0065f implements C0063d {

        /* renamed from: a */
        boolean f183a;

        /* renamed from: b */
        private final C0657j f184b;

        C0065f(C0657j jVar) {
            this.f184b = jVar;
        }

        /* renamed from: a */
        public C0657j mo263a() {
            return this.f184b;
        }
    }

    /* renamed from: android.support.design.internal.c$g */
    private static class C0066g extends C0069j {
        public C0066g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0045a.C0052g.design_navigation_item, viewGroup, false));
            this.f2785a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.c$h */
    private static class C0067h extends C0069j {
        public C0067h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0045a.C0052g.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$i */
    private static class C0068i extends C0069j {
        public C0068i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0045a.C0052g.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$j */
    private static abstract class C0069j extends C0787av.C0826w {
        public C0069j(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public C0671p mo220a(ViewGroup viewGroup) {
        if (this.f172l == null) {
            this.f172l = (NavigationMenuView) this.f164d.inflate(C0045a.C0052g.design_navigation_menu, viewGroup, false);
            if (this.f163c == null) {
                this.f163c = new C0061b();
            }
            this.f161a = (LinearLayout) this.f164d.inflate(C0045a.C0052g.design_navigation_item_header, this.f172l, false);
            this.f172l.setAdapter(this.f163c);
        }
        return this.f172l;
    }

    /* renamed from: a */
    public void mo221a(int i) {
        this.f174n = i;
    }

    /* renamed from: a */
    public void mo222a(Context context, C0653h hVar) {
        this.f164d = LayoutInflater.from(context);
        this.f162b = hVar;
        this.f170j = context.getResources().getDimensionPixelOffset(C0045a.C0048c.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public void mo223a(ColorStateList colorStateList) {
        this.f168h = colorStateList;
        mo231a(false);
    }

    /* renamed from: a */
    public void mo224a(Drawable drawable) {
        this.f169i = drawable;
        mo231a(false);
    }

    /* renamed from: a */
    public void mo225a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f172l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f163c.mo250a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f161a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public void mo226a(C0416y yVar) {
        int b = yVar.mo1649b();
        if (this.f175o != b) {
            this.f175o = b;
            if (this.f161a.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f172l;
                navigationMenuView.setPadding(0, this.f175o, 0, navigationMenuView.getPaddingBottom());
            }
        }
        C0388q.m1652b((View) this.f161a, yVar);
    }

    /* renamed from: a */
    public void mo227a(C0653h hVar, boolean z) {
        C0669o.C0670a aVar = this.f173m;
        if (aVar != null) {
            aVar.mo2384a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo228a(C0657j jVar) {
        this.f163c.mo253a(jVar);
    }

    /* renamed from: a */
    public void mo229a(C0669o.C0670a aVar) {
        this.f173m = aVar;
    }

    /* renamed from: a */
    public void mo230a(View view) {
        this.f161a.addView(view);
        NavigationMenuView navigationMenuView = this.f172l;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: a */
    public void mo231a(boolean z) {
        C0061b bVar = this.f163c;
        if (bVar != null) {
            bVar.mo259b();
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
        return false;
    }

    /* renamed from: b */
    public int mo235b() {
        return this.f174n;
    }

    /* renamed from: b */
    public View mo236b(int i) {
        View inflate = this.f164d.inflate(i, this.f161a, false);
        mo230a(inflate);
        return inflate;
    }

    /* renamed from: b */
    public void mo237b(ColorStateList colorStateList) {
        this.f167g = colorStateList;
        mo231a(false);
    }

    /* renamed from: b */
    public void mo238b(boolean z) {
        C0061b bVar = this.f163c;
        if (bVar != null) {
            bVar.mo256a(z);
        }
    }

    /* renamed from: b */
    public boolean mo239b(C0653h hVar, C0657j jVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo240c() {
        if (Build.VERSION.SDK_INT < 11) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (this.f172l != null) {
            SparseArray sparseArray = new SparseArray();
            this.f172l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0061b bVar = this.f163c;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.mo260c());
        }
        if (this.f161a != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f161a.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: c */
    public void mo241c(int i) {
        this.f165e = i;
        this.f166f = true;
        mo231a(false);
    }

    /* renamed from: d */
    public int mo242d() {
        return this.f161a.getChildCount();
    }

    /* renamed from: e */
    public ColorStateList mo243e() {
        return this.f168h;
    }

    /* renamed from: f */
    public ColorStateList mo244f() {
        return this.f167g;
    }

    /* renamed from: g */
    public Drawable mo245g() {
        return this.f169i;
    }
}
