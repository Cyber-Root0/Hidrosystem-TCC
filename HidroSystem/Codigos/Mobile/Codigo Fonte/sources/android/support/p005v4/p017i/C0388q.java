package android.support.p005v4.p017i;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.i.q */
public class C0388q {

    /* renamed from: a */
    static final C0399j f1019a = (Build.VERSION.SDK_INT >= 26 ? new C0398i() : Build.VERSION.SDK_INT >= 24 ? new C0397h() : Build.VERSION.SDK_INT >= 23 ? new C0396g() : Build.VERSION.SDK_INT >= 21 ? new C0394f() : Build.VERSION.SDK_INT >= 19 ? new C0393e() : Build.VERSION.SDK_INT >= 18 ? new C0392d() : Build.VERSION.SDK_INT >= 17 ? new C0391c() : Build.VERSION.SDK_INT >= 16 ? new C0390b() : Build.VERSION.SDK_INT >= 15 ? new C0389a() : new C0399j());

    /* renamed from: android.support.v4.i.q$a */
    static class C0389a extends C0399j {
        C0389a() {
        }

        /* renamed from: a */
        public boolean mo1576a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: android.support.v4.i.q$b */
    static class C0390b extends C0389a {
        C0390b() {
        }

        /* renamed from: a */
        public void mo1577a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        /* renamed from: a */
        public void mo1578a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: a */
        public void mo1579a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: a */
        public void mo1580a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: b */
        public boolean mo1581b(View view) {
            return view.hasTransientState();
        }

