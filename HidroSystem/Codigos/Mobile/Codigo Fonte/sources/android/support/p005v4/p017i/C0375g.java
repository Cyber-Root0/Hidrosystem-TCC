package android.support.p005v4.p017i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.p005v4.p011d.p012a.C0269b;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: android.support.v4.i.g */
public final class C0375g {

    /* renamed from: a */
    static final C0378c f1011a = (Build.VERSION.SDK_INT >= 26 ? new C0376a() : new C0377b());

    /* renamed from: android.support.v4.i.g$a */
    static class C0376a extends C0377b {
        C0376a() {
        }

        /* renamed from: a */
        public void mo1545a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: a */
        public void mo1546a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo1547a(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        /* renamed from: a */
        public void mo1548a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* renamed from: b */
        public void mo1549b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: b */
        public void mo1550b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: android.support.v4.i.g$b */
    static class C0377b implements C0378c {
        C0377b() {
        }

        /* renamed from: a */
        public void mo1545a(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: a */
        public void mo1546a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        /* renamed from: a */
        public void mo1547a(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        /* renamed from: a */
        public void mo1548a(MenuItem menuItem, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo1549b(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: b */
        public void mo1550b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    /* renamed from: android.support.v4.i.g$c */
    interface C0378c {
        /* renamed from: a */
        void mo1545a(MenuItem menuItem, char c, int i);

        /* renamed from: a */
        void mo1546a(MenuItem menuItem, ColorStateList colorStateList);

        /* renamed from: a */
        void mo1547a(MenuItem menuItem, PorterDuff.Mode mode);

        /* renamed from: a */
        void mo1548a(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: b */
        void mo1549b(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo1550b(MenuItem menuItem, CharSequence charSequence);
    }

    /* renamed from: a */
    public static MenuItem m1583a(MenuItem menuItem, C0367c cVar) {
        if (menuItem instanceof C0269b) {
            return ((C0269b) menuItem).mo1183a(cVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m1584a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0269b) {
            ((C0269b) menuItem).setNumericShortcut(c, i);
        } else {
            f1011a.mo1549b(menuItem, c, i);
        }
    }

    /* renamed from: a */
    public static void m1585a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0269b) {
            ((C0269b) menuItem).setIconTintList(colorStateList);
        } else {
            f1011a.mo1546a(menuItem, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1586a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C0269b) {
            ((C0269b) menuItem).setIconTintMode(mode);
        } else {
            f1011a.mo1547a(menuItem, mode);
        }
    }

    /* renamed from: a */
    public static void m1587a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0269b) {
            ((C0269b) menuItem).mo1184a(charSequence);
        } else {
            f1011a.mo1548a(menuItem, charSequence);
        }
    }

    /* renamed from: b */
    public static void m1588b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0269b) {
            ((C0269b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1011a.mo1545a(menuItem, c, i);
        }
    }

    /* renamed from: b */
    public static void m1589b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0269b) {
            ((C0269b) menuItem).mo1186b(charSequence);
        } else {
            f1011a.mo1550b(menuItem, charSequence);
        }
    }
}
