package android.support.p005v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: a */
    private final int f1082a;

    /* renamed from: b */
    private final float f1083b;

    RatingCompat(int i, float f) {
        this.f1082a = i;
        this.f1083b = f;
    }

    public int describeContents() {
        return this.f1082a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f1082a);
        sb.append(" rating=");
        float f = this.f1083b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1082a);
        parcel.writeFloat(this.f1083b);
    }
}
