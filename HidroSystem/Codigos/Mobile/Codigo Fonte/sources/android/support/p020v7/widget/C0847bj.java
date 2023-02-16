package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0409u;
import android.support.p005v4.p017i.C0413v;
import android.support.p005v4.p017i.C0414w;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.support.p020v7.view.menu.C0640a;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.widget.bj */
public class C0847bj implements C0738af {

    /* renamed from: a */
    Toolbar f2879a;

    /* renamed from: b */
    CharSequence f2880b;

    /* renamed from: c */
    Window.Callback f2881c;

    /* renamed from: d */
    boolean f2882d;

    /* renamed from: e */
    private int f2883e;

    /* renamed from: f */
    private View f2884f;

    /* renamed from: g */
    private View f2885g;

    /* renamed from: h */
    private Drawable f2886h;

    /* renamed from: i */
    private Drawable f2887i;

    /* renamed from: j */
    private Drawable f2888j;

    /* renamed from: k */
    private boolean f2889k;

    /* renamed from: l */
    private CharSequence f2890l;

    /* renamed from: m */
    private CharSequence f2891m;

    /* renamed from: n */
    private C0868d f2892n;

    /* renamed from: o */
    private int f2893o;

    /* renamed from: p */
    private int f2894p;

    /* renamed from: q */
    private Drawable f2895q;

