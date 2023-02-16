package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.design.C0045a;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p013e.C0271a;
import android.support.p005v4.p016h.C0309i;
import android.support.p005v4.p016h.C0314k;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0384m;
import android.support.p005v4.p017i.C0385n;
import android.support.p005v4.p017i.C0386o;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0416y;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0384m {

    /* renamed from: a */
    static final String f244a;

    /* renamed from: b */
    static final Class<?>[] f245b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<C0088a>>> f246c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f247d;

    /* renamed from: f */
    private static final C0314k.C0315a<Rect> f248f = new C0314k.C0317c(12);

    /* renamed from: e */
    ViewGroup.OnHierarchyChangeListener f249e;

    /* renamed from: g */
    private final List<View> f250g;

    /* renamed from: h */
    private final C0126d<View> f251h;

    /* renamed from: i */
    private final List<View> f252i;

    /* renamed from: j */
    private final List<View> f253j;

    /* renamed from: k */
    private final int[] f254k;

    /* renamed from: l */
    private Paint f255l;

    /* renamed from: m */
    private boolean f256m;

    /* renamed from: n */
    private boolean f257n;

    /* renamed from: o */
    private int[] f258o;

    /* renamed from: p */
    private View f259p;

    /* renamed from: q */
    private View f260q;

    /* renamed from: r */
    private C0092e f261r;

    /* renamed from: s */
    private boolean f262s;

    /* renamed from: t */
    private C0416y f263t;

    /* renamed from: u */
    private boolean f264u;

    /* renamed from: v */
    private Drawable f265v;

    /* renamed from: w */
    private C0386o f266w;

    /* renamed from: x */
    private final C0385n f267x;

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public static abstract class C0088a<V extends View> {
        public C0088a() {
        }

        public C0088a(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C0416y mo451a(CoordinatorLayout coordinatorLayout, V v, C0416y yVar) {
            return yVar;
        }

        /* renamed from: a */
        public void mo452a(C0091d dVar) {
        }

        /* renamed from: a */
        public void mo315a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo316a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo366c(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo453a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo317a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo453a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo356a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo318a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo356a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo324a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo325a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo454a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo345a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo358a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo346a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo359a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo455a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo360a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo326a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo360a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public Parcelable mo331b(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: b */
        public void mo456b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: b */
        public void mo457b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo456b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: b */
        public boolean mo364b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo349b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public int mo458c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: c */
        public void mo459c() {
        }

        @Deprecated
        /* renamed from: c */
        public void mo366c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public float mo460d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: d */
        public void mo461d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: e */
        public boolean mo462e(CoordinatorLayout coordinatorLayout, V v) {
            return mo460d(coordinatorLayout, v) > 0.0f;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public @interface C0089b {
        /* renamed from: a */
        Class<? extends C0088a> mo463a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    private class C0090c implements ViewGroup.OnHierarchyChangeListener {
        C0090c() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f249e != null) {
                CoordinatorLayout.this.f249e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo393a(2);
            if (CoordinatorLayout.this.f249e != null) {
                CoordinatorLayout.this.f249e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    public static class C0091d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0088a f270a;

        /* renamed from: b */
        boolean f271b = false;

        /* renamed from: c */
        public int f272c = 0;

        /* renamed from: d */
        public int f273d = 0;

        /* renamed from: e */
        public int f274e = -1;

        /* renamed from: f */
        int f275f = -1;

        /* renamed from: g */
        public int f276g = 0;

        /* renamed from: h */
        public int f277h = 0;

        /* renamed from: i */
        int f278i;

        /* renamed from: j */
        int f279j;

        /* renamed from: k */
        View f280k;

        /* renamed from: l */
        View f281l;

        /* renamed from: m */
        final Rect f282m = new Rect();

        /* renamed from: n */
        Object f283n;

        /* renamed from: o */
        private boolean f284o;

        /* renamed from: p */
        private boolean f285p;

        /* renamed from: q */
        private boolean f286q;

        /* renamed from: r */
        private boolean f287r;

        public C0091d(int i, int i2) {
            super(i, i2);
        }

        C0091d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.CoordinatorLayout_Layout);
            this.f272c = obtainStyledAttributes.getInteger(C0045a.C0054i.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f275f = obtainStyledAttributes.getResourceId(C0045a.C0054i.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f273d = obtainStyledAttributes.getInteger(C0045a.C0054i.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f274e = obtainStyledAttributes.getInteger(C0045a.C0054i.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f276g = obtainStyledAttributes.getInt(C0045a.C0054i.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f277h = obtainStyledAttributes.getInt(C0045a.C0054i.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f271b = obtainStyledAttributes.hasValue(C0045a.C0054i.CoordinatorLayout_Layout_layout_behavior);
            if (this.f271b) {
                this.f270a = CoordinatorLayout.m287a(context, attributeSet, obtainStyledAttributes.getString(C0045a.C0054i.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0088a aVar = this.f270a;
            if (aVar != null) {
                aVar.mo452a(this);
            }
        }

        public C0091d(C0091d dVar) {
            super(dVar);
        }

        public C0091d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0091d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        private void m366a(View view, CoordinatorLayout coordinatorLayout) {
            this.f280k = coordinatorLayout.findViewById(this.f275f);
            View view2 = this.f280k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f281l = view2;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f275f) + " to anchor view " + view);
            }
            this.f281l = null;
            this.f280k = null;
        }

        /* renamed from: a */
        private boolean m367a(View view, int i) {
            int a = C0370d.m1575a(((C0091d) view.getLayoutParams()).f276g, i);
            return a != 0 && (C0370d.m1575a(this.f277h, i) & a) == a;
        }

        /* renamed from: b */
        private boolean m368b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f280k.getId() != this.f275f) {
                return false;
            }
            View view2 = this.f280k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f281l = null;
                    this.f280k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f281l = view2;
            return true;
        }

        /* renamed from: a */
        public int mo466a() {
            return this.f275f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo467a(int i) {
            mo468a(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo468a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f285p = z;
                    return;
                case 1:
                    this.f286q = z;
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo469a(Rect rect) {
            this.f282m.set(rect);
        }

        /* renamed from: a */
        public void mo470a(C0088a aVar) {
            C0088a aVar2 = this.f270a;
            if (aVar2 != aVar) {
                if (aVar2 != null) {
                    aVar2.mo459c();
                }
                this.f270a = aVar;
                this.f283n = null;
                this.f271b = true;
                if (aVar != null) {
                    aVar.mo452a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo471a(boolean z) {
            this.f287r = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo472a(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f284o;
            if (z) {
                return true;
            }
            C0088a aVar = this.f270a;
            boolean e = (aVar != null ? aVar.mo462e(coordinatorLayout, view) : false) | z;
            this.f284o = e;
            return e;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f270a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo473a(android.support.design.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f281l
                if (r4 == r0) goto L_0x001b
                int r0 = android.support.p005v4.p017i.C0388q.m1658e(r2)
                boolean r0 = r1.m367a((android.view.View) r4, (int) r0)
                if (r0 != 0) goto L_0x001b
                android.support.design.widget.CoordinatorLayout$a r0 = r1.f270a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo346a((android.support.design.widget.CoordinatorLayout) r2, r3, (android.view.View) r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.C0091d.mo473a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* renamed from: b */
        public C0088a mo474b() {
            return this.f270a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public View mo475b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f275f == -1) {
                this.f281l = null;
                this.f280k = null;
                return null;
            }
            if (this.f280k == null || !m368b(view, coordinatorLayout)) {
                m366a(view, coordinatorLayout);
            }
            return this.f280k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo476b(int i) {
            switch (i) {
                case 0:
                    return this.f285p;
                case 1:
                    return this.f286q;
                default:
                    return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Rect mo477c() {
            return this.f282m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo478d() {
            return this.f280k == null && this.f275f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo479e() {
            if (this.f270a == null) {
                this.f284o = false;
            }
            return this.f284o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo480f() {
            this.f284o = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo481g() {
            return this.f287r;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo482h() {
            this.f287r = false;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    class C0092e implements ViewTreeObserver.OnPreDrawListener {
        C0092e() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo393a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    protected static class C0093f extends C0321a {
        public static final Parcelable.Creator<C0093f> CREATOR = new Parcelable.ClassLoaderCreator<C0093f>() {
            /* renamed from: a */
            public C0093f createFromParcel(Parcel parcel) {
                return new C0093f(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0093f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0093f(parcel, classLoader);
            }

            /* renamed from: a */
            public C0093f[] newArray(int i) {
                return new C0093f[i];
            }
        };

        /* renamed from: a */
        SparseArray<Parcelable> f289a;

        public C0093f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f289a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f289a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0093f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f289a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f289a.keyAt(i2);
                parcelableArr[i2] = this.f289a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$g */
    static class C0095g implements Comparator<View> {
        C0095g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float x = C0388q.m1677x(view);
            float x2 = C0388q.m1677x(view2);
            if (x > x2) {
                return -1;
            }
            return x < x2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r0 = android.support.design.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f244a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            android.support.design.widget.CoordinatorLayout$g r0 = new android.support.design.widget.CoordinatorLayout$g
            r0.<init>()
            f247d = r0
            goto L_0x0021
        L_0x001f:
            f247d = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f245b = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f246c = r0
            android.support.v4.h.k$c r0 = new android.support.v4.h.k$c
            r1 = 12
            r0.<init>(r1)
            f248f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f250g = new ArrayList();
        this.f251h = new C0126d<>();
        this.f252i = new ArrayList();
        this.f253j = new ArrayList();
        this.f254k = new int[2];
        this.f267x = new C0385n(this);
        C0149m.m588a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.CoordinatorLayout, i, C0045a.C0053h.Widget_Design_CoordinatorLayout);
        int resourceId = obtainStyledAttributes.getResourceId(C0045a.C0054i.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f258o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f258o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f258o;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f265v = obtainStyledAttributes.getDrawable(C0045a.C0054i.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m308h();
        super.setOnHierarchyChangeListener(new C0090c());
    }

    /* renamed from: a */
    static C0088a m287a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f244a)) {
            str = f244a + '.' + str;
        }
        try {
            Map map = f246c.get();
            if (map == null) {
                map = new HashMap();
                f246c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(f245b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0088a) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: a */
    private static void m288a(Rect rect) {
        rect.setEmpty();
        f248f.mo1368a(rect);
    }

    /* renamed from: a */
    private void m289a(C0091d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m290a(View view, int i, Rect rect, Rect rect2, C0091d dVar, int i2, int i3) {
        int a = C0370d.m1575a(m301e(dVar.f272c), i);
        int a2 = C0370d.m1575a(m298c(dVar.f273d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private void m291a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        if (C0388q.m1676w(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0091d dVar = (C0091d) view.getLayoutParams();
            C0088a b = dVar.mo474b();
            Rect e = m302e();
            Rect e2 = m302e();
            e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (b == null || !b.mo454a(this, view, e)) {
                e.set(e2);
            } else if (!e2.contains(e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e.toShortString() + " | Bounds:" + e2.toShortString());
            }
            m288a(e2);
            if (e.isEmpty()) {
                m288a(e);
                return;
            }
            int a = C0370d.m1575a(dVar.f277h, i);
            if ((a & 48) != 48 || (i3 = (e.top - dVar.topMargin) - dVar.f279j) >= rect.top) {
                z = false;
            } else {
                m306f(view, rect.top - i3);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - e.bottom) - dVar.bottomMargin) + dVar.f279j) < rect.bottom) {
                m306f(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                m306f(view, 0);
            }
            if ((a & 3) != 3 || (i2 = (e.left - dVar.leftMargin) - dVar.f278i) >= rect.left) {
                z2 = false;
            } else {
                m303e(view, rect.left - i2);
                z2 = true;
            }
            if ((a & 5) == 5 && (width = ((getWidth() - e.right) - dVar.rightMargin) + dVar.f278i) < rect.right) {
                m303e(view, width - rect.right);
                z2 = true;
            }
            if (!z2) {
                m303e(view, 0);
            }
            m288a(e);
        }
    }

    /* renamed from: a */
    private void m292a(View view, View view2, int i) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        Rect e = m302e();
        Rect e2 = m302e();
        try {
            mo399a(view2, e);
            mo398a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m288a(e);
            m288a(e2);
        }
    }

    /* renamed from: a */
    private void m293a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f247d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private boolean m294a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f252i;
        m293a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0091d dVar = (C0091d) view.getLayoutParams();
            C0088a b = dVar.mo474b();
            if ((z || z2) && actionMasked != 0) {
                if (b != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            b.mo358a(this, view, motionEvent3);
                            break;
                        case 1:
                            b.mo364b(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z && b != null) {
                    switch (i) {
                        case 0:
                            z = b.mo358a(this, view, motionEvent2);
                            break;
                        case 1:
                            z = b.mo364b(this, view, motionEvent2);
                            break;
                    }
                    if (z) {
                        this.f259p = view;
                    }
                }
                boolean e = dVar.mo479e();
                boolean a = dVar.mo472a(this, view);
                z2 = a && !e;
                if (a && !z2) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m295b(int i) {
        String str;
        StringBuilder sb;
        int[] iArr = this.f258o;
        if (iArr == null) {
            str = "CoordinatorLayout";
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            str = "CoordinatorLayout";
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(str, sb.toString());
        return 0;
    }

    /* renamed from: b */
    private C0416y m296b(C0416y yVar) {
        C0088a b;
        if (yVar.mo1654f()) {
            return yVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0388q.m1669p(childAt) && (b = ((C0091d) childAt.getLayoutParams()).mo474b()) != null) {
                yVar = b.mo451a(this, childAt, yVar);
                if (yVar.mo1654f()) {
                    break;
                }
            }
        }
        return yVar;
    }

    /* renamed from: b */
    private void m297b(View view, int i, int i2) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        int a = C0370d.m1575a(m299d(dVar.f272c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m295b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - dVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m298c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m299d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: d */
    private void m300d(View view, int i) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        Rect e = m302e();
        e.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.f263t != null && C0388q.m1669p(this) && !C0388q.m1669p(view)) {
            e.left += this.f263t.mo1647a();
            e.top += this.f263t.mo1649b();
            e.right -= this.f263t.mo1650c();
            e.bottom -= this.f263t.mo1651d();
        }
        Rect e2 = m302e();
        C0370d.m1576a(m298c(dVar.f272c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m288a(e);
        m288a(e2);
    }

    /* renamed from: e */
    private static int m301e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: e */
    private static Rect m302e() {
        Rect a = f248f.mo1367a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: e */
    private void m303e(View view, int i) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        if (dVar.f278i != i) {
            C0388q.m1656c(view, i - dVar.f278i);
            dVar.f278i = i;
        }
    }

    /* renamed from: e */
    private boolean m304e(View view) {
        return this.f251h.mo618e(view);
    }

    /* renamed from: f */
    private void m305f() {
        View view = this.f259p;
        if (view != null) {
            C0088a b = ((C0091d) view.getLayoutParams()).mo474b();
            if (b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                b.mo364b(this, this.f259p, obtain);
                obtain.recycle();
            }
            this.f259p = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C0091d) getChildAt(i).getLayoutParams()).mo480f();
        }
        this.f256m = false;
    }

    /* renamed from: f */
    private void m306f(View view, int i) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        if (dVar.f279j != i) {
            C0388q.m1653b(view, i - dVar.f279j);
            dVar.f279j = i;
        }
    }

    /* renamed from: g */
    private void m307g() {
        this.f250g.clear();
        this.f251h.mo611a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0091d a = mo389a(childAt);
            a.mo475b(this, childAt);
            this.f251h.mo612a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (a.mo473a(this, childAt, childAt2)) {
                        if (!this.f251h.mo615b(childAt2)) {
                            this.f251h.mo612a(childAt2);
                        }
                        this.f251h.mo613a(childAt2, childAt);
                    }
                }
            }
        }
        this.f250g.addAll(this.f251h.mo614b());
        Collections.reverse(this.f250g);
    }

    /* renamed from: h */
    private void m308h() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0388q.m1669p(this)) {
                if (this.f266w == null) {
                    this.f266w = new C0386o() {
                        /* renamed from: a */
                        public C0416y mo277a(View view, C0416y yVar) {
                            return CoordinatorLayout.this.mo391a(yVar);
                        }
                    };
                }
                C0388q.m1646a((View) this, this.f266w);
                setSystemUiVisibility(1280);
                return;
            }
            C0388q.m1646a((View) this, (C0386o) null);
        }
    }

    /* renamed from: a */
    public C0091d generateLayoutParams(AttributeSet attributeSet) {
        return new C0091d(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0091d mo389a(View view) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        if (!dVar.f271b) {
            C0089b bVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (C0089b) cls.getAnnotation(C0089b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    dVar.mo470a((C0088a) bVar.mo463a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.mo463a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            dVar.f271b = true;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0091d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0091d ? new C0091d((C0091d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0091d((ViewGroup.MarginLayoutParams) layoutParams) : new C0091d(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0416y mo391a(C0416y yVar) {
        if (C0309i.m1379a(this.f263t, yVar)) {
            return yVar;
        }
        this.f263t = yVar;
        boolean z = true;
        this.f264u = yVar != null && yVar.mo1649b() > 0;
        if (this.f264u || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0416y b = m296b(yVar);
        requestLayout();
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo392a() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m304e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f262s) {
            return;
        }
        if (z) {
            mo403b();
        } else {
            mo409c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo393a(int i) {
        boolean z;
        int i2 = i;
        int e = C0388q.m1658e(this);
        int size = this.f250g.size();
        Rect e2 = m302e();
        Rect e3 = m302e();
        Rect e4 = m302e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f250g.get(i3);
            C0091d dVar = (C0091d) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (dVar.f281l == this.f250g.get(i4)) {
                        mo405b(view, e);
                    }
                }
                mo400a(view, true, e3);
                if (dVar.f276g != 0 && !e3.isEmpty()) {
                    int a = C0370d.m1575a(dVar.f276g, e);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i5 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (i6 == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (dVar.f277h != 0 && view.getVisibility() == 0) {
                    m291a(view, e2, e);
                }
                if (i2 != 2) {
                    mo411c(view, e4);
                    if (!e4.equals(e3)) {
                        mo406b(view, e3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f250g.get(i7);
                    C0091d dVar2 = (C0091d) view2.getLayoutParams();
                    C0088a b = dVar2.mo474b();
                    if (b != null && b.mo346a(this, view2, view)) {
                        if (i2 != 0 || !dVar2.mo481g()) {
                            if (i2 != 2) {
                                z = b.mo349b(this, view2, view);
                            } else {
                                b.mo461d(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                dVar2.mo471a(z);
                            }
                        } else {
                            dVar2.mo482h();
                        }
                    }
                }
            }
        }
        m288a(e2);
        m288a(e3);
        m288a(e4);
    }

    /* renamed from: a */
    public void mo394a(View view, int i) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        if (dVar.mo478d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (dVar.f280k != null) {
            m292a(view, dVar.f280k, i);
        } else if (dVar.f274e >= 0) {
            m297b(view, dVar.f274e, i);
        } else {
            m300d(view, i);
        }
    }

    /* renamed from: a */
    public void mo395a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo396a(View view, int i, int i2, int i3, int i4, int i5) {
        C0088a b;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0091d dVar = (C0091d) childAt.getLayoutParams();
                if (dVar.mo476b(i5) && (b = dVar.mo474b()) != null) {
                    b.mo317a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo393a(1);
        }
    }

    /* renamed from: a */
    public void mo397a(View view, int i, int i2, int[] iArr, int i3) {
        C0088a b;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0091d dVar = (C0091d) childAt.getLayoutParams();
                if (dVar.mo476b(i3) && (b = dVar.mo474b()) != null) {
                    int[] iArr2 = this.f254k;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    b.mo318a(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, this.f254k[0]) : Math.min(i4, this.f254k[0]);
                    i5 = i2 > 0 ? Math.max(i5, this.f254k[1]) : Math.min(i5, this.f254k[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo393a(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo398a(View view, int i, Rect rect, Rect rect2) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m290a(view, i, rect, rect2, dVar, measuredWidth, measuredHeight);
        m289a(dVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo399a(View view, Rect rect) {
        C0150n.m591b(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo400a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo399a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean mo401a(View view, int i, int i2) {
        Rect e = m302e();
        mo399a(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m288a(e);
        }
    }

    /* renamed from: a */
    public boolean mo402a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0091d dVar = (C0091d) childAt.getLayoutParams();
                C0088a b = dVar.mo474b();
                if (b != null) {
                    boolean a = b.mo326a(this, childAt, view, view2, i, i2);
                    dVar.mo468a(i3, a);
                    z |= a;
                } else {
                    dVar.mo468a(i3, false);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo403b() {
        if (this.f257n) {
            if (this.f261r == null) {
                this.f261r = new C0092e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f261r);
        }
        this.f262s = true;
    }

    /* renamed from: b */
    public void mo404b(View view) {
        List c = this.f251h.mo616c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0088a b = ((C0091d) view2.getLayoutParams()).mo474b();
                if (b != null) {
                    b.mo349b(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo405b(View view, int i) {
        C0088a b;
        View view2 = view;
        C0091d dVar = (C0091d) view.getLayoutParams();
        if (dVar.f280k != null) {
            Rect e = m302e();
            Rect e2 = m302e();
            Rect e3 = m302e();
            mo399a(dVar.f280k, e);
            boolean z = false;
            mo400a(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m290a(view, i, e, e3, dVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m289a(dVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C0388q.m1656c(view2, i3);
            }
            if (i4 != 0) {
                C0388q.m1653b(view2, i4);
            }
            if (z && (b = dVar.mo474b()) != null) {
                b.mo349b(this, view2, dVar.f280k);
            }
            m288a(e);
            m288a(e2);
            m288a(e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo406b(View view, Rect rect) {
        ((C0091d) view.getLayoutParams()).mo469a(rect);
    }

    /* renamed from: b */
    public void mo407b(View view, View view2, int i, int i2) {
        C0088a b;
        this.f267x.mo1571a(view, view2, i, i2);
        this.f260q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0091d dVar = (C0091d) childAt.getLayoutParams();
            if (dVar.mo476b(i2) && (b = dVar.mo474b()) != null) {
                b.mo457b(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: c */
    public List<View> mo408c(View view) {
        List<View> d = this.f251h.mo617d(view);
        this.f253j.clear();
        if (d != null) {
            this.f253j.addAll(d);
        }
        return this.f253j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo409c() {
        if (this.f257n && this.f261r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f261r);
        }
        this.f262s = false;
    }

    /* renamed from: c */
    public void mo410c(View view, int i) {
        this.f267x.mo1569a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0091d dVar = (C0091d) childAt.getLayoutParams();
            if (dVar.mo476b(i)) {
                C0088a b = dVar.mo474b();
                if (b != null) {
                    b.mo316a(this, childAt, view, i);
                }
                dVar.mo467a(i);
                dVar.mo482h();
            }
        }
        this.f260q = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo411c(View view, Rect rect) {
        rect.set(((C0091d) view.getLayoutParams()).mo477c());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0091d) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0091d generateDefaultLayoutParams() {
        return new C0091d(-2, -2);
    }

    /* renamed from: d */
    public List<View> mo414d(View view) {
        List c = this.f251h.mo616c(view);
        this.f253j.clear();
        if (c != null) {
            this.f253j.addAll(c);
        }
        return this.f253j;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0091d dVar = (C0091d) view.getLayoutParams();
        if (dVar.f270a != null) {
            float d = dVar.f270a.mo460d(this, view);
            if (d > 0.0f) {
                if (this.f255l == null) {
                    this.f255l = new Paint();
                }
                this.f255l.setColor(dVar.f270a.mo458c(this, view));
                this.f255l.setAlpha(C0271a.m1254a(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f255l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f265v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m307g();
        return Collections.unmodifiableList(this.f250g);
    }

    /* access modifiers changed from: package-private */
    public final C0416y getLastWindowInsets() {
        return this.f263t;
    }

    public int getNestedScrollAxes() {
        return this.f267x.mo1567a();
    }

    public Drawable getStatusBarBackground() {
        return this.f265v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m305f();
        if (this.f262s) {
            if (this.f261r == null) {
                this.f261r = new C0092e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f261r);
        }
        if (this.f263t == null && C0388q.m1669p(this)) {
            C0388q.m1668o(this);
        }
        this.f257n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m305f();
        if (this.f262s && this.f261r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f261r);
        }
        View view = this.f260q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f257n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f264u && this.f265v != null) {
            C0416y yVar = this.f263t;
            int b = yVar != null ? yVar.mo1649b() : 0;
            if (b > 0) {
                this.f265v.setBounds(0, 0, getWidth(), b);
                this.f265v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m305f();
        }
        boolean a = m294a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m305f();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0088a b;
        int e = C0388q.m1658e(this);
        int size = this.f250g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f250g.get(i5);
            if (view.getVisibility() != 8 && ((b = ((C0091d) view.getLayoutParams()).mo474b()) == null || !b.mo324a(this, view, e))) {
                mo394a(view, e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        if (r0.mo325a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m307g()
            r30.mo392a()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = android.support.p005v4.p017i.C0388q.m1658e(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            android.support.v4.i.y r3 = r7.f263t
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p005v4.p017i.C0388q.m1669p(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f250g
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016e
            java.util.List<android.view.View> r0 = r7.f250g
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0168
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            android.support.design.widget.CoordinatorLayout$d r1 = (android.support.design.widget.CoordinatorLayout.C0091d) r1
            int r0 = r1.f274e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r1.f274e
            int r0 = r7.m295b((int) r0)
            int r11 = r1.f272c
            int r11 = m299d((int) r11)
            int r11 = android.support.p005v4.p017i.C0370d.m1575a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = android.support.p005v4.p017i.C0388q.m1669p(r20)
            if (r0 != 0) goto L_0x00f1
            android.support.v4.i.y r0 = r7.f263t
            int r0 = r0.mo1647a()
            android.support.v4.i.y r2 = r7.f263t
            int r2 = r2.mo1650c()
            int r0 = r0 + r2
            android.support.v4.i.y r2 = r7.f263t
            int r2 = r2.mo1649b()
            android.support.v4.i.y r11 = r7.f263t
            int r11 = r11.mo1651d()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            android.support.design.widget.CoordinatorLayout$a r0 = r1.mo474b()
            if (r0 == 0) goto L_0x011c
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo325a((android.support.design.widget.CoordinatorLayout) r1, r2, (int) r3, (int) r4, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0135
            goto L_0x0128
        L_0x011c:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0128:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo395a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
        L_0x0135:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0168:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016e:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0088a b;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0091d dVar = (C0091d) childAt.getLayoutParams();
                if (dVar.mo476b(0) && (b = dVar.mo474b()) != null) {
                    z2 |= b.mo455a(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo393a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0088a b;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0091d dVar = (C0091d) childAt.getLayoutParams();
                if (dVar.mo476b(0) && (b = dVar.mo474b()) != null) {
                    z |= b.mo359a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo397a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo396a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo407b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0093f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0093f fVar = (C0093f) parcelable;
        super.onRestoreInstanceState(fVar.mo1402a());
        SparseArray<Parcelable> sparseArray = fVar.f289a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0088a b = mo389a(childAt).mo474b();
            if (!(id == -1 || b == null || (parcelable2 = sparseArray.get(id)) == null)) {
                b.mo315a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable b;
        C0093f fVar = new C0093f(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0088a b2 = ((C0091d) childAt.getLayoutParams()).mo474b();
            if (!(id == -1 || b2 == null || (b = b2.mo331b(this, childAt)) == null)) {
                sparseArray.append(id, b);
            }
        }
        fVar.f289a = sparseArray;
        return fVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo402a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo410c(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            int r0 = r15.getActionMasked()
            android.view.View r1 = r14.f259p
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0011
            boolean r1 = r14.m294a((android.view.MotionEvent) r15, (int) r2)
            if (r1 == 0) goto L_0x0026
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            android.view.View r4 = r14.f259p
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r4 = (android.support.design.widget.CoordinatorLayout.C0091d) r4
            android.support.design.widget.CoordinatorLayout$a r4 = r4.mo474b()
            if (r4 == 0) goto L_0x0026
            android.view.View r3 = r14.f259p
            boolean r3 = r4.mo364b((android.support.design.widget.CoordinatorLayout) r14, r3, (android.view.MotionEvent) r15)
        L_0x0026:
            android.view.View r4 = r14.f259p
            r5 = 0
            if (r4 != 0) goto L_0x0031
            boolean r15 = super.onTouchEvent(r15)
            r3 = r3 | r15
            goto L_0x0043
        L_0x0031:
            if (r1 == 0) goto L_0x0043
            long r8 = android.os.SystemClock.uptimeMillis()
            r10 = 3
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r8
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
            super.onTouchEvent(r5)
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            r5.recycle()
        L_0x0048:
            if (r0 == r2) goto L_0x004d
            r15 = 3
            if (r0 != r15) goto L_0x0050
        L_0x004d:
            r14.m305f()
        L_0x0050:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0088a b = ((C0091d) view.getLayoutParams()).mo474b();
        if (b == null || !b.mo345a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f256m) {
            m305f();
            this.f256m = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m308h();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f249e = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f265v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f265v = drawable3;
            Drawable drawable4 = this.f265v;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f265v.setState(getDrawableState());
                }
                C0240a.m1130b(this.f265v, C0388q.m1658e(this));
                this.f265v.setVisible(getVisibility() == 0, false);
                this.f265v.setCallback(this);
            }
            C0388q.m1655c(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0227a.m1070a(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f265v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f265v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f265v;
    }
}
