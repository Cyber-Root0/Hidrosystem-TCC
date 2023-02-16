package android.support.p020v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.p020v7.app.C0554b;
import android.support.p020v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.app.g */
public abstract class C0569g {

    /* renamed from: a */
    private static int f1524a = -1;

    /* renamed from: b */
    private static boolean f1525b;

    C0569g() {
    }

    /* renamed from: a */
    public static C0569g m2556a(Activity activity, C0568f fVar) {
        return m2558a(activity, activity.getWindow(), fVar);
    }

    /* renamed from: a */
    public static C0569g m2557a(Dialog dialog, C0568f fVar) {
        return m2558a(dialog.getContext(), dialog.getWindow(), fVar);
    }

    /* renamed from: a */
    private static C0569g m2558a(Context context, Window window, C0568f fVar) {
        return Build.VERSION.SDK_INT >= 24 ? new C0574i(context, window, fVar) : Build.VERSION.SDK_INT >= 23 ? new C0581l(context, window, fVar) : Build.VERSION.SDK_INT >= 14 ? new C0577k(context, window, fVar) : Build.VERSION.SDK_INT >= 11 ? new C0576j(context, window, fVar) : new C0583m(context, window, fVar);
    }

    /* renamed from: k */
    public static int m2559k() {
        return f1524a;
    }

    /* renamed from: l */
    public static boolean m2560l() {
        return f1525b;
    }

    /* renamed from: a */
    public abstract C0550a mo2305a();

    /* renamed from: a */
    public abstract <T extends View> T mo2306a(int i);

    /* renamed from: a */
    public abstract void mo2307a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo2308a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo2309a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo2310a(View view);

    /* renamed from: a */
    public abstract void mo2311a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo2312a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo2313b();

    /* renamed from: b */
    public abstract void mo2314b(int i);

    /* renamed from: b */
    public abstract void mo2315b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo2316b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo2317c();

    /* renamed from: c */
    public abstract void mo2318c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo2319c(int i);

    /* renamed from: d */
    public abstract void mo2320d();

    /* renamed from: e */
    public abstract void mo2321e();

    /* renamed from: f */
    public abstract void mo2322f();

    /* renamed from: g */
    public abstract void mo2323g();

    /* renamed from: h */
    public abstract C0554b.C0556a mo2324h();

    /* renamed from: i */
    public abstract void mo2325i();

    /* renamed from: j */
    public abstract boolean mo2326j();
}
