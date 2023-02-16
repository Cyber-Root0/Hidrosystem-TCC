package android.support.p005v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p017i.C0358b;
import android.support.p005v4.p017i.C0381j;
import android.support.p005v4.p017i.C0382k;
import android.support.p005v4.p017i.C0383l;
import android.support.p005v4.p017i.C0385n;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p005v4.p017i.p018a.C0354f;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0381j, C0383l {

    /* renamed from: w */
    private static final C0466a f1187w = new C0466a();

    /* renamed from: x */
    private static final int[] f1188x = {16843130};

    /* renamed from: A */
    private float f1189A;

    /* renamed from: B */
    private C0467b f1190B;

    /* renamed from: a */
    private long f1191a;

    /* renamed from: b */
    private final Rect f1192b;

    /* renamed from: c */
    private OverScroller f1193c;

    /* renamed from: d */
    private EdgeEffect f1194d;

    /* renamed from: e */
    private EdgeEffect f1195e;

    /* renamed from: f */
    private int f1196f;

    /* renamed from: g */
    private boolean f1197g;

    /* renamed from: h */
    private boolean f1198h;

    /* renamed from: i */
    private View f1199i;

    /* renamed from: j */
    private boolean f1200j;

    /* renamed from: k */
    private VelocityTracker f1201k;

    /* renamed from: l */
    private boolean f1202l;

    /* renamed from: m */
    private boolean f1203m;

    /* renamed from: n */
    private int f1204n;

    /* renamed from: o */
    private int f1205o;

    /* renamed from: p */
    private int f1206p;

    /* renamed from: q */
    private int f1207q;

    /* renamed from: r */
    private final int[] f1208r;

    /* renamed from: s */
    private final int[] f1209s;

    /* renamed from: t */
    private int f1210t;

    /* renamed from: u */
    private int f1211u;

    /* renamed from: v */
    private C0468c f1212v;

    /* renamed from: y */
    private final C0385n f1213y;

    /* renamed from: z */
    private final C0382k f1214z;

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0466a extends C0358b {
        C0466a() {
        }

        /* renamed from: a */
        public void mo199a(View view, C0328b bVar) {
            int scrollRange;
            super.mo199a(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.mo1423b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.mo1448k(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.mo1413a(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.mo1413a(4096);
                }
            }
        }

        /* renamed from: a */
        public void mo387a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo387a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0354f.m1540a(accessibilityEvent, nestedScrollView.getScrollX());
            C0354f.m1541b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public boolean mo1506a(View view, int i, Bundle bundle) {
            if (super.mo1506a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo1938c(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo1938c(0, max);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0467b {
        /* renamed from: a */
        void mo1987a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    static class C0468c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0468c> CREATOR = new Parcelable.Creator<C0468c>() {
            /* renamed from: a */
            public C0468c createFromParcel(Parcel parcel) {
                return new C0468c(parcel);
            }

            /* renamed from: a */
            public C0468c[] newArray(int i) {
                return new C0468c[i];
            }
        };

        /* renamed from: a */
        public int f1215a;

        C0468c(Parcel parcel) {
            super(parcel);
            this.f1215a = parcel.readInt();
        }

        C0468c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1215a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1215a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1192b = new Rect();
        this.f1197g = true;
        this.f1198h = false;
        this.f1199i = null;
        this.f1200j = false;
        this.f1203m = true;
        this.f1207q = -1;
        this.f1208r = new int[2];
        this.f1209s = new int[2];
        m2164a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1188x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1213y = new C0385n(this);
        this.f1214z = new C0382k(this);
        setNestedScrollingEnabled(true);
        C0388q.m1645a((View) this, (C0358b) f1187w);
    }

    /* renamed from: a */
    private View m2163a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m2164a() {
        this.f1193c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1204n = viewConfiguration.getScaledTouchSlop();
        this.f1205o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1206p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private void m2165a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1207q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1196f = (int) motionEvent.getY(i);
            this.f1207q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1201k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m2166a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m2163a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2180g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m2167a(Rect rect, boolean z) {
        int a = mo1925a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo1936b(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m2168a(View view) {
        return !m2169a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2169a(View view, int i, int i2) {
        view.getDrawingRect(this.f1192b);
        offsetDescendantRectToMyCoords(view, this.f1192b);
        return this.f1192b.bottom + i >= getScrollY() && this.f1192b.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m2170a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m2170a((View) parent, view2);
    }

    /* renamed from: b */
    private static int m2171b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: b */
    private void m2172b(View view) {
        view.getDrawingRect(this.f1192b);
        offsetDescendantRectToMyCoords(view, this.f1192b);
        int a = mo1925a(this.f1192b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m2173b() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    /* renamed from: c */
    private void m2174c() {
        VelocityTracker velocityTracker = this.f1201k;
        if (velocityTracker == null) {
            this.f1201k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private void m2175d() {
        if (this.f1201k == null) {
            this.f1201k = VelocityTracker.obtain();
        }
    }

    /* renamed from: d */
    private boolean m2176d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m2177e() {
        VelocityTracker velocityTracker = this.f1201k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1201k = null;
        }
    }

    /* renamed from: f */
    private void m2178f() {
        this.f1200j = false;
        m2177e();
        mo1926a(0);
        EdgeEffect edgeEffect = this.f1194d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1195e.onRelease();
        }
    }

    /* renamed from: g */
    private void m2179g() {
        if (getOverScrollMode() == 2) {
            this.f1194d = null;
            this.f1195e = null;
        } else if (this.f1194d == null) {
            Context context = getContext();
            this.f1194d = new EdgeEffect(context);
            this.f1195e = new EdgeEffect(context);
        }
    }

    /* renamed from: g */
    private void m2180g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1203m) {
            mo1936b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1189A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1189A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1189A;
    }

    /* renamed from: h */
    private void m2181h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            mo1955f(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1925a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: a */
    public void mo1926a(int i) {
        this.f1214z.mo1566c(i);
    }

    /* renamed from: a */
    public boolean mo1927a(int i, int i2) {
        return this.f1214z.mo1558a(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1928a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.mo1937b((int) r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f1193c
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.widget.NestedScrollView.mo1928a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo1929a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1214z.mo1560a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo1930a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1214z.mo1562a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean mo1931a(KeyEvent keyEvent) {
        this.f1192b.setEmpty();
        int i = 130;
        if (!m2173b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 62) {
                switch (keyCode) {
                    case 19:
                        return !keyEvent.isAltPressed() ? mo1954e(33) : mo1947d(33);
                    case 20:
                        return !keyEvent.isAltPressed() ? mo1954e(130) : mo1947d(130);
                    default:
                        return false;
                }
            } else {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo1939c(i);
                return false;
            }
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void mo1936b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1191a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f1193c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, max)) - scrollY);
                C0388q.m1655c(this);
            } else {
                if (!this.f1193c.isFinished()) {
                    this.f1193c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1191a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    public boolean mo1937b(int i) {
        return this.f1214z.mo1557a(i);
    }

    /* renamed from: c */
    public final void mo1938c(int i, int i2) {
        mo1936b(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: c */
    public boolean mo1939c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1192b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f1192b.top + height > childAt.getBottom()) {
                    this.f1192b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f1192b.top = getScrollY() - height;
            if (this.f1192b.top < 0) {
                this.f1192b.top = 0;
            }
        }
        Rect rect = this.f1192b;
        rect.bottom = rect.top + height;
        return m2166a(i, this.f1192b.top, this.f1192b.bottom);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1193c.computeScrollOffset()) {
            this.f1193c.getCurrX();
            int currY = this.f1193c.getCurrY();
            int i = currY - this.f1211u;
            if (mo1930a(0, i, this.f1209s, (int[]) null, 1)) {
                i -= this.f1209s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                mo1928a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!mo1929a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m2179g();
                        if (currY <= 0 && i3 > 0) {
                            edgeEffect = this.f1194d;
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            edgeEffect = this.f1195e;
                        }
                        edgeEffect.onAbsorb((int) this.f1193c.getCurrVelocity());
                    }
                }
            }
            this.f1211u = currY;
            C0388q.m1655c(this);
            return;
        }
        if (mo1937b(1)) {
            mo1926a(1);
        }
        this.f1211u = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean mo1947d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1192b;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f1192b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.f1192b;
            rect2.top = rect2.bottom - height;
        }
        return m2166a(i, this.f1192b.top, this.f1192b.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo1931a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1214z.mo1556a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1214z.mo1555a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1214z.mo1561a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1214z.mo1559a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1194d != null) {
            int scrollY = getScrollY();
            if (!this.f1194d.isFinished()) {
                int save = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f1194d.setSize(width, getHeight());
                if (this.f1194d.draw(canvas)) {
                    C0388q.m1655c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1195e.isFinished()) {
                int save2 = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width2) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + height));
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1195e.setSize(width2, height);
                if (this.f1195e.draw(canvas)) {
                    C0388q.m1655c(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1954e(int i) {
        int bottom;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2169a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2180g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1192b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1192b);
            m2180g(mo1925a(this.f1192b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2168a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: f */
    public void mo1955f(int i) {
        if (getChildCount() > 0) {
            mo1927a(2, 1);
            this.f1193c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1211u = getScrollY();
            C0388q.m1655c(this);
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1213y.mo1567a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1214z.mo1563b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1214z.mo1554a();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1198h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1200j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1200j) {
            return true;
        }
        int i = action & 255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int y = (int) motionEvent.getY();
                    if (m2176d((int) motionEvent.getX(), y)) {
                        this.f1196f = y;
                        this.f1207q = motionEvent.getPointerId(0);
                        m2174c();
                        this.f1201k.addMovement(motionEvent);
                        this.f1193c.computeScrollOffset();
                        this.f1200j = !this.f1193c.isFinished();
                        mo1927a(2, 0);
                        break;
                    } else {
                        this.f1200j = false;
                        m2177e();
                        break;
                    }
                case 1:
                case 3:
                    this.f1200j = false;
                    this.f1207q = -1;
                    m2177e();
                    if (this.f1193c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0388q.m1655c(this);
                    }
                    mo1926a(0);
                    break;
                case 2:
                    int i2 = this.f1207q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex != -1) {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1196f) > this.f1204n && (2 & getNestedScrollAxes()) == 0) {
                                this.f1200j = true;
                                this.f1196f = y2;
                                m2175d();
                                this.f1201k.addMovement(motionEvent);
                                this.f1210t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        } else {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                            break;
                        }
                    }
                    break;
            }
        } else {
            m2165a(motionEvent);
        }
        return this.f1200j;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1197g = false;
        View view = this.f1199i;
        if (view != null && m2170a(view, (View) this)) {
            m2172b(this.f1199i);
        }
        this.f1199i = null;
        if (!this.f1198h) {
            if (this.f1212v != null) {
                scrollTo(getScrollX(), this.f1212v.f1215a);
                this.f1212v = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1198h = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1202l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2181h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, (int[]) null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1213y.mo1570a(view, view2, i);
        startNestedScroll(2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m2168a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0468c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0468c cVar = (C0468c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1212v = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0468c cVar = new C0468c(super.onSaveInstanceState());
        cVar.f1215a = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0467b bVar = this.f1190B;
        if (bVar != null) {
            bVar.mo1987a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2169a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1192b);
            offsetDescendantRectToMyCoords(findFocus, this.f1192b);
            m2180g(mo1925a(this.f1192b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1213y.mo1568a(view);
        stopNestedScroll();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r10.f1193c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        android.support.p005v4.p017i.C0388q.m1655c(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020b, code lost:
        if (r10.f1193c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m2175d()
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r24)
            int r0 = r24.getActionMasked()
            r13 = 0
            if (r0 != 0) goto L_0x0014
            r10.f1210t = r13
        L_0x0014:
            int r1 = r10.f1210t
            float r1 = (float) r1
            r14 = 0
            r12.offsetLocation(r14, r1)
            r1 = -1
            r15 = 1
            switch(r0) {
                case 0: goto L_0x020f;
                case 1: goto L_0x01d7;
                case 2: goto L_0x0072;
                case 3: goto L_0x0047;
                case 4: goto L_0x0020;
                case 5: goto L_0x0034;
                case 6: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0248
        L_0x0022:
            r23.m2165a((android.view.MotionEvent) r24)
            int r0 = r10.f1207q
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f1196f = r0
            goto L_0x0248
        L_0x0034:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f1196f = r1
            int r0 = r11.getPointerId(r0)
            r10.f1207q = r0
            goto L_0x0248
        L_0x0047:
            boolean r0 = r10.f1200j
            if (r0 == 0) goto L_0x006b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x006b
            android.widget.OverScroller r2 = r10.f1193c
            int r3 = r23.getScrollX()
            int r4 = r23.getScrollY()
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r23.getScrollRange()
            boolean r0 = r2.springBack(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x006b
        L_0x0068:
            android.support.p005v4.p017i.C0388q.m1655c(r23)
        L_0x006b:
            r10.f1207q = r1
            r23.m2178f()
            goto L_0x0248
        L_0x0072:
            int r0 = r10.f1207q
            int r9 = r11.findPointerIndex(r0)
            if (r9 != r1) goto L_0x0099
            java.lang.String r0 = "NestedScrollView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid pointerId="
            r1.append(r2)
            int r2 = r10.f1207q
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            goto L_0x0248
        L_0x0099:
            float r0 = r11.getY(r9)
            int r6 = (int) r0
            int r0 = r10.f1196f
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.f1209s
            int[] r4 = r10.f1208r
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo1930a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c7
            int[] r0 = r10.f1209s
            r0 = r0[r15]
            int r7 = r7 - r0
            int[] r0 = r10.f1208r
            r0 = r0[r15]
            float r0 = (float) r0
            r12.offsetLocation(r14, r0)
            int r0 = r10.f1210t
            int[] r1 = r10.f1208r
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1210t = r0
        L_0x00c7:
            boolean r0 = r10.f1200j
            if (r0 != 0) goto L_0x00e7
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.f1204n
            if (r0 <= r1) goto L_0x00e7
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x00dc
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x00dc:
            r10.f1200j = r15
            if (r7 <= 0) goto L_0x00e4
            int r0 = r10.f1204n
            int r7 = r7 - r0
            goto L_0x00e7
        L_0x00e4:
            int r0 = r10.f1204n
            int r7 = r7 + r0
        L_0x00e7:
            r8 = r7
            boolean r0 = r10.f1200j
            if (r0 == 0) goto L_0x0248
            int[] r0 = r10.f1208r
            r0 = r0[r15]
            int r6 = r6 - r0
            r10.f1196f = r6
            int r16 = r23.getScrollY()
            int r7 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0109
            if (r0 != r15) goto L_0x0106
            if (r7 <= 0) goto L_0x0106
            goto L_0x0109
        L_0x0106:
            r17 = 0
            goto L_0x010b
        L_0x0109:
            r17 = 1
        L_0x010b:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r0 = r23
            r2 = r8
            r6 = r7
            r21 = r7
            r7 = r18
            r14 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            boolean r0 = r0.mo1928a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0138
            boolean r0 = r10.mo1937b((int) r13)
            if (r0 != 0) goto L_0x0138
            android.view.VelocityTracker r0 = r10.f1201k
            r0.clear()
        L_0x0138:
            int r0 = r23.getScrollY()
            int r2 = r0 - r16
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r10.f1208r
            r6 = 0
            r0 = r23
            boolean r0 = r0.mo1929a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0168
            int r0 = r10.f1196f
            int[] r1 = r10.f1208r
            r2 = r1[r15]
            int r0 = r0 - r2
            r10.f1196f = r0
            r0 = r1[r15]
            float r0 = (float) r0
            r1 = 0
            r12.offsetLocation(r1, r0)
            int r0 = r10.f1210t
            int[] r1 = r10.f1208r
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1210t = r0
            goto L_0x0248
        L_0x0168:
            if (r17 == 0) goto L_0x0248
            r23.m2179g()
            int r0 = r16 + r14
            if (r0 >= 0) goto L_0x0197
            android.widget.EdgeEffect r0 = r10.f1194d
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r22
            float r2 = r11.getX(r2)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.support.p005v4.widget.C0498g.m2333a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f1195e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f1195e
        L_0x0193:
            r0.onRelease()
            goto L_0x01c1
        L_0x0197:
            r1 = r21
            r2 = r22
            if (r0 <= r1) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f1195e
            float r1 = (float) r14
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r11.getX(r2)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r3 = r3 - r2
            android.support.p005v4.widget.C0498g.m2333a(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.f1194d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f1194d
            goto L_0x0193
        L_0x01c1:
            android.widget.EdgeEffect r0 = r10.f1194d
            if (r0 == 0) goto L_0x0248
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01d3
            android.widget.EdgeEffect r0 = r10.f1195e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0248
        L_0x01d3:
            android.support.p005v4.p017i.C0388q.m1655c(r23)
            goto L_0x0248
        L_0x01d7:
            android.view.VelocityTracker r0 = r10.f1201k
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r10.f1206p
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r10.f1207q
            float r0 = r0.getYVelocity(r2)
            int r0 = (int) r0
            int r2 = java.lang.Math.abs(r0)
            int r3 = r10.f1205o
            if (r2 <= r3) goto L_0x01f6
            int r0 = -r0
            r10.m2181h(r0)
            goto L_0x006b
        L_0x01f6:
            android.widget.OverScroller r2 = r10.f1193c
            int r3 = r23.getScrollX()
            int r4 = r23.getScrollY()
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r23.getScrollRange()
            boolean r0 = r2.springBack(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x006b
            goto L_0x0068
        L_0x020f:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0216
            return r13
        L_0x0216:
            android.widget.OverScroller r0 = r10.f1193c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r15
            r10.f1200j = r0
            if (r0 == 0) goto L_0x022a
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x022a
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x022a:
            android.widget.OverScroller r0 = r10.f1193c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0237
            android.widget.OverScroller r0 = r10.f1193c
            r0.abortAnimation()
        L_0x0237:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f1196f = r0
            int r0 = r11.getPointerId(r13)
            r10.f1207q = r0
            r0 = 2
            r10.mo1927a((int) r0, (int) r13)
        L_0x0248:
            android.view.VelocityTracker r0 = r10.f1201k
            if (r0 == 0) goto L_0x024f
            r0.addMovement(r12)
        L_0x024f:
            r12.recycle()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1197g) {
            m2172b(view2);
        } else {
            this.f1199i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2167a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2177e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1197g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = m2171b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = m2171b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1202l) {
            this.f1202l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1214z.mo1553a(z);
    }

    public void setOnScrollChangeListener(C0467b bVar) {
        this.f1190B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1203m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f1214z.mo1564b(i);
    }

    public void stopNestedScroll() {
        this.f1214z.mo1565c();
    }
}
