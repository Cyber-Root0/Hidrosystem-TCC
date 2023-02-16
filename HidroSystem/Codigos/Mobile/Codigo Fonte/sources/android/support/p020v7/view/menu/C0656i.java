package android.support.p020v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p020v7.app.C0565d;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0669o;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: android.support.v7.view.menu.i */
class C0656i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, C0669o.C0670a {

    /* renamed from: a */
    C0650f f1945a;

    /* renamed from: b */
    private C0653h f1946b;

    /* renamed from: c */
    private C0565d f1947c;

    /* renamed from: d */
    private C0669o.C0670a f1948d;

    public C0656i(C0653h hVar) {
        this.f1946b = hVar;
    }

    /* renamed from: a */
    public void mo2753a() {
        C0565d dVar = this.f1947c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo2754a(IBinder iBinder) {
        C0653h hVar = this.f1946b;
        C0565d.C0566a aVar = new C0565d.C0566a(hVar.mo2725e());
        this.f1945a = new C0650f(aVar.mo2269a(), C0526a.C0533g.abc_list_menu_item_layout);
        this.f1945a.mo229a((C0669o.C0670a) this);
        this.f1946b.mo2692a((C0669o) this.f1945a);
        aVar.mo2273a(this.f1945a.mo2663d(), this);
        View o = hVar.mo2740o();
        if (o != null) {
            aVar.mo2272a(o);
        } else {
            aVar.mo2271a(hVar.mo2739n()).mo2274a(hVar.mo2738m());
        }
        aVar.mo2270a((DialogInterface.OnKeyListener) this);
        this.f1947c = aVar.mo2275b();
        this.f1947c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1947c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1947c.show();
    }

    /* renamed from: a */
    public void mo2384a(C0653h hVar, boolean z) {
        if (z || hVar == this.f1946b) {
            mo2753a();
        }
        C0669o.C0670a aVar = this.f1948d;
        if (aVar != null) {
            aVar.mo2384a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2385a(C0653h hVar) {
        C0669o.C0670a aVar = this.f1948d;
        if (aVar != null) {
            return aVar.mo2385a(hVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1946b.mo2697a((MenuItem) (C0657j) this.f1945a.mo2663d().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1945a.mo227a(this.f1946b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1947c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1947c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1946b.mo2711b(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1946b.performShortcut(i, keyEvent, 0);
    }
}
