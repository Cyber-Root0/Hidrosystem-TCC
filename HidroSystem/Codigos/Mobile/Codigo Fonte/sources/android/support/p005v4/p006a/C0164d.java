package android.support.p005v4.p006a;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p006a.C0162c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.a.d */
final class C0164d implements Parcelable {
    public static final Parcelable.Creator<C0164d> CREATOR = new Parcelable.Creator<C0164d>() {
        /* renamed from: a */
        public C0164d createFromParcel(Parcel parcel) {
            return new C0164d(parcel);
        }

        /* renamed from: a */
        public C0164d[] newArray(int i) {
            return new C0164d[i];
        }
    };

    /* renamed from: a */
    final int[] f507a;

    /* renamed from: b */
    final int f508b;

    /* renamed from: c */
    final int f509c;

    /* renamed from: d */
    final String f510d;

    /* renamed from: e */
    final int f511e;

    /* renamed from: f */
    final int f512f;

    /* renamed from: g */
    final CharSequence f513g;

    /* renamed from: h */
    final int f514h;

    /* renamed from: i */
    final CharSequence f515i;

    /* renamed from: j */
    final ArrayList<String> f516j;

    /* renamed from: k */
    final ArrayList<String> f517k;

    /* renamed from: l */
    final boolean f518l;

    public C0164d(Parcel parcel) {
        this.f507a = parcel.createIntArray();
        this.f508b = parcel.readInt();
        this.f509c = parcel.readInt();
        this.f510d = parcel.readString();
        this.f511e = parcel.readInt();
        this.f512f = parcel.readInt();
        this.f513g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f514h = parcel.readInt();
        this.f515i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f516j = parcel.createStringArrayList();
        this.f517k = parcel.createStringArrayList();
        this.f518l = parcel.readInt() != 0;
    }

    public C0164d(C0162c cVar) {
        int size = cVar.f481c.size();
        this.f507a = new int[(size * 6)];
        if (cVar.f488j) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0162c.C0163a aVar = cVar.f481c.get(i);
                int i3 = i2 + 1;
                this.f507a[i2] = aVar.f501a;
                int i4 = i3 + 1;
                this.f507a[i3] = aVar.f502b != null ? aVar.f502b.f549e : -1;
                int i5 = i4 + 1;
                this.f507a[i4] = aVar.f503c;
                int i6 = i5 + 1;
                this.f507a[i5] = aVar.f504d;
                int i7 = i6 + 1;
                this.f507a[i6] = aVar.f505e;
                this.f507a[i7] = aVar.f506f;
                i++;
                i2 = i7 + 1;
            }
            this.f508b = cVar.f486h;
            this.f509c = cVar.f487i;
            this.f510d = cVar.f490l;
            this.f511e = cVar.f492n;
            this.f512f = cVar.f493o;
            this.f513g = cVar.f494p;
            this.f514h = cVar.f495q;
            this.f515i = cVar.f496r;
            this.f516j = cVar.f497s;
            this.f517k = cVar.f498t;
            this.f518l = cVar.f499u;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0162c mo713a(C0186n nVar) {
        C0162c cVar = new C0162c(nVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f507a.length) {
            C0162c.C0163a aVar = new C0162c.C0163a();
            int i3 = i + 1;
            aVar.f501a = this.f507a[i];
            if (C0186n.f621a) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i2 + " base fragment #" + this.f507a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f507a[i3];
            aVar.f502b = i5 >= 0 ? nVar.f632f.get(i5) : null;
            int[] iArr = this.f507a;
            int i6 = i4 + 1;
            aVar.f503c = iArr[i4];
            int i7 = i6 + 1;
            aVar.f504d = iArr[i6];
            int i8 = i7 + 1;
            aVar.f505e = iArr[i7];
            aVar.f506f = iArr[i8];
            cVar.f482d = aVar.f503c;
            cVar.f483e = aVar.f504d;
            cVar.f484f = aVar.f505e;
            cVar.f485g = aVar.f506f;
            cVar.mo700a(aVar);
            i2++;
            i = i8 + 1;
        }
        cVar.f486h = this.f508b;
        cVar.f487i = this.f509c;
        cVar.f490l = this.f510d;
        cVar.f492n = this.f511e;
        cVar.f488j = true;
        cVar.f493o = this.f512f;
        cVar.f494p = this.f513g;
        cVar.f495q = this.f514h;
        cVar.f496r = this.f515i;
        cVar.f497s = this.f516j;
        cVar.f498t = this.f517k;
        cVar.f499u = this.f518l;
        cVar.mo699a(1);
        return cVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f507a);
        parcel.writeInt(this.f508b);
        parcel.writeInt(this.f509c);
        parcel.writeString(this.f510d);
        parcel.writeInt(this.f511e);
        parcel.writeInt(this.f512f);
        TextUtils.writeToParcel(this.f513g, parcel, 0);
        parcel.writeInt(this.f514h);
        TextUtils.writeToParcel(this.f515i, parcel, 0);
        parcel.writeStringList(this.f516j);
        parcel.writeStringList(this.f517k);
        parcel.writeInt(this.f518l ? 1 : 0);
    }
}
