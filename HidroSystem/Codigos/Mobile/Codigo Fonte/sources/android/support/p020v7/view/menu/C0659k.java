package android.support.p020v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p017i.C0367c;
import android.support.p020v7.view.C0627c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C0659k extends C0642c<C0269b> implements MenuItem {

    /* renamed from: c */
    private Method f1985c;

    /* renamed from: android.support.v7.view.menu.k$a */
    class C0660a extends C0367c {

        /* renamed from: a */
        final ActionProvider f1986a;

        public C0660a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1986a = actionProvider;
        }

        /* renamed from: a */
        public View mo1531a() {
            return this.f1986a.onCreateActionView();
        }

        /* renamed from: a */
        public void mo1535a(SubMenu subMenu) {
            this.f1986a.onPrepareSubMenu(C0659k.this.mo2634a(subMenu));
        }

        /* renamed from: d */
        public boolean mo1539d() {
            return this.f1986a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo1540e() {
            return this.f1986a.hasSubMenu();
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C0661b extends FrameLayout implements C0627c {

        /* renamed from: a */
        final CollapsibleActionView f1988a;

        C0661b(View view) {
            super(view.getContext());
            this.f1988a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo2495a() {
            this.f1988a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo2496b() {
            this.f1988a.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo2874c() {
            return (View) this.f1988a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    private class C0662c extends C0643d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        C0662c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1864b).onMenuItemActionCollapse(C0659k.this.mo2633a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1864b).onMenuItemActionExpand(C0659k.this.mo2633a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    private class C0663d extends C0643d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        C0663d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1864b).onMenuItemClick(C0659k.this.mo2633a(menuItem));
        }
    }

    C0659k(Context context, C0269b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0660a mo2818a(ActionProvider actionProvider) {
        return new C0660a(this.f1861a, actionProvider);
    }

    /* renamed from: a */
    public void mo2819a(boolean z) {
        try {
            if (this.f1985c == null) {
                this.f1985c = ((C0269b) this.f1864b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1985c.invoke(this.f1864b, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0269b) this.f1864b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0269b) this.f1864b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0367c a = ((C0269b) this.f1864b).mo1185a();
        if (a instanceof C0660a) {
            return ((C0660a) a).f1986a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0269b) this.f1864b).getActionView();
        return actionView instanceof C0661b ? ((C0661b) actionView).mo2874c() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0269b) this.f1864b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0269b) this.f1864b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0269b) this.f1864b).getContentDescription();
    }

    public int getGroupId() {
        return ((C0269b) this.f1864b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0269b) this.f1864b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0269b) this.f1864b).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C0269b) this.f1864b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0269b) this.f1864b).getIntent();
    }

    public int getItemId() {
        return ((C0269b) this.f1864b).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C0269b) this.f1864b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0269b) this.f1864b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0269b) this.f1864b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0269b) this.f1864b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo2634a(((C0269b) this.f1864b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0269b) this.f1864b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0269b) this.f1864b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0269b) this.f1864b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0269b) this.f1864b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0269b) this.f1864b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0269b) this.f1864b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0269b) this.f1864b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0269b) this.f1864b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0269b) this.f1864b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0269b) this.f1864b).mo1183a((C0367c) actionProvider != null ? mo2818a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0269b) this.f1864b).setActionView(i);
        View actionView = ((C0269b) this.f1864b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0269b) this.f1864b).setActionView((View) new C0661b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0661b(view);
        }
        ((C0269b) this.f1864b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0269b) this.f1864b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0269b) this.f1864b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0269b) this.f1864b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0269b) this.f1864b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0269b) this.f1864b).mo1184a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0269b) this.f1864b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0269b) this.f1864b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0269b) this.f1864b).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0269b) this.f1864b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((C0269b) this.f1864b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0269b) this.f1864b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0269b) this.f1864b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0269b) this.f1864b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C0269b) this.f1864b).setOnActionExpandListener(onActionExpandListener != null ? new C0662c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C0269b) this.f1864b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0663d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0269b) this.f1864b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0269b) this.f1864b).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0269b) this.f1864b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0269b) this.f1864b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0269b) this.f1864b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0269b) this.f1864b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0269b) this.f1864b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0269b) this.f1864b).mo1186b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0269b) this.f1864b).setVisible(z);
    }
}
