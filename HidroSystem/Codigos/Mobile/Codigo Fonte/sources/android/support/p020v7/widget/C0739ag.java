package android.support.p020v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.widget.C0787av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.ag */
public class C0739ag extends C0838bb {

    /* renamed from: i */
    private static TimeInterpolator f2393i;

    /* renamed from: a */
    ArrayList<ArrayList<C0787av.C0826w>> f2394a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C0749b>> f2395b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C0748a>> f2396c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C0787av.C0826w> f2397d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C0787av.C0826w> f2398e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C0787av.C0826w> f2399f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C0787av.C0826w> f2400g = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0787av.C0826w> f2401j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0787av.C0826w> f2402k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C0749b> f2403l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C0748a> f2404m = new ArrayList<>();

    /* renamed from: android.support.v7.widget.ag$a */
    private static class C0748a {

        /* renamed from: a */
        public C0787av.C0826w f2433a;

        /* renamed from: b */
        public C0787av.C0826w f2434b;

        /* renamed from: c */
        public int f2435c;

        /* renamed from: d */
        public int f2436d;

        /* renamed from: e */
        public int f2437e;

        /* renamed from: f */
        public int f2438f;

        private C0748a(C0787av.C0826w wVar, C0787av.C0826w wVar2) {
            this.f2433a = wVar;
            this.f2434b = wVar2;
        }

        C0748a(C0787av.C0826w wVar, C0787av.C0826w wVar2, int i, int i2, int i3, int i4) {
            this(wVar, wVar2);
            this.f2435c = i;
            this.f2436d = i2;
            this.f2437e = i3;
            this.f2438f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2433a + ", newHolder=" + this.f2434b + ", fromX=" + this.f2435c + ", fromY=" + this.f2436d + ", toX=" + this.f2437e + ", toY=" + this.f2438f + '}';
        }
    }

    /* renamed from: android.support.v7.widget.ag$b */
    private static class C0749b {

        /* renamed from: a */
        public C0787av.C0826w f2439a;

        /* renamed from: b */
        public int f2440b;

        /* renamed from: c */
        public int f2441c;

        /* renamed from: d */
        public int f2442d;

        /* renamed from: e */
        public int f2443e;

        C0749b(C0787av.C0826w wVar, int i, int i2, int i3, int i4) {
            this.f2439a = wVar;
            this.f2440b = i;
            this.f2441c = i2;
            this.f2442d = i3;
            this.f2443e = i4;
        }
    }

    /* renamed from: a */
    private void m3819a(List<C0748a> list, C0787av.C0826w wVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0748a aVar = list.get(size);
            if (m3820a(aVar, wVar) && aVar.f2433a == null && aVar.f2434b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m3820a(C0748a aVar, C0787av.C0826w wVar) {
        boolean z = false;
        if (aVar.f2434b == wVar) {
            aVar.f2434b = null;
        } else if (aVar.f2433a != wVar) {
            return false;
        } else {
            aVar.f2433a = null;
            z = true;
        }
        wVar.f2785a.setAlpha(1.0f);
        wVar.f2785a.setTranslationX(0.0f);
        wVar.f2785a.setTranslationY(0.0f);
        mo4259a(wVar, z);
        return true;
    }

    /* renamed from: b */
    private void m3821b(C0748a aVar) {
        if (aVar.f2433a != null) {
            m3820a(aVar, aVar.f2433a);
        }
        if (aVar.f2434b != null) {
            m3820a(aVar, aVar.f2434b);
        }
    }

    /* renamed from: u */
    private void m3822u(final C0787av.C0826w wVar) {
        final View view = wVar.f2785a;
        final ViewPropertyAnimator animate = view.animate();
        this.f2399f.add(wVar);
        animate.setDuration(mo3948g()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                C0739ag.this.mo4263i(wVar);
                C0739ag.this.f2399f.remove(wVar);
                C0739ag.this.mo3569c();
            }

            public void onAnimationStart(Animator animator) {
                C0739ag.this.mo4266l(wVar);
            }
        }).start();
    }

    /* renamed from: v */
    private void m3823v(C0787av.C0826w wVar) {
        if (f2393i == null) {
            f2393i = new ValueAnimator().getInterpolator();
        }
        wVar.f2785a.animate().setInterpolator(f2393i);
        mo3572d(wVar);
    }

