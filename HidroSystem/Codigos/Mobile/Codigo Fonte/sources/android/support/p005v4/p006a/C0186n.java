package android.support.p005v4.p006a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p005v4.p006a.C0170h;
import android.support.p005v4.p006a.C0183m;
import android.support.p005v4.p016h.C0296b;
import android.support.p005v4.p016h.C0299d;
import android.support.p005v4.p016h.C0300e;
import android.support.p005v4.p016h.C0313j;
import android.support.p005v4.p017i.C0388q;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.a.n */
final class C0186n extends C0183m implements LayoutInflater.Factory2 {

    /* renamed from: E */
    static final Interpolator f617E = new DecelerateInterpolator(2.5f);

    /* renamed from: F */
    static final Interpolator f618F = new DecelerateInterpolator(1.5f);

    /* renamed from: G */
    static final Interpolator f619G = new AccelerateInterpolator(2.5f);

    /* renamed from: H */
    static final Interpolator f620H = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f621a;

    /* renamed from: q */
    static Field f622q;

    /* renamed from: A */
    SparseArray<Parcelable> f623A = null;

    /* renamed from: B */
    ArrayList<C0198g> f624B;

    /* renamed from: C */
    C0199o f625C;

    /* renamed from: D */
    Runnable f626D = new Runnable() {
        public void run() {
            C0186n.this.mo981e();
        }
    };

    /* renamed from: I */
    private final CopyOnWriteArrayList<C0313j<C0183m.C0184a, Boolean>> f627I = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0197f> f628b;

    /* renamed from: c */
    boolean f629c;

    /* renamed from: d */
    int f630d = 0;

    /* renamed from: e */
    final ArrayList<C0170h> f631e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<C0170h> f632f;

    /* renamed from: g */
    ArrayList<C0162c> f633g;

    /* renamed from: h */
    ArrayList<C0170h> f634h;

    /* renamed from: i */
    ArrayList<C0162c> f635i;

    /* renamed from: j */
    ArrayList<Integer> f636j;

    /* renamed from: k */
    ArrayList<C0183m.C0185b> f637k;

    /* renamed from: l */
    int f638l = 0;

    /* renamed from: m */
    C0182l f639m;

    /* renamed from: n */
    C0180j f640n;

    /* renamed from: o */
    C0170h f641o;

    /* renamed from: p */
    C0170h f642p;

    /* renamed from: r */
    boolean f643r;

    /* renamed from: s */
    boolean f644s;

    /* renamed from: t */
    boolean f645t;

    /* renamed from: u */
    String f646u;

    /* renamed from: v */
    boolean f647v;

    /* renamed from: w */
    ArrayList<C0162c> f648w;

    /* renamed from: x */
    ArrayList<Boolean> f649x;

    /* renamed from: y */
    ArrayList<C0170h> f650y;

    /* renamed from: z */
    Bundle f651z = null;

    /* renamed from: android.support.v4.a.n$a */
    private static class C0191a extends C0193b {

        /* renamed from: a */
        View f663a;

