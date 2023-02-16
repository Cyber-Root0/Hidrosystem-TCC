package android.support.p005v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0358b;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0401s;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p005v4.widget.C0522p;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a */
    static final int[] f1131a = {16842931};

    /* renamed from: b */
    static final boolean f1132b = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: c */
    private static final int[] f1133c = {16843828};

    /* renamed from: d */
    private static final boolean f1134d;

    /* renamed from: A */
    private float f1135A;

    /* renamed from: B */
    private Drawable f1136B;

    /* renamed from: C */
    private Drawable f1137C;

    /* renamed from: D */
    private Drawable f1138D;

    /* renamed from: E */
    private CharSequence f1139E;

    /* renamed from: F */
    private CharSequence f1140F;

    /* renamed from: G */
    private Object f1141G;

    /* renamed from: H */
    private boolean f1142H;

    /* renamed from: I */
    private Drawable f1143I;

    /* renamed from: J */
    private Drawable f1144J;

    /* renamed from: K */
    private Drawable f1145K;

    /* renamed from: L */
    private Drawable f1146L;

    /* renamed from: M */
    private final ArrayList<View> f1147M;

    /* renamed from: e */
    private final C0459b f1148e;

    /* renamed from: f */
    private float f1149f;

    /* renamed from: g */
    private int f1150g;

    /* renamed from: h */
    private int f1151h;

    /* renamed from: i */
    private float f1152i;

    /* renamed from: j */
    private Paint f1153j;

    /* renamed from: k */
    private final C0522p f1154k;

    /* renamed from: l */
    private final C0522p f1155l;

    /* renamed from: m */
    private final C0464f f1156m;

    /* renamed from: n */
    private final C0464f f1157n;

    /* renamed from: o */
    private int f1158o;

    /* renamed from: p */
    private boolean f1159p;

    /* renamed from: q */
    private boolean f1160q;

    /* renamed from: r */
    private int f1161r;

    /* renamed from: s */
    private int f1162s;

    /* renamed from: t */
    private int f1163t;

    /* renamed from: u */
    private int f1164u;

    /* renamed from: v */
    private boolean f1165v;

    /* renamed from: w */
    private boolean f1166w;

    /* renamed from: x */
    private C0460c f1167x;

    /* renamed from: y */
    private List<C0460c> f1168y;

    /* renamed from: z */
    private float f1169z;

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C0458a extends C0358b {

        /* renamed from: c */
        private final Rect f1172c = new Rect();

        C0458a() {
        }

        /* renamed from: a */
        private void m2134a(C0328b bVar, C0328b bVar2) {
            Rect rect = this.f1172c;
            bVar2.mo1414a(rect);
            bVar.mo1421b(rect);
            bVar2.mo1426c(rect);
            bVar.mo1431d(rect);
            bVar.mo1434e(bVar2.mo1440g());
            bVar.mo1416a(bVar2.mo1453o());
            bVar.mo1423b(bVar2.mo1454p());
            bVar.mo1428c(bVar2.mo1456r());
            bVar.mo1446j(bVar2.mo1450l());
            bVar.mo1441h(bVar2.mo1447j());
            bVar.mo1429c(bVar2.mo1435e());
            bVar.mo1432d(bVar2.mo1438f());
            bVar.mo1437f(bVar2.mo1442h());
            bVar.mo1439g(bVar2.mo1445i());
            bVar.mo1444i(bVar2.mo1449k());
            bVar.mo1413a(bVar2.mo1420b());
        }

        /* renamed from: a */
        private void m2135a(C0328b bVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2096l(childAt)) {
                    bVar.mo1422b(childAt);
                }
            }
        }

        /* renamed from: a */
        public void mo199a(View view, C0328b bVar) {
            if (DrawerLayout.f1132b) {
                super.mo199a(view, bVar);
            } else {
                C0328b a = C0328b.m1425a(bVar);
                super.mo199a(view, a);
                bVar.mo1415a(view);
                ViewParent f = C0388q.m1659f(view);
                if (f instanceof View) {
                    bVar.mo1427c((View) f);
                }
                m2134a(bVar, a);
                a.mo1457s();
                m2135a(bVar, (ViewGroup) view);
            }
            bVar.mo1423b((CharSequence) DrawerLayout.class.getName());
            bVar.mo1429c(false);
            bVar.mo1432d(false);
            bVar.mo1419a(C0328b.C0329a.f954a);
            bVar.mo1419a(C0328b.C0329a.f955b);
        }

        /* renamed from: a */
        public void mo387a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo387a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: a */
        public boolean mo1507a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1132b || DrawerLayout.m2096l(view)) {
                return super.mo1507a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo1509c(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence b;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1509c(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View c = DrawerLayout.this.mo1861c();
            if (c == null || (b = DrawerLayout.this.mo1854b(DrawerLayout.this.mo1870e(c))) == null) {
                return true;
            }
            text.add(b);
            return true;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C0459b extends C0358b {
        C0459b() {
        }

        /* renamed from: a */
        public void mo199a(View view, C0328b bVar) {
            super.mo199a(view, bVar);
            if (!DrawerLayout.m2096l(view)) {
                bVar.mo1427c((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C0460c {
        /* renamed from: a */
        void mo1908a(int i);

        /* renamed from: a */
        void mo1909a(View view);

        /* renamed from: a */
        void mo1910a(View view, float f);

        /* renamed from: b */
        void mo1911b(View view);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    public static class C0461d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1173a = 0;

        /* renamed from: b */
        float f1174b;

        /* renamed from: c */
        boolean f1175c;

        /* renamed from: d */
        int f1176d;

        public C0461d(int i, int i2) {
            super(i, i2);
        }

        public C0461d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1131a);
            this.f1173a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0461d(C0461d dVar) {
            super(dVar);
            this.f1173a = dVar.f1173a;
        }

        public C0461d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0461d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$e */
    protected static class C0462e extends C0321a {
        public static final Parcelable.Creator<C0462e> CREATOR = new Parcelable.ClassLoaderCreator<C0462e>() {
            /* renamed from: a */
            public C0462e createFromParcel(Parcel parcel) {
                return new C0462e(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0462e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0462e(parcel, classLoader);
            }

            /* renamed from: a */
            public C0462e[] newArray(int i) {
                return new C0462e[i];
            }
        };

        /* renamed from: a */
        int f1177a = 0;

        /* renamed from: b */
        int f1178b;

        /* renamed from: c */
        int f1179c;

        /* renamed from: e */
        int f1180e;

        /* renamed from: f */
        int f1181f;

        public C0462e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1177a = parcel.readInt();
            this.f1178b = parcel.readInt();
            this.f1179c = parcel.readInt();
            this.f1180e = parcel.readInt();
            this.f1181f = parcel.readInt();
        }

        public C0462e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1177a);
            parcel.writeInt(this.f1178b);
            parcel.writeInt(this.f1179c);
            parcel.writeInt(this.f1180e);
            parcel.writeInt(this.f1181f);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$f */
    private class C0464f extends C0522p.C0525a {

        /* renamed from: b */
        private final int f1183b;

        /* renamed from: c */
        private C0522p f1184c;

        /* renamed from: d */
        private final Runnable f1185d = new Runnable() {
            public void run() {
                C0464f.this.mo1921b();
            }
        };

        C0464f(int i) {
            this.f1183b = i;
        }

        /* renamed from: c */
        private void m2148c() {
            int i = 3;
            if (this.f1183b == 3) {
                i = 5;
            }
            View c = DrawerLayout.this.mo1862c(i);
            if (c != null) {
                DrawerLayout.this.mo1883i(c);
            }
        }

        /* renamed from: a */
        public int mo368a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo1918a() {
            DrawerLayout.this.removeCallbacks(this.f1185d);
        }

        /* renamed from: a */
        public void mo369a(int i) {
            DrawerLayout.this.mo1844a(this.f1183b, i, this.f1184c.mo2186c());
        }

        /* renamed from: a */
        public void mo1919a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1185d, 160);
        }

        /* renamed from: a */
        public void mo1920a(C0522p pVar) {
            this.f1184c = pVar;
        }

        /* renamed from: a */
        public void mo370a(View view, float f, float f2) {
            int i;
            float d = DrawerLayout.this.mo1867d(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo1851a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1184c.mo2176a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public void mo371a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo1851a(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo1859b(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public boolean mo372a(View view, int i) {
            return DrawerLayout.this.mo1875g(view) && DrawerLayout.this.mo1851a(view, this.f1183b) && DrawerLayout.this.mo1841a(view) == 0;
        }

        /* renamed from: b */
        public int mo563b(View view) {
            if (DrawerLayout.this.mo1875g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: b */
        public int mo373b(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.mo1851a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1921b() {
            View view;
            int i;
            int b = this.f1184c.mo2180b();
            int i2 = 0;
            boolean z = this.f1183b == 3;
            if (z) {
                view = DrawerLayout.this.mo1862c(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + b;
            } else {
                view = DrawerLayout.this.mo1862c(5);
                i = DrawerLayout.this.getWidth() - b;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo1841a(view) == 0) {
                this.f1184c.mo2178a(view, i, view.getTop());
                ((C0461d) view.getLayoutParams()).f1175c = true;
                DrawerLayout.this.invalidate();
                m2148c();
                DrawerLayout.this.mo1868d();
            }
        }

        /* renamed from: b */
        public void mo1922b(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View c = drawerLayout.mo1862c(i3);
            if (c != null && DrawerLayout.this.mo1841a(c) == 0) {
                this.f1184c.mo2175a(c, i2);
            }
        }

        /* renamed from: b */
        public void mo564b(View view, int i) {
            ((C0461d) view.getLayoutParams()).f1175c = false;
            m2148c();
        }

        /* renamed from: b */
        public boolean mo1923b(int i) {
            return false;
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f1134d = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1148e = new C0459b();
        this.f1151h = -1728053248;
        this.f1153j = new Paint();
        this.f1160q = true;
        this.f1161r = 3;
        this.f1162s = 3;
        this.f1163t = 3;
        this.f1164u = 3;
        this.f1143I = null;
        this.f1144J = null;
        this.f1145K = null;
        this.f1146L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1150g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1156m = new C0464f(3);
        this.f1157n = new C0464f(5);
        this.f1154k = C0522p.m2379a((ViewGroup) this, 1.0f, (C0522p.C0525a) this.f1156m);
        this.f1154k.mo2174a(1);
        this.f1154k.mo2173a(f2);
        this.f1156m.mo1920a(this.f1154k);
        this.f1155l = C0522p.m2379a((ViewGroup) this, 1.0f, (C0522p.C0525a) this.f1157n);
        this.f1155l.mo2174a(2);
        this.f1155l.mo2173a(f2);
        this.f1157n.mo1920a(this.f1155l);
        setFocusableInTouchMode(true);
        C0388q.m1639a((View) this, 1);
        C0388q.m1645a((View) this, (C0358b) new C0458a());
        C0401s.m1774a(this, false);
        if (C0388q.m1669p(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    @TargetApi(21)
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((DrawerLayout) view).mo1849a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1133c);
                try {
                    this.f1136B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1136B = null;
            }
        }
        this.f1149f = f * 10.0f;
        this.f1147M = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m2088a(Drawable drawable, int i) {
        if (drawable == null || !C0240a.m1129b(drawable)) {
            return false;
        }
        C0240a.m1130b(drawable, i);
        return true;
    }

    /* renamed from: c */
    private void m2089c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0388q.m1639a(childAt, ((z || mo1875g(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: d */
    static String m2090d(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: e */
    private void m2091e() {
        if (!f1134d) {
            this.f1137C = m2092f();
            this.f1138D = m2093g();
        }
    }

    /* renamed from: f */
    private Drawable m2092f() {
        int e = C0388q.m1658e(this);
        if (e == 0) {
            Drawable drawable = this.f1143I;
            if (drawable != null) {
                m2088a(drawable, e);
                return this.f1143I;
            }
        } else {
            Drawable drawable2 = this.f1144J;
            if (drawable2 != null) {
                m2088a(drawable2, e);
                return this.f1144J;
            }
        }
        return this.f1145K;
    }

    /* renamed from: g */
    private Drawable m2093g() {
        int e = C0388q.m1658e(this);
        if (e == 0) {
            Drawable drawable = this.f1144J;
            if (drawable != null) {
                m2088a(drawable, e);
                return this.f1144J;
            }
        } else {
            Drawable drawable2 = this.f1143I;
            if (drawable2 != null) {
                m2088a(drawable2, e);
                return this.f1143I;
            }
        }
        return this.f1146L;
    }

    /* renamed from: h */
    private boolean m2094h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0461d) getChildAt(i).getLayoutParams()).f1175c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m2095i() {
        return mo1861c() != null;
    }

    /* renamed from: l */
    static boolean m2096l(View view) {
        return (C0388q.m1657d(view) == 4 || C0388q.m1657d(view) == 2) ? false : true;
    }

    /* renamed from: m */
    private static boolean m2097m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: a */
    public int mo1840a(int i) {
        int e = C0388q.m1658e(this);
        if (i == 3) {
            int i2 = this.f1161r;
            if (i2 != 3) {
                return i2;
            }
            int i3 = e == 0 ? this.f1163t : this.f1164u;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f1162s;
            if (i4 != 3) {
                return i4;
            }
            int i5 = e == 0 ? this.f1164u : this.f1163t;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f1163t;
            if (i6 != 3) {
                return i6;
            }
            int i7 = e == 0 ? this.f1161r : this.f1162s;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f1164u;
            if (i8 != 3) {
                return i8;
            }
            int i9 = e == 0 ? this.f1162s : this.f1161r;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public int mo1841a(View view) {
        if (mo1875g(view)) {
            return mo1840a(((C0461d) view.getLayoutParams()).f1173a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo1842a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0461d) childAt.getLayoutParams()).f1176d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1843a(int i, int i2) {
        int a = C0370d.m1575a(i2, C0388q.m1658e(this));
        if (i2 == 3) {
            this.f1161r = i;
        } else if (i2 == 5) {
            this.f1162s = i;
        } else if (i2 == 8388611) {
            this.f1163t = i;
        } else if (i2 == 8388613) {
            this.f1164u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1154k : this.f1155l).mo2192e();
        }
        switch (i) {
            case 1:
                View c = mo1862c(a);
                if (c != null) {
                    mo1883i(c);
                    return;
                }
                return;
            case 2:
                View c2 = mo1862c(a);
                if (c2 != null) {
                    mo1881h(c2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1844a(int i, int i2, View view) {
        int a = this.f1154k.mo2172a();
        int a2 = this.f1155l.mo2172a();
        int i3 = 2;
        if (a == 1 || a2 == 1) {
            i3 = 1;
        } else if (!(a == 2 || a2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            C0461d dVar = (C0461d) view.getLayoutParams();
            if (dVar.f1174b == 0.0f) {
                mo1858b(view);
            } else if (dVar.f1174b == 1.0f) {
                mo1863c(view);
            }
        }
        if (i3 != this.f1158o) {
            this.f1158o = i3;
            List<C0460c> list = this.f1168y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1168y.get(size).mo1908a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1845a(int i, boolean z) {
        View c = mo1862c(i);
        if (c != null) {
            mo1848a(c, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2090d(i));
    }

    /* renamed from: a */
    public void mo1846a(C0460c cVar) {
        if (cVar != null) {
            if (this.f1168y == null) {
                this.f1168y = new ArrayList();
            }
            this.f1168y.add(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1847a(View view, float f) {
        List<C0460c> list = this.f1168y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1168y.get(size).mo1910a(view, f);
            }
        }
    }

    /* renamed from: a */
    public void mo1848a(View view, boolean z) {
        if (mo1875g(view)) {
            C0461d dVar = (C0461d) view.getLayoutParams();
            if (this.f1160q) {
                dVar.f1174b = 1.0f;
                dVar.f1176d = 1;
                m2089c(view, true);
            } else if (z) {
                dVar.f1176d |= 2;
                if (mo1851a(view, 3)) {
                    this.f1154k.mo2178a(view, 0, view.getTop());
                } else {
                    this.f1155l.mo2178a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo1864c(view, 1.0f);
                mo1844a(dVar.f1173a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: a */
    public void mo1849a(Object obj, boolean z) {
        this.f1141G = obj;
        this.f1142H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1850a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0461d dVar = (C0461d) childAt.getLayoutParams();
            if (mo1875g(childAt) && (!z || dVar.f1175c)) {
                z2 |= mo1851a(childAt, 3) ? this.f1154k.mo2178a(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1155l.mo2178a(childAt, getWidth(), childAt.getTop());
                dVar.f1175c = false;
            }
        }
        this.f1156m.mo1918a();
        this.f1157n.mo1918a();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1851a(View view, int i) {
        return (mo1870e(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo1875g(childAt)) {
                    this.f1147M.add(childAt);
                } else if (mo1884j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f1147M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f1147M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1147M.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C0388q.m1639a(view, (mo1842a() != null || mo1875g(view)) ? 4 : 1);
        if (!f1132b) {
            C0388q.m1645a(view, (C0358b) this.f1148e);
        }
    }

    /* renamed from: b */
    public CharSequence mo1854b(int i) {
        int a = C0370d.m1575a(i, C0388q.m1658e(this));
        if (a == 3) {
            return this.f1139E;
        }
        if (a == 5) {
            return this.f1140F;
        }
        return null;
    }

    /* renamed from: b */
    public void mo1855b() {
        mo1850a(false);
    }

    /* renamed from: b */
    public void mo1856b(int i, boolean z) {
        View c = mo1862c(i);
        if (c != null) {
            mo1860b(c, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2090d(i));
    }

    /* renamed from: b */
    public void mo1857b(C0460c cVar) {
        List<C0460c> list;
        if (cVar != null && (list = this.f1168y) != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1858b(View view) {
        View rootView;
        C0461d dVar = (C0461d) view.getLayoutParams();
        if ((dVar.f1176d & 1) == 1) {
            dVar.f1176d = 0;
            List<C0460c> list = this.f1168y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1168y.get(size).mo1911b(view);
                }
            }
            m2089c(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1859b(View view, float f) {
        C0461d dVar = (C0461d) view.getLayoutParams();
        if (f != dVar.f1174b) {
            dVar.f1174b = f;
            mo1847a(view, f);
        }
    }

    /* renamed from: b */
    public void mo1860b(View view, boolean z) {
        C0522p pVar;
        int i;
        if (mo1875g(view)) {
            C0461d dVar = (C0461d) view.getLayoutParams();
            if (this.f1160q) {
                dVar.f1174b = 0.0f;
                dVar.f1176d = 0;
            } else if (z) {
                dVar.f1176d |= 4;
                if (mo1851a(view, 3)) {
                    pVar = this.f1154k;
                    i = -view.getWidth();
                } else {
                    pVar = this.f1155l;
                    i = getWidth();
                }
                pVar.mo2178a(view, i, view.getTop());
            } else {
                mo1864c(view, 0.0f);
                mo1844a(dVar.f1173a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo1861c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo1875g(childAt) && mo1885k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo1862c(int i) {
        int a = C0370d.m1575a(i, C0388q.m1658e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo1870e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1863c(View view) {
        C0461d dVar = (C0461d) view.getLayoutParams();
        if ((dVar.f1176d & 1) == 0) {
            dVar.f1176d = 1;
            List<C0460c> list = this.f1168y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1168y.get(size).mo1909a(view);
                }
            }
            m2089c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1864c(View view, float f) {
        float d = mo1867d(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (d * width));
        if (!mo1851a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo1859b(view, f);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0461d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0461d) getChildAt(i).getLayoutParams()).f1174b);
        }
        this.f1152i = f;
        boolean a = this.f1154k.mo2179a(true);
        boolean a2 = this.f1155l.mo2179a(true);
        if (a || a2) {
            C0388q.m1655c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo1867d(View view) {
        return ((C0461d) view.getLayoutParams()).f1174b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1868d() {
        if (!this.f1166w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1166w = true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean f = mo1873f(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (f) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && m2097m(childAt) && mo1875g(childAt) && childAt.getHeight() >= height) {
                    if (mo1851a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f1152i;
        if (f2 <= 0.0f || !f) {
            if (this.f1137C != null && mo1851a(view2, 3)) {
                int intrinsicWidth = this.f1137C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1154k.mo2180b()), 1.0f));
                this.f1137C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1137C.setAlpha((int) (max * 255.0f));
                drawable = this.f1137C;
            } else if (this.f1138D != null && mo1851a(view2, 5)) {
                int intrinsicWidth2 = this.f1138D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f1155l.mo2180b()), 1.0f));
                this.f1138D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1138D.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1138D;
            }
            drawable.draw(canvas);
        } else {
            int i5 = this.f1151h;
            this.f1153j.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f1153j);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1870e(View view) {
        return C0370d.m1575a(((C0461d) view.getLayoutParams()).f1173a, C0388q.m1658e(this));
    }

    /* renamed from: e */
    public void mo1871e(int i) {
        mo1845a(i, true);
    }

    /* renamed from: f */
    public void mo1872f(int i) {
        mo1856b(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo1873f(View view) {
        return ((C0461d) view.getLayoutParams()).f1173a == 0;
    }

    /* renamed from: g */
    public boolean mo1874g(int i) {
        View c = mo1862c(i);
        if (c != null) {
            return mo1884j(c);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo1875g(View view) {
        int a = C0370d.m1575a(((C0461d) view.getLayoutParams()).f1173a, C0388q.m1658e(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0461d(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0461d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0461d ? new C0461d((C0461d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0461d((ViewGroup.MarginLayoutParams) layoutParams) : new C0461d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1134d) {
            return this.f1149f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1136B;
    }

    /* renamed from: h */
    public void mo1881h(View view) {
        mo1848a(view, true);
    }

    /* renamed from: h */
    public boolean mo1882h(int i) {
        View c = mo1862c(i);
        if (c != null) {
            return mo1885k(c);
        }
        return false;
    }

    /* renamed from: i */
    public void mo1883i(View view) {
        mo1860b(view, true);
    }

    /* renamed from: j */
    public boolean mo1884j(View view) {
        if (mo1875g(view)) {
            return (((C0461d) view.getLayoutParams()).f1176d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: k */
    public boolean mo1885k(View view) {
        if (mo1875g(view)) {
            return ((C0461d) view.getLayoutParams()).f1174b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1160q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1160q = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f1141G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f1142H
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f1136B
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f1141G
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f1136B
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f1136B
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r7 = r6.f1154k.mo2190d((int) r0, (int) r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            android.support.v4.widget.p r1 = r6.f1154k
            boolean r1 = r1.mo2177a((android.view.MotionEvent) r7)
            android.support.v4.widget.p r2 = r6.f1155l
            boolean r2 = r2.mo2177a((android.view.MotionEvent) r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0033;
                case 1: goto L_0x002b;
                case 2: goto L_0x0017;
                case 3: goto L_0x002b;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x005e
        L_0x0017:
            android.support.v4.widget.p r7 = r6.f1154k
            r0 = 3
            boolean r7 = r7.mo2191d(r0)
            if (r7 == 0) goto L_0x005e
            android.support.v4.widget.DrawerLayout$f r7 = r6.f1156m
            r7.mo1918a()
            android.support.v4.widget.DrawerLayout$f r7 = r6.f1157n
            r7.mo1918a()
            goto L_0x005e
        L_0x002b:
            r6.mo1850a((boolean) r2)
            r6.f1165v = r3
            r6.f1166w = r3
            goto L_0x005e
        L_0x0033:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1169z = r0
            r6.f1135A = r7
            float r4 = r6.f1152i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0058
            android.support.v4.widget.p r4 = r6.f1154k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo2190d(r0, r7)
            if (r7 == 0) goto L_0x0058
            boolean r7 = r6.mo1873f((android.view.View) r7)
            if (r7 == 0) goto L_0x0058
            r7 = 1
            goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            r6.f1165v = r3
            r6.f1166w = r3
            goto L_0x005f
        L_0x005e:
            r7 = 0
        L_0x005f:
            if (r1 != 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            boolean r7 = r6.m2094h()
            if (r7 != 0) goto L_0x006f
            boolean r7 = r6.f1166w
            if (r7 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2095i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = mo1861c();
        if (c != null && mo1841a(c) == 0) {
            mo1855b();
        }
        return c != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f1159p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0461d dVar = (C0461d) childAt.getLayoutParams();
                if (mo1873f(childAt)) {
                    childAt.layout(dVar.leftMargin, dVar.topMargin, dVar.leftMargin + childAt.getMeasuredWidth(), dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo1851a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f1174b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i6 - ((int) (dVar.f1174b * f3));
                        f = ((float) (i6 - i8)) / f3;
                        i5 = i8;
                    }
                    boolean z2 = f != dVar.f1174b;
                    int i9 = dVar.f1173a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < dVar.topMargin) {
                            i11 = dVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - dVar.bottomMargin) {
                            i11 = (i10 - dVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, dVar.topMargin, measuredWidth + i5, dVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - dVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - dVar.bottomMargin);
                    }
                    if (z2) {
                        mo1859b(childAt, f);
                    }
                    int i13 = dVar.f1174b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        this.f1159p = false;
        this.f1160q = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1141G != null && C0388q.m1669p(this);
        int e = C0388q.m1658e(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0461d dVar = (C0461d) childAt.getLayoutParams();
                if (z) {
                    int a = C0370d.m1575a(dVar.f1173a, e);
                    if (C0388q.m1669p(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1141G;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1141G;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo1873f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (mo1875g(childAt)) {
                    if (f1134d) {
                        float l = C0388q.m1665l(childAt);
                        float f = this.f1149f;
                        if (l != f) {
                            C0388q.m1638a(childAt, f);
                        }
                    }
                    int e2 = mo1870e(childAt) & 7;
                    boolean z4 = e2 == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.f1150g + dVar.leftMargin + dVar.rightMargin, dVar.width), getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m2090d(e2) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View c;
        if (!(parcelable instanceof C0462e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0462e eVar = (C0462e) parcelable;
        super.onRestoreInstanceState(eVar.mo1402a());
        if (!(eVar.f1177a == 0 || (c = mo1862c(eVar.f1177a)) == null)) {
            mo1881h(c);
        }
        if (eVar.f1178b != 3) {
            mo1843a(eVar.f1178b, 3);
        }
        if (eVar.f1179c != 3) {
            mo1843a(eVar.f1179c, 5);
        }
        if (eVar.f1180e != 3) {
            mo1843a(eVar.f1180e, 8388611);
        }
        if (eVar.f1181f != 3) {
            mo1843a(eVar.f1181f, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m2091e();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0462e eVar = new C0462e(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0461d dVar = (C0461d) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = dVar.f1176d == 1;
            if (dVar.f1176d != 2) {
                z = false;
            }
            if (z2 || z) {
                eVar.f1177a = dVar.f1173a;
            } else {
                i++;
            }
        }
        eVar.f1178b = this.f1161r;
        eVar.f1179c = this.f1162s;
        eVar.f1180e = this.f1163t;
        eVar.f1181f = this.f1164u;
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a;
        this.f1154k.mo2181b(motionEvent);
        this.f1155l.mo2181b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f1169z = x;
                    this.f1135A = y;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View d = this.f1154k.mo2190d((int) x2, (int) y2);
                    if (d != null && mo1873f(d)) {
                        float f = x2 - this.f1169z;
                        float f2 = y2 - this.f1135A;
                        int d2 = this.f1154k.mo2189d();
                        if (!((f * f) + (f2 * f2) >= ((float) (d2 * d2)) || (a = mo1842a()) == null || mo1841a(a) == 2)) {
                            z = false;
                            mo1850a(z);
                            this.f1165v = false;
                            break;
                        }
                    }
                    z = true;
                    mo1850a(z);
                    this.f1165v = false;
            }
        } else {
            mo1850a(true);
        }
        this.f1165v = false;
        this.f1166w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1165v = z;
        if (z) {
            mo1850a(true);
        }
    }

    public void requestLayout() {
        if (!this.f1159p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1149f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo1875g(childAt)) {
                C0388q.m1638a(childAt, this.f1149f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0460c cVar) {
        C0460c cVar2 = this.f1167x;
        if (cVar2 != null) {
            mo1857b(cVar2);
        }
        if (cVar != null) {
            mo1846a(cVar);
        }
        this.f1167x = cVar;
    }

    public void setDrawerLockMode(int i) {
        mo1843a(i, 3);
        mo1843a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1151h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1136B = i != 0 ? C0227a.m1070a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1136B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1136B = new ColorDrawable(i);
        invalidate();
    }
}
