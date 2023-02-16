package android.support.p005v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p005v4.media.MediaDescriptionCompat;
import android.support.p005v4.media.MediaMetadataCompat;
import android.support.p005v4.media.RatingCompat;
import android.support.p005v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.b */
public interface C0445b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0446a extends Binder implements C0445b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0447a implements C0445b {

            /* renamed from: a */
            private IBinder f1129a;

            C0447a(IBinder iBinder) {
                this.f1129a = iBinder;
            }

            /* renamed from: a */
            public void mo1780a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f1129a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1781a(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f1129a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1782a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.f1129a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1783a(Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1784a(MediaDescriptionCompat mediaDescriptionCompat) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1785a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f1129a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1786a(RatingCompat ratingCompat) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1787a(RatingCompat ratingCompat, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1788a(C0442a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f1129a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1789a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1790a(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1791a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1129a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo1792a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f1129a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo1793a(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1129a;
            }

            /* renamed from: b */
            public String mo1794b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1795b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f1129a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1796b(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f1129a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1797b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.f1129a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1798b(Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1799b(MediaDescriptionCompat mediaDescriptionCompat) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1800b(C0442a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f1129a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1801b(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1802b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1129a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String mo1803c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo1804c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f1129a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo1805c(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public PendingIntent mo1806d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo1807d(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public long mo1808e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo1809e(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1129a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public ParcelableVolumeInfo mo1810f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public MediaMetadataCompat mo1811g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public PlaybackStateCompat mo1812h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public List<MediaSessionCompat.QueueItem> mo1813i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public CharSequence mo1814j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public Bundle mo1815k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public int mo1816l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public boolean mo1817m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f1129a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public int mo1818n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public boolean mo1819o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f1129a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public int mo1820p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo1821q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo1822r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo1823s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo1824t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo1825u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo1826v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public void mo1827w() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public void mo1828x() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1129a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C0445b m2010a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0445b)) ? new C0447a(iBinder) : (C0445b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v43 */
        /* JADX WARNING: type inference failed for: r1v44 */
        /* JADX WARNING: type inference failed for: r1v45 */
        /* JADX WARNING: type inference failed for: r1v46 */
        /* JADX WARNING: type inference failed for: r1v47 */
        /* JADX WARNING: type inference failed for: r1v48 */
        /* JADX WARNING: type inference failed for: r1v49 */
        /* JADX WARNING: type inference failed for: r1v50 */
        /* JADX WARNING: type inference failed for: r1v51 */
        /* JADX WARNING: type inference failed for: r1v52 */
        /* JADX WARNING: type inference failed for: r1v53 */
        /* JADX WARNING: type inference failed for: r1v54 */
        /* JADX WARNING: type inference failed for: r1v55 */
        /* JADX WARNING: type inference failed for: r1v56 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 51
                r1 = 0
                r2 = 1
                if (r4 == r0) goto L_0x042d
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r0) goto L_0x0427
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x03f8;
                    case 2: goto L_0x03d9;
                    case 3: goto L_0x03c5;
                    case 4: goto L_0x03b1;
                    case 5: goto L_0x03a1;
                    case 6: goto L_0x0391;
                    case 7: goto L_0x0381;
                    case 8: goto L_0x0368;
                    case 9: goto L_0x0358;
                    case 10: goto L_0x033f;
                    case 11: goto L_0x0327;
                    case 12: goto L_0x030f;
                    case 13: goto L_0x0303;
                    case 14: goto L_0x02e4;
                    case 15: goto L_0x02c5;
                    case 16: goto L_0x029a;
                    case 17: goto L_0x028a;
                    case 18: goto L_0x027e;
                    case 19: goto L_0x0272;
                    case 20: goto L_0x0266;
                    case 21: goto L_0x025a;
                    case 22: goto L_0x024e;
                    case 23: goto L_0x0242;
                    case 24: goto L_0x0232;
                    case 25: goto L_0x0217;
                    case 26: goto L_0x01f8;
                    case 27: goto L_0x01df;
                    case 28: goto L_0x01c6;
                    case 29: goto L_0x01b6;
                    case 30: goto L_0x019d;
                    case 31: goto L_0x0184;
                    case 32: goto L_0x0174;
                    case 33: goto L_0x0168;
                    case 34: goto L_0x0149;
                    case 35: goto L_0x012a;
                    case 36: goto L_0x00ff;
                    case 37: goto L_0x00ef;
                    case 38: goto L_0x00df;
                    case 39: goto L_0x00cf;
                    case 40: goto L_0x00bc;
                    case 41: goto L_0x00a1;
                    case 42: goto L_0x0082;
                    case 43: goto L_0x0067;
                    case 44: goto L_0x0057;
                    case 45: goto L_0x0047;
                    case 46: goto L_0x0034;
                    case 47: goto L_0x0024;
                    case 48: goto L_0x0014;
                    default: goto L_0x000f;
                }
            L_0x000f:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0014:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1804c(r4)
                r6.writeNoException()
                return r2
            L_0x0024:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r3.mo1820p()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x0034:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0040
                r0 = 1
            L_0x0040:
                r3.mo1791a((boolean) r0)
                r6.writeNoException()
                return r2
            L_0x0047:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                boolean r4 = r3.mo1817m()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x0057:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1780a((int) r4)
                r6.writeNoException()
                return r2
            L_0x0067:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x007b
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r4 = android.support.p005v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p005v4.media.MediaDescriptionCompat) r1
            L_0x007b:
                r3.mo1799b((android.support.p005v4.media.MediaDescriptionCompat) r1)
                r6.writeNoException()
                return r2
            L_0x0082:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0096
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r4 = android.support.p005v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p005v4.media.MediaDescriptionCompat) r1
            L_0x0096:
                int r4 = r5.readInt()
                r3.mo1785a((android.support.p005v4.media.MediaDescriptionCompat) r1, (int) r4)
                r6.writeNoException()
                return r2
            L_0x00a1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00b5
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r4 = android.support.p005v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p005v4.media.MediaDescriptionCompat) r1
            L_0x00b5:
                r3.mo1784a((android.support.p005v4.media.MediaDescriptionCompat) r1)
                r6.writeNoException()
                return r2
            L_0x00bc:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00c8
                r0 = 1
            L_0x00c8:
                r3.mo1802b((boolean) r0)
                r6.writeNoException()
                return r2
            L_0x00cf:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1795b((int) r4)
                r6.writeNoException()
                return r2
            L_0x00df:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                boolean r4 = r3.mo1819o()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x00ef:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r3.mo1818n()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x00ff:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0113
                android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.net.Uri r4 = (android.net.Uri) r4
                goto L_0x0114
            L_0x0113:
                r4 = r1
            L_0x0114:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0123
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0123:
                r3.mo1783a((android.net.Uri) r4, (android.os.Bundle) r1)
                r6.writeNoException()
                return r2
            L_0x012a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0142
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0142:
                r3.mo1801b((java.lang.String) r4, (android.os.Bundle) r1)
                r6.writeNoException()
                return r2
            L_0x0149:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0161
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0161:
                r3.mo1789a((java.lang.String) r4, (android.os.Bundle) r1)
                r6.writeNoException()
                return r2
            L_0x0168:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1821q()
                r6.writeNoException()
                return r2
            L_0x0174:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r3.mo1816l()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x0184:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.os.Bundle r4 = r3.mo1815k()
                r6.writeNoException()
                if (r4 == 0) goto L_0x0199
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x019c
            L_0x0199:
                r6.writeInt(r0)
            L_0x019c:
                return r2
            L_0x019d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.CharSequence r4 = r3.mo1814j()
                r6.writeNoException()
                if (r4 == 0) goto L_0x01b2
                r6.writeInt(r2)
                android.text.TextUtils.writeToParcel(r4, r6, r2)
                goto L_0x01b5
            L_0x01b2:
                r6.writeInt(r0)
            L_0x01b5:
                return r2
            L_0x01b6:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.mo1813i()
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r2
            L_0x01c6:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.support.v4.media.session.PlaybackStateCompat r4 = r3.mo1812h()
                r6.writeNoException()
                if (r4 == 0) goto L_0x01db
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x01de
            L_0x01db:
                r6.writeInt(r0)
            L_0x01de:
                return r2
            L_0x01df:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.support.v4.media.MediaMetadataCompat r4 = r3.mo1811g()
                r6.writeNoException()
                if (r4 == 0) goto L_0x01f4
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x01f7
            L_0x01f4:
                r6.writeInt(r0)
            L_0x01f7:
                return r2
            L_0x01f8:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0210
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0210:
                r3.mo1809e(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0217:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x022b
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r4 = android.support.p005v4.media.RatingCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.RatingCompat r1 = (android.support.p005v4.media.RatingCompat) r1
            L_0x022b:
                r3.mo1786a((android.support.p005v4.media.RatingCompat) r1)
                r6.writeNoException()
                return r2
            L_0x0232:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                long r4 = r5.readLong()
                r3.mo1797b((long) r4)
                r6.writeNoException()
                return r2
            L_0x0242:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1828x()
                r6.writeNoException()
                return r2
            L_0x024e:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1827w()
                r6.writeNoException()
                return r2
            L_0x025a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1826v()
                r6.writeNoException()
                return r2
            L_0x0266:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1825u()
                r6.writeNoException()
                return r2
            L_0x0272:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1824t()
                r6.writeNoException()
                return r2
            L_0x027e:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1823s()
                r6.writeNoException()
                return r2
            L_0x028a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                long r4 = r5.readLong()
                r3.mo1782a((long) r4)
                r6.writeNoException()
                return r2
            L_0x029a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x02ae
                android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.net.Uri r4 = (android.net.Uri) r4
                goto L_0x02af
            L_0x02ae:
                r4 = r1
            L_0x02af:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x02be
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02be:
                r3.mo1798b((android.net.Uri) r4, (android.os.Bundle) r1)
                r6.writeNoException()
                return r2
            L_0x02c5:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x02dd
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02dd:
                r3.mo1807d(r4, r1)
                r6.writeNoException()
                return r2
            L_0x02e4:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x02fc
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02fc:
                r3.mo1805c(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0303:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo1822r()
                r6.writeNoException()
                return r2
            L_0x030f:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                int r7 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.mo1796b(r4, r7, r5)
                r6.writeNoException()
                return r2
            L_0x0327:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                int r7 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.mo1781a((int) r4, (int) r7, (java.lang.String) r5)
                r6.writeNoException()
                return r2
            L_0x033f:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.support.v4.media.session.ParcelableVolumeInfo r4 = r3.mo1810f()
                r6.writeNoException()
                if (r4 == 0) goto L_0x0354
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x0357
            L_0x0354:
                r6.writeInt(r0)
            L_0x0357:
                return r2
            L_0x0358:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                long r4 = r3.mo1808e()
                r6.writeNoException()
                r6.writeLong(r4)
                return r2
            L_0x0368:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.app.PendingIntent r4 = r3.mo1806d()
                r6.writeNoException()
                if (r4 == 0) goto L_0x037d
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x0380
            L_0x037d:
                r6.writeInt(r0)
            L_0x0380:
                return r2
            L_0x0381:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r3.mo1803c()
                r6.writeNoException()
                r6.writeString(r4)
                return r2
            L_0x0391:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r3.mo1794b()
                r6.writeNoException()
                r6.writeString(r4)
                return r2
            L_0x03a1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                boolean r4 = r3.mo1792a()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x03b1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.v4.media.session.a r4 = android.support.p005v4.media.session.C0442a.C0443a.m1948a(r4)
                r3.mo1800b((android.support.p005v4.media.session.C0442a) r4)
                r6.writeNoException()
                return r2
            L_0x03c5:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.v4.media.session.a r4 = android.support.p005v4.media.session.C0442a.C0443a.m1948a(r4)
                r3.mo1788a((android.support.p005v4.media.session.C0442a) r4)
                r6.writeNoException()
                return r2
            L_0x03d9:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x03ed
                android.os.Parcelable$Creator r4 = android.view.KeyEvent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            L_0x03ed:
                boolean r4 = r3.mo1793a((android.view.KeyEvent) r1)
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x03f8:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0410
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                android.os.Bundle r7 = (android.os.Bundle) r7
                goto L_0x0411
            L_0x0410:
                r7 = r1
            L_0x0411:
                int r0 = r5.readInt()
                if (r0 == 0) goto L_0x0420
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p005v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r5 = r0.createFromParcel(r5)
                r1 = r5
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = (android.support.p005v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1
            L_0x0420:
                r3.mo1790a((java.lang.String) r4, (android.os.Bundle) r7, (android.support.p005v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1)
                r6.writeNoException()
                return r2
            L_0x0427:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r6.writeString(r4)
                return r2
            L_0x042d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0441
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r4 = android.support.p005v4.media.RatingCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.support.v4.media.RatingCompat r4 = (android.support.p005v4.media.RatingCompat) r4
                goto L_0x0442
            L_0x0441:
                r4 = r1
            L_0x0442:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0451
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0451:
                r3.mo1787a((android.support.p005v4.media.RatingCompat) r4, (android.os.Bundle) r1)
                r6.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.media.session.C0445b.C0446a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo1780a(int i);

    /* renamed from: a */
    void mo1781a(int i, int i2, String str);

    /* renamed from: a */
    void mo1782a(long j);

    /* renamed from: a */
    void mo1783a(Uri uri, Bundle bundle);

    /* renamed from: a */
    void mo1784a(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: a */
    void mo1785a(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* renamed from: a */
    void mo1786a(RatingCompat ratingCompat);

    /* renamed from: a */
    void mo1787a(RatingCompat ratingCompat, Bundle bundle);

    /* renamed from: a */
    void mo1788a(C0442a aVar);

    /* renamed from: a */
    void mo1789a(String str, Bundle bundle);

    /* renamed from: a */
    void mo1790a(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    /* renamed from: a */
    void mo1791a(boolean z);

    /* renamed from: a */
    boolean mo1792a();

    /* renamed from: a */
    boolean mo1793a(KeyEvent keyEvent);

    /* renamed from: b */
    String mo1794b();

    /* renamed from: b */
    void mo1795b(int i);

    /* renamed from: b */
    void mo1796b(int i, int i2, String str);

    /* renamed from: b */
    void mo1797b(long j);

    /* renamed from: b */
    void mo1798b(Uri uri, Bundle bundle);

    /* renamed from: b */
    void mo1799b(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: b */
    void mo1800b(C0442a aVar);

    /* renamed from: b */
    void mo1801b(String str, Bundle bundle);

    /* renamed from: b */
    void mo1802b(boolean z);

    /* renamed from: c */
    String mo1803c();

    /* renamed from: c */
    void mo1804c(int i);

    /* renamed from: c */
    void mo1805c(String str, Bundle bundle);

    /* renamed from: d */
    PendingIntent mo1806d();

    /* renamed from: d */
    void mo1807d(String str, Bundle bundle);

    /* renamed from: e */
    long mo1808e();

    /* renamed from: e */
    void mo1809e(String str, Bundle bundle);

    /* renamed from: f */
    ParcelableVolumeInfo mo1810f();

    /* renamed from: g */
    MediaMetadataCompat mo1811g();

    /* renamed from: h */
    PlaybackStateCompat mo1812h();

    /* renamed from: i */
    List<MediaSessionCompat.QueueItem> mo1813i();

    /* renamed from: j */
    CharSequence mo1814j();

    /* renamed from: k */
    Bundle mo1815k();

    /* renamed from: l */
    int mo1816l();

    /* renamed from: m */
    boolean mo1817m();

    /* renamed from: n */
    int mo1818n();

    /* renamed from: o */
    boolean mo1819o();

    /* renamed from: p */
    int mo1820p();

    /* renamed from: q */
    void mo1821q();

    /* renamed from: r */
    void mo1822r();

    /* renamed from: s */
    void mo1823s();

    /* renamed from: t */
    void mo1824t();

    /* renamed from: u */
    void mo1825u();

    /* renamed from: v */
    void mo1826v();

    /* renamed from: w */
    void mo1827w();

    /* renamed from: x */
    void mo1828x();
}
