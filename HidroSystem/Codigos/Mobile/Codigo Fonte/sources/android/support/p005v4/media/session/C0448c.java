package android.support.p005v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
class C0448c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0449a {
        /* renamed from: a */
        void mo1722a();

        /* renamed from: a */
        void mo1723a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo1724a(Bundle bundle);

        /* renamed from: a */
        void mo1725a(CharSequence charSequence);

        /* renamed from: a */
        void mo1726a(Object obj);

        /* renamed from: a */
        void mo1727a(String str, Bundle bundle);

        /* renamed from: a */
        void mo1728a(List<?> list);

        /* renamed from: b */
        void mo1729b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0450b<T extends C0449a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f1130a;

        public C0450b(T t) {
            this.f1130a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f1130a.mo1723a(playbackInfo.getPlaybackType(), C0451c.m2071b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f1130a.mo1724a(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1130a.mo1729b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1130a.mo1726a((Object) playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f1130a.mo1728a((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1130a.mo1725a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f1130a.mo1722a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f1130a.mo1727a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0451c {
        /* renamed from: a */
        private static int m2069a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m2070a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m2071b(Object obj) {
            return m2069a(m2070a(obj));
        }
    }

    /* renamed from: a */
    public static Object m2060a(C0449a aVar) {
        return new C0450b(aVar);
    }
}
