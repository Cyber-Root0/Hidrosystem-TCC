package android.support.p005v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.h */
public class C0501h {

    /* renamed from: a */
    static final C0503b f1352a = (Build.VERSION.SDK_INT >= 21 ? new C0504c() : new C0502a());

    /* renamed from: android.support.v4.widget.h$a */
    static class C0502a implements C0503b {
        C0502a() {
        }

        /* renamed from: a */
        public ColorStateList mo2157a(ImageView imageView) {
            if (imageView instanceof C0521o) {
                return ((C0521o) imageView).getSupportImageTintList();
            }
            return null;
        }

        /* renamed from: a */
        public void mo2158a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0521o) {
                ((C0521o) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2159a(ImageView imageView, PorterDuff.Mode mode) {
            if (imageView instanceof C0521o) {
                ((C0521o) imageView).setSupportImageTintMode(mode);
            }
        }

        /* renamed from: b */
        public PorterDuff.Mode mo2160b(ImageView imageView) {
            if (imageView instanceof C0521o) {
                return ((C0521o) imageView).getSupportImageTintMode();
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.h$b */
    interface C0503b {
        /* renamed from: a */
        ColorStateList mo2157a(ImageView imageView);

        /* renamed from: a */
        void mo2158a(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: a */
        void mo2159a(ImageView imageView, PorterDuff.Mode mode);

        /* renamed from: b */
        PorterDuff.Mode mo2160b(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.h$c */
    static class C0504c extends C0502a {
        C0504c() {
        }

        /* renamed from: a */
        public ColorStateList mo2157a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: a */
        public void mo2158a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: a */
        public void mo2159a(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: b */
        public PorterDuff.Mode mo2160b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    /* renamed from: a */
    public static ColorStateList m2336a(ImageView imageView) {
        return f1352a.mo2157a(imageView);
    }

    /* renamed from: a */
    public static void m2337a(ImageView imageView, ColorStateList colorStateList) {
        f1352a.mo2158a(imageView, colorStateList);
    }

    /* renamed from: a */
    public static void m2338a(ImageView imageView, PorterDuff.Mode mode) {
        f1352a.mo2159a(imageView, mode);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2339b(ImageView imageView) {
        return f1352a.mo2160b(imageView);
    }
}
