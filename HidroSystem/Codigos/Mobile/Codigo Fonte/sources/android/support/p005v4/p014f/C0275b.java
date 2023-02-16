package android.support.p005v4.p014f;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p014f.C0272a;

/* renamed from: android.support.v4.f.b */
public class C0275b implements Parcelable {
    public static final Parcelable.Creator<C0275b> CREATOR = new Parcelable.Creator<C0275b>() {
        /* renamed from: a */
        public C0275b createFromParcel(Parcel parcel) {
            return new C0275b(parcel);
        }

        /* renamed from: a */
        public C0275b[] newArray(int i) {
            return new C0275b[i];
        }
    };

    /* renamed from: a */
    final boolean f825a = false;

    /* renamed from: b */
    final Handler f826b = null;

    /* renamed from: c */
    C0272a f827c;

    /* renamed from: android.support.v4.f.b$a */
    class C0277a extends C0272a.C0273a {
        C0277a() {
        }

        /* renamed from: a */
        public void mo1206a(int i, Bundle bundle) {
            if (C0275b.this.f826b != null) {
                C0275b.this.f826b.post(new C0278b(i, bundle));
            } else {
                C0275b.this.mo1210a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.f.b$b */
    class C0278b implements Runnable {

        /* renamed from: a */
        final int f829a;

        /* renamed from: b */
        final Bundle f830b;

        C0278b(int i, Bundle bundle) {
            this.f829a = i;
            this.f830b = bundle;
        }

        public void run() {
            C0275b.this.mo1210a(this.f829a, this.f830b);
        }
    }

    C0275b(Parcel parcel) {
        this.f827c = C0272a.C0273a.m1256a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1210a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f827c == null) {
                this.f827c = new C0277a();
            }
            parcel.writeStrongBinder(this.f827c.asBinder());
        }
    }
}
