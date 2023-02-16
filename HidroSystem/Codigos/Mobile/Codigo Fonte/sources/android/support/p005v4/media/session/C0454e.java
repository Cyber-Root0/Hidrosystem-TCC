package android.support.p005v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0454e {

    /* renamed from: android.support.v4.media.session.e$a */
    static final class C0455a {
        /* renamed from: a */
        public static String m2083a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m2084b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m2085c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m2086d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }

    /* renamed from: a */
    public static int m2074a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: b */
    public static long m2075b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m2076c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m2077d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m2078e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m2079f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m2080g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m2081h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m2082i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
