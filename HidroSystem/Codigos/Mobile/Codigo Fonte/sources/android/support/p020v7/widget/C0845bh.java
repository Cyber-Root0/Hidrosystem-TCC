package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bh */
class C0845bh extends C0829ax {

    /* renamed from: a */
    private final WeakReference<Context> f2875a;

    public C0845bh(Context context, Resources resources) {
        super(resources);
        this.f2875a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f2875a.get();
        if (!(drawable == null || context == null)) {
            C0893m.m4863a();
            C0893m.m4869a(context, i, drawable);
        }
        return drawable;
    }
}
