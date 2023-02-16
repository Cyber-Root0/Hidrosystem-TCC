package android.support.p005v4.p017i.p018a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.i.a.d */
class C0348d {

    /* renamed from: android.support.v4.i.a.d$a */
    interface C0350a {
        /* renamed from: a */
        Object mo1485a(int i);

        /* renamed from: a */
        List<Object> mo1486a(String str, int i);

        /* renamed from: a */
        boolean mo1487a(int i, int i2, Bundle bundle);
    }

    /* renamed from: a */
    public static Object m1531a(final C0350a aVar) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) aVar.mo1485a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return aVar.mo1486a(str, i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return aVar.mo1487a(i, i2, bundle);
            }
        };
    }
}
