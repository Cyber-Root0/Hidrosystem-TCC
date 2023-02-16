package android.support.p005v4.p017i;

import android.os.Build;
import android.os.Bundle;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p005v4.p017i.p018a.C0341c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.i.b */
public class C0358b {

    /* renamed from: a */
    private static final C0361b f993a = (Build.VERSION.SDK_INT >= 16 ? new C0359a() : new C0361b());

    /* renamed from: c */
    private static final View.AccessibilityDelegate f994c = new View.AccessibilityDelegate();

    /* renamed from: b */
    final View.AccessibilityDelegate f995b = f993a.mo1512a(this);

    /* renamed from: android.support.v4.i.b$a */
    static class C0359a extends C0361b {
        C0359a() {
        }

        /* renamed from: a */
        public C0341c mo1511a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0341c(accessibilityNodeProvider);
            }
            return null;
        }

        /* renamed from: a */
        public View.AccessibilityDelegate mo1512a(final C0358b bVar) {
            return new View.AccessibilityDelegate() {
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo1509c(view, accessibilityEvent);
                }

                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    C0341c a = bVar.mo1503a(view);
                    if (a != null) {
                        return (AccessibilityNodeProvider) a.mo1480a();
                    }
                    return null;
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo387a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    bVar.mo199a(view, C0328b.m1426a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo1510d(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo1507a(viewGroup, view, accessibilityEvent);
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return bVar.mo1506a(view, i, bundle);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    bVar.mo1505a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo1508b(view, accessibilityEvent);
                }
            };
        }

        /* renamed from: a */
        public boolean mo1513a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: android.support.v4.i.b$b */
    static class C0361b {
        C0361b() {
        }

        /* renamed from: a */
        public C0341c mo1511a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* renamed from: a */
        public View.AccessibilityDelegate mo1512a(final C0358b bVar) {
            return new View.AccessibilityDelegate() {
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo1509c(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo387a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    bVar.mo199a(view, C0328b.m1426a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo1510d(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo1507a(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    bVar.mo1505a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo1508b(view, accessibilityEvent);
                }
            };
        }

        /* renamed from: a */
        public boolean mo1513a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: a */
    public C0341c mo1503a(View view) {
        return f993a.mo1511a(f994c, view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate mo1504a() {
        return this.f995b;
    }

    /* renamed from: a */
    public void mo1505a(View view, int i) {
        f994c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo199a(View view, C0328b bVar) {
        f994c.onInitializeAccessibilityNodeInfo(view, bVar.mo1412a());
    }

    /* renamed from: a */
    public void mo387a(View view, AccessibilityEvent accessibilityEvent) {
        f994c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1506a(View view, int i, Bundle bundle) {
        return f993a.mo1513a(f994c, view, i, bundle);
    }

    /* renamed from: a */
    public boolean mo1507a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f994c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1508b(View view, AccessibilityEvent accessibilityEvent) {
        f994c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: c */
    public boolean mo1509c(View view, AccessibilityEvent accessibilityEvent) {
        return f994c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1510d(View view, AccessibilityEvent accessibilityEvent) {
        f994c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
