package android.support.p020v7.widget;

import android.support.p020v7.widget.C0787av;
import android.view.View;

/* renamed from: android.support.v7.widget.az */
class C0831az {
    /* renamed from: a */
    static int m4553a(C0787av.C0823t tVar, C0784au auVar, View view, View view2, C0787av.C0804h hVar, boolean z) {
        if (hVar.mo4045u() == 0 || tVar.mo4136e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(hVar.mo4015d(view) - hVar.mo4015d(view2)) + 1;
        }
        return Math.min(auVar.mo3746f(), auVar.mo3739b(view2) - auVar.mo3735a(view));
    }

    /* renamed from: a */
    static int m4554a(C0787av.C0823t tVar, C0784au auVar, View view, View view2, C0787av.C0804h hVar, boolean z, boolean z2) {
        if (hVar.mo4045u() == 0 || tVar.mo4136e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (tVar.mo4136e() - Math.max(hVar.mo4015d(view), hVar.mo4015d(view2))) - 1) : Math.max(0, Math.min(hVar.mo4015d(view), hVar.mo4015d(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(auVar.mo3739b(view2) - auVar.mo3735a(view))) / ((float) (Math.abs(hVar.mo4015d(view) - hVar.mo4015d(view2)) + 1)))) + ((float) (auVar.mo3740c() - auVar.mo3735a(view))));
    }

    /* renamed from: b */
    static int m4555b(C0787av.C0823t tVar, C0784au auVar, View view, View view2, C0787av.C0804h hVar, boolean z) {
        if (hVar.mo4045u() == 0 || tVar.mo4136e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return tVar.mo4136e();
        }
        return (int) ((((float) (auVar.mo3739b(view2) - auVar.mo3735a(view))) / ((float) (Math.abs(hVar.mo4015d(view) - hVar.mo4015d(view2)) + 1))) * ((float) tVar.mo4136e()));
    }
}
