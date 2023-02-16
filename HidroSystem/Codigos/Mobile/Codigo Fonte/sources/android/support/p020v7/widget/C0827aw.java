package android.support.p020v7.widget;

import android.os.Bundle;
import android.support.p005v4.p017i.C0358b;
import android.support.p005v4.p017i.p018a.C0328b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.aw */
public class C0827aw extends C0358b {

    /* renamed from: a */
    final C0787av f2803a;

    /* renamed from: c */
    final C0358b f2804c = new C0828a(this);

    /* renamed from: android.support.v7.widget.aw$a */
    public static class C0828a extends C0358b {

        /* renamed from: a */
        final C0827aw f2805a;

        public C0828a(C0827aw awVar) {
            this.f2805a = awVar;
        }

        /* renamed from: a */
        public void mo199a(View view, C0328b bVar) {
            super.mo199a(view, bVar);
            if (!this.f2805a.mo4181b() && this.f2805a.f2803a.getLayoutManager() != null) {
                this.f2805a.f2803a.getLayoutManager().mo3985a(view, bVar);
            }
        }

        /* renamed from: a */
        public boolean mo1506a(View view, int i, Bundle bundle) {
            if (super.mo1506a(view, i, bundle)) {
                return true;
            }
            if (this.f2805a.mo4181b() || this.f2805a.f2803a.getLayoutManager() == null) {
                return false;
            }
            return this.f2805a.f2803a.getLayoutManager().mo3997a(view, i, bundle);
        }
    }

    public C0827aw(C0787av avVar) {
        this.f2803a = avVar;
    }

    /* renamed from: a */
    public void mo199a(View view, C0328b bVar) {
        super.mo199a(view, bVar);
        bVar.mo1423b((CharSequence) C0787av.class.getName());
        if (!mo4181b() && this.f2803a.getLayoutManager() != null) {
            this.f2803a.getLayoutManager().mo3973a(bVar);
        }
    }

    /* renamed from: a */
    public void mo387a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo387a(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0787av.class.getName());
        if ((view instanceof C0787av) && !mo4181b()) {
            C0787av avVar = (C0787av) view;
            if (avVar.getLayoutManager() != null) {
                avVar.getLayoutManager().mo3163a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1506a(View view, int i, Bundle bundle) {
        if (super.mo1506a(view, i, bundle)) {
            return true;
        }
        if (mo4181b() || this.f2803a.getLayoutManager() == null) {
            return false;
        }
        return this.f2803a.getLayoutManager().mo3988a(i, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4181b() {
        return this.f2803a.mo3904w();
    }

    /* renamed from: c */
    public C0358b mo4182c() {
        return this.f2804c;
    }
}
