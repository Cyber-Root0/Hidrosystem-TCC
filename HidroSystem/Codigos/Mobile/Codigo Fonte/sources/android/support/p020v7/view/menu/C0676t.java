package android.support.p020v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.widget.C0780as;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C0676t extends C0666m implements C0669o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    final C0780as f2007a;

    /* renamed from: b */
    View f2008b;

    /* renamed from: c */
    private final Context f2009c;

    /* renamed from: d */
    private final C0653h f2010d;

    /* renamed from: e */
    private final C0652g f2011e;

    /* renamed from: f */
    private final boolean f2012f;

    /* renamed from: g */
    private final int f2013g;

    /* renamed from: h */
    private final int f2014h;

    /* renamed from: i */
    private final int f2015i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f2016j = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0676t.this.mo2648f() && !C0676t.this.f2007a.mo3686c()) {
                View view = C0676t.this.f2008b;
                if (view == null || !view.isShown()) {
                    C0676t.this.mo2647e();
                } else {
                    C0676t.this.f2007a.mo2646d();
                }
            }
        }
    };

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f2017k = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0676t.this.f2021o != null) {
                if (!C0676t.this.f2021o.isAlive()) {
                    ViewTreeObserver unused = C0676t.this.f2021o = view.getViewTreeObserver();
                }
                C0676t.this.f2021o.removeGlobalOnLayoutListener(C0676t.this.f2016j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: l */
    private PopupWindow.OnDismissListener f2018l;

    /* renamed from: m */
    private View f2019m;

    /* renamed from: n */
    private C0669o.C0670a f2020n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ViewTreeObserver f2021o;

    /* renamed from: p */
    private boolean f2022p;

    /* renamed from: q */
    private boolean f2023q;

    /* renamed from: r */
    private int f2024r;

    /* renamed from: s */
    private int f2025s = 0;

    /* renamed from: t */
    private boolean f2026t;

    public C0676t(Context context, C0653h hVar, View view, int i, int i2, boolean z) {
        this.f2009c = context;
        this.f2010d = hVar;
        this.f2012f = z;
        this.f2011e = new C0652g(hVar, LayoutInflater.from(context), this.f2012f);
        this.f2014h = i;
        this.f2015i = i2;
        Resources resources = context.getResources();
        this.f2013g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0526a.C0530d.abc_config_prefDialogWidth));
        this.f2019m = view;
        this.f2007a = new C0780as(this.f2009c, (AttributeSet) null, this.f2014h, this.f2015i);
        hVar.mo2693a((C0669o) this, context);
    }

    /* renamed from: j */
    private boolean m3198j() {
        View view;
        if (mo2648f()) {
            return true;
        }
        if (this.f2022p || (view = this.f2019m) == null) {
            return false;
        }
        this.f2008b = view;
        this.f2007a.mo3680a((PopupWindow.OnDismissListener) this);
        this.f2007a.mo3678a((AdapterView.OnItemClickListener) this);
        this.f2007a.mo3681a(true);
        View view2 = this.f2008b;
        boolean z = this.f2021o == null;
        this.f2021o = view2.getViewTreeObserver();
        if (z) {
            this.f2021o.addOnGlobalLayoutListener(this.f2016j);
        }
        view2.addOnAttachStateChangeListener(this.f2017k);
        this.f2007a.mo3683b(view2);
        this.f2007a.mo3688e(this.f2025s);
        if (!this.f2023q) {
            this.f2024r = m3140a(this.f2011e, (ViewGroup) null, this.f2009c, this.f2013g);
            this.f2023q = true;
        }
        this.f2007a.mo3690g(this.f2024r);
        this.f2007a.mo3692h(2);
        this.f2007a.mo3676a(mo2880i());
        this.f2007a.mo2646d();
        ListView g = this.f2007a.mo2649g();
        g.setOnKeyListener(this);
        if (this.f2026t && this.f2010d.mo2738m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2009c).inflate(C0526a.C0533g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f2010d.mo2738m());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f2007a.mo3679a((ListAdapter) this.f2011e);
        this.f2007a.mo2646d();
        return true;
    }

    /* renamed from: a */
    public void mo2638a(int i) {
        this.f2025s = i;
    }

    /* renamed from: a */
    public void mo225a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo2639a(C0653h hVar) {
    }

    /* renamed from: a */
    public void mo227a(C0653h hVar, boolean z) {
        if (hVar == this.f2010d) {
            mo2647e();
            C0669o.C0670a aVar = this.f2020n;
            if (aVar != null) {
                aVar.mo2384a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo229a(C0669o.C0670a aVar) {
        this.f2020n = aVar;
    }

    /* renamed from: a */
    public void mo2640a(View view) {
        this.f2019m = view;
    }

    /* renamed from: a */
    public void mo2641a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2018l = onDismissListener;
    }

    /* renamed from: a */
    public void mo231a(boolean z) {
        this.f2023q = false;
        C0652g gVar = this.f2011e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo232a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo234a(C0679u uVar) {
        if (uVar.hasVisibleItems()) {
            C0667n nVar = new C0667n(this.f2009c, uVar, this.f2008b, this.f2012f, this.f2014h, this.f2015i);
            nVar.mo2884a(this.f2020n);
            nVar.mo2887a(C0666m.m3142b((C0653h) uVar));
            nVar.mo2883a(this.f2025s);
            nVar.mo2886a(this.f2018l);
            this.f2018l = null;
            this.f2010d.mo2711b(false);
            if (nVar.mo2888a(this.f2007a.mo3695j(), this.f2007a.mo3696k())) {
                C0669o.C0670a aVar = this.f2020n;
                if (aVar == null) {
                    return true;
                }
                aVar.mo2385a(uVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo2642b(int i) {
        this.f2007a.mo3685c(i);
    }

    /* renamed from: b */
    public void mo2643b(boolean z) {
        this.f2011e.mo2674a(z);
    }

    /* renamed from: c */
    public Parcelable mo240c() {
        return null;
    }

    /* renamed from: c */
    public void mo2644c(int i) {
        this.f2007a.mo3687d(i);
    }

    /* renamed from: c */
    public void mo2645c(boolean z) {
        this.f2026t = z;
    }

    /* renamed from: d */
    public void mo2646d() {
        if (!m3198j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: e */
    public void mo2647e() {
        if (mo2648f()) {
            this.f2007a.mo2647e();
        }
    }

    /* renamed from: f */
    public boolean mo2648f() {
        return !this.f2022p && this.f2007a.mo2648f();
    }

    /* renamed from: g */
    public ListView mo2649g() {
        return this.f2007a.mo2649g();
    }

    public void onDismiss() {
        this.f2022p = true;
        this.f2010d.close();
        ViewTreeObserver viewTreeObserver = this.f2021o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2021o = this.f2008b.getViewTreeObserver();
            }
            this.f2021o.removeGlobalOnLayoutListener(this.f2016j);
            this.f2021o = null;
        }
        this.f2008b.removeOnAttachStateChangeListener(this.f2017k);
        PopupWindow.OnDismissListener onDismissListener = this.f2018l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo2647e();
        return true;
    }
}
