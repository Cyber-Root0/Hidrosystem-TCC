package android.support.p020v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.p005v4.p011d.p012a.C0268a;
import android.support.p005v4.p017i.C0367c;
import android.support.p005v4.p017i.C0375g;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0659k;
import android.support.p020v7.widget.C0750ah;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
public class C0632g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f1748a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f1749b = f1748a;

    /* renamed from: c */
    final Object[] f1750c;

    /* renamed from: d */
    final Object[] f1751d = this.f1750c;

    /* renamed from: e */
    Context f1752e;

    /* renamed from: f */
    private Object f1753f;

    /* renamed from: android.support.v7.view.g$a */
    private static class C0633a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f1754a = {MenuItem.class};

        /* renamed from: b */
        private Object f1755b;

        /* renamed from: c */
        private Method f1756c;

        public C0633a(Object obj, String str) {
            this.f1755b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1756c = cls.getMethod(str, f1754a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1756c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1756c.invoke(this.f1755b, new Object[]{menuItem})).booleanValue();
                }
                this.f1756c.invoke(this.f1755b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C0634b {

        /* renamed from: A */
        private String f1757A;

        /* renamed from: B */
        private String f1758B;

        /* renamed from: C */
        private CharSequence f1759C;

        /* renamed from: D */
        private CharSequence f1760D;

        /* renamed from: E */
        private ColorStateList f1761E = null;

        /* renamed from: F */
        private PorterDuff.Mode f1762F = null;

        /* renamed from: a */
        C0367c f1763a;

        /* renamed from: c */
        private Menu f1765c;

        /* renamed from: d */
        private int f1766d;

        /* renamed from: e */
        private int f1767e;

        /* renamed from: f */
        private int f1768f;

        /* renamed from: g */
        private int f1769g;

        /* renamed from: h */
        private boolean f1770h;

        /* renamed from: i */
        private boolean f1771i;

        /* renamed from: j */
        private boolean f1772j;

        /* renamed from: k */
        private int f1773k;

        /* renamed from: l */
        private int f1774l;

        /* renamed from: m */
        private CharSequence f1775m;

        /* renamed from: n */
        private CharSequence f1776n;

        /* renamed from: o */
        private int f1777o;

        /* renamed from: p */
        private char f1778p;

        /* renamed from: q */
        private int f1779q;

        /* renamed from: r */
        private char f1780r;

        /* renamed from: s */
        private int f1781s;

        /* renamed from: t */
        private int f1782t;

        /* renamed from: u */
        private boolean f1783u;

        /* renamed from: v */
        private boolean f1784v;

        /* renamed from: w */
        private boolean f1785w;

        /* renamed from: x */
        private int f1786x;

        /* renamed from: y */
        private int f1787y;

        /* renamed from: z */
        private String f1788z;

        public C0634b(Menu menu) {
            this.f1765c = menu;
            mo2526a();
        }

        /* renamed from: a */
        private char m2907a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m2908a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0632g.this.f1752e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        private void m2909a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f1783u).setVisible(this.f1784v).setEnabled(this.f1785w).setCheckable(this.f1782t >= 1).setTitleCondensed(this.f1776n).setIcon(this.f1777o);
            int i = this.f1786x;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f1758B != null) {
                if (!C0632g.this.f1752e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0633a(C0632g.this.mo2523a(), this.f1758B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0657j;
            if (z2) {
                C0657j jVar = (C0657j) menuItem;
            }
            if (this.f1782t >= 2) {
                if (z2) {
                    ((C0657j) menuItem).mo2763a(true);
                } else if (menuItem instanceof C0659k) {
                    ((C0659k) menuItem).mo2819a(true);
                }
            }
            String str = this.f1788z;
            if (str != null) {
                menuItem.setActionView((View) m2908a(str, C0632g.f1748a, C0632g.this.f1750c));
                z = true;
            }
            int i2 = this.f1787y;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0367c cVar = this.f1763a;
            if (cVar != null) {
                C0375g.m1583a(menuItem, cVar);
            }
            C0375g.m1587a(menuItem, this.f1759C);
            C0375g.m1589b(menuItem, this.f1760D);
            C0375g.m1588b(menuItem, this.f1778p, this.f1779q);
            C0375g.m1584a(menuItem, this.f1780r, this.f1781s);
            PorterDuff.Mode mode = this.f1762F;
            if (mode != null) {
                C0375g.m1586a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f1761E;
            if (colorStateList != null) {
                C0375g.m1585a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2526a() {
            this.f1766d = 0;
            this.f1767e = 0;
            this.f1768f = 0;
            this.f1769g = 0;
            this.f1770h = true;
            this.f1771i = true;
        }

        /* renamed from: a */
        public void mo2527a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0632g.this.f1752e.obtainStyledAttributes(attributeSet, C0526a.C0536j.MenuGroup);
            this.f1766d = obtainStyledAttributes.getResourceId(C0526a.C0536j.MenuGroup_android_id, 0);
            this.f1767e = obtainStyledAttributes.getInt(C0526a.C0536j.MenuGroup_android_menuCategory, 0);
            this.f1768f = obtainStyledAttributes.getInt(C0526a.C0536j.MenuGroup_android_orderInCategory, 0);
            this.f1769g = obtainStyledAttributes.getInt(C0526a.C0536j.MenuGroup_android_checkableBehavior, 0);
            this.f1770h = obtainStyledAttributes.getBoolean(C0526a.C0536j.MenuGroup_android_visible, true);
            this.f1771i = obtainStyledAttributes.getBoolean(C0526a.C0536j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo2528b() {
            this.f1772j = true;
            m2909a(this.f1765c.add(this.f1766d, this.f1773k, this.f1774l, this.f1775m));
        }

        /* renamed from: b */
        public void mo2529b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0632g.this.f1752e.obtainStyledAttributes(attributeSet, C0526a.C0536j.MenuItem);
            this.f1773k = obtainStyledAttributes.getResourceId(C0526a.C0536j.MenuItem_android_id, 0);
            this.f1774l = (obtainStyledAttributes.getInt(C0526a.C0536j.MenuItem_android_menuCategory, this.f1767e) & -65536) | (obtainStyledAttributes.getInt(C0526a.C0536j.MenuItem_android_orderInCategory, this.f1768f) & 65535);
            this.f1775m = obtainStyledAttributes.getText(C0526a.C0536j.MenuItem_android_title);
            this.f1776n = obtainStyledAttributes.getText(C0526a.C0536j.MenuItem_android_titleCondensed);
            this.f1777o = obtainStyledAttributes.getResourceId(C0526a.C0536j.MenuItem_android_icon, 0);
            this.f1778p = m2907a(obtainStyledAttributes.getString(C0526a.C0536j.MenuItem_android_alphabeticShortcut));
            this.f1779q = obtainStyledAttributes.getInt(C0526a.C0536j.MenuItem_alphabeticModifiers, 4096);
            this.f1780r = m2907a(obtainStyledAttributes.getString(C0526a.C0536j.MenuItem_android_numericShortcut));
            this.f1781s = obtainStyledAttributes.getInt(C0526a.C0536j.MenuItem_numericModifiers, 4096);
            this.f1782t = obtainStyledAttributes.hasValue(C0526a.C0536j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0526a.C0536j.MenuItem_android_checkable, false) : this.f1769g;
            this.f1783u = obtainStyledAttributes.getBoolean(C0526a.C0536j.MenuItem_android_checked, false);
            this.f1784v = obtainStyledAttributes.getBoolean(C0526a.C0536j.MenuItem_android_visible, this.f1770h);
            this.f1785w = obtainStyledAttributes.getBoolean(C0526a.C0536j.MenuItem_android_enabled, this.f1771i);
            this.f1786x = obtainStyledAttributes.getInt(C0526a.C0536j.MenuItem_showAsAction, -1);
            this.f1758B = obtainStyledAttributes.getString(C0526a.C0536j.MenuItem_android_onClick);
            this.f1787y = obtainStyledAttributes.getResourceId(C0526a.C0536j.MenuItem_actionLayout, 0);
            this.f1788z = obtainStyledAttributes.getString(C0526a.C0536j.MenuItem_actionViewClass);
            this.f1757A = obtainStyledAttributes.getString(C0526a.C0536j.MenuItem_actionProviderClass);
            boolean z = this.f1757A != null;
            if (z && this.f1787y == 0 && this.f1788z == null) {
                this.f1763a = (C0367c) m2908a(this.f1757A, C0632g.f1749b, C0632g.this.f1751d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1763a = null;
            }
            this.f1759C = obtainStyledAttributes.getText(C0526a.C0536j.MenuItem_contentDescription);
            this.f1760D = obtainStyledAttributes.getText(C0526a.C0536j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0526a.C0536j.MenuItem_iconTintMode)) {
                this.f1762F = C0750ah.m3838a(obtainStyledAttributes.getInt(C0526a.C0536j.MenuItem_iconTintMode, -1), this.f1762F);
            } else {
                this.f1762F = null;
            }
            if (obtainStyledAttributes.hasValue(C0526a.C0536j.MenuItem_iconTint)) {
                this.f1761E = obtainStyledAttributes.getColorStateList(C0526a.C0536j.MenuItem_iconTint);
            } else {
                this.f1761E = null;
            }
            obtainStyledAttributes.recycle();
            this.f1772j = false;
        }

        /* renamed from: c */
        public SubMenu mo2530c() {
            this.f1772j = true;
            SubMenu addSubMenu = this.f1765c.addSubMenu(this.f1766d, this.f1773k, this.f1774l, this.f1775m);
            m2909a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo2531d() {
            return this.f1772j;
        }
    }

    public C0632g(Context context) {
        super(context);
        this.f1752e = context;
        this.f1750c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m2904a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2904a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: a */
    private void m2905a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0634b bVar = new C0634b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    str = name2;
                                    z2 = true;
                                    break;
                                } else {
                                    m2905a(xmlPullParser, attributeSet, bVar.mo2530c());
                                    break;
                                }
                            } else {
                                bVar.mo2529b(attributeSet);
                                break;
                            }
                        } else {
                            bVar.mo2527a(attributeSet);
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.mo2531d()) {
                                if (bVar.f1763a != null && bVar.f1763a.mo1540e()) {
                                    bVar.mo2530c();
                                    break;
                                } else {
                                    bVar.mo2528b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo2526a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo2523a() {
        if (this.f1753f == null) {
            this.f1753f = m2904a(this.f1752e);
        }
        return this.f1753f;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0268a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1752e.getResources().getLayout(i);
            m2905a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
