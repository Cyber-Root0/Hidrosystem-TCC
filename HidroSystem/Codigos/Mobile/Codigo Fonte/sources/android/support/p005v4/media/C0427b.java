package android.support.p005v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.p005v4.media.C0425a;

/* renamed from: android.support.v4.media.b */
class C0427b extends C0425a {

    /* renamed from: android.support.v4.media.b$a */
    static class C0428a extends C0425a.C0426a {
        /* renamed from: b */
        public static void m1876b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m1875h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
