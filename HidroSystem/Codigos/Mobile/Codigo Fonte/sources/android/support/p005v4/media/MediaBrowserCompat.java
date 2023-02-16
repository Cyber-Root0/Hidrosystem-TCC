package android.support.p005v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p014f.C0275b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f1048a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends C0275b {

        /* renamed from: d */
        private final String f1049d;

        /* renamed from: e */
        private final Bundle f1050e;

        /* renamed from: f */
        private final C0418a f1051f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1210a(int i, Bundle bundle) {
            C0418a aVar = this.f1051f;
            if (aVar != null) {
                switch (i) {
                    case -1:
                        aVar.mo1666c(this.f1049d, this.f1050e, bundle);
                        return;
                    case 0:
                        aVar.mo1665b(this.f1049d, this.f1050e, bundle);
                        return;
                    case 1:
                        aVar.mo1664a(this.f1049d, this.f1050e, bundle);
                        return;
                    default:
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f1050e + ", resultData=" + bundle + ")");
                        return;
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends C0275b {

        /* renamed from: d */
        private final String f1052d;

        /* renamed from: e */
        private final C0419b f1053e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1210a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f1053e.mo1668a(this.f1052d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f1053e.mo1667a((MediaItem) parcelable);
            } else {
                this.f1053e.mo1668a(this.f1052d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a */
        private final int f1054a;

        /* renamed from: b */
        private final MediaDescriptionCompat f1055b;

        MediaItem(Parcel parcel) {
            this.f1054a = parcel.readInt();
            this.f1055b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f1054a + ", mDescription=" + this.f1055b + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1054a);
            this.f1055b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends C0275b {

        /* renamed from: d */
        private final String f1056d;

        /* renamed from: e */
        private final Bundle f1057e;

        /* renamed from: f */
        private final C0420c f1058f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1210a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f1058f.mo1669a(this.f1056d, this.f1057e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f1058f.mo1670a(this.f1056d, this.f1057e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static abstract class C0418a {
        /* renamed from: a */
        public void mo1664a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo1665b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo1666c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static abstract class C0419b {
        /* renamed from: a */
        public void mo1667a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo1668a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0420c {
        /* renamed from: a */
        public void mo1669a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1670a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }
}
