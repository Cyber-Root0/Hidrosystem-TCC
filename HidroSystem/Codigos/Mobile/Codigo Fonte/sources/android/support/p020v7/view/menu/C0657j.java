package android.support.p020v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p017i.C0367c;
import android.support.p020v7.p022b.p023a.C0616b;
import android.support.p020v7.view.menu.C0671p;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C0657j implements C0269b {

    /* renamed from: F */
    private static String f1949F;

    /* renamed from: G */
    private static String f1950G;

    /* renamed from: H */
    private static String f1951H;

    /* renamed from: I */
    private static String f1952I;

    /* renamed from: A */
    private View f1953A;

    /* renamed from: B */
    private C0367c f1954B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1955C;

    /* renamed from: D */
    private boolean f1956D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1957E;

    /* renamed from: a */
    C0653h f1958a;

    /* renamed from: b */
    private final int f1959b;

    /* renamed from: c */
    private final int f1960c;

    /* renamed from: d */
    private final int f1961d;

    /* renamed from: e */
    private final int f1962e;

    /* renamed from: f */
    private CharSequence f1963f;

    /* renamed from: g */
    private CharSequence f1964g;

    /* renamed from: h */
    private Intent f1965h;

    /* renamed from: i */
    private char f1966i;

    /* renamed from: j */
    private int f1967j = 4096;

    /* renamed from: k */
    private char f1968k;

    /* renamed from: l */
    private int f1969l = 4096;

    /* renamed from: m */
    private Drawable f1970m;

    /* renamed from: n */
    private int f1971n = 0;

    /* renamed from: o */
    private C0679u f1972o;

    /* renamed from: p */
    private Runnable f1973p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1974q;

    /* renamed from: r */
    private CharSequence f1975r;

    /* renamed from: s */
    private CharSequence f1976s;

    /* renamed from: t */
    private ColorStateList f1977t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1978u = null;

    /* renamed from: v */
    private boolean f1979v = false;

    /* renamed from: w */
    private boolean f1980w = false;

    /* renamed from: x */
    private boolean f1981x = false;

    /* renamed from: y */
    private int f1982y = 16;

    /* renamed from: z */
    private int f1983z = 0;

    C0657j(C0653h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1958a = hVar;
        this.f1959b = i2;
        this.f1960c = i;
        this.f1961d = i3;
        this.f1962e = i4;
        this.f1963f = charSequence;
        this.f1983z = i5;
    }

    /* renamed from: a */
    private Drawable m3096a(Drawable drawable) {
        if (drawable != null && this.f1981x && (this.f1979v || this.f1980w)) {
            drawable = C0240a.m1134f(drawable).mutate();
            if (this.f1979v) {
                C0240a.m1124a(drawable, this.f1977t);
            }
            if (this.f1980w) {
                C0240a.m1127a(drawable, this.f1978u);
            }
            this.f1981x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public C0269b setActionView(int i) {
        Context e = this.f1958a.mo2725e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    /* renamed from: a */
    public C0269b mo1183a(C0367c cVar) {
        C0367c cVar2 = this.f1954B;
        if (cVar2 != null) {
            cVar2.mo1541f();
        }
        this.f1953A = null;
        this.f1954B = cVar;
        this.f1958a.mo264a(true);
        C0367c cVar3 = this.f1954B;
        if (cVar3 != null) {
            cVar3.mo1534a((C0367c.C0369b) new C0367c.C0369b() {
                /* renamed from: a */
                public void mo1543a(boolean z) {
                    C0657j.this.f1958a.mo2691a(C0657j.this);
                }
            });
        }
        return this;
    }

    /* renamed from: a */
    public C0269b setActionView(View view) {
        int i;
        this.f1953A = view;
        this.f1954B = null;
        if (view != null && view.getId() == -1 && (i = this.f1959b) > 0) {
            view.setId(i);
        }
        this.f1958a.mo2709b(this);
        return this;
    }

    /* renamed from: a */
    public C0269b setContentDescription(CharSequence charSequence) {
        this.f1975r = charSequence;
        this.f1958a.mo264a(false);
        return this;
    }

    /* renamed from: a */
    public C0367c mo1185a() {
        return this.f1954B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo2760a(C0671p.C0672a aVar) {
        return (aVar == null || !aVar.mo188b()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void mo2761a(C0679u uVar) {
        this.f1972o = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2762a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1957E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo2763a(boolean z) {
        this.f1982y = (z ? 4 : 0) | (this.f1982y & -5);
    }

    /* renamed from: b */
    public C0269b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0269b setTooltipText(CharSequence charSequence) {
        this.f1976s = charSequence;
        this.f1958a.mo264a(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2765b(boolean z) {
        int i = this.f1982y;
        this.f1982y = (z ? 2 : 0) | (i & -3);
        if (i != this.f1982y) {
            this.f1958a.mo264a(false);
        }
    }

    /* renamed from: b */
    public boolean mo2766b() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1974q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0653h hVar = this.f1958a;
        if (hVar.mo2696a(hVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f1973p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1965h != null) {
            try {
                this.f1958a.mo2725e().startActivity(this.f1965h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0367c cVar = this.f1954B;
        return cVar != null && cVar.mo1539d();
    }

    /* renamed from: c */
    public int mo2767c() {
        return this.f1962e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2768c(boolean z) {
        int i = this.f1982y;
        this.f1982y = (z ? 0 : 8) | (i & -9);
        return i != this.f1982y;
    }

    public boolean collapseActionView() {
        if ((this.f1983z & 8) == 0) {
            return false;
        }
        if (this.f1953A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1955C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1958a.mo2724d(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo2769d() {
        return this.f1958a.mo2712b() ? this.f1968k : this.f1966i;
    }

    /* renamed from: d */
    public void mo2770d(boolean z) {
        this.f1982y = z ? this.f1982y | 32 : this.f1982y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo2771e() {
        String str;
        char d = mo2769d();
        if (d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f1949F);
        if (d == 8) {
            str = f1951H;
        } else if (d == 10) {
            str = f1950G;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            str = f1952I;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: e */
    public void mo2772e(boolean z) {
        this.f1956D = z;
        this.f1958a.mo264a(false);
    }

    public boolean expandActionView() {
        if (!mo2798n()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1955C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1958a.mo2717c(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2773f() {
        return this.f1958a.mo2716c() && mo2769d() != 0;
    }

    /* renamed from: g */
    public boolean mo2774g() {
        return (this.f1982y & 4) != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1953A;
        if (view != null) {
            return view;
        }
        C0367c cVar = this.f1954B;
        if (cVar == null) {
            return null;
        }
        this.f1953A = cVar.mo1532a((MenuItem) this);
        return this.f1953A;
    }

    public int getAlphabeticModifiers() {
        return this.f1969l;
    }

    public char getAlphabeticShortcut() {
        return this.f1968k;
    }

    public CharSequence getContentDescription() {
        return this.f1975r;
    }

    public int getGroupId() {
        return this.f1960c;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1970m;
        if (drawable != null) {
            return m3096a(drawable);
        }
        if (this.f1971n == 0) {
            return null;
        }
        Drawable b = C0616b.m2831b(this.f1958a.mo2725e(), this.f1971n);
        this.f1971n = 0;
        this.f1970m = b;
        return m3096a(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1977t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1978u;
    }

    public Intent getIntent() {
        return this.f1965h;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1959b;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1957E;
    }

    public int getNumericModifiers() {
        return this.f1967j;
    }

    public char getNumericShortcut() {
        return this.f1966i;
    }

    public int getOrder() {
        return this.f1961d;
    }

    public SubMenu getSubMenu() {
        return this.f1972o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1963f;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1964g;
        if (charSequence == null) {
            charSequence = this.f1963f;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1976s;
    }

    /* renamed from: h */
    public void mo2787h() {
        this.f1958a.mo2709b(this);
    }

    public boolean hasSubMenu() {
        return this.f1972o != null;
    }

    /* renamed from: i */
    public boolean mo2789i() {
        return this.f1958a.mo2744q();
    }

    public boolean isActionViewExpanded() {
        return this.f1956D;
    }

    public boolean isCheckable() {
        return (this.f1982y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1982y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1982y & 16) != 0;
    }

    public boolean isVisible() {
        C0367c cVar = this.f1954B;
        return (cVar == null || !cVar.mo1537b()) ? (this.f1982y & 8) == 0 : (this.f1982y & 8) == 0 && this.f1954B.mo1538c();
    }

    /* renamed from: j */
    public boolean mo2794j() {
        return (this.f1982y & 32) == 32;
    }

    /* renamed from: k */
    public boolean mo2795k() {
        return (this.f1983z & 1) == 1;
    }

    /* renamed from: l */
    public boolean mo2796l() {
        return (this.f1983z & 2) == 2;
    }

    /* renamed from: m */
    public boolean mo2797m() {
        return (this.f1983z & 4) == 4;
    }

    /* renamed from: n */
    public boolean mo2798n() {
        C0367c cVar;
        if ((this.f1983z & 8) == 0) {
            return false;
        }
        if (this.f1953A == null && (cVar = this.f1954B) != null) {
            this.f1953A = cVar.mo1532a((MenuItem) this);
        }
        return this.f1953A != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1968k == c) {
            return this;
        }
        this.f1968k = Character.toLowerCase(c);
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1968k == c && this.f1969l == i) {
            return this;
        }
        this.f1968k = Character.toLowerCase(c);
        this.f1969l = KeyEvent.normalizeMetaState(i);
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1982y;
        this.f1982y = z | (i & true) ? 1 : 0;
        if (i != this.f1982y) {
            this.f1958a.mo264a(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1982y & 4) != 0) {
            this.f1958a.mo2694a((MenuItem) this);
        } else {
            mo2765b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1982y = z ? this.f1982y | 16 : this.f1982y & -17;
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1970m = null;
        this.f1971n = i;
        this.f1981x = true;
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1971n = 0;
        this.f1970m = drawable;
        this.f1981x = true;
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1977t = colorStateList;
        this.f1979v = true;
        this.f1981x = true;
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1978u = mode;
        this.f1980w = true;
        this.f1981x = true;
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1965h = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1966i == c) {
            return this;
        }
        this.f1966i = c;
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1966i == c && this.f1967j == i) {
            return this;
        }
        this.f1966i = c;
        this.f1967j = KeyEvent.normalizeMetaState(i);
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1955C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1974q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1966i = c;
        this.f1968k = Character.toLowerCase(c2);
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1966i = c;
        this.f1967j = KeyEvent.normalizeMetaState(i);
        this.f1968k = Character.toLowerCase(c2);
        this.f1969l = KeyEvent.normalizeMetaState(i2);
        this.f1958a.mo264a(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f1983z = i;
                this.f1958a.mo2709b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1958a.mo2725e().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1963f = charSequence;
        this.f1958a.mo264a(false);
        C0679u uVar = this.f1972o;
        if (uVar != null) {
            uVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1964g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f1963f;
        }
        this.f1958a.mo264a(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo2768c(z)) {
            this.f1958a.mo2691a(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1963f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
