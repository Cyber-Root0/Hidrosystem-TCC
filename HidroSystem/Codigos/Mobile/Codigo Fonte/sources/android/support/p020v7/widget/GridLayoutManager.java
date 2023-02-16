package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p020v7.widget.C0787av;
import android.support.p020v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f2142a = false;

    /* renamed from: b */
    int f2143b = -1;

    /* renamed from: c */
    int[] f2144c;

    /* renamed from: d */
    View[] f2145d;

    /* renamed from: e */
    final SparseIntArray f2146e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f2147f = new SparseIntArray();

    /* renamed from: g */
    C0697c f2148g = new C0695a();

    /* renamed from: h */
    final Rect f2149h = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C0695a extends C0697c {
        /* renamed from: a */
        public int mo3149a(int i) {
            return 1;
        }

        /* renamed from: a */
        public int mo3150a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static class C0696b extends C0787av.C0809i {

        /* renamed from: a */
        int f2150a = -1;

        /* renamed from: b */
        int f2151b = 0;

        public C0696b(int i, int i2) {
            super(i, i2);
        }

        public C0696b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0696b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0696b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public int mo3151a() {
            return this.f2150a;
        }

        /* renamed from: b */
        public int mo3152b() {
            return this.f2151b;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$c */
    public static abstract class C0697c {

        /* renamed from: a */
        final SparseIntArray f2152a = new SparseIntArray();

        /* renamed from: b */
        private boolean f2153b = false;

        /* renamed from: a */
        public abstract int mo3149a(int i);

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3150a(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo3149a(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f2153b
                if (r2 == 0) goto L_0x0026
                android.util.SparseIntArray r2 = r5.f2152a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0026
                int r2 = r5.mo3154b(r6)
                if (r2 < 0) goto L_0x0026
                android.util.SparseIntArray r3 = r5.f2152a
                int r3 = r3.get(r2)
                int r4 = r5.mo3149a(r2)
                int r3 = r3 + r4
                goto L_0x0036
            L_0x0026:
                r2 = 0
                r3 = 0
            L_0x0028:
                if (r2 >= r6) goto L_0x0039
                int r4 = r5.mo3149a(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0033
                r3 = 0
                goto L_0x0036
            L_0x0033:
                if (r3 <= r7) goto L_0x0036
                r3 = r4
            L_0x0036:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0039:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003d
                return r3
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.GridLayoutManager.C0697c.mo3150a(int, int):int");
        }

        /* renamed from: a */
        public void mo3153a() {
            this.f2152a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3154b(int i) {
            int size = this.f2152a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2152a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f2152a.size()) {
                return -1;
            }
            return this.f2152a.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3155b(int i, int i2) {
            if (!this.f2153b) {
                return mo3150a(i, i2);
            }
            int i3 = this.f2152a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo3150a(i, i2);
            this.f2152a.put(i, a);
            return a;
        }

        /* renamed from: c */
        public int mo3156c(int i, int i2) {
            int a = mo3149a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo3149a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo3131a(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo3131a(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3131a(m4240a(context, attributeSet, i, i2).f2722b);
    }

    /* renamed from: J */
    private void m3316J() {
        this.f2146e.clear();
        this.f2147f.clear();
    }

    /* renamed from: K */
    private void m3317K() {
        int u = mo4045u();
        for (int i = 0; i < u; i++) {
            C0696b bVar = (C0696b) mo4030h(i).getLayoutParams();
            int f = bVar.mo4059f();
            this.f2146e.put(f, bVar.mo3152b());
            this.f2147f.put(f, bVar.mo3151a());
        }
    }

    /* renamed from: L */
    private void m3318L() {
        int i;
        int i2;
        if (mo3179f() == 1) {
            i2 = mo4048x() - mo3964B();
            i = mo4050z();
        } else {
            i2 = mo4049y() - mo3965C();
            i = mo3963A();
        }
        m3329l(i2 - i);
    }

    /* renamed from: M */
    private void m3319M() {
        View[] viewArr = this.f2145d;
        if (viewArr == null || viewArr.length != this.f2143b) {
            this.f2145d = new View[this.f2143b];
        }
    }

    /* renamed from: a */
    private int m3320a(C0787av.C0816o oVar, C0787av.C0823t tVar, int i) {
        if (!tVar.mo4132a()) {
            return this.f2148g.mo3156c(i, this.f2143b);
        }
        int b = oVar.mo4088b(i);
        if (b != -1) {
            return this.f2148g.mo3156c(b, this.f2143b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: a */
    private void m3321a(float f, int i) {
        m3329l(Math.max(Math.round(f * ((float) this.f2143b)), i));
    }

    /* renamed from: a */
    private void m3322a(C0787av.C0816o oVar, C0787av.C0823t tVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.f2145d[i4];
            C0696b bVar = (C0696b) view.getLayoutParams();
            bVar.f2151b = m3328c(oVar, tVar, mo4015d(view));
            bVar.f2150a = i5;
            i5 += bVar.f2151b;
            i4 += i3;
        }
    }

    /* renamed from: a */
    private void m3323a(View view, int i, int i2, boolean z) {
        C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
        if (z ? mo3996a(view, i, i2, iVar) : mo4006b(view, i, i2, iVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m3324a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0696b bVar = (C0696b) view.getLayoutParams();
        Rect rect = bVar.f2726d;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int a = mo3123a(bVar.f2150a, bVar.f2151b);
        if (this.f2162i == 1) {
            i2 = m4239a(a, i, i5, bVar.width, false);
            i3 = m4239a(this.f2163j.mo3746f(), mo4047w(), i4, bVar.height, true);
        } else {
            int a2 = m4239a(a, i, i4, bVar.height, false);
            int a3 = m4239a(this.f2163j.mo3746f(), mo4046v(), i5, bVar.width, true);
            i3 = a2;
            i2 = a3;
        }
        m3323a(view, i2, i3, z);
    }

    /* renamed from: a */
    static int[] m3325a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m3326b(C0787av.C0816o oVar, C0787av.C0823t tVar, int i) {
        if (!tVar.mo4132a()) {
            return this.f2148g.mo3155b(i, this.f2143b);
        }
        int i2 = this.f2147f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo4088b(i);
        if (b != -1) {
            return this.f2148g.mo3155b(b, this.f2143b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: b */
    private void m3327b(C0787av.C0816o oVar, C0787av.C0823t tVar, LinearLayoutManager.C0698a aVar, int i) {
        boolean z = i == 1;
        int b = m3326b(oVar, tVar, aVar.f2169a);
        if (z) {
            while (b > 0 && aVar.f2169a > 0) {
                aVar.f2169a--;
                b = m3326b(oVar, tVar, aVar.f2169a);
            }
            return;
        }
        int e = tVar.mo4136e() - 1;
        int i2 = aVar.f2169a;
        while (i2 < e) {
            int i3 = i2 + 1;
            int b2 = m3326b(oVar, tVar, i3);
            if (b2 <= b) {
                break;
            }
            i2 = i3;
            b = b2;
        }
        aVar.f2169a = i2;
    }

    /* renamed from: c */
    private int m3328c(C0787av.C0816o oVar, C0787av.C0823t tVar, int i) {
        if (!tVar.mo4132a()) {
            return this.f2148g.mo3149a(i);
        }
        int i2 = this.f2146e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo4088b(i);
        if (b != -1) {
            return this.f2148g.mo3149a(b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: l */
    private void m3329l(int i) {
        this.f2144c = m3325a(this.f2144c, this.f2143b, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3123a(int i, int i2) {
        if (this.f2162i != 1 || !mo3182g()) {
            int[] iArr = this.f2144c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2144c;
        int i3 = this.f2143b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: a */
    public int mo3124a(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        m3318L();
        m3319M();
        return super.mo3124a(i, oVar, tVar);
    }

    /* renamed from: a */
    public int mo3125a(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (this.f2162i == 0) {
            return this.f2143b;
        }
        if (tVar.mo4136e() < 1) {
            return 0;
        }
        return m3320a(oVar, tVar, tVar.mo4136e() - 1) + 1;
    }

    /* renamed from: a */
    public C0787av.C0809i mo3126a() {
        return this.f2162i == 0 ? new C0696b(-2, -1) : new C0696b(-1, -2);
    }

    /* renamed from: a */
    public C0787av.C0809i mo3127a(Context context, AttributeSet attributeSet) {
        return new C0696b(context, attributeSet);
    }

    /* renamed from: a */
    public C0787av.C0809i mo3128a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0696b((ViewGroup.MarginLayoutParams) layoutParams) : new C0696b(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3129a(C0787av.C0816o oVar, C0787av.C0823t tVar, int i, int i2, int i3) {
        mo3184h();
        int c = this.f2163j.mo3740c();
        int d = this.f2163j.mo3742d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View h = mo4030h(i);
            int d2 = mo4015d(h);
            if (d2 >= 0 && d2 < i3 && m3326b(oVar, tVar, d2) == 0) {
                if (((C0787av.C0809i) h.getLayoutParams()).mo4057d()) {
                    if (view2 == null) {
                        view2 = h;
                    }
                } else if (this.f2163j.mo3735a(h) < d && this.f2163j.mo3739b(h) >= c) {
                    return h;
                } else {
                    if (view == null) {
                        view = h;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        if (r13 == r10) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3130a(android.view.View r23, int r24, android.support.p020v7.widget.C0787av.C0816o r25, android.support.p020v7.widget.C0787av.C0823t r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.mo4019e((android.view.View) r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r5 = (android.support.p020v7.widget.GridLayoutManager.C0696b) r5
            int r6 = r5.f2150a
            int r7 = r5.f2150a
            int r5 = r5.f2151b
            int r7 = r7 + r5
            android.view.View r5 = super.mo3130a((android.view.View) r23, (int) r24, (android.support.p020v7.widget.C0787av.C0816o) r25, (android.support.p020v7.widget.C0787av.C0823t) r26)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r24
            int r5 = r0.mo3176e((int) r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.f2164k
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r22.mo4045u()
            int r5 = r5 - r9
            r11 = -1
            r12 = -1
            goto L_0x0047
        L_0x0040:
            int r5 = r22.mo4045u()
            r11 = r5
            r5 = 0
            r12 = 1
        L_0x0047:
            int r13 = r0.f2162i
            if (r13 != r9) goto L_0x0053
            boolean r13 = r22.mo3182g()
            if (r13 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.m3320a((android.support.p020v7.widget.C0787av.C0816o) r1, (android.support.p020v7.widget.C0787av.C0823t) r2, (int) r5)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005f:
            if (r5 == r11) goto L_0x0140
            int r9 = r0.m3320a((android.support.p020v7.widget.C0787av.C0816o) r1, (android.support.p020v7.widget.C0787av.C0823t) r2, (int) r5)
            android.view.View r1 = r0.mo4030h((int) r5)
            if (r1 != r3) goto L_0x006d
            goto L_0x0140
        L_0x006d:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0087
            if (r9 == r14) goto L_0x0087
            if (r4 == 0) goto L_0x0079
            goto L_0x0140
        L_0x0079:
            r18 = r3
            r20 = r8
            r23 = r10
            r19 = r11
            r8 = r16
            r11 = r17
            goto L_0x012c
        L_0x0087:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r9 = (android.support.p020v7.widget.GridLayoutManager.C0696b) r9
            int r2 = r9.f2150a
            r18 = r3
            int r3 = r9.f2150a
            r19 = r11
            int r11 = r9.f2151b
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a3
            if (r2 != r6) goto L_0x00a3
            if (r3 != r7) goto L_0x00a3
            return r1
        L_0x00a3:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00ab
            if (r4 == 0) goto L_0x00b3
        L_0x00ab:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00bd
            if (r10 != 0) goto L_0x00bd
        L_0x00b3:
            r20 = r8
            r23 = r10
            r8 = r16
        L_0x00b9:
            r11 = r17
        L_0x00bb:
            r10 = 1
            goto L_0x0100
        L_0x00bd:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00da
            if (r11 <= r15) goto L_0x00d0
            goto L_0x00b3
        L_0x00d0:
            if (r11 != r15) goto L_0x00f7
            if (r2 <= r8) goto L_0x00d6
            r11 = 1
            goto L_0x00d7
        L_0x00d6:
            r11 = 0
        L_0x00d7:
            if (r13 != r11) goto L_0x00f7
            goto L_0x00b3
        L_0x00da:
            if (r4 != 0) goto L_0x00f7
            r20 = r8
            r23 = r10
            r8 = 1
            r10 = 0
            boolean r21 = r0.mo3998a((android.view.View) r1, (boolean) r10, (boolean) r8)
            if (r21 == 0) goto L_0x00fb
            r8 = r16
            if (r11 <= r8) goto L_0x00ed
            goto L_0x00b9
        L_0x00ed:
            if (r11 != r8) goto L_0x00fd
            r11 = r17
            if (r2 <= r11) goto L_0x00f4
            r10 = 1
        L_0x00f4:
            if (r13 != r10) goto L_0x00ff
            goto L_0x00bb
        L_0x00f7:
            r20 = r8
            r23 = r10
        L_0x00fb:
            r8 = r16
        L_0x00fd:
            r11 = r17
        L_0x00ff:
            r10 = 0
        L_0x0100:
            if (r10 == 0) goto L_0x012c
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x011c
            int r4 = r9.f2150a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r23
            r15 = r3
            r20 = r4
            r17 = r11
            r4 = r1
            goto L_0x0130
        L_0x011c:
            int r8 = r9.f2150a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r17 = r8
            r8 = r3
            goto L_0x0130
        L_0x012c:
            r10 = r23
            r17 = r11
        L_0x0130:
            int r5 = r5 + r12
            r16 = r8
            r3 = r18
            r11 = r19
            r8 = r20
            r1 = r25
            r2 = r26
            r9 = 1
            goto L_0x005f
        L_0x0140:
            r23 = r10
            if (r4 == 0) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            r4 = r23
        L_0x0147:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.GridLayoutManager.mo3130a(android.view.View, int, android.support.v7.widget.av$o, android.support.v7.widget.av$t):android.view.View");
    }

    /* renamed from: a */
    public void mo3131a(int i) {
        if (i != this.f2143b) {
            this.f2142a = true;
            if (i >= 1) {
                this.f2143b = i;
                this.f2148g.mo3153a();
                mo4037n();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: a */
    public void mo3132a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2144c == null) {
            super.mo3132a(rect, i, i2);
        }
        int z = mo4050z() + mo3964B();
        int A = mo3963A() + mo3965C();
        if (this.f2162i == 1) {
            i4 = m4238a(i2, rect.height() + A, mo3968F());
            int[] iArr = this.f2144c;
            i3 = m4238a(i, iArr[iArr.length - 1] + z, mo3967E());
        } else {
            i3 = m4238a(i, rect.width() + z, mo3967E());
            int[] iArr2 = this.f2144c;
            i4 = m4238a(i2, iArr2[iArr2.length - 1] + A, mo3968F());
        }
        mo4025f(i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3133a(C0787av.C0816o oVar, C0787av.C0823t tVar, LinearLayoutManager.C0698a aVar, int i) {
        super.mo3133a(oVar, tVar, aVar, i);
        m3318L();
        if (tVar.mo4136e() > 0 && !tVar.mo4132a()) {
            m3327b(oVar, tVar, aVar, i);
        }
        m3319M();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0225 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0223  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3134a(android.support.p020v7.widget.C0787av.C0816o r19, android.support.p020v7.widget.C0787av.C0823t r20, android.support.p020v7.widget.LinearLayoutManager.C0700c r21, android.support.p020v7.widget.LinearLayoutManager.C0699b r22) {
        /*
            r18 = this;
            r6 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            r8 = r22
            android.support.v7.widget.au r0 = r6.f2163j
            int r9 = r0.mo3750i()
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r9 == r10) goto L_0x0017
            r13 = 1
            goto L_0x0018
        L_0x0017:
            r13 = 0
        L_0x0018:
            int r0 = r18.mo4045u()
            if (r0 <= 0) goto L_0x0026
            int[] r0 = r6.f2144c
            int r3 = r6.f2143b
            r0 = r0[r3]
            r14 = r0
            goto L_0x0027
        L_0x0026:
            r14 = 0
        L_0x0027:
            if (r13 == 0) goto L_0x002c
            r18.m3318L()
        L_0x002c:
            int r0 = r7.f2182e
            if (r0 != r11) goto L_0x0032
            r15 = 1
            goto L_0x0033
        L_0x0032:
            r15 = 0
        L_0x0033:
            int r0 = r6.f2143b
            if (r15 != 0) goto L_0x0044
            int r0 = r7.f2181d
            int r0 = r6.m3326b((android.support.p020v7.widget.C0787av.C0816o) r1, (android.support.p020v7.widget.C0787av.C0823t) r2, (int) r0)
            int r3 = r7.f2181d
            int r3 = r6.m3328c(r1, r2, r3)
            int r0 = r0 + r3
        L_0x0044:
            r4 = 0
            r5 = 0
        L_0x0046:
            int r3 = r6.f2143b
            if (r5 >= r3) goto L_0x009f
            boolean r3 = r7.mo3200a((android.support.p020v7.widget.C0787av.C0823t) r2)
            if (r3 == 0) goto L_0x009f
            if (r0 <= 0) goto L_0x009f
            int r3 = r7.f2181d
            int r10 = r6.m3328c(r1, r2, r3)
            int r12 = r6.f2143b
            if (r10 > r12) goto L_0x0071
            int r0 = r0 - r10
            if (r0 >= 0) goto L_0x0060
            goto L_0x009f
        L_0x0060:
            android.view.View r3 = r7.mo3197a((android.support.p020v7.widget.C0787av.C0816o) r1)
            if (r3 != 0) goto L_0x0067
            goto L_0x009f
        L_0x0067:
            int r4 = r4 + r10
            android.view.View[] r10 = r6.f2145d
            r10[r5] = r3
            int r5 = r5 + 1
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0046
        L_0x0071:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f2143b
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            if (r5 != 0) goto L_0x00a4
            r8.f2175b = r11
            return
        L_0x00a4:
            r10 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r5
            r12 = r5
            r5 = r15
            r0.m3322a((android.support.p020v7.widget.C0787av.C0816o) r1, (android.support.p020v7.widget.C0787av.C0823t) r2, (int) r3, (int) r4, (boolean) r5)
            r0 = 0
            r1 = 0
        L_0x00b3:
            if (r0 >= r12) goto L_0x0101
            android.view.View[] r2 = r6.f2145d
            r2 = r2[r0]
            java.util.List<android.support.v7.widget.av$w> r3 = r7.f2188k
            if (r3 != 0) goto L_0x00c9
            if (r15 == 0) goto L_0x00c4
            r6.mo4003b((android.view.View) r2)
            r3 = 0
            goto L_0x00d3
        L_0x00c4:
            r3 = 0
            r6.mo4004b((android.view.View) r2, (int) r3)
            goto L_0x00d3
        L_0x00c9:
            r3 = 0
            if (r15 == 0) goto L_0x00d0
            r6.mo3979a((android.view.View) r2)
            goto L_0x00d3
        L_0x00d0:
            r6.mo3980a((android.view.View) r2, (int) r3)
        L_0x00d3:
            android.graphics.Rect r4 = r6.f2149h
            r6.mo4005b((android.view.View) r2, (android.graphics.Rect) r4)
            r6.m3324a((android.view.View) r2, (int) r9, (boolean) r3)
            android.support.v7.widget.au r3 = r6.f2163j
            int r3 = r3.mo3745e(r2)
            if (r3 <= r1) goto L_0x00e4
            r1 = r3
        L_0x00e4:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r3 = (android.support.p020v7.widget.GridLayoutManager.C0696b) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            android.support.v7.widget.au r5 = r6.f2163j
            int r2 = r5.mo3747f(r2)
            float r2 = (float) r2
            float r2 = r2 * r4
            int r3 = r3.f2151b
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fe
            r10 = r2
        L_0x00fe:
            int r0 = r0 + 1
            goto L_0x00b3
        L_0x0101:
            if (r13 == 0) goto L_0x011f
            r6.m3321a((float) r10, (int) r14)
            r0 = 0
            r1 = 0
        L_0x0108:
            if (r0 >= r12) goto L_0x011f
            android.view.View[] r2 = r6.f2145d
            r2 = r2[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r6.m3324a((android.view.View) r2, (int) r3, (boolean) r11)
            android.support.v7.widget.au r3 = r6.f2163j
            int r2 = r3.mo3745e(r2)
            if (r2 <= r1) goto L_0x011c
            r1 = r2
        L_0x011c:
            int r0 = r0 + 1
            goto L_0x0108
        L_0x011f:
            r0 = 0
        L_0x0120:
            if (r0 >= r12) goto L_0x0182
            android.view.View[] r2 = r6.f2145d
            r2 = r2[r0]
            android.support.v7.widget.au r3 = r6.f2163j
            int r3 = r3.mo3745e(r2)
            if (r3 == r1) goto L_0x017c
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r3 = (android.support.p020v7.widget.GridLayoutManager.C0696b) r3
            android.graphics.Rect r4 = r3.f2726d
            int r5 = r4.top
            int r9 = r4.bottom
            int r5 = r5 + r9
            int r9 = r3.topMargin
            int r5 = r5 + r9
            int r9 = r3.bottomMargin
            int r5 = r5 + r9
            int r9 = r4.left
            int r4 = r4.right
            int r9 = r9 + r4
            int r4 = r3.leftMargin
            int r9 = r9 + r4
            int r4 = r3.rightMargin
            int r9 = r9 + r4
            int r4 = r3.f2150a
            int r10 = r3.f2151b
            int r4 = r6.mo3123a((int) r4, (int) r10)
            int r10 = r6.f2162i
            if (r10 != r11) goto L_0x0168
            int r3 = r3.width
            r10 = 0
            r13 = 1073741824(0x40000000, float:2.0)
            int r3 = m4239a((int) r4, (int) r13, (int) r9, (int) r3, (boolean) r10)
            int r4 = r1 - r5
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r13)
            goto L_0x0178
        L_0x0168:
            r10 = 0
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = r1 - r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r3 = r3.height
            int r4 = m4239a((int) r4, (int) r13, (int) r5, (int) r3, (boolean) r10)
            r3 = r9
        L_0x0178:
            r6.m3323a((android.view.View) r2, (int) r3, (int) r4, (boolean) r11)
            goto L_0x017f
        L_0x017c:
            r10 = 0
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x017f:
            int r0 = r0 + 1
            goto L_0x0120
        L_0x0182:
            r10 = 0
            r8.f2174a = r1
            int r0 = r6.f2162i
            r2 = -1
            if (r0 != r11) goto L_0x019d
            int r0 = r7.f2183f
            if (r0 != r2) goto L_0x0195
            int r0 = r7.f2179b
            int r1 = r0 - r1
            r3 = r0
            r2 = r1
            goto L_0x019a
        L_0x0195:
            int r0 = r7.f2179b
            int r1 = r1 + r0
            r2 = r0
            r3 = r1
        L_0x019a:
            r0 = 0
            r1 = 0
            goto L_0x01b2
        L_0x019d:
            int r0 = r7.f2183f
            if (r0 != r2) goto L_0x01ad
            int r0 = r7.f2179b
            int r1 = r0 - r1
            r2 = 0
            r3 = 0
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x01b2
        L_0x01ad:
            int r0 = r7.f2179b
            int r1 = r1 + r0
            r2 = 0
            r3 = 0
        L_0x01b2:
            if (r10 >= r12) goto L_0x0237
            android.view.View[] r4 = r6.f2145d
            r7 = r4[r10]
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            r9 = r4
            android.support.v7.widget.GridLayoutManager$b r9 = (android.support.p020v7.widget.GridLayoutManager.C0696b) r9
            int r4 = r6.f2162i
            if (r4 != r11) goto L_0x01f5
            boolean r0 = r18.mo3182g()
            if (r0 == 0) goto L_0x01e2
            int r0 = r18.mo4050z()
            int[] r1 = r6.f2144c
            int r4 = r6.f2143b
            int r5 = r9.f2150a
            int r4 = r4 - r5
            r1 = r1[r4]
            int r0 = r0 + r1
            android.support.v7.widget.au r1 = r6.f2163j
            int r1 = r1.mo3747f(r7)
            int r1 = r0 - r1
            r15 = r0
            r13 = r1
            goto L_0x0209
        L_0x01e2:
            int r0 = r18.mo4050z()
            int[] r1 = r6.f2144c
            int r4 = r9.f2150a
            r1 = r1[r4]
            int r0 = r0 + r1
            android.support.v7.widget.au r1 = r6.f2163j
            int r1 = r1.mo3747f(r7)
            int r1 = r1 + r0
            goto L_0x0207
        L_0x01f5:
            int r2 = r18.mo3963A()
            int[] r3 = r6.f2144c
            int r4 = r9.f2150a
            r3 = r3[r4]
            int r2 = r2 + r3
            android.support.v7.widget.au r3 = r6.f2163j
            int r3 = r3.mo3747f(r7)
            int r3 = r3 + r2
        L_0x0207:
            r13 = r0
            r15 = r1
        L_0x0209:
            r14 = r2
            r16 = r3
            r0 = r18
            r1 = r7
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.mo3982a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
            boolean r0 = r9.mo4057d()
            if (r0 != 0) goto L_0x0223
            boolean r0 = r9.mo4058e()
            if (r0 == 0) goto L_0x0225
        L_0x0223:
            r8.f2176c = r11
        L_0x0225:
            boolean r0 = r8.f2177d
            boolean r1 = r7.hasFocusable()
            r0 = r0 | r1
            r8.f2177d = r0
            int r10 = r10 + 1
            r0 = r13
            r2 = r14
            r1 = r15
            r3 = r16
            goto L_0x01b2
        L_0x0237:
            android.view.View[] r0 = r6.f2145d
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.GridLayoutManager.mo3134a(android.support.v7.widget.av$o, android.support.v7.widget.av$t, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: a */
    public void mo3135a(C0787av.C0816o oVar, C0787av.C0823t tVar, View view, C0328b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0696b)) {
            super.mo3985a(view, bVar);
            return;
        }
        C0696b bVar2 = (C0696b) layoutParams;
        int a = m3320a(oVar, tVar, bVar2.mo4059f());
        if (this.f2162i == 0) {
            int a2 = bVar2.mo3151a();
            i3 = bVar2.mo3152b();
            i = 1;
            z2 = this.f2143b > 1 && bVar2.mo3152b() == this.f2143b;
            z = false;
            i4 = a2;
            i2 = a;
        } else {
            i3 = 1;
            i2 = bVar2.mo3151a();
            i = bVar2.mo3152b();
            z2 = this.f2143b > 1 && bVar2.mo3152b() == this.f2143b;
            z = false;
            i4 = a;
        }
        bVar.mo1424b((Object) C0328b.C0340l.m1514a(i4, i3, i2, i, z2, z));
    }

    /* renamed from: a */
    public void mo3136a(C0787av.C0823t tVar) {
        super.mo3136a(tVar);
        this.f2142a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3137a(C0787av.C0823t tVar, LinearLayoutManager.C0700c cVar, C0787av.C0804h.C0807a aVar) {
        int i = this.f2143b;
        for (int i2 = 0; i2 < this.f2143b && cVar.mo3200a(tVar) && i > 0; i2++) {
            int i3 = cVar.f2181d;
            aVar.mo3629b(i3, Math.max(0, cVar.f2184g));
            i -= this.f2148g.mo3149a(i3);
            cVar.f2181d += cVar.f2182e;
        }
    }

    /* renamed from: a */
    public void mo3138a(C0787av avVar) {
        this.f2148g.mo3153a();
    }

    /* renamed from: a */
    public void mo3139a(C0787av avVar, int i, int i2) {
        this.f2148g.mo3153a();
    }

    /* renamed from: a */
    public void mo3140a(C0787av avVar, int i, int i2, int i3) {
        this.f2148g.mo3153a();
    }

    /* renamed from: a */
    public void mo3141a(C0787av avVar, int i, int i2, Object obj) {
        this.f2148g.mo3153a();
    }

    /* renamed from: a */
    public void mo3142a(boolean z) {
        if (!z) {
            super.mo3142a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: a */
    public boolean mo3143a(C0787av.C0809i iVar) {
        return iVar instanceof C0696b;
    }

    /* renamed from: b */
    public int mo3144b(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        m3318L();
        m3319M();
        return super.mo3144b(i, oVar, tVar);
    }

    /* renamed from: b */
    public int mo3145b(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (this.f2162i == 1) {
            return this.f2143b;
        }
        if (tVar.mo4136e() < 1) {
            return 0;
        }
        return m3320a(oVar, tVar, tVar.mo4136e() - 1) + 1;
    }

    /* renamed from: b */
    public void mo3146b(C0787av avVar, int i, int i2) {
        this.f2148g.mo3153a();
    }

    /* renamed from: b */
    public boolean mo3147b() {
        return this.f2167n == null && !this.f2142a;
    }

    /* renamed from: c */
    public void mo3148c(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (tVar.mo4132a()) {
            m3317K();
        }
        super.mo3148c(oVar, tVar);
        m3316J();
    }
}
