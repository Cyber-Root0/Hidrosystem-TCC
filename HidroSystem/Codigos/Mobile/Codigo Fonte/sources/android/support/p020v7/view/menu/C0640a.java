package android.support.p020v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p017i.C0367c;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C0640a implements C0269b {

    /* renamed from: a */
    private final int f1829a;

    /* renamed from: b */
    private final int f1830b;

    /* renamed from: c */
    private final int f1831c;

    /* renamed from: d */
    private final int f1832d;

    /* renamed from: e */
    private CharSequence f1833e;

    /* renamed from: f */
    private CharSequence f1834f;

    /* renamed from: g */
    private Intent f1835g;

    /* renamed from: h */
    private char f1836h;

    /* renamed from: i */
    private int f1837i = 4096;

    /* renamed from: j */
    private char f1838j;

    /* renamed from: k */
    private int f1839k = 4096;

    /* renamed from: l */
    private Drawable f1840l;

    /* renamed from: m */
    private int f1841m = 0;

    /* renamed from: n */
    private Context f1842n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f1843o;

    /* renamed from: p */
    private CharSequence f1844p;

    /* renamed from: q */
    private CharSequence f1845q;

    /* renamed from: r */
    private ColorStateList f1846r = null;

    /* renamed from: s */
    private PorterDuff.Mode f1847s = null;

    /* renamed from: t */
    private boolean f1848t = false;

    /* renamed from: u */
    private boolean f1849u = false;

    /* renamed from: v */
    private int f1850v = 16;

    public C0640a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1842n = context;
        this.f1829a = i2;
        this.f1830b = i;
        this.f1831c = i3;
        this.f1832d = i4;
        this.f1833e = charSequence;
    }

    /* renamed from: b */
    private void m2945b() {
        if (this.f1840l == null) {
            return;
        }
        if (this.f1848t || this.f1849u) {
            this.f1840l = C0240a.m1134f(this.f1840l);
            this.f1840l = this.f1840l.mutate();
            if (this.f1848t) {
                C0240a.m1124a(this.f1840l, this.f1846r);
            }
            if (this.f1849u) {
                C0240a.m1127a(this.f1840l, this.f1847s);
            }
        }
    }

    /* renamed from: a */
    public C0269b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0269b mo1183a(C0367c cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0269b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0269b setContentDescription(CharSequence charSequence) {
        this.f1844p = charSequence;
        return this;
    }

    /* renamed from: a */
    public C0367c mo1185a() {
        return null;
    }

    /* renamed from: b */
    public C0269b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0269b setTooltipText(CharSequence charSequence) {
        this.f1845q = charSequence;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1839k;
    }

    public char getAlphabeticShortcut() {
        return this.f1838j;
    }

    public CharSequence getContentDescription() {
        return this.f1844p;
    }

    public int getGroupId() {
        return this.f1830b;
    }

    public Drawable getIcon() {
        return this.f1840l;
    }

    public ColorStateList getIconTintList() {
        return this.f1846r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1847s;
    }

    public Intent getIntent() {
        return this.f1835g;
    }

    public int getItemId() {
        return this.f1829a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1837i;
    }

    public char getNumericShortcut() {
        return this.f1836h;
    }

    public int getOrder() {
        return this.f1832d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1833e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1834f;
        return charSequence != null ? charSequence : this.f1833e;
    }

    public CharSequence getTooltipText() {
        return this.f1845q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1850v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1850v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1850v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1850v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1838j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1838j = Character.toLowerCase(c);
        this.f1839k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1850v = z | (this.f1850v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1850v = (z ? 2 : 0) | (this.f1850v & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1850v = (z ? 16 : 0) | (this.f1850v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1841m = i;
        this.f1840l = C0227a.m1070a(this.f1842n, i);
        m2945b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1840l = drawable;
        this.f1841m = 0;
        m2945b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1846r = colorStateList;
        this.f1848t = true;
        m2945b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1847s = mode;
        this.f1849u = true;
        m2945b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1835g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1836h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1836h = c;
        this.f1837i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1843o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1836h = c;
        this.f1838j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1836h = c;
        this.f1837i = KeyEvent.normalizeMetaState(i);
        this.f1838j = Character.toLowerCase(c2);
        this.f1839k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f1833e = this.f1842n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1833e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1834f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1850v & 8;
        if (z) {
            i = 0;
        }
        this.f1850v = i2 | i;
        return this;
    }
}