    /* renamed from: a */
    public void mo3559a() {
        boolean z = !this.f2401j.isEmpty();
        boolean z2 = !this.f2403l.isEmpty();
        boolean z3 = !this.f2404m.isEmpty();
        boolean z4 = !this.f2402k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<C0787av.C0826w> it = this.f2401j.iterator();
            while (it.hasNext()) {
                m3822u(it.next());
            }
            this.f2401j.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f2403l);
                this.f2395b.add(arrayList);
                this.f2403l.clear();
                C07401 r6 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C0749b bVar = (C0749b) it.next();
                            C0739ag.this.mo3566b(bVar.f2439a, bVar.f2440b, bVar.f2441c, bVar.f2442d, bVar.f2443e);
                        }
                        arrayList.clear();
                        C0739ag.this.f2395b.remove(arrayList);
                    }
                };
                if (z) {
                    C0388q.m1648a(((C0749b) arrayList.get(0)).f2439a.f2785a, (Runnable) r6, mo3948g());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f2404m);
                this.f2396c.add(arrayList2);
                this.f2404m.clear();
                C07412 r62 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C0739ag.this.mo3560a((C0748a) it.next());
                        }
                        arrayList2.clear();
                        C0739ag.this.f2396c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0388q.m1648a(((C0748a) arrayList2.get(0)).f2433a.f2785a, (Runnable) r62, mo3948g());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f2402k);
                this.f2394a.add(arrayList3);
                this.f2402k.clear();
                C07423 r5 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C0739ag.this.mo3570c((C0787av.C0826w) it.next());
                        }
                        arrayList3.clear();
                        C0739ag.this.f2394a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long g = z ? mo3948g() : 0;
                    long e = z2 ? mo3945e() : 0;
                    if (z3) {
                        j = mo3950h();
                    }
                    C0388q.m1648a(((C0787av.C0826w) arrayList3.get(0)).f2785a, (Runnable) r5, g + Math.max(e, j));
                    return;
                }
                r5.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3560a(final C0748a aVar) {
        C0787av.C0826w wVar = aVar.f2433a;
        final View view = null;
        final View view2 = wVar == null ? null : wVar.f2785a;
        C0787av.C0826w wVar2 = aVar.f2434b;
        if (wVar2 != null) {
            view = wVar2.f2785a;
        }
        if (view2 != null) {
            final ViewPropertyAnimator duration = view2.animate().setDuration(mo3950h());
            this.f2400g.add(aVar.f2433a);
            duration.translationX((float) (aVar.f2437e - aVar.f2435c));
            duration.translationY((float) (aVar.f2438f - aVar.f2436d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    duration.setListener((Animator.AnimatorListener) null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C0739ag.this.mo4259a(aVar.f2433a, true);
                    C0739ag.this.f2400g.remove(aVar.f2433a);
                    C0739ag.this.mo3569c();
                }

                public void onAnimationStart(Animator animator) {
                    C0739ag.this.mo4260b(aVar.f2433a, true);
                }
            }).start();
        }
        if (view != null) {
            final ViewPropertyAnimator animate = view.animate();
            this.f2400g.add(aVar.f2434b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo3950h()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    animate.setListener((Animator.AnimatorListener) null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C0739ag.this.mo4259a(aVar.f2434b, false);
                    C0739ag.this.f2400g.remove(aVar.f2434b);
                    C0739ag.this.mo3569c();
                }

                public void onAnimationStart(Animator animator) {
                    C0739ag.this.mo4260b(aVar.f2434b, false);
                }
            }).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3561a(List<C0787av.C0826w> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2785a.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo3562a(C0787av.C0826w wVar) {
        m3823v(wVar);
        this.f2401j.add(wVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo3563a(C0787av.C0826w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.f2785a;
        int translationX = i + ((int) wVar.f2785a.getTranslationX());
        int translationY = i2 + ((int) wVar.f2785a.getTranslationY());
        m3823v(wVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4264j(wVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f2403l.add(new C0749b(wVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo3564a(C0787av.C0826w wVar, C0787av.C0826w wVar2, int i, int i2, int i3, int i4) {
        if (wVar == wVar2) {
            return mo3563a(wVar, i, i2, i3, i4);
        }
        float translationX = wVar.f2785a.getTranslationX();
        float translationY = wVar.f2785a.getTranslationY();
        float alpha = wVar.f2785a.getAlpha();
        m3823v(wVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        wVar.f2785a.setTranslationX(translationX);
        wVar.f2785a.setTranslationY(translationY);
        wVar.f2785a.setAlpha(alpha);
        if (wVar2 != null) {
            m3823v(wVar2);
            wVar2.f2785a.setTranslationX((float) (-i5));
            wVar2.f2785a.setTranslationY((float) (-i6));
            wVar2.f2785a.setAlpha(0.0f);
        }
        this.f2404m.add(new C0748a(wVar, wVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo3565a(C0787av.C0826w wVar, List<Object> list) {
        return !list.isEmpty() || super.mo3565a(wVar, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3566b(C0787av.C0826w wVar, int i, int i2, int i3, int i4) {
        final View view = wVar.f2785a;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f2398e.add(wVar);
        final C0787av.C0826w wVar2 = wVar;
        animate.setDuration(mo3945e()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                C0739ag.this.mo4264j(wVar2);
                C0739ag.this.f2398e.remove(wVar2);
                C0739ag.this.mo3569c();
            }

            public void onAnimationStart(Animator animator) {
                C0739ag.this.mo4267m(wVar2);
            }
        }).start();
    }

    /* renamed from: b */
    public boolean mo3567b() {
        return !this.f2402k.isEmpty() || !this.f2404m.isEmpty() || !this.f2403l.isEmpty() || !this.f2401j.isEmpty() || !this.f2398e.isEmpty() || !this.f2399f.isEmpty() || !this.f2397d.isEmpty() || !this.f2400g.isEmpty() || !this.f2395b.isEmpty() || !this.f2394a.isEmpty() || !this.f2396c.isEmpty();
    }

    /* renamed from: b */
    public boolean mo3568b(C0787av.C0826w wVar) {
        m3823v(wVar);
        wVar.f2785a.setAlpha(0.0f);
        this.f2402k.add(wVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3569c() {
        if (!mo3567b()) {
            mo3952i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3570c(final C0787av.C0826w wVar) {
        final View view = wVar.f2785a;
        final ViewPropertyAnimator animate = view.animate();
        this.f2397d.add(wVar);
        animate.alpha(1.0f).setDuration(mo3946f()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                C0739ag.this.mo4265k(wVar);
                C0739ag.this.f2397d.remove(wVar);
                C0739ag.this.mo3569c();
            }

            public void onAnimationStart(Animator animator) {
                C0739ag.this.mo4268n(wVar);
            }
        }).start();
    }

    /* renamed from: d */
    public void mo3571d() {
        int size = this.f2403l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0749b bVar = this.f2403l.get(size);
            View view = bVar.f2439a.f2785a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4264j(bVar.f2439a);
            this.f2403l.remove(size);
        }
        for (int size2 = this.f2401j.size() - 1; size2 >= 0; size2--) {
            mo4263i(this.f2401j.get(size2));
            this.f2401j.remove(size2);
        }
        int size3 = this.f2402k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0787av.C0826w wVar = this.f2402k.get(size3);
            wVar.f2785a.setAlpha(1.0f);
            mo4265k(wVar);
            this.f2402k.remove(size3);
        }
        for (int size4 = this.f2404m.size() - 1; size4 >= 0; size4--) {
            m3821b(this.f2404m.get(size4));
        }
        this.f2404m.clear();
        if (mo3567b()) {
            for (int size5 = this.f2395b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f2395b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0749b bVar2 = (C0749b) arrayList.get(size6);
                    View view2 = bVar2.f2439a.f2785a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4264j(bVar2.f2439a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2395b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2394a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f2394a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0787av.C0826w wVar2 = (C0787av.C0826w) arrayList2.get(size8);
                    wVar2.f2785a.setAlpha(1.0f);
                    mo4265k(wVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2394a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2396c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f2396c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3821b((C0748a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2396c.remove(arrayList3);
                    }
                }
            }
            mo3561a((List<C0787av.C0826w>) this.f2399f);
            mo3561a((List<C0787av.C0826w>) this.f2398e);
            mo3561a((List<C0787av.C0826w>) this.f2397d);
            mo3561a((List<C0787av.C0826w>) this.f2400g);
            mo3952i();
        }
    }

    /* renamed from: d */
    public void mo3572d(C0787av.C0826w wVar) {
        View view = wVar.f2785a;
        view.animate().cancel();
        int size = this.f2403l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2403l.get(size).f2439a == wVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4264j(wVar);
                this.f2403l.remove(size);
            }
        }
        m3819a((List<C0748a>) this.f2404m, wVar);
        if (this.f2401j.remove(wVar)) {
            view.setAlpha(1.0f);
            mo4263i(wVar);
        }
        if (this.f2402k.remove(wVar)) {
            view.setAlpha(1.0f);
            mo4265k(wVar);
        }
        for (int size2 = this.f2396c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f2396c.get(size2);
            m3819a((List<C0748a>) arrayList, wVar);
            if (arrayList.isEmpty()) {
                this.f2396c.remove(size2);
            }
        }
        for (int size3 = this.f2395b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f2395b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0749b) arrayList2.get(size4)).f2439a == wVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4264j(wVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2395b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2394a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f2394a.get(size5);
            if (arrayList3.remove(wVar)) {
                view.setAlpha(1.0f);
                mo4265k(wVar);
                if (arrayList3.isEmpty()) {
                    this.f2394a.remove(size5);
                }
            }
        }
        this.f2399f.remove(wVar);
        this.f2397d.remove(wVar);
        this.f2400g.remove(wVar);
        this.f2398e.remove(wVar);
        mo3569c();
    }
}
