package android.support.p005v4.p006a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.a.q */
final class C0202q implements Parcelable {
    public static final Parcelable.Creator<C0202q> CREATOR = new Parcelable.Creator<C0202q>() {
        /* renamed from: a */
        public C0202q createFromParcel(Parcel parcel) {
            return new C0202q(parcel);
        }

        /* renamed from: a */
        public C0202q[] newArray(int i) {
            return new C0202q[i];
        }
    };

    /* renamed from: a */
    final String f680a;

    /* renamed from: b */
    final int f681b;

    /* renamed from: c */
    final boolean f682c;

    /* renamed from: d */
    final int f683d;

    /* renamed from: e */
    final int f684e;

    /* renamed from: f */
    final String f685f;

    /* renamed from: g */
    final boolean f686g;

    /* renamed from: h */
    final boolean f687h;

    /* renamed from: i */
    final Bundle f688i;

    /* renamed from: j */
    final boolean f689j;

    /* renamed from: k */
    Bundle f690k;

    /* renamed from: l */
    C0170h f691l;

    public C0202q(Parcel parcel) {
        this.f680a = parcel.readString();
        this.f681b = parcel.readInt();
        boolean z = true;
        this.f682c = parcel.readInt() != 0;
        this.f683d = parcel.readInt();
        this.f684e = parcel.readInt();
        this.f685f = parcel.readString();
        this.f686g = parcel.readInt() != 0;
        this.f687h = parcel.readInt() != 0;
        this.f688i = parcel.readBundle();
        this.f689j = parcel.readInt() == 0 ? false : z;
        this.f690k = parcel.readBundle();
    }

    public C0202q(C0170h hVar) {
        this.f680a = hVar.getClass().getName();
        this.f681b = hVar.f549e;
        this.f682c = hVar.f557m;
        this.f683d = hVar.f567w;
        this.f684e = hVar.f568x;
        this.f685f = hVar.f569y;
        this.f686g = hVar.f526B;
        this.f687h = hVar.f525A;
        this.f688i = hVar.f551g;
        this.f689j = hVar.f570z;
    }

    /* renamed from: a */
    public C0170h mo1036a(C0182l lVar, C0180j jVar, C0170h hVar, C0199o oVar) {
        if (this.f691l == null) {
            Context g = lVar.mo913g();
            Bundle bundle = this.f688i;
            if (bundle != null) {
                bundle.setClassLoader(g.getClassLoader());
            }
            this.f691l = jVar != null ? jVar.mo831a(g, this.f680a, this.f688i) : C0170h.m639a(g, this.f680a, this.f688i);
            Bundle bundle2 = this.f690k;
            if (bundle2 != null) {
                bundle2.setClassLoader(g.getClassLoader());
                this.f691l.f547c = this.f690k;
            }
            this.f691l.mo754a(this.f681b, hVar);
            C0170h hVar2 = this.f691l;
            hVar2.f557m = this.f682c;
            hVar2.f559o = true;
            hVar2.f567w = this.f683d;
            hVar2.f568x = this.f684e;
            hVar2.f569y = this.f685f;
            hVar2.f526B = this.f686g;
            hVar2.f525A = this.f687h;
            hVar2.f570z = this.f689j;
            hVar2.f562r = lVar.f610d;
            if (C0186n.f621a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f691l);
            }
        }
        C0170h hVar3 = this.f691l;
        hVar3.f565u = oVar;
        return hVar3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f680a);
        parcel.writeInt(this.f681b);
        parcel.writeInt(this.f682c ? 1 : 0);
        parcel.writeInt(this.f683d);
        parcel.writeInt(this.f684e);
        parcel.writeString(this.f685f);
        parcel.writeInt(this.f686g ? 1 : 0);
        parcel.writeInt(this.f687h ? 1 : 0);
        parcel.writeBundle(this.f688i);
        parcel.writeInt(this.f689j ? 1 : 0);
        parcel.writeBundle(this.f690k);
    }
}
