package android.support.p005v4.p017i.p018a;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.i.a.f */
public class C0354f {

    /* renamed from: a */
    private static final C0357c f991a = (Build.VERSION.SDK_INT >= 16 ? new C0356b() : Build.VERSION.SDK_INT >= 15 ? new C0355a() : new C0357c());

    /* renamed from: b */
    private final AccessibilityRecord f992b;

    /* renamed from: android.support.v4.i.a.f$a */
    static class C0355a extends C0357c {
        C0355a() {
        }

        /* renamed from: a */
        public void mo1501a(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: b */
        public void mo1502b(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: android.support.v4.i.a.f$b */
    static class C0356b extends C0355a {
        C0356b() {
        }
    }

    /* renamed from: android.support.v4.i.a.f$c */
    static class C0357c {
        C0357c() {
        }

        /* renamed from: a */
        public void mo1501a(AccessibilityRecord accessibilityRecord, int i) {
        }

        /* renamed from: b */
        public void mo1502b(AccessibilityRecord accessibilityRecord, int i) {
        }
    }

    /* renamed from: a */
    public static void m1540a(AccessibilityRecord accessibilityRecord, int i) {
        f991a.mo1501a(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m1541b(AccessibilityRecord accessibilityRecord, int i) {
        f991a.mo1502b(accessibilityRecord, i);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0354f fVar = (C0354f) obj;
        AccessibilityRecord accessibilityRecord = this.f992b;
        if (accessibilityRecord == null) {
            if (fVar.f992b != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(fVar.f992b)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f992b;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
