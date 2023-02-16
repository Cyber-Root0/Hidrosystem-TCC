package android.support.p020v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0409u;
import android.support.p005v4.p017i.C0413v;
import android.support.p005v4.p017i.C0414w;
import android.support.p005v4.p017i.C0415x;
import android.support.p020v7.app.C0550a;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0624a;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.view.C0632g;
import android.support.p020v7.view.C0635h;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.widget.ActionBarContainer;
import android.support.p020v7.widget.ActionBarContextView;
import android.support.p020v7.widget.ActionBarOverlayLayout;
import android.support.p020v7.widget.C0738af;
import android.support.p020v7.widget.C0833ba;
import android.support.p020v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.t */
public class C0610t extends C0550a implements ActionBarOverlayLayout.C0685a {

    /* renamed from: s */
    static final /* synthetic */ boolean f1665s = (!C0610t.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f1666t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f1667u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f1668A;

    /* renamed from: B */
    private boolean f1669B;

    /* renamed from: C */
    private ArrayList<C0550a.C0552b> f1670C = new ArrayList<>();

    /* renamed from: D */
    private boolean f1671D;

    /* renamed from: E */
    private int f1672E = 0;

    /* renamed from: F */
    private boolean f1673F;

    /* renamed from: G */
    private boolean f1674G = true;

    /* renamed from: H */
    private boolean f1675H;

    /* renamed from: a */
    Context f1676a;

    /* renamed from: b */
    ActionBarOverlayLayout f1677b;

    /* renamed from: c */
    ActionBarContainer f1678c;

    /* renamed from: d */
    C0738af f1679d;

    /* renamed from: e */
    ActionBarContextView f1680e;

    /* renamed from: f */
    View f1681f;

    /* renamed from: g */
    C0833ba f1682g;

    /* renamed from: h */
    C0614a f1683h;

    /* renamed from: i */
    C0625b f1684i;

    /* renamed from: j */
    C0625b.C0626a f1685j;

    /* renamed from: k */
    boolean f1686k = true;

    /* renamed from: l */
    boolean f1687l;

    /* renamed from: m */
    boolean f1688m;

    /* renamed from: n */
    C0635h f1689n;

    /* renamed from: o */
    boolean f1690o;

    /* renamed from: p */
    final C0413v f1691p = new C0414w() {
        /* renamed from: b */
        public void mo1644b(View view) {
            if (C0610t.this.f1686k && C0610t.this.f1681f != null) {
                C0610t.this.f1681f.setTranslationY(0.0f);
                C0610t.this.f1678c.setTranslationY(0.0f);
            }
            C0610t.this.f1678c.setVisibility(8);
            C0610t.this.f1678c.setTransitioning(false);
            C0610t tVar = C0610t.this;
            tVar.f1689n = null;
            tVar.mo2420h();
            if (C0610t.this.f1677b != null) {
                C0388q.m1668o(C0610t.this.f1677b);
            }
        }
    };

    /* renamed from: q */
    final C0413v f1692q = new C0414w() {
        /* renamed from: b */
        public void mo1644b(View view) {
            C0610t tVar = C0610t.this;
            tVar.f1689n = null;
            tVar.f1678c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0415x f1693r = new C0415x() {
        /* renamed from: a */
        public void mo1646a(View view) {
            ((View) C0610t.this.f1678c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f1694v;

    /* renamed from: w */
    private Activity f1695w;

    /* renamed from: x */
    private Dialog f1696x;

    /* renamed from: y */
    private ArrayList<Object> f1697y = new ArrayList<>();

    /* renamed from: z */
    private int f1698z = -1;

    /* renamed from: android.support.v7.app.t$a */
    public class C0614a extends C0625b implements C0653h.C0654a {

        /* renamed from: b */
        private final Context f1703b;

        /* renamed from: c */
        private final C0653h f1704c;

        /* renamed from: d */
        private C0625b.C0626a f1705d;

        /* renamed from: e */
        private WeakReference<View> f1706e;

        public C0614a(Context context, C0625b.C0626a aVar) {
            this.f1703b = context;
            this.f1705d = aVar;
            this.f1704c = new C0653h(context).mo2682a(1);
            this.f1704c.mo2690a((C0653h.C0654a) this);
        }

        /* renamed from: a */
        public MenuInflater mo2429a() {
            return new C0632g(this.f1703b);
        }

        /* renamed from: a */
        public void mo2430a(int i) {
            mo2436b((CharSequence) C0610t.this.f1676a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo548a(C0653h hVar) {
            if (this.f1705d != null) {
                mo2438d();
                C0610t.this.f1680e.mo2963a();
            }
        }

        /* renamed from: a */
        public void mo2431a(View view) {
            C0610t.this.f1680e.setCustomView(view);
            this.f1706e = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo2432a(CharSequence charSequence) {
            C0610t.this.f1680e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo2433a(boolean z) {
            super.mo2433a(z);
            C0610t.this.f1680e.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo549a(C0653h hVar, MenuItem menuItem) {
            C0625b.C0626a aVar = this.f1705d;
            if (aVar != null) {
                return aVar.mo2388a((C0625b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public Menu mo2434b() {
            return this.f1704c;
        }

        /* renamed from: b */
        public void mo2435b(int i) {
            mo2432a((CharSequence) C0610t.this.f1676a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo2436b(CharSequence charSequence) {
            C0610t.this.f1680e.setTitle(charSequence);
        }

        /* renamed from: c */
        public void mo2437c() {
            if (C0610t.this.f1683h == this) {
                if (!C0610t.m2768a(C0610t.this.f1687l, C0610t.this.f1688m, false)) {
                    C0610t tVar = C0610t.this;
                    tVar.f1684i = this;
                    tVar.f1685j = this.f1705d;
                } else {
                    this.f1705d.mo2386a(this);
                }
                this.f1705d = null;
                C0610t.this.mo2425j(false);
                C0610t.this.f1680e.mo2964b();
                C0610t.this.f1679d.mo3528a().sendAccessibilityEvent(32);
                C0610t.this.f1677b.setHideOnContentScrollEnabled(C0610t.this.f1690o);
                C0610t.this.f1683h = null;
            }
        }

        /* renamed from: d */
        public void mo2438d() {
            if (C0610t.this.f1683h == this) {
                this.f1704c.mo2729g();
                try {
                    this.f1705d.mo2389b(this, this.f1704c);
                } finally {
                    this.f1704c.mo2731h();
                }
            }
        }

        /* renamed from: e */
        public boolean mo2439e() {
            this.f1704c.mo2729g();
            try {
                return this.f1705d.mo2387a((C0625b) this, (Menu) this.f1704c);
            } finally {
                this.f1704c.mo2731h();
            }
        }

        /* renamed from: f */
        public CharSequence mo2440f() {
            return C0610t.this.f1680e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo2441g() {
            return C0610t.this.f1680e.getSubtitle();
        }

        /* renamed from: h */
        public boolean mo2442h() {
            return C0610t.this.f1680e.mo2966d();
        }

        /* renamed from: i */
        public View mo2443i() {
            WeakReference<View> weakReference = this.f1706e;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }
    }

    public C0610t(Activity activity, boolean z) {
        this.f1695w = activity;
        View decorView = activity.getWindow().getDecorView();
        m2767a(decorView);
        if (!z) {
            this.f1681f = decorView.findViewById(16908290);
        }
    }

    public C0610t(Dialog dialog) {
        this.f1696x = dialog;
        m2767a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m2767a(View view) {
        this.f1677b = (ActionBarOverlayLayout) view.findViewById(C0526a.C0532f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1677b;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1679d = m2769b(view.findViewById(C0526a.C0532f.action_bar));
        this.f1680e = (ActionBarContextView) view.findViewById(C0526a.C0532f.action_context_bar);
        this.f1678c = (ActionBarContainer) view.findViewById(C0526a.C0532f.action_bar_container);
        C0738af afVar = this.f1679d;
        if (afVar == null || this.f1680e == null || this.f1678c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f1676a = afVar.mo3537b();
        boolean z = (this.f1679d.mo3556o() & 4) != 0;
        if (z) {
            this.f1668A = true;
        }
        C0624a a = C0624a.m2847a(this.f1676a);
        mo2236b(a.mo2490f() || z);
        m2770k(a.mo2488d());
        TypedArray obtainStyledAttributes = this.f1676a.obtainStyledAttributes((AttributeSet) null, C0526a.C0536j.ActionBar, C0526a.C0527a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0526a.C0536j.ActionBar_hideOnContentScroll, false)) {
            mo2237c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0526a.C0536j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo2227a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static boolean m2768a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private C0738af m2769b(View view) {
        if (view instanceof C0738af) {
            return (C0738af) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: k */
    private void m2770k(boolean z) {
        this.f1671D = z;
        if (!this.f1671D) {
            this.f1679d.mo3532a((C0833ba) null);
            this.f1678c.setTabContainer(this.f1682g);
        } else {
            this.f1678c.setTabContainer((C0833ba) null);
            this.f1679d.mo3532a(this.f1682g);
        }
        boolean z2 = true;
        boolean z3 = mo2422i() == 2;
        C0833ba baVar = this.f1682g;
        if (baVar != null) {
            if (z3) {
                baVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1677b;
                if (actionBarOverlayLayout != null) {
                    C0388q.m1668o(actionBarOverlayLayout);
                }
            } else {
                baVar.setVisibility(8);
            }
        }
        this.f1679d.mo3536a(!this.f1671D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1677b;
        if (this.f1671D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m2771l(boolean z) {
        if (m2768a(this.f1687l, this.f1688m, this.f1673F)) {
            if (!this.f1674G) {
                this.f1674G = true;
                mo2421h(z);
            }
        } else if (this.f1674G) {
            this.f1674G = false;
            mo2423i(z);
        }
    }

    /* renamed from: n */
    private void m2772n() {
        if (!this.f1673F) {
            this.f1673F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1677b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m2771l(false);
        }
    }

    /* renamed from: o */
    private void m2773o() {
        if (this.f1673F) {
            this.f1673F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1677b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m2771l(false);
        }
    }

    /* renamed from: p */
    private boolean m2774p() {
        return C0388q.m1676w(this.f1678c);
    }

    /* renamed from: a */
    public int mo2225a() {
        return this.f1679d.mo3556o();
    }

    /* renamed from: a */
    public C0625b mo2226a(C0625b.C0626a aVar) {
        C0614a aVar2 = this.f1683h;
        if (aVar2 != null) {
            aVar2.mo2437c();
        }
        this.f1677b.setHideOnContentScrollEnabled(false);
        this.f1680e.mo2965c();
        C0614a aVar3 = new C0614a(this.f1680e.getContext(), aVar);
        if (!aVar3.mo2439e()) {
            return null;
        }
        this.f1683h = aVar3;
        aVar3.mo2438d();
        this.f1680e.mo2962a(aVar3);
        mo2425j(true);
        this.f1680e.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* renamed from: a */
    public void mo2227a(float f) {
        C0388q.m1638a((View) this.f1678c, f);
    }

    /* renamed from: a */
    public void mo2228a(int i) {
        this.f1679d.mo3544d(i);
    }

    /* renamed from: a */
    public void mo2417a(int i, int i2) {
        int o = this.f1679d.mo3556o();
        if ((i2 & 4) != 0) {
            this.f1668A = true;
        }
        this.f1679d.mo3541c((i & i2) | ((i2 ^ -1) & o));
    }

    /* renamed from: a */
    public void mo2229a(Configuration configuration) {
        m2770k(C0624a.m2847a(this.f1676a).mo2488d());
    }

    /* renamed from: a */
    public void mo2230a(Drawable drawable) {
        this.f1679d.mo3539b(drawable);
    }

    /* renamed from: a */
    public void mo2231a(CharSequence charSequence) {
        this.f1679d.mo3535a(charSequence);
    }

    /* renamed from: a */
    public void mo2232a(boolean z) {
        mo2417a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public boolean mo2233a(int i, KeyEvent keyEvent) {
        Menu b;
        C0614a aVar = this.f1683h;
        if (aVar == null || (b = aVar.mo2434b()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public Context mo2235b() {
        if (this.f1694v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1676a.getTheme().resolveAttribute(C0526a.C0527a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1694v = new ContextThemeWrapper(this.f1676a, i);
            } else {
                this.f1694v = this.f1676a;
            }
        }
        return this.f1694v;
    }

    /* renamed from: b */
    public void mo2418b(int i) {
        this.f1672E = i;
    }

    /* renamed from: b */
    public void mo2236b(boolean z) {
        this.f1679d.mo3540b(z);
    }

    /* renamed from: c */
    public void mo2237c(boolean z) {
        if (!z || this.f1677b.mo2990a()) {
            this.f1690o = z;
            this.f1677b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: d */
    public void mo2239d(boolean z) {
        if (!this.f1668A) {
            mo2232a(z);
        }
    }

    /* renamed from: e */
    public void mo2241e(boolean z) {
        C0635h hVar;
        this.f1675H = z;
        if (!z && (hVar = this.f1689n) != null) {
            hVar.mo2539c();
        }
    }

    /* renamed from: f */
    public void mo2243f(boolean z) {
        if (z != this.f1669B) {
            this.f1669B = z;
            int size = this.f1670C.size();
            for (int i = 0; i < size; i++) {
                this.f1670C.get(i).mo2246a(z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo2244f() {
        C0738af afVar = this.f1679d;
        if (afVar == null || !afVar.mo3542c()) {
            return false;
        }
        this.f1679d.mo3543d();
        return true;
    }

    /* renamed from: g */
    public void mo2419g(boolean z) {
        this.f1686k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2420h() {
        C0625b.C0626a aVar = this.f1685j;
        if (aVar != null) {
            aVar.mo2386a(this.f1684i);
            this.f1684i = null;
            this.f1685j = null;
        }
    }

    /* renamed from: h */
    public void mo2421h(boolean z) {
        View view;
        View view2;
        C0635h hVar = this.f1689n;
        if (hVar != null) {
            hVar.mo2539c();
        }
        this.f1678c.setVisibility(0);
        if (this.f1672E != 0 || (!this.f1675H && !z)) {
            this.f1678c.setAlpha(1.0f);
            this.f1678c.setTranslationY(0.0f);
            if (this.f1686k && (view = this.f1681f) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1692q.mo1644b((View) null);
        } else {
            this.f1678c.setTranslationY(0.0f);
            float f = (float) (-this.f1678c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1678c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1678c.setTranslationY(f);
            C0635h hVar2 = new C0635h();
            C0409u b = C0388q.m1664k(this.f1678c).mo1635b(0.0f);
            b.mo1633a(this.f1693r);
            hVar2.mo2533a(b);
            if (this.f1686k && (view2 = this.f1681f) != null) {
                view2.setTranslationY(f);
                hVar2.mo2533a(C0388q.m1664k(this.f1681f).mo1635b(0.0f));
            }
            hVar2.mo2536a(f1667u);
            hVar2.mo2532a(250);
            hVar2.mo2535a(this.f1692q);
            this.f1689n = hVar2;
            hVar2.mo2537a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1677b;
        if (actionBarOverlayLayout != null) {
            C0388q.m1668o(actionBarOverlayLayout);
        }
    }

    /* renamed from: i */
    public int mo2422i() {
        return this.f1679d.mo3557p();
    }

    /* renamed from: i */
    public void mo2423i(boolean z) {
        View view;
        C0635h hVar = this.f1689n;
        if (hVar != null) {
            hVar.mo2539c();
        }
        if (this.f1672E != 0 || (!this.f1675H && !z)) {
            this.f1691p.mo1644b((View) null);
            return;
        }
        this.f1678c.setAlpha(1.0f);
        this.f1678c.setTransitioning(true);
        C0635h hVar2 = new C0635h();
        float f = (float) (-this.f1678c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1678c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0409u b = C0388q.m1664k(this.f1678c).mo1635b(f);
        b.mo1633a(this.f1693r);
        hVar2.mo2533a(b);
        if (this.f1686k && (view = this.f1681f) != null) {
            hVar2.mo2533a(C0388q.m1664k(view).mo1635b(f));
        }
        hVar2.mo2536a(f1666t);
        hVar2.mo2532a(250);
        hVar2.mo2535a(this.f1691p);
        this.f1689n = hVar2;
        hVar2.mo2537a();
    }

    /* renamed from: j */
    public void mo2424j() {
        if (this.f1688m) {
            this.f1688m = false;
            m2771l(true);
        }
    }

    /* renamed from: j */
    public void mo2425j(boolean z) {
        C0409u uVar;
        C0409u uVar2;
        if (z) {
            m2772n();
        } else {
            m2773o();
        }
        if (m2774p()) {
            if (z) {
                uVar = this.f1679d.mo3527a(4, 100);
                uVar2 = this.f1680e.mo2961a(0, 200);
            } else {
                uVar2 = this.f1679d.mo3527a(0, 200);
                uVar = this.f1680e.mo2961a(8, 100);
            }
            C0635h hVar = new C0635h();
            hVar.mo2534a(uVar, uVar2);
            hVar.mo2537a();
        } else if (z) {
            this.f1679d.mo3546e(4);
            this.f1680e.setVisibility(0);
        } else {
            this.f1679d.mo3546e(0);
            this.f1680e.setVisibility(8);
        }
    }

    /* renamed from: k */
    public void mo2426k() {
        if (!this.f1688m) {
            this.f1688m = true;
            m2771l(true);
        }
    }

    /* renamed from: l */
    public void mo2427l() {
        C0635h hVar = this.f1689n;
        if (hVar != null) {
            hVar.mo2539c();
            this.f1689n = null;
        }
    }

    /* renamed from: m */
    public void mo2428m() {
    }
}
