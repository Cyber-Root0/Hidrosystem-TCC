package android.support.p020v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p005v4.p006a.C0223w;
import android.support.p005v4.p017i.C0371e;
import android.support.p005v4.p017i.C0386o;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0409u;
import android.support.p005v4.p017i.C0413v;
import android.support.p005v4.p017i.C0414w;
import android.support.p005v4.p017i.C0416y;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.view.C0628d;
import android.support.p020v7.view.menu.C0650f;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.widget.ActionBarContextView;
import android.support.p020v7.widget.C0737ae;
import android.support.p020v7.widget.C0757ak;
import android.support.p020v7.widget.C0859bn;
import android.support.p020v7.widget.C0866bq;
import android.support.p020v7.widget.C0893m;
import android.support.p020v7.widget.ContentFrameLayout;
import android.support.p020v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.m */
class C0583m extends C0570h implements C0653h.C0654a, LayoutInflater.Factory2 {

    /* renamed from: t */
    private static final boolean f1561t = (Build.VERSION.SDK_INT < 21);

    /* renamed from: A */
    private View f1562A;

    /* renamed from: B */
    private boolean f1563B;

    /* renamed from: C */
    private boolean f1564C;

    /* renamed from: D */
    private boolean f1565D;

    /* renamed from: E */
    private C0595d[] f1566E;

    /* renamed from: F */
    private C0595d f1567F;

    /* renamed from: G */
    private boolean f1568G;

    /* renamed from: H */
    private final Runnable f1569H = new Runnable() {
        public void run() {
            if ((C0583m.this.f1580s & 1) != 0) {
                C0583m.this.mo2371f(0);
            }
            if ((C0583m.this.f1580s & 4096) != 0) {
                C0583m.this.mo2371f(108);
            }
            C0583m mVar = C0583m.this;
            mVar.f1579r = false;
            mVar.f1580s = 0;
        }
    };

    /* renamed from: I */
    private boolean f1570I;

    /* renamed from: J */
    private Rect f1571J;

    /* renamed from: K */
    private Rect f1572K;

    /* renamed from: L */
    private C0598o f1573L;

    /* renamed from: m */
    C0625b f1574m;

    /* renamed from: n */
    ActionBarContextView f1575n;

    /* renamed from: o */
    PopupWindow f1576o;

    /* renamed from: p */
    Runnable f1577p;

    /* renamed from: q */
    C0409u f1578q = null;

    /* renamed from: r */
    boolean f1579r;

    /* renamed from: s */
    int f1580s;

    /* renamed from: u */
    private C0737ae f1581u;

    /* renamed from: v */
    private C0591a f1582v;

    /* renamed from: w */
    private C0596e f1583w;

    /* renamed from: x */
    private boolean f1584x;

    /* renamed from: y */
    private ViewGroup f1585y;

    /* renamed from: z */
    private TextView f1586z;

    /* renamed from: android.support.v7.app.m$a */
    private final class C0591a implements C0669o.C0670a {
        C0591a() {
        }

        /* renamed from: a */
        public void mo2384a(C0653h hVar, boolean z) {
            C0583m.this.mo2367b(hVar);
        }

