package android.support.p020v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0625b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.a */
public abstract class C0550a {

    /* renamed from: android.support.v7.app.a$a */
    public static class C0551a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1495a;

        public C0551a(int i, int i2) {
            super(i, i2);
            this.f1495a = 0;
            this.f1495a = 8388627;
        }

        public C0551a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1495a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.ActionBarLayout);
            this.f1495a = obtainStyledAttributes.getInt(C0526a.C0536j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0551a(C0551a aVar) {
            super(aVar);
            this.f1495a = 0;
            this.f1495a = aVar.f1495a;
        }

        public C0551a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1495a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0552b {
        /* renamed from: a */
        void mo2246a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0553c {
        /* renamed from: a */
        public abstract Drawable mo2247a();

        /* renamed from: b */
        public abstract CharSequence mo2248b();

        /* renamed from: c */
        public abstract View mo2249c();

        /* renamed from: d */
        public abstract void mo2250d();

        /* renamed from: e */
        public abstract CharSequence mo2251e();
    }

    /* renamed from: a */
    public abstract int mo2225a();

    /* renamed from: a */
    public C0625b mo2226a(C0625b.C0626a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2227a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo2228a(int i) {
    }

    /* renamed from: a */
    public void mo2229a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo2230a(Drawable drawable) {
    }

    /* renamed from: a */
    public void mo2231a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public abstract void mo2232a(boolean z);

    /* renamed from: a */
    public boolean mo2233a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2234a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo2235b() {
        return null;
    }

    /* renamed from: b */
    public void mo2236b(boolean z) {
    }

    /* renamed from: c */
    public void mo2237c(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: c */
    public boolean mo2238c() {
        return false;
    }

    /* renamed from: d */
    public void mo2239d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo2240d() {
        return false;
    }

    /* renamed from: e */
    public void mo2241e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo2242e() {
        return false;
    }

    /* renamed from: f */
    public void mo2243f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo2244f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2245g() {
    }
}
