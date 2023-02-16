package android.support.p005v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;

/* renamed from: android.support.v4.widget.m */
public final class C0513m {

    /* renamed from: a */
    static final C0519f f1361a = (Build.VERSION.SDK_INT >= 26 ? new C0518e() : Build.VERSION.SDK_INT >= 23 ? new C0517d() : Build.VERSION.SDK_INT >= 18 ? new C0516c() : Build.VERSION.SDK_INT >= 17 ? new C0515b() : Build.VERSION.SDK_INT >= 16 ? new C0514a() : new C0519f());

    /* renamed from: android.support.v4.widget.m$a */
    static class C0514a extends C0519f {
        C0514a() {
        }
    }

    /* renamed from: android.support.v4.widget.m$b */
    static class C0515b extends C0514a {
        C0515b() {
        }

        /* renamed from: a */
        public void mo2164a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }
    }

    /* renamed from: android.support.v4.widget.m$c */
    static class C0516c extends C0515b {
        C0516c() {
        }

        /* renamed from: a */
        public void mo2164a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: android.support.v4.widget.m$d */
    static class C0517d extends C0516c {
        C0517d() {
        }

        /* renamed from: a */
        public void mo2165a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* renamed from: android.support.v4.widget.m$e */
    static class C0518e extends C0517d {
        C0518e() {
        }
    }

    /* renamed from: android.support.v4.widget.m$f */
    static class C0519f {
        C0519f() {
        }

        /* renamed from: a */
        public void mo2165a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        /* renamed from: a */
        public void mo2164a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: a */
    public static void m2369a(TextView textView, int i) {
        f1361a.mo2165a(textView, i);
    }

    /* renamed from: a */
    public static void m2370a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f1361a.mo2164a(textView, drawable, drawable2, drawable3, drawable4);
    }
}
