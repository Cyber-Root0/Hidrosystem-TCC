package android.support.p020v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0625b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.n */
public class C0597n extends Dialog implements C0568f {

    /* renamed from: a */
    private C0569g f1619a;

    public C0597n(Context context, int i) {
        super(context, m2714a(context, i));
        mo2397a().mo2308a((Bundle) null);
        mo2397a().mo2326j();
    }

    /* renamed from: a */
    private static int m2714a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0526a.C0527a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0569g mo2397a() {
        if (this.f1619a == null) {
            this.f1619a = C0569g.m2557a((Dialog) this, (C0568f) this);
        }
        return this.f1619a;
    }

    /* renamed from: a */
    public C0625b mo2276a(C0625b.C0626a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2278a(C0625b bVar) {
    }

    /* renamed from: a */
    public boolean mo2398a(int i) {
        return mo2397a().mo2319c(i);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2397a().mo2316b(view, layoutParams);
    }

    /* renamed from: b */
    public void mo2284b(C0625b bVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo2397a().mo2306a(i);
    }

    public void invalidateOptionsMenu() {
        mo2397a().mo2322f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo2397a().mo2325i();
        super.onCreate(bundle);
        mo2397a().mo2308a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2397a().mo2320d();
    }

    public void setContentView(int i) {
        mo2397a().mo2314b(i);
    }

    public void setContentView(View view) {
        mo2397a().mo2310a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2397a().mo2311a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo2397a().mo2312a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo2397a().mo2312a(charSequence);
    }
}
