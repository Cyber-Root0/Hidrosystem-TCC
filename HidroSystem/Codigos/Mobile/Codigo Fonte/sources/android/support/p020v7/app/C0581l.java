package android.support.p020v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.p020v7.app.C0577k;
import android.view.ActionMode;
import android.view.Window;

/* renamed from: android.support.v7.app.l */
class C0581l extends C0577k {

    /* renamed from: t */
    private final UiModeManager f1559t;

    /* renamed from: android.support.v7.app.l$a */
    class C0582a extends C0577k.C0578a {
        C0582a(Window.Callback callback) {
            super(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0581l.this.mo2337p() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo2352a(callback);
        }
    }

    C0581l(Context context, Window window, C0568f fVar) {
        super(context, window, fVar);
        this.f1559t = (UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2328a(Window.Callback callback) {
        return new C0582a(callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2351d(int i) {
        if (i == 0 && this.f1559t.getNightMode() == 0) {
            return -1;
        }
        return super.mo2351d(i);
    }
}
