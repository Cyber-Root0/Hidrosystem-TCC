package android.support.p005v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p005v4.media.MediaMetadataCompat;
import android.support.p005v4.media.session.C0442a;
import android.support.p005v4.media.session.C0445b;
import android.support.p005v4.media.session.C0448c;
import android.support.p005v4.media.session.MediaSessionCompat;
import android.support.p005v4.p006a.C0168g;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 {

        /* renamed from: a */
        private final List<C0431a> f1084a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C0445b f1085b;

        /* renamed from: c */
        private HashMap<C0431a, C0430a> f1086c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f1087a;

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f1087a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    C0445b unused = mediaControllerImplApi21.f1085b = C0445b.C0446a.m2010a(C0168g.m635a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    mediaControllerImplApi21.m1879a();
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0430a extends C0431a.C0434c {
            C0430a(C0431a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo1702a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1703a(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1704a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1705a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1706a(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1707a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1879a() {
            if (this.f1085b != null) {
                synchronized (this.f1084a) {
                    for (C0431a next : this.f1084a) {
                        C0430a aVar = new C0430a(next);
                        this.f1086c.put(next, aVar);
                        next.f1089b = true;
                        try {
                            this.f1085b.mo1788a((C0442a) aVar);
                        } catch (RemoteException e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    }
                    this.f1084a.clear();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0431a implements IBinder.DeathRecipient {

        /* renamed from: a */
        C0432a f1088a;

        /* renamed from: b */
        boolean f1089b;

        /* renamed from: c */
        private final Object f1090c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0432a extends Handler {

            /* renamed from: a */
            boolean f1091a;

            /* renamed from: b */
            final /* synthetic */ C0431a f1092b;

            public void handleMessage(Message message) {
                if (this.f1091a) {
                    switch (message.what) {
                        case 1:
                            this.f1092b.mo1716a((String) message.obj, message.getData());
                            return;
                        case 2:
                            this.f1092b.mo1714a((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.f1092b.mo1712a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.f1092b.mo1713a((C0435b) message.obj);
                            return;
                        case 5:
                            this.f1092b.mo1717a((List<MediaSessionCompat.QueueItem>) (List) message.obj);
                            return;
                        case 6:
                            this.f1092b.mo1715a((CharSequence) message.obj);
                            return;
                        case 7:
                            this.f1092b.mo1711a((Bundle) message.obj);
                            return;
                        case 8:
                            this.f1092b.mo1708a();
                            return;
                        case 9:
                            this.f1092b.mo1709a(((Integer) message.obj).intValue());
                            return;
                        case 10:
                            this.f1092b.mo1720b(((Boolean) message.obj).booleanValue());
                            return;
                        case 11:
                            this.f1092b.mo1718a(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            this.f1092b.mo1719b(((Integer) message.obj).intValue());
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0433b implements C0448c.C0449a {

            /* renamed from: a */
            private final WeakReference<C0431a> f1093a;

            C0433b(C0431a aVar) {
                this.f1093a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo1722a() {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null) {
                    aVar.mo1708a();
                }
            }

            /* renamed from: a */
            public void mo1723a(int i, int i2, int i3, int i4, int i5) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null) {
                    aVar.mo1713a(new C0435b(i, i2, i3, i4, i5));
                }
            }

            /* renamed from: a */
            public void mo1724a(Bundle bundle) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null) {
                    aVar.mo1711a(bundle);
                }
            }

            /* renamed from: a */
            public void mo1725a(CharSequence charSequence) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null) {
                    aVar.mo1715a(charSequence);
                }
            }

            /* renamed from: a */
            public void mo1726a(Object obj) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null && !aVar.f1089b) {
                    aVar.mo1714a(PlaybackStateCompat.m1930a(obj));
                }
            }

            /* renamed from: a */
            public void mo1727a(String str, Bundle bundle) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar == null) {
                    return;
                }
                if (!aVar.f1089b || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo1716a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo1728a(List<?> list) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null) {
                    aVar.mo1717a(MediaSessionCompat.QueueItem.m1921a(list));
                }
            }

            /* renamed from: b */
            public void mo1729b(Object obj) {
                C0431a aVar = (C0431a) this.f1093a.get();
                if (aVar != null) {
                    aVar.mo1712a(MediaMetadataCompat.m1852a(obj));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0434c extends C0442a.C0443a {

            /* renamed from: a */
            private final WeakReference<C0431a> f1094a;

            C0434c(C0431a aVar) {
                this.f1094a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo1702a() {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1730a(int i) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1703a(Bundle bundle) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1704a(MediaMetadataCompat mediaMetadataCompat) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1705a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(4, parcelableVolumeInfo != null ? new C0435b(parcelableVolumeInfo.f1106a, parcelableVolumeInfo.f1107b, parcelableVolumeInfo.f1108c, parcelableVolumeInfo.f1109d, parcelableVolumeInfo.f1110e) : null, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1731a(PlaybackStateCompat playbackStateCompat) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1706a(CharSequence charSequence) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1732a(String str, Bundle bundle) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(1, str, bundle);
                }
            }

            /* renamed from: a */
            public void mo1707a(List<MediaSessionCompat.QueueItem> list) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(5, list, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1733a(boolean z) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(10, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: b */
            public void mo1734b(int i) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: b */
            public void mo1735b(boolean z) {
                C0431a aVar = (C0431a) this.f1094a.get();
                if (aVar != null) {
                    aVar.mo1710a(11, Boolean.valueOf(z), (Bundle) null);
                }
            }
        }

        public C0431a() {
            this.f1090c = Build.VERSION.SDK_INT >= 21 ? C0448c.m2060a(new C0433b(this)) : new C0434c(this);
        }

        /* renamed from: a */
        public void mo1708a() {
        }

        /* renamed from: a */
        public void mo1709a(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1710a(int i, Object obj, Bundle bundle) {
            C0432a aVar = this.f1088a;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: a */
        public void mo1711a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1712a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo1713a(C0435b bVar) {
        }

        /* renamed from: a */
        public void mo1714a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo1715a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo1716a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1717a(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: a */
        public void mo1718a(boolean z) {
        }

        /* renamed from: b */
        public void mo1719b(int i) {
        }

        @Deprecated
        /* renamed from: b */
        public void mo1720b(boolean z) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static final class C0435b {

        /* renamed from: a */
        private final int f1095a;

        /* renamed from: b */
        private final int f1096b;

        /* renamed from: c */
        private final int f1097c;

        /* renamed from: d */
        private final int f1098d;

        /* renamed from: e */
        private final int f1099e;

        C0435b(int i, int i2, int i3, int i4, int i5) {
            this.f1095a = i;
            this.f1096b = i2;
            this.f1097c = i3;
            this.f1098d = i4;
            this.f1099e = i5;
        }
    }
}
