package android.support.p020v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p005v4.p011d.p012a.C0268a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.r */
class C0674r extends C0642c<C0268a> implements Menu {
    C0674r(Context context, C0268a aVar) {
        super(context, aVar);
    }

    public MenuItem add(int i) {
        return mo2633a(((C0268a) this.f1864b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2633a(((C0268a) this.f1864b).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2633a(((C0268a) this.f1864b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2633a(((C0268a) this.f1864b).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0268a) this.f1864b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo2633a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo2634a(((C0268a) this.f1864b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo2634a(((C0268a) this.f1864b).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo2634a(((C0268a) this.f1864b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo2634a(((C0268a) this.f1864b).addSubMenu(charSequence));
    }

    public void clear() {
        mo2635a();
        ((C0268a) this.f1864b).clear();
    }

    public void close() {
        ((C0268a) this.f1864b).close();
    }

    public MenuItem findItem(int i) {
        return mo2633a(((C0268a) this.f1864b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo2633a(((C0268a) this.f1864b).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0268a) this.f1864b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0268a) this.f1864b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0268a) this.f1864b).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0268a) this.f1864b).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo2636a(i);
        ((C0268a) this.f1864b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo2637b(i);
        ((C0268a) this.f1864b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0268a) this.f1864b).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0268a) this.f1864b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0268a) this.f1864b).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0268a) this.f1864b).setQwertyMode(z);
    }

    public int size() {
        return ((C0268a) this.f1864b).size();
    }
}
