package android.support.p005v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.media.session.C0454e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a */
    final int f1111a;

    /* renamed from: b */
    final long f1112b;

    /* renamed from: c */
    final long f1113c;

    /* renamed from: d */
    final float f1114d;

    /* renamed from: e */
    final long f1115e;

    /* renamed from: f */
    final int f1116f;

    /* renamed from: g */
    final CharSequence f1117g;

    /* renamed from: h */
    final long f1118h;

    /* renamed from: i */
    List<CustomAction> f1119i;

    /* renamed from: j */
    final long f1120j;

    /* renamed from: k */
    final Bundle f1121k;

    /* renamed from: l */
    private Object f1122l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a */
        private final String f1123a;

        /* renamed from: b */
        private final CharSequence f1124b;

        /* renamed from: c */
        private final int f1125c;

        /* renamed from: d */
        private final Bundle f1126d;

        /* renamed from: e */
        private Object f1127e;

        CustomAction(Parcel parcel) {
            this.f1123a = parcel.readString();
            this.f1124b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1125c = parcel.readInt();
            this.f1126d = parcel.readBundle();
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1123a = str;
            this.f1124b = charSequence;
            this.f1125c = i;
            this.f1126d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m1933a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0454e.C0455a.m2083a(obj), C0454e.C0455a.m2084b(obj), C0454e.C0455a.m2085c(obj), C0454e.C0455a.m2086d(obj));
            customAction.f1127e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f1124b + ", mIcon=" + this.f1125c + ", mExtras=" + this.f1126d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1123a);
            TextUtils.writeToParcel(this.f1124b, parcel, i);
            parcel.writeInt(this.f1125c);
            parcel.writeBundle(this.f1126d);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1111a = i;
        this.f1112b = j;
        this.f1113c = j2;
        this.f1114d = f;
        this.f1115e = j3;
        this.f1116f = i2;
        this.f1117g = charSequence;
        this.f1118h = j4;
        this.f1119i = new ArrayList(list);
        this.f1120j = j5;
        this.f1121k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1111a = parcel.readInt();
        this.f1112b = parcel.readLong();
        this.f1114d = parcel.readFloat();
        this.f1118h = parcel.readLong();
        this.f1113c = parcel.readLong();
        this.f1115e = parcel.readLong();
        this.f1117g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1119i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1120j = parcel.readLong();
        this.f1121k = parcel.readBundle();
        this.f1116f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1930a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0454e.m2081h(obj);
        if (h != null) {
            ArrayList arrayList2 = new ArrayList(h.size());
            for (Object a : h) {
                arrayList2.add(CustomAction.m1933a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0456f.m2087a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0454e.m2074a(obj), C0454e.m2075b(obj), C0454e.m2076c(obj), C0454e.m2077d(obj), C0454e.m2078e(obj), 0, C0454e.m2079f(obj), C0454e.m2080g(obj), arrayList, C0454e.m2082i(obj), bundle);
        playbackStateCompat.f1122l = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f1111a + ", position=" + this.f1112b + ", buffered position=" + this.f1113c + ", speed=" + this.f1114d + ", updated=" + this.f1118h + ", actions=" + this.f1115e + ", error code=" + this.f1116f + ", error message=" + this.f1117g + ", custom actions=" + this.f1119i + ", active item id=" + this.f1120j + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1111a);
        parcel.writeLong(this.f1112b);
        parcel.writeFloat(this.f1114d);
        parcel.writeLong(this.f1118h);
        parcel.writeLong(this.f1113c);
        parcel.writeLong(this.f1115e);
        TextUtils.writeToParcel(this.f1117g, parcel, i);
        parcel.writeTypedList(this.f1119i);
        parcel.writeLong(this.f1120j);
        parcel.writeBundle(this.f1121k);
        parcel.writeInt(this.f1116f);
    }
}
