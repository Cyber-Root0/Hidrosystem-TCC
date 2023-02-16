package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.l */
final class C0146l {

    /* renamed from: a */
    ValueAnimator f454a = null;

    /* renamed from: b */
    private final ArrayList<C0148a> f455b = new ArrayList<>();

    /* renamed from: c */
    private C0148a f456c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f457d = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            if (C0146l.this.f454a == animator) {
                C0146l.this.f454a = null;
            }
        }
    };

    /* renamed from: android.support.design.widget.l$a */
    static class C0148a {

        /* renamed from: a */
        final int[] f459a;

        /* renamed from: b */
        final ValueAnimator f460b;

        C0148a(int[] iArr, ValueAnimator valueAnimator) {
            this.f459a = iArr;
            this.f460b = valueAnimator;
        }
    }

    C0146l() {
    }

    /* renamed from: a */
    private void m583a(C0148a aVar) {
        this.f454a = aVar.f460b;
        this.f454a.start();
    }

    /* renamed from: b */
    private void m584b() {
        ValueAnimator valueAnimator = this.f454a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f454a = null;
        }
    }

    /* renamed from: a */
    public void mo678a() {
        ValueAnimator valueAnimator = this.f454a;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f454a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo679a(int[] iArr) {
        C0148a aVar;
        int size = this.f455b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f455b.get(i);
            if (StateSet.stateSetMatches(aVar.f459a, iArr)) {
                break;
            }
            i++;
        }
        C0148a aVar2 = this.f456c;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                m584b();
            }
            this.f456c = aVar;
            if (aVar != null) {
                m583a(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo680a(int[] iArr, ValueAnimator valueAnimator) {
        C0148a aVar = new C0148a(iArr, valueAnimator);
        valueAnimator.addListener(this.f457d);
        this.f455b.add(aVar);
    }
}
