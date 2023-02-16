package android.support.p005v4.p017i.p018a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.i.a.a */
public final class C0324a {

    /* renamed from: a */
    private static final C0327c f946a = (Build.VERSION.SDK_INT >= 19 ? new C0326b() : Build.VERSION.SDK_INT >= 16 ? new C0325a() : new C0327c());

    /* renamed from: android.support.v4.i.a.a$a */
    static class C0325a extends C0327c {
        C0325a() {
        }
    }

    /* renamed from: android.support.v4.i.a.a$b */
    static class C0326b extends C0325a {
        C0326b() {
        }

        /* renamed from: a */
        public int mo1410a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: a */
        public void mo1411a(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: android.support.v4.i.a.a$c */
    static class C0327c {
        C0327c() {
        }

        /* renamed from: a */
        public int mo1410a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        /* renamed from: a */
        public void mo1411a(AccessibilityEvent accessibilityEvent, int i) {
        }
    }

    /* renamed from: a */
    public static int m1419a(AccessibilityEvent accessibilityEvent) {
        return f946a.mo1410a(accessibilityEvent);
    }

    /* renamed from: a */
    public static void m1420a(AccessibilityEvent accessibilityEvent, int i) {
        f946a.mo1411a(accessibilityEvent, i);
    }
}
