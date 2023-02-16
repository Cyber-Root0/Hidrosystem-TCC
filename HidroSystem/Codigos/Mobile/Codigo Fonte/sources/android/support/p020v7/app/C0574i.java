package android.support.p020v7.app;

import android.content.Context;
import android.support.p020v7.app.C0581l;
import android.support.p020v7.app.C0583m;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: android.support.v7.app.i */
class C0574i extends C0581l {

    /* renamed from: android.support.v7.app.i$a */
    class C0575a extends C0581l.C0582a {
        C0575a(Window.Callback callback) {
            super(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0583m.C0595d a = C0574i.this.mo2360a(0, true);
            if (!(a == null || a.f1608j == null)) {
                menu = a.f1608j;
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    C0574i(Context context, Window window, C0568f fVar) {
        super(context, window, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2328a(Window.Callback callback) {
        return new C0575a(callback);
    }
}
