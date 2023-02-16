package android.support.p005v4.p011d.p012a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.p005v4.p017i.C0367c;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.d.a.b */
public interface C0269b extends MenuItem {
    /* renamed from: a */
    C0269b mo1183a(C0367c cVar);

    /* renamed from: a */
    C0269b mo1184a(CharSequence charSequence);

    /* renamed from: a */
    C0367c mo1185a();

    /* renamed from: b */
    C0269b mo1186b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