    public C0847bj(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0526a.C0534h.abc_action_bar_up_description, C0526a.C0531e.abc_ic_ab_back_material);
    }

    public C0847bj(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2893o = 0;
        this.f2894p = 0;
        this.f2879a = toolbar;
        this.f2880b = toolbar.getTitle();
        this.f2890l = toolbar.getSubtitle();
        this.f2889k = this.f2880b != null;
        this.f2888j = toolbar.getNavigationIcon();
        C0846bi a = C0846bi.m4625a(toolbar.getContext(), (AttributeSet) null, C0526a.C0536j.ActionBar, C0526a.C0527a.actionBarStyle, 0);
        this.f2895q = a.mo4291a(C0526a.C0536j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.mo4297c(C0526a.C0536j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo4307b(c);
            }
            CharSequence c2 = a.mo4297c(C0526a.C0536j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c2)) {
                mo4309c(c2);
            }
            Drawable a2 = a.mo4291a(C0526a.C0536j.ActionBar_logo);
            if (a2 != null) {
                mo4308c(a2);
            }
            Drawable a3 = a.mo4291a(C0526a.C0536j.ActionBar_icon);
            if (a3 != null) {
                mo3530a(a3);
            }
            if (this.f2888j == null && (drawable = this.f2895q) != null) {
                mo3539b(drawable);
            }
            mo3541c(a.mo4289a(C0526a.C0536j.ActionBar_displayOptions, 0));
            int g = a.mo4304g(C0526a.C0536j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo4306a(LayoutInflater.from(this.f2879a.getContext()).inflate(g, this.f2879a, false));
                mo3541c(this.f2883e | 16);
            }
            int f = a.mo4302f(C0526a.C0536j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2879a.getLayoutParams();
                layoutParams.height = f;
                this.f2879a.setLayoutParams(layoutParams);
            }
            int d = a.mo4298d(C0526a.C0536j.ActionBar_contentInsetStart, -1);
            int d2 = a.mo4298d(C0526a.C0536j.ActionBar_contentInsetEnd, -1);
            if (d >= 0 || d2 >= 0) {
                this.f2879a.mo3355a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo4304g(C0526a.C0536j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f2879a;
                toolbar2.mo3356a(toolbar2.getContext(), g2);
            }
            int g3 = a.mo4304g(C0526a.C0536j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f2879a;
                toolbar3.mo3360b(toolbar3.getContext(), g3);
            }
            int g4 = a.mo4304g(C0526a.C0536j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f2879a.setPopupTheme(g4);
            }
        } else {
            this.f2883e = m4645r();
        }
        a.mo4292a();
        mo4311f(i);
        this.f2891m = this.f2879a.getNavigationContentDescription();
        this.f2879a.setNavigationOnClickListener(new View.OnClickListener() {

            /* renamed from: a */
            final C0640a f2896a = new C0640a(C0847bj.this.f2879a.getContext(), 0, 16908332, 0, 0, C0847bj.this.f2880b);

            public void onClick(View view) {
                if (C0847bj.this.f2881c != null && C0847bj.this.f2882d) {
                    C0847bj.this.f2881c.onMenuItemSelected(0, this.f2896a);
                }
            }
        });
    }

    /* renamed from: e */
    private void m4644e(CharSequence charSequence) {
        this.f2880b = charSequence;
        if ((this.f2883e & 8) != 0) {
            this.f2879a.setTitle(charSequence);
        }
    }

    /* renamed from: r */
    private int m4645r() {
        if (this.f2879a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2895q = this.f2879a.getNavigationIcon();
        return 15;
    }

    /* renamed from: s */
    private void m4646s() {
        Drawable drawable;
        int i = this.f2883e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2887i) == null) {
            drawable = this.f2886h;
        }
        this.f2879a.setLogo(drawable);
    }

    /* renamed from: t */
    private void m4647t() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f2883e & 4) != 0) {
            toolbar = this.f2879a;
            drawable = this.f2888j;
            if (drawable == null) {
                drawable = this.f2895q;
            }
        } else {
            toolbar = this.f2879a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: u */
    private void m4648u() {
        if ((this.f2883e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2891m)) {
            this.f2879a.setNavigationContentDescription(this.f2894p);
        } else {
            this.f2879a.setNavigationContentDescription(this.f2891m);
        }
    }

    /* renamed from: a */
    public C0409u mo3527a(final int i, long j) {
        return C0388q.m1664k(this.f2879a).mo1630a(i == 0 ? 1.0f : 0.0f).mo1631a(j).mo1632a((C0413v) new C0414w() {

            /* renamed from: c */
            private boolean f2900c = false;

            /* renamed from: a */
            public void mo1643a(View view) {
                C0847bj.this.f2879a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo1644b(View view) {
                if (!this.f2900c) {
                    C0847bj.this.f2879a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo1645c(View view) {
                this.f2900c = true;
            }
        });
    }

    /* renamed from: a */
    public ViewGroup mo3528a() {
        return this.f2879a;
    }

    /* renamed from: a */
    public void mo3529a(int i) {
        mo3530a(i != 0 ? C0616b.m2831b(mo3537b(), i) : null);
    }

    /* renamed from: a */
    public void mo3530a(Drawable drawable) {
        this.f2886h = drawable;
        m4646s();
    }

    /* renamed from: a */
    public void mo3531a(C0669o.C0670a aVar, C0653h.C0654a aVar2) {
        this.f2879a.mo3358a(aVar, aVar2);
    }

    /* renamed from: a */
    public void mo3532a(C0833ba baVar) {
        Toolbar toolbar;
        View view = this.f2884f;
        if (view != null && view.getParent() == (toolbar = this.f2879a)) {
            toolbar.removeView(this.f2884f);
        }
        this.f2884f = baVar;
        if (baVar != null && this.f2893o == 2) {
            this.f2879a.addView(this.f2884f, 0);
            Toolbar.C0724b bVar = (Toolbar.C0724b) this.f2884f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f1495a = 8388691;
            baVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo3533a(Menu menu, C0669o.C0670a aVar) {
        if (this.f2892n == null) {
            this.f2892n = new C0868d(this.f2879a.getContext());
            this.f2892n.mo2626a(C0526a.C0532f.action_menu_presenter);
        }
        this.f2892n.mo229a(aVar);
        this.f2879a.mo3357a((C0653h) menu, this.f2892n);
    }

    /* renamed from: a */
    public void mo4306a(View view) {
        View view2 = this.f2885g;
        if (!(view2 == null || (this.f2883e & 16) == 0)) {
            this.f2879a.removeView(view2);
        }
        this.f2885g = view;
        if (view != null && (this.f2883e & 16) != 0) {
            this.f2879a.addView(this.f2885g);
        }
    }

    /* renamed from: a */
    public void mo3534a(Window.Callback callback) {
        this.f2881c = callback;
    }

    /* renamed from: a */
    public void mo3535a(CharSequence charSequence) {
        if (!this.f2889k) {
            m4644e(charSequence);
        }
    }

    /* renamed from: a */
    public void mo3536a(boolean z) {
        this.f2879a.setCollapsible(z);
    }

    /* renamed from: b */
    public Context mo3537b() {
        return this.f2879a.getContext();
    }

    /* renamed from: b */
    public void mo3538b(int i) {
        mo4308c(i != 0 ? C0616b.m2831b(mo3537b(), i) : null);
    }

    /* renamed from: b */
    public void mo3539b(Drawable drawable) {
        this.f2888j = drawable;
        m4647t();
    }

    /* renamed from: b */
    public void mo4307b(CharSequence charSequence) {
        this.f2889k = true;
        m4644e(charSequence);
    }

    /* renamed from: b */
    public void mo3540b(boolean z) {
    }

    /* renamed from: c */
    public void mo3541c(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f2883e ^ i;
        this.f2883e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m4648u();
                }
                m4647t();
            }
            if ((i2 & 3) != 0) {
                m4646s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2879a.setTitle(this.f2880b);
                    toolbar = this.f2879a;
                    charSequence = this.f2890l;
                } else {
                    charSequence = null;
                    this.f2879a.setTitle((CharSequence) null);
                    toolbar = this.f2879a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f2885g) != null) {
                if ((i & 16) != 0) {
                    this.f2879a.addView(view);
                } else {
                    this.f2879a.removeView(view);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4308c(Drawable drawable) {
        this.f2887i = drawable;
        m4646s();
    }

    /* renamed from: c */
    public void mo4309c(CharSequence charSequence) {
        this.f2890l = charSequence;
        if ((this.f2883e & 8) != 0) {
            this.f2879a.setSubtitle(charSequence);
        }
    }

    /* renamed from: c */
    public boolean mo3542c() {
        return this.f2879a.mo3367g();
    }

    /* renamed from: d */
    public void mo3543d() {
        this.f2879a.mo3397h();
    }

    /* renamed from: d */
    public void mo3544d(int i) {
        mo4310d((CharSequence) i == 0 ? null : mo3537b().getString(i));
    }

    /* renamed from: d */
    public void mo4310d(CharSequence charSequence) {
        this.f2891m = charSequence;
        m4648u();
    }

    /* renamed from: e */
    public CharSequence mo3545e() {
        return this.f2879a.getTitle();
    }

    /* renamed from: e */
    public void mo3546e(int i) {
        this.f2879a.setVisibility(i);
    }

    /* renamed from: f */
    public void mo3547f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: f */
    public void mo4311f(int i) {
        if (i != this.f2894p) {
            this.f2894p = i;
            if (TextUtils.isEmpty(this.f2879a.getNavigationContentDescription())) {
                mo3544d(this.f2894p);
            }
        }
    }

    /* renamed from: g */
    public void mo3548g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: h */
    public boolean mo3549h() {
        return this.f2879a.mo3359a();
    }

    /* renamed from: i */
    public boolean mo3550i() {
        return this.f2879a.mo3361b();
    }

    /* renamed from: j */
    public boolean mo3551j() {
        return this.f2879a.mo3362c();
    }

    /* renamed from: k */
    public boolean mo3552k() {
        return this.f2879a.mo3364d();
    }

    /* renamed from: l */
    public boolean mo3553l() {
        return this.f2879a.mo3365e();
    }

    /* renamed from: m */
    public void mo3554m() {
        this.f2882d = true;
    }

    /* renamed from: n */
    public void mo3555n() {
        this.f2879a.mo3366f();
    }

    /* renamed from: o */
    public int mo3556o() {
        return this.f2883e;
    }

    /* renamed from: p */
    public int mo3557p() {
        return this.f2893o;
    }

    /* renamed from: q */
    public Menu mo3558q() {
        return this.f2879a.getMenu();
    }
}
