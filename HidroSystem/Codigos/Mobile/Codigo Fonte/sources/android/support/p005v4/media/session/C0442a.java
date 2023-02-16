package android.support.p005v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p005v4.media.MediaMetadataCompat;
import android.support.p005v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
public interface C0442a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    public static abstract class C0443a extends Binder implements C0442a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        private static class C0444a implements C0442a {

            /* renamed from: a */
            private IBinder f1128a;

            C0444a(IBinder iBinder) {
                this.f1128a = iBinder;
            }

            /* renamed from: a */
            public void mo1702a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f1128a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1730a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f1128a.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1703a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1128a.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1704a(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1128a.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1705a(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1128a.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1731a(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1128a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1706a(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1128a.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1732a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1128a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1707a(List<MediaSessionCompat.QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f1128a.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1733a(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1128a.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1128a;
            }

            /* renamed from: b */
            public void mo1734b(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f1128a.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1735b(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1128a.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0443a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: a */
        public static C0442a m1948a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0442a)) ? new C0444a(iBinder) : (C0442a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r2v19 */
        /* JADX WARNING: type inference failed for: r2v20 */
        /* JADX WARNING: type inference failed for: r2v21 */
        /* JADX WARNING: type inference failed for: r2v22 */
        /* JADX WARNING: type inference failed for: r2v23 */
        /* JADX WARNING: type inference failed for: r2v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x00f6
                r0 = 0
                r2 = 0
                switch(r4) {
                    case 1: goto L_0x00da;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00b9;
                    case 4: goto L_0x00a1;
                    case 5: goto L_0x0092;
                    case 6: goto L_0x007a;
                    case 7: goto L_0x0062;
                    case 8: goto L_0x004a;
                    case 9: goto L_0x003d;
                    case 10: goto L_0x002d;
                    case 11: goto L_0x001d;
                    case 12: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0010:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1734b((int) r4)
                return r1
            L_0x001d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0029
                r0 = 1
            L_0x0029:
                r3.mo1735b((boolean) r0)
                return r1
            L_0x002d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0039
                r0 = 1
            L_0x0039:
                r3.mo1733a((boolean) r0)
                return r1
            L_0x003d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1730a((int) r4)
                return r1
            L_0x004a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x005e
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r4 = android.support.p005v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.support.v4.media.session.ParcelableVolumeInfo r2 = (android.support.p005v4.media.session.ParcelableVolumeInfo) r2
            L_0x005e:
                r3.mo1705a((android.support.p005v4.media.session.ParcelableVolumeInfo) r2)
                return r1
            L_0x0062:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0076
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0076:
                r3.mo1703a((android.os.Bundle) r2)
                return r1
            L_0x007a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x008e
                android.os.Parcelable$Creator r4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            L_0x008e:
                r3.mo1706a((java.lang.CharSequence) r2)
                return r1
            L_0x0092:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4 = android.support.p005v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                r3.mo1707a((java.util.List<android.support.p005v4.media.session.MediaSessionCompat.QueueItem>) r4)
                return r1
            L_0x00a1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00b5
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r4 = android.support.p005v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.support.v4.media.MediaMetadataCompat r2 = (android.support.p005v4.media.MediaMetadataCompat) r2
            L_0x00b5:
                r3.mo1704a((android.support.p005v4.media.MediaMetadataCompat) r2)
                return r1
            L_0x00b9:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00cd
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r4 = android.support.p005v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.support.v4.media.session.PlaybackStateCompat r2 = (android.support.p005v4.media.session.PlaybackStateCompat) r2
            L_0x00cd:
                r3.mo1731a((android.support.p005v4.media.session.PlaybackStateCompat) r2)
                return r1
            L_0x00d1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                r3.mo1702a()
                return r1
            L_0x00da:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                if (r6 == 0) goto L_0x00f2
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r6.createFromParcel(r5)
                r2 = r5
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x00f2:
                r3.mo1732a(r4, r2)
                return r1
            L_0x00f6:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.writeString(r4)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.media.session.C0442a.C0443a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo1702a();

    /* renamed from: a */
    void mo1730a(int i);

    /* renamed from: a */
    void mo1703a(Bundle bundle);

    /* renamed from: a */
    void mo1704a(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: a */
    void mo1705a(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: a */
    void mo1731a(PlaybackStateCompat playbackStateCompat);

    /* renamed from: a */
    void mo1706a(CharSequence charSequence);

    /* renamed from: a */
    void mo1732a(String str, Bundle bundle);

    /* renamed from: a */
    void mo1707a(List<MediaSessionCompat.QueueItem> list);

    /* renamed from: a */
    void mo1733a(boolean z);

    /* renamed from: b */
    void mo1734b(int i);

    /* renamed from: b */
    void mo1735b(boolean z);
}
