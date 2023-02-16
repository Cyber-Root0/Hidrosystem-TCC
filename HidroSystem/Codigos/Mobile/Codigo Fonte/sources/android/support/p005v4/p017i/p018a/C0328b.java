package android.support.p005v4.p017i.p018a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.i.a.b */
public class C0328b {

    /* renamed from: a */
    static final C0338j f947a = (Build.VERSION.SDK_INT >= 24 ? new C0337i() : Build.VERSION.SDK_INT >= 23 ? new C0336h() : Build.VERSION.SDK_INT >= 22 ? new C0335g() : Build.VERSION.SDK_INT >= 21 ? new C0334f() : Build.VERSION.SDK_INT >= 19 ? new C0333e() : Build.VERSION.SDK_INT >= 18 ? new C0332d() : Build.VERSION.SDK_INT >= 17 ? new C0331c() : Build.VERSION.SDK_INT >= 16 ? new C0330b() : new C0338j());

    /* renamed from: b */
    public int f948b = -1;

    /* renamed from: c */
    private final AccessibilityNodeInfo f949c;

    /* renamed from: android.support.v4.i.a.b$a */
    public static class C0329a {

        /* renamed from: A */
        public static final C0329a f950A = new C0329a(C0328b.f947a.mo1474d());

        /* renamed from: B */
        public static final C0329a f951B = new C0329a(C0328b.f947a.mo1476f());

        /* renamed from: C */
        public static final C0329a f952C = new C0329a(C0328b.f947a.mo1477g());

        /* renamed from: D */
        public static final C0329a f953D = new C0329a(C0328b.f947a.mo1478h());

        /* renamed from: a */
        public static final C0329a f954a = new C0329a(1, (CharSequence) null);

        /* renamed from: b */
        public static final C0329a f955b = new C0329a(2, (CharSequence) null);

        /* renamed from: c */
        public static final C0329a f956c = new C0329a(4, (CharSequence) null);

        /* renamed from: d */
        public static final C0329a f957d = new C0329a(8, (CharSequence) null);

        /* renamed from: e */
        public static final C0329a f958e = new C0329a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C0329a f959f = new C0329a(32, (CharSequence) null);

        /* renamed from: g */
        public static final C0329a f960g = new C0329a(64, (CharSequence) null);

        /* renamed from: h */
        public static final C0329a f961h = new C0329a(128, (CharSequence) null);

        /* renamed from: i */
        public static final C0329a f962i = new C0329a(256, (CharSequence) null);

        /* renamed from: j */
        public static final C0329a f963j = new C0329a(512, (CharSequence) null);

        /* renamed from: k */
        public static final C0329a f964k = new C0329a(1024, (CharSequence) null);

        /* renamed from: l */
        public static final C0329a f965l = new C0329a(2048, (CharSequence) null);

        /* renamed from: m */
        public static final C0329a f966m = new C0329a(4096, (CharSequence) null);

        /* renamed from: n */
        public static final C0329a f967n = new C0329a(8192, (CharSequence) null);

        /* renamed from: o */
        public static final C0329a f968o = new C0329a(16384, (CharSequence) null);

        /* renamed from: p */
        public static final C0329a f969p = new C0329a(32768, (CharSequence) null);

        /* renamed from: q */
        public static final C0329a f970q = new C0329a(65536, (CharSequence) null);

        /* renamed from: r */
        public static final C0329a f971r = new C0329a(131072, (CharSequence) null);

        /* renamed from: s */
        public static final C0329a f972s = new C0329a(262144, (CharSequence) null);

        /* renamed from: t */
        public static final C0329a f973t = new C0329a(524288, (CharSequence) null);

        /* renamed from: u */
        public static final C0329a f974u = new C0329a(1048576, (CharSequence) null);

        /* renamed from: v */
        public static final C0329a f975v = new C0329a(2097152, (CharSequence) null);

        /* renamed from: w */
        public static final C0329a f976w = new C0329a(C0328b.f947a.mo1472b());

