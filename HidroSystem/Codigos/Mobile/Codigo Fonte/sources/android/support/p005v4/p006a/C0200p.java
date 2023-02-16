package android.support.p005v4.p006a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.a.p */
final class C0200p implements Parcelable {
    public static final Parcelable.Creator<C0200p> CREATOR = new Parcelable.Creator<C0200p>() {
        /* renamed from: a */
        public C0200p createFromParcel(Parcel parcel) {
            return new C0200p(parcel);
        }

        /* renamed from: a */
        public C0200p[] newArray(int i) {
            return new C0200p[i];
        }
    };

    /* renamed from: a */
    C0202q[] f675a;

    /* renamed from: b */
    int[] f676b;

    /* renamed from: c */
    C0164d[] f677c;

    /* renamed from: d */
    int f678d = -1;

    /* renamed from: e */
    int f679e;

    public C0200p() {
    }

    public C0200p(Parcel parcel) {
        this.f675a = (C0202q[]) parcel.createTypedArray(C0202q.CREATOR);
        this.f676b = parcel.createIntArray();
        this.f677c = (C0164d[]) parcel.createTypedArray(C0164d.CREATOR);
        this.f678d = parcel.readInt();
        this.f679e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f675a, i);
        parcel.writeIntArray(this.f676b);
        parcel.writeTypedArray(this.f677c, i);
        parcel.writeInt(this.f678d);
        parcel.writeInt(this.f679e);
    }
}
