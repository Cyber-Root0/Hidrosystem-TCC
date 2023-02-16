package android.support.p005v4.p014f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.f.a */
public interface C0272a extends IInterface {

    /* renamed from: android.support.v4.f.a$a */
    public static abstract class C0273a extends Binder implements C0272a {

        /* renamed from: android.support.v4.f.a$a$a */
        private static class C0274a implements C0272a {

            /* renamed from: a */
            private IBinder f824a;

            C0274a(IBinder iBinder) {
                this.f824a = iBinder;
            }

            /* renamed from: a */
            public void mo1206a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f824a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f824a;
            }
        }

        public C0273a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C0272a m1256a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0272a)) ? new C0274a(iBinder) : (C0272a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo1206a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo1206a(int i, Bundle bundle);
}
