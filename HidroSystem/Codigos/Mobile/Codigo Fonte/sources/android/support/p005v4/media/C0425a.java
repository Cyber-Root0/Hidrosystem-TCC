package android.support.p005v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.a */
class C0425a {

    /* renamed from: android.support.v4.media.a$a */
    static class C0426a {
        /* renamed from: a */
        public static Object m1866a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static Object m1867a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: a */
        public static void m1868a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m1869a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m1870a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m1871a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m1872a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m1873b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m1874c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static Object m1857a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static String m1858a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: a */
    public static void m1859a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static CharSequence m1860b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m1861c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m1862d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m1863e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m1864f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m1865g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }
}
