package android.support.design.internal;

import android.content.Context;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0679u;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.b */
public class C0057b extends C0653h {
    public C0057b(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0657j jVar = (C0657j) mo2687a(i, i2, i3, charSequence);
        C0070d dVar = new C0070d(mo2725e(), this, jVar);
        jVar.mo2761a((C0679u) dVar);
        return dVar;
    }
}
