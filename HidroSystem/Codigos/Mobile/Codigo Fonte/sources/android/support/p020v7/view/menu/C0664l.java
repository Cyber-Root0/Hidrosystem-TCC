package android.support.p020v7.view.menu;

import android.content.Context;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p017i.C0367c;
import android.support.p020v7.view.menu.C0659k;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
class C0664l extends C0659k {

    /* renamed from: android.support.v7.view.menu.l$a */
    class C0665a extends C0659k.C0660a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        C0367c.C0369b f1991c;

        public C0665a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo1532a(MenuItem menuItem) {
            return this.f1986a.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo1534a(C0367c.C0369b bVar) {
            this.f1991c = bVar;
            this.f1986a.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo1537b() {
            return this.f1986a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo1538c() {
            return this.f1986a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0367c.C0369b bVar = this.f1991c;
            if (bVar != null) {
                bVar.mo1543a(z);
            }
        }
    }

    C0664l(Context context, C0269b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0659k.C0660a mo2818a(ActionProvider actionProvider) {
        return new C0665a(this.f1861a, actionProvider);
    }
}
