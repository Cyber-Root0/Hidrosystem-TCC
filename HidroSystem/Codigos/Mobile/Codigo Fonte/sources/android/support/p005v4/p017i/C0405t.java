package android.support.p005v4.p017i;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.i.t */
public final class C0405t {

    /* renamed from: a */
    static final C0408c f1034a = (Build.VERSION.SDK_INT >= 21 ? new C0407b() : Build.VERSION.SDK_INT >= 19 ? new C0406a() : new C0408c());

    /* renamed from: android.support.v4.i.t$a */
    static class C0406a extends C0408c {
        C0406a() {
        }
    }

    /* renamed from: android.support.v4.i.t$b */
    static class C0407b extends C0406a {
        C0407b() {
        }

        /* renamed from: a */
        public void mo1622a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll", e);
            }
        }

        /* renamed from: a */
        public void mo1623a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll", e);
            }
        }

        /* renamed from: a */
        public void mo1624a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll", e);
            }
        }

        /* renamed from: a */
        public boolean mo1625a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling", e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo1626a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling", e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo1627a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll", e);
                return false;
            }
        }

        /* renamed from: b */
        public void mo1628b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: android.support.v4.i.t$c */
    static class C0408c {
        C0408c() {
        }

        /* renamed from: a */
        public void mo1622a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0383l) {
                ((C0383l) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo1623a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0383l) {
                ((C0383l) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo1624a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0383l) {
                ((C0383l) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo1625a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof C0383l) {
                return ((C0383l) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo1626a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof C0383l) {
                return ((C0383l) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo1627a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0383l) {
                return ((C0383l) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public void mo1628b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0383l) {
                ((C0383l) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static void m1775a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0384m) {
            ((C0384m) viewParent).mo410c(view, i);
        } else if (i == 0) {
            f1034a.mo1622a(viewParent, view);
        }
    }

    /* renamed from: a */
    public static void m1776a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0384m) {
            ((C0384m) viewParent).mo396a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f1034a.mo1623a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1777a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0384m) {
            ((C0384m) viewParent).mo397a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1034a.mo1624a(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public static boolean m1778a(ViewParent viewParent, View view, float f, float f2) {
        return f1034a.mo1625a(viewParent, view, f, f2);
    }

    /* renamed from: a */
    public static boolean m1779a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1034a.mo1626a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m1780a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0384m) {
            return ((C0384m) viewParent).mo402a(view, view2, i, i2);
        }
        if (i2 == 0) {
            return f1034a.mo1627a(viewParent, view, view2, i);
        }
        return false;
    }

    /* renamed from: b */
    public static void m1781b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0384m) {
            ((C0384m) viewParent).mo407b(view, view2, i, i2);
        } else if (i2 == 0) {
            f1034a.mo1628b(viewParent, view, view2, i);
        }
    }
}
