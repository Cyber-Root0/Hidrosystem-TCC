package android.support.p005v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.media.C0425a;
import android.support.p005v4.media.C0427b;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1839a(C0425a.m1857a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a */
    private final String f1059a;

    /* renamed from: b */
    private final CharSequence f1060b;

    /* renamed from: c */
    private final CharSequence f1061c;

    /* renamed from: d */
    private final CharSequence f1062d;

    /* renamed from: e */
    private final Bitmap f1063e;

    /* renamed from: f */
    private final Uri f1064f;

    /* renamed from: g */
    private final Bundle f1065g;

    /* renamed from: h */
    private final Uri f1066h;

    /* renamed from: i */
    private Object f1067i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0422a {

        /* renamed from: a */
        private String f1068a;

        /* renamed from: b */
        private CharSequence f1069b;

        /* renamed from: c */
        private CharSequence f1070c;

        /* renamed from: d */
        private CharSequence f1071d;

        /* renamed from: e */
        private Bitmap f1072e;

        /* renamed from: f */
        private Uri f1073f;

        /* renamed from: g */
        private Bundle f1074g;

        /* renamed from: h */
        private Uri f1075h;

        /* renamed from: a */
        public C0422a mo1679a(Bitmap bitmap) {
            this.f1072e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0422a mo1680a(Uri uri) {
            this.f1073f = uri;
            return this;
        }

        /* renamed from: a */
        public C0422a mo1681a(Bundle bundle) {
            this.f1074g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0422a mo1682a(CharSequence charSequence) {
            this.f1069b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0422a mo1683a(String str) {
            this.f1068a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo1684a() {
            return new MediaDescriptionCompat(this.f1068a, this.f1069b, this.f1070c, this.f1071d, this.f1072e, this.f1073f, this.f1074g, this.f1075h);
        }

        /* renamed from: b */
        public C0422a mo1685b(Uri uri) {
            this.f1075h = uri;
            return this;
        }

        /* renamed from: b */
        public C0422a mo1686b(CharSequence charSequence) {
            this.f1070c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0422a mo1687c(CharSequence charSequence) {
            this.f1071d = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1059a = parcel.readString();
        this.f1060b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1061c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1062d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1063e = (Bitmap) parcel.readParcelable((ClassLoader) null);
        this.f1064f = (Uri) parcel.readParcelable((ClassLoader) null);
        this.f1065g = parcel.readBundle();
        this.f1066h = (Uri) parcel.readParcelable((ClassLoader) null);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1059a = str;
        this.f1060b = charSequence;
        this.f1061c = charSequence2;
        this.f1062d = charSequence3;
        this.f1063e = bitmap;
        this.f1064f = uri;
        this.f1065g = bundle;
        this.f1066h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p005v4.media.MediaDescriptionCompat m1839a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0081
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0081
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p005v4.media.C0425a.m1858a((java.lang.Object) r6)
            r1.mo1683a((java.lang.String) r2)
            java.lang.CharSequence r2 = android.support.p005v4.media.C0425a.m1860b(r6)
            r1.mo1682a((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.p005v4.media.C0425a.m1861c(r6)
            r1.mo1686b((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.p005v4.media.C0425a.m1862d(r6)
            r1.mo1687c(r2)
            android.graphics.Bitmap r2 = android.support.p005v4.media.C0425a.m1863e(r6)
            r1.mo1679a((android.graphics.Bitmap) r2)
            android.net.Uri r2 = android.support.p005v4.media.C0425a.m1864f(r6)
            r1.mo1680a((android.net.Uri) r2)
            android.os.Bundle r2 = android.support.p005v4.media.C0425a.m1865g(r6)
            if (r2 != 0) goto L_0x0040
            r3 = r0
            goto L_0x0048
        L_0x0040:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
        L_0x0048:
            if (r3 == 0) goto L_0x0064
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x005a
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0064:
            r0 = r2
        L_0x0065:
            r1.mo1681a((android.os.Bundle) r0)
            if (r3 == 0) goto L_0x006e
            r1.mo1685b((android.net.Uri) r3)
            goto L_0x007b
        L_0x006e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007b
            android.net.Uri r0 = android.support.p005v4.media.C0427b.m1875h(r6)
            r1.mo1685b((android.net.Uri) r0)
        L_0x007b:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo1684a()
            r0.f1067i = r6
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.media.MediaDescriptionCompat.m1839a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object mo1671a() {
        if (this.f1067i != null || Build.VERSION.SDK_INT < 21) {
            return this.f1067i;
        }
        Object a = C0425a.C0426a.m1866a();
        C0425a.C0426a.m1872a(a, this.f1059a);
        C0425a.C0426a.m1871a(a, this.f1060b);
        C0425a.C0426a.m1873b(a, this.f1061c);
        C0425a.C0426a.m1874c(a, this.f1062d);
        C0425a.C0426a.m1868a(a, this.f1063e);
        C0425a.C0426a.m1869a(a, this.f1064f);
        Bundle bundle = this.f1065g;
        if (Build.VERSION.SDK_INT < 23 && this.f1066h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1066h);
        }
        C0425a.C0426a.m1870a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0427b.C0428a.m1876b(a, this.f1066h);
        }
        this.f1067i = C0425a.C0426a.m1867a(a);
        return this.f1067i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f1060b + ", " + this.f1061c + ", " + this.f1062d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1059a);
            TextUtils.writeToParcel(this.f1060b, parcel, i);
            TextUtils.writeToParcel(this.f1061c, parcel, i);
            TextUtils.writeToParcel(this.f1062d, parcel, i);
            parcel.writeParcelable(this.f1063e, i);
            parcel.writeParcelable(this.f1064f, i);
            parcel.writeBundle(this.f1065g);
            parcel.writeParcelable(this.f1066h, i);
            return;
        }
        C0425a.m1859a(mo1671a(), parcel, i);
    }
}
