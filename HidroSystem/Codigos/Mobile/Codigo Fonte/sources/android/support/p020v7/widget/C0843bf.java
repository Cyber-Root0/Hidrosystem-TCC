package android.support.p020v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.bf */
public class C0843bf extends ContextWrapper {

    /* renamed from: a */
    private static final Object f2867a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0843bf>> f2868b;

    /* renamed from: c */
    private final Resources f2869c;

    /* renamed from: d */
    private final Resources.Theme f2870d;

    private C0843bf(Context context) {
        super(context);
        if (C0859bn.m4704a()) {
            this.f2869c = new C0859bn(this, context.getResources());
            this.f2870d = this.f2869c.newTheme();
            this.f2870d.setTo(context.getTheme());
            return;
        }
        this.f2869c = new C0845bh(this, context.getResources());
        this.f2870d = null;
    }

    /* renamed from: a */
    public static Context m4620a(Context context) {
        if (!m4621b(context)) {
            return context;
        }
        synchronized (f2867a) {
            if (f2868b == null) {
                f2868b = new ArrayList<>();
            } else {
                for (int size = f2868b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f2868b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2868b.remove(size);
                    }
                }
                for (int size2 = f2868b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f2868b.get(size2);
                    C0843bf bfVar = weakReference2 != null ? (C0843bf) weakReference2.get() : null;
                    if (bfVar != null && bfVar.getBaseContext() == context) {
                        return bfVar;
                    }
                }
            }
            C0843bf bfVar2 = new C0843bf(context);
            f2868b.add(new WeakReference(bfVar2));
            return bfVar2;
        }
    }

    /* renamed from: b */
    private static boolean m4621b(Context context) {
        if ((context instanceof C0843bf) || (context.getResources() instanceof C0845bh) || (context.getResources() instanceof C0859bn)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0859bn.m4704a();
    }

    public AssetManager getAssets() {
        return this.f2869c.getAssets();
    }

    public Resources getResources() {
        return this.f2869c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2870d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f2870d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
