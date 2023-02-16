package android.support.p020v7.widget;

import android.support.p020v7.widget.C0787av;
import android.view.View;

/* renamed from: android.support.v7.widget.an */
class C0766an {

    /* renamed from: a */
    boolean f2513a = true;

    /* renamed from: b */
    int f2514b;

    /* renamed from: c */
    int f2515c;

    /* renamed from: d */
    int f2516d;

    /* renamed from: e */
    int f2517e;

    /* renamed from: f */
    int f2518f = 0;

    /* renamed from: g */
    int f2519g = 0;

    /* renamed from: h */
    boolean f2520h;

    /* renamed from: i */
    boolean f2521i;

    C0766an() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3631a(C0787av.C0816o oVar) {
        View c = oVar.mo4094c(this.f2515c);
        this.f2515c += this.f2516d;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3632a(C0787av.C0823t tVar) {
        int i = this.f2515c;
        return i >= 0 && i < tVar.mo4136e();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2514b + ", mCurrentPosition=" + this.f2515c + ", mItemDirection=" + this.f2516d + ", mLayoutDirection=" + this.f2517e + ", mStartLine=" + this.f2518f + ", mEndLine=" + this.f2519g + '}';
    }
}
