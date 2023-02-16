package android.support.p005v4.p017i.p018a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.i.a.e */
class C0351e {

    /* renamed from: android.support.v4.i.a.e$a */
    interface C0353a {
        /* renamed from: a */
        Object mo1488a(int i);

        /* renamed from: a */
        List<Object> mo1489a(String str, int i);

        /* renamed from: a */
        boolean mo1490a(int i, int i2, Bundle bundle);

        /* renamed from: b */
        Object mo1491b(int i);
    }

    /* renamed from: a */
    public static Object m1535a(final C0353a aVar) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) aVar.mo1488a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return aVar.mo1489a(str, i);
            }

            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) aVar.mo1491b(i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return aVar.mo1490a(i, i2, bundle);
            }
        };
    }
}