        C0191a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f663a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0388q.m1678y(this.f663a) || Build.VERSION.SDK_INT >= 24) {
                this.f663a.post(new Runnable() {
                    public void run() {
                        C0191a.this.f663a.setLayerType(0, (Paint) null);
                    }
                });
            } else {
                this.f663a.setLayerType(0, (Paint) null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.a.n$b */
    private static class C0193b implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f665a;

        private C0193b(Animation.AnimationListener animationListener) {
            this.f665a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f665a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f665a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f665a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.a.n$c */
    private static class C0194c {

        /* renamed from: a */
        public final Animation f666a;

        /* renamed from: b */
        public final Animator f667b;

        private C0194c(Animator animator) {
            this.f666a = null;
            this.f667b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private C0194c(Animation animation) {
            this.f666a = animation;
            this.f667b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.a.n$d */
    private static class C0195d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f668a;

        C0195d(View view) {
            this.f668a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f668a.setLayerType(0, (Paint) null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f668a.setLayerType(2, (Paint) null);
        }
    }

    /* renamed from: android.support.v4.a.n$e */
    static class C0196e {

        /* renamed from: a */
        public static final int[] f669a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.a.n$f */
    interface C0197f {
        /* renamed from: a */
        boolean mo706a(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.a.n$g */
    static class C0198g implements C0170h.C0175c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final boolean f670a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0162c f671b;

        /* renamed from: c */
        private int f672c;

        C0198g(C0162c cVar, boolean z) {
            this.f670a = z;
            this.f671b = cVar;
        }

        /* renamed from: a */
        public void mo834a() {
            this.f672c--;
            if (this.f672c == 0) {
                this.f671b.f480b.m884y();
            }
        }

        /* renamed from: b */
        public void mo835b() {
            this.f672c++;
        }

        /* renamed from: c */
        public boolean mo1025c() {
            return this.f672c == 0;
        }

        /* renamed from: d */
        public void mo1026d() {
            boolean z = this.f672c > 0;
            C0186n nVar = this.f671b.f480b;
            int size = nVar.f631e.size();
            for (int i = 0; i < size; i++) {
                C0170h hVar = nVar.f631e.get(i);
                hVar.mo763a((C0170h.C0175c) null);
                if (z && hVar.mo746U()) {
                    hVar.mo726A();
                }
            }
            this.f671b.f480b.m860a(this.f671b, this.f670a, !z, true);
        }

        /* renamed from: e */
        public void mo1027e() {
            this.f671b.f480b.m860a(this.f671b, this.f670a, false, false);
        }
    }

    C0186n() {
    }

    /* renamed from: A */
    private void m853A() {
        if (this.f624B != null) {
            while (!this.f624B.isEmpty()) {
                this.f624B.remove(0).mo1026d();
            }
        }
    }

    /* renamed from: B */
    private void m854B() {
        SparseArray<C0170h> sparseArray = this.f632f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            C0170h valueAt = this.f632f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mo743R() != null) {
                    int T = valueAt.mo745T();
                    View R = valueAt.mo743R();
                    valueAt.mo767a((View) null);
                    Animation animation = R.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        R.clearAnimation();
                    }
                    mo950a(valueAt, T, 0, 0, false);
                } else if (valueAt.mo744S() != null) {
                    valueAt.mo744S().end();
                }
            }
        }
    }

    /* renamed from: C */
    private void m855C() {
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f632f.valueAt(size) == null) {
                    SparseArray<C0170h> sparseArray2 = this.f632f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    private int m856a(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0296b<C0170h> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0162c cVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (cVar.mo710c() && !cVar.mo705a(arrayList, i4 + 1, i2)) {
                if (this.f624B == null) {
                    this.f624B = new ArrayList<>();
                }
                C0198g gVar = new C0198g(cVar, booleanValue);
                this.f624B.add(gVar);
                cVar.mo701a((C0170h.C0175c) gVar);
                if (booleanValue) {
                    cVar.mo708b();
                } else {
                    cVar.mo704a(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, cVar);
                }
                m874b(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static C0194c m857a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f618F);
        alphaAnimation.setDuration(220);
        return new C0194c((Animation) alphaAnimation);
    }

    /* renamed from: a */
    static C0194c m858a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f617E);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f618F);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0194c((Animation) animationSet);
    }

    /* renamed from: a */
    private static Animation.AnimationListener m859a(Animation animation) {
        String str;
        String str2;
        try {
            if (f622q == null) {
                f622q = Animation.class.getDeclaredField("mListener");
                f622q.setAccessible(true);
            }
            return (Animation.AnimationListener) f622q.get(animation);
        } catch (NoSuchFieldException e) {
            e = e;
            str2 = "FragmentManager";
            str = "No field with the name mListener is found in Animation class";
            Log.e(str2, str, e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            str2 = "FragmentManager";
            str = "Cannot access Animation's mListener field";
            Log.e(str2, str, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m860a(C0162c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.mo704a(z3);
        } else {
            cVar.mo708b();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0205s.m992a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo944a(this.f638l, true);
        }
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                C0170h valueAt = this.f632f.valueAt(i);
                if (valueAt != null && valueAt.f532H != null && valueAt.f540P && cVar.mo709b(valueAt.f568x)) {
                    if (valueAt.f542R > 0.0f) {
                        valueAt.f532H.setAlpha(valueAt.f542R);
                    }
                    if (z3) {
                        valueAt.f542R = 0.0f;
                    } else {
                        valueAt.f542R = -1.0f;
                        valueAt.f540P = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m861a(final C0170h hVar, C0194c cVar, int i) {
        final View view = hVar.f532H;
        hVar.mo774b(i);
        if (cVar.f666a != null) {
            Animation animation = cVar.f666a;
            hVar.mo767a(hVar.f532H);
            animation.setAnimationListener(new C0193b(m859a(animation)) {
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    if (hVar.mo743R() != null) {
                        hVar.mo767a((View) null);
                        C0186n nVar = C0186n.this;
                        C0170h hVar = hVar;
                        nVar.mo950a(hVar, hVar.mo745T(), 0, 0, false);
                    }
                }
            });
            m875b(view, cVar);
            hVar.f532H.startAnimation(animation);
            return;
        }
        Animator animator = cVar.f667b;
        hVar.mo756a(cVar.f667b);
        final ViewGroup viewGroup = hVar.f531G;
        if (viewGroup != null) {
            viewGroup.startViewTransition(view);
        }
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup = viewGroup;
                if (viewGroup != null) {
                    viewGroup.endViewTransition(view);
                }
                if (hVar.mo744S() != null) {
                    hVar.mo756a((Animator) null);
                    C0186n nVar = C0186n.this;
                    C0170h hVar = hVar;
                    nVar.mo950a(hVar, hVar.mo745T(), 0, 0, false);
                }
            }
        });
        animator.setTarget(hVar.f532H);
        m875b(hVar.f532H, cVar);
        animator.start();
    }

    /* renamed from: a */
    private static void m864a(C0199o oVar) {
        if (oVar != null) {
            List<C0170h> a = oVar.mo1028a();
            if (a != null) {
                for (C0170h hVar : a) {
                    hVar.f527C = true;
                }
            }
            List<C0199o> b = oVar.mo1029b();
            if (b != null) {
                for (C0199o a2 : b) {
                    m864a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m865a(C0296b<C0170h> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            C0170h b = bVar.mo1263b(i);
            if (!b.f555k) {
                View i2 = b.mo803i();
                b.f542R = i2.getAlpha();
                i2.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m866a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0300e("FragmentManager"));
        C0182l lVar = this.f639m;
        if (lVar != null) {
            try {
                lVar.mo867a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo921a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: a */
    private void m867a(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0198g> arrayList3 = this.f624B;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0198g gVar = this.f624B.get(i);
            if (arrayList == null || gVar.f670a || (indexOf2 = arrayList.indexOf(gVar.f671b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (gVar.mo1025c() || (arrayList != null && gVar.f671b.mo705a(arrayList, 0, arrayList.size()))) {
                    this.f624B.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || gVar.f670a || (indexOf = arrayList.indexOf(gVar.f671b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        gVar.mo1026d();
                    }
                }
                i++;
            }
            gVar.mo1027e();
            i++;
        }
    }

    /* renamed from: a */
    private void m868a(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0162c> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f499u;
        ArrayList<C0170h> arrayList5 = this.f650y;
        if (arrayList5 == null) {
            this.f650y = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f650y.addAll(this.f631e);
        C0170h v = mo1014v();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0162c cVar = arrayList3.get(i6);
            v = !arrayList4.get(i6).booleanValue() ? cVar.mo697a(this.f650y, v) : cVar.mo707b(this.f650y, v);
            z2 = z2 || cVar.f488j;
        }
        this.f650y.clear();
        if (!z) {
            C0205s.m992a(this, arrayList, arrayList2, i, i2, false);
        }
        m877b(arrayList, arrayList2, i, i2);
        if (z) {
            C0296b bVar = new C0296b();
            m874b((C0296b<C0170h>) bVar);
            int a = m856a(arrayList, arrayList2, i, i2, (C0296b<C0170h>) bVar);
            m865a((C0296b<C0170h>) bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0205s.m992a(this, arrayList, arrayList2, i, i3, true);
            mo944a(this.f638l, true);
        }
        while (i4 < i5) {
            C0162c cVar2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && cVar2.f492n >= 0) {
                mo971c(cVar2.f492n);
                cVar2.f492n = -1;
            }
            cVar2.mo698a();
            i4++;
        }
        if (z2) {
            mo985g();
        }
    }

    /* renamed from: a */
    static boolean m869a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m869a(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m870a(C0194c cVar) {
        if (cVar.f666a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f666a instanceof AnimationSet)) {
            return m869a(cVar.f667b);
        }
        List<Animation> animations = ((AnimationSet) cVar.f666a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m871a(View view, C0194c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0388q.m1670q(view) && m870a(cVar);
    }

    /* renamed from: a */
    private boolean m872a(String str, int i, int i2) {
        C0183m h;
        mo981e();
        m878c(true);
        C0170h hVar = this.f642p;
        if (hVar != null && i < 0 && str == null && (h = hVar.mo800h()) != null && h.mo922a()) {
            return true;
        }
        boolean a = mo961a(this.f648w, this.f649x, str, i, i2);
        if (a) {
            this.f629c = true;
            try {
                m876b(this.f648w, this.f649x);
            } finally {
                m885z();
            }
        }
        mo982f();
        m855C();
        return a;
    }

    /* renamed from: b */
    public static int m873b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private void m874b(C0296b<C0170h> bVar) {
        int i = this.f638l;
        if (i >= 1) {
            int min = Math.min(i, 4);
            int size = this.f631e.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0170h hVar = this.f631e.get(i2);
                if (hVar.f546b < min) {
                    mo950a(hVar, min, hVar.mo738M(), hVar.mo739N(), false);
                    if (hVar.f532H != null && !hVar.f570z && hVar.f540P) {
                        bVar.add(hVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m875b(View view, C0194c cVar) {
        if (view != null && cVar != null && m871a(view, cVar)) {
            if (cVar.f667b != null) {
                cVar.f667b.addListener(new C0195d(view));
                return;
            }
            Animation.AnimationListener a = m859a(cVar.f666a);
            view.setLayerType(2, (Paint) null);
            cVar.f666a.setAnimationListener(new C0191a(view, a));
        }
    }

    /* renamed from: b */
    private void m876b(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m867a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f499u) {
                    if (i2 != i) {
                        m868a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f499u) {
                            i2++;
                        }
                    }
                    m868a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m868a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: b */
    private static void m877b(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0162c cVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                cVar.mo699a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                cVar.mo704a(z);
            } else {
                cVar.mo699a(1);
                cVar.mo708b();
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m878c(boolean z) {
        if (this.f629c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() == this.f639m.mo914h().getLooper()) {
            if (!z) {
                m883x();
            }
            if (this.f648w == null) {
                this.f648w = new ArrayList<>();
                this.f649x = new ArrayList<>();
            }
            this.f629c = true;
            try {
                m867a((ArrayList<C0162c>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f629c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m879c(java.util.ArrayList<android.support.p005v4.p006a.C0162c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.a.n$f> r0 = r4.f628b     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.a.n$f> r0 = r4.f628b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.a.n$f> r0 = r4.f628b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.a.n$f> r3 = r4.f628b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.a.n$f r3 = (android.support.p005v4.p006a.C0186n.C0197f) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo706a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.a.n$f> r5 = r4.f628b     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.a.l r5 = r4.f639m     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo914h()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f626D     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p006a.C0186n.m879c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: d */
    public static int m880d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m881e(int i) {
        try {
            this.f629c = true;
            mo944a(i, false);
            this.f629c = false;
            mo981e();
        } catch (Throwable th) {
            this.f629c = false;
            throw th;
        }
    }

    /* renamed from: p */
    private C0170h m882p(C0170h hVar) {
        ViewGroup viewGroup = hVar.f531G;
        View view = hVar.f532H;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f631e.indexOf(hVar) - 1; indexOf >= 0; indexOf--) {
                C0170h hVar2 = this.f631e.get(indexOf);
                if (hVar2.f531G == viewGroup && hVar2.f532H != null) {
                    return hVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: x */
    private void m883x() {
        if (this.f644s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f646u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f646u);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m884y() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f624B != null && !this.f624B.isEmpty();
            if (this.f628b != null && this.f628b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f639m.mo914h().removeCallbacks(this.f626D);
                this.f639m.mo914h().post(this.f626D);
            }
        }
    }

    /* renamed from: z */
    private void m885z() {
        this.f629c = false;
        this.f649x.clear();
        this.f648w.clear();
    }

    /* renamed from: a */
    public C0170h mo940a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0170h hVar = this.f632f.get(i);
        if (hVar == null) {
            m866a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return hVar;
    }

    /* renamed from: a */
    public C0170h mo941a(String str) {
        if (str != null) {
            for (int size = this.f631e.size() - 1; size >= 0; size--) {
                C0170h hVar = this.f631e.get(size);
                if (hVar != null && str.equals(hVar.f569y)) {
                    return hVar;
                }
            }
        }
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            C0170h valueAt = this.f632f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f569y)) {
                return valueAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0194c mo942a(C0170h hVar, int i, boolean z, int i2) {
        int b;
        int M = hVar.mo738M();
        Animation a = hVar.mo750a(i, z, M);
        if (a != null) {
            return new C0194c(a);
        }
        Animator b2 = hVar.mo772b(i, z, M);
        if (b2 != null) {
            return new C0194c(b2);
        }
        if (M != 0) {
            boolean equals = "anim".equals(this.f639m.mo913g().getResources().getResourceTypeName(M));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f639m.mo913g(), M);
                    if (loadAnimation != null) {
                        return new C0194c(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f639m.mo913g(), M);
                    if (loadAnimator != null) {
                        return new C0194c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f639m.mo913g(), M);
                        if (loadAnimation2 != null) {
                            return new C0194c(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (b = m873b(i, z)) < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m858a(this.f639m.mo913g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m858a(this.f639m.mo913g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m858a(this.f639m.mo913g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m858a(this.f639m.mo913g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m857a(this.f639m.mo913g(), 0.0f, 1.0f);
            case 6:
                return m857a(this.f639m.mo913g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f639m.mo872d()) {
                    i2 = this.f639m.mo873e();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* renamed from: a */
    public void mo943a(int i, C0162c cVar) {
        synchronized (this) {
            if (this.f635i == null) {
                this.f635i = new ArrayList<>();
            }
            int size = this.f635i.size();
            if (i < size) {
                if (f621a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + cVar);
                }
                this.f635i.set(i, cVar);
            } else {
                while (size < i) {
                    this.f635i.add((Object) null);
                    if (this.f636j == null) {
                        this.f636j = new ArrayList<>();
                    }
                    if (f621a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f636j.add(Integer.valueOf(size));
                    size++;
                }
                if (f621a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + cVar);
                }
                this.f635i.add(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo944a(int i, boolean z) {
        C0182l lVar;
        if (this.f639m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f638l) {
            this.f638l = i;
            if (this.f632f != null) {
                int size = this.f631e.size();
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    C0170h hVar = this.f631e.get(i2);
                    mo979e(hVar);
                    if (hVar.f536L != null) {
                        z2 |= hVar.f536L.mo1062a();
                    }
                }
                int size2 = this.f632f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0170h valueAt = this.f632f.valueAt(i3);
                    if (valueAt != null && ((valueAt.f556l || valueAt.f525A) && !valueAt.f540P)) {
                        mo979e(valueAt);
                        if (valueAt.f536L != null) {
                            z2 |= valueAt.f536L.mo1062a();
                        }
                    }
                }
                if (!z2) {
                    mo975d();
                }
                if (this.f643r && (lVar = this.f639m) != null && this.f638l == 5) {
                    lVar.mo871c();
                    this.f643r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo945a(Configuration configuration) {
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null) {
                hVar.mo761a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void mo946a(Bundle bundle, String str, C0170h hVar) {
        if (hVar.f549e < 0) {
            m866a((RuntimeException) new IllegalStateException("Fragment " + hVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, hVar.f549e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo947a(Parcelable parcelable, C0199o oVar) {
        List<C0199o> list;
        if (parcelable != null) {
            C0200p pVar = (C0200p) parcelable;
            if (pVar.f675a != null) {
                if (oVar != null) {
                    List<C0170h> a = oVar.mo1028a();
                    list = oVar.mo1029b();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        C0170h hVar = a.get(i);
                        if (f621a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + hVar);
                        }
                        int i2 = 0;
                        while (i2 < pVar.f675a.length && pVar.f675a[i2].f681b != hVar.f549e) {
                            i2++;
                        }
                        if (i2 == pVar.f675a.length) {
                            m866a((RuntimeException) new IllegalStateException("Could not find active fragment with index " + hVar.f549e));
                        }
                        C0202q qVar = pVar.f675a[i2];
                        qVar.f691l = hVar;
                        hVar.f548d = null;
                        hVar.f561q = 0;
                        hVar.f558n = false;
                        hVar.f555k = false;
                        hVar.f552h = null;
                        if (qVar.f690k != null) {
                            qVar.f690k.setClassLoader(this.f639m.mo913g().getClassLoader());
                            hVar.f548d = qVar.f690k.getSparseParcelableArray("android:view_state");
                            hVar.f547c = qVar.f690k;
                        }
                    }
                } else {
                    list = null;
                }
                this.f632f = new SparseArray<>(pVar.f675a.length);
                int i3 = 0;
                while (i3 < pVar.f675a.length) {
                    C0202q qVar2 = pVar.f675a[i3];
                    if (qVar2 != null) {
                        C0170h a2 = qVar2.mo1036a(this.f639m, this.f640n, this.f641o, (list == null || i3 >= list.size()) ? null : list.get(i3));
                        if (f621a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + a2);
                        }
                        this.f632f.put(a2.f549e, a2);
                        qVar2.f691l = null;
                    }
                    i3++;
                }
                if (oVar != null) {
                    List<C0170h> a3 = oVar.mo1028a();
                    int size2 = a3 != null ? a3.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        C0170h hVar2 = a3.get(i4);
                        if (hVar2.f553i >= 0) {
                            hVar2.f552h = this.f632f.get(hVar2.f553i);
                            if (hVar2.f552h == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + hVar2 + " target no longer exists: " + hVar2.f553i);
                            }
                        }
                    }
                }
                this.f631e.clear();
                if (pVar.f676b != null) {
                    int i5 = 0;
                    while (i5 < pVar.f676b.length) {
                        C0170h hVar3 = this.f632f.get(pVar.f676b[i5]);
                        if (hVar3 == null) {
                            m866a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + pVar.f676b[i5]));
                        }
                        hVar3.f555k = true;
                        if (f621a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + hVar3);
                        }
                        if (!this.f631e.contains(hVar3)) {
                            synchronized (this.f631e) {
                                this.f631e.add(hVar3);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (pVar.f677c != null) {
                    this.f633g = new ArrayList<>(pVar.f677c.length);
                    for (int i6 = 0; i6 < pVar.f677c.length; i6++) {
                        C0162c a4 = pVar.f677c[i6].mo713a(this);
                        if (f621a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + a4.f492n + "): " + a4);
                            PrintWriter printWriter = new PrintWriter(new C0300e("FragmentManager"));
                            a4.mo703a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f633g.add(a4);
                        if (a4.f492n >= 0) {
                            mo943a(a4.f492n, a4);
                        }
                    }
                } else {
                    this.f633g = null;
                }
                if (pVar.f678d >= 0) {
                    this.f642p = this.f632f.get(pVar.f678d);
                }
                this.f630d = pVar.f679e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo948a(C0162c cVar) {
        if (this.f633g == null) {
            this.f633g = new ArrayList<>();
        }
        this.f633g.add(cVar);
    }

    /* renamed from: a */
    public void mo949a(C0170h hVar) {
        if (!hVar.f534J) {
            return;
        }
        if (this.f629c) {
            this.f647v = true;
            return;
        }
        hVar.f534J = false;
        mo950a(hVar, this.f638l, 0, 0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0231, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0313, code lost:
        if (r11 >= 4) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0317, code lost:
        if (f621a == false) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0319, code lost:
        android.util.Log.v("FragmentManager", "movefrom STARTED: " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x032f, code lost:
        r16.mo733H();
        mo980e(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0335, code lost:
        if (r11 >= 3) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0339, code lost:
        if (f621a == false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033b, code lost:
        android.util.Log.v("FragmentManager", "movefrom STOPPED: " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0351, code lost:
        r16.mo734I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0354, code lost:
        if (r11 >= 2) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0358, code lost:
        if (f621a == false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x035a, code lost:
        android.util.Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0372, code lost:
        if (r7.f532H == null) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x037a, code lost:
        if (r6.f639m.mo868a(r7) == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x037e, code lost:
        if (r7.f548d != null) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0380, code lost:
        mo1000m(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0383, code lost:
        r16.mo735J();
        mo984f(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x038b, code lost:
        if (r7.f532H == null) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038f, code lost:
        if (r7.f531G == null) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0391, code lost:
        r7.f532H.clearAnimation();
        r7.f531G.endViewTransition(r7.f532H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a0, code lost:
        if (r6.f638l <= 0) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a4, code lost:
        if (r6.f645t != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ac, code lost:
        if (r7.f532H.getVisibility() != 0) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b2, code lost:
        if (r7.f542R < 0.0f) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03b4, code lost:
        r0 = mo942a(r7, r18, false, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03bd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03be, code lost:
        r7.f542R = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c0, code lost:
        if (r0 == null) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c2, code lost:
        m861a(r7, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c5, code lost:
        r7.f531G.removeView(r7.f532H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03cc, code lost:
        r7.f531G = null;
        r7.f532H = null;
        r7.f533I = null;
        r7.f558n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d4, code lost:
        if (r11 >= 1) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d8, code lost:
        if (r6.f645t == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03de, code lost:
        if (r16.mo743R() == null) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e0, code lost:
        r0 = r16.mo743R();
        r7.mo767a((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ef, code lost:
        if (r16.mo744S() == null) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f1, code lost:
        r0 = r16.mo744S();
        r7.mo756a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ff, code lost:
        if (r16.mo743R() != null) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0405, code lost:
        if (r16.mo744S() == null) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x040a, code lost:
        if (f621a == false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x040c, code lost:
        android.util.Log.v("FragmentManager", "movefrom CREATED: " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0424, code lost:
        if (r7.f527C != false) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0426, code lost:
        r16.mo736K();
        mo987g(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x042d, code lost:
        r7.f546b = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x042f, code lost:
        r16.mo737L();
        mo990h(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0435, code lost:
        if (r20 != false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0439, code lost:
        if (r7.f527C != false) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x043b, code lost:
        mo986g(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x043f, code lost:
        r7.f563s = null;
        r7.f566v = null;
        r7.f562r = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0446, code lost:
        r7.mo774b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019a, code lost:
        mo972c(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019d, code lost:
        if (r11 <= 1) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a1, code lost:
        if (f621a == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a3, code lost:
        android.util.Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bb, code lost:
        if (r7.f557m != false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bf, code lost:
        if (r7.f568x == 0) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c4, code lost:
        if (r7.f568x != -1) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c6, code lost:
        m866a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("Cannot create fragment " + r7 + " for a container view with no id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e4, code lost:
        r0 = (android.view.ViewGroup) r6.f640n.mo832a(r7.f568x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ee, code lost:
        if (r0 != null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f2, code lost:
        if (r7.f559o != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1 = r16.mo791e().getResourceName(r7.f568x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ff, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo950a(android.support.p005v4.p006a.C0170h r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            boolean r0 = r7.f555k
            r8 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r7.f525A
            if (r0 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r0 = r17
            goto L_0x0015
        L_0x0010:
            r0 = r17
            if (r0 <= r8) goto L_0x0015
            r0 = 1
        L_0x0015:
            boolean r1 = r7.f556l
            if (r1 == 0) goto L_0x002b
            int r1 = r7.f546b
            if (r0 <= r1) goto L_0x002b
            int r0 = r7.f546b
            if (r0 != 0) goto L_0x0029
            boolean r0 = r16.mo778b()
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002b
        L_0x0029:
            int r0 = r7.f546b
        L_0x002b:
            boolean r1 = r7.f534J
            r9 = 4
            r10 = 3
            if (r1 == 0) goto L_0x0039
            int r1 = r7.f546b
            if (r1 >= r9) goto L_0x0039
            if (r0 <= r10) goto L_0x0039
            r11 = 3
            goto L_0x003a
        L_0x0039:
            r11 = r0
        L_0x003a:
            int r0 = r7.f546b
            r12 = 2
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02e5
            boolean r0 = r7.f557m
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.f558n
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r16.mo743R()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r16.mo744S()
            if (r0 == 0) goto L_0x0069
        L_0x0056:
            r7.mo767a((android.view.View) r13)
            r7.mo756a((android.animation.Animator) r13)
            int r2 = r16.mo745T()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r15
            r1 = r16
            r0.mo950a((android.support.p005v4.p006a.C0170h) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0069:
            int r0 = r7.f546b
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x019a;
                case 2: goto L_0x0297;
                case 3: goto L_0x029b;
                case 4: goto L_0x02bd;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x044a
        L_0x0070:
            if (r11 <= 0) goto L_0x019a
            boolean r0 = f621a
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x008c:
            android.os.Bundle r0 = r7.f547c
            if (r0 == 0) goto L_0x00d4
            android.os.Bundle r0 = r7.f547c
            android.support.v4.a.l r1 = r6.f639m
            android.content.Context r1 = r1.mo913g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f547c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f548d = r0
            android.os.Bundle r0 = r7.f547c
            java.lang.String r1 = "android:target_state"
            android.support.v4.a.h r0 = r15.mo940a((android.os.Bundle) r0, (java.lang.String) r1)
            r7.f552h = r0
            android.support.v4.a.h r0 = r7.f552h
            if (r0 == 0) goto L_0x00c1
            android.os.Bundle r0 = r7.f547c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r14)
            r7.f554j = r0
        L_0x00c1:
            android.os.Bundle r0 = r7.f547c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f535K = r0
            boolean r0 = r7.f535K
            if (r0 != 0) goto L_0x00d4
            r7.f534J = r8
            if (r11 <= r10) goto L_0x00d4
            r11 = 3
        L_0x00d4:
            android.support.v4.a.l r0 = r6.f639m
            r7.f563s = r0
            android.support.v4.a.h r1 = r6.f641o
            r7.f566v = r1
            if (r1 == 0) goto L_0x00e1
            android.support.v4.a.n r0 = r1.f564t
            goto L_0x00e5
        L_0x00e1:
            android.support.v4.a.n r0 = r0.mo915i()
        L_0x00e5:
            r7.f562r = r0
            android.support.v4.a.h r0 = r7.f552h
            if (r0 == 0) goto L_0x0130
            android.util.SparseArray<android.support.v4.a.h> r0 = r6.f632f
            android.support.v4.a.h r1 = r7.f552h
            int r1 = r1.f549e
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.a.h r1 = r7.f552h
            if (r0 != r1) goto L_0x010a
            android.support.v4.a.h r0 = r7.f552h
            int r0 = r0.f546b
            if (r0 >= r8) goto L_0x0130
            android.support.v4.a.h r1 = r7.f552h
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r15
            r0.mo950a((android.support.p005v4.p006a.C0170h) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x0130
        L_0x010a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.a.h r2 = r7.f552h
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0130:
            android.support.v4.a.l r0 = r6.f639m
            android.content.Context r0 = r0.mo913g()
            r15.mo951a((android.support.p005v4.p006a.C0170h) r7, (android.content.Context) r0, (boolean) r14)
            r7.f530F = r14
            android.support.v4.a.l r0 = r6.f639m
            android.content.Context r0 = r0.mo913g()
            r7.mo759a((android.content.Context) r0)
            boolean r0 = r7.f530F
            if (r0 == 0) goto L_0x017e
            android.support.v4.a.h r0 = r7.f566v
            if (r0 != 0) goto L_0x0152
            android.support.v4.a.l r0 = r6.f639m
            r0.mo870b(r7)
            goto L_0x0157
        L_0x0152:
            android.support.v4.a.h r0 = r7.f566v
            r0.mo764a((android.support.p005v4.p006a.C0170h) r7)
        L_0x0157:
            android.support.v4.a.l r0 = r6.f639m
            android.content.Context r0 = r0.mo913g()
            r15.mo965b((android.support.p005v4.p006a.C0170h) r7, (android.content.Context) r0, (boolean) r14)
            boolean r0 = r7.f544T
            if (r0 != 0) goto L_0x0174
            android.os.Bundle r0 = r7.f547c
            r15.mo952a((android.support.p005v4.p006a.C0170h) r7, (android.os.Bundle) r0, (boolean) r14)
            android.os.Bundle r0 = r7.f547c
            r7.mo808k(r0)
            android.os.Bundle r0 = r7.f547c
            r15.mo966b((android.support.p005v4.p006a.C0170h) r7, (android.os.Bundle) r0, (boolean) r14)
            goto L_0x017b
        L_0x0174:
            android.os.Bundle r0 = r7.f547c
            r7.mo799g(r0)
            r7.f546b = r8
        L_0x017b:
            r7.f527C = r14
            goto L_0x019a
        L_0x017e:
            android.support.v4.a.z r0 = new android.support.v4.a.z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019a:
            r15.mo972c((android.support.p005v4.p006a.C0170h) r16)
            if (r11 <= r8) goto L_0x0297
            boolean r0 = f621a
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x01b9:
            boolean r0 = r7.f557m
            if (r0 != 0) goto L_0x0282
            int r0 = r7.f568x
            if (r0 == 0) goto L_0x0231
            int r0 = r7.f568x
            r1 = -1
            if (r0 != r1) goto L_0x01e4
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r15.m866a((java.lang.RuntimeException) r0)
        L_0x01e4:
            android.support.v4.a.j r0 = r6.f640n
            int r1 = r7.f568x
            android.view.View r0 = r0.mo832a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0232
            boolean r1 = r7.f559o
            if (r1 != 0) goto L_0x0232
            android.content.res.Resources r1 = r16.mo791e()     // Catch:{ NotFoundException -> 0x01ff }
            int r2 = r7.f568x     // Catch:{ NotFoundException -> 0x01ff }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01ff }
            goto L_0x0201
        L_0x01ff:
            java.lang.String r1 = "unknown"
        L_0x0201:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No view found for id 0x"
            r3.append(r4)
            int r4 = r7.f568x
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r15.m866a((java.lang.RuntimeException) r2)
            goto L_0x0232
        L_0x0231:
            r0 = r13
        L_0x0232:
            r7.f531G = r0
            android.os.Bundle r1 = r7.f547c
            android.view.LayoutInflater r1 = r7.mo787d((android.os.Bundle) r1)
            android.os.Bundle r2 = r7.f547c
            android.view.View r1 = r7.mo773b((android.view.LayoutInflater) r1, (android.view.ViewGroup) r0, (android.os.Bundle) r2)
            r7.f532H = r1
            android.view.View r1 = r7.f532H
            if (r1 == 0) goto L_0x0280
            android.view.View r1 = r7.f532H
            r7.f533I = r1
            android.view.View r1 = r7.f532H
            r1.setSaveFromParentEnabled(r14)
            if (r0 == 0) goto L_0x0256
            android.view.View r1 = r7.f532H
            r0.addView(r1)
        L_0x0256:
            boolean r0 = r7.f570z
            if (r0 == 0) goto L_0x0261
            android.view.View r0 = r7.f532H
            r1 = 8
            r0.setVisibility(r1)
        L_0x0261:
            android.view.View r0 = r7.f532H
            android.os.Bundle r1 = r7.f547c
            r7.mo768a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r7.f532H
            android.os.Bundle r1 = r7.f547c
            r15.mo953a((android.support.p005v4.p006a.C0170h) r7, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r14)
            android.view.View r0 = r7.f532H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x027c
            android.view.ViewGroup r0 = r7.f531G
            if (r0 == 0) goto L_0x027c
            goto L_0x027d
        L_0x027c:
            r8 = 0
        L_0x027d:
            r7.f540P = r8
            goto L_0x0282
        L_0x0280:
            r7.f533I = r13
        L_0x0282:
            android.os.Bundle r0 = r7.f547c
            r7.mo810l(r0)
            android.os.Bundle r0 = r7.f547c
            r15.mo973c(r7, r0, r14)
            android.view.View r0 = r7.f532H
            if (r0 == 0) goto L_0x0295
            android.os.Bundle r0 = r7.f547c
            r7.mo762a((android.os.Bundle) r0)
        L_0x0295:
            r7.f547c = r13
        L_0x0297:
            if (r11 <= r12) goto L_0x029b
            r7.f546b = r10
        L_0x029b:
            if (r11 <= r10) goto L_0x02bd
            boolean r0 = f621a
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02b7:
            r16.mo728C()
            r15.mo967b((android.support.p005v4.p006a.C0170h) r7, (boolean) r14)
        L_0x02bd:
            if (r11 <= r9) goto L_0x044a
            boolean r0 = f621a
            if (r0 == 0) goto L_0x02d9
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02d9:
            r16.mo729D()
            r15.mo974c((android.support.p005v4.p006a.C0170h) r7, (boolean) r14)
            r7.f547c = r13
            r7.f548d = r13
            goto L_0x044a
        L_0x02e5:
            int r0 = r7.f546b
            if (r0 <= r11) goto L_0x044a
            int r0 = r7.f546b
            switch(r0) {
                case 1: goto L_0x03d4;
                case 2: goto L_0x0354;
                case 3: goto L_0x0335;
                case 4: goto L_0x0313;
                case 5: goto L_0x02f0;
                default: goto L_0x02ee;
            }
        L_0x02ee:
            goto L_0x044a
        L_0x02f0:
            r0 = 5
            if (r11 >= r0) goto L_0x0313
            boolean r0 = f621a
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x030d:
            r16.mo732G()
            r15.mo978d(r7, r14)
        L_0x0313:
            if (r11 >= r9) goto L_0x0335
            boolean r0 = f621a
            if (r0 == 0) goto L_0x032f
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x032f:
            r16.mo733H()
            r15.mo980e(r7, r14)
        L_0x0335:
            if (r11 >= r10) goto L_0x0354
            boolean r0 = f621a
            if (r0 == 0) goto L_0x0351
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STOPPED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0351:
            r16.mo734I()
        L_0x0354:
            if (r11 >= r12) goto L_0x03d4
            boolean r0 = f621a
            if (r0 == 0) goto L_0x0370
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0370:
            android.view.View r0 = r7.f532H
            if (r0 == 0) goto L_0x0383
            android.support.v4.a.l r0 = r6.f639m
            boolean r0 = r0.mo868a((android.support.p005v4.p006a.C0170h) r7)
            if (r0 == 0) goto L_0x0383
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f548d
            if (r0 != 0) goto L_0x0383
            r15.mo1000m(r16)
        L_0x0383:
            r16.mo735J()
            r15.mo984f(r7, r14)
            android.view.View r0 = r7.f532H
            if (r0 == 0) goto L_0x03cc
            android.view.ViewGroup r0 = r7.f531G
            if (r0 == 0) goto L_0x03cc
            android.view.View r0 = r7.f532H
            r0.clearAnimation()
            android.view.ViewGroup r0 = r7.f531G
            android.view.View r1 = r7.f532H
            r0.endViewTransition(r1)
            int r0 = r6.f638l
            r1 = 0
            if (r0 <= 0) goto L_0x03bd
            boolean r0 = r6.f645t
            if (r0 != 0) goto L_0x03bd
            android.view.View r0 = r7.f532H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03bd
            float r0 = r7.f542R
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03bd
            r0 = r18
            r2 = r19
            android.support.v4.a.n$c r0 = r15.mo942a((android.support.p005v4.p006a.C0170h) r7, (int) r0, (boolean) r14, (int) r2)
            goto L_0x03be
        L_0x03bd:
            r0 = r13
        L_0x03be:
            r7.f542R = r1
            if (r0 == 0) goto L_0x03c5
            r15.m861a((android.support.p005v4.p006a.C0170h) r7, (android.support.p005v4.p006a.C0186n.C0194c) r0, (int) r11)
        L_0x03c5:
            android.view.ViewGroup r0 = r7.f531G
            android.view.View r1 = r7.f532H
            r0.removeView(r1)
        L_0x03cc:
            r7.f531G = r13
            r7.f532H = r13
            r7.f533I = r13
            r7.f558n = r14
        L_0x03d4:
            if (r11 >= r8) goto L_0x044a
            boolean r0 = r6.f645t
            if (r0 == 0) goto L_0x03fb
            android.view.View r0 = r16.mo743R()
            if (r0 == 0) goto L_0x03eb
            android.view.View r0 = r16.mo743R()
            r7.mo767a((android.view.View) r13)
            r0.clearAnimation()
            goto L_0x03fb
        L_0x03eb:
            android.animation.Animator r0 = r16.mo744S()
            if (r0 == 0) goto L_0x03fb
            android.animation.Animator r0 = r16.mo744S()
            r7.mo756a((android.animation.Animator) r13)
            r0.cancel()
        L_0x03fb:
            android.view.View r0 = r16.mo743R()
            if (r0 != 0) goto L_0x0446
            android.animation.Animator r0 = r16.mo744S()
            if (r0 == 0) goto L_0x0408
            goto L_0x0446
        L_0x0408:
            boolean r0 = f621a
            if (r0 == 0) goto L_0x0422
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0422:
            boolean r0 = r7.f527C
            if (r0 != 0) goto L_0x042d
            r16.mo736K()
            r15.mo987g(r7, r14)
            goto L_0x042f
        L_0x042d:
            r7.f546b = r14
        L_0x042f:
            r16.mo737L()
            r15.mo990h(r7, r14)
            if (r20 != 0) goto L_0x044a
            boolean r0 = r7.f527C
            if (r0 != 0) goto L_0x043f
            r15.mo986g(r16)
            goto L_0x044a
        L_0x043f:
            r7.f563s = r13
            r7.f566v = r13
            r7.f562r = r13
            goto L_0x044a
        L_0x0446:
            r7.mo774b((int) r11)
            goto L_0x044b
        L_0x044a:
            r8 = r11
        L_0x044b:
            int r0 = r7.f546b
            if (r0 == r8) goto L_0x047e
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; "
            r1.append(r2)
            java.lang.String r2 = "expected state "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f546b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r7.f546b = r8
        L_0x047e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p006a.C0186n.mo950a(android.support.v4.a.h, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo951a(C0170h hVar, Context context, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo951a(hVar, context, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo926a((C0183m) this, hVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo952a(C0170h hVar, Bundle bundle, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo952a(hVar, bundle, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo927a((C0183m) this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo953a(C0170h hVar, View view, Bundle bundle, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo953a(hVar, view, bundle, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo928a(this, hVar, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo954a(C0170h hVar, boolean z) {
        if (f621a) {
            Log.v("FragmentManager", "add: " + hVar);
        }
        mo983f(hVar);
        if (hVar.f525A) {
            return;
        }
        if (!this.f631e.contains(hVar)) {
            synchronized (this.f631e) {
                this.f631e.add(hVar);
            }
            hVar.f555k = true;
            hVar.f556l = false;
            if (hVar.f532H == null) {
                hVar.f541Q = false;
            }
            if (hVar.f528D && hVar.f529E) {
                this.f643r = true;
            }
            if (z) {
                mo964b(hVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + hVar);
    }

    /* renamed from: a */
    public void mo955a(C0182l lVar, C0180j jVar, C0170h hVar) {
        if (this.f639m == null) {
            this.f639m = lVar;
            this.f640n = jVar;
            this.f641o = hVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public void mo921a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                C0170h valueAt = this.f632f.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.mo769a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f631e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f631e.get(i2).toString());
            }
        }
        ArrayList<C0170h> arrayList = this.f634h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f634h.get(i3).toString());
            }
        }
        ArrayList<C0162c> arrayList2 = this.f633g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0162c cVar = this.f633g.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.mo702a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f635i != null && (size2 = this.f635i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f635i.get(i5));
                }
            }
            if (this.f636j != null && this.f636j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f636j.toArray()));
            }
        }
        ArrayList<C0197f> arrayList3 = this.f628b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f628b.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f639m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f640n);
        if (this.f641o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f641o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f638l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f644s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f645t);
        if (this.f643r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f643r);
        }
        if (this.f646u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f646u);
        }
    }

    /* renamed from: a */
    public void mo956a(boolean z) {
        for (int size = this.f631e.size() - 1; size >= 0; size--) {
            C0170h hVar = this.f631e.get(size);
            if (hVar != null) {
                hVar.mo789d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo922a() {
        m883x();
        return m872a((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo957a(int i) {
        return this.f638l >= i;
    }

    /* renamed from: a */
    public boolean mo958a(Menu menu) {
        boolean z = false;
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null && hVar.mo784c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo959a(Menu menu, MenuInflater menuInflater) {
        ArrayList<C0170h> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null && hVar.mo779b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(hVar);
                z = true;
            }
        }
        if (this.f634h != null) {
            for (int i2 = 0; i2 < this.f634h.size(); i2++) {
                C0170h hVar2 = this.f634h.get(i2);
                if (arrayList == null || !arrayList.contains(hVar2)) {
                    hVar2.mo820r();
                }
            }
        }
        this.f634h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo960a(MenuItem menuItem) {
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null && hVar.mo785c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo961a(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0162c> arrayList3 = this.f633g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f633g.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                i3 = this.f633g.size() - 1;
                while (i3 >= 0) {
                    C0162c cVar = this.f633g.get(i3);
                    if ((str != null && str.equals(cVar.mo711d())) || (i >= 0 && i == cVar.f492n)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0162c cVar2 = this.f633g.get(i3);
                        if ((str == null || !str.equals(cVar2.mo711d())) && (i < 0 || i != cVar2.f492n)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f633g.size() - 1) {
                return false;
            }
            for (int size2 = this.f633g.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f633g.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public C0170h mo962b(int i) {
        for (int size = this.f631e.size() - 1; size >= 0; size--) {
            C0170h hVar = this.f631e.get(size);
            if (hVar != null && hVar.f567w == i) {
                return hVar;
            }
        }
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            C0170h valueAt = this.f632f.valueAt(size2);
            if (valueAt != null && valueAt.f567w == i) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0170h mo963b(String str) {
        C0170h a;
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            C0170h valueAt = this.f632f.valueAt(size);
            if (valueAt != null && (a = valueAt.mo748a(str)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public List<C0170h> mo923b() {
        List<C0170h> list;
        if (this.f631e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f631e) {
            list = (List) this.f631e.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo964b(C0170h hVar) {
        mo950a(hVar, this.f638l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo965b(C0170h hVar, Context context, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo965b(hVar, context, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo930b((C0183m) this, hVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo966b(C0170h hVar, Bundle bundle, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo966b(hVar, bundle, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo931b((C0183m) this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo967b(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo967b(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo925a(this, hVar);
            }
        }
    }

    /* renamed from: b */
    public void mo968b(Menu menu) {
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null) {
                hVar.mo788d(menu);
            }
        }
    }

    /* renamed from: b */
    public void mo969b(boolean z) {
        for (int size = this.f631e.size() - 1; size >= 0; size--) {
            C0170h hVar = this.f631e.get(size);
            if (hVar != null) {
                hVar.mo793e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo970b(MenuItem menuItem) {
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null && hVar.mo790d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo971c(int i) {
        synchronized (this) {
            this.f635i.set(i, (Object) null);
            if (this.f636j == null) {
                this.f636j = new ArrayList<>();
            }
            if (f621a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f636j.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo972c(C0170h hVar) {
        if (hVar.f557m && !hVar.f560p) {
            hVar.f532H = hVar.mo773b(hVar.mo787d(hVar.f547c), (ViewGroup) null, hVar.f547c);
            if (hVar.f532H != null) {
                hVar.f533I = hVar.f532H;
                hVar.f532H.setSaveFromParentEnabled(false);
                if (hVar.f570z) {
                    hVar.f532H.setVisibility(8);
                }
                hVar.mo768a(hVar.f532H, hVar.f547c);
                mo953a(hVar, hVar.f532H, hVar.f547c, false);
                return;
            }
            hVar.f533I = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo973c(C0170h hVar, Bundle bundle, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo973c(hVar, bundle, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo933c(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo974c(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo974c(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo929b(this, hVar);
            }
        }
    }

    /* renamed from: c */
    public boolean mo924c() {
        return this.f644s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo975d() {
        if (this.f632f != null) {
            for (int i = 0; i < this.f632f.size(); i++) {
                C0170h valueAt = this.f632f.valueAt(i);
                if (valueAt != null) {
                    mo949a(valueAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo976d(final C0170h hVar) {
        if (hVar.f532H != null) {
            C0194c a = mo942a(hVar, hVar.mo739N(), !hVar.f570z, hVar.mo740O());
            if (a == null || a.f667b == null) {
                if (a != null) {
                    m875b(hVar.f532H, a);
                    hVar.f532H.startAnimation(a.f666a);
                    a.f666a.start();
                }
                hVar.f532H.setVisibility((!hVar.f570z || hVar.mo747V()) ? 0 : 8);
                if (hVar.mo747V()) {
                    hVar.mo797f(false);
                }
            } else {
                a.f667b.setTarget(hVar.f532H);
                if (!hVar.f570z) {
                    hVar.f532H.setVisibility(0);
                } else if (hVar.mo747V()) {
                    hVar.mo797f(false);
                } else {
                    final ViewGroup viewGroup = hVar.f531G;
                    final View view = hVar.f532H;
                    viewGroup.startViewTransition(view);
                    a.f667b.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (hVar.f532H != null) {
                                hVar.f532H.setVisibility(8);
                            }
                        }
                    });
                }
                m875b(hVar.f532H, a);
                a.f667b.start();
            }
        }
        if (hVar.f555k && hVar.f528D && hVar.f529E) {
            this.f643r = true;
        }
        hVar.f541Q = false;
        hVar.mo770a(hVar.f570z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo977d(C0170h hVar, Bundle bundle, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo977d(hVar, bundle, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo935d(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo978d(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo978d(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo932c(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r0.f532H;
        r1 = r11.f531G;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo979e(android.support.p005v4.p006a.C0170h r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.f638l
            boolean r1 = r11.f556l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r11.mo778b()
            if (r1 == 0) goto L_0x0016
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x001a
        L_0x0016:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x001a:
            r6 = r0
            int r7 = r11.mo739N()
            int r8 = r11.mo740O()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.mo950a((android.support.p005v4.p006a.C0170h) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
            android.view.View r0 = r11.f532H
            if (r0 == 0) goto L_0x0090
            android.support.v4.a.h r0 = r10.m882p(r11)
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.f532H
            android.view.ViewGroup r1 = r11.f531G
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.f532H
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.f532H
            r1.addView(r4, r0)
        L_0x004b:
            boolean r0 = r11.f540P
            if (r0 == 0) goto L_0x0090
            android.view.ViewGroup r0 = r11.f531G
            if (r0 == 0) goto L_0x0090
            float r0 = r11.f542R
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            android.view.View r0 = r11.f532H
            float r4 = r11.f542R
            r0.setAlpha(r4)
        L_0x0061:
            r11.f542R = r1
            r11.f540P = r3
            int r0 = r11.mo739N()
            int r1 = r11.mo740O()
            android.support.v4.a.n$c r0 = r10.mo942a((android.support.p005v4.p006a.C0170h) r11, (int) r0, (boolean) r2, (int) r1)
            if (r0 == 0) goto L_0x0090
            android.view.View r1 = r11.f532H
            m875b((android.view.View) r1, (android.support.p005v4.p006a.C0186n.C0194c) r0)
            android.view.animation.Animation r1 = r0.f666a
            if (r1 == 0) goto L_0x0084
            android.view.View r1 = r11.f532H
            android.view.animation.Animation r0 = r0.f666a
            r1.startAnimation(r0)
            goto L_0x0090
        L_0x0084:
            android.animation.Animator r1 = r0.f667b
            android.view.View r2 = r11.f532H
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f667b
            r0.start()
        L_0x0090:
            boolean r0 = r11.f541Q
            if (r0 == 0) goto L_0x0097
            r10.mo976d((android.support.p005v4.p006a.C0170h) r11)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p006a.C0186n.mo979e(android.support.v4.a.h):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo980e(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo980e(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo934d(this, hVar);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public boolean mo981e() {
        m878c(true);
        boolean z = false;
        while (m879c(this.f648w, this.f649x)) {
            this.f629c = true;
            try {
                m876b(this.f648w, this.f649x);
                m885z();
                z = true;
            } catch (Throwable th) {
                m885z();
                throw th;
            }
        }
        mo982f();
        m855C();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo982f() {
        if (this.f647v) {
            boolean z = false;
            for (int i = 0; i < this.f632f.size(); i++) {
                C0170h valueAt = this.f632f.valueAt(i);
                if (!(valueAt == null || valueAt.f536L == null)) {
                    z |= valueAt.f536L.mo1062a();
                }
            }
            if (!z) {
                this.f647v = false;
                mo975d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo983f(C0170h hVar) {
        if (hVar.f549e < 0) {
            int i = this.f630d;
            this.f630d = i + 1;
            hVar.mo754a(i, this.f641o);
            if (this.f632f == null) {
                this.f632f = new SparseArray<>();
            }
            this.f632f.put(hVar.f549e, hVar);
            if (f621a) {
                Log.v("FragmentManager", "Allocated fragment index " + hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo984f(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo984f(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo936e(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo985g() {
        if (this.f637k != null) {
            for (int i = 0; i < this.f637k.size(); i++) {
                this.f637k.get(i).mo939a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo986g(C0170h hVar) {
        if (hVar.f549e >= 0) {
            if (f621a) {
                Log.v("FragmentManager", "Freeing fragment index " + hVar);
            }
            this.f632f.put(hVar.f549e, (Object) null);
            this.f639m.mo909a(hVar.f550f);
            hVar.mo818p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo987g(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo987g(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo937f(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0199o mo988h() {
        m864a(this.f625C);
        return this.f625C;
    }

    /* renamed from: h */
    public void mo989h(C0170h hVar) {
        if (f621a) {
            Log.v("FragmentManager", "remove: " + hVar + " nesting=" + hVar.f561q);
        }
        boolean z = !hVar.mo778b();
        if (!hVar.f525A || z) {
            synchronized (this.f631e) {
                this.f631e.remove(hVar);
            }
            if (hVar.f528D && hVar.f529E) {
                this.f643r = true;
            }
            hVar.f555k = false;
            hVar.f556l = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo990h(C0170h hVar, boolean z) {
        C0170h hVar2 = this.f641o;
        if (hVar2 != null) {
            C0183m f = hVar2.mo795f();
            if (f instanceof C0186n) {
                ((C0186n) f).mo990h(hVar, true);
            }
        }
        Iterator<C0313j<C0183m.C0184a, Boolean>> it = this.f627I.iterator();
        while (it.hasNext()) {
            C0313j next = it.next();
            if (!z || ((Boolean) next.f928b).booleanValue()) {
                ((C0183m.C0184a) next.f927a).mo938g(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo991i() {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0199o oVar;
        if (this.f632f != null) {
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f632f.size(); i++) {
                C0170h valueAt = this.f632f.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.f526B) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(valueAt);
                        valueAt.f553i = valueAt.f552h != null ? valueAt.f552h.f549e : -1;
                        if (f621a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    if (valueAt.f564t != null) {
                        valueAt.f564t.mo991i();
                        oVar = valueAt.f564t.f625C;
                    } else {
                        oVar = valueAt.f565u;
                    }
                    if (arrayList == null && oVar != null) {
                        arrayList = new ArrayList(this.f632f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add((Object) null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(oVar);
                    }
                }
            }
        } else {
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList2 == null && arrayList == null) {
            this.f625C = null;
        } else {
            this.f625C = new C0199o(arrayList2, arrayList);
        }
    }

    /* renamed from: i */
    public void mo992i(C0170h hVar) {
        if (f621a) {
            Log.v("FragmentManager", "hide: " + hVar);
        }
        if (!hVar.f570z) {
            hVar.f570z = true;
            hVar.f541Q = true ^ hVar.f541Q;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Parcelable mo993j() {
        int[] iArr;
        int size;
        m853A();
        m854B();
        mo981e();
        this.f644s = true;
        C0164d[] dVarArr = null;
        this.f625C = null;
        SparseArray<C0170h> sparseArray = this.f632f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f632f.size();
        C0202q[] qVarArr = new C0202q[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            C0170h valueAt = this.f632f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.f549e < 0) {
                    m866a((RuntimeException) new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f549e));
                }
                C0202q qVar = new C0202q(valueAt);
                qVarArr[i] = qVar;
                if (valueAt.f546b <= 0 || qVar.f690k != null) {
                    qVar.f690k = valueAt.f547c;
                } else {
                    qVar.f690k = mo1001n(valueAt);
                    if (valueAt.f552h != null) {
                        if (valueAt.f552h.f549e < 0) {
                            m866a((RuntimeException) new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f552h));
                        }
                        if (qVar.f690k == null) {
                            qVar.f690k = new Bundle();
                        }
                        mo946a(qVar.f690k, "android:target_state", valueAt.f552h);
                        if (valueAt.f554j != 0) {
                            qVar.f690k.putInt("android:target_req_state", valueAt.f554j);
                        }
                    }
                }
                if (f621a) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + qVar.f690k);
                }
                z = true;
            }
        }
        if (!z) {
            if (f621a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f631e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i2 = 0; i2 < size3; i2++) {
                iArr[i2] = this.f631e.get(i2).f549e;
                if (iArr[i2] < 0) {
                    m866a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.f631e.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f621a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f631e.get(i2));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0162c> arrayList = this.f633g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            dVarArr = new C0164d[size];
            for (int i3 = 0; i3 < size; i3++) {
                dVarArr[i3] = new C0164d(this.f633g.get(i3));
                if (f621a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f633g.get(i3));
                }
            }
        }
        C0200p pVar = new C0200p();
        pVar.f675a = qVarArr;
        pVar.f676b = iArr;
        pVar.f677c = dVarArr;
        C0170h hVar = this.f642p;
        if (hVar != null) {
            pVar.f678d = hVar.f549e;
        }
        pVar.f679e = this.f630d;
        mo991i();
        return pVar;
    }

    /* renamed from: j */
    public void mo994j(C0170h hVar) {
        if (f621a) {
            Log.v("FragmentManager", "show: " + hVar);
        }
        if (hVar.f570z) {
            hVar.f570z = false;
            hVar.f541Q = !hVar.f541Q;
        }
    }

    /* renamed from: k */
    public void mo995k() {
        this.f625C = null;
        this.f644s = false;
        int size = this.f631e.size();
        for (int i = 0; i < size; i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null) {
                hVar.mo730E();
            }
        }
    }

    /* renamed from: k */
    public void mo996k(C0170h hVar) {
        if (f621a) {
            Log.v("FragmentManager", "detach: " + hVar);
        }
        if (!hVar.f525A) {
            hVar.f525A = true;
            if (hVar.f555k) {
                if (f621a) {
                    Log.v("FragmentManager", "remove from detach: " + hVar);
                }
                synchronized (this.f631e) {
                    this.f631e.remove(hVar);
                }
                if (hVar.f528D && hVar.f529E) {
                    this.f643r = true;
                }
                hVar.f555k = false;
            }
        }
    }

    /* renamed from: l */
    public void mo997l() {
        this.f644s = false;
        m881e(1);
    }

    /* renamed from: l */
    public void mo998l(C0170h hVar) {
        if (f621a) {
            Log.v("FragmentManager", "attach: " + hVar);
        }
        if (hVar.f525A) {
            hVar.f525A = false;
            if (hVar.f555k) {
                return;
            }
            if (!this.f631e.contains(hVar)) {
                if (f621a) {
                    Log.v("FragmentManager", "add from attach: " + hVar);
                }
                synchronized (this.f631e) {
                    this.f631e.add(hVar);
                }
                hVar.f555k = true;
                if (hVar.f528D && hVar.f529E) {
                    this.f643r = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + hVar);
        }
    }

    /* renamed from: m */
    public void mo999m() {
        this.f644s = false;
        m881e(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1000m(C0170h hVar) {
        if (hVar.f533I != null) {
            SparseArray<Parcelable> sparseArray = this.f623A;
            if (sparseArray == null) {
                this.f623A = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            hVar.f533I.saveHierarchyState(this.f623A);
            if (this.f623A.size() > 0) {
                hVar.f548d = this.f623A;
                this.f623A = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Bundle mo1001n(C0170h hVar) {
        Bundle bundle;
        if (this.f651z == null) {
            this.f651z = new Bundle();
        }
        hVar.mo812m(this.f651z);
        mo977d(hVar, this.f651z, false);
        if (!this.f651z.isEmpty()) {
            bundle = this.f651z;
            this.f651z = null;
        } else {
            bundle = null;
        }
        if (hVar.f532H != null) {
            mo1000m(hVar);
        }
        if (hVar.f548d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", hVar.f548d);
        }
        if (!hVar.f535K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", hVar.f535K);
        }
        return bundle;
    }

    /* renamed from: n */
    public void mo1002n() {
        this.f644s = false;
        m881e(4);
    }

    /* renamed from: o */
    public void mo1003o() {
        this.f644s = false;
        m881e(5);
    }

    /* renamed from: o */
    public void mo1004o(C0170h hVar) {
        if (hVar == null || (this.f632f.get(hVar.f549e) == hVar && (hVar.f563s == null || hVar.mo795f() == this))) {
            this.f642p = hVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + hVar + " is not an active fragment of FragmentManager " + this);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0170h hVar;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0196e.f669a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0170h.m640a(this.f639m.mo913g(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str3);
        }
        C0170h b = resourceId != -1 ? mo962b(resourceId) : null;
        if (b == null && string != null) {
            b = mo941a(string);
        }
        if (b == null && i != -1) {
            b = mo962b(i);
        }
        if (f621a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str3 + " existing=" + b);
        }
        if (b == null) {
            C0170h a = this.f640n.mo831a(context2, str3, (Bundle) null);
            a.f557m = true;
            a.f567w = resourceId != 0 ? resourceId : i;
            a.f568x = i;
            a.f569y = string;
            a.f558n = true;
            a.f562r = this;
            C0182l lVar = this.f639m;
            a.f563s = lVar;
            a.mo760a(lVar.mo913g(), attributeSet2, a.f547c);
            mo954a(a, true);
            hVar = a;
        } else if (!b.f558n) {
            b.f558n = true;
            b.f563s = this.f639m;
            if (!b.f527C) {
                b.mo760a(this.f639m.mo913g(), attributeSet2, b.f547c);
            }
            hVar = b;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + str3);
        }
        if (this.f638l >= 1 || !hVar.f557m) {
            mo964b(hVar);
        } else {
            mo950a(hVar, 1, 0, 0, false);
        }
        if (hVar.f532H != null) {
            if (resourceId != 0) {
                hVar.f532H.setId(resourceId);
            }
            if (hVar.f532H.getTag() == null) {
                hVar.f532H.setTag(string);
            }
            return hVar.f532H;
        }
        throw new IllegalStateException("Fragment " + str3 + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo1007p() {
        m881e(4);
    }

    /* renamed from: q */
    public void mo1008q() {
        this.f644s = true;
        m881e(3);
    }

    /* renamed from: r */
    public void mo1009r() {
        m881e(2);
    }

    /* renamed from: s */
    public void mo1010s() {
        m881e(1);
    }

    /* renamed from: t */
    public void mo1011t() {
        this.f645t = true;
        mo981e();
        m881e(0);
        this.f639m = null;
        this.f640n = null;
        this.f641o = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f641o;
        if (obj == null) {
            obj = this.f639m;
        }
        C0299d.m1339a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1013u() {
        for (int i = 0; i < this.f631e.size(); i++) {
            C0170h hVar = this.f631e.get(i);
            if (hVar != null) {
                hVar.mo731F();
            }
        }
    }

    /* renamed from: v */
    public C0170h mo1014v() {
        return this.f642p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public LayoutInflater.Factory2 mo1015w() {
        return this;
    }
}
