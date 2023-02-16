package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p005v4.p014f.C0279c;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0358b;
import android.support.p005v4.p017i.C0379h;
import android.support.p005v4.p017i.C0381j;
import android.support.p005v4.p017i.C0382k;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0400r;
import android.support.p005v4.p017i.p018a.C0324a;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p020v7.p026d.C0621a;
import android.support.p020v7.widget.C0734ad;
import android.support.p020v7.widget.C0762am;
import android.support.p020v7.widget.C0860bo;
import android.support.p020v7.widget.C0863bp;
import android.support.p020v7.widget.C0884f;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.av */
public class C0787av extends ViewGroup implements C0381j {

    /* renamed from: H */
    static final Interpolator f2602H = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: I */
    private static final int[] f2603I = {16843830};

    /* renamed from: J */
    private static final int[] f2604J = {16842987};
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static final boolean f2605K = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: L */
    private static final boolean f2606L = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: M */
    private static final boolean f2607M = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: N */
    private static final Class<?>[] f2608N = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a */
    static final boolean f2609a = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);

    /* renamed from: b */
    static final boolean f2610b = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: c */
    static final boolean f2611c = (Build.VERSION.SDK_INT >= 16);

    /* renamed from: A */
    C0762am.C0764a f2612A;

    /* renamed from: B */
    final C0823t f2613B;

    /* renamed from: C */
    boolean f2614C;

    /* renamed from: D */
    boolean f2615D;

    /* renamed from: E */
    boolean f2616E;

    /* renamed from: F */
    C0827aw f2617F;

    /* renamed from: G */
    final List<C0826w> f2618G;

    /* renamed from: O */
    private final C0818q f2619O;

    /* renamed from: P */
    private C0819r f2620P;

    /* renamed from: Q */
    private final Rect f2621Q;

    /* renamed from: R */
    private final ArrayList<C0812l> f2622R;

    /* renamed from: S */
    private C0812l f2623S;

    /* renamed from: T */
    private int f2624T;

    /* renamed from: U */
    private boolean f2625U;

    /* renamed from: V */
    private int f2626V;

    /* renamed from: W */
    private final AccessibilityManager f2627W;

    /* renamed from: aA */
    private C0382k f2628aA;

    /* renamed from: aB */
    private final int[] f2629aB;
    /* access modifiers changed from: private */

    /* renamed from: aC */
    public final int[] f2630aC;

    /* renamed from: aD */
    private final int[] f2631aD;

    /* renamed from: aE */
    private Runnable f2632aE;

    /* renamed from: aF */
    private final C0863bp.C0865b f2633aF;

    /* renamed from: aa */
    private List<C0810j> f2634aa;

    /* renamed from: ab */
    private int f2635ab;

    /* renamed from: ac */
    private int f2636ac;

    /* renamed from: ad */
    private EdgeEffect f2637ad;

    /* renamed from: ae */
    private EdgeEffect f2638ae;

    /* renamed from: af */
    private EdgeEffect f2639af;

    /* renamed from: ag */
    private EdgeEffect f2640ag;

    /* renamed from: ah */
    private int f2641ah;

    /* renamed from: ai */
    private int f2642ai;

    /* renamed from: aj */
    private VelocityTracker f2643aj;

    /* renamed from: ak */
    private int f2644ak;

    /* renamed from: al */
    private int f2645al;

    /* renamed from: am */
    private int f2646am;

    /* renamed from: an */
    private int f2647an;

    /* renamed from: ao */
    private int f2648ao;

    /* renamed from: ap */
    private C0811k f2649ap;

    /* renamed from: aq */
    private final int f2650aq;

    /* renamed from: ar */
    private final int f2651ar;

    /* renamed from: as */
    private float f2652as;

    /* renamed from: at */
    private float f2653at;

    /* renamed from: au */
    private boolean f2654au;

    /* renamed from: av */
    private C0813m f2655av;

    /* renamed from: aw */
    private List<C0813m> f2656aw;

    /* renamed from: ax */
    private C0798e.C0800b f2657ax;

    /* renamed from: ay */
    private C0797d f2658ay;

    /* renamed from: az */
    private final int[] f2659az;

    /* renamed from: d */
    final C0816o f2660d;

    /* renamed from: e */
    C0884f f2661e;

    /* renamed from: f */
    C0734ad f2662f;

    /* renamed from: g */
    final C0863bp f2663g;

    /* renamed from: h */
    boolean f2664h;

    /* renamed from: i */
    final Runnable f2665i;

    /* renamed from: j */
    final Rect f2666j;

    /* renamed from: k */
    final RectF f2667k;

    /* renamed from: l */
    C0794a f2668l;

    /* renamed from: m */
    C0804h f2669m;

    /* renamed from: n */
    C0817p f2670n;

    /* renamed from: o */
    final ArrayList<C0803g> f2671o;

    /* renamed from: p */
    boolean f2672p;

    /* renamed from: q */
    boolean f2673q;

    /* renamed from: r */
    boolean f2674r;

    /* renamed from: s */
    boolean f2675s;

    /* renamed from: t */
    boolean f2676t;

    /* renamed from: u */
    boolean f2677u;

    /* renamed from: v */
    boolean f2678v;

    /* renamed from: w */
    boolean f2679w;

    /* renamed from: x */
    C0798e f2680x;

    /* renamed from: y */
    final C0825v f2681y;

    /* renamed from: z */
    C0762am f2682z;

    /* renamed from: android.support.v7.widget.av$a */
    public static abstract class C0794a<VH extends C0826w> {

        /* renamed from: a */
        private final C0795b f2688a = new C0795b();

        /* renamed from: b */
        private boolean f2689b = false;

        /* renamed from: a */
        public abstract int mo247a();

        /* renamed from: a */
        public long mo248a(int i) {
            return -1;
        }

        /* renamed from: a */
        public void mo3923a(C0796c cVar) {
            this.f2688a.registerObserver(cVar);
        }

        /* renamed from: a */
        public void mo254a(VH vh) {
        }

        /* renamed from: a */
        public abstract void mo255a(VH vh, int i);

        /* renamed from: a */
        public void mo3924a(VH vh, int i, List<Object> list) {
            mo255a(vh, i);
        }

        /* renamed from: a */
        public void mo3925a(C0787av avVar) {
        }

        /* renamed from: b */
        public int mo257b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo258b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public void mo3926b(C0796c cVar) {
            this.f2688a.unregisterObserver(cVar);
        }

        /* renamed from: b */
        public final void mo3927b(VH vh, int i) {
            vh.f2787c = i;
            if (mo3933d()) {
                vh.f2789e = mo248a(i);
            }
            vh.mo4149a(1, 519);
            C0279c.m1263a("RV OnBindView");
            mo3924a(vh, i, vh.mo4177u());
            vh.mo4175t();
            ViewGroup.LayoutParams layoutParams = vh.f2785a.getLayoutParams();
            if (layoutParams instanceof C0809i) {
                ((C0809i) layoutParams).f2727e = true;
            }
            C0279c.m1262a();
        }

        /* renamed from: b */
        public void mo3928b(C0787av avVar) {
        }

        /* renamed from: b */
        public boolean mo3929b(VH vh) {
            return false;
        }

        /* renamed from: c */
        public final VH mo3930c(ViewGroup viewGroup, int i) {
            C0279c.m1263a("RV CreateView");
            VH b = mo258b(viewGroup, i);
            b.f2790f = i;
            C0279c.m1262a();
            return b;
        }

        /* renamed from: c */
        public void mo3931c(VH vh) {
        }

        /* renamed from: d */
        public void mo3932d(VH vh) {
        }

        /* renamed from: d */
        public final boolean mo3933d() {
            return this.f2689b;
        }

        /* renamed from: e */
        public final void mo3934e() {
            this.f2688a.mo3935a();
        }
    }

    /* renamed from: android.support.v7.widget.av$b */
    static class C0795b extends Observable<C0796c> {
        C0795b() {
        }

        /* renamed from: a */
        public void mo3935a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0796c) this.mObservers.get(size)).mo3936a();
            }
        }
    }

    /* renamed from: android.support.v7.widget.av$c */
    public static abstract class C0796c {
        /* renamed from: a */
        public void mo3936a() {
        }
    }

    /* renamed from: android.support.v7.widget.av$d */
    public interface C0797d {
        /* renamed from: a */
        int mo3937a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.av$e */
    public static abstract class C0798e {

        /* renamed from: a */
        private C0800b f2690a = null;

        /* renamed from: b */
        private ArrayList<C0799a> f2691b = new ArrayList<>();

        /* renamed from: c */
        private long f2692c = 120;

        /* renamed from: d */
        private long f2693d = 120;

        /* renamed from: e */
        private long f2694e = 250;

        /* renamed from: f */
        private long f2695f = 250;

        /* renamed from: android.support.v7.widget.av$e$a */
        public interface C0799a {
            /* renamed from: a */
            void mo3954a();
        }

        /* renamed from: android.support.v7.widget.av$e$b */
        interface C0800b {
            /* renamed from: a */
            void mo3955a(C0826w wVar);
        }

        /* renamed from: android.support.v7.widget.av$e$c */
        public static class C0801c {

            /* renamed from: a */
            public int f2696a;

            /* renamed from: b */
            public int f2697b;

            /* renamed from: c */
            public int f2698c;

            /* renamed from: d */
            public int f2699d;

            /* renamed from: a */
            public C0801c mo3956a(C0826w wVar) {
                return mo3957a(wVar, 0);
            }

            /* renamed from: a */
            public C0801c mo3957a(C0826w wVar, int i) {
                View view = wVar.f2785a;
                this.f2696a = view.getLeft();
                this.f2697b = view.getTop();
                this.f2698c = view.getRight();
                this.f2699d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m4205e(C0826w wVar) {
            int d = wVar.f2798n & 14;
            if (wVar.mo4169n()) {
                return 4;
            }
            if ((d & 4) != 0) {
                return d;
            }
            int f = wVar.mo4161f();
            int e = wVar.mo4160e();
            return (f == -1 || e == -1 || f == e) ? d : d | 2048;
        }

        /* renamed from: a */
        public C0801c mo3938a(C0823t tVar, C0826w wVar) {
            return mo3953j().mo3956a(wVar);
        }

        /* renamed from: a */
        public C0801c mo3939a(C0823t tVar, C0826w wVar, int i, List<Object> list) {
            return mo3953j().mo3956a(wVar);
        }

        /* renamed from: a */
        public abstract void mo3559a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3940a(C0800b bVar) {
            this.f2690a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo3941a(C0826w wVar, C0801c cVar, C0801c cVar2);

        /* renamed from: a */
        public abstract boolean mo3942a(C0826w wVar, C0826w wVar2, C0801c cVar, C0801c cVar2);

        /* renamed from: a */
        public boolean mo3565a(C0826w wVar, List<Object> list) {
            return mo3951h(wVar);
        }

        /* renamed from: b */
        public abstract boolean mo3567b();

        /* renamed from: b */
        public abstract boolean mo3943b(C0826w wVar, C0801c cVar, C0801c cVar2);

        /* renamed from: c */
        public abstract boolean mo3944c(C0826w wVar, C0801c cVar, C0801c cVar2);

        /* renamed from: d */
        public abstract void mo3571d();

        /* renamed from: d */
        public abstract void mo3572d(C0826w wVar);

        /* renamed from: e */
        public long mo3945e() {
            return this.f2694e;
        }

        /* renamed from: f */
        public long mo3946f() {
            return this.f2692c;
        }

        /* renamed from: f */
        public final void mo3947f(C0826w wVar) {
            mo3949g(wVar);
            C0800b bVar = this.f2690a;
            if (bVar != null) {
                bVar.mo3955a(wVar);
            }
        }

        /* renamed from: g */
        public long mo3948g() {
            return this.f2693d;
        }

        /* renamed from: g */
        public void mo3949g(C0826w wVar) {
        }

        /* renamed from: h */
        public long mo3950h() {
            return this.f2695f;
        }

        /* renamed from: h */
        public boolean mo3951h(C0826w wVar) {
            return true;
        }

        /* renamed from: i */
        public final void mo3952i() {
            int size = this.f2691b.size();
            for (int i = 0; i < size; i++) {
                this.f2691b.get(i).mo3954a();
            }
            this.f2691b.clear();
        }

        /* renamed from: j */
        public C0801c mo3953j() {
            return new C0801c();
        }
    }

    /* renamed from: android.support.v7.widget.av$f */
    private class C0802f implements C0798e.C0800b {
        C0802f() {
        }

        /* renamed from: a */
        public void mo3955a(C0826w wVar) {
            wVar.mo4154a(true);
            if (wVar.f2792h != null && wVar.f2793i == null) {
                wVar.f2792h = null;
            }
            wVar.f2793i = null;
            if (!wVar.m4506z() && !C0787av.this.mo3774a(wVar.f2785a) && wVar.mo4173r()) {
                C0787av.this.removeDetachedView(wVar.f2785a, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.av$g */
    public static abstract class C0803g {
        @Deprecated
        /* renamed from: a */
        public void mo3958a(Canvas canvas, C0787av avVar) {
        }

        /* renamed from: a */
        public void mo3599a(Canvas canvas, C0787av avVar, C0823t tVar) {
            mo3961b(canvas, avVar);
        }

        @Deprecated
        /* renamed from: a */
        public void mo3959a(Rect rect, int i, C0787av avVar) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo3960a(Rect rect, View view, C0787av avVar, C0823t tVar) {
            mo3959a(rect, ((C0809i) view.getLayoutParams()).mo4059f(), avVar);
        }

        @Deprecated
        /* renamed from: b */
        public void mo3961b(Canvas canvas, C0787av avVar) {
        }

        /* renamed from: b */
        public void mo3962b(Canvas canvas, C0787av avVar, C0823t tVar) {
            mo3958a(canvas, avVar);
        }
    }

    /* renamed from: android.support.v7.widget.av$h */
    public static abstract class C0804h {

        /* renamed from: a */
        private final C0860bo.C0862b f2701a = new C0860bo.C0862b() {
            /* renamed from: a */
            public int mo4051a() {
                return C0804h.this.mo4050z();
            }

            /* renamed from: a */
            public int mo4052a(View view) {
                return C0804h.this.mo4029h(view) - ((C0809i) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public View mo4053a(int i) {
                return C0804h.this.mo4030h(i);
            }

            /* renamed from: b */
            public int mo4054b() {
                return C0804h.this.mo4048x() - C0804h.this.mo3964B();
            }

            /* renamed from: b */
            public int mo4055b(View view) {
                return C0804h.this.mo4032j(view) + ((C0809i) view.getLayoutParams()).rightMargin;
            }
        };

        /* renamed from: b */
        private final C0860bo.C0862b f2702b = new C0860bo.C0862b() {
            /* renamed from: a */
            public int mo4051a() {
                return C0804h.this.mo3963A();
            }

            /* renamed from: a */
            public int mo4052a(View view) {
                return C0804h.this.mo4031i(view) - ((C0809i) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public View mo4053a(int i) {
                return C0804h.this.mo4030h(i);
            }

            /* renamed from: b */
            public int mo4054b() {
                return C0804h.this.mo4049y() - C0804h.this.mo3965C();
            }

            /* renamed from: b */
            public int mo4055b(View view) {
                return C0804h.this.mo4033k(view) + ((C0809i) view.getLayoutParams()).bottomMargin;
            }
        };

        /* renamed from: c */
        private boolean f2703c = true;

        /* renamed from: d */
        private boolean f2704d = true;

        /* renamed from: e */
        private int f2705e;

        /* renamed from: f */
        private int f2706f;

        /* renamed from: g */
        private int f2707g;

        /* renamed from: h */
        private int f2708h;

        /* renamed from: p */
        C0734ad f2709p;

        /* renamed from: q */
        C0787av f2710q;

        /* renamed from: r */
        C0860bo f2711r = new C0860bo(this.f2701a);

        /* renamed from: s */
        C0860bo f2712s = new C0860bo(this.f2702b);

        /* renamed from: t */
        C0821s f2713t;

        /* renamed from: u */
        boolean f2714u = false;

        /* renamed from: v */
        boolean f2715v = false;

        /* renamed from: w */
        boolean f2716w = false;

        /* renamed from: x */
        int f2717x;

        /* renamed from: y */
        boolean f2718y;

        /* renamed from: android.support.v7.widget.av$h$a */
        public interface C0807a {
            /* renamed from: b */
            void mo3629b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.av$h$b */
        public static class C0808b {

            /* renamed from: a */
            public int f2721a;

            /* renamed from: b */
            public int f2722b;

            /* renamed from: c */
            public boolean f2723c;

            /* renamed from: d */
            public boolean f2724d;
        }

        /* renamed from: a */
        public static int m4238a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: a */
        public static int m4239a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return View.MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return View.MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public static C0808b m4240a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0808b bVar = new C0808b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0621a.C0623b.RecyclerView, i, i2);
            bVar.f2721a = obtainStyledAttributes.getInt(C0621a.C0623b.RecyclerView_android_orientation, 1);
            bVar.f2722b = obtainStyledAttributes.getInt(C0621a.C0623b.RecyclerView_spanCount, 1);
            bVar.f2723c = obtainStyledAttributes.getBoolean(C0621a.C0623b.RecyclerView_reverseLayout, false);
            bVar.f2724d = obtainStyledAttributes.getBoolean(C0621a.C0623b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* renamed from: a */
        private void m4241a(int i, View view) {
            this.f2709p.mo3504e(i);
        }

        /* renamed from: a */
        private void m4243a(C0816o oVar, int i, View view) {
            C0826w e = C0787av.m4073e(view);
            if (!e.mo4158c()) {
                if (!e.mo4169n() || e.mo4172q() || this.f2710q.f2668l.mo3933d()) {
                    mo4028g(i);
                    oVar.mo4098c(view);
                    this.f2710q.f2663g.mo4347h(e);
                    return;
                }
                mo4024f(i);
                oVar.mo4092b(e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4244a(C0821s sVar) {
            if (this.f2713t == sVar) {
                this.f2713t = null;
            }
        }

        /* renamed from: a */
        private void m4245a(View view, int i, boolean z) {
            C0826w e = C0787av.m4073e(view);
            if (z || e.mo4172q()) {
                this.f2710q.f2663g.mo4344e(e);
            } else {
                this.f2710q.f2663g.mo4345f(e);
            }
            C0809i iVar = (C0809i) view.getLayoutParams();
            if (e.mo4166k() || e.mo4164i()) {
                if (e.mo4164i()) {
                    e.mo4165j();
                } else {
                    e.mo4167l();
                }
                this.f2709p.mo3493a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f2710q) {
                int b = this.f2709p.mo3497b(view);
                if (i == -1) {
                    i = this.f2709p.mo3496b();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2710q.indexOfChild(view) + this.f2710q.mo3754a());
                } else if (b != i) {
                    this.f2710q.f2669m.mo4020e(b, i);
                }
            } else {
                this.f2709p.mo3494a(view, i, false);
                iVar.f2727e = true;
                C0821s sVar = this.f2713t;
                if (sVar != null && sVar.mo4125c()) {
                    this.f2713t.mo4123b(view);
                }
            }
            if (iVar.f2728f) {
                e.f2785a.invalidate();
                iVar.f2728f = false;
            }
        }

        /* renamed from: b */
        private static boolean m4246b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: b */
        private int[] m4247b(C0787av avVar, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int z2 = mo4050z();
            int A = mo3963A();
            int x = mo4048x() - mo3964B();
            int y = mo4049y() - mo3965C();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - z2;
            int min = Math.min(0, i);
            int i2 = top - A;
            int min2 = Math.min(0, i2);
            int i3 = width - x;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - y);
            if (mo4043s() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private boolean m4248d(C0787av avVar, int i, int i2) {
            View focusedChild = avVar.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int z = mo4050z();
            int A = mo3963A();
            int x = mo4048x() - mo3964B();
            int y = mo4049y() - mo3965C();
            Rect rect = this.f2710q.f2666j;
            mo3984a(focusedChild, rect);
            return rect.left - i < x && rect.right - i > z && rect.top - i2 < y && rect.bottom - i2 > A;
        }

        /* renamed from: A */
        public int mo3963A() {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                return avVar.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: B */
        public int mo3964B() {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                return avVar.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: C */
        public int mo3965C() {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                return avVar.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: D */
        public View mo3966D() {
            View focusedChild;
            C0787av avVar = this.f2710q;
            if (avVar == null || (focusedChild = avVar.getFocusedChild()) == null || this.f2709p.mo3501c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: E */
        public int mo3967E() {
            return C0388q.m1662i(this.f2710q);
        }

        /* renamed from: F */
        public int mo3968F() {
            return C0388q.m1663j(this.f2710q);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo3969G() {
            C0821s sVar = this.f2713t;
            if (sVar != null) {
                sVar.mo4119a();
            }
        }

        /* renamed from: H */
        public void mo3970H() {
            this.f2714u = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo3971I() {
            int u = mo4045u();
            for (int i = 0; i < u; i++) {
                ViewGroup.LayoutParams layoutParams = mo4030h(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo3124a(int i, C0816o oVar, C0823t tVar) {
            return 0;
        }

        /* renamed from: a */
        public int mo3125a(C0816o oVar, C0823t tVar) {
            C0787av avVar = this.f2710q;
            if (avVar == null || avVar.f2668l == null || !mo3178e()) {
                return 1;
            }
            return this.f2710q.f2668l.mo247a();
        }

        /* renamed from: a */
        public abstract C0809i mo3126a();

        /* renamed from: a */
        public C0809i mo3127a(Context context, AttributeSet attributeSet) {
            return new C0809i(context, attributeSet);
        }

        /* renamed from: a */
        public C0809i mo3128a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0809i ? new C0809i((C0809i) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0809i((ViewGroup.MarginLayoutParams) layoutParams) : new C0809i(layoutParams);
        }

        /* renamed from: a */
        public View mo3130a(View view, int i, C0816o oVar, C0823t tVar) {
            return null;
        }

        /* renamed from: a */
        public void mo3159a(int i, int i2, C0823t tVar, C0807a aVar) {
        }

        /* renamed from: a */
        public void mo3160a(int i, C0807a aVar) {
        }

        /* renamed from: a */
        public void mo3972a(int i, C0816o oVar) {
            View h = mo4030h(i);
            mo4024f(i);
            oVar.mo4086a(h);
        }

        /* renamed from: a */
        public void mo3132a(Rect rect, int i, int i2) {
            mo4025f(m4238a(i, rect.width() + mo4050z() + mo3964B(), mo3967E()), m4238a(i2, rect.height() + mo3963A() + mo3965C(), mo3968F()));
        }

        /* renamed from: a */
        public void mo3161a(Parcelable parcelable) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3973a(C0328b bVar) {
            mo3977a(this.f2710q.f2660d, this.f2710q.f2613B, bVar);
        }

        /* renamed from: a */
        public void mo3974a(C0794a aVar, C0794a aVar2) {
        }

        /* renamed from: a */
        public void mo3975a(C0816o oVar) {
            for (int u = mo4045u() - 1; u >= 0; u--) {
                m4243a(oVar, u, mo4030h(u));
            }
        }

        /* renamed from: a */
        public void mo3976a(C0816o oVar, C0823t tVar, int i, int i2) {
            this.f2710q.mo3813e(i, i2);
        }

        /* renamed from: a */
        public void mo3977a(C0816o oVar, C0823t tVar, C0328b bVar) {
            if (this.f2710q.canScrollVertically(-1) || this.f2710q.canScrollHorizontally(-1)) {
                bVar.mo1413a(8192);
                bVar.mo1448k(true);
            }
            if (this.f2710q.canScrollVertically(1) || this.f2710q.canScrollHorizontally(1)) {
                bVar.mo1413a(4096);
                bVar.mo1448k(true);
            }
            bVar.mo1417a((Object) C0328b.C0339k.m1513a(mo3125a(oVar, tVar), mo3145b(oVar, tVar), mo4022e(oVar, tVar), mo4014d(oVar, tVar)));
        }

        /* renamed from: a */
        public void mo3135a(C0816o oVar, C0823t tVar, View view, C0328b bVar) {
            bVar.mo1424b((Object) C0328b.C0340l.m1514a(mo3178e() ? mo4015d(view) : 0, 1, mo3175d() ? mo4015d(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void mo3978a(C0816o oVar, C0823t tVar, AccessibilityEvent accessibilityEvent) {
            C0787av avVar = this.f2710q;
            if (avVar != null && accessibilityEvent != null) {
                boolean z = true;
                if (!avVar.canScrollVertically(1) && !this.f2710q.canScrollVertically(-1) && !this.f2710q.canScrollHorizontally(-1) && !this.f2710q.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f2710q.f2668l != null) {
                    accessibilityEvent.setItemCount(this.f2710q.f2668l.mo247a());
                }
            }
        }

        /* renamed from: a */
        public void mo3136a(C0823t tVar) {
        }

        /* renamed from: a */
        public void mo3138a(C0787av avVar) {
        }

        /* renamed from: a */
        public void mo3139a(C0787av avVar, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3140a(C0787av avVar, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo3141a(C0787av avVar, int i, int i2, Object obj) {
            mo4010c(avVar, i, i2);
        }

        /* renamed from: a */
        public void mo3162a(C0787av avVar, C0816o oVar) {
            mo4021e(avVar);
        }

        /* renamed from: a */
        public void mo3979a(View view) {
            mo3980a(view, -1);
        }

        /* renamed from: a */
        public void mo3980a(View view, int i) {
            m4245a(view, i, true);
        }

        /* renamed from: a */
        public void mo3981a(View view, int i, int i2) {
            C0809i iVar = (C0809i) view.getLayoutParams();
            Rect i3 = this.f2710q.mo3845i(view);
            int i4 = i + i3.left + i3.right;
            int i5 = i2 + i3.top + i3.bottom;
            int a = m4239a(mo4048x(), mo4046v(), mo4050z() + mo3964B() + iVar.leftMargin + iVar.rightMargin + i4, iVar.width, mo3175d());
            int a2 = m4239a(mo4049y(), mo4047w(), mo3963A() + mo3965C() + iVar.topMargin + iVar.bottomMargin + i5, iVar.height, mo3178e());
            if (mo4006b(view, a, a2, iVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public void mo3982a(View view, int i, int i2, int i3, int i4) {
            C0809i iVar = (C0809i) view.getLayoutParams();
            Rect rect = iVar.f2726d;
            view.layout(i + rect.left + iVar.leftMargin, i2 + rect.top + iVar.topMargin, (i3 - rect.right) - iVar.rightMargin, (i4 - rect.bottom) - iVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo3983a(View view, int i, C0809i iVar) {
            C0826w e = C0787av.m4073e(view);
            if (e.mo4172q()) {
                this.f2710q.f2663g.mo4344e(e);
            } else {
                this.f2710q.f2663g.mo4345f(e);
            }
            this.f2709p.mo3493a(view, i, iVar, e.mo4172q());
        }

        /* renamed from: a */
        public void mo3984a(View view, Rect rect) {
            C0787av.m4062a(view, rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3985a(View view, C0328b bVar) {
            C0826w e = C0787av.m4073e(view);
            if (e != null && !e.mo4172q() && !this.f2709p.mo3501c(e.f2785a)) {
                mo3135a(this.f2710q.f2660d, this.f2710q.f2613B, view, bVar);
            }
        }

        /* renamed from: a */
        public void mo3986a(View view, C0816o oVar) {
            mo4011c(view);
            oVar.mo4086a(view);
        }

        /* renamed from: a */
        public void mo3987a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0809i) view.getLayoutParams()).f2726d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f2710q == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f2710q.f2667k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo3163a(AccessibilityEvent accessibilityEvent) {
            mo3978a(this.f2710q.f2660d, this.f2710q.f2613B, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo3164a(String str) {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                avVar.mo3768a(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3988a(int i, Bundle bundle) {
            return mo3989a(this.f2710q.f2660d, this.f2710q.f2613B, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3143a(C0809i iVar) {
            return iVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3989a(android.support.p020v7.widget.C0787av.C0816o r2, android.support.p020v7.widget.C0787av.C0823t r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                android.support.v7.widget.av r2 = r1.f2710q
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.mo4049y()
                int r5 = r1.mo3963A()
                int r2 = r2 - r5
                int r5 = r1.mo3965C()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                android.support.v7.widget.av r5 = r1.f2710q
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo4048x()
                int r5 = r1.mo4050z()
                int r4 = r4 - r5
                int r5 = r1.mo3964B()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.mo4049y()
                int r4 = r1.mo3963A()
                int r2 = r2 - r4
                int r4 = r1.mo3965C()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                android.support.v7.widget.av r4 = r1.f2710q
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo4048x()
                int r5 = r1.mo4050z()
                int r4 = r4 - r5
                int r5 = r1.mo3964B()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                android.support.v7.widget.av r3 = r1.f2710q
                r3.scrollBy(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0787av.C0804h.mo3989a(android.support.v7.widget.av$o, android.support.v7.widget.av$t, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean mo3990a(C0816o oVar, C0823t tVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3991a(C0787av avVar, C0823t tVar, View view, View view2) {
            return mo3994a(avVar, view, view2);
        }

        /* renamed from: a */
        public boolean mo3992a(C0787av avVar, View view, Rect rect, boolean z) {
            return mo3993a(avVar, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo3993a(C0787av avVar, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m4247b(avVar, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !m4248d(avVar, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                avVar.scrollBy(i, i2);
            } else {
                avVar.mo3756a(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo3994a(C0787av avVar, View view, View view2) {
            return mo4042r() || avVar.mo3857o();
        }

        /* renamed from: a */
        public boolean mo3995a(C0787av avVar, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3996a(View view, int i, int i2, C0809i iVar) {
            return !this.f2703c || !m4246b(view.getMeasuredWidth(), i, iVar.width) || !m4246b(view.getMeasuredHeight(), i2, iVar.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3997a(View view, int i, Bundle bundle) {
            return mo3990a(this.f2710q.f2660d, this.f2710q.f2613B, view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3998a(View view, boolean z, boolean z2) {
            boolean z3 = this.f2711r.mo4326a(view, 24579) && this.f2712s.mo4326a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo3999a(Runnable runnable) {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                return avVar.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo3144b(int i, C0816o oVar, C0823t tVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo3145b(C0816o oVar, C0823t tVar) {
            C0787av avVar = this.f2710q;
            if (avVar == null || avVar.f2668l == null || !mo3175d()) {
                return 1;
            }
            return this.f2710q.f2668l.mo247a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4000b(C0816o oVar) {
            int e = oVar.mo4102e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = oVar.mo4103e(i);
                C0826w e3 = C0787av.m4073e(e2);
                if (!e3.mo4158c()) {
                    e3.mo4154a(false);
                    if (e3.mo4173r()) {
                        this.f2710q.removeDetachedView(e2, false);
                    }
                    if (this.f2710q.f2680x != null) {
                        this.f2710q.f2680x.mo3572d(e3);
                    }
                    e3.mo4154a(true);
                    oVar.mo4093b(e2);
                }
            }
            oVar.mo4105f();
            if (e > 0) {
                this.f2710q.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4001b(C0787av avVar) {
            int i;
            if (avVar == null) {
                this.f2710q = null;
                this.f2709p = null;
                i = 0;
                this.f2707g = 0;
            } else {
                this.f2710q = avVar;
                this.f2709p = avVar.f2662f;
                this.f2707g = avVar.getWidth();
                i = avVar.getHeight();
            }
            this.f2708h = i;
            this.f2705e = 1073741824;
            this.f2706f = 1073741824;
        }

        /* renamed from: b */
        public void mo3146b(C0787av avVar, int i, int i2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4002b(C0787av avVar, C0816o oVar) {
            this.f2715v = false;
            mo3162a(avVar, oVar);
        }

        /* renamed from: b */
        public void mo4003b(View view) {
            mo4004b(view, -1);
        }

        /* renamed from: b */
        public void mo4004b(View view, int i) {
            m4245a(view, i, false);
        }

        /* renamed from: b */
        public void mo4005b(View view, Rect rect) {
            C0787av avVar = this.f2710q;
            if (avVar == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(avVar.mo3845i(view));
            }
        }

        /* renamed from: b */
        public boolean mo3147b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4006b(View view, int i, int i2, C0809i iVar) {
            return view.isLayoutRequested() || !this.f2703c || !m4246b(view.getWidth(), i, iVar.width) || !m4246b(view.getHeight(), i2, iVar.height);
        }

        /* renamed from: c */
        public int mo3170c(C0823t tVar) {
            return 0;
        }

        /* renamed from: c */
        public Parcelable mo3171c() {
            return null;
        }

        /* renamed from: c */
        public View mo3172c(int i) {
            int u = mo4045u();
            for (int i2 = 0; i2 < u; i2++) {
                View h = mo4030h(i2);
                C0826w e = C0787av.m4073e(h);
                if (e != null && e.mo4159d() == i && !e.mo4158c() && (this.f2710q.f2613B.mo4132a() || !e.mo4172q())) {
                    return h;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4007c(int i, int i2) {
            this.f2707g = View.MeasureSpec.getSize(i);
            this.f2705e = View.MeasureSpec.getMode(i);
            if (this.f2705e == 0 && !C0787av.f2610b) {
                this.f2707g = 0;
            }
            this.f2708h = View.MeasureSpec.getSize(i2);
            this.f2706f = View.MeasureSpec.getMode(i2);
            if (this.f2706f == 0 && !C0787av.f2610b) {
                this.f2708h = 0;
            }
        }

        /* renamed from: c */
        public void mo4008c(C0816o oVar) {
            for (int u = mo4045u() - 1; u >= 0; u--) {
                if (!C0787av.m4073e(mo4030h(u)).mo4158c()) {
                    mo3972a(u, oVar);
                }
            }
        }

        /* renamed from: c */
        public void mo3148c(C0816o oVar, C0823t tVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4009c(C0787av avVar) {
            this.f2715v = true;
            mo4018d(avVar);
        }

        /* renamed from: c */
        public void mo4010c(C0787av avVar, int i, int i2) {
        }

        /* renamed from: c */
        public void mo4011c(View view) {
            this.f2709p.mo3492a(view);
        }

        /* renamed from: c */
        public void mo4012c(View view, int i) {
            mo3983a(view, i, (C0809i) view.getLayoutParams());
        }

        /* renamed from: c */
        public void mo4013c(boolean z) {
            this.f2716w = z;
        }

        /* renamed from: d */
        public int mo4014d(C0816o oVar, C0823t tVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo3173d(C0823t tVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo4015d(View view) {
            return ((C0809i) view.getLayoutParams()).mo4059f();
        }

        /* renamed from: d */
        public View mo4016d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public void mo3174d(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4017d(int i, int i2) {
            int u = mo4045u();
            if (u == 0) {
                this.f2710q.mo3813e(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < u; i7++) {
                View h = mo4030h(i7);
                Rect rect = this.f2710q.f2666j;
                mo3984a(h, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f2710q.f2666j.set(i3, i4, i5, i6);
            mo3132a(this.f2710q.f2666j, i, i2);
        }

        /* renamed from: d */
        public void mo4018d(C0787av avVar) {
        }

        /* renamed from: d */
        public boolean mo3175d() {
            return false;
        }

        /* renamed from: e */
        public int mo3177e(C0823t tVar) {
            return 0;
        }

        /* renamed from: e */
        public View mo4019e(View view) {
            View c;
            C0787av avVar = this.f2710q;
            if (avVar == null || (c = avVar.mo3787c(view)) == null || this.f2709p.mo3501c(c)) {
                return null;
            }
            return c;
        }

        /* renamed from: e */
        public void mo4020e(int i, int i2) {
            View h = mo4030h(i);
            if (h != null) {
                mo4028g(i);
                mo4012c(h, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f2710q.toString());
        }

        @Deprecated
        /* renamed from: e */
        public void mo4021e(C0787av avVar) {
        }

        /* renamed from: e */
        public boolean mo3178e() {
            return false;
        }

        /* renamed from: e */
        public boolean mo4022e(C0816o oVar, C0823t tVar) {
            return false;
        }

        /* renamed from: f */
        public int mo3180f(C0823t tVar) {
            return 0;
        }

        /* renamed from: f */
        public int mo4023f(View view) {
            Rect rect = ((C0809i) view.getLayoutParams()).f2726d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: f */
        public void mo4024f(int i) {
            if (mo4030h(i) != null) {
                this.f2709p.mo3491a(i);
            }
        }

        /* renamed from: f */
        public void mo4025f(int i, int i2) {
            this.f2710q.setMeasuredDimension(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4026f(C0787av avVar) {
            mo4007c(View.MeasureSpec.makeMeasureSpec(avVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(avVar.getHeight(), 1073741824));
        }

        /* renamed from: g */
        public int mo3181g(C0823t tVar) {
            return 0;
        }

        /* renamed from: g */
        public int mo4027g(View view) {
            Rect rect = ((C0809i) view.getLayoutParams()).f2726d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: g */
        public void mo4028g(int i) {
            m4241a(i, mo4030h(i));
        }

        /* renamed from: h */
        public int mo3183h(C0823t tVar) {
            return 0;
        }

        /* renamed from: h */
        public int mo4029h(View view) {
            return view.getLeft() - mo4036n(view);
        }

        /* renamed from: h */
        public View mo4030h(int i) {
            C0734ad adVar = this.f2709p;
            if (adVar != null) {
                return adVar.mo3498b(i);
            }
            return null;
        }

        /* renamed from: i */
        public int mo4031i(View view) {
            return view.getTop() - mo4034l(view);
        }

        /* renamed from: i */
        public void mo3289i(int i) {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                avVar.mo3801d(i);
            }
        }

        /* renamed from: j */
        public int mo4032j(View view) {
            return view.getRight() + mo4038o(view);
        }

        /* renamed from: j */
        public void mo3292j(int i) {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                avVar.mo3789c(i);
            }
        }

        /* renamed from: k */
        public int mo4033k(View view) {
            return view.getBottom() + mo4035m(view);
        }

        /* renamed from: k */
        public void mo3293k(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3187k() {
            return false;
        }

        /* renamed from: l */
        public int mo4034l(View view) {
            return ((C0809i) view.getLayoutParams()).f2726d.top;
        }

        /* renamed from: m */
        public int mo4035m(View view) {
            return ((C0809i) view.getLayoutParams()).f2726d.bottom;
        }

        /* renamed from: n */
        public int mo4036n(View view) {
            return ((C0809i) view.getLayoutParams()).f2726d.left;
        }

        /* renamed from: n */
        public void mo4037n() {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                avVar.requestLayout();
            }
        }

        /* renamed from: o */
        public int mo4038o(View view) {
            return ((C0809i) view.getLayoutParams()).f2726d.right;
        }

        /* renamed from: o */
        public final boolean mo4039o() {
            return this.f2704d;
        }

        /* renamed from: p */
        public boolean mo4040p() {
            return this.f2715v;
        }

        /* renamed from: q */
        public boolean mo4041q() {
            C0787av avVar = this.f2710q;
            return avVar != null && avVar.f2664h;
        }

        /* renamed from: r */
        public boolean mo4042r() {
            C0821s sVar = this.f2713t;
            return sVar != null && sVar.mo4125c();
        }

        /* renamed from: s */
        public int mo4043s() {
            return C0388q.m1658e(this.f2710q);
        }

        /* renamed from: t */
        public int mo4044t() {
            return -1;
        }

        /* renamed from: u */
        public int mo4045u() {
            C0734ad adVar = this.f2709p;
            if (adVar != null) {
                return adVar.mo3496b();
            }
            return 0;
        }

        /* renamed from: v */
        public int mo4046v() {
            return this.f2705e;
        }

        /* renamed from: w */
        public int mo4047w() {
            return this.f2706f;
        }

        /* renamed from: x */
        public int mo4048x() {
            return this.f2707g;
        }

        /* renamed from: y */
        public int mo4049y() {
            return this.f2708h;
        }

        /* renamed from: z */
        public int mo4050z() {
            C0787av avVar = this.f2710q;
            if (avVar != null) {
                return avVar.getPaddingLeft();
            }
            return 0;
        }
    }

    /* renamed from: android.support.v7.widget.av$i */
    public static class C0809i extends ViewGroup.MarginLayoutParams {

        /* renamed from: c */
        C0826w f2725c;

        /* renamed from: d */
        final Rect f2726d = new Rect();

        /* renamed from: e */
        boolean f2727e = true;

        /* renamed from: f */
        boolean f2728f = false;

        public C0809i(int i, int i2) {
            super(i, i2);
        }

        public C0809i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0809i(C0809i iVar) {
            super(iVar);
        }

        public C0809i(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0809i(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: c */
        public boolean mo4056c() {
            return this.f2725c.mo4169n();
        }

        /* renamed from: d */
        public boolean mo4057d() {
            return this.f2725c.mo4172q();
        }

        /* renamed from: e */
        public boolean mo4058e() {
            return this.f2725c.mo4180x();
        }

        /* renamed from: f */
        public int mo4059f() {
            return this.f2725c.mo4159d();
        }
    }

    /* renamed from: android.support.v7.widget.av$j */
    public interface C0810j {
        /* renamed from: a */
        void mo4060a(View view);

        /* renamed from: b */
        void mo4061b(View view);
    }

    /* renamed from: android.support.v7.widget.av$k */
    public static abstract class C0811k {
        /* renamed from: a */
        public abstract boolean mo4062a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.av$l */
    public interface C0812l {
        /* renamed from: a */
        void mo3601a(boolean z);

        /* renamed from: a */
        boolean mo3603a(C0787av avVar, MotionEvent motionEvent);

        /* renamed from: b */
        void mo3604b(C0787av avVar, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.av$m */
    public static abstract class C0813m {
        /* renamed from: a */
        public void mo4063a(C0787av avVar, int i) {
        }

        /* renamed from: a */
        public void mo3607a(C0787av avVar, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.av$n */
    public static class C0814n {

        /* renamed from: a */
        SparseArray<C0815a> f2729a = new SparseArray<>();

        /* renamed from: b */
        private int f2730b = 0;

        /* renamed from: android.support.v7.widget.av$n$a */
        static class C0815a {

            /* renamed from: a */
            ArrayList<C0826w> f2731a = new ArrayList<>();

            /* renamed from: b */
            int f2732b = 5;

            /* renamed from: c */
            long f2733c = 0;

            /* renamed from: d */
            long f2734d = 0;

            C0815a() {
            }
        }

        /* renamed from: b */
        private C0815a m4400b(int i) {
            C0815a aVar = this.f2729a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0815a aVar2 = new C0815a();
            this.f2729a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo4064a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public C0826w mo4065a(int i) {
            C0815a aVar = this.f2729a.get(i);
            if (aVar == null || aVar.f2731a.isEmpty()) {
                return null;
            }
            ArrayList<C0826w> arrayList = aVar.f2731a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        public void mo4066a() {
            for (int i = 0; i < this.f2729a.size(); i++) {
                this.f2729a.valueAt(i).f2731a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4067a(int i, long j) {
            C0815a b = m4400b(i);
            b.f2733c = mo4064a(b.f2733c, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4068a(C0794a aVar) {
            this.f2730b++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4069a(C0794a aVar, C0794a aVar2, boolean z) {
            if (aVar != null) {
                mo4072b();
            }
            if (!z && this.f2730b == 0) {
                mo4066a();
            }
            if (aVar2 != null) {
                mo4068a(aVar2);
            }
        }

        /* renamed from: a */
        public void mo4070a(C0826w wVar) {
            int h = wVar.mo4163h();
            ArrayList<C0826w> arrayList = m4400b(h).f2731a;
            if (this.f2729a.get(h).f2732b > arrayList.size()) {
                wVar.mo4178v();
                arrayList.add(wVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4071a(int i, long j, long j2) {
            long j3 = m4400b(i).f2733c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4072b() {
            this.f2730b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4073b(int i, long j) {
            C0815a b = m4400b(i);
            b.f2734d = mo4064a(b.f2734d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4074b(int i, long j, long j2) {
            long j3 = m4400b(i).f2734d;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: android.support.v7.widget.av$o */
    public final class C0816o {

        /* renamed from: a */
        final ArrayList<C0826w> f2735a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0826w> f2736b = null;

        /* renamed from: c */
        final ArrayList<C0826w> f2737c = new ArrayList<>();

        /* renamed from: d */
        int f2738d = 2;

        /* renamed from: e */
        C0814n f2739e;

        /* renamed from: g */
        private final List<C0826w> f2741g = Collections.unmodifiableList(this.f2735a);

        /* renamed from: h */
        private int f2742h = 2;

        /* renamed from: i */
        private C0824u f2743i;

        public C0816o() {
        }

        /* renamed from: a */
        private void m4412a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4412a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        private boolean m4413a(C0826w wVar, int i, int i2, long j) {
            wVar.f2797m = C0787av.this;
            int h = wVar.mo4163h();
            long nanoTime = C0787av.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f2739e.mo4074b(h, nanoTime, j)) {
                return false;
            }
            C0787av.this.f2668l.mo3927b(wVar, i);
            this.f2739e.mo4073b(wVar.mo4163h(), C0787av.this.getNanoTime() - nanoTime);
            m4414e(wVar);
            if (!C0787av.this.f2613B.mo4132a()) {
                return true;
            }
            wVar.f2791g = i2;
            return true;
        }

        /* renamed from: e */
        private void m4414e(C0826w wVar) {
            if (C0787av.this.mo3856n()) {
                View view = wVar.f2785a;
                if (C0388q.m1657d(view) == 0) {
                    C0388q.m1639a(view, 1);
                }
                if (!C0388q.m1651a(view)) {
                    wVar.mo4157b(16384);
                    C0388q.m1645a(view, C0787av.this.f2617F.mo4182c());
                }
            }
        }

        /* renamed from: f */
        private void m4415f(C0826w wVar) {
            if (wVar.f2785a instanceof ViewGroup) {
                m4412a((ViewGroup) wVar.f2785a, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0216  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p020v7.widget.C0787av.C0826w mo4075a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0232
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r1 = r1.f2613B
                int r1 = r1.mo4136e()
                if (r3 >= r1) goto L_0x0232
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r1 = r1.f2613B
                boolean r1 = r1.mo4132a()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                android.support.v7.widget.av$w r1 = r16.mo4104f((int) r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                android.support.v7.widget.av$w r1 = r16.mo4089b((int) r17, (boolean) r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4087a((android.support.p020v7.widget.C0787av.C0826w) r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4157b((int) r5)
                boolean r5 = r1.mo4164i()
                if (r5 == 0) goto L_0x004e
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                android.view.View r9 = r1.f2785a
                r5.removeDetachedView(r9, r8)
                r1.mo4165j()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4166k()
                if (r5 == 0) goto L_0x0057
                r1.mo4167l()
            L_0x0057:
                r6.mo4092b((android.support.p020v7.widget.C0787av.C0826w) r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0189
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.f r5 = r5.f2661e
                int r5 = r5.mo4393b((int) r3)
                if (r5 < 0) goto L_0x014c
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$a r9 = r9.f2668l
                int r9 = r9.mo247a()
                if (r5 >= r9) goto L_0x014c
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$a r9 = r9.f2668l
                int r9 = r9.mo257b((int) r5)
                android.support.v7.widget.av r10 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$a r10 = r10.f2668l
                boolean r10 = r10.mo3933d()
                if (r10 == 0) goto L_0x0096
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$a r1 = r1.f2668l
                long r10 = r1.mo248a((int) r5)
                android.support.v7.widget.av$w r1 = r6.mo4076a((long) r10, (int) r9, (boolean) r0)
                if (r1 == 0) goto L_0x0096
                r1.f2787c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                android.support.v7.widget.av$u r0 = r6.f2743i
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo4138a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$w r1 = r1.mo3778b((android.view.View) r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo4158c()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                java.lang.String r2 = r2.mo3754a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                java.lang.String r2 = r2.mo3754a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                android.support.v7.widget.av$n r0 = r16.mo4106g()
                android.support.v7.widget.av$w r1 = r0.mo4065a((int) r9)
                if (r1 == 0) goto L_0x0101
                r1.mo4178v()
                boolean r0 = android.support.p020v7.widget.C0787av.f2609a
                if (r0 == 0) goto L_0x0101
                r6.m4415f((android.support.p020v7.widget.C0787av.C0826w) r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0189
                android.support.v7.widget.av r0 = android.support.p020v7.widget.C0787av.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                android.support.v7.widget.av$n r10 = r6.f2739e
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4071a((int) r11, (long) r12, (long) r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$a r2 = r2.f2668l
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$w r2 = r2.mo3930c(r5, r9)
                boolean r5 = android.support.p020v7.widget.C0787av.f2605K
                if (r5 == 0) goto L_0x013e
                android.view.View r5 = r2.f2785a
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.m4075j(r5)
                if (r5 == 0) goto L_0x013e
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f2786b = r10
            L_0x013e:
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                long r10 = r5.getNanoTime()
                android.support.v7.widget.av$n r5 = r6.f2739e
                long r10 = r10 - r0
                r5.mo4067a((int) r9, (long) r10)
                r10 = r2
                goto L_0x018a
            L_0x014c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r2 = r2.f2613B
                int r2 = r2.mo4136e()
                r1.append(r2)
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                java.lang.String r2 = r2.mo3754a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0189:
                r10 = r1
            L_0x018a:
                r9 = r4
                if (r9 == 0) goto L_0x01c5
                android.support.v7.widget.av r0 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r0 = r0.f2613B
                boolean r0 = r0.mo4132a()
                if (r0 != 0) goto L_0x01c5
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.mo4155a((int) r0)
                if (r1 == 0) goto L_0x01c5
                r10.mo4149a((int) r8, (int) r0)
                android.support.v7.widget.av r0 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r0 = r0.f2613B
                boolean r0 = r0.f2768i
                if (r0 == 0) goto L_0x01c5
                int r0 = android.support.p020v7.widget.C0787av.C0798e.m4205e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$e r1 = r1.f2680x
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r2 = r2.f2613B
                java.util.List r4 = r10.mo4177u()
                android.support.v7.widget.av$e$c r0 = r1.mo3939a((android.support.p020v7.widget.C0787av.C0823t) r2, (android.support.p020v7.widget.C0787av.C0826w) r10, (int) r0, (java.util.List<java.lang.Object>) r4)
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                r1.mo3766a((android.support.p020v7.widget.C0787av.C0826w) r10, (android.support.p020v7.widget.C0787av.C0798e.C0801c) r0)
            L_0x01c5:
                android.support.v7.widget.av r0 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r0 = r0.f2613B
                boolean r0 = r0.mo4132a()
                if (r0 == 0) goto L_0x01d8
                boolean r0 = r10.mo4171p()
                if (r0 == 0) goto L_0x01d8
                r10.f2791g = r3
                goto L_0x01eb
            L_0x01d8:
                boolean r0 = r10.mo4171p()
                if (r0 == 0) goto L_0x01ed
                boolean r0 = r10.mo4170o()
                if (r0 != 0) goto L_0x01ed
                boolean r0 = r10.mo4169n()
                if (r0 == 0) goto L_0x01eb
                goto L_0x01ed
            L_0x01eb:
                r0 = 0
                goto L_0x0200
            L_0x01ed:
                android.support.v7.widget.av r0 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.f r0 = r0.f2661e
                int r2 = r0.mo4393b((int) r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m4413a(r1, r2, r3, r4)
            L_0x0200:
                android.view.View r1 = r10.f2785a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0216
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x020e:
                android.support.v7.widget.av$i r1 = (android.support.p020v7.widget.C0787av.C0809i) r1
                android.view.View r2 = r10.f2785a
                r2.setLayoutParams(r1)
                goto L_0x0227
            L_0x0216:
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0225
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x020e
            L_0x0225:
                android.support.v7.widget.av$i r1 = (android.support.p020v7.widget.C0787av.C0809i) r1
            L_0x0227:
                r1.f2725c = r10
                if (r9 == 0) goto L_0x022e
                if (r0 == 0) goto L_0x022e
                goto L_0x022f
            L_0x022e:
                r7 = 0
            L_0x022f:
                r1.f2728f = r7
                return r10
            L_0x0232:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r2 = r2.f2613B
                int r2 = r2.mo4136e()
                r1.append(r2)
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                java.lang.String r2 = r2.mo3754a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0787av.C0816o.mo4075a(int, boolean, long):android.support.v7.widget.av$w");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0826w mo4076a(long j, int i, boolean z) {
            for (int size = this.f2735a.size() - 1; size >= 0; size--) {
                C0826w wVar = this.f2735a.get(size);
                if (wVar.mo4162g() == j && !wVar.mo4166k()) {
                    if (i == wVar.mo4163h()) {
                        wVar.mo4157b(32);
                        if (wVar.mo4172q() && !C0787av.this.f2613B.mo4132a()) {
                            wVar.mo4149a(2, 14);
                        }
                        return wVar;
                    } else if (!z) {
                        this.f2735a.remove(size);
                        C0787av.this.removeDetachedView(wVar.f2785a, false);
                        mo4093b(wVar.f2785a);
                    }
                }
            }
            int size2 = this.f2737c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0826w wVar2 = this.f2737c.get(size2);
                if (wVar2.mo4162g() == j) {
                    if (i == wVar2.mo4163h()) {
                        if (!z) {
                            this.f2737c.remove(size2);
                        }
                        return wVar2;
                    } else if (!z) {
                        mo4100d(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo4077a(int i, boolean z) {
            return mo4075a(i, z, Long.MAX_VALUE).f2785a;
        }

        /* renamed from: a */
        public void mo4078a() {
            this.f2735a.clear();
            mo4099d();
        }

        /* renamed from: a */
        public void mo4079a(int i) {
            this.f2742h = i;
            mo4090b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4080a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f2737c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0826w wVar = this.f2737c.get(i6);
                if (wVar != null && wVar.f2787c >= i5 && wVar.f2787c <= i4) {
                    if (wVar.f2787c == i) {
                        wVar.mo4151a(i2 - i, false);
                    } else {
                        wVar.mo4151a(i3, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4081a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2737c.size() - 1; size >= 0; size--) {
                C0826w wVar = this.f2737c.get(size);
                if (wVar != null) {
                    if (wVar.f2787c >= i3) {
                        wVar.mo4151a(-i2, z);
                    } else if (wVar.f2787c >= i) {
                        wVar.mo4157b(8);
                        mo4100d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4082a(C0794a aVar, C0794a aVar2, boolean z) {
            mo4078a();
            mo4106g().mo4069a(aVar, aVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4083a(C0814n nVar) {
            C0814n nVar2 = this.f2739e;
            if (nVar2 != null) {
                nVar2.mo4072b();
            }
            this.f2739e = nVar;
            if (nVar != null) {
                this.f2739e.mo4068a(C0787av.this.getAdapter());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4084a(C0824u uVar) {
            this.f2743i = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4085a(C0826w wVar, boolean z) {
            C0787av.m4071c(wVar);
            if (wVar.mo4155a(16384)) {
                wVar.mo4149a(0, 16384);
                C0388q.m1645a(wVar.f2785a, (C0358b) null);
            }
            if (z) {
                mo4101d(wVar);
            }
            wVar.f2797m = null;
            mo4106g().mo4070a(wVar);
        }

        /* renamed from: a */
        public void mo4086a(View view) {
            C0826w e = C0787av.m4073e(view);
            if (e.mo4173r()) {
                C0787av.this.removeDetachedView(view, false);
            }
            if (e.mo4164i()) {
                e.mo4165j();
            } else if (e.mo4166k()) {
                e.mo4167l();
            }
            mo4092b(e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4087a(C0826w wVar) {
            if (wVar.mo4172q()) {
                return C0787av.this.f2613B.mo4132a();
            }
            if (wVar.f2787c < 0 || wVar.f2787c >= C0787av.this.f2668l.mo247a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + wVar + C0787av.this.mo3754a());
            } else if (C0787av.this.f2613B.mo4132a() || C0787av.this.f2668l.mo257b(wVar.f2787c) == wVar.mo4163h()) {
                return !C0787av.this.f2668l.mo3933d() || wVar.mo4162g() == C0787av.this.f2668l.mo248a(wVar.f2787c);
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public int mo4088b(int i) {
            if (i >= 0 && i < C0787av.this.f2613B.mo4136e()) {
                return !C0787av.this.f2613B.mo4132a() ? i : C0787av.this.f2661e.mo4393b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + C0787av.this.f2613B.mo4136e() + C0787av.this.mo3754a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0826w mo4089b(int i, boolean z) {
            View c;
            int size = this.f2735a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0826w wVar = this.f2735a.get(i3);
                if (wVar.mo4166k() || wVar.mo4159d() != i || wVar.mo4169n() || (!C0787av.this.f2613B.f2765f && wVar.mo4172q())) {
                    i3++;
                } else {
                    wVar.mo4157b(32);
                    return wVar;
                }
            }
            if (z || (c = C0787av.this.f2662f.mo3500c(i)) == null) {
                int size2 = this.f2737c.size();
                while (i2 < size2) {
                    C0826w wVar2 = this.f2737c.get(i2);
                    if (wVar2.mo4169n() || wVar2.mo4159d() != i) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f2737c.remove(i2);
                        }
                        return wVar2;
                    }
                }
                return null;
            }
            C0826w e = C0787av.m4073e(c);
            C0787av.this.f2662f.mo3505e(c);
            int b = C0787av.this.f2662f.mo3497b(c);
            if (b != -1) {
                C0787av.this.f2662f.mo3504e(b);
                mo4098c(c);
                e.mo4157b(8224);
                return e;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + e + C0787av.this.mo3754a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4090b() {
            this.f2738d = this.f2742h + (C0787av.this.f2669m != null ? C0787av.this.f2669m.f2717x : 0);
            for (int size = this.f2737c.size() - 1; size >= 0 && this.f2737c.size() > this.f2738d; size--) {
                mo4100d(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4091b(int i, int i2) {
            int size = this.f2737c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0826w wVar = this.f2737c.get(i3);
                if (wVar != null && wVar.f2787c >= i) {
                    wVar.mo4151a(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4092b(C0826w wVar) {
            boolean z;
            boolean z2 = false;
            if (wVar.mo4164i() || wVar.f2785a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(wVar.mo4164i());
                sb.append(" isAttached:");
                if (wVar.f2785a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(C0787av.this.mo3754a());
                throw new IllegalArgumentException(sb.toString());
            } else if (wVar.mo4173r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + wVar + C0787av.this.mo3754a());
            } else if (!wVar.mo4158c()) {
                boolean a = wVar.m4494A();
                if ((C0787av.this.f2668l != null && a && C0787av.this.f2668l.mo3929b(wVar)) || wVar.mo4179w()) {
                    if (this.f2738d <= 0 || wVar.mo4155a(526)) {
                        z = false;
                    } else {
                        int size = this.f2737c.size();
                        if (size >= this.f2738d && size > 0) {
                            mo4100d(0);
                            size--;
                        }
                        if (C0787av.f2605K && size > 0 && !C0787av.this.f2612A.mo3628a(wVar.f2787c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!C0787av.this.f2612A.mo3628a(this.f2737c.get(i).f2787c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f2737c.add(size, wVar);
                        z = true;
                    }
                    if (!z) {
                        mo4085a(wVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                C0787av.this.f2663g.mo4346g(wVar);
                if (!z && !z2 && a) {
                    wVar.f2797m = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + C0787av.this.mo3754a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4093b(View view) {
            C0826w e = C0787av.m4073e(view);
            C0816o unused = e.f2800q = null;
            boolean unused2 = e.f2801r = false;
            e.mo4167l();
            mo4092b(e);
        }

        /* renamed from: c */
        public View mo4094c(int i) {
            return mo4077a(i, false);
        }

        /* renamed from: c */
        public List<C0826w> mo4095c() {
            return this.f2741g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4096c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f2737c.size() - 1; size >= 0; size--) {
                C0826w wVar = this.f2737c.get(size);
                if (wVar != null && (i3 = wVar.f2787c) >= i && i3 < i4) {
                    wVar.mo4157b(2);
                    mo4100d(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4097c(C0826w wVar) {
            (wVar.f2801r ? this.f2736b : this.f2735a).remove(wVar);
            C0816o unused = wVar.f2800q = null;
            boolean unused2 = wVar.f2801r = false;
            wVar.mo4167l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4098c(View view) {
            ArrayList<C0826w> arrayList;
            C0826w e = C0787av.m4073e(view);
            if (!e.mo4155a(12) && e.mo4180x() && !C0787av.this.mo3786b(e)) {
                if (this.f2736b == null) {
                    this.f2736b = new ArrayList<>();
                }
                e.mo4152a(this, true);
                arrayList = this.f2736b;
            } else if (!e.mo4169n() || e.mo4172q() || C0787av.this.f2668l.mo3933d()) {
                e.mo4152a(this, false);
                arrayList = this.f2735a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + C0787av.this.mo3754a());
            }
            arrayList.add(e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4099d() {
            for (int size = this.f2737c.size() - 1; size >= 0; size--) {
                mo4100d(size);
            }
            this.f2737c.clear();
            if (C0787av.f2605K) {
                C0787av.this.f2612A.mo3625a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4100d(int i) {
            mo4085a(this.f2737c.get(i), true);
            this.f2737c.remove(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4101d(C0826w wVar) {
            if (C0787av.this.f2670n != null) {
                C0787av.this.f2670n.mo4110a(wVar);
            }
            if (C0787av.this.f2668l != null) {
                C0787av.this.f2668l.mo254a(wVar);
            }
            if (C0787av.this.f2613B != null) {
                C0787av.this.f2663g.mo4346g(wVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo4102e() {
            return this.f2735a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public View mo4103e(int i) {
            return this.f2735a.get(i).f2785a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0826w mo4104f(int i) {
            int size;
            int b;
            ArrayList<C0826w> arrayList = this.f2736b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C0826w wVar = this.f2736b.get(i3);
                    if (wVar.mo4166k() || wVar.mo4159d() != i) {
                        i3++;
                    } else {
                        wVar.mo4157b(32);
                        return wVar;
                    }
                }
                if (C0787av.this.f2668l.mo3933d() && (b = C0787av.this.f2661e.mo4393b(i)) > 0 && b < C0787av.this.f2668l.mo247a()) {
                    long a = C0787av.this.f2668l.mo248a(b);
                    while (i2 < size) {
                        C0826w wVar2 = this.f2736b.get(i2);
                        if (wVar2.mo4166k() || wVar2.mo4162g() != a) {
                            i2++;
                        } else {
                            wVar2.mo4157b(32);
                            return wVar2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4105f() {
            this.f2735a.clear();
            ArrayList<C0826w> arrayList = this.f2736b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0814n mo4106g() {
            if (this.f2739e == null) {
                this.f2739e = new C0814n();
            }
            return this.f2739e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4107h() {
            if (C0787av.this.f2668l == null || !C0787av.this.f2668l.mo3933d()) {
                mo4099d();
                return;
            }
            int size = this.f2737c.size();
            for (int i = 0; i < size; i++) {
                C0826w wVar = this.f2737c.get(i);
                if (wVar != null) {
                    wVar.mo4157b(6);
                    wVar.mo4153a((Object) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4108i() {
            int size = this.f2737c.size();
            for (int i = 0; i < size; i++) {
                this.f2737c.get(i).mo4148a();
            }
            int size2 = this.f2735a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f2735a.get(i2).mo4148a();
            }
            ArrayList<C0826w> arrayList = this.f2736b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f2736b.get(i3).mo4148a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4109j() {
            int size = this.f2737c.size();
            for (int i = 0; i < size; i++) {
                C0809i iVar = (C0809i) this.f2737c.get(i).f2785a.getLayoutParams();
                if (iVar != null) {
                    iVar.f2727e = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.av$p */
    public interface C0817p {
        /* renamed from: a */
        void mo4110a(C0826w wVar);
    }

    /* renamed from: android.support.v7.widget.av$q */
    private class C0818q extends C0796c {
        C0818q() {
        }

        /* renamed from: a */
        public void mo3936a() {
            C0787av.this.mo3768a((String) null);
            C0787av.this.f2613B.f2764e = true;
            C0787av.this.mo3902u();
            if (!C0787av.this.f2661e.mo4397d()) {
                C0787av.this.requestLayout();
            }
        }
    }

    /* renamed from: android.support.v7.widget.av$r */
    public static class C0819r extends C0321a {
        public static final Parcelable.Creator<C0819r> CREATOR = new Parcelable.ClassLoaderCreator<C0819r>() {
            /* renamed from: a */
            public C0819r createFromParcel(Parcel parcel) {
                return new C0819r(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0819r createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0819r(parcel, classLoader);
            }

            /* renamed from: a */
            public C0819r[] newArray(int i) {
                return new C0819r[i];
            }
        };

        /* renamed from: a */
        Parcelable f2745a;

        C0819r(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2745a = parcel.readParcelable(classLoader == null ? C0804h.class.getClassLoader() : classLoader);
        }

        C0819r(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4111a(C0819r rVar) {
            this.f2745a = rVar.f2745a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2745a, 0);
        }
    }

    /* renamed from: android.support.v7.widget.av$s */
    public static abstract class C0821s {

        /* renamed from: a */
        private int f2746a;

        /* renamed from: b */
        private C0787av f2747b;

        /* renamed from: c */
        private C0804h f2748c;

        /* renamed from: d */
        private boolean f2749d;

        /* renamed from: e */
        private boolean f2750e;

        /* renamed from: f */
        private View f2751f;

        /* renamed from: g */
        private final C0822a f2752g;

        /* renamed from: android.support.v7.widget.av$s$a */
        public static class C0822a {

            /* renamed from: a */
            private int f2753a;

            /* renamed from: b */
            private int f2754b;

            /* renamed from: c */
            private int f2755c;

            /* renamed from: d */
            private int f2756d;

            /* renamed from: e */
            private Interpolator f2757e;

            /* renamed from: f */
            private boolean f2758f;

            /* renamed from: g */
            private int f2759g;

            /* renamed from: b */
            private void m4469b() {
                if (this.f2757e != null && this.f2755c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f2755c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4128a(C0787av avVar) {
                int i = this.f2756d;
                if (i >= 0) {
                    this.f2756d = -1;
                    avVar.mo3755a(i);
                    this.f2758f = false;
                } else if (this.f2758f) {
                    m4469b();
                    if (this.f2757e != null) {
                        avVar.f2681y.mo4143a(this.f2753a, this.f2754b, this.f2755c, this.f2757e);
                    } else if (this.f2755c == Integer.MIN_VALUE) {
                        avVar.f2681y.mo4146b(this.f2753a, this.f2754b);
                    } else {
                        avVar.f2681y.mo4141a(this.f2753a, this.f2754b, this.f2755c);
                    }
                    this.f2759g++;
                    if (this.f2759g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2758f = false;
                } else {
                    this.f2759g = 0;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4129a() {
                return this.f2756d >= 0;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4457a(int i, int i2) {
            C0787av avVar = this.f2747b;
            if (!this.f2750e || this.f2746a == -1 || avVar == null) {
                mo4119a();
            }
            this.f2749d = false;
            View view = this.f2751f;
            if (view != null) {
                if (mo4118a(view) == this.f2746a) {
                    mo4122a(this.f2751f, avVar.f2613B, this.f2752g);
                    this.f2752g.mo4128a(avVar);
                    mo4119a();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2751f = null;
                }
            }
            if (this.f2750e) {
                mo4121a(i, i2, avVar.f2613B, this.f2752g);
                boolean a = this.f2752g.mo4129a();
                this.f2752g.mo4128a(avVar);
                if (!a) {
                    return;
                }
                if (this.f2750e) {
                    this.f2749d = true;
                    avVar.f2681y.mo4139a();
                    return;
                }
                mo4119a();
            }
        }

        /* renamed from: a */
        public int mo4118a(View view) {
            return this.f2747b.mo3814f(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo4119a() {
            if (this.f2750e) {
                mo4127e();
                int unused = this.f2747b.f2613B.f2775p = -1;
                this.f2751f = null;
                this.f2746a = -1;
                this.f2749d = false;
                this.f2750e = false;
                this.f2748c.m4244a(this);
                this.f2748c = null;
                this.f2747b = null;
            }
        }

        /* renamed from: a */
        public void mo4120a(int i) {
            this.f2746a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4121a(int i, int i2, C0823t tVar, C0822a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4122a(View view, C0823t tVar, C0822a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4123b(View view) {
            if (mo4118a(view) == mo4126d()) {
                this.f2751f = view;
            }
        }

        /* renamed from: b */
        public boolean mo4124b() {
            return this.f2749d;
        }

        /* renamed from: c */
        public boolean mo4125c() {
            return this.f2750e;
        }

        /* renamed from: d */
        public int mo4126d() {
            return this.f2746a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo4127e();
    }

    /* renamed from: android.support.v7.widget.av$t */
    public static class C0823t {

        /* renamed from: a */
        int f2760a = 0;

        /* renamed from: b */
        int f2761b = 0;

        /* renamed from: c */
        int f2762c = 1;

        /* renamed from: d */
        int f2763d = 0;

        /* renamed from: e */
        boolean f2764e = false;

        /* renamed from: f */
        boolean f2765f = false;

        /* renamed from: g */
        boolean f2766g = false;

        /* renamed from: h */
        boolean f2767h = false;

        /* renamed from: i */
        boolean f2768i = false;

        /* renamed from: j */
        boolean f2769j = false;

        /* renamed from: k */
        int f2770k;

        /* renamed from: l */
        long f2771l;

        /* renamed from: m */
        int f2772m;

        /* renamed from: n */
        int f2773n;

        /* renamed from: o */
        int f2774o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f2775p = -1;

        /* renamed from: q */
        private SparseArray<Object> f2776q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4130a(int i) {
            if ((this.f2762c & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2762c));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4131a(C0794a aVar) {
            this.f2762c = 1;
            this.f2763d = aVar.mo247a();
            this.f2765f = false;
            this.f2766g = false;
            this.f2767h = false;
        }

        /* renamed from: a */
        public boolean mo4132a() {
            return this.f2765f;
        }

        /* renamed from: b */
        public boolean mo4133b() {
            return this.f2769j;
        }

        /* renamed from: c */
        public int mo4134c() {
            return this.f2775p;
        }

        /* renamed from: d */
        public boolean mo4135d() {
            return this.f2775p != -1;
        }

        /* renamed from: e */
        public int mo4136e() {
            return this.f2765f ? this.f2760a - this.f2761b : this.f2763d;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2775p + ", mData=" + this.f2776q + ", mItemCount=" + this.f2763d + ", mPreviousLayoutItemCount=" + this.f2760a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2761b + ", mStructureChanged=" + this.f2764e + ", mInPreLayout=" + this.f2765f + ", mRunSimpleAnimations=" + this.f2768i + ", mRunPredictiveAnimations=" + this.f2769j + '}';
        }
    }

    /* renamed from: android.support.v7.widget.av$u */
    public static abstract class C0824u {
        /* renamed from: a */
        public abstract View mo4138a(C0816o oVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.av$v */
    class C0825v implements Runnable {

        /* renamed from: a */
        Interpolator f2777a = C0787av.f2602H;

        /* renamed from: c */
        private int f2779c;

        /* renamed from: d */
        private int f2780d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public OverScroller f2781e;

        /* renamed from: f */
        private boolean f2782f = false;

        /* renamed from: g */
        private boolean f2783g = false;

        C0825v() {
            this.f2781e = new OverScroller(C0787av.this.getContext(), C0787av.f2602H);
        }

        /* renamed from: a */
        private float m4481a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: b */
        private int m4483b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? C0787av.this.getWidth() : C0787av.this.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m4481a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: c */
        private void m4484c() {
            this.f2783g = false;
            this.f2782f = true;
        }

        /* renamed from: d */
        private void m4485d() {
            this.f2782f = false;
            if (this.f2783g) {
                mo4139a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4139a() {
            if (this.f2782f) {
                this.f2783g = true;
                return;
            }
            C0787av.this.removeCallbacks(this);
            C0388q.m1647a((View) C0787av.this, (Runnable) this);
        }

        /* renamed from: a */
        public void mo4140a(int i, int i2) {
            C0787av.this.setScrollState(2);
            this.f2780d = 0;
            this.f2779c = 0;
            this.f2781e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4139a();
        }

        /* renamed from: a */
        public void mo4141a(int i, int i2, int i3) {
            mo4143a(i, i2, i3, C0787av.f2602H);
        }

        /* renamed from: a */
        public void mo4142a(int i, int i2, int i3, int i4) {
            mo4141a(i, i2, m4483b(i, i2, i3, i4));
        }

        /* renamed from: a */
        public void mo4143a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f2777a != interpolator) {
                this.f2777a = interpolator;
                this.f2781e = new OverScroller(C0787av.this.getContext(), interpolator);
            }
            C0787av.this.setScrollState(2);
            this.f2780d = 0;
            this.f2779c = 0;
            this.f2781e.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2781e.computeScrollOffset();
            }
            mo4139a();
        }

        /* renamed from: a */
        public void mo4144a(int i, int i2, Interpolator interpolator) {
            int b = m4483b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = C0787av.f2602H;
            }
            mo4143a(i, i2, b, interpolator);
        }

        /* renamed from: b */
        public void mo4145b() {
            C0787av.this.removeCallbacks(this);
            this.f2781e.abortAnimation();
        }

        /* renamed from: b */
        public void mo4146b(int i, int i2) {
            mo4142a(i, i2, 0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
            if (r8 > 0) goto L_0x012e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r0 = r22
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$h r1 = r1.f2669m
                if (r1 != 0) goto L_0x000c
                r22.mo4145b()
                return
            L_0x000c:
                r22.m4484c()
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                r1.mo3800d()
                android.widget.OverScroller r1 = r0.f2781e
                android.support.v7.widget.av r2 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$h r2 = r2.f2669m
                android.support.v7.widget.av$s r2 = r2.f2713t
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x01d2
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                int[] r3 = r3.f2630aC
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f2779c
                int r13 = r11 - r5
                int r5 = r0.f2780d
                int r14 = r12 - r5
                r0.f2779c = r11
                r0.f2780d = r12
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.mo3772a((int) r6, (int) r7, (int[]) r8, (int[]) r9, (int) r10)
                r6 = 1
                if (r5 == 0) goto L_0x0051
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x0051:
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$a r3 = r3.f2668l
                if (r3 == 0) goto L_0x00db
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                r3.mo3811e()
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                r3.mo3853l()
                java.lang.String r3 = "RV Scroll"
                android.support.p005v4.p014f.C0279c.m1263a(r3)
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r5 = r3.f2613B
                r3.mo3765a((android.support.p020v7.widget.C0787av.C0823t) r5)
                if (r13 == 0) goto L_0x0082
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$h r3 = r3.f2669m
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$o r5 = r5.f2660d
                android.support.v7.widget.av r7 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r7 = r7.f2613B
                int r3 = r3.mo3124a((int) r13, (android.support.p020v7.widget.C0787av.C0816o) r5, (android.support.p020v7.widget.C0787av.C0823t) r7)
                int r5 = r13 - r3
                goto L_0x0084
            L_0x0082:
                r3 = 0
                r5 = 0
            L_0x0084:
                if (r14 == 0) goto L_0x0099
                android.support.v7.widget.av r7 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$h r7 = r7.f2669m
                android.support.v7.widget.av r8 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$o r8 = r8.f2660d
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r9 = r9.f2613B
                int r7 = r7.mo3144b((int) r14, (android.support.p020v7.widget.C0787av.C0816o) r8, (android.support.p020v7.widget.C0787av.C0823t) r9)
                int r8 = r14 - r7
                goto L_0x009b
            L_0x0099:
                r7 = 0
                r8 = 0
            L_0x009b:
                android.support.p005v4.p014f.C0279c.m1262a()
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                r9.mo3905x()
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                r9.mo3855m()
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                r9.mo3769a((boolean) r4)
                if (r2 == 0) goto L_0x00df
                boolean r9 = r2.mo4124b()
                if (r9 != 0) goto L_0x00df
                boolean r9 = r2.mo4125c()
                if (r9 == 0) goto L_0x00df
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$t r9 = r9.f2613B
                int r9 = r9.mo4136e()
                if (r9 != 0) goto L_0x00c9
                r2.mo4119a()
                goto L_0x00df
            L_0x00c9:
                int r10 = r2.mo4126d()
                if (r10 < r9) goto L_0x00d3
                int r9 = r9 - r6
                r2.mo4120a((int) r9)
            L_0x00d3:
                int r9 = r13 - r5
                int r10 = r14 - r8
                r2.m4457a(r9, r10)
                goto L_0x00df
            L_0x00db:
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
            L_0x00df:
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                java.util.ArrayList<android.support.v7.widget.av$g> r9 = r9.f2671o
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00ee
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                r9.invalidate()
            L_0x00ee:
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00fc
                android.support.v7.widget.av r9 = android.support.p020v7.widget.C0787av.this
                r9.mo3790c(r13, r14)
            L_0x00fc:
                android.support.v7.widget.av r15 = android.support.p020v7.widget.C0787av.this
                r20 = 0
                r21 = 1
                r16 = r3
                r17 = r7
                r18 = r5
                r19 = r8
                boolean r9 = r15.mo3770a((int) r16, (int) r17, (int) r18, (int) r19, (int[]) r20, (int) r21)
                if (r9 != 0) goto L_0x0152
                if (r5 != 0) goto L_0x0114
                if (r8 == 0) goto L_0x0152
            L_0x0114:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r5 == r11) goto L_0x0123
                if (r5 >= 0) goto L_0x011f
                int r15 = -r9
                goto L_0x0124
            L_0x011f:
                if (r5 <= 0) goto L_0x0123
                r15 = r9
                goto L_0x0124
            L_0x0123:
                r15 = 0
            L_0x0124:
                if (r8 == r12) goto L_0x012d
                if (r8 >= 0) goto L_0x012a
                int r9 = -r9
                goto L_0x012e
            L_0x012a:
                if (r8 <= 0) goto L_0x012d
                goto L_0x012e
            L_0x012d:
                r9 = 0
            L_0x012e:
                android.support.v7.widget.av r4 = android.support.p020v7.widget.C0787av.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x013b
                android.support.v7.widget.av r4 = android.support.p020v7.widget.C0787av.this
                r4.mo3802d(r15, r9)
            L_0x013b:
                if (r15 != 0) goto L_0x0145
                if (r5 == r11) goto L_0x0145
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x0152
            L_0x0145:
                if (r9 != 0) goto L_0x014f
                if (r8 == r12) goto L_0x014f
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x0152
            L_0x014f:
                r1.abortAnimation()
            L_0x0152:
                if (r3 != 0) goto L_0x0156
                if (r7 == 0) goto L_0x015b
            L_0x0156:
                android.support.v7.widget.av r4 = android.support.p020v7.widget.C0787av.this
                r4.mo3847i(r3, r7)
            L_0x015b:
                android.support.v7.widget.av r4 = android.support.p020v7.widget.C0787av.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x0168
                android.support.v7.widget.av r4 = android.support.p020v7.widget.C0787av.this
                r4.invalidate()
            L_0x0168:
                if (r14 == 0) goto L_0x0178
                android.support.v7.widget.av r4 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$h r4 = r4.f2669m
                boolean r4 = r4.mo3178e()
                if (r4 == 0) goto L_0x0178
                if (r7 != r14) goto L_0x0178
                r4 = 1
                goto L_0x0179
            L_0x0178:
                r4 = 0
            L_0x0179:
                if (r13 == 0) goto L_0x0189
                android.support.v7.widget.av r5 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.av$h r5 = r5.f2669m
                boolean r5 = r5.mo3175d()
                if (r5 == 0) goto L_0x0189
                if (r3 != r13) goto L_0x0189
                r3 = 1
                goto L_0x018a
            L_0x0189:
                r3 = 0
            L_0x018a:
                if (r13 != 0) goto L_0x018e
                if (r14 == 0) goto L_0x0195
            L_0x018e:
                if (r3 != 0) goto L_0x0195
                if (r4 == 0) goto L_0x0193
                goto L_0x0195
            L_0x0193:
                r3 = 0
                goto L_0x0196
            L_0x0195:
                r3 = 1
            L_0x0196:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x01ba
                if (r3 != 0) goto L_0x01a7
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                boolean r1 = r1.mo3843h((int) r6)
                if (r1 != 0) goto L_0x01a7
                goto L_0x01ba
            L_0x01a7:
                r22.mo4139a()
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.am r1 = r1.f2682z
                if (r1 == 0) goto L_0x01d2
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.am r1 = r1.f2682z
                android.support.v7.widget.av r3 = android.support.p020v7.widget.C0787av.this
                r1.mo3620a((android.support.p020v7.widget.C0787av) r3, (int) r13, (int) r14)
                goto L_0x01d2
            L_0x01ba:
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = android.support.p020v7.widget.C0787av.f2605K
                if (r1 == 0) goto L_0x01cd
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                android.support.v7.widget.am$a r1 = r1.f2612A
                r1.mo3625a()
            L_0x01cd:
                android.support.v7.widget.av r1 = android.support.p020v7.widget.C0787av.this
                r1.mo3820g((int) r6)
            L_0x01d2:
                if (r2 == 0) goto L_0x01e5
                boolean r1 = r2.mo4124b()
                if (r1 == 0) goto L_0x01de
                r1 = 0
                r2.m4457a(r1, r1)
            L_0x01de:
                boolean r1 = r0.f2783g
                if (r1 != 0) goto L_0x01e5
                r2.mo4119a()
            L_0x01e5:
                r22.m4485d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0787av.C0825v.run():void");
        }
    }

    /* renamed from: android.support.v7.widget.av$w */
    public static abstract class C0826w {

        /* renamed from: o */
        private static final List<Object> f2784o = Collections.EMPTY_LIST;

        /* renamed from: a */
        public final View f2785a;

        /* renamed from: b */
        WeakReference<C0787av> f2786b;

        /* renamed from: c */
        int f2787c = -1;

        /* renamed from: d */
        int f2788d = -1;

        /* renamed from: e */
        long f2789e = -1;

        /* renamed from: f */
        int f2790f = -1;

        /* renamed from: g */
        int f2791g = -1;

        /* renamed from: h */
        C0826w f2792h = null;

        /* renamed from: i */
        C0826w f2793i = null;

        /* renamed from: j */
        List<Object> f2794j = null;

        /* renamed from: k */
        List<Object> f2795k = null;

        /* renamed from: l */
        int f2796l = -1;

        /* renamed from: m */
        C0787av f2797m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f2798n;

        /* renamed from: p */
        private int f2799p = 0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C0816o f2800q = null;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public boolean f2801r = false;

        /* renamed from: s */
        private int f2802s = 0;

        public C0826w(View view) {
            if (view != null) {
                this.f2785a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public boolean m4494A() {
            return (this.f2798n & 16) == 0 && C0388q.m1654b(this.f2785a);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4497a(C0787av avVar) {
            this.f2802s = C0388q.m1657d(this.f2785a);
            avVar.mo3773a(this, 4);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m4501b(C0787av avVar) {
            avVar.mo3773a(this, this.f2802s);
            this.f2802s = 0;
        }

        /* renamed from: y */
        private void m4505y() {
            if (this.f2794j == null) {
                this.f2794j = new ArrayList();
                this.f2795k = Collections.unmodifiableList(this.f2794j);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public boolean m4506z() {
            return (this.f2798n & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4148a() {
            this.f2788d = -1;
            this.f2791g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4149a(int i, int i2) {
            this.f2798n = (i & i2) | (this.f2798n & (i2 ^ -1));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4150a(int i, int i2, boolean z) {
            mo4157b(8);
            mo4151a(i2, z);
            this.f2787c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4151a(int i, boolean z) {
            if (this.f2788d == -1) {
                this.f2788d = this.f2787c;
            }
            if (this.f2791g == -1) {
                this.f2791g = this.f2787c;
            }
            if (z) {
                this.f2791g += i;
            }
            this.f2787c += i;
            if (this.f2785a.getLayoutParams() != null) {
                ((C0809i) this.f2785a.getLayoutParams()).f2727e = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4152a(C0816o oVar, boolean z) {
            this.f2800q = oVar;
            this.f2801r = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4153a(Object obj) {
            if (obj == null) {
                mo4157b(1024);
            } else if ((1024 & this.f2798n) == 0) {
                m4505y();
                this.f2794j.add(obj);
            }
        }

        /* renamed from: a */
        public final void mo4154a(boolean z) {
            int i;
            this.f2799p = z ? this.f2799p - 1 : this.f2799p + 1;
            int i2 = this.f2799p;
            if (i2 < 0) {
                this.f2799p = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                i = this.f2798n | 16;
            } else if (z && this.f2799p == 0) {
                i = this.f2798n & -17;
            } else {
                return;
            }
            this.f2798n = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4155a(int i) {
            return (i & this.f2798n) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4156b() {
            if (this.f2788d == -1) {
                this.f2788d = this.f2787c;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4157b(int i) {
            this.f2798n = i | this.f2798n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4158c() {
            return (this.f2798n & 128) != 0;
        }

        /* renamed from: d */
        public final int mo4159d() {
            int i = this.f2791g;
            return i == -1 ? this.f2787c : i;
        }

        /* renamed from: e */
        public final int mo4160e() {
            C0787av avVar = this.f2797m;
            if (avVar == null) {
                return -1;
            }
            return avVar.mo3798d(this);
        }

        /* renamed from: f */
        public final int mo4161f() {
            return this.f2788d;
        }

        /* renamed from: g */
        public final long mo4162g() {
            return this.f2789e;
        }

        /* renamed from: h */
        public final int mo4163h() {
            return this.f2790f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo4164i() {
            return this.f2800q != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4165j() {
            this.f2800q.mo4097c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4166k() {
            return (this.f2798n & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo4167l() {
            this.f2798n &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo4168m() {
            this.f2798n &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo4169n() {
            return (this.f2798n & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo4170o() {
            return (this.f2798n & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4171p() {
            return (this.f2798n & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4172q() {
            return (this.f2798n & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4173r() {
            return (this.f2798n & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4174s() {
            return (this.f2798n & 512) != 0 || mo4169n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4175t() {
            List<Object> list = this.f2794j;
            if (list != null) {
                list.clear();
            }
            this.f2798n &= -1025;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f2787c + " id=" + this.f2789e + ", oldPos=" + this.f2788d + ", pLpos:" + this.f2791g);
            if (mo4164i()) {
                sb.append(" scrap ");
                sb.append(this.f2801r ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4169n()) {
                sb.append(" invalid");
            }
            if (!mo4171p()) {
                sb.append(" unbound");
            }
            if (mo4170o()) {
                sb.append(" update");
            }
            if (mo4172q()) {
                sb.append(" removed");
            }
            if (mo4158c()) {
                sb.append(" ignored");
            }
            if (mo4173r()) {
                sb.append(" tmpDetached");
            }
            if (!mo4179w()) {
                sb.append(" not recyclable(" + this.f2799p + ")");
            }
            if (mo4174s()) {
                sb.append(" undefined adapter position");
            }
            if (this.f2785a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public List<Object> mo4177u() {
            if ((this.f2798n & 1024) != 0) {
                return f2784o;
            }
            List<Object> list = this.f2794j;
            return (list == null || list.size() == 0) ? f2784o : this.f2795k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4178v() {
            this.f2798n = 0;
            this.f2787c = -1;
            this.f2788d = -1;
            this.f2789e = -1;
            this.f2791g = -1;
            this.f2799p = 0;
            this.f2792h = null;
            this.f2793i = null;
            mo4175t();
            this.f2802s = 0;
            this.f2796l = -1;
            C0787av.m4071c(this);
        }

        /* renamed from: w */
        public final boolean mo4179w() {
            return (this.f2798n & 16) == 0 && !C0388q.m1654b(this.f2785a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4180x() {
            return (this.f2798n & 2) != 0;
        }
    }

    public C0787av(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0787av(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2619O = new C0818q();
        this.f2660d = new C0816o();
        this.f2663g = new C0863bp();
        this.f2665i = new Runnable() {
            public void run() {
                if (C0787av.this.f2675s && !C0787av.this.isLayoutRequested()) {
                    if (!C0787av.this.f2672p) {
                        C0787av.this.requestLayout();
                    } else if (C0787av.this.f2677u) {
                        C0787av.this.f2676t = true;
                    } else {
                        C0787av.this.mo3800d();
                    }
                }
            }
        };
        this.f2666j = new Rect();
        this.f2621Q = new Rect();
        this.f2667k = new RectF();
        this.f2671o = new ArrayList<>();
        this.f2622R = new ArrayList<>();
        this.f2624T = 0;
        this.f2679w = false;
        this.f2635ab = 0;
        this.f2636ac = 0;
        this.f2680x = new C0739ag();
        this.f2641ah = 0;
        this.f2642ai = -1;
        this.f2652as = Float.MIN_VALUE;
        this.f2653at = Float.MIN_VALUE;
        boolean z = true;
        this.f2654au = true;
        this.f2681y = new C0825v();
        this.f2612A = f2605K ? new C0762am.C0764a() : null;
        this.f2613B = new C0823t();
        this.f2614C = false;
        this.f2615D = false;
        this.f2657ax = new C0802f();
        this.f2616E = false;
        this.f2659az = new int[2];
        this.f2629aB = new int[2];
        this.f2630aC = new int[2];
        this.f2631aD = new int[2];
        this.f2618G = new ArrayList();
        this.f2632aE = new Runnable() {
            public void run() {
                if (C0787av.this.f2680x != null) {
                    C0787av.this.f2680x.mo3559a();
                }
                C0787av.this.f2616E = false;
            }
        };
        this.f2633aF = new C0863bp.C0865b() {
            /* renamed from: a */
            public void mo3910a(C0826w wVar) {
                C0787av.this.f2669m.mo3986a(wVar.f2785a, C0787av.this.f2660d);
            }

            /* renamed from: a */
            public void mo3911a(C0826w wVar, C0798e.C0801c cVar, C0798e.C0801c cVar2) {
                C0787av.this.f2660d.mo4097c(wVar);
                C0787av.this.mo3783b(wVar, cVar, cVar2);
            }

            /* renamed from: b */
            public void mo3912b(C0826w wVar, C0798e.C0801c cVar, C0798e.C0801c cVar2) {
                C0787av.this.mo3767a(wVar, cVar, cVar2);
            }

            /* renamed from: c */
            public void mo3913c(C0826w wVar, C0798e.C0801c cVar, C0798e.C0801c cVar2) {
                wVar.mo4154a(false);
                if (C0787av.this.f2679w) {
                    if (!C0787av.this.f2680x.mo3942a(wVar, wVar, cVar, cVar2)) {
                        return;
                    }
                } else if (!C0787av.this.f2680x.mo3944c(wVar, cVar, cVar2)) {
                    return;
                }
                C0787av.this.mo3870p();
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2604J, i, 0);
            this.f2664h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2664h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2648ao = viewConfiguration.getScaledTouchSlop();
        this.f2652as = C0400r.m1771a(viewConfiguration, context);
        this.f2653at = C0400r.m1772b(viewConfiguration, context);
        this.f2650aq = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2651ar = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2680x.mo3940a(this.f2657ax);
        mo3779b();
        m4037A();
        if (C0388q.m1657d(this) == 0) {
            C0388q.m1639a((View) this, 1);
        }
        this.f2627W = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0827aw(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0621a.C0623b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C0621a.C0623b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0621a.C0623b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f2674r = obtainStyledAttributes2.getBoolean(C0621a.C0623b.RecyclerView_fastScrollEnabled, false);
            if (this.f2674r) {
                mo3760a((StateListDrawable) obtainStyledAttributes2.getDrawable(C0621a.C0623b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0621a.C0623b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0621a.C0623b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0621a.C0623b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m4056a(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2603I, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m4037A() {
        this.f2662f = new C0734ad(new C0734ad.C0736b() {
            /* renamed from: a */
            public int mo3516a() {
                return C0787av.this.getChildCount();
            }

            /* renamed from: a */
            public int mo3517a(View view) {
                return C0787av.this.indexOfChild(view);
            }

            /* renamed from: a */
            public void mo3518a(int i) {
                View childAt = C0787av.this.getChildAt(i);
                if (childAt != null) {
                    C0787av.this.mo3852k(childAt);
                    childAt.clearAnimation();
                }
                C0787av.this.removeViewAt(i);
            }

            /* renamed from: a */
            public void mo3519a(View view, int i) {
                C0787av.this.addView(view, i);
                C0787av.this.mo3854l(view);
            }

            /* renamed from: a */
            public void mo3520a(View view, int i, ViewGroup.LayoutParams layoutParams) {
                C0826w e = C0787av.m4073e(view);
                if (e != null) {
                    if (e.mo4173r() || e.mo4158c()) {
                        e.mo4168m();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + e + C0787av.this.mo3754a());
                    }
                }
                C0787av.this.attachViewToParent(view, i, layoutParams);
            }

            /* renamed from: b */
            public C0826w mo3521b(View view) {
                return C0787av.m4073e(view);
            }

            /* renamed from: b */
            public View mo3522b(int i) {
                return C0787av.this.getChildAt(i);
            }

            /* renamed from: b */
            public void mo3523b() {
                int a = mo3516a();
                for (int i = 0; i < a; i++) {
                    View b = mo3522b(i);
                    C0787av.this.mo3852k(b);
                    b.clearAnimation();
                }
                C0787av.this.removeAllViews();
            }

            /* renamed from: c */
            public void mo3524c(int i) {
                C0826w e;
                View b = mo3522b(i);
                if (!(b == null || (e = C0787av.m4073e(b)) == null)) {
                    if (!e.mo4173r() || e.mo4158c()) {
                        e.mo4157b(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + e + C0787av.this.mo3754a());
                    }
                }
                C0787av.this.detachViewFromParent(i);
            }

            /* renamed from: c */
            public void mo3525c(View view) {
                C0826w e = C0787av.m4073e(view);
                if (e != null) {
                    e.m4497a(C0787av.this);
                }
            }

            /* renamed from: d */
            public void mo3526d(View view) {
                C0826w e = C0787av.m4073e(view);
                if (e != null) {
                    e.m4501b(C0787av.this);
                }
            }
        });
    }

    /* renamed from: B */
    private boolean m4038B() {
        int b = this.f2662f.mo3496b();
        for (int i = 0; i < b; i++) {
            C0826w e = m4073e(this.f2662f.mo3498b(i));
            if (e != null && !e.mo4158c() && e.mo4180x()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m4039C() {
        this.f2681y.mo4145b();
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo3969G();
        }
    }

    /* renamed from: D */
    private void m4040D() {
        boolean z;
        EdgeEffect edgeEffect = this.f2637ad;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f2637ad.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f2638ae;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f2638ae.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2639af;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f2639af.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2640ag;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f2640ag.isFinished();
        }
        if (z) {
            C0388q.m1655c(this);
        }
    }

    /* renamed from: E */
    private void m4041E() {
        VelocityTracker velocityTracker = this.f2643aj;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo3820g(0);
        m4040D();
    }

    /* renamed from: F */
    private void m4042F() {
        m4041E();
        setScrollState(0);
    }

    /* renamed from: G */
    private void m4043G() {
        int i = this.f2626V;
        this.f2626V = 0;
        if (i != 0 && mo3856n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0324a.m1420a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: H */
    private boolean m4044H() {
        return this.f2680x != null && this.f2669m.mo3147b();
    }

    /* renamed from: I */
    private void m4045I() {
        if (this.f2679w) {
            this.f2661e.mo4389a();
            this.f2669m.mo3138a(this);
        }
        if (m4044H()) {
            this.f2661e.mo4394b();
        } else {
            this.f2661e.mo4398e();
        }
        boolean z = false;
        boolean z2 = this.f2614C || this.f2615D;
        this.f2613B.f2768i = this.f2675s && this.f2680x != null && (this.f2679w || z2 || this.f2669m.f2714u) && (!this.f2679w || this.f2668l.mo3933d());
        C0823t tVar = this.f2613B;
        if (tVar.f2768i && z2 && !this.f2679w && m4044H()) {
            z = true;
        }
        tVar.f2769j = z;
    }

    /* renamed from: J */
    private void m4046J() {
        C0826w wVar = null;
        View focusedChild = (!this.f2654au || !hasFocus() || this.f2668l == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            wVar = mo3799d(focusedChild);
        }
        if (wVar == null) {
            m4047K();
            return;
        }
        this.f2613B.f2771l = this.f2668l.mo3933d() ? wVar.mo4162g() : -1;
        this.f2613B.f2770k = this.f2679w ? -1 : wVar.mo4172q() ? wVar.f2788d : wVar.mo4160e();
        this.f2613B.f2772m = m4077m(wVar.f2785a);
    }

    /* renamed from: K */
    private void m4047K() {
        C0823t tVar = this.f2613B;
        tVar.f2771l = -1;
        tVar.f2770k = -1;
        tVar.f2772m = -1;
    }

    /* renamed from: L */
    private View m4048L() {
        C0826w b;
        int i = this.f2613B.f2770k != -1 ? this.f2613B.f2770k : 0;
        int e = this.f2613B.mo4136e();
        int i2 = i;
        while (i2 < e) {
            C0826w b2 = mo3777b(i2);
            if (b2 == null) {
                break;
            } else if (b2.f2785a.hasFocusable()) {
                return b2.f2785a;
            } else {
                i2++;
            }
        }
        int min = Math.min(e, i);
        while (true) {
            min--;
            if (min < 0 || (b = mo3777b(min)) == null) {
                return null;
            }
            if (b.f2785a.hasFocusable()) {
                return b.f2785a;
            }
        }
    }

    /* renamed from: M */
    private void m4049M() {
        View view;
        if (this.f2654au && this.f2668l != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f2607M || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f2662f.mo3501c(focusedChild)) {
                            return;
                        }
                    } else if (this.f2662f.mo3496b() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                C0826w a = (this.f2613B.f2771l == -1 || !this.f2668l.mo3933d()) ? null : mo3753a(this.f2613B.f2771l);
                if (a != null && !this.f2662f.mo3501c(a.f2785a) && a.f2785a.hasFocusable()) {
                    view2 = a.f2785a;
                } else if (this.f2662f.mo3496b() > 0) {
                    view2 = m4048L();
                }
                if (view2 != null) {
                    if (((long) this.f2613B.f2772m) == -1 || (view = view2.findViewById(this.f2613B.f2772m)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: N */
    private void m4050N() {
        boolean z = true;
        this.f2613B.mo4130a(1);
        mo3765a(this.f2613B);
        this.f2613B.f2767h = false;
        mo3811e();
        this.f2663g.mo4333a();
        mo3853l();
        m4045I();
        m4046J();
        C0823t tVar = this.f2613B;
        if (!tVar.f2768i || !this.f2615D) {
            z = false;
        }
        tVar.f2766g = z;
        this.f2615D = false;
        this.f2614C = false;
        C0823t tVar2 = this.f2613B;
        tVar2.f2765f = tVar2.f2769j;
        this.f2613B.f2763d = this.f2668l.mo247a();
        m4064a(this.f2659az);
        if (this.f2613B.f2768i) {
            int b = this.f2662f.mo3496b();
            for (int i = 0; i < b; i++) {
                C0826w e = m4073e(this.f2662f.mo3498b(i));
                if (!e.mo4158c() && (!e.mo4169n() || this.f2668l.mo3933d())) {
                    this.f2663g.mo4335a(e, this.f2680x.mo3939a(this.f2613B, e, C0798e.m4205e(e), e.mo4177u()));
                    if (this.f2613B.f2766g && e.mo4180x() && !e.mo4172q() && !e.mo4158c() && !e.mo4169n()) {
                        this.f2663g.mo4334a(mo3751a(e), e);
                    }
                }
            }
        }
        if (this.f2613B.f2769j) {
            mo3878s();
            boolean z2 = this.f2613B.f2764e;
            C0823t tVar3 = this.f2613B;
            tVar3.f2764e = false;
            this.f2669m.mo3148c(this.f2660d, tVar3);
            this.f2613B.f2764e = z2;
            for (int i2 = 0; i2 < this.f2662f.mo3496b(); i2++) {
                C0826w e2 = m4073e(this.f2662f.mo3498b(i2));
                if (!e2.mo4158c() && !this.f2663g.mo4343d(e2)) {
                    int e3 = C0798e.m4205e(e2);
                    boolean a = e2.mo4155a(8192);
                    if (!a) {
                        e3 |= 4096;
                    }
                    C0798e.C0801c a2 = this.f2680x.mo3939a(this.f2613B, e2, e3, e2.mo4177u());
                    if (a) {
                        mo3766a(e2, a2);
                    } else {
                        this.f2663g.mo4340b(e2, a2);
                    }
                }
            }
        }
        mo3901t();
        mo3855m();
        mo3769a(false);
        this.f2613B.f2762c = 2;
    }

    /* renamed from: O */
    private void m4051O() {
        mo3811e();
        mo3853l();
        this.f2613B.mo4130a(6);
        this.f2661e.mo4398e();
        this.f2613B.f2763d = this.f2668l.mo247a();
        C0823t tVar = this.f2613B;
        tVar.f2761b = 0;
        tVar.f2765f = false;
        this.f2669m.mo3148c(this.f2660d, tVar);
        C0823t tVar2 = this.f2613B;
        tVar2.f2764e = false;
        this.f2620P = null;
        tVar2.f2768i = tVar2.f2768i && this.f2680x != null;
        this.f2613B.f2762c = 4;
        mo3855m();
        mo3769a(false);
    }

    /* renamed from: P */
    private void m4052P() {
        this.f2613B.mo4130a(4);
        mo3811e();
        mo3853l();
        C0823t tVar = this.f2613B;
        tVar.f2762c = 1;
        if (tVar.f2768i) {
            for (int b = this.f2662f.mo3496b() - 1; b >= 0; b--) {
                C0826w e = m4073e(this.f2662f.mo3498b(b));
                if (!e.mo4158c()) {
                    long a = mo3751a(e);
                    C0798e.C0801c a2 = this.f2680x.mo3938a(this.f2613B, e);
                    C0826w a3 = this.f2663g.mo4332a(a);
                    if (a3 != null && !a3.mo4158c()) {
                        boolean a4 = this.f2663g.mo4337a(a3);
                        boolean a5 = this.f2663g.mo4337a(e);
                        if (!a4 || a3 != e) {
                            C0798e.C0801c b2 = this.f2663g.mo4338b(a3);
                            this.f2663g.mo4342c(e, a2);
                            C0798e.C0801c c = this.f2663g.mo4341c(e);
                            if (b2 == null) {
                                m4055a(a, e, a3);
                            } else {
                                m4058a(a3, e, b2, c, a4, a5);
                            }
                        }
                    }
                    this.f2663g.mo4342c(e, a2);
                }
            }
            this.f2663g.mo4336a(this.f2633aF);
        }
        this.f2669m.mo4000b(this.f2660d);
        C0823t tVar2 = this.f2613B;
        tVar2.f2760a = tVar2.f2763d;
        this.f2679w = false;
        C0823t tVar3 = this.f2613B;
        tVar3.f2768i = false;
        tVar3.f2769j = false;
        this.f2669m.f2714u = false;
        if (this.f2660d.f2736b != null) {
            this.f2660d.f2736b.clear();
        }
        if (this.f2669m.f2718y) {
            C0804h hVar = this.f2669m;
            hVar.f2717x = 0;
            hVar.f2718y = false;
            this.f2660d.mo4090b();
        }
        this.f2669m.mo3136a(this.f2613B);
        mo3855m();
        mo3769a(false);
        this.f2663g.mo4333a();
        int[] iArr = this.f2659az;
        if (m4076k(iArr[0], iArr[1])) {
            mo3847i(0, 0);
        }
        m4049M();
        m4047K();
    }

    /* renamed from: a */
    private String m4053a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return C0787av.class.getPackage().getName() + '.' + str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4054a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo3819g()
            android.widget.EdgeEffect r3 = r6.f2637ad
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            android.support.p005v4.widget.C0498g.m2333a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.mo3840h()
            android.widget.EdgeEffect r3 = r6.f2639af
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.mo3846i()
            android.widget.EdgeEffect r9 = r6.f2638ae
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            android.support.p005v4.widget.C0498g.m2333a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.mo3849j()
            android.widget.EdgeEffect r9 = r6.f2640ag
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            android.support.p005v4.widget.C0498g.m2333a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            android.support.p005v4.p017i.C0388q.m1655c(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0787av.m4054a(float, float, float, float):void");
    }

    /* renamed from: a */
    private void m4055a(long j, C0826w wVar, C0826w wVar2) {
        int b = this.f2662f.mo3496b();
        for (int i = 0; i < b; i++) {
            C0826w e = m4073e(this.f2662f.mo3498b(i));
            if (e != wVar && mo3751a(e) == j) {
                C0794a aVar = this.f2668l;
                if (aVar == null || !aVar.mo3933d()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e + " \n View Holder 2:" + wVar + mo3754a());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e + " \n View Holder 2:" + wVar + mo3754a());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + wVar2 + " cannot be found but it is necessary for " + wVar + mo3754a());
    }

    /* renamed from: a */
    private void m4056a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m4053a(context, trim);
                try {
                    Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(a).asSubclass(C0804h.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f2608N);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0804h) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a, e7);
                }
            }
        }
    }

    /* renamed from: a */
    private void m4057a(C0794a aVar, boolean z, boolean z2) {
        C0794a aVar2 = this.f2668l;
        if (aVar2 != null) {
            aVar2.mo3926b((C0796c) this.f2619O);
            this.f2668l.mo3928b(this);
        }
        if (!z || z2) {
            mo3788c();
        }
        this.f2661e.mo4389a();
        C0794a aVar3 = this.f2668l;
        this.f2668l = aVar;
        if (aVar != null) {
            aVar.mo3923a((C0796c) this.f2619O);
            aVar.mo3925a(this);
        }
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo3974a(aVar3, this.f2668l);
        }
        this.f2660d.mo4082a(aVar3, this.f2668l, z);
        this.f2613B.f2764e = true;
        mo3902u();
    }

    /* renamed from: a */
    private void m4058a(C0826w wVar, C0826w wVar2, C0798e.C0801c cVar, C0798e.C0801c cVar2, boolean z, boolean z2) {
        wVar.mo4154a(false);
        if (z) {
            m4074e(wVar);
        }
        if (wVar != wVar2) {
            if (z2) {
                m4074e(wVar2);
            }
            wVar.f2792h = wVar2;
            m4074e(wVar);
            this.f2660d.mo4097c(wVar);
            wVar2.mo4154a(false);
            wVar2.f2793i = wVar;
        }
        if (this.f2680x.mo3942a(wVar, wVar2, cVar, cVar2)) {
            mo3870p();
        }
    }

    /* renamed from: a */
    static void m4062a(View view, Rect rect) {
        C0809i iVar = (C0809i) view.getLayoutParams();
        Rect rect2 = iVar.f2726d;
        rect.set((view.getLeft() - rect2.left) - iVar.leftMargin, (view.getTop() - rect2.top) - iVar.topMargin, view.getRight() + rect2.right + iVar.rightMargin, view.getBottom() + rect2.bottom + iVar.bottomMargin);
    }

    /* renamed from: a */
    private void m4063a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2666j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0809i) {
            C0809i iVar = (C0809i) layoutParams;
            if (!iVar.f2727e) {
                Rect rect = iVar.f2726d;
                this.f2666j.left -= rect.left;
                this.f2666j.right += rect.right;
                this.f2666j.top -= rect.top;
                this.f2666j.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2666j);
            offsetRectIntoDescendantCoords(view, this.f2666j);
        }
        this.f2669m.mo3993a(this, view, this.f2666j, !this.f2675s, view2 == null);
    }

    /* renamed from: a */
    private void m4064a(int[] iArr) {
        int b = this.f2662f.mo3496b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < b; i3++) {
            C0826w e = m4073e(this.f2662f.mo3498b(i3));
            if (!e.mo4158c()) {
                int d = e.mo4159d();
                if (d < i) {
                    i = d;
                }
                if (d > i2) {
                    i2 = d;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: a */
    private boolean m4065a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2623S = null;
        }
        int size = this.f2622R.size();
        int i = 0;
        while (i < size) {
            C0812l lVar = this.f2622R.get(i);
            if (!lVar.mo3603a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f2623S = lVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4066a(View view, View view2, int i) {
        boolean z = false;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i != 2 && i != 1) {
            return m4070b(view, view2, i);
        }
        boolean z2 = this.f2669m.mo4043s() == 1;
        if (i == 2) {
            z = true;
        }
        if (m4070b(view, view2, z ^ z2 ? 66 : 17)) {
            return true;
        }
        return m4070b(view, view2, i == 2 ? 130 : 33);
    }

    /* renamed from: b */
    private boolean m4069b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        C0812l lVar = this.f2623S;
        if (lVar != null) {
            if (action == 0) {
                this.f2623S = null;
            } else {
                lVar.mo3604b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f2623S = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f2622R.size();
            for (int i = 0; i < size; i++) {
                C0812l lVar2 = this.f2622R.get(i);
                if (lVar2.mo3603a(this, motionEvent)) {
                    this.f2623S = lVar2;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4070b(View view, View view2, int i) {
        this.f2666j.set(0, 0, view.getWidth(), view.getHeight());
        this.f2621Q.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f2666j);
        offsetDescendantRectToMyCoords(view2, this.f2621Q);
        if (i == 17) {
            return (this.f2666j.right > this.f2621Q.right || this.f2666j.left >= this.f2621Q.right) && this.f2666j.left > this.f2621Q.left;
        }
        if (i == 33) {
            return (this.f2666j.bottom > this.f2621Q.bottom || this.f2666j.top >= this.f2621Q.bottom) && this.f2666j.top > this.f2621Q.top;
        }
        if (i == 66) {
            return (this.f2666j.left < this.f2621Q.left || this.f2666j.right <= this.f2621Q.left) && this.f2666j.right < this.f2621Q.right;
        }
        if (i == 130) {
            return (this.f2666j.top < this.f2621Q.top || this.f2666j.bottom <= this.f2621Q.top) && this.f2666j.bottom < this.f2621Q.bottom;
        }
        throw new IllegalArgumentException("direction must be absolute. received:" + i + mo3754a());
    }

    /* renamed from: c */
    static void m4071c(C0826w wVar) {
        if (wVar.f2786b != null) {
            Object obj = wVar.f2786b.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        wVar.f2786b = null;
                        return;
                    } else if (view != wVar.f2785a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m4072c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2642ai) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2642ai = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f2646am = x;
            this.f2644ak = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f2647an = y;
            this.f2645al = y;
        }
    }

    /* renamed from: e */
    static C0826w m4073e(View view) {
        if (view == null) {
            return null;
        }
        return ((C0809i) view.getLayoutParams()).f2725c;
    }

    /* renamed from: e */
    private void m4074e(C0826w wVar) {
        View view = wVar.f2785a;
        boolean z = view.getParent() == this;
        this.f2660d.mo4097c(mo3778b(view));
        if (wVar.mo4173r()) {
            this.f2662f.mo3493a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f2662f.mo3495a(view, true);
        } else {
            this.f2662f.mo3503d(view);
        }
    }

    private C0382k getScrollingChildHelper() {
        if (this.f2628aA == null) {
            this.f2628aA = new C0382k(this);
        }
        return this.f2628aA;
    }

    /* renamed from: j */
    static C0787av m4075j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C0787av) {
            return (C0787av) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0787av j = m4075j(viewGroup.getChildAt(i));
            if (j != null) {
                return j;
            }
        }
        return null;
    }

    /* renamed from: k */
    private boolean m4076k(int i, int i2) {
        m4064a(this.f2659az);
        int[] iArr = this.f2659az;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: m */
    private int m4077m(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo3751a(C0826w wVar) {
        return this.f2668l.mo3933d() ? wVar.mo4162g() : (long) wVar.f2787c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0826w mo3752a(int i, boolean z) {
        int c = this.f2662f.mo3499c();
        C0826w wVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i2));
            if (e != null && !e.mo4172q()) {
                if (z) {
                    if (e.f2787c != i) {
                        continue;
                    }
                } else if (e.mo4159d() != i) {
                    continue;
                }
                if (!this.f2662f.mo3501c(e.f2785a)) {
                    return e;
                }
                wVar = e;
            }
        }
        return wVar;
    }

    /* renamed from: a */
    public C0826w mo3753a(long j) {
        C0794a aVar = this.f2668l;
        C0826w wVar = null;
        if (aVar != null && aVar.mo3933d()) {
            int c = this.f2662f.mo3499c();
            for (int i = 0; i < c; i++) {
                C0826w e = m4073e(this.f2662f.mo3502d(i));
                if (e != null && !e.mo4172q() && e.mo4162g() == j) {
                    if (!this.f2662f.mo3501c(e.f2785a)) {
                        return e;
                    }
                    wVar = e;
                }
            }
        }
        return wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3754a() {
        return " " + super.toString() + ", adapter:" + this.f2668l + ", layout:" + this.f2669m + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3755a(int i) {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo3174d(i);
            awakenScrollBars();
        }
    }

    /* renamed from: a */
    public void mo3756a(int i, int i2) {
        mo3757a(i, i2, (Interpolator) null);
    }

    /* renamed from: a */
    public void mo3757a(int i, int i2, Interpolator interpolator) {
        C0804h hVar = this.f2669m;
        if (hVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2677u) {
            if (!hVar.mo3175d()) {
                i = 0;
            }
            if (!this.f2669m.mo3178e()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.f2681y.mo4144a(i, i2, interpolator);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3758a(int i, int i2, Object obj) {
        int c = this.f2662f.mo3499c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.f2662f.mo3502d(i4);
            C0826w e = m4073e(d);
            if (e != null && !e.mo4158c() && e.f2787c >= i && e.f2787c < i3) {
                e.mo4157b(2);
                e.mo4153a(obj);
                ((C0809i) d.getLayoutParams()).f2727e = true;
            }
        }
        this.f2660d.mo4096c(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3759a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.f2662f.mo3499c();
        for (int i4 = 0; i4 < c; i4++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i4));
            if (e != null && !e.mo4158c()) {
                if (e.f2787c >= i3) {
                    e.mo4151a(-i2, z);
                } else if (e.f2787c >= i) {
                    e.mo4150a(i - 1, -i2, z);
                }
                this.f2613B.f2764e = true;
            }
        }
        this.f2660d.mo4081a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3760a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo3754a());
        }
        Resources resources = getContext().getResources();
        new C0752aj(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0621a.C0622a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0621a.C0622a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0621a.C0622a.fastscroll_margin));
    }

    /* renamed from: a */
    public void mo3761a(C0803g gVar) {
        mo3762a(gVar, -1);
    }

    /* renamed from: a */
    public void mo3762a(C0803g gVar, int i) {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo3164a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2671o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f2671o.add(gVar);
        } else {
            this.f2671o.add(i, gVar);
        }
        mo3872r();
        requestLayout();
    }

    /* renamed from: a */
    public void mo3763a(C0812l lVar) {
        this.f2622R.add(lVar);
    }

    /* renamed from: a */
    public void mo3764a(C0813m mVar) {
        if (this.f2656aw == null) {
            this.f2656aw = new ArrayList();
        }
        this.f2656aw.add(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3765a(C0823t tVar) {
        if (getScrollState() == 2) {
            OverScroller a = this.f2681y.f2781e;
            tVar.f2773n = a.getFinalX() - a.getCurrX();
            tVar.f2774o = a.getFinalY() - a.getCurrY();
            return;
        }
        tVar.f2773n = 0;
        tVar.f2774o = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3766a(C0826w wVar, C0798e.C0801c cVar) {
        wVar.mo4149a(0, 8192);
        if (this.f2613B.f2766g && wVar.mo4180x() && !wVar.mo4172q() && !wVar.mo4158c()) {
            this.f2663g.mo4334a(mo3751a(wVar), wVar);
        }
        this.f2663g.mo4335a(wVar, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3767a(C0826w wVar, C0798e.C0801c cVar, C0798e.C0801c cVar2) {
        wVar.mo4154a(false);
        if (this.f2680x.mo3943b(wVar, cVar, cVar2)) {
            mo3870p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3768a(String str) {
        if (mo3857o()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo3754a());
            }
            throw new IllegalStateException(str);
        } else if (this.f2636ac > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo3754a()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3769a(boolean z) {
        if (this.f2624T < 1) {
            this.f2624T = 1;
        }
        if (!z) {
            this.f2676t = false;
        }
        if (this.f2624T == 1) {
            if (z && this.f2676t && !this.f2677u && this.f2669m != null && this.f2668l != null) {
                mo3871q();
            }
            if (!this.f2677u) {
                this.f2676t = false;
            }
        }
        this.f2624T--;
    }

    /* renamed from: a */
    public boolean mo3770a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo1560a(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3771a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        mo3800d();
        if (this.f2668l != null) {
            mo3811e();
            mo3853l();
            C0279c.m1263a("RV Scroll");
            mo3765a(this.f2613B);
            if (i != 0) {
                i6 = this.f2669m.mo3124a(i, this.f2660d, this.f2613B);
                i5 = i - i6;
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (i2 != 0) {
                i4 = this.f2669m.mo3144b(i2, this.f2660d, this.f2613B);
                i3 = i2 - i4;
            } else {
                i4 = 0;
                i3 = 0;
            }
            C0279c.m1262a();
            mo3905x();
            mo3855m();
            mo3769a(false);
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f2671o.isEmpty()) {
            invalidate();
        }
        if (mo3770a(i6, i4, i5, i3, this.f2629aB, 0)) {
            int i7 = this.f2646am;
            int[] iArr = this.f2629aB;
            this.f2646am = i7 - iArr[0];
            this.f2647an -= iArr[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            }
            int[] iArr2 = this.f2631aD;
            int i8 = iArr2[0];
            int[] iArr3 = this.f2629aB;
            iArr2[0] = i8 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0379h.m1608a(motionEvent, 8194)) {
                m4054a(motionEvent.getX(), (float) i5, motionEvent.getY(), (float) i3);
            }
            mo3790c(i, i2);
        }
        if (!(i6 == 0 && i4 == 0)) {
            mo3847i(i6, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i6 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: a */
    public boolean mo3772a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo1562a(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3773a(C0826w wVar, int i) {
        if (mo3857o()) {
            wVar.f2796l = i;
            this.f2618G.add(wVar);
            return false;
        }
        C0388q.m1639a(wVar.f2785a, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3774a(View view) {
        mo3811e();
        boolean f = this.f2662f.mo3506f(view);
        if (f) {
            C0826w e = m4073e(view);
            this.f2660d.mo4097c(e);
            this.f2660d.mo4092b(e);
        }
        mo3769a(!f);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3775a(AccessibilityEvent accessibilityEvent) {
        if (!mo3857o()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0324a.m1419a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f2626V = a | this.f2626V;
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0804h hVar = this.f2669m;
        if (hVar == null || !hVar.mo3995a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public C0826w mo3777b(int i) {
        C0826w wVar = null;
        if (this.f2679w) {
            return null;
        }
        int c = this.f2662f.mo3499c();
        for (int i2 = 0; i2 < c; i2++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i2));
            if (e != null && !e.mo4172q() && mo3798d(e) == i) {
                if (!this.f2662f.mo3501c(e.f2785a)) {
                    return e;
                }
                wVar = e;
            }
        }
        return wVar;
    }

    /* renamed from: b */
    public C0826w mo3778b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4073e(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3779b() {
        this.f2661e = new C0884f(new C0884f.C0885a() {
            /* renamed from: a */
            public C0826w mo3914a(int i) {
                C0826w a = C0787av.this.mo3752a(i, true);
                if (a != null && !C0787av.this.f2662f.mo3501c(a.f2785a)) {
                    return a;
                }
                return null;
            }

            /* renamed from: a */
            public void mo3915a(int i, int i2) {
                C0787av.this.mo3759a(i, i2, true);
                C0787av avVar = C0787av.this;
                avVar.f2614C = true;
                avVar.f2613B.f2761b += i2;
            }

            /* renamed from: a */
            public void mo3916a(int i, int i2, Object obj) {
                C0787av.this.mo3758a(i, i2, obj);
                C0787av.this.f2615D = true;
            }

            /* renamed from: a */
            public void mo3917a(C0884f.C0886b bVar) {
                mo3921c(bVar);
            }

            /* renamed from: b */
            public void mo3918b(int i, int i2) {
                C0787av.this.mo3759a(i, i2, false);
                C0787av.this.f2614C = true;
            }

            /* renamed from: b */
            public void mo3919b(C0884f.C0886b bVar) {
                mo3921c(bVar);
            }

            /* renamed from: c */
            public void mo3920c(int i, int i2) {
                C0787av.this.mo3821g(i, i2);
                C0787av.this.f2614C = true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo3921c(C0884f.C0886b bVar) {
                int i = bVar.f2997a;
                if (i == 4) {
                    C0787av.this.f2669m.mo3141a(C0787av.this, bVar.f2998b, bVar.f3000d, bVar.f2999c);
                } else if (i != 8) {
                    switch (i) {
                        case 1:
                            C0787av.this.f2669m.mo3139a(C0787av.this, bVar.f2998b, bVar.f3000d);
                            return;
                        case 2:
                            C0787av.this.f2669m.mo3146b(C0787av.this, bVar.f2998b, bVar.f3000d);
                            return;
                        default:
                            return;
                    }
                } else {
                    C0787av.this.f2669m.mo3140a(C0787av.this, bVar.f2998b, bVar.f3000d, 1);
                }
            }

            /* renamed from: d */
            public void mo3922d(int i, int i2) {
                C0787av.this.mo3817f(i, i2);
                C0787av.this.f2614C = true;
            }
        });
    }

    /* renamed from: b */
    public void mo3780b(C0803g gVar) {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo3164a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2671o.remove(gVar);
        if (this.f2671o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo3872r();
        requestLayout();
    }

    /* renamed from: b */
    public void mo3781b(C0812l lVar) {
        this.f2622R.remove(lVar);
        if (this.f2623S == lVar) {
            this.f2623S = null;
        }
    }

    /* renamed from: b */
    public void mo3782b(C0813m mVar) {
        List<C0813m> list = this.f2656aw;
        if (list != null) {
            list.remove(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3783b(C0826w wVar, C0798e.C0801c cVar, C0798e.C0801c cVar2) {
        m4074e(wVar);
        wVar.mo4154a(false);
        if (this.f2680x.mo3941a(wVar, cVar, cVar2)) {
            mo3870p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3784b(boolean z) {
        this.f2635ab--;
        if (this.f2635ab < 1) {
            this.f2635ab = 0;
            if (z) {
                m4043G();
                mo3906y();
            }
        }
    }

    /* renamed from: b */
    public boolean mo3785b(int i, int i2) {
        C0804h hVar = this.f2669m;
        int i3 = 0;
        if (hVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f2677u) {
            return false;
        } else {
            boolean d = hVar.mo3175d();
            boolean e = this.f2669m.mo3178e();
            if (!d || Math.abs(i) < this.f2650aq) {
                i = 0;
            }
            if (!e || Math.abs(i2) < this.f2650aq) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = d || e;
                dispatchNestedFling(f, f2, z);
                C0811k kVar = this.f2649ap;
                if (kVar != null && kVar.mo4062a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (d) {
                        i3 = 1;
                    }
                    if (e) {
                        i3 |= 2;
                    }
                    mo3850j(i3, 1);
                    int i4 = this.f2651ar;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f2651ar;
                    this.f2681y.mo4140a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3786b(C0826w wVar) {
        C0798e eVar = this.f2680x;
        return eVar == null || eVar.mo3565a(wVar, wVar.mo4177u());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3787c(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0787av.mo3787c(android.view.View):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3788c() {
        C0798e eVar = this.f2680x;
        if (eVar != null) {
            eVar.mo3571d();
        }
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo4008c(this.f2660d);
            this.f2669m.mo4000b(this.f2660d);
        }
        this.f2660d.mo4078a();
    }

    /* renamed from: c */
    public void mo3789c(int i) {
        int b = this.f2662f.mo3496b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f2662f.mo3498b(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3790c(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f2637ad;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f2637ad.onRelease();
            z = this.f2637ad.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2639af;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2639af.onRelease();
            z |= this.f2639af.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2638ae;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2638ae.onRelease();
            z |= this.f2638ae.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2640ag;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2640ag.onRelease();
            z |= this.f2640ag.isFinished();
        }
        if (z) {
            C0388q.m1655c(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0809i) && this.f2669m.mo3143a((C0809i) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0804h hVar = this.f2669m;
        if (hVar != null && hVar.mo3175d()) {
            return this.f2669m.mo3177e(this.f2613B);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0804h hVar = this.f2669m;
        if (hVar != null && hVar.mo3175d()) {
            return this.f2669m.mo3170c(this.f2613B);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0804h hVar = this.f2669m;
        if (hVar != null && hVar.mo3175d()) {
            return this.f2669m.mo3181g(this.f2613B);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0804h hVar = this.f2669m;
        if (hVar != null && hVar.mo3178e()) {
            return this.f2669m.mo3180f(this.f2613B);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0804h hVar = this.f2669m;
        if (hVar != null && hVar.mo3178e()) {
            return this.f2669m.mo3173d(this.f2613B);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0804h hVar = this.f2669m;
        if (hVar != null && hVar.mo3178e()) {
            return this.f2669m.mo3183h(this.f2613B);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3798d(C0826w wVar) {
        if (wVar.mo4155a(524) || !wVar.mo4171p()) {
            return -1;
        }
        return this.f2661e.mo4395c(wVar.f2787c);
    }

    /* renamed from: d */
    public C0826w mo3799d(View view) {
        View c = mo3787c(view);
        if (c == null) {
            return null;
        }
        return mo3778b(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3800d() {
        if (!this.f2675s || this.f2679w) {
            C0279c.m1263a("RV FullInvalidate");
            mo3871q();
            C0279c.m1262a();
        } else if (this.f2661e.mo4397d()) {
            if (this.f2661e.mo4392a(4) && !this.f2661e.mo4392a(11)) {
                C0279c.m1263a("RV PartialInvalidate");
                mo3811e();
                mo3853l();
                this.f2661e.mo4394b();
                if (!this.f2676t) {
                    if (m4038B()) {
                        mo3871q();
                    } else {
                        this.f2661e.mo4396c();
                    }
                }
                mo3769a(true);
                mo3855m();
            } else if (this.f2661e.mo4397d()) {
                C0279c.m1263a("RV FullInvalidate");
                mo3871q();
            } else {
                return;
            }
            C0279c.m1262a();
        }
    }

    /* renamed from: d */
    public void mo3801d(int i) {
        int b = this.f2662f.mo3496b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f2662f.mo3498b(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3802d(int i, int i2) {
        if (i < 0) {
            mo3819g();
            this.f2637ad.onAbsorb(-i);
        } else if (i > 0) {
            mo3840h();
            this.f2639af.onAbsorb(i);
        }
        if (i2 < 0) {
            mo3846i();
            this.f2638ae.onAbsorb(-i2);
        } else if (i2 > 0) {
            mo3849j();
            this.f2640ag.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0388q.m1655c(this);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo1556a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo1555a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo1561a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo1559a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f2671o.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f2671o.get(i2).mo3599a(canvas, this, this.f2613B);
        }
        EdgeEffect edgeEffect = this.f2637ad;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2664h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f2637ad;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2638ae;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2664h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2638ae;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2639af;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2664h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f2639af;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2640ag;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2664h) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f2640ag;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f2680x != null && this.f2671o.size() > 0 && this.f2680x.mo3567b()) {
            z2 = true;
        }
        if (z2) {
            C0388q.m1655c(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3811e() {
        this.f2624T++;
        if (this.f2624T == 1 && !this.f2677u) {
            this.f2676t = false;
        }
    }

    /* renamed from: e */
    public void mo3812e(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3813e(int i, int i2) {
        setMeasuredDimension(C0804h.m4238a(i, getPaddingLeft() + getPaddingRight(), C0388q.m1662i(this)), C0804h.m4238a(i2, getPaddingTop() + getPaddingBottom(), C0388q.m1663j(this)));
    }

    /* renamed from: f */
    public int mo3814f(View view) {
        C0826w e = m4073e(view);
        if (e != null) {
            return e.mo4159d();
        }
        return -1;
    }

    /* renamed from: f */
    public void mo3815f() {
        setScrollState(0);
        m4039C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3816f(int i) {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo3293k(i);
        }
        mo3812e(i);
        C0813m mVar = this.f2655av;
        if (mVar != null) {
            mVar.mo4063a(this, i);
        }
        List<C0813m> list = this.f2656aw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2656aw.get(size).mo4063a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3817f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int c = this.f2662f.mo3499c();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i6));
            if (e != null && e.f2787c >= i5 && e.f2787c <= i4) {
                if (e.f2787c == i) {
                    e.mo4151a(i2 - i, false);
                } else {
                    e.mo4151a(i3, false);
                }
                this.f2613B.f2764e = true;
            }
        }
        this.f2660d.mo4080a(i, i2);
        requestLayout();
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f2669m.mo4016d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f2668l != null && this.f2669m != null && !mo3857o() && !this.f2677u;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                mo3800d();
                if (mo3787c(view) == null) {
                    return null;
                }
                mo3811e();
                view2 = this.f2669m.mo3130a(view, i, this.f2660d, this.f2613B);
                mo3769a(false);
            }
        } else {
            if (this.f2669m.mo3178e()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f2606L) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f2669m.mo3175d()) {
                int i3 = (this.f2669m.mo4043s() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f2606L) {
                    i = i3;
                }
            }
            if (z) {
                mo3800d();
                if (mo3787c(view) == null) {
                    return null;
                }
                mo3811e();
                this.f2669m.mo3130a(view, i, this.f2660d, this.f2613B);
                mo3769a(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m4066a(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m4063a(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3819g() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2637ad == null) {
            this.f2637ad = new EdgeEffect(getContext());
            if (this.f2664h) {
                edgeEffect = this.f2637ad;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f2637ad;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: g */
    public void mo3820g(int i) {
        getScrollingChildHelper().mo1566c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3821g(int i, int i2) {
        int c = this.f2662f.mo3499c();
        for (int i3 = 0; i3 < c; i3++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i3));
            if (e != null && !e.mo4158c() && e.f2787c >= i) {
                e.mo4151a(i2, false);
                this.f2613B.f2764e = true;
            }
        }
        this.f2660d.mo4091b(i, i2);
        requestLayout();
    }

    /* renamed from: g */
    public void mo3822g(View view) {
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            return hVar.mo3126a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3754a());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            return hVar.mo3127a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3754a());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            return hVar.mo3128a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3754a());
    }

    public C0794a getAdapter() {
        return this.f2668l;
    }

    public int getBaseline() {
        C0804h hVar = this.f2669m;
        return hVar != null ? hVar.mo4044t() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0797d dVar = this.f2658ay;
        return dVar == null ? super.getChildDrawingOrder(i, i2) : dVar.mo3937a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f2664h;
    }

    public C0827aw getCompatAccessibilityDelegate() {
        return this.f2617F;
    }

    public C0798e getItemAnimator() {
        return this.f2680x;
    }

    public C0804h getLayoutManager() {
        return this.f2669m;
    }

    public int getMaxFlingVelocity() {
        return this.f2651ar;
    }

    public int getMinFlingVelocity() {
        return this.f2650aq;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f2605K) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0811k getOnFlingListener() {
        return this.f2649ap;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2654au;
    }

    public C0814n getRecycledViewPool() {
        return this.f2660d.mo4106g();
    }

    public int getScrollState() {
        return this.f2641ah;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3840h() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2639af == null) {
            this.f2639af = new EdgeEffect(getContext());
            if (this.f2664h) {
                edgeEffect = this.f2639af;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f2639af;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: h */
    public void mo3841h(int i, int i2) {
    }

    /* renamed from: h */
    public void mo3842h(View view) {
    }

    /* renamed from: h */
    public boolean mo3843h(int i) {
        return getScrollingChildHelper().mo1557a(i);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo1563b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Rect mo3845i(View view) {
        C0809i iVar = (C0809i) view.getLayoutParams();
        if (!iVar.f2727e) {
            return iVar.f2726d;
        }
        if (this.f2613B.mo4132a() && (iVar.mo4058e() || iVar.mo4056c())) {
            return iVar.f2726d;
        }
        Rect rect = iVar.f2726d;
        rect.set(0, 0, 0, 0);
        int size = this.f2671o.size();
        for (int i = 0; i < size; i++) {
            this.f2666j.set(0, 0, 0, 0);
            this.f2671o.get(i).mo3960a(this.f2666j, view, this, this.f2613B);
            rect.left += this.f2666j.left;
            rect.top += this.f2666j.top;
            rect.right += this.f2666j.right;
            rect.bottom += this.f2666j.bottom;
        }
        iVar.f2727e = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3846i() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2638ae == null) {
            this.f2638ae = new EdgeEffect(getContext());
            if (this.f2664h) {
                edgeEffect = this.f2638ae;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f2638ae;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3847i(int i, int i2) {
        this.f2636ac++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo3841h(i, i2);
        C0813m mVar = this.f2655av;
        if (mVar != null) {
            mVar.mo3607a(this, i, i2);
        }
        List<C0813m> list = this.f2656aw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2656aw.get(size).mo3607a(this, i, i2);
            }
        }
        this.f2636ac--;
    }

    public boolean isAttachedToWindow() {
        return this.f2672p;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo1554a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3849j() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2640ag == null) {
            this.f2640ag = new EdgeEffect(getContext());
            if (this.f2664h) {
                edgeEffect = this.f2640ag;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f2640ag;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: j */
    public boolean mo3850j(int i, int i2) {
        return getScrollingChildHelper().mo1558a(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3851k() {
        this.f2640ag = null;
        this.f2638ae = null;
        this.f2639af = null;
        this.f2637ad = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3852k(View view) {
        C0826w e = m4073e(view);
        mo3842h(view);
        C0794a aVar = this.f2668l;
        if (!(aVar == null || e == null)) {
            aVar.mo3932d(e);
        }
        List<C0810j> list = this.f2634aa;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2634aa.get(size).mo4061b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3853l() {
        this.f2635ab++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3854l(View view) {
        C0826w e = m4073e(view);
        mo3822g(view);
        C0794a aVar = this.f2668l;
        if (!(aVar == null || e == null)) {
            aVar.mo3931c(e);
        }
        List<C0810j> list = this.f2634aa;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2634aa.get(size).mo4060a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3855m() {
        mo3784b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3856n() {
        AccessibilityManager accessibilityManager = this.f2627W;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: o */
    public boolean mo3857o() {
        return this.f2635ab > 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f2635ab = r0
            r1 = 1
            r4.f2672p = r1
            boolean r2 = r4.f2675s
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f2675s = r1
            android.support.v7.widget.av$h r1 = r4.f2669m
            if (r1 == 0) goto L_0x001e
            r1.mo4009c((android.support.p020v7.widget.C0787av) r4)
        L_0x001e:
            r4.f2616E = r0
            boolean r0 = f2605K
            if (r0 == 0) goto L_0x0069
            java.lang.ThreadLocal<android.support.v7.widget.am> r0 = android.support.p020v7.widget.C0762am.f2498a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.am r0 = (android.support.p020v7.widget.C0762am) r0
            r4.f2682z = r0
            android.support.v7.widget.am r0 = r4.f2682z
            if (r0 != 0) goto L_0x0064
            android.support.v7.widget.am r0 = new android.support.v7.widget.am
            r0.<init>()
            r4.f2682z = r0
            android.view.Display r0 = android.support.p005v4.p017i.C0388q.m1636A(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            android.support.v7.widget.am r1 = r4.f2682z
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f2502d = r2
            java.lang.ThreadLocal<android.support.v7.widget.am> r0 = android.support.p020v7.widget.C0762am.f2498a
            android.support.v7.widget.am r1 = r4.f2682z
            r0.set(r1)
        L_0x0064:
            android.support.v7.widget.am r0 = r4.f2682z
            r0.mo3619a((android.support.p020v7.widget.C0787av) r4)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0787av.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0798e eVar = this.f2680x;
        if (eVar != null) {
            eVar.mo3571d();
        }
        mo3815f();
        this.f2672p = false;
        C0804h hVar = this.f2669m;
        if (hVar != null) {
            hVar.mo4002b(this, this.f2660d);
        }
        this.f2618G.clear();
        removeCallbacks(this.f2632aE);
        this.f2663g.mo4339b();
        if (f2605K) {
            this.f2682z.mo3621b(this);
            this.f2682z = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2671o.size();
        for (int i = 0; i < size; i++) {
            this.f2671o.get(i).mo3962b(canvas, this, this.f2613B);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f2669m != null && !this.f2677u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2669m.mo3178e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2669m.mo3175d()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo3771a((int) (f * this.f2652as), (int) (f2 * this.f2653at), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2669m.mo3178e()) {
                        f2 = -axisValue;
                    } else if (this.f2669m.mo3175d()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo3771a((int) (f * this.f2652as), (int) (f2 * this.f2653at), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo3771a((int) (f * this.f2652as), (int) (f2 * this.f2653at), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f2677u) {
            return false;
        }
        if (m4065a(motionEvent)) {
            m4042F();
            return true;
        }
        C0804h hVar = this.f2669m;
        if (hVar == null) {
            return false;
        }
        boolean d = hVar.mo3175d();
        boolean e = this.f2669m.mo3178e();
        if (this.f2643aj == null) {
            this.f2643aj = VelocityTracker.obtain();
        }
        this.f2643aj.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.f2625U) {
                    this.f2625U = false;
                }
                this.f2642ai = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f2646am = x;
                this.f2644ak = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f2647an = y;
                this.f2645al = y;
                if (this.f2641ah == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.f2631aD;
                iArr[1] = 0;
                iArr[0] = 0;
                int i = d ? 1 : 0;
                if (e) {
                    i |= 2;
                }
                mo3850j(i, 0);
                break;
            case 1:
                this.f2643aj.clear();
                mo3820g(0);
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f2642ai);
                if (findPointerIndex >= 0) {
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2641ah != 1) {
                        int i2 = x2 - this.f2644ak;
                        int i3 = y2 - this.f2645al;
                        if (!d || Math.abs(i2) <= this.f2648ao) {
                            z = false;
                        } else {
                            this.f2646am = x2;
                            z = true;
                        }
                        if (e && Math.abs(i3) > this.f2648ao) {
                            this.f2647an = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                            break;
                        }
                    }
                } else {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2642ai + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                break;
            case 3:
                m4042F();
                break;
            case 5:
                this.f2642ai = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2646am = x3;
                this.f2644ak = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2647an = y3;
                this.f2645al = y3;
                break;
            case 6:
                m4072c(motionEvent);
                break;
        }
        return this.f2641ah == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0279c.m1263a("RV OnLayout");
        mo3871q();
        C0279c.m1262a();
        this.f2675s = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0804h hVar = this.f2669m;
        if (hVar == null) {
            mo3813e(i, i2);
            return;
        }
        boolean z = false;
        if (hVar.f2716w) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f2669m.mo3976a(this.f2660d, this.f2613B, i, i2);
            if (!z && this.f2668l != null) {
                if (this.f2613B.f2762c == 1) {
                    m4050N();
                }
                this.f2669m.mo4007c(i, i2);
                this.f2613B.f2767h = true;
                m4051O();
                this.f2669m.mo4017d(i, i2);
                if (this.f2669m.mo3187k()) {
                    this.f2669m.mo4007c(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2613B.f2767h = true;
                    m4051O();
                    this.f2669m.mo4017d(i, i2);
                }
            }
        } else if (this.f2673q) {
            this.f2669m.mo3976a(this.f2660d, this.f2613B, i, i2);
        } else {
            if (this.f2678v) {
                mo3811e();
                mo3853l();
                m4045I();
                mo3855m();
                if (this.f2613B.f2769j) {
                    this.f2613B.f2765f = true;
                } else {
                    this.f2661e.mo4398e();
                    this.f2613B.f2765f = false;
                }
                this.f2678v = false;
                mo3769a(false);
            } else if (this.f2613B.f2769j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0794a aVar = this.f2668l;
            if (aVar != null) {
                this.f2613B.f2763d = aVar.mo247a();
            } else {
                this.f2613B.f2763d = 0;
            }
            mo3811e();
            this.f2669m.mo3976a(this.f2660d, this.f2613B, i, i2);
            mo3769a(false);
            this.f2613B.f2765f = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo3857o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0819r)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f2620P = (C0819r) parcelable;
        super.onRestoreInstanceState(this.f2620P.mo1402a());
        if (this.f2669m != null && this.f2620P.f2745a != null) {
            this.f2669m.mo3161a(this.f2620P.f2745a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0819r rVar = new C0819r(super.onSaveInstanceState());
        C0819r rVar2 = this.f2620P;
        if (rVar2 != null) {
            rVar.mo4111a(rVar2);
        } else {
            C0804h hVar = this.f2669m;
            rVar.f2745a = hVar != null ? hVar.mo3171c() : null;
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo3851k();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2 = false;
        if (this.f2677u || this.f2625U) {
            return false;
        }
        if (m4069b(motionEvent)) {
            m4042F();
            return true;
        }
        C0804h hVar = this.f2669m;
        if (hVar == null) {
            return false;
        }
        boolean d = hVar.mo3175d();
        boolean e = this.f2669m.mo3178e();
        if (this.f2643aj == null) {
            this.f2643aj = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f2631aD;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f2631aD;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        switch (actionMasked) {
            case 0:
                this.f2642ai = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f2646am = x;
                this.f2644ak = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f2647an = y;
                this.f2645al = y;
                int i5 = d ? 1 : 0;
                if (e) {
                    i5 |= 2;
                }
                mo3850j(i5, 0);
                break;
            case 1:
                this.f2643aj.addMovement(obtain);
                this.f2643aj.computeCurrentVelocity(1000, (float) this.f2651ar);
                float f = d ? -this.f2643aj.getXVelocity(this.f2642ai) : 0.0f;
                float f2 = e ? -this.f2643aj.getYVelocity(this.f2642ai) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !mo3785b((int) f, (int) f2)) {
                    setScrollState(0);
                }
                m4041E();
                z2 = true;
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f2642ai);
                if (findPointerIndex >= 0) {
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i6 = this.f2646am - x2;
                    int i7 = this.f2647an - y2;
                    if (mo3772a(i6, i7, this.f2630aC, this.f2629aB, 0)) {
                        int[] iArr3 = this.f2630aC;
                        i6 -= iArr3[0];
                        i7 -= iArr3[1];
                        int[] iArr4 = this.f2629aB;
                        obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                        int[] iArr5 = this.f2631aD;
                        int i8 = iArr5[0];
                        int[] iArr6 = this.f2629aB;
                        iArr5[0] = i8 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (this.f2641ah != 1) {
                        if (!d || Math.abs(i2) <= (i4 = this.f2648ao)) {
                            z = false;
                        } else {
                            i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                            z = true;
                        }
                        if (e && Math.abs(i) > (i3 = this.f2648ao)) {
                            i = i > 0 ? i - i3 : i + i3;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    if (this.f2641ah == 1) {
                        int[] iArr7 = this.f2629aB;
                        this.f2646am = x2 - iArr7[0];
                        this.f2647an = y2 - iArr7[1];
                        if (mo3771a(d ? i2 : 0, e ? i : 0, obtain)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (!(this.f2682z == null || (i2 == 0 && i == 0))) {
                            this.f2682z.mo3620a(this, i2, i);
                            break;
                        }
                    }
                } else {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2642ai + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                break;
            case 3:
                m4042F();
                break;
            case 5:
                this.f2642ai = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2646am = x3;
                this.f2644ak = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2647an = y3;
                this.f2645al = y3;
                break;
            case 6:
                m4072c(motionEvent);
                break;
        }
        if (!z2) {
            this.f2643aj.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3870p() {
        if (!this.f2616E && this.f2672p) {
            C0388q.m1647a((View) this, this.f2632aE);
            this.f2616E = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3871q() {
        String str;
        String str2;
        if (this.f2668l == null) {
            str = "RecyclerView";
            str2 = "No adapter attached; skipping layout";
        } else if (this.f2669m == null) {
            str = "RecyclerView";
            str2 = "No layout manager attached; skipping layout";
        } else {
            C0823t tVar = this.f2613B;
            tVar.f2767h = false;
            if (tVar.f2762c == 1) {
                m4050N();
            } else if (!this.f2661e.mo4399f() && this.f2669m.mo4048x() == getWidth() && this.f2669m.mo4049y() == getHeight()) {
                this.f2669m.mo4026f(this);
                m4052P();
                return;
            }
            this.f2669m.mo4026f(this);
            m4051O();
            m4052P();
            return;
        }
        Log.e(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3872r() {
        int c = this.f2662f.mo3499c();
        for (int i = 0; i < c; i++) {
            ((C0809i) this.f2662f.mo3502d(i).getLayoutParams()).f2727e = true;
        }
        this.f2660d.mo4109j();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0826w e = m4073e(view);
        if (e != null) {
            if (e.mo4173r()) {
                e.mo4168m();
            } else if (!e.mo4158c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e + mo3754a());
            }
        }
        view.clearAnimation();
        mo3852k(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2669m.mo3991a(this, this.f2613B, view, view2) && view2 != null) {
            m4063a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f2669m.mo3992a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f2622R.size();
        for (int i = 0; i < size; i++) {
            this.f2622R.get(i).mo3601a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f2624T != 0 || this.f2677u) {
            this.f2676t = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3878s() {
        int c = this.f2662f.mo3499c();
        for (int i = 0; i < c; i++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i));
            if (!e.mo4158c()) {
                e.mo4156b();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C0804h hVar = this.f2669m;
        if (hVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2677u) {
            boolean d = hVar.mo3175d();
            boolean e = this.f2669m.mo3178e();
            if (d || e) {
                if (!d) {
                    i = 0;
                }
                if (!e) {
                    i2 = 0;
                }
                mo3771a(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo3775a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0827aw awVar) {
        this.f2617F = awVar;
        C0388q.m1645a((View) this, (C0358b) this.f2617F);
    }

    public void setAdapter(C0794a aVar) {
        setLayoutFrozen(false);
        m4057a(aVar, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0797d dVar) {
        if (dVar != this.f2658ay) {
            this.f2658ay = dVar;
            setChildrenDrawingOrderEnabled(this.f2658ay != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f2664h) {
            mo3851k();
        }
        this.f2664h = z;
        super.setClipToPadding(z);
        if (this.f2675s) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.f2673q = z;
    }

    public void setItemAnimator(C0798e eVar) {
        C0798e eVar2 = this.f2680x;
        if (eVar2 != null) {
            eVar2.mo3571d();
            this.f2680x.mo3940a((C0798e.C0800b) null);
        }
        this.f2680x = eVar;
        C0798e eVar3 = this.f2680x;
        if (eVar3 != null) {
            eVar3.mo3940a(this.f2657ax);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f2660d.mo4079a(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f2677u) {
            mo3768a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f2677u = false;
                if (!(!this.f2676t || this.f2669m == null || this.f2668l == null)) {
                    requestLayout();
                }
                this.f2676t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2677u = true;
            this.f2625U = true;
            mo3815f();
        }
    }

    public void setLayoutManager(C0804h hVar) {
        if (hVar != this.f2669m) {
            mo3815f();
            if (this.f2669m != null) {
                C0798e eVar = this.f2680x;
                if (eVar != null) {
                    eVar.mo3571d();
                }
                this.f2669m.mo4008c(this.f2660d);
                this.f2669m.mo4000b(this.f2660d);
                this.f2660d.mo4078a();
                if (this.f2672p) {
                    this.f2669m.mo4002b(this, this.f2660d);
                }
                this.f2669m.mo4001b((C0787av) null);
                this.f2669m = null;
            } else {
                this.f2660d.mo4078a();
            }
            this.f2662f.mo3490a();
            this.f2669m = hVar;
            if (hVar != null) {
                if (hVar.f2710q == null) {
                    this.f2669m.mo4001b(this);
                    if (this.f2672p) {
                        this.f2669m.mo4009c(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + hVar + " is already attached to a RecyclerView:" + hVar.f2710q.mo3754a());
                }
            }
            this.f2660d.mo4090b();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo1553a(z);
    }

    public void setOnFlingListener(C0811k kVar) {
        this.f2649ap = kVar;
    }

    @Deprecated
    public void setOnScrollListener(C0813m mVar) {
        this.f2655av = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f2654au = z;
    }

    public void setRecycledViewPool(C0814n nVar) {
        this.f2660d.mo4083a(nVar);
    }

    public void setRecyclerListener(C0817p pVar) {
        this.f2670n = pVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f2641ah) {
            this.f2641ah = i;
            if (i != 2) {
                m4039C();
            }
            mo3816f(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                break;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f2648ao = i2;
    }

    public void setViewCacheExtension(C0824u uVar) {
        this.f2660d.mo4084a(uVar);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo1564b(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo1565c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3901t() {
        int c = this.f2662f.mo3499c();
        for (int i = 0; i < c; i++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i));
            if (!e.mo4158c()) {
                e.mo4148a();
            }
        }
        this.f2660d.mo4108i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3902u() {
        this.f2679w = true;
        mo3903v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3903v() {
        int c = this.f2662f.mo3499c();
        for (int i = 0; i < c; i++) {
            C0826w e = m4073e(this.f2662f.mo3502d(i));
            if (e != null && !e.mo4158c()) {
                e.mo4157b(6);
            }
        }
        mo3872r();
        this.f2660d.mo4107h();
    }

    /* renamed from: w */
    public boolean mo3904w() {
        return !this.f2675s || this.f2679w || this.f2661e.mo4397d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3905x() {
        int b = this.f2662f.mo3496b();
        for (int i = 0; i < b; i++) {
            View b2 = this.f2662f.mo3498b(i);
            C0826w b3 = mo3778b(b2);
            if (!(b3 == null || b3.f2793i == null)) {
                View view = b3.f2793i.f2785a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3906y() {
        int i;
        for (int size = this.f2618G.size() - 1; size >= 0; size--) {
            C0826w wVar = this.f2618G.get(size);
            if (wVar.f2785a.getParent() == this && !wVar.mo4158c() && (i = wVar.f2796l) != -1) {
                C0388q.m1639a(wVar.f2785a, i);
                wVar.f2796l = -1;
            }
        }
        this.f2618G.clear();
    }
}