        /* renamed from: a */
        public boolean mo2385a(C0653h hVar) {
            Window.Callback r = C0583m.this.mo2339r();
            if (r == null) {
                return true;
            }
            r.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.m$b */
    class C0592b implements C0625b.C0626a {

        /* renamed from: b */
        private C0625b.C0626a f1596b;

        public C0592b(C0625b.C0626a aVar) {
            this.f1596b = aVar;
        }

        /* renamed from: a */
        public void mo2386a(C0625b bVar) {
            this.f1596b.mo2386a(bVar);
            if (C0583m.this.f1576o != null) {
                C0583m.this.f1530b.getDecorView().removeCallbacks(C0583m.this.f1577p);
            }
            if (C0583m.this.f1575n != null) {
                C0583m.this.mo2376u();
                C0583m mVar = C0583m.this;
                mVar.f1578q = C0388q.m1664k(mVar.f1575n).mo1630a(0.0f);
                C0583m.this.f1578q.mo1632a((C0413v) new C0414w() {
                    /* renamed from: b */
                    public void mo1644b(View view) {
                        C0583m.this.f1575n.setVisibility(8);
                        if (C0583m.this.f1576o != null) {
                            C0583m.this.f1576o.dismiss();
                        } else if (C0583m.this.f1575n.getParent() instanceof View) {
                            C0388q.m1668o((View) C0583m.this.f1575n.getParent());
                        }
                        C0583m.this.f1575n.removeAllViews();
                        C0583m.this.f1578q.mo1632a((C0413v) null);
                        C0583m.this.f1578q = null;
                    }
                });
            }
            if (C0583m.this.f1533e != null) {
                C0583m.this.f1533e.mo2284b(C0583m.this.f1574m);
            }
            C0583m.this.f1574m = null;
        }

        /* renamed from: a */
        public boolean mo2387a(C0625b bVar, Menu menu) {
            return this.f1596b.mo2387a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo2388a(C0625b bVar, MenuItem menuItem) {
            return this.f1596b.mo2388a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo2389b(C0625b bVar, Menu menu) {
            return this.f1596b.mo2389b(bVar, menu);
        }
    }

    /* renamed from: android.support.v7.app.m$c */
    private class C0594c extends ContentFrameLayout {
        public C0594c(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m2707a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0583m.this.mo2331a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2707a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0583m.this.mo2370e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0616b.m2831b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.m$d */
    protected static final class C0595d {

        /* renamed from: a */
        int f1599a;

        /* renamed from: b */
        int f1600b;

        /* renamed from: c */
        int f1601c;

        /* renamed from: d */
        int f1602d;

        /* renamed from: e */
        int f1603e;

        /* renamed from: f */
        int f1604f;

        /* renamed from: g */
        ViewGroup f1605g;

        /* renamed from: h */
        View f1606h;

        /* renamed from: i */
        View f1607i;

        /* renamed from: j */
        C0653h f1608j;

        /* renamed from: k */
        C0650f f1609k;

        /* renamed from: l */
        Context f1610l;

        /* renamed from: m */
        boolean f1611m;

        /* renamed from: n */
        boolean f1612n;

        /* renamed from: o */
        boolean f1613o;

        /* renamed from: p */
        public boolean f1614p;

        /* renamed from: q */
        boolean f1615q = false;

        /* renamed from: r */
        boolean f1616r;

        /* renamed from: s */
        Bundle f1617s;

        C0595d(int i) {
            this.f1599a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0671p mo2393a(C0669o.C0670a aVar) {
            if (this.f1608j == null) {
                return null;
            }
            if (this.f1609k == null) {
                this.f1609k = new C0650f(this.f1610l, C0526a.C0533g.abc_list_menu_item_layout);
                this.f1609k.mo229a(aVar);
                this.f1608j.mo2692a((C0669o) this.f1609k);
            }
            return this.f1609k.mo2660a(this.f1605g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2394a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0526a.C0527a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0526a.C0527a.panelMenuListTheme, typedValue, true);
            newTheme.applyStyle(typedValue.resourceId != 0 ? typedValue.resourceId : C0526a.C0535i.Theme_AppCompat_CompactMenu, true);
            C0628d dVar = new C0628d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1610l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0526a.C0536j.AppCompatTheme);
            this.f1600b = obtainStyledAttributes.getResourceId(C0526a.C0536j.AppCompatTheme_panelBackground, 0);
            this.f1604f = obtainStyledAttributes.getResourceId(C0526a.C0536j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2395a(C0653h hVar) {
            C0650f fVar;
            C0653h hVar2 = this.f1608j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.mo2710b((C0669o) this.f1609k);
                }
                this.f1608j = hVar;
                if (hVar != null && (fVar = this.f1609k) != null) {
                    hVar.mo2692a((C0669o) fVar);
                }
            }
        }

        /* renamed from: a */
        public boolean mo2396a() {
            if (this.f1606h == null) {
                return false;
            }
            return this.f1607i != null || this.f1609k.mo2663d().getCount() > 0;
        }
    }

    /* renamed from: android.support.v7.app.m$e */
    private final class C0596e implements C0669o.C0670a {
        C0596e() {
        }

        /* renamed from: a */
        public void mo2384a(C0653h hVar, boolean z) {
            C0653h p = hVar.mo2741p();
            boolean z2 = p != hVar;
            C0583m mVar = C0583m.this;
            if (z2) {
                hVar = p;
            }
            C0595d a = mVar.mo2361a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0583m.this.mo2362a(a.f1599a, a, p);
                C0583m.this.mo2363a(a, true);
                return;
            }
            C0583m.this.mo2363a(a, z);
        }

        /* renamed from: a */
        public boolean mo2385a(C0653h hVar) {
            Window.Callback r;
            if (hVar != null || !C0583m.this.f1536h || (r = C0583m.this.mo2339r()) == null || C0583m.this.mo2338q()) {
                return true;
            }
            r.onMenuOpened(108, hVar);
            return true;
        }
    }

    C0583m(Context context, Window window, C0568f fVar) {
        super(context, window, fVar);
    }

    /* renamed from: A */
    private void m2634A() {
        if (this.f1584x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m2635a(C0595d dVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!dVar.f1613o && !mo2338q()) {
            if (dVar.f1599a == 0) {
                Context context = this.f1529a;
                boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
                boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
                if (z && z2) {
                    return;
                }
            }
            Window.Callback r = mo2339r();
            if (r == null || r.onMenuOpened(dVar.f1599a, dVar.f1608j)) {
                WindowManager windowManager = (WindowManager) this.f1529a.getSystemService("window");
                if (windowManager != null && m2641b(dVar, keyEvent)) {
                    if (dVar.f1605g == null || dVar.f1615q) {
                        if (dVar.f1605g == null) {
                            if (!m2637a(dVar) || dVar.f1605g == null) {
                                return;
                            }
                        } else if (dVar.f1615q && dVar.f1605g.getChildCount() > 0) {
                            dVar.f1605g.removeAllViews();
                        }
                        if (m2642c(dVar) && dVar.mo2396a()) {
                            ViewGroup.LayoutParams layoutParams2 = dVar.f1606h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            dVar.f1605g.setBackgroundResource(dVar.f1600b);
                            ViewParent parent = dVar.f1606h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(dVar.f1606h);
                            }
                            dVar.f1605g.addView(dVar.f1606h, layoutParams2);
                            if (!dVar.f1606h.hasFocus()) {
                                dVar.f1606h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (!(dVar.f1607i == null || (layoutParams = dVar.f1607i.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        dVar.f1612n = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, dVar.f1602d, dVar.f1603e, 1002, 8519680, -3);
                        layoutParams3.gravity = dVar.f1601c;
                        layoutParams3.windowAnimations = dVar.f1604f;
                        windowManager.addView(dVar.f1605g, layoutParams3);
                        dVar.f1613o = true;
                        return;
                    }
                    i = -2;
                    dVar.f1612n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, dVar.f1602d, dVar.f1603e, 1002, 8519680, -3);
                    layoutParams32.gravity = dVar.f1601c;
                    layoutParams32.windowAnimations = dVar.f1604f;
                    windowManager.addView(dVar.f1605g, layoutParams32);
                    dVar.f1613o = true;
                    return;
                }
                return;
            }
            mo2363a(dVar, true);
        }
    }

    /* renamed from: a */
    private void m2636a(C0653h hVar, boolean z) {
        C0737ae aeVar = this.f1581u;
        if (aeVar == null || !aeVar.mo2996e() || (ViewConfiguration.get(this.f1529a).hasPermanentMenuKey() && !this.f1581u.mo2999g())) {
            C0595d a = mo2360a(0, true);
            a.f1615q = true;
            mo2363a(a, false);
            m2635a(a, (KeyEvent) null);
            return;
        }
        Window.Callback r = mo2339r();
        if (this.f1581u.mo2997f() && z) {
            this.f1581u.mo3007i();
            if (!mo2338q()) {
                r.onPanelClosed(108, mo2360a(0, true).f1608j);
            }
        } else if (r != null && !mo2338q()) {
            if (this.f1579r && (this.f1580s & 1) != 0) {
                this.f1530b.getDecorView().removeCallbacks(this.f1569H);
                this.f1569H.run();
            }
            C0595d a2 = mo2360a(0, true);
            if (a2.f1608j != null && !a2.f1616r && r.onPreparePanel(0, a2.f1607i, a2.f1608j)) {
                r.onMenuOpened(108, a2.f1608j);
                this.f1581u.mo3006h();
            }
        }
    }

    /* renamed from: a */
    private boolean m2637a(C0595d dVar) {
        dVar.mo2394a(mo2336o());
        dVar.f1605g = new C0594c(dVar.f1610l);
        dVar.f1601c = 81;
        return true;
    }

    /* renamed from: a */
    private boolean m2638a(C0595d dVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((dVar.f1611m || m2641b(dVar, keyEvent)) && dVar.f1608j != null) {
            z = dVar.f1608j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1581u == null) {
            mo2363a(dVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m2639a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1530b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0388q.m1678y((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: b */
    private boolean m2640b(C0595d dVar) {
        Context context = this.f1529a;
        if ((dVar.f1599a == 0 || dVar.f1599a == 108) && this.f1581u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0526a.C0527a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0526a.C0527a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0526a.C0527a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0628d dVar2 = new C0628d(context, 0);
                dVar2.getTheme().setTo(theme2);
                context = dVar2;
            }
        }
        C0653h hVar = new C0653h(context);
        hVar.mo2690a((C0653h.C0654a) this);
        dVar.mo2395a(hVar);
        return true;
    }

    /* renamed from: b */
    private boolean m2641b(C0595d dVar, KeyEvent keyEvent) {
        C0737ae aeVar;
        C0737ae aeVar2;
        C0737ae aeVar3;
        if (mo2338q()) {
            return false;
        }
        if (dVar.f1611m) {
            return true;
        }
        C0595d dVar2 = this.f1567F;
        if (!(dVar2 == null || dVar2 == dVar)) {
            mo2363a(dVar2, false);
        }
        Window.Callback r = mo2339r();
        if (r != null) {
            dVar.f1607i = r.onCreatePanelView(dVar.f1599a);
        }
        boolean z = dVar.f1599a == 0 || dVar.f1599a == 108;
        if (z && (aeVar3 = this.f1581u) != null) {
            aeVar3.mo3008j();
        }
        if (dVar.f1607i == null && (!z || !(mo2335n() instanceof C0601q))) {
            if (dVar.f1608j == null || dVar.f1616r) {
                if (dVar.f1608j == null && (!m2640b(dVar) || dVar.f1608j == null)) {
                    return false;
                }
                if (z && this.f1581u != null) {
                    if (this.f1582v == null) {
                        this.f1582v = new C0591a();
                    }
                    this.f1581u.mo2989a(dVar.f1608j, this.f1582v);
                }
                dVar.f1608j.mo2729g();
                if (!r.onCreatePanelMenu(dVar.f1599a, dVar.f1608j)) {
                    dVar.mo2395a((C0653h) null);
                    if (z && (aeVar2 = this.f1581u) != null) {
                        aeVar2.mo2989a((Menu) null, this.f1582v);
                    }
                    return false;
                }
                dVar.f1616r = false;
            }
            dVar.f1608j.mo2729g();
            if (dVar.f1617s != null) {
                dVar.f1608j.mo2723d(dVar.f1617s);
                dVar.f1617s = null;
            }
            if (!r.onPreparePanel(0, dVar.f1607i, dVar.f1608j)) {
                if (z && (aeVar = this.f1581u) != null) {
                    aeVar.mo2989a((Menu) null, this.f1582v);
                }
                dVar.f1608j.mo2731h();
                return false;
            }
            dVar.f1614p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            dVar.f1608j.setQwertyMode(dVar.f1614p);
            dVar.f1608j.mo2731h();
        }
        dVar.f1611m = true;
        dVar.f1612n = false;
        this.f1567F = dVar;
        return true;
    }

    /* renamed from: c */
    private boolean m2642c(C0595d dVar) {
        if (dVar.f1607i != null) {
            dVar.f1606h = dVar.f1607i;
            return true;
        } else if (dVar.f1608j == null) {
            return false;
        } else {
            if (this.f1583w == null) {
                this.f1583w = new C0596e();
            }
            dVar.f1606h = (View) dVar.mo2393a((C0669o.C0670a) this.f1583w);
            return dVar.f1606h != null;
        }
    }

    /* renamed from: d */
    private void mo2351d(int i) {
        this.f1580s = (1 << i) | this.f1580s;
        if (!this.f1579r) {
            C0388q.m1647a(this.f1530b.getDecorView(), this.f1569H);
            this.f1579r = true;
        }
    }

    /* renamed from: d */
    private boolean m2644d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0595d a = mo2360a(i, true);
        if (!a.f1613o) {
            return m2641b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2645e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            android.support.v7.view.b r0 = r3.f1574m
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            android.support.v7.app.m$d r2 = r3.mo2360a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0045
            android.support.v7.widget.ae r4 = r3.f1581u
            if (r4 == 0) goto L_0x0045
            boolean r4 = r4.mo2996e()
            if (r4 == 0) goto L_0x0045
            android.content.Context r4 = r3.f1529a
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0045
            android.support.v7.widget.ae r4 = r3.f1581u
            boolean r4 = r4.mo2997f()
            if (r4 != 0) goto L_0x003e
            boolean r4 = r3.mo2338q()
            if (r4 != 0) goto L_0x0065
            boolean r4 = r3.m2641b((android.support.p020v7.app.C0583m.C0595d) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0065
            android.support.v7.widget.ae r4 = r3.f1581u
            boolean r4 = r4.mo3006h()
            goto L_0x006c
        L_0x003e:
            android.support.v7.widget.ae r4 = r3.f1581u
            boolean r4 = r4.mo3007i()
            goto L_0x006c
        L_0x0045:
            boolean r4 = r2.f1613o
            if (r4 != 0) goto L_0x0067
            boolean r4 = r2.f1612n
            if (r4 == 0) goto L_0x004e
            goto L_0x0067
        L_0x004e:
            boolean r4 = r2.f1611m
            if (r4 == 0) goto L_0x0065
            boolean r4 = r2.f1616r
            if (r4 == 0) goto L_0x005d
            r2.f1611m = r1
            boolean r4 = r3.m2641b((android.support.p020v7.app.C0583m.C0595d) r2, (android.view.KeyEvent) r5)
            goto L_0x005e
        L_0x005d:
            r4 = 1
        L_0x005e:
            if (r4 == 0) goto L_0x0065
            r3.m2635a((android.support.p020v7.app.C0583m.C0595d) r2, (android.view.KeyEvent) r5)
            r4 = 1
            goto L_0x006c
        L_0x0065:
            r4 = 0
            goto L_0x006c
        L_0x0067:
            boolean r4 = r2.f1613o
            r3.mo2363a((android.support.p020v7.app.C0583m.C0595d) r2, (boolean) r0)
        L_0x006c:
            if (r4 == 0) goto L_0x0085
            android.content.Context r5 = r3.f1529a
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0085:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.C0583m.m2645e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: h */
    private int m2646h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: x */
    private void m2647x() {
        if (!this.f1584x) {
            this.f1585y = m2648y();
            CharSequence s = mo2340s();
            if (!TextUtils.isEmpty(s)) {
                mo2332b(s);
            }
            m2649z();
            mo2364a(this.f1585y);
            this.f1584x = true;
            C0595d a = mo2360a(0, false);
            if (mo2338q()) {
                return;
            }
            if (a == null || a.f1608j == null) {
                mo2351d(108);
            }
        }
    }

    /* renamed from: y */
    private ViewGroup m2648y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1529a.obtainStyledAttributes(C0526a.C0536j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0526a.C0536j.AppCompatTheme_windowNoTitle, false)) {
                mo2319c(1);
            } else if (obtainStyledAttributes.getBoolean(C0526a.C0536j.AppCompatTheme_windowActionBar, false)) {
                mo2319c(108);
            }
            if (obtainStyledAttributes.getBoolean(C0526a.C0536j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo2319c(109);
            }
            if (obtainStyledAttributes.getBoolean(C0526a.C0536j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo2319c(10);
            }
            this.f1539k = obtainStyledAttributes.getBoolean(C0526a.C0536j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f1530b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1529a);
            if (this.f1540l) {
                viewGroup = (ViewGroup) from.inflate(this.f1538j ? C0526a.C0533g.abc_screen_simple_overlay_action_mode : C0526a.C0533g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    C0388q.m1646a((View) viewGroup, (C0386o) new C0386o() {
                        /* renamed from: a */
                        public C0416y mo277a(View view, C0416y yVar) {
                            int b = yVar.mo1649b();
                            int g = C0583m.this.mo2372g(b);
                            if (b != g) {
                                yVar = yVar.mo1648a(yVar.mo1647a(), g, yVar.mo1650c(), yVar.mo1651d());
                            }
                            return C0388q.m1637a(view, yVar);
                        }
                    });
                } else {
                    ((C0757ak) viewGroup).setOnFitSystemWindowsListener(new C0757ak.C0758a() {
                        /* renamed from: a */
                        public void mo2380a(Rect rect) {
                            rect.top = C0583m.this.mo2372g(rect.top);
                        }
                    });
                }
            } else if (this.f1539k) {
                viewGroup = (ViewGroup) from.inflate(C0526a.C0533g.abc_dialog_title_material, (ViewGroup) null);
                this.f1537i = false;
                this.f1536h = false;
            } else if (this.f1536h) {
                TypedValue typedValue = new TypedValue();
                this.f1529a.getTheme().resolveAttribute(C0526a.C0527a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0628d(this.f1529a, typedValue.resourceId) : this.f1529a).inflate(C0526a.C0533g.abc_screen_toolbar, (ViewGroup) null);
                this.f1581u = (C0737ae) viewGroup.findViewById(C0526a.C0532f.decor_content_parent);
                this.f1581u.setWindowCallback(mo2339r());
                if (this.f1537i) {
                    this.f1581u.mo2988a(109);
                }
                if (this.f1563B) {
                    this.f1581u.mo2988a(2);
                }
                if (this.f1564C) {
                    this.f1581u.mo2988a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f1581u == null) {
                    this.f1586z = (TextView) viewGroup.findViewById(C0526a.C0532f.title);
                }
                C0866bq.m4744b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0526a.C0532f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1530b.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f1530b.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.C0694a() {
                    /* renamed from: a */
                    public void mo2381a() {
                    }

                    /* renamed from: b */
                    public void mo2382b() {
                        C0583m.this.mo2378w();
                    }
                });
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1536h + ", windowActionBarOverlay: " + this.f1537i + ", android:windowIsFloating: " + this.f1539k + ", windowActionModeOverlay: " + this.f1538j + ", windowNoTitle: " + this.f1540l + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m2649z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1585y.findViewById(16908290);
        View decorView = this.f1530b.getDecorView();
        contentFrameLayout.mo3107a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1529a.obtainStyledAttributes(C0526a.C0536j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0526a.C0536j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0526a.C0536j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0526a.C0536j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0526a.C0536j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0526a.C0536j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0526a.C0536j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0595d mo2360a(int i, boolean z) {
        C0595d[] dVarArr = this.f1566E;
        if (dVarArr == null || dVarArr.length <= i) {
            C0595d[] dVarArr2 = new C0595d[(i + 1)];
            if (dVarArr != null) {
                System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
            }
            this.f1566E = dVarArr2;
            dVarArr = dVarArr2;
        }
        C0595d dVar = dVarArr[i];
        if (dVar != null) {
            return dVar;
        }
        C0595d dVar2 = new C0595d(i);
        dVarArr[i] = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0595d mo2361a(Menu menu) {
        C0595d[] dVarArr = this.f1566E;
        int length = dVarArr != null ? dVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0595d dVar = dVarArr[i];
            if (dVar != null && dVar.f1608j == menu) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.p020v7.view.C0625b mo2327a(android.support.p020v7.view.C0625b.C0626a r8) {
        /*
            r7 = this;
            r7.mo2376u()
            android.support.v7.view.b r0 = r7.f1574m
            if (r0 == 0) goto L_0x000a
            r0.mo2437c()
        L_0x000a:
            boolean r0 = r8 instanceof android.support.p020v7.app.C0583m.C0592b
            if (r0 != 0) goto L_0x0014
            android.support.v7.app.m$b r0 = new android.support.v7.app.m$b
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            android.support.v7.app.f r0 = r7.f1533e
            r1 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r7.mo2338q()
            if (r0 != 0) goto L_0x0026
            android.support.v7.app.f r0 = r7.f1533e     // Catch:{ AbstractMethodError -> 0x0026 }
            android.support.v7.view.b r0 = r0.mo2276a((android.support.p020v7.view.C0625b.C0626a) r8)     // Catch:{ AbstractMethodError -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            r7.f1574m = r0
            goto L_0x016a
        L_0x002d:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1575n
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00da
            boolean r0 = r7.f1539k
            if (r0 == 0) goto L_0x00bb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1529a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = android.support.p020v7.p021a.C0526a.C0527a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x006c
            android.content.Context r5 = r7.f1529a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.d r4 = new android.support.v7.view.d
            android.content.Context r6 = r7.f1529a
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006e
        L_0x006c:
            android.content.Context r4 = r7.f1529a
        L_0x006e:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1575n = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = android.support.p020v7.p021a.C0526a.C0527a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f1576o = r5
            android.widget.PopupWindow r5 = r7.f1576o
            r6 = 2
            android.support.p005v4.widget.C0507k.m2357a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.f1576o
            android.support.v7.widget.ActionBarContextView r6 = r7.f1575n
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1576o
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = android.support.p020v7.p021a.C0526a.C0527a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f1575n
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1576o
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.m$5 r0 = new android.support.v7.app.m$5
            r0.<init>()
            r7.f1577p = r0
            goto L_0x00da
        L_0x00bb:
            android.view.ViewGroup r0 = r7.f1585y
            int r4 = android.support.p020v7.p021a.C0526a.C0532f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p020v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00da
            android.content.Context r4 = r7.mo2336o()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo3444a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p020v7.widget.ActionBarContextView) r0
            r7.f1575n = r0
        L_0x00da:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1575n
            if (r0 == 0) goto L_0x016a
            r7.mo2376u()
            android.support.v7.widget.ActionBarContextView r0 = r7.f1575n
            r0.mo2965c()
            android.support.v7.view.e r0 = new android.support.v7.view.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f1575n
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f1575n
            android.widget.PopupWindow r6 = r7.f1576o
            if (r6 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r3 = 0
        L_0x00f6:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo2434b()
            boolean r8 = r8.mo2387a((android.support.p020v7.view.C0625b) r0, (android.view.Menu) r3)
            if (r8 == 0) goto L_0x0168
            r0.mo2438d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            r8.mo2962a(r0)
            r7.f1574m = r0
            boolean r8 = r7.mo2375t()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0132
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            android.support.v4.i.u r8 = android.support.p005v4.p017i.C0388q.m1664k(r8)
            android.support.v4.i.u r8 = r8.mo1630a((float) r0)
            r7.f1578q = r8
            android.support.v4.i.u r8 = r7.f1578q
            android.support.v7.app.m$6 r0 = new android.support.v7.app.m$6
            r0.<init>()
            r8.mo1632a((android.support.p005v4.p017i.C0413v) r0)
            goto L_0x0158
        L_0x0132:
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0158
            android.support.v7.widget.ActionBarContextView r8 = r7.f1575n
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p005v4.p017i.C0388q.m1668o(r8)
        L_0x0158:
            android.widget.PopupWindow r8 = r7.f1576o
            if (r8 == 0) goto L_0x016a
            android.view.Window r8 = r7.f1530b
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1577p
            r8.post(r0)
            goto L_0x016a
        L_0x0168:
            r7.f1574m = r1
        L_0x016a:
            android.support.v7.view.b r8 = r7.f1574m
            if (r8 == 0) goto L_0x0179
            android.support.v7.app.f r8 = r7.f1533e
            if (r8 == 0) goto L_0x0179
            android.support.v7.app.f r8 = r7.f1533e
            android.support.v7.view.b r0 = r7.f1574m
            r8.mo2278a((android.support.p020v7.view.C0625b) r0)
        L_0x0179:
            android.support.v7.view.b r8 = r7.f1574m
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.C0583m.mo2327a(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* renamed from: a */
    public <T extends View> T mo2306a(int i) {
        m2647x();
        return this.f1530b.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo2350a(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.f1531c instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.f1531c).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2362a(int i, C0595d dVar, Menu menu) {
        if (menu == null) {
            if (dVar == null && i >= 0) {
                C0595d[] dVarArr = this.f1566E;
                if (i < dVarArr.length) {
                    dVar = dVarArr[i];
                }
            }
            if (dVar != null) {
                menu = dVar.f1608j;
            }
        }
        if ((dVar == null || dVar.f1613o) && !mo2338q()) {
            this.f1531c.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2329a(int i, Menu menu) {
        if (i == 108) {
            C0550a a = mo2305a();
            if (a != null) {
                a.mo2243f(false);
            }
        } else if (i == 0) {
            C0595d a2 = mo2360a(i, true);
            if (a2.f1613o) {
                mo2363a(a2, false);
            }
        }
    }

    /* renamed from: a */
    public void mo2307a(Configuration configuration) {
        C0550a a;
        if (this.f1536h && this.f1584x && (a = mo2305a()) != null) {
            a.mo2229a(configuration);
        }
        C0893m.m4863a().mo4455a(this.f1529a);
        mo2326j();
    }

    /* renamed from: a */
    public void mo2308a(Bundle bundle) {
        if ((this.f1531c instanceof Activity) && C0223w.m1062b((Activity) this.f1531c) != null) {
            C0550a n = mo2335n();
            if (n == null) {
                this.f1570I = true;
            } else {
                n.mo2239d(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2363a(C0595d dVar, boolean z) {
        C0737ae aeVar;
        if (!z || dVar.f1599a != 0 || (aeVar = this.f1581u) == null || !aeVar.mo2997f()) {
            WindowManager windowManager = (WindowManager) this.f1529a.getSystemService("window");
            if (!(windowManager == null || !dVar.f1613o || dVar.f1605g == null)) {
                windowManager.removeView(dVar.f1605g);
                if (z) {
                    mo2362a(dVar.f1599a, dVar, (Menu) null);
                }
            }
            dVar.f1611m = false;
            dVar.f1612n = false;
            dVar.f1613o = false;
            dVar.f1606h = null;
            dVar.f1615q = true;
            if (this.f1567F == dVar) {
                this.f1567F = null;
                return;
            }
            return;
        }
        mo2367b(dVar.f1608j);
    }

    /* renamed from: a */
    public void mo548a(C0653h hVar) {
        m2636a(hVar, true);
    }

    /* renamed from: a */
    public void mo2309a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f1531c instanceof Activity) {
            C0550a a = mo2305a();
            if (!(a instanceof C0610t)) {
                this.f1535g = null;
                if (a != null) {
                    a.mo2245g();
                }
                if (toolbar != null) {
                    C0601q qVar = new C0601q(toolbar, ((Activity) this.f1531c).getTitle(), this.f1532d);
                    this.f1534f = qVar;
                    window = this.f1530b;
                    callback = qVar.mo2410h();
                } else {
                    this.f1534f = null;
                    window = this.f1530b;
                    callback = this.f1532d;
                }
                window.setCallback(callback);
                mo2322f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public void mo2310a(View view) {
        m2647x();
        ViewGroup viewGroup = (ViewGroup) this.f1585y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1531c.onContentChanged();
    }

    /* renamed from: a */
    public void mo2311a(View view, ViewGroup.LayoutParams layoutParams) {
        m2647x();
        ViewGroup viewGroup = (ViewGroup) this.f1585y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1531c.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2364a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2330a(int i, KeyEvent keyEvent) {
        C0550a a = mo2305a();
        if (a != null && a.mo2233a(i, keyEvent)) {
            return true;
        }
        C0595d dVar = this.f1567F;
        if (dVar == null || !m2638a(dVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1567F == null) {
                C0595d a2 = mo2360a(0, true);
                m2641b(a2, keyEvent);
                boolean a3 = m2638a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f1611m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        C0595d dVar2 = this.f1567F;
        if (dVar2 != null) {
            dVar2.f1612n = true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo549a(C0653h hVar, MenuItem menuItem) {
        C0595d a;
        Window.Callback r = mo2339r();
        if (r == null || mo2338q() || (a = mo2361a((Menu) hVar.mo2741p())) == null) {
            return false;
        }
        return r.onMenuItemSelected(a.f1599a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2331a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.f1531c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo2369c(keyCode, keyEvent) : mo2368b(keyCode, keyEvent);
    }

    /* renamed from: b */
    public C0625b mo2365b(C0625b.C0626a aVar) {
        if (aVar != null) {
            C0625b bVar = this.f1574m;
            if (bVar != null) {
                bVar.mo2437c();
            }
            C0592b bVar2 = new C0592b(aVar);
            C0550a a = mo2305a();
            if (a != null) {
                this.f1574m = a.mo2226a((C0625b.C0626a) bVar2);
                if (!(this.f1574m == null || this.f1533e == null)) {
                    this.f1533e.mo2278a(this.f1574m);
                }
            }
            if (this.f1574m == null) {
                this.f1574m = mo2327a((C0625b.C0626a) bVar2);
            }
            return this.f1574m;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: b */
    public View mo2366b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f1573L == null) {
            this.f1573L = new C0598o();
        }
        boolean z2 = false;
        if (f1561t) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m2639a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f1573L.mo2407a(view, str, context, attributeSet, z, f1561t, true, C0859bn.m4704a());
    }

    /* renamed from: b */
    public void mo2314b(int i) {
        m2647x();
        ViewGroup viewGroup = (ViewGroup) this.f1585y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1529a).inflate(i, viewGroup);
        this.f1531c.onContentChanged();
    }

    /* renamed from: b */
    public void mo2315b(Bundle bundle) {
        m2647x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2367b(C0653h hVar) {
        if (!this.f1565D) {
            this.f1565D = true;
            this.f1581u.mo3009k();
            Window.Callback r = mo2339r();
            if (r != null && !mo2338q()) {
                r.onPanelClosed(108, hVar);
            }
            this.f1565D = false;
        }
    }

    /* renamed from: b */
    public void mo2316b(View view, ViewGroup.LayoutParams layoutParams) {
        m2647x();
        ((ViewGroup) this.f1585y.findViewById(16908290)).addView(view, layoutParams);
        this.f1531c.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2332b(CharSequence charSequence) {
        C0737ae aeVar = this.f1581u;
        if (aeVar != null) {
            aeVar.setWindowTitle(charSequence);
        } else if (mo2335n() != null) {
            mo2335n().mo2231a(charSequence);
        } else {
            TextView textView = this.f1586z;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2368b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f1568G;
            this.f1568G = false;
            C0595d a = mo2360a(0, false);
            if (a != null && a.f1613o) {
                if (!z) {
                    mo2363a(a, true);
                }
                return true;
            } else if (mo2377v()) {
                return true;
            }
        } else if (i == 82) {
            m2645e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2333b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        C0550a a = mo2305a();
        if (a != null) {
            a.mo2243f(true);
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo2319c(int i) {
        int h = m2646h(i);
        if (this.f1540l && h == 108) {
            return false;
        }
        if (this.f1536h && h == 1) {
            this.f1536h = false;
        }
        switch (h) {
            case 1:
                m2634A();
                this.f1540l = true;
                return true;
            case 2:
                m2634A();
                this.f1563B = true;
                return true;
            case 5:
                m2634A();
                this.f1564C = true;
                return true;
            case 10:
                m2634A();
                this.f1538j = true;
                return true;
            case 108:
                m2634A();
                this.f1536h = true;
                return true;
            case 109:
                m2634A();
                this.f1537i = true;
                return true;
            default:
                return this.f1530b.requestFeature(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2369c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1568G = z;
        } else if (i == 82) {
            m2644d(0, keyEvent);
            return true;
        }
        if (Build.VERSION.SDK_INT < 11) {
            mo2330a(i, keyEvent);
        }
        return false;
    }

    /* renamed from: d */
    public void mo2320d() {
        C0550a a = mo2305a();
        if (a != null) {
            a.mo2241e(false);
        }
    }

    /* renamed from: e */
    public void mo2321e() {
        C0550a a = mo2305a();
        if (a != null) {
            a.mo2241e(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2370e(int i) {
        mo2363a(mo2360a(i, true), true);
    }

    /* renamed from: f */
    public void mo2322f() {
        C0550a a = mo2305a();
        if (a == null || !a.mo2242e()) {
            mo2351d(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2371f(int i) {
        C0595d a;
        C0595d a2 = mo2360a(i, true);
        if (a2.f1608j != null) {
            Bundle bundle = new Bundle();
            a2.f1608j.mo2714c(bundle);
            if (bundle.size() > 0) {
                a2.f1617s = bundle;
            }
            a2.f1608j.mo2729g();
            a2.f1608j.clear();
        }
        a2.f1616r = true;
        a2.f1615q = true;
        if ((i == 108 || i == 0) && this.f1581u != null && (a = mo2360a(0, false)) != null) {
            a.f1611m = false;
            m2641b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2372g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f1575n;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1575n.getLayoutParams();
            z = true;
            if (this.f1575n.isShown()) {
                if (this.f1571J == null) {
                    this.f1571J = new Rect();
                    this.f1572K = new Rect();
                }
                Rect rect = this.f1571J;
                Rect rect2 = this.f1572K;
                rect.set(0, i, 0, 0);
                C0866bq.m4742a(this.f1585y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f1562A;
                    if (view == null) {
                        this.f1562A = new View(this.f1529a);
                        this.f1562A.setBackgroundColor(this.f1529a.getResources().getColor(C0526a.C0529c.abc_input_method_navigation_guard));
                        this.f1585y.addView(this.f1562A, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1562A.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1562A == null) {
                    z = false;
                }
                if (!this.f1538j && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f1575n.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f1562A;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: g */
    public void mo2323g() {
        if (this.f1579r) {
            this.f1530b.getDecorView().removeCallbacks(this.f1569H);
        }
        super.mo2323g();
        if (this.f1534f != null) {
            this.f1534f.mo2245g();
        }
    }

    /* renamed from: i */
    public void mo2325i() {
        LayoutInflater from = LayoutInflater.from(this.f1529a);
        if (from.getFactory() == null) {
            C0371e.m1578b(from, this);
        } else if (!(from.getFactory2() instanceof C0583m)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2334m() {
        /*
            r3 = this;
            r3.m2647x()
            boolean r0 = r3.f1536h
            if (r0 == 0) goto L_0x003b
            android.support.v7.app.a r0 = r3.f1534f
            if (r0 == 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            android.view.Window$Callback r0 = r3.f1531c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0020
            android.support.v7.app.t r0 = new android.support.v7.app.t
            android.view.Window$Callback r1 = r3.f1531c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f1537i
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f1534f = r0
            goto L_0x0030
        L_0x0020:
            android.view.Window$Callback r0 = r3.f1531c
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x0030
            android.support.v7.app.t r0 = new android.support.v7.app.t
            android.view.Window$Callback r1 = r3.f1531c
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x0030:
            android.support.v7.app.a r0 = r3.f1534f
            if (r0 == 0) goto L_0x003b
            android.support.v7.app.a r0 = r3.f1534f
            boolean r1 = r3.f1570I
            r0.mo2239d(r1)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.C0583m.mo2334m():void");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo2350a(view, str, context, attributeSet);
        return a != null ? a : mo2366b(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1585y;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2375t() {
        /*
            r1 = this;
            boolean r0 = r1.f1584x
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f1585y
            if (r0 == 0) goto L_0x0010
            boolean r0 = android.support.p005v4.p017i.C0388q.m1676w(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.C0583m.mo2375t():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2376u() {
        C0409u uVar = this.f1578q;
        if (uVar != null) {
            uVar.mo1637b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo2377v() {
        C0625b bVar = this.f1574m;
        if (bVar != null) {
            bVar.mo2437c();
            return true;
        }
        C0550a a = mo2305a();
        return a != null && a.mo2244f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2378w() {
        C0737ae aeVar = this.f1581u;
        if (aeVar != null) {
            aeVar.mo3009k();
        }
        if (this.f1576o != null) {
            this.f1530b.getDecorView().removeCallbacks(this.f1577p);
            if (this.f1576o.isShowing()) {
                try {
                    this.f1576o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1576o = null;
        }
        mo2376u();
        C0595d a = mo2360a(0, false);
        if (a != null && a.f1608j != null) {
            a.f1608j.close();
        }
    }
}
