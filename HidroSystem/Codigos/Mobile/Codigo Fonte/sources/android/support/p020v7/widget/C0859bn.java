package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p020v7.app.C0569g;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bn */
public class C0859bn extends Resources {

    /* renamed from: a */
    private final WeakReference<Context> f2920a;

    public C0859bn(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2920a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m4704a() {
        return C0569g.m2560l() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo4323a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f2920a.get();
        return context != null ? C0893m.m4863a().mo4454a(context, this, i) : super.getDrawable(i);
    }
}
