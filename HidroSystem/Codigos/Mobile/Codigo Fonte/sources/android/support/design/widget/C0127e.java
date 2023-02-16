package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p017i.C0388q;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;

/* renamed from: android.support.design.widget.e */
class C0127e {

    /* renamed from: a */
    static final Interpolator f379a = C0106a.f334c;

    /* renamed from: j */
    static final int[] f380j = {16842919, 16842910};

    /* renamed from: k */
    static final int[] f381k = {16842908, 16842910};

    /* renamed from: l */
    static final int[] f382l = {16842910};

    /* renamed from: m */
    static final int[] f383m = new int[0];

    /* renamed from: b */
    int f384b = 0;

    /* renamed from: c */
    C0140i f385c;

    /* renamed from: d */
    Drawable f386d;

    /* renamed from: e */
    Drawable f387e;

    /* renamed from: f */
    C0125c f388f;

    /* renamed from: g */
    Drawable f389g;

    /* renamed from: h */
    float f390h;

    /* renamed from: i */
    float f391i;

    /* renamed from: n */
    final C0154r f392n;

    /* renamed from: o */
    final C0141j f393o;

    /* renamed from: p */
    private final C0146l f394p;

    /* renamed from: q */
    private float f395q;

    /* renamed from: r */
    private final Rect f396r = new Rect();

    /* renamed from: s */
    private ViewTreeObserver.OnPreDrawListener f397s;

    /* renamed from: android.support.design.widget.e$a */
    private class C0131a extends C0135e {
        C0131a() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo646a() {
            return 0.0f;
        }
    }

    /* renamed from: android.support.design.widget.e$b */
    private class C0132b extends C0135e {
        C0132b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo646a() {
            return C0127e.this.f390h + C0127e.this.f391i;
        }
    }

    /* renamed from: android.support.design.widget.e$c */
    interface C0133c {
        /* renamed from: a */
        void mo520a();

        /* renamed from: b */
        void mo521b();
    }

    /* renamed from: android.support.design.widget.e$d */
    private class C0134d extends C0135e {
        C0134d() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo646a() {
            return C0127e.this.f390h;
        }
    }

    /* renamed from: android.support.design.widget.e$e */
    private abstract class C0135e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f409a;

        /* renamed from: c */
        private float f411c;

        /* renamed from: d */
        private float f412d;

        private C0135e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo646a();