        /* renamed from: x */
        public static final C0329a f977x = new C0329a(C0328b.f947a.mo1471a());

        /* renamed from: y */
        public static final C0329a f978y = new C0329a(C0328b.f947a.mo1473c());

        /* renamed from: z */
        public static final C0329a f979z = new C0329a(C0328b.f947a.mo1475e());

        /* renamed from: E */
        final Object f980E;

        public C0329a(int i, CharSequence charSequence) {
            this(C0328b.f947a.mo1469a(i, charSequence));
        }

        C0329a(Object obj) {
            this.f980E = obj;
        }
    }

    /* renamed from: android.support.v4.i.a.b$b */
    static class C0330b extends C0338j {
        C0330b() {
        }

        /* renamed from: a */
        public void mo1460a(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setVisibleToUser(z);
        }

        /* renamed from: a */
        public boolean mo1461a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isVisibleToUser();
        }

        /* renamed from: b */
        public void mo1462b(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityFocused(z);
        }

        /* renamed from: b */
        public boolean mo1463b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityFocused();
        }
    }

    /* renamed from: android.support.v4.i.a.b$c */
    static class C0331c extends C0330b {
        C0331c() {
        }
    }

    /* renamed from: android.support.v4.i.a.b$d */
    static class C0332d extends C0331c {
        C0332d() {
        }

        /* renamed from: c */
        public String mo1464c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getViewIdResourceName();
        }
    }

    /* renamed from: android.support.v4.i.a.b$e */
    static class C0333e extends C0332d {
        C0333e() {
        }

        /* renamed from: a */
        public Object mo1465a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
        }

        /* renamed from: a */
        public Object mo1466a(int i, int i2, boolean z, int i3) {
            return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
        }

        /* renamed from: a */
        public void mo1467a(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
        }

        /* renamed from: b */
        public void mo1468b(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
        }
    }

    /* renamed from: android.support.v4.i.a.b$f */
    static class C0334f extends C0333e {
        C0334f() {
        }

        /* renamed from: a */
        public Object mo1465a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
        }

        /* renamed from: a */
        public Object mo1466a(int i, int i2, boolean z, int i3) {
            return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3);
        }

        /* renamed from: a */
        public Object mo1469a(int i, CharSequence charSequence) {
            return new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        }

        /* renamed from: c */
        public boolean mo1470c(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) obj);
        }
    }

    /* renamed from: android.support.v4.i.a.b$g */
    static class C0335g extends C0334f {
        C0335g() {
        }
    }

    /* renamed from: android.support.v4.i.a.b$h */
    static class C0336h extends C0335g {
        C0336h() {
        }

        /* renamed from: a */
        public Object mo1471a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }

        /* renamed from: b */
        public Object mo1472b() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }

        /* renamed from: c */
        public Object mo1473c() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        }

        /* renamed from: d */
        public Object mo1474d() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        }

        /* renamed from: e */
        public Object mo1475e() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        }

        /* renamed from: f */
        public Object mo1476f() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        }

        /* renamed from: g */
        public Object mo1477g() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        }
    }

    /* renamed from: android.support.v4.i.a.b$i */
    static class C0337i extends C0336h {
        C0337i() {
        }

        /* renamed from: h */
        public Object mo1478h() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
    }

    /* renamed from: android.support.v4.i.a.b$j */
    static class C0338j {
        C0338j() {
        }

        /* renamed from: a */
        public Object mo1471a() {
            return null;
        }

        /* renamed from: a */
        public Object mo1465a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return null;
        }

        /* renamed from: a */
        public Object mo1466a(int i, int i2, boolean z, int i3) {
            return null;
        }

        /* renamed from: a */
        public Object mo1469a(int i, CharSequence charSequence) {
            return null;
        }

        /* renamed from: a */
        public void mo1467a(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        }

        /* renamed from: a */
        public void mo1460a(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        /* renamed from: a */
        public boolean mo1461a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        /* renamed from: b */
        public Object mo1472b() {
            return null;
        }

        /* renamed from: b */
        public void mo1468b(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        }

        /* renamed from: b */
        public void mo1462b(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        /* renamed from: b */
        public boolean mo1463b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        /* renamed from: c */
        public Object mo1473c() {
            return null;
        }

        /* renamed from: c */
        public String mo1464c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }

        /* renamed from: c */
        public boolean mo1470c(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return false;
        }

        /* renamed from: d */
        public Object mo1474d() {
            return null;
        }

        /* renamed from: e */
        public Object mo1475e() {
            return null;
        }

        /* renamed from: f */
        public Object mo1476f() {
            return null;
        }

        /* renamed from: g */
        public Object mo1477g() {
            return null;
        }

        /* renamed from: h */
        public Object mo1478h() {
            return null;
        }
    }

    /* renamed from: android.support.v4.i.a.b$k */
    public static class C0339k {

        /* renamed from: a */
        final Object f981a;

        C0339k(Object obj) {
            this.f981a = obj;
        }

        /* renamed from: a */
        public static C0339k m1513a(int i, int i2, boolean z, int i3) {
            return new C0339k(C0328b.f947a.mo1466a(i, i2, z, i3));
        }
    }

    /* renamed from: android.support.v4.i.a.b$l */
    public static class C0340l {

        /* renamed from: a */
        final Object f982a;

        C0340l(Object obj) {
            this.f982a = obj;
        }

        /* renamed from: a */
        public static C0340l m1514a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C0340l(C0328b.f947a.mo1465a(i, i2, i3, i4, z, z2));
        }
    }

    private C0328b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f949c = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0328b m1425a(C0328b bVar) {
        return m1426a(AccessibilityNodeInfo.obtain(bVar.f949c));
    }

    /* renamed from: a */
    public static C0328b m1426a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0328b(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m1427b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo1412a() {
        return this.f949c;
    }

    /* renamed from: a */
    public void mo1413a(int i) {
        this.f949c.addAction(i);
    }

    /* renamed from: a */
    public void mo1414a(Rect rect) {
        this.f949c.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo1415a(View view) {
        this.f949c.setSource(view);
    }

    /* renamed from: a */
    public void mo1416a(CharSequence charSequence) {
        this.f949c.setPackageName(charSequence);
    }

    /* renamed from: a */
    public void mo1417a(Object obj) {
        f947a.mo1467a(this.f949c, ((C0339k) obj).f981a);
    }

    /* renamed from: a */
    public void mo1418a(boolean z) {
        this.f949c.setCheckable(z);
    }

    /* renamed from: a */
    public boolean mo1419a(C0329a aVar) {
        return f947a.mo1470c(this.f949c, aVar.f980E);
    }

    /* renamed from: b */
    public int mo1420b() {
        return this.f949c.getActions();
    }

    /* renamed from: b */
    public void mo1421b(Rect rect) {
        this.f949c.setBoundsInParent(rect);
    }

    /* renamed from: b */
    public void mo1422b(View view) {
        this.f949c.addChild(view);
    }

    /* renamed from: b */
    public void mo1423b(CharSequence charSequence) {
        this.f949c.setClassName(charSequence);
    }

    /* renamed from: b */
    public void mo1424b(Object obj) {
        f947a.mo1468b(this.f949c, ((C0340l) obj).f982a);
    }

    /* renamed from: b */
    public void mo1425b(boolean z) {
        this.f949c.setChecked(z);
    }

    /* renamed from: c */
    public void mo1426c(Rect rect) {
        this.f949c.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public void mo1427c(View view) {
        this.f949c.setParent(view);
    }

    /* renamed from: c */
    public void mo1428c(CharSequence charSequence) {
        this.f949c.setContentDescription(charSequence);
    }

    /* renamed from: c */
    public void mo1429c(boolean z) {
        this.f949c.setFocusable(z);
    }

    /* renamed from: c */
    public boolean mo1430c() {
        return this.f949c.isCheckable();
    }

    /* renamed from: d */
    public void mo1431d(Rect rect) {
        this.f949c.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo1432d(boolean z) {
        this.f949c.setFocused(z);
    }

    /* renamed from: d */
    public boolean mo1433d() {
        return this.f949c.isChecked();
    }

    /* renamed from: e */
    public void mo1434e(boolean z) {
        f947a.mo1460a(this.f949c, z);
    }

    /* renamed from: e */
    public boolean mo1435e() {
        return this.f949c.isFocusable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0328b bVar = (C0328b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f949c;
        if (accessibilityNodeInfo == null) {
            if (bVar.f949c != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f949c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo1437f(boolean z) {
        f947a.mo1462b(this.f949c, z);
    }

    /* renamed from: f */
    public boolean mo1438f() {
        return this.f949c.isFocused();
    }

    /* renamed from: g */
    public void mo1439g(boolean z) {
        this.f949c.setSelected(z);
    }

    /* renamed from: g */
    public boolean mo1440g() {
        return f947a.mo1461a(this.f949c);
    }

    /* renamed from: h */
    public void mo1441h(boolean z) {
        this.f949c.setClickable(z);
    }

    /* renamed from: h */
    public boolean mo1442h() {
        return f947a.mo1463b(this.f949c);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f949c;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void mo1444i(boolean z) {
        this.f949c.setLongClickable(z);
    }

    /* renamed from: i */
    public boolean mo1445i() {
        return this.f949c.isSelected();
    }

    /* renamed from: j */
    public void mo1446j(boolean z) {
        this.f949c.setEnabled(z);
    }

    /* renamed from: j */
    public boolean mo1447j() {
        return this.f949c.isClickable();
    }

    /* renamed from: k */
    public void mo1448k(boolean z) {
        this.f949c.setScrollable(z);
    }

    /* renamed from: k */
    public boolean mo1449k() {
        return this.f949c.isLongClickable();
    }

    /* renamed from: l */
    public boolean mo1450l() {
        return this.f949c.isEnabled();
    }

    /* renamed from: m */
    public boolean mo1451m() {
        return this.f949c.isPassword();
    }

    /* renamed from: n */
    public boolean mo1452n() {
        return this.f949c.isScrollable();
    }

    /* renamed from: o */
    public CharSequence mo1453o() {
        return this.f949c.getPackageName();
    }

    /* renamed from: p */
    public CharSequence mo1454p() {
        return this.f949c.getClassName();
    }

    /* renamed from: q */
    public CharSequence mo1455q() {
        return this.f949c.getText();
    }

    /* renamed from: r */
    public CharSequence mo1456r() {
        return this.f949c.getContentDescription();
    }

    /* renamed from: s */
    public void mo1457s() {
        this.f949c.recycle();
    }

    /* renamed from: t */
    public String mo1458t() {
        return f947a.mo1464c(this.f949c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo1414a(rect);
        sb.append("; boundsInParent: " + rect);
        mo1426c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo1453o());
        sb.append("; className: ");
        sb.append(mo1454p());
        sb.append("; text: ");
        sb.append(mo1455q());
        sb.append("; contentDescription: ");
        sb.append(mo1456r());
        sb.append("; viewId: ");
        sb.append(mo1458t());
        sb.append("; checkable: ");
        sb.append(mo1430c());
        sb.append("; checked: ");
        sb.append(mo1433d());
        sb.append("; focusable: ");
        sb.append(mo1435e());
        sb.append("; focused: ");
        sb.append(mo1438f());
        sb.append("; selected: ");
        sb.append(mo1445i());
        sb.append("; clickable: ");
        sb.append(mo1447j());
        sb.append("; longClickable: ");
        sb.append(mo1449k());
        sb.append("; enabled: ");
        sb.append(mo1450l());
        sb.append("; password: ");
        sb.append(mo1451m());
        sb.append("; scrollable: " + mo1452n());
        sb.append("; [");
        int b = mo1420b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            sb.append(m1427b(numberOfTrailingZeros));
            if (b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
