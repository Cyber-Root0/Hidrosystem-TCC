package android.support.p020v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p020v7.app.C0554b;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.view.C0632g;
import android.support.p020v7.view.C0637i;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.widget.C0846bi;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;

/* renamed from: android.support.v7.app.h */
abstract class C0570h extends C0569g {

    /* renamed from: m */
    private static boolean f1526m = true;

    /* renamed from: n */
    private static final boolean f1527n = (Build.VERSION.SDK_INT < 21);

    /* renamed from: o */
    private static final int[] f1528o = {16842836};

    /* renamed from: a */
    final Context f1529a;

    /* renamed from: b */
    final Window f1530b;

    /* renamed from: c */
    final Window.Callback f1531c = this.f1530b.getCallback();

    /* renamed from: d */
    final Window.Callback f1532d;

    /* renamed from: e */
    final C0568f f1533e;

    /* renamed from: f */
    C0550a f1534f;

    /* renamed from: g */
    MenuInflater f1535g;

    /* renamed from: h */
    boolean f1536h;

    /* renamed from: i */
    boolean f1537i;

    /* renamed from: j */
    boolean f1538j;

    /* renamed from: k */
    boolean f1539k;

    /* renamed from: l */
    boolean f1540l;

    /* renamed from: p */
    private CharSequence f1541p;

    /* renamed from: q */
    private boolean f1542q;

    /* renamed from: r */
    private boolean f1543r;

    /* renamed from: android.support.v7.app.h$a */
    private class C0572a implements C0554b.C0556a {
        C0572a() {
        }

        /* renamed from: a */
        public Drawable mo2259a() {
            C0846bi a = C0846bi.m4624a(mo2262b(), (AttributeSet) null, new int[]{C0526a.C0527a.homeAsUpIndicator});
            Drawable a2 = a.mo4291a(0);
            a.mo4292a();
            return a2;
        }

        /* renamed from: a */
        public void mo2260a(int i) {
            C0550a a = C0570h.this.mo2305a();
            if (a != null) {
                a.mo2228a(i);
            }
        }

        /* renamed from: a */
        public void mo2261a(Drawable drawable, int i) {
            C0550a a = C0570h.this.mo2305a();
            if (a != null) {
                a.mo2230a(drawable);
                a.mo2228a(i);
            }
        }

        /* renamed from: b */
        public Context mo2262b() {
            return C0570h.this.mo2336o();
        }

        /* renamed from: c */
        public boolean mo2263c() {
            C0550a a = C0570h.this.mo2305a();
            return (a == null || (a.mo2225a() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.h$b */
    class C0573b extends C0637i {
        C0573b(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0570h.this.mo2331a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0570h.this.mo2330a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0653h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0570h.this.mo2333b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0570h.this.mo2329a(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0653h hVar = menu instanceof C0653h ? (C0653h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.mo2715c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.mo2715c(false);
            }
            return onPreparePanel;
        }
    }

    static {
        if (f1527n && !f1526m) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* renamed from: a */
                private boolean m2606a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    return message.contains("drawable") || message.contains("Drawable");
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (m2606a(th)) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C0570h(Context context, Window window, C0568f fVar) {
        this.f1529a = context;
        this.f1530b = window;
        this.f1533e = fVar;
        Window.Callback callback = this.f1531c;
        if (!(callback instanceof C0573b)) {
            this.f1532d = mo2328a(callback);
            this.f1530b.setCallback(this.f1532d);
            C0846bi a = C0846bi.m4624a(context, (AttributeSet) null, f1528o);
            Drawable b = a.mo4295b(0);
            if (b != null) {
                this.f1530b.setBackgroundDrawable(b);
            }
            a.mo4292a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    public C0550a mo2305a() {
        mo2334m();
        return this.f1534f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C0625b mo2327a(C0625b.C0626a aVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2328a(Window.Callback callback) {
        return new C0573b(callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo2329a(int i, Menu menu);

    /* renamed from: a */
    public final void mo2312a(CharSequence charSequence) {
        this.f1541p = charSequence;
        mo2332b(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo2330a(int i, KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo2331a(KeyEvent keyEvent);

    /* renamed from: b */
    public MenuInflater mo2313b() {
        if (this.f1535g == null) {
            mo2334m();
            C0550a aVar = this.f1534f;
            this.f1535g = new C0632g(aVar != null ? aVar.mo2235b() : this.f1529a);
        }
        return this.f1535g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo2332b(CharSequence charSequence);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo2333b(int i, Menu menu);

    /* renamed from: c */
    public void mo2317c() {
        this.f1542q = true;
    }

    /* renamed from: c */
    public void mo2318c(Bundle bundle) {
    }

    /* renamed from: d */
    public void mo2320d() {
        this.f1542q = false;
    }

    /* renamed from: g */
    public void mo2323g() {
        this.f1543r = true;
    }

    /* renamed from: h */
    public final C0554b.C0556a mo2324h() {
        return new C0572a();
    }

    /* renamed from: j */
    public boolean mo2326j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract void mo2334m();

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C0550a mo2335n() {
        return this.f1534f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Context mo2336o() {
        C0550a a = mo2305a();
        Context b = a != null ? a.mo2235b() : null;
        return b == null ? this.f1529a : b;
    }

    /* renamed from: p */
    public boolean mo2337p() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo2338q() {
        return this.f1543r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Window.Callback mo2339r() {
        return this.f1530b.getCallback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final CharSequence mo2340s() {
        Window.Callback callback = this.f1531c;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f1541p;
    }
}