        public void onAnimationEnd(Animator animator) {
            C0127e.this.f385c.mo661b(this.f412d);
            this.f409a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f409a) {
                this.f411c = C0127e.this.f385c.mo658a();
                this.f412d = mo646a();
                this.f409a = true;
            }
            C0140i iVar = C0127e.this.f385c;
            float f = this.f411c;
            iVar.mo661b(f + ((this.f412d - f) * valueAnimator.getAnimatedFraction()));
        }
    }

    C0127e(C0154r rVar, C0141j jVar) {
        this.f392n = rVar;
        this.f393o = jVar;
        this.f394p = new C0146l();
        this.f394p.mo680a(f380j, m490a((C0135e) new C0132b()));
        this.f394p.mo680a(f381k, m490a((C0135e) new C0132b()));
        this.f394p.mo680a(f382l, m490a((C0135e) new C0134d()));
        this.f394p.mo680a(f383m, m490a((C0135e) new C0131a()));
        this.f395q = this.f392n.getRotation();
    }

    /* renamed from: a */
    private ValueAnimator m490a(C0135e eVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f379a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(eVar);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: b */
    private static ColorStateList m491b(int i) {
        return new ColorStateList(new int[][]{f381k, f380j, new int[0]}, new int[]{i, i, 0});
    }

    /* renamed from: l */
    private void m492l() {
        if (this.f397s == null) {
            this.f397s = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    C0127e.this.mo637i();
                    return true;
                }
            };
        }
    }

    /* renamed from: m */
    private boolean m493m() {
        return C0388q.m1676w(this.f392n) && !this.f392n.isInEditMode();
    }

    /* renamed from: n */
    private void m494n() {
        int i;
        C0154r rVar;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f395q % 90.0f != 0.0f) {
                i = 1;
                if (this.f392n.getLayerType() != 1) {
                    rVar = this.f392n;
                }
            } else if (this.f392n.getLayerType() != 0) {
                rVar = this.f392n;
                i = 0;
            }
            rVar.setLayerType(i, (Paint) null);
        }
        C0140i iVar = this.f385c;
        if (iVar != null) {
            iVar.mo659a(-this.f395q);
        }
        C0125c cVar = this.f388f;
        if (cVar != null) {
            cVar.mo601a(-this.f395q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo619a() {
        return this.f390h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo620a(float f) {
        if (this.f390h != f) {
            this.f390h = f;
            mo621a(f, this.f391i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo621a(float f, float f2) {
        C0140i iVar = this.f385c;
        if (iVar != null) {
            iVar.mo660a(f, this.f391i + f);
            mo633e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo622a(int i) {
        Drawable drawable = this.f387e;
        if (drawable != null) {
            C0240a.m1124a(drawable, m491b(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo623a(ColorStateList colorStateList) {
        Drawable drawable = this.f386d;
        if (drawable != null) {
            C0240a.m1124a(drawable, colorStateList);
        }
        C0125c cVar = this.f388f;
        if (cVar != null) {
            cVar.mo602a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo624a(PorterDuff.Mode mode) {
        Drawable drawable = this.f386d;
        if (drawable != null) {
            C0240a.m1127a(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo625a(Rect rect) {
        this.f385c.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo626a(final C0133c cVar, final boolean z) {
        if (!mo639k()) {
            this.f392n.animate().cancel();
            if (m493m()) {
                this.f384b = 1;
                this.f392n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C0106a.f334c).setListener(new AnimatorListenerAdapter() {

                    /* renamed from: d */
                    private boolean f401d;

                    public void onAnimationCancel(Animator animator) {
                        this.f401d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        C0127e eVar = C0127e.this;
                        eVar.f384b = 0;
                        if (!this.f401d) {
                            eVar.f392n.mo686a(z ? 8 : 4, z);
                            C0133c cVar = cVar;
                            if (cVar != null) {
                                cVar.mo521b();
                            }
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        C0127e.this.f392n.mo686a(0, z);
                        this.f401d = false;
                    }
                });
                return;
            }
            this.f392n.mo686a(z ? 8 : 4, z);
            if (cVar != null) {
                cVar.mo521b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo627a(int[] iArr) {
        this.f394p.mo679a(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo628b() {
        this.f394p.mo678a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo629b(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo630b(final C0133c cVar, final boolean z) {
        if (!mo638j()) {
            this.f392n.animate().cancel();
            if (m493m()) {
                this.f384b = 2;
                if (this.f392n.getVisibility() != 0) {
                    this.f392n.setAlpha(0.0f);
                    this.f392n.setScaleY(0.0f);
                    this.f392n.setScaleX(0.0f);
                }
                this.f392n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C0106a.f335d).setListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        C0127e.this.f384b = 0;
                        C0133c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo520a();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        C0127e.this.f392n.mo686a(0, z);
                    }
                });
                return;
            }
            this.f392n.mo686a(0, z);
            this.f392n.setAlpha(1.0f);
            this.f392n.setScaleY(1.0f);
            this.f392n.setScaleX(1.0f);
            if (cVar != null) {
                cVar.mo520a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Drawable mo631c() {
        return this.f389g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo632d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo633e() {
        Rect rect = this.f396r;
        mo625a(rect);
        mo629b(rect);
        this.f393o.mo528a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo634f() {
        if (mo636h()) {
            m492l();
            this.f392n.getViewTreeObserver().addOnPreDrawListener(this.f397s);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo635g() {
        if (this.f397s != null) {
            this.f392n.getViewTreeObserver().removeOnPreDrawListener(this.f397s);
            this.f397s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo636h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo637i() {
        float rotation = this.f392n.getRotation();
        if (this.f395q != rotation) {
            this.f395q = rotation;
            m494n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo638j() {
        return this.f392n.getVisibility() != 0 ? this.f384b == 2 : this.f384b != 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo639k() {
        return this.f392n.getVisibility() == 0 ? this.f384b == 1 : this.f384b != 2;
    }
}