        /* renamed from: c */
        public void mo1582c(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: d */
        public int mo1583d(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: e */
        public ViewParent mo1584e(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: f */
        public int mo1585f(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: g */
        public int mo1586g(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: h */
        public void mo1587h(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: i */
        public boolean mo1588i(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: j */
        public boolean mo1589j(View view) {
            return view.hasOverlappingRendering();
        }
    }

    /* renamed from: android.support.v4.i.q$c */
    static class C0391c extends C0390b {
        C0391c() {
        }

        /* renamed from: a */
        public void mo1590a(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        /* renamed from: k */
        public int mo1591k(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: l */
        public int mo1592l(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: m */
        public int mo1593m(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: n */
        public int mo1594n(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: o */
        public boolean mo1595o(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: p */
        public Display mo1596p(View view) {
            return view.getDisplay();
        }
    }

    /* renamed from: android.support.v4.i.q$d */
    static class C0392d extends C0391c {
        C0392d() {
        }
    }

    /* renamed from: android.support.v4.i.q$e */
    static class C0393e extends C0392d {
        C0393e() {
        }

        /* renamed from: a */
        public void mo1577a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        /* renamed from: q */
        public boolean mo1597q(View view) {
            return view.isLaidOut();
        }

        /* renamed from: r */
        public boolean mo1598r(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* renamed from: android.support.v4.i.q$f */
    static class C0394f extends C0393e {

        /* renamed from: d */
        private static ThreadLocal<Rect> f1020d;

        C0394f() {
        }

        /* renamed from: b */
        private static Rect m1704b() {
            if (f1020d == null) {
                f1020d = new ThreadLocal<>();
            }
            Rect rect = f1020d.get();
            if (rect == null) {
                rect = new Rect();
                f1020d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        /* renamed from: a */
        public C0416y mo1599a(View view, C0416y yVar) {
            WindowInsets windowInsets = (WindowInsets) C0416y.m1818a(yVar);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (onApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return C0416y.m1817a((Object) windowInsets);
        }

        /* renamed from: a */
        public void mo1600a(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: a */
        public void mo1601a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        /* renamed from: a */
        public void mo1602a(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        /* renamed from: a */
        public void mo1603a(View view, final C0386o oVar) {
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0416y.m1818a(oVar.mo277a(view, C0416y.m1817a((Object) windowInsets)));
                    }
                });
            }
        }

        /* renamed from: b */
        public C0416y mo1604b(View view, C0416y yVar) {
            WindowInsets windowInsets = (WindowInsets) C0416y.m1818a(yVar);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            if (dispatchApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(dispatchApplyWindowInsets);
            }
            return C0416y.m1817a((Object) windowInsets);
        }

        /* renamed from: b */
        public void mo1605b(View view, int i) {
            boolean z;
            Rect b = m1704b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo1605b(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: c */
        public void mo1606c(View view, int i) {
            boolean z;
            Rect b = m1704b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo1606c(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: h */
        public void mo1587h(View view) {
            view.requestApplyInsets();
        }

        /* renamed from: s */
        public String mo1607s(View view) {
            return view.getTransitionName();
        }

        /* renamed from: t */
        public float mo1608t(View view) {
            return view.getElevation();
        }

        /* renamed from: u */
        public float mo1609u(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: v */
        public boolean mo1610v(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: w */
        public void mo1611w(View view) {
            view.stopNestedScroll();
        }

        /* renamed from: x */
        public ColorStateList mo1612x(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: y */
        public PorterDuff.Mode mo1613y(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: z */
        public float mo1614z(View view) {
            return view.getZ();
        }
    }

    /* renamed from: android.support.v4.i.q$g */
    static class C0396g extends C0394f {
        C0396g() {
        }

        /* renamed from: a */
        public void mo1616a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        /* renamed from: b */
        public void mo1605b(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: c */
        public void mo1606c(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* renamed from: android.support.v4.i.q$h */
    static class C0397h extends C0396g {
        C0397h() {
        }
    }

    /* renamed from: android.support.v4.i.q$i */
    static class C0398i extends C0397h {
        C0398i() {
        }
    }

    /* renamed from: android.support.v4.i.q$j */
    static class C0399j {

        /* renamed from: b */
        static Field f1023b;

        /* renamed from: c */
        static boolean f1024c;

        /* renamed from: d */
        private static Field f1025d;

        /* renamed from: e */
        private static boolean f1026e;

        /* renamed from: f */
        private static Field f1027f;

        /* renamed from: g */
        private static boolean f1028g;

        /* renamed from: h */
        private static WeakHashMap<View, String> f1029h;

        /* renamed from: i */
        private static Method f1030i;

        /* renamed from: a */
        WeakHashMap<View, C0409u> f1031a = null;

        C0399j() {
        }

        /* renamed from: C */
        private static void m1725C(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        /* renamed from: A */
        public boolean mo1617A(View view) {
            if (f1024c) {
                return false;
            }
            if (f1023b == null) {
                try {
                    f1023b = View.class.getDeclaredField("mAccessibilityDelegate");
                    f1023b.setAccessible(true);
                } catch (Throwable unused) {
                    f1024c = true;
                    return false;
                }
            }
            try {
                return f1023b.get(view) != null;
            } catch (Throwable unused2) {
                f1024c = true;
                return false;
            }
        }

        /* renamed from: B */
        public C0409u mo1618B(View view) {
            if (this.f1031a == null) {
                this.f1031a = new WeakHashMap<>();
            }
            C0409u uVar = this.f1031a.get(view);
            if (uVar != null) {
                return uVar;
            }
            C0409u uVar2 = new C0409u(view);
            this.f1031a.put(view, uVar2);
            return uVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo1619a() {
            return ValueAnimator.getFrameDelay();
        }

        /* renamed from: a */
        public C0416y mo1599a(View view, C0416y yVar) {
            return yVar;
        }

        /* renamed from: a */
        public void mo1600a(View view, float f) {
        }

        /* renamed from: a */
        public void mo1577a(View view, int i) {
        }

        /* renamed from: a */
        public void mo1616a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo1590a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1601a(View view, ColorStateList colorStateList) {
            if (view instanceof C0387p) {
                ((C0387p) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo1602a(View view, PorterDuff.Mode mode) {
            if (view instanceof C0387p) {
                ((C0387p) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: a */
        public void mo1578a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public void mo1620a(View view, C0358b bVar) {
            view.setAccessibilityDelegate(bVar == null ? null : bVar.mo1504a());
        }

        /* renamed from: a */
        public void mo1603a(View view, C0386o oVar) {
        }

        /* renamed from: a */
        public void mo1579a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo1619a());
        }

        /* renamed from: a */
        public void mo1580a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo1619a() + j);
        }

        /* renamed from: a */
        public void mo1621a(ViewGroup viewGroup, boolean z) {
            if (f1030i == null) {
                Class<ViewGroup> cls = ViewGroup.class;
                try {
                    f1030i = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                    Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
                }
                f1030i.setAccessible(true);
            }
            try {
                f1030i.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
            }
        }

        /* renamed from: a */
        public boolean mo1576a(View view) {
            return false;
        }

        /* renamed from: b */
        public C0416y mo1604b(View view, C0416y yVar) {
            return yVar;
        }

        /* renamed from: b */
        public void mo1605b(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                m1725C(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    m1725C((View) parent);
                }
            }
        }

        /* renamed from: b */
        public boolean mo1581b(View view) {
            return false;
        }

        /* renamed from: c */
        public void mo1582c(View view) {
            view.postInvalidate();
        }

        /* renamed from: c */
        public void mo1606c(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                m1725C(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    m1725C((View) parent);
                }
            }
        }

        /* renamed from: d */
        public int mo1583d(View view) {
            return 0;
        }

        /* renamed from: e */
        public ViewParent mo1584e(View view) {
            return view.getParent();
        }

        /* renamed from: f */
        public int mo1585f(View view) {
            if (!f1026e) {
                try {
                    f1025d = View.class.getDeclaredField("mMinWidth");
                    f1025d.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1026e = true;
            }
            Field field = f1025d;
            if (field == null) {
                return 0;
            }
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }

        /* renamed from: g */
        public int mo1586g(View view) {
            if (!f1028g) {
                try {
                    f1027f = View.class.getDeclaredField("mMinHeight");
                    f1027f.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1028g = true;
            }
            Field field = f1027f;
            if (field == null) {
                return 0;
            }
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1587h(View view) {
        }

        /* renamed from: i */
        public boolean mo1588i(View view) {
            return false;
        }

        /* renamed from: j */
        public boolean mo1589j(View view) {
            return true;
        }

        /* renamed from: k */
        public int mo1591k(View view) {
            return 0;
        }

        /* renamed from: l */
        public int mo1592l(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: m */
        public int mo1593m(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: n */
        public int mo1594n(View view) {
            return 0;
        }

        /* renamed from: o */
        public boolean mo1595o(View view) {
            return false;
        }

        /* renamed from: p */
        public Display mo1596p(View view) {
            if (mo1598r(view)) {
                return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            }
            return null;
        }

        /* renamed from: q */
        public boolean mo1597q(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        /* renamed from: r */
        public boolean mo1598r(View view) {
            return view.getWindowToken() != null;
        }

        /* renamed from: s */
        public String mo1607s(View view) {
            WeakHashMap<View, String> weakHashMap = f1029h;
            if (weakHashMap == null) {
                return null;
            }
            return weakHashMap.get(view);
        }

        /* renamed from: t */
        public float mo1608t(View view) {
            return 0.0f;
        }

        /* renamed from: u */
        public float mo1609u(View view) {
            return 0.0f;
        }

        /* renamed from: v */
        public boolean mo1610v(View view) {
            if (view instanceof C0380i) {
                return ((C0380i) view).isNestedScrollingEnabled();
            }
            return false;
        }

        /* renamed from: w */
        public void mo1611w(View view) {
            if (view instanceof C0380i) {
                ((C0380i) view).stopNestedScroll();
            }
        }

        /* renamed from: x */
        public ColorStateList mo1612x(View view) {
            if (view instanceof C0387p) {
                return ((C0387p) view).getSupportBackgroundTintList();
            }
            return null;
        }

        /* renamed from: y */
        public PorterDuff.Mode mo1613y(View view) {
            if (view instanceof C0387p) {
                return ((C0387p) view).getSupportBackgroundTintMode();
            }
            return null;
        }

        /* renamed from: z */
        public float mo1614z(View view) {
            return mo1609u(view) + mo1608t(view);
        }
    }

    /* renamed from: A */
    public static Display m1636A(View view) {
        return f1019a.mo1596p(view);
    }

    /* renamed from: a */
    public static C0416y m1637a(View view, C0416y yVar) {
        return f1019a.mo1599a(view, yVar);
    }

    /* renamed from: a */
    public static void m1638a(View view, float f) {
        f1019a.mo1600a(view, f);
    }

    /* renamed from: a */
    public static void m1639a(View view, int i) {
        f1019a.mo1577a(view, i);
    }

    /* renamed from: a */
    public static void m1640a(View view, int i, int i2) {
        f1019a.mo1616a(view, i, i2);
    }

    /* renamed from: a */
    public static void m1641a(View view, int i, int i2, int i3, int i4) {
        f1019a.mo1590a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m1642a(View view, ColorStateList colorStateList) {
        f1019a.mo1601a(view, colorStateList);
    }

    /* renamed from: a */
    public static void m1643a(View view, PorterDuff.Mode mode) {
        f1019a.mo1602a(view, mode);
    }

    /* renamed from: a */
    public static void m1644a(View view, Drawable drawable) {
        f1019a.mo1578a(view, drawable);
    }

    /* renamed from: a */
    public static void m1645a(View view, C0358b bVar) {
        f1019a.mo1620a(view, bVar);
    }

    /* renamed from: a */
    public static void m1646a(View view, C0386o oVar) {
        f1019a.mo1603a(view, oVar);
    }

    /* renamed from: a */
    public static void m1647a(View view, Runnable runnable) {
        f1019a.mo1579a(view, runnable);
    }

    /* renamed from: a */
    public static void m1648a(View view, Runnable runnable, long j) {
        f1019a.mo1580a(view, runnable, j);
    }

    @Deprecated
    /* renamed from: a */
    public static void m1649a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static void m1650a(ViewGroup viewGroup, boolean z) {
        f1019a.mo1621a(viewGroup, z);
    }

    /* renamed from: a */
    public static boolean m1651a(View view) {
        return f1019a.mo1617A(view);
    }

    /* renamed from: b */
    public static C0416y m1652b(View view, C0416y yVar) {
        return f1019a.mo1604b(view, yVar);
    }

    /* renamed from: b */
    public static void m1653b(View view, int i) {
        f1019a.mo1606c(view, i);
    }

    /* renamed from: b */
    public static boolean m1654b(View view) {
        return f1019a.mo1581b(view);
    }

    /* renamed from: c */
    public static void m1655c(View view) {
        f1019a.mo1582c(view);
    }

    /* renamed from: c */
    public static void m1656c(View view, int i) {
        f1019a.mo1605b(view, i);
    }

    /* renamed from: d */
    public static int m1657d(View view) {
        return f1019a.mo1583d(view);
    }

    /* renamed from: e */
    public static int m1658e(View view) {
        return f1019a.mo1591k(view);
    }

    /* renamed from: f */
    public static ViewParent m1659f(View view) {
        return f1019a.mo1584e(view);
    }

    /* renamed from: g */
    public static int m1660g(View view) {
        return f1019a.mo1592l(view);
    }

    /* renamed from: h */
    public static int m1661h(View view) {
        return f1019a.mo1593m(view);
    }

    /* renamed from: i */
    public static int m1662i(View view) {
        return f1019a.mo1585f(view);
    }

    /* renamed from: j */
    public static int m1663j(View view) {
        return f1019a.mo1586g(view);
    }

    /* renamed from: k */
    public static C0409u m1664k(View view) {
        return f1019a.mo1618B(view);
    }

    /* renamed from: l */
    public static float m1665l(View view) {
        return f1019a.mo1608t(view);
    }

    /* renamed from: m */
    public static String m1666m(View view) {
        return f1019a.mo1607s(view);
    }

    /* renamed from: n */
    public static int m1667n(View view) {
        return f1019a.mo1594n(view);
    }

    /* renamed from: o */
    public static void m1668o(View view) {
        f1019a.mo1587h(view);
    }

    /* renamed from: p */
    public static boolean m1669p(View view) {
        return f1019a.mo1588i(view);
    }

    /* renamed from: q */
    public static boolean m1670q(View view) {
        return f1019a.mo1589j(view);
    }

    /* renamed from: r */
    public static boolean m1671r(View view) {
        return f1019a.mo1595o(view);
    }

    /* renamed from: s */
    public static ColorStateList m1672s(View view) {
        return f1019a.mo1612x(view);
    }

    /* renamed from: t */
    public static PorterDuff.Mode m1673t(View view) {
        return f1019a.mo1613y(view);
    }

    /* renamed from: u */
    public static boolean m1674u(View view) {
        return f1019a.mo1610v(view);
    }

    /* renamed from: v */
    public static void m1675v(View view) {
        f1019a.mo1611w(view);
    }

    /* renamed from: w */
    public static boolean m1676w(View view) {
        return f1019a.mo1597q(view);
    }

    /* renamed from: x */
    public static float m1677x(View view) {
        return f1019a.mo1614z(view);
    }

    /* renamed from: y */
    public static boolean m1678y(View view) {
        return f1019a.mo1598r(view);
    }

    /* renamed from: z */
    public static boolean m1679z(View view) {
        return f1019a.mo1576a(view);
    }
}
