package android.support.p005v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p017i.C0380i;
import android.support.p005v4.p017i.C0382k;
import android.support.p005v4.p017i.C0383l;
import android.support.p005v4.p017i.C0385n;
import android.support.p005v4.p017i.C0388q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements C0380i, C0383l {

    /* renamed from: D */
    private static final int[] f1216D = {16842766};

    /* renamed from: m */
    private static final String f1217m = "SwipeRefreshLayout";

    /* renamed from: A */
    private int f1218A = -1;

    /* renamed from: B */
    private boolean f1219B;

    /* renamed from: C */
    private final DecelerateInterpolator f1220C;

    /* renamed from: E */
    private int f1221E = -1;

    /* renamed from: F */
    private Animation f1222F;

    /* renamed from: G */
    private Animation f1223G;

    /* renamed from: H */
    private Animation f1224H;

    /* renamed from: I */
    private Animation f1225I;

    /* renamed from: J */
    private Animation f1226J;

    /* renamed from: K */
    private int f1227K;

    /* renamed from: L */
    private C0478a f1228L;

    /* renamed from: M */
    private Animation.AnimationListener f1229M = new Animation.AnimationListener() {
        public void onAnimationEnd(Animation animation) {
            if (SwipeRefreshLayout.this.f1233b) {
                SwipeRefreshLayout.this.f1241j.setAlpha(255);
                SwipeRefreshLayout.this.f1241j.start();
                if (SwipeRefreshLayout.this.f1242k && SwipeRefreshLayout.this.f1232a != null) {
                    SwipeRefreshLayout.this.f1232a.mo2046a();
                }
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                swipeRefreshLayout.f1234c = swipeRefreshLayout.f1236e.getTop();
                return;
            }
            SwipeRefreshLayout.this.mo1996a();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    };

    /* renamed from: N */
    private final Animation f1230N = new Animation() {
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((SwipeRefreshLayout.this.f1237f + ((int) (((float) ((!SwipeRefreshLayout.this.f1243l ? SwipeRefreshLayout.this.f1240i - Math.abs(SwipeRefreshLayout.this.f1239h) : SwipeRefreshLayout.this.f1240i) - SwipeRefreshLayout.this.f1237f)) * f))) - SwipeRefreshLayout.this.f1236e.getTop());
            SwipeRefreshLayout.this.f1241j.mo2087b(1.0f - f);
        }
    };

    /* renamed from: O */
    private final Animation f1231O = new Animation() {
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo1997a(f);
        }
    };

    /* renamed from: a */
    C0479b f1232a;

    /* renamed from: b */
    boolean f1233b = false;

    /* renamed from: c */
    int f1234c;

    /* renamed from: d */
    boolean f1235d;

    /* renamed from: e */
    C0483b f1236e;

    /* renamed from: f */
    protected int f1237f;

    /* renamed from: g */
    float f1238g;

    /* renamed from: h */
    protected int f1239h;

    /* renamed from: i */
    int f1240i;

    /* renamed from: j */
    C0485c f1241j;

    /* renamed from: k */
    boolean f1242k;

    /* renamed from: l */
    boolean f1243l;

    /* renamed from: n */
    private View f1244n;

    /* renamed from: o */
    private int f1245o;

    /* renamed from: p */
    private float f1246p = -1.0f;

    /* renamed from: q */
    private float f1247q;

    /* renamed from: r */
    private final C0385n f1248r;

    /* renamed from: s */
    private final C0382k f1249s;

    /* renamed from: t */
    private final int[] f1250t = new int[2];

    /* renamed from: u */
    private final int[] f1251u = new int[2];

    /* renamed from: v */
    private boolean f1252v;

    /* renamed from: w */
    private int f1253w;

    /* renamed from: x */
    private float f1254x;

    /* renamed from: y */
    private float f1255y;

    /* renamed from: z */
    private boolean f1256z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C0478a {
        /* renamed from: a */
        boolean mo2045a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C0479b {
        /* renamed from: a */
        void mo2046a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1245o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1253w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1220C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1227K = (int) (displayMetrics.density * 40.0f);
        m2213d();
        C0388q.m1650a((ViewGroup) this, true);
        this.f1240i = (int) (displayMetrics.density * 64.0f);
        this.f1246p = (float) this.f1240i;
        this.f1248r = new C0385n(this);
        this.f1249s = new C0382k(this);
        setNestedScrollingEnabled(true);
        int i = -this.f1227K;
        this.f1234c = i;
        this.f1239h = i;
        mo1997a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1216D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m2203a(final int i, final int i2) {
        C04734 r0 = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C0485c cVar = SwipeRefreshLayout.this.f1241j;
                int i = i;
                cVar.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f1236e.mo2075a((Animation.AnimationListener) null);
        this.f1236e.clearAnimation();
        this.f1236e.startAnimation(r0);
        return r0;
    }

    /* renamed from: a */
    private void m2204a(int i, Animation.AnimationListener animationListener) {
        this.f1237f = i;
        this.f1230N.reset();
        this.f1230N.setDuration(200);
        this.f1230N.setInterpolator(this.f1220C);
        if (animationListener != null) {
            this.f1236e.mo2075a(animationListener);
        }
        this.f1236e.clearAnimation();
        this.f1236e.startAnimation(this.f1230N);
    }

    /* renamed from: a */
    private void m2205a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1218A) {
            this.f1218A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m2206a(boolean z, boolean z2) {
        if (this.f1233b != z) {
            this.f1242k = z2;
            m2217g();
            this.f1233b = z;
            if (this.f1233b) {
                m2204a(this.f1234c, this.f1229M);
            } else {
                mo1998a(this.f1229M);
            }
        }
    }

    /* renamed from: a */
    private boolean m2207a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: b */
    private void m2208b(float f) {
        this.f1241j.mo2085a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1246p));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1246p;
        float f2 = (float) (this.f1243l ? this.f1240i - this.f1239h : this.f1240i);
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i = this.f1239h + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f1236e.getVisibility() != 0) {
            this.f1236e.setVisibility(0);
        }
        if (!this.f1235d) {
            this.f1236e.setScaleX(1.0f);
            this.f1236e.setScaleY(1.0f);
        }
        if (this.f1235d) {
            setAnimationProgress(Math.min(1.0f, f / this.f1246p));
        }
        if (f < this.f1246p) {
            if (this.f1241j.getAlpha() > 76 && !m2207a(this.f1224H)) {
                m2215e();
            }
        } else if (this.f1241j.getAlpha() < 255 && !m2207a(this.f1225I)) {
            m2216f();
        }
        this.f1241j.mo2083a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f1241j.mo2087b(Math.min(1.0f, max));
        this.f1241j.mo2088c((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i - this.f1234c);
    }

    /* renamed from: b */
    private void m2209b(int i, Animation.AnimationListener animationListener) {
        if (this.f1235d) {
            m2212c(i, animationListener);
            return;
        }
        this.f1237f = i;
        this.f1231O.reset();
        this.f1231O.setDuration(200);
        this.f1231O.setInterpolator(this.f1220C);
        if (animationListener != null) {
            this.f1236e.mo2075a(animationListener);
        }
        this.f1236e.clearAnimation();
        this.f1236e.startAnimation(this.f1231O);
    }

    /* renamed from: b */
    private void m2210b(Animation.AnimationListener animationListener) {
        this.f1236e.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f1241j.setAlpha(255);
        }
        this.f1222F = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f1222F.setDuration((long) this.f1253w);
        if (animationListener != null) {
            this.f1236e.mo2075a(animationListener);
        }
        this.f1236e.clearAnimation();
        this.f1236e.startAnimation(this.f1222F);
    }

    /* renamed from: c */
    private void m2211c(float f) {
        if (f > this.f1246p) {
            m2206a(true, true);
            return;
        }
        this.f1233b = false;
        this.f1241j.mo2083a(0.0f, 0.0f);
        C04745 r0 = null;
        if (!this.f1235d) {
            r0 = new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f1235d) {
                        SwipeRefreshLayout.this.mo1998a((Animation.AnimationListener) null);
                    }
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
        }
        m2209b(this.f1234c, r0);
        this.f1241j.mo2085a(false);
    }

    /* renamed from: c */
    private void m2212c(int i, Animation.AnimationListener animationListener) {
        this.f1237f = i;
        this.f1238g = this.f1236e.getScaleX();
        this.f1226J = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f1238g + ((-SwipeRefreshLayout.this.f1238g) * f));
                SwipeRefreshLayout.this.mo1997a(f);
            }
        };
        this.f1226J.setDuration(150);
        if (animationListener != null) {
            this.f1236e.mo2075a(animationListener);
        }
        this.f1236e.clearAnimation();
        this.f1236e.startAnimation(this.f1226J);
    }

    /* renamed from: d */
    private void m2213d() {
        this.f1236e = new C0483b(getContext(), -328966);
        this.f1241j = new C0485c(getContext());
        this.f1241j.mo2084a(1);
        this.f1236e.setImageDrawable(this.f1241j);
        this.f1236e.setVisibility(8);
        addView(this.f1236e);
    }

    /* renamed from: d */
    private void m2214d(float f) {
        float f2 = this.f1255y;
        int i = this.f1245o;
        if (f - f2 > ((float) i) && !this.f1256z) {
            this.f1254x = f2 + ((float) i);
            this.f1256z = true;
            this.f1241j.setAlpha(76);
        }
    }

    /* renamed from: e */
    private void m2215e() {
        this.f1224H = m2203a(this.f1241j.getAlpha(), 76);
    }

    /* renamed from: f */
    private void m2216f() {
        this.f1225I = m2203a(this.f1241j.getAlpha(), 255);
    }

    /* renamed from: g */
    private void m2217g() {
        if (this.f1244n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1236e)) {
                    this.f1244n = childAt;
                    return;
                }
            }
        }
    }

    private void setColorViewAlpha(int i) {
        this.f1236e.getBackground().setAlpha(i);
        this.f1241j.setAlpha(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1996a() {
        this.f1236e.clearAnimation();
        this.f1241j.stop();
        this.f1236e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f1235d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1239h - this.f1234c);
        }
        this.f1234c = this.f1236e.getTop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1997a(float f) {
        int i = this.f1237f;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f1239h - i)) * f))) - this.f1236e.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1998a(Animation.AnimationListener animationListener) {
        this.f1223G = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f1223G.setDuration(150);
        this.f1236e.mo2075a(animationListener);
        this.f1236e.clearAnimation();
        this.f1236e.startAnimation(this.f1223G);
    }

    /* renamed from: b */
    public boolean mo1999b() {
        return this.f1233b;
    }

    /* renamed from: c */
    public boolean mo2000c() {
        C0478a aVar = this.f1228L;
        if (aVar != null) {
            return aVar.mo2045a(this, this.f1244n);
        }
        View view = this.f1244n;
        return view instanceof ListView ? C0506j.m2356b((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1249s.mo1556a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1249s.mo1555a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1249s.mo1561a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1249s.mo1559a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1221E;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f1248r.mo1567a();
    }

    public int getProgressCircleDiameter() {
        return this.f1227K;
    }

    public int getProgressViewEndOffset() {
        return this.f1240i;
    }

    public int getProgressViewStartOffset() {
        return this.f1239h;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1249s.mo1563b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1249s.mo1554a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1996a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2217g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1219B && actionMasked == 0) {
            this.f1219B = false;
        }
        if (!isEnabled() || this.f1219B || mo2000c() || this.f1233b || this.f1252v) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    setTargetOffsetTopAndBottom(this.f1239h - this.f1236e.getTop());
                    this.f1218A = motionEvent.getPointerId(0);
                    this.f1256z = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1218A);
                    if (findPointerIndex >= 0) {
                        this.f1255y = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f1256z = false;
                    this.f1218A = -1;
                    break;
                case 2:
                    int i = this.f1218A;
                    if (i != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(i);
                        if (findPointerIndex2 >= 0) {
                            m2214d(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        Log.e(f1217m, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
            }
        } else {
            m2205a(motionEvent);
        }
        return this.f1256z;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1244n == null) {
                m2217g();
            }
            View view = this.f1244n;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f1236e.getMeasuredWidth();
                int measuredHeight2 = this.f1236e.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f1234c;
                this.f1236e.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1244n == null) {
            m2217g();
        }
        View view = this.f1244n;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f1236e.measure(View.MeasureSpec.makeMeasureSpec(this.f1227K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1227K, 1073741824));
            this.f1221E = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f1236e) {
                    this.f1221E = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1247q;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1247q = 0.0f;
                } else {
                    this.f1247q = f - f2;
                    iArr[1] = i2;
                }
                m2208b(this.f1247q);
            }
        }
        if (this.f1243l && i2 > 0 && this.f1247q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1236e.setVisibility(8);
        }
        int[] iArr2 = this.f1250t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1251u);
        int i5 = i4 + this.f1251u[1];
        if (i5 < 0 && !mo2000c()) {
            this.f1247q += (float) Math.abs(i5);
            m2208b(this.f1247q);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1248r.mo1570a(view, view2, i);
        startNestedScroll(i & 2);
        this.f1247q = 0.0f;
        this.f1252v = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f1219B && !this.f1233b && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1248r.mo1568a(view);
        this.f1252v = false;
        float f = this.f1247q;
        if (f > 0.0f) {
            m2211c(f);
            this.f1247q = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1219B && actionMasked == 0) {
            this.f1219B = false;
        }
        if (!isEnabled() || this.f1219B || mo2000c() || this.f1233b || this.f1252v) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.f1218A = motionEvent.getPointerId(0);
                this.f1256z = false;
                return true;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1218A);
                if (findPointerIndex < 0) {
                    Log.e(f1217m, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f1256z) {
                    this.f1256z = false;
                    m2211c((motionEvent.getY(findPointerIndex) - this.f1254x) * 0.5f);
                }
                this.f1218A = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f1218A);
                if (findPointerIndex2 < 0) {
                    Log.e(f1217m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y = motionEvent.getY(findPointerIndex2);
                m2214d(y);
                if (!this.f1256z) {
                    return true;
                }
                float f = (y - this.f1254x) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m2208b(f);
                return true;
            case 3:
                return false;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f1217m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f1218A = motionEvent.getPointerId(actionIndex);
                return true;
            case 6:
                m2205a(motionEvent);
                return true;
            default:
                return true;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f1244n instanceof AbsListView)) {
            View view = this.f1244n;
            if (view == null || C0388q.m1674u(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f1236e.setScaleX(f);
        this.f1236e.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m2217g();
        this.f1241j.mo2086a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0227a.m1073c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1246p = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo1996a();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1249s.mo1553a(z);
    }

    public void setOnChildScrollUpCallback(C0478a aVar) {
        this.f1228L = aVar;
    }

    public void setOnRefreshListener(C0479b bVar) {
        this.f1232a = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1236e.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0227a.m1073c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1233b == z) {
            m2206a(z, false);
            return;
        }
        this.f1233b = z;
        setTargetOffsetTopAndBottom((!this.f1243l ? this.f1240i + this.f1239h : this.f1240i) - this.f1234c);
        this.f1242k = false;
        m2210b(this.f1229M);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1227K = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1236e.setImageDrawable((Drawable) null);
            this.f1241j.mo2084a(i);
            this.f1236e.setImageDrawable(this.f1241j);
        }
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1236e.bringToFront();
        C0388q.m1653b((View) this.f1236e, i);
        this.f1234c = this.f1236e.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f1249s.mo1564b(i);
    }

    public void stopNestedScroll() {
        this.f1249s.mo1565c();
    }
}
