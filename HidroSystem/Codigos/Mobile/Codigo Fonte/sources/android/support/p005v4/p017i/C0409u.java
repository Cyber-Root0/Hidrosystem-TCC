package android.support.p005v4.p017i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.i.u */
public final class C0409u {

    /* renamed from: a */
    Runnable f1035a = null;

    /* renamed from: b */
    Runnable f1036b = null;

    /* renamed from: c */
    int f1037c = -1;

    /* renamed from: d */
    private WeakReference<View> f1038d;

    /* renamed from: android.support.v4.i.u$a */
    static class C0412a implements C0413v {

        /* renamed from: a */
        C0409u f1045a;

        /* renamed from: b */
        boolean f1046b;

        C0412a(C0409u uVar) {
            this.f1045a = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.support.v4.i.v} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1643a(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f1046b = r0
                android.support.v4.i.u r0 = r3.f1045a
                int r0 = r0.f1037c
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                android.support.v4.i.u r0 = r3.f1045a
                java.lang.Runnable r0 = r0.f1035a
                if (r0 == 0) goto L_0x0020
                android.support.v4.i.u r0 = r3.f1045a
                java.lang.Runnable r0 = r0.f1035a
                android.support.v4.i.u r2 = r3.f1045a
                r2.f1035a = r1
                r0.run()
            L_0x0020:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof android.support.p005v4.p017i.C0413v
                if (r2 == 0) goto L_0x002d
                r1 = r0
                android.support.v4.i.v r1 = (android.support.p005v4.p017i.C0413v) r1
            L_0x002d:
                if (r1 == 0) goto L_0x0032
                r1.mo1643a(r4)
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p017i.C0409u.C0412a.mo1643a(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.support.v4.i.v} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1644b(android.view.View r4) {
            /*
                r3 = this;
                android.support.v4.i.u r0 = r3.f1045a
                int r0 = r0.f1037c
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x0013
                android.support.v4.i.u r0 = r3.f1045a
                int r0 = r0.f1037c
                r4.setLayerType(r0, r2)
                android.support.v4.i.u r0 = r3.f1045a
                r0.f1037c = r1
            L_0x0013:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x001d
                boolean r0 = r3.f1046b
                if (r0 != 0) goto L_0x0043
            L_0x001d:
                android.support.v4.i.u r0 = r3.f1045a
                java.lang.Runnable r0 = r0.f1036b
                if (r0 == 0) goto L_0x002e
                android.support.v4.i.u r0 = r3.f1045a
                java.lang.Runnable r0 = r0.f1036b
                android.support.v4.i.u r1 = r3.f1045a
                r1.f1036b = r2
                r0.run()
            L_0x002e:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof android.support.p005v4.p017i.C0413v
                if (r1 == 0) goto L_0x003b
                r2 = r0
                android.support.v4.i.v r2 = (android.support.p005v4.p017i.C0413v) r2
            L_0x003b:
                if (r2 == 0) goto L_0x0040
                r2.mo1644b(r4)
            L_0x0040:
                r4 = 1
                r3.f1046b = r4
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p017i.C0409u.C0412a.mo1644b(android.view.View):void");
        }

        /* renamed from: c */
        public void mo1645c(View view) {
            Object tag = view.getTag(2113929216);
            C0413v vVar = tag instanceof C0413v ? (C0413v) tag : null;
            if (vVar != null) {
                vVar.mo1645c(view);
            }
        }
    }

    C0409u(View view) {
        this.f1038d = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m1796a(final View view, final C0413v vVar) {
        if (vVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    vVar.mo1645c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    vVar.mo1644b(view);
                }

                public void onAnimationStart(Animator animator) {
                    vVar.mo1643a(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public long mo1629a() {
        View view = (View) this.f1038d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public C0409u mo1630a(float f) {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0409u mo1631a(long j) {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0409u mo1632a(C0413v vVar) {
        View view = (View) this.f1038d.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, vVar);
                vVar = new C0412a(this);
            }
            m1796a(view, vVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0409u mo1633a(final C0415x xVar) {
        final View view = (View) this.f1038d.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C04112 r1 = null;
            if (xVar != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        xVar.mo1646a(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public C0409u mo1634a(Interpolator interpolator) {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0409u mo1635b(float f) {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0409u mo1636b(long j) {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void mo1637b() {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void mo1638c() {
        View view = (View) this.f1038d.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
