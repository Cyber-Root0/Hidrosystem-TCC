package android.support.p020v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p017i.C0383l;
import android.support.p005v4.p017i.C0385n;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0669o;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0383l, C0737ae {

    /* renamed from: e */
    static final int[] f2054e = {C0526a.C0527a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f2055A = new Runnable() {
        public void run() {
            ActionBarOverlayLayout.this.mo2994d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2060c = actionBarOverlayLayout.f2058a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2061d);
        }
    };

    /* renamed from: B */
    private final Runnable f2056B = new Runnable() {
        public void run() {
            ActionBarOverlayLayout.this.mo2994d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2060c = actionBarOverlayLayout.f2058a.animate().translationY((float) (-ActionBarOverlayLayout.this.f2058a.getHeight())).setListener(ActionBarOverlayLayout.this.f2061d);
        }
    };

    /* renamed from: C */
    private final C0385n f2057C;

    /* renamed from: a */
    ActionBarContainer f2058a;

    /* renamed from: b */
    boolean f2059b;

    /* renamed from: c */
    ViewPropertyAnimator f2060c;

    /* renamed from: d */
    final AnimatorListenerAdapter f2061d = new AnimatorListenerAdapter() {
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2060c = null;
            actionBarOverlayLayout.f2059b = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2060c = null;
            actionBarOverlayLayout.f2059b = false;
        }
    };

    /* renamed from: f */
    private int f2062f;

    /* renamed from: g */
    private int f2063g = 0;

    /* renamed from: h */
    private ContentFrameLayout f2064h;

    /* renamed from: i */
    private C0738af f2065i;

    /* renamed from: j */
    private Drawable f2066j;

    /* renamed from: k */
    private boolean f2067k;

    /* renamed from: l */
    private boolean f2068l;

    /* renamed from: m */
    private boolean f2069m;

    /* renamed from: n */
    private boolean f2070n;

    /* renamed from: o */
    private int f2071o;

    /* renamed from: p */
    private int f2072p;

    /* renamed from: q */
    private final Rect f2073q = new Rect();

    /* renamed from: r */
    private final Rect f2074r = new Rect();

    /* renamed from: s */
    private final Rect f2075s = new Rect();

    /* renamed from: t */
    private final Rect f2076t = new Rect();

    /* renamed from: u */
    private final Rect f2077u = new Rect();

    /* renamed from: v */
    private final Rect f2078v = new Rect();

    /* renamed from: w */
    private final Rect f2079w = new Rect();

    /* renamed from: x */
    private C0685a f2080x;

    /* renamed from: y */
    private final int f2081y = 600;

    /* renamed from: z */
    private OverScroller f2082z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0685a {
        /* renamed from: b */
        void mo2418b(int i);

        /* renamed from: g */
        void mo2419g(boolean z);

        /* renamed from: j */
        void mo2424j();

        /* renamed from: k */
        void mo2426k();

        /* renamed from: l */
        void mo2427l();

        /* renamed from: m */
        void mo2428m();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0686b extends ViewGroup.MarginLayoutParams {
        public C0686b(int i, int i2) {
            super(i, i2);
        }

        public C0686b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0686b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3238a(context);
        this.f2057C = new C0385n(this);
    }

    /* renamed from: a */
    private C0738af m3237a(View view) {
        if (view instanceof C0738af) {
            return (C0738af) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m3238a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2054e);
        boolean z = false;
        this.f2062f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2066j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2066j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f2067k = z;
        this.f2082z = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m3239a(float f, float f2) {
        this.f2082z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2082z.getFinalY() > this.f2058a.getHeight();
    }

    /* renamed from: a */
    private boolean m3240a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0686b bVar = (C0686b) view.getLayoutParams();
        if (!z || bVar.leftMargin == rect.left) {
            z5 = false;
        } else {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: l */
    private void m3241l() {
        mo2994d();
        postDelayed(this.f2055A, 600);
    }

    /* renamed from: m */
    private void m3242m() {
        mo2994d();
        postDelayed(this.f2056B, 600);
    }

    /* renamed from: n */
    private void m3243n() {
        mo2994d();
        this.f2055A.run();
    }

    /* renamed from: o */
    private void m3244o() {
        mo2994d();
        this.f2056B.run();
    }

    /* renamed from: a */
    public C0686b generateLayoutParams(AttributeSet attributeSet) {
        return new C0686b(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo2988a(int i) {
        mo2992c();
        if (i == 2) {
            this.f2065i.mo3547f();
        } else if (i == 5) {
            this.f2065i.mo3548g();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo2989a(Menu menu, C0669o.C0670a aVar) {
        mo2992c();
        this.f2065i.mo3533a(menu, aVar);
    }

    /* renamed from: a */
    public boolean mo2990a() {
        return this.f2068l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0686b generateDefaultLayoutParams() {
        return new C0686b(-1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2992c() {
        if (this.f2064h == null) {
            this.f2064h = (ContentFrameLayout) findViewById(C0526a.C0532f.action_bar_activity_content);
            this.f2058a = (ActionBarContainer) findViewById(C0526a.C0532f.action_bar_container);
            this.f2065i = m3237a(findViewById(C0526a.C0532f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0686b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2994d() {
        removeCallbacks(this.f2055A);
        removeCallbacks(this.f2056B);
        ViewPropertyAnimator viewPropertyAnimator = this.f2060c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2066j != null && !this.f2067k) {
            int bottom = this.f2058a.getVisibility() == 0 ? (int) (((float) this.f2058a.getBottom()) + this.f2058a.getTranslationY() + 0.5f) : 0;
            this.f2066j.setBounds(0, bottom, getWidth(), this.f2066j.getIntrinsicHeight() + bottom);
            this.f2066j.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo2996e() {
        mo2992c();
        return this.f2065i.mo3549h();
    }

    /* renamed from: f */
    public boolean mo2997f() {
        mo2992c();
        return this.f2065i.mo3550i();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo2992c();
        int n = C0388q.m1667n(this) & 256;
        boolean a = m3240a(this.f2058a, rect, true, true, false, true);
        this.f2076t.set(rect);
        C0866bq.m4742a(this, this.f2076t, this.f2073q);
        if (!this.f2077u.equals(this.f2076t)) {
            this.f2077u.set(this.f2076t);
            a = true;
        }
        if (!this.f2074r.equals(this.f2073q)) {
            this.f2074r.set(this.f2073q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo2999g() {
        mo2992c();
        return this.f2065i.mo3551j();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0686b(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2058a;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f2057C.mo1567a();
    }

    public CharSequence getTitle() {
        mo2992c();
        return this.f2065i.mo3545e();
    }

    /* renamed from: h */
    public boolean mo3006h() {
        mo2992c();
        return this.f2065i.mo3552k();
    }

    /* renamed from: i */
    public boolean mo3007i() {
        mo2992c();
        return this.f2065i.mo3553l();
    }

    /* renamed from: j */
    public void mo3008j() {
        mo2992c();
        this.f2065i.mo3554m();
    }

    /* renamed from: k */
    public void mo3009k() {
        mo2992c();
        this.f2065i.mo3555n();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3238a(getContext());
        C0388q.m1668o(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2994d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0686b bVar = (C0686b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        Rect rect;
        mo2992c();
        measureChildWithMargins(this.f2058a, i, 0, i2, 0);
        C0686b bVar = (C0686b) this.f2058a.getLayoutParams();
        int max = Math.max(0, this.f2058a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f2058a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2058a.getMeasuredState());
        boolean z = (C0388q.m1667n(this) & 256) != 0;
        if (z) {
            i3 = this.f2062f;
            if (this.f2069m && this.f2058a.getTabContainer() != null) {
                i3 += this.f2062f;
            }
        } else {
            i3 = this.f2058a.getVisibility() != 8 ? this.f2058a.getMeasuredHeight() : 0;
        }
        this.f2075s.set(this.f2073q);
        this.f2078v.set(this.f2076t);
        if (this.f2068l || z) {
            this.f2078v.top += i3;
            rect = this.f2078v;
        } else {
            this.f2075s.top += i3;
            rect = this.f2075s;
        }
        rect.bottom += 0;
        m3240a(this.f2064h, this.f2075s, true, true, true, true);
        if (!this.f2079w.equals(this.f2078v)) {
            this.f2079w.set(this.f2078v);
            this.f2064h.mo3108a(this.f2078v);
        }
        measureChildWithMargins(this.f2064h, i, 0, i2, 0);
        C0686b bVar2 = (C0686b) this.f2064h.getLayoutParams();
        int max3 = Math.max(max, this.f2064h.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f2064h.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2064h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2070n || !z) {
            return false;
        }
        if (m3239a(f, f2)) {
            m3244o();
        } else {
            m3243n();
        }
        this.f2059b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2071o += i2;
        setActionBarHideOffset(this.f2071o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2057C.mo1570a(view, view2, i);
        this.f2071o = getActionBarHideOffset();
        mo2994d();
        C0685a aVar = this.f2080x;
        if (aVar != null) {
            aVar.mo2427l();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2058a.getVisibility() != 0) {
            return false;
        }
        return this.f2070n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f2070n && !this.f2059b) {
            if (this.f2071o <= this.f2058a.getHeight()) {
                m3241l();
            } else {
                m3242m();
            }
        }
        C0685a aVar = this.f2080x;
        if (aVar != null) {
            aVar.mo2428m();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo2992c();
        int i2 = this.f2072p ^ i;
        this.f2072p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0685a aVar = this.f2080x;
        if (aVar != null) {
            aVar.mo2419g(!z);
            if (z2 || !z) {
                this.f2080x.mo2424j();
            } else {
                this.f2080x.mo2426k();
            }
        }
        if ((i2 & 256) != 0 && this.f2080x != null) {
            C0388q.m1668o(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2063g = i;
        C0685a aVar = this.f2080x;
        if (aVar != null) {
            aVar.mo2418b(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo2994d();
        this.f2058a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2058a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0685a aVar) {
        this.f2080x = aVar;
        if (getWindowToken() != null) {
            this.f2080x.mo2418b(this.f2063g);
            int i = this.f2072p;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0388q.m1668o(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2069m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2070n) {
            this.f2070n = z;
            if (!z) {
                mo2994d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo2992c();
        this.f2065i.mo3529a(i);
    }

    public void setIcon(Drawable drawable) {
        mo2992c();
        this.f2065i.mo3530a(drawable);
    }

    public void setLogo(int i) {
        mo2992c();
        this.f2065i.mo3538b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2068l = z;
        this.f2067k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo2992c();
        this.f2065i.mo3534a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo2992c();
        this.f2065i.mo3535a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
