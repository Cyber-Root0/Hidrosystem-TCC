package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: android.support.design.internal.e */
public class C0071e extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C0071e> CREATOR = new Parcelable.ClassLoaderCreator<C0071e>() {
        /* renamed from: a */
        public C0071e createFromParcel(Parcel parcel) {
            return new C0071e(parcel, (ClassLoader) null);
        }

        /* renamed from: a */
        public C0071e createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0071e(parcel, classLoader);
        }

        /* renamed from: a */
        public C0071e[] newArray(int i) {
            return new C0071e[i];
        }
    };

    public C0071e() {
    }

    public C0071e(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
