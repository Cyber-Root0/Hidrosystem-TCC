package android.support.p005v4.p016h;

import android.os.Build;
import java.util.Objects;

/* renamed from: android.support.v4.h.i */
public class C0309i {

    /* renamed from: a */
    private static final C0312b f926a = (Build.VERSION.SDK_INT >= 19 ? new C0311a() : new C0312b());

    /* renamed from: android.support.v4.h.i$a */
    private static class C0311a extends C0312b {
        private C0311a() {
            super();
        }

        /* renamed from: a */
        public boolean mo1363a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    /* renamed from: android.support.v4.h.i$b */
    private static class C0312b {
        private C0312b() {
        }

        /* renamed from: a */
        public boolean mo1363a(Object obj, Object obj2) {
            return obj == obj2 || (obj != null && obj.equals(obj2));
        }
    }

    /* renamed from: a */
    public static boolean m1379a(Object obj, Object obj2) {
        return f926a.mo1363a(obj, obj2);
    }
}
