package android.support.p005v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a */
    public int f1106a;

    /* renamed from: b */
    public int f1107b;

    /* renamed from: c */
    public int f1108c;

    /* renamed from: d */
    public int f1109d;

    /* renamed from: e */
    public int f1110e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1106a = parcel.readInt();
        this.f1108c = parcel.readInt();
        this.f1109d = parcel.readInt();
        this.f1110e = parcel.readInt();
        this.f1107b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1106a);
        parcel.writeInt(this.f1108c);
        parcel.writeInt(this.f1109d);
        parcel.writeInt(this.f1110e);
        parcel.writeInt(this.f1107b);
    }
}
