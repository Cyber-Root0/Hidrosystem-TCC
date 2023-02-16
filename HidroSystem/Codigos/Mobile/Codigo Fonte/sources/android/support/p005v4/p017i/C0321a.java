package android.support.p005v4.p017i;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.i.a */
public abstract class C0321a implements Parcelable {
    public static final Parcelable.Creator<C0321a> CREATOR = new Parcelable.ClassLoaderCreator<C0321a>() {
        /* renamed from: a */
        public C0321a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: a */
        public C0321a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0321a.f944d;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public C0321a[] newArray(int i) {
            return new C0321a[i];
        }
    };

    /* renamed from: d */
    public static final C0321a f944d = new C0321a() {
    };

    /* renamed from: a */
    private final Parcelable f945a;

    private C0321a() {
        this.f945a = null;
    }

    protected C0321a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f945a = readParcelable == null ? f944d : readParcelable;
    }

    protected C0321a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f945a = parcelable == f944d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* renamed from: a */
    public final Parcelable mo1402a() {
        return this.f945a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f945a, i);
    }
}
