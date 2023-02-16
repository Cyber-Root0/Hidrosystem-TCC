package android.support.p020v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p020v7.widget.C0787av;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C0787av.C0804h {

    /* renamed from: a */
    private C0700c f2154a;

    /* renamed from: b */
    private boolean f2155b;

    /* renamed from: c */
    private boolean f2156c;

    /* renamed from: d */
    private boolean f2157d;

    /* renamed from: e */
    private boolean f2158e;

    /* renamed from: f */
    private boolean f2159f;

    /* renamed from: g */
    private final C0699b f2160g;

    /* renamed from: h */
    private int f2161h;

    /* renamed from: i */
    int f2162i;

    /* renamed from: j */
    C0784au f2163j;

    /* renamed from: k */
    boolean f2164k;

    /* renamed from: l */
    int f2165l;

    /* renamed from: m */
    int f2166m;

    /* renamed from: n */
    C0701d f2167n;

    /* renamed from: o */
    final C0698a f2168o;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    class C0698a {

        /* renamed from: a */
        int f2169a;

        /* renamed from: b */
        int f2170b;

        /* renamed from: c */
        boolean f2171c;

        /* renamed from: d */
        boolean f2172d;

        C0698a() {
            mo3190a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3190a() {
            this.f2169a = -1;
            this.f2170b = Integer.MIN_VALUE;
            this.f2171c = false;
            this.f2172d = false;
        }

        /* renamed from: a */
        public void mo3191a(View view) {
            int b = LinearLayoutManager.this.f2163j.mo3738b();
            if (b >= 0) {
                mo3194b(view);
                return;
            }
            this.f2169a = LinearLayoutManager.this.mo4015d(view);
            if (this.f2171c) {
                int d = (LinearLayoutManager.this.f2163j.mo3742d() - b) - LinearLayoutManager.this.f2163j.mo3739b(view);
                this.f2170b = LinearLayoutManager.this.f2163j.mo3742d() - d;
                if (d > 0) {
                    int e = this.f2170b - LinearLayoutManager.this.f2163j.mo3745e(view);
                    int c = LinearLayoutManager.this.f2163j.mo3740c();
                    int min = e - (c + Math.min(LinearLayoutManager.this.f2163j.mo3735a(view) - c, 0));
                    if (min < 0) {
                        this.f2170b += Math.min(d, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int a = LinearLayoutManager.this.f2163j.mo3735a(view);
            int c2 = a - LinearLayoutManager.this.f2163j.mo3740c();
            this.f2170b = a;
            if (c2 > 0) {
                int d2 = (LinearLayoutManager.this.f2163j.mo3742d() - Math.min(0, (LinearLayoutManager.this.f2163j.mo3742d() - b) - LinearLayoutManager.this.f2163j.mo3739b(view))) - (a + LinearLayoutManager.this.f2163j.mo3745e(view));
                if (d2 < 0) {
                    this.f2170b -= Math.min(c2, -d2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3192a(View view, C0787av.C0823t tVar) {
            C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
            return !iVar.mo4057d() && iVar.mo4059f() >= 0 && iVar.mo4059f() < tVar.mo4136e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3193b() {
            this.f2170b = this.f2171c ? LinearLayoutManager.this.f2163j.mo3742d() : LinearLayoutManager.this.f2163j.mo3740c();
        }

        /* renamed from: b */
        public void mo3194b(View view) {
            this.f2170b = this.f2171c ? LinearLayoutManager.this.f2163j.mo3739b(view) + LinearLayoutManager.this.f2163j.mo3738b() : LinearLayoutManager.this.f2163j.mo3735a(view);
            this.f2169a = LinearLayoutManager.this.mo4015d(view);
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2169a + ", mCoordinate=" + this.f2170b + ", mLayoutFromEnd=" + this.f2171c + ", mValid=" + this.f2172d + '}';
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0699b {

        /* renamed from: a */
        public int f2174a;

        /* renamed from: b */
        public boolean f2175b;

        /* renamed from: c */
        public boolean f2176c;

        /* renamed from: d */
        public boolean f2177d;

        protected C0699b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3196a() {
            this.f2174a = 0;
            this.f2175b = false;
            this.f2176c = false;
            this.f2177d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0700c {

        /* renamed from: a */
        boolean f2178a = true;

        /* renamed from: b */
        int f2179b;

        /* renamed from: c */
        int f2180c;

        /* renamed from: d */
        int f2181d;

        /* renamed from: e */
        int f2182e;

        /* renamed from: f */
        int f2183f;

        /* renamed from: g */
        int f2184g;

        /* renamed from: h */
        int f2185h = 0;

        /* renamed from: i */
        boolean f2186i = false;

        /* renamed from: j */
        int f2187j;

        /* renamed from: k */
        List<C0787av.C0826w> f2188k = null;

        /* renamed from: l */
        boolean f2189l;

        C0700c() {
        }

        /* renamed from: b */
        private View m3448b() {
            int size = this.f2188k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2188k.get(i).f2785a;
                C0787av.C0809i iVar = (C0787av.C0809i) view.getLayoutParams();
                if (!iVar.mo4057d() && this.f2181d == iVar.mo4059f()) {
                    mo3199a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo3197a(C0787av.C0816o oVar) {
            if (this.f2188k != null) {
                return m3448b();
            }
            View c = oVar.mo4094c(this.f2181d);
            this.f2181d += this.f2182e;
            return c;
        }

        /* renamed from: a */
        public void mo3198a() {
            mo3199a((View) null);
        }

        /* renamed from: a */
        public void mo3199a(View view) {
            View b = mo3201b(view);
            this.f2181d = b == null ? -1 : ((C0787av.C0809i) b.getLayoutParams()).mo4059f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3200a(C0787av.C0823t tVar) {
            int i = this.f2181d;
            return i >= 0 && i < tVar.mo4136e();
        }

        /* renamed from: b */
        public View mo3201b(View view) {
            int f;
            int size = this.f2188k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2188k.get(i2).f2785a;
                C0787av.C0809i iVar = (C0787av.C0809i) view3.getLayoutParams();
                if (view3 != view && !iVar.mo4057d() && (f = (iVar.mo4059f() - this.f2181d) * this.f2182e) >= 0 && f < i) {
                    if (f == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = f;
                }
            }
            return view2;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$d */
    public static class C0701d implements Parcelable {
        public static final Parcelable.Creator<C0701d> CREATOR = new Parcelable.Creator<C0701d>() {
            /* renamed from: a */
            public C0701d createFromParcel(Parcel parcel) {
                return new C0701d(parcel);
            }

            /* renamed from: a */
            public C0701d[] newArray(int i) {
                return new C0701d[i];
            }
        };

        /* renamed from: a */
        int f2190a;

        /* renamed from: b */
        int f2191b;

        /* renamed from: c */
        boolean f2192c;

        public C0701d() {
        }

        C0701d(Parcel parcel) {
            this.f2190a = parcel.readInt();
            this.f2191b = parcel.readInt();
            this.f2192c = parcel.readInt() != 1 ? false : true;
        }

        public C0701d(C0701d dVar) {
            this.f2190a = dVar.f2190a;
            this.f2191b = dVar.f2191b;
            this.f2192c = dVar.f2192c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3202a() {
            return this.f2190a >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3203b() {
            this.f2190a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2190a);
            parcel.writeInt(this.f2191b);
            parcel.writeInt(this.f2192c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2156c = false;
        this.f2164k = false;
        this.f2157d = false;
        this.f2158e = true;
        this.f2165l = -1;
        this.f2166m = Integer.MIN_VALUE;
        this.f2167n = null;
        this.f2168o = new C0698a();
        this.f2160g = new C0699b();
        this.f2161h = 2;
        mo3167b(i);
        mo3168b(z);
        mo4013c(true);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2156c = false;
        this.f2164k = false;
        this.f2157d = false;
        this.f2158e = true;
        this.f2165l = -1;
        this.f2166m = Integer.MIN_VALUE;
        this.f2167n = null;
        this.f2168o = new C0698a();
        this.f2160g = new C0699b();
        this.f2161h = 2;
        C0787av.C0804h.C0808b a = m4240a(context, attributeSet, i, i2);
        mo3167b(a.f2721a);
        mo3168b(a.f2723c);
        mo3142a(a.f2724d);
        mo4013c(true);
    }

    /* renamed from: J */
    private void m3366J() {
        this.f2164k = (this.f2162i == 1 || !mo3182g()) ? this.f2156c : !this.f2156c;
    }

    /* renamed from: K */
    private View m3367K() {
        return mo4030h(this.f2164k ? mo4045u() - 1 : 0);
    }

    /* renamed from: L */
    private View m3368L() {
        return mo4030h(this.f2164k ? 0 : mo4045u() - 1);
    }

    /* renamed from: a */
    private int m3369a(int i, C0787av.C0816o oVar, C0787av.C0823t tVar, boolean z) {
        int d;
        int d2 = this.f2163j.mo3742d() - i;
        if (d2 <= 0) {
            return 0;
        }
        int i2 = -mo3169c(-d2, oVar, tVar);
        int i3 = i + i2;
        if (!z || (d = this.f2163j.mo3742d() - i3) <= 0) {
            return i2;
        }
        this.f2163j.mo3737a(d);
        return d + i2;
    }

    /* renamed from: a */
    private View m3370a(boolean z, boolean z2) {
        int i;
        int u;
        if (this.f2164k) {
            i = mo4045u() - 1;
            u = -1;
        } else {
            i = 0;
            u = mo4045u();
        }
        return mo3158a(i, u, z, z2);
    }

    /* renamed from: a */
    private void mo3123a(int i, int i2) {
        this.f2154a.f2180c = this.f2163j.mo3742d() - i2;
        this.f2154a.f2182e = this.f2164k ? -1 : 1;
        C0700c cVar = this.f2154a;
        cVar.f2181d = i;
        cVar.f2183f = 1;
        cVar.f2179b = i2;
        cVar.f2184g = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private void m3372a(int i, int i2, boolean z, C0787av.C0823t tVar) {
        int i3;
        this.f2154a.f2189l = mo3186j();
        this.f2154a.f2185h = mo3165b(tVar);
        C0700c cVar = this.f2154a;
        cVar.f2183f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.f2185h += this.f2163j.mo3748g();
            View L = m3368L();
            C0700c cVar2 = this.f2154a;
            if (!this.f2164k) {
                i4 = 1;
            }
            cVar2.f2182e = i4;
            this.f2154a.f2181d = mo4015d(L) + this.f2154a.f2182e;
            this.f2154a.f2179b = this.f2163j.mo3739b(L);
            i3 = this.f2163j.mo3739b(L) - this.f2163j.mo3742d();
        } else {
            View K = m3367K();
            this.f2154a.f2185h += this.f2163j.mo3740c();
            C0700c cVar3 = this.f2154a;
            if (this.f2164k) {
                i4 = 1;
            }
            cVar3.f2182e = i4;
            this.f2154a.f2181d = mo4015d(K) + this.f2154a.f2182e;
            this.f2154a.f2179b = this.f2163j.mo3735a(K);
            i3 = (-this.f2163j.mo3735a(K)) + this.f2163j.mo3740c();
        }
        C0700c cVar4 = this.f2154a;
        cVar4.f2180c = i2;
        if (z) {
            cVar4.f2180c -= i3;
        }
        this.f2154a.f2184g = i3;
    }

    /* renamed from: a */
    private void m3373a(C0698a aVar) {
        mo3123a(aVar.f2169a, aVar.f2170b);
    }

    /* renamed from: a */
    private void m3374a(C0787av.C0816o oVar, int i) {
        if (i >= 0) {
            int u = mo4045u();
            if (this.f2164k) {
                int i2 = u - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View h = mo4030h(i3);
                    if (this.f2163j.mo3739b(h) > i || this.f2163j.mo3741c(h) > i) {
                        m3375a(oVar, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < u; i4++) {
                View h2 = mo4030h(i4);
                if (this.f2163j.mo3739b(h2) > i || this.f2163j.mo3741c(h2) > i) {
                    m3375a(oVar, 0, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3375a(C0787av.C0816o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo3972a(i3, oVar);
                }
                return;
            }
            while (i > i2) {
                mo3972a(i, oVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m3376a(C0787av.C0816o oVar, C0700c cVar) {
        if (cVar.f2178a && !cVar.f2189l) {
            if (cVar.f2183f == -1) {
                m3382b(oVar, cVar.f2184g);
            } else {
                m3374a(oVar, cVar.f2184g);
            }
        }
    }

    /* renamed from: a */
    private void m3377a(C0787av.C0816o oVar, C0787av.C0823t tVar, C0698a aVar) {
        if (!m3378a(tVar, aVar) && !m3384b(oVar, tVar, aVar)) {
            aVar.mo3193b();
            aVar.f2169a = this.f2157d ? tVar.mo4136e() - 1 : 0;
        }
    }

    /* renamed from: a */
    private boolean m3378a(C0787av.C0823t tVar, C0698a aVar) {
        int i;
        boolean z = false;
        if (!tVar.mo4132a() && (i = this.f2165l) != -1) {
            if (i < 0 || i >= tVar.mo4136e()) {
                this.f2165l = -1;
                this.f2166m = Integer.MIN_VALUE;
            } else {
                aVar.f2169a = this.f2165l;
                C0701d dVar = this.f2167n;
                if (dVar != null && dVar.mo3202a()) {
                    aVar.f2171c = this.f2167n.f2192c;
                    aVar.f2170b = aVar.f2171c ? this.f2163j.mo3742d() - this.f2167n.f2191b : this.f2163j.mo3740c() + this.f2167n.f2191b;
                    return true;
                } else if (this.f2166m == Integer.MIN_VALUE) {
                    View c = mo3172c(this.f2165l);
                    if (c == null) {
                        if (mo4045u() > 0) {
                            if ((this.f2165l < mo4015d(mo4030h(0))) == this.f2164k) {
                                z = true;
                            }
                            aVar.f2171c = z;
                        }
                        aVar.mo3193b();
                    } else if (this.f2163j.mo3745e(c) > this.f2163j.mo3746f()) {
                        aVar.mo3193b();
                        return true;
                    } else if (this.f2163j.mo3735a(c) - this.f2163j.mo3740c() < 0) {
                        aVar.f2170b = this.f2163j.mo3740c();
                        aVar.f2171c = false;
                        return true;
                    } else if (this.f2163j.mo3742d() - this.f2163j.mo3739b(c) < 0) {
                        aVar.f2170b = this.f2163j.mo3742d();
                        aVar.f2171c = true;
                        return true;
                    } else {
                        aVar.f2170b = aVar.f2171c ? this.f2163j.mo3739b(c) + this.f2163j.mo3738b() : this.f2163j.mo3735a(c);
                    }
                    return true;
                } else {
                    boolean z2 = this.f2164k;
                    aVar.f2171c = z2;
                    aVar.f2170b = z2 ? this.f2163j.mo3742d() - this.f2166m : this.f2163j.mo3740c() + this.f2166m;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m3379b(int i, C0787av.C0816o oVar, C0787av.C0823t tVar, boolean z) {
        int c;
        int c2 = i - this.f2163j.mo3740c();
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -mo3169c(c2, oVar, tVar);
        int i3 = i + i2;
        if (!z || (c = i3 - this.f2163j.mo3740c()) <= 0) {
            return i2;
        }
        this.f2163j.mo3737a(-c);
        return i2 - c;
    }

    /* renamed from: b */
    private View m3380b(boolean z, boolean z2) {
        int u;
        int i;
        if (this.f2164k) {
            u = 0;
            i = mo4045u();
        } else {
            u = mo4045u() - 1;
            i = -1;
        }
        return mo3158a(u, i, z, z2);
    }

    /* renamed from: b */
    private void m3381b(C0698a aVar) {
        m3387g(aVar.f2169a, aVar.f2170b);
    }

    /* renamed from: b */
    private void m3382b(C0787av.C0816o oVar, int i) {
        int u = mo4045u();
        if (i >= 0) {
            int e = this.f2163j.mo3744e() - i;
            if (this.f2164k) {
                for (int i2 = 0; i2 < u; i2++) {
                    View h = mo4030h(i2);
                    if (this.f2163j.mo3735a(h) < e || this.f2163j.mo3743d(h) < e) {
                        m3375a(oVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = u - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                View h2 = mo4030h(i4);
                if (this.f2163j.mo3735a(h2) < e || this.f2163j.mo3743d(h2) < e) {
                    m3375a(oVar, i3, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m3383b(C0787av.C0816o oVar, C0787av.C0823t tVar, int i, int i2) {
        C0787av.C0816o oVar2 = oVar;
        C0787av.C0823t tVar2 = tVar;
        if (tVar.mo4133b() && mo4045u() != 0 && !tVar.mo4132a() && mo3147b()) {
            List<C0787av.C0826w> c = oVar.mo4095c();
            int size = c.size();
            int d = mo4015d(mo4030h(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0787av.C0826w wVar = c.get(i5);
                if (!wVar.mo4172q()) {
                    char c2 = 1;
                    if ((wVar.mo4159d() < d) != this.f2164k) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.f2163j.mo3745e(wVar.f2785a);
                    } else {
                        i4 += this.f2163j.mo3745e(wVar.f2785a);
                    }
                }
            }
            this.f2154a.f2188k = c;
            if (i3 > 0) {
                m3387g(mo4015d(m3367K()), i);
                C0700c cVar = this.f2154a;
                cVar.f2185h = i3;
                cVar.f2180c = 0;
                cVar.mo3198a();
                mo3157a(oVar2, this.f2154a, tVar2, false);
            }
            if (i4 > 0) {
                mo3123a(mo4015d(m3368L()), i2);
                C0700c cVar2 = this.f2154a;
                cVar2.f2185h = i4;
                cVar2.f2180c = 0;
                cVar2.mo3198a();
                mo3157a(oVar2, this.f2154a, tVar2, false);
            }
            this.f2154a.f2188k = null;
        }
    }

    /* renamed from: b */
    private boolean m3384b(C0787av.C0816o oVar, C0787av.C0823t tVar, C0698a aVar) {
        boolean z = false;
        if (mo4045u() == 0) {
            return false;
        }
        View D = mo3966D();
        if (D != null && aVar.mo3192a(D, tVar)) {
            aVar.mo3191a(D);
            return true;
        } else if (this.f2155b != this.f2157d) {
            return false;
        } else {
            View f = aVar.f2171c ? m3385f(oVar, tVar) : m3386g(oVar, tVar);
            if (f == null) {
                return false;
            }
            aVar.mo3194b(f);
            if (!tVar.mo4132a() && mo3147b()) {
                if (this.f2163j.mo3735a(f) >= this.f2163j.mo3742d() || this.f2163j.mo3739b(f) < this.f2163j.mo3740c()) {
                    z = true;
                }
                if (z) {
                    aVar.f2170b = aVar.f2171c ? this.f2163j.mo3742d() : this.f2163j.mo3740c();
                }
            }
            return true;
        }
    }

    /* renamed from: f */
    private View m3385f(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return this.f2164k ? m3388h(oVar, tVar) : m3390i(oVar, tVar);
    }

    /* renamed from: g */
    private View m3386g(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return this.f2164k ? m3390i(oVar, tVar) : m3388h(oVar, tVar);
    }

    /* renamed from: g */
    private void m3387g(int i, int i2) {
        this.f2154a.f2180c = i2 - this.f2163j.mo3740c();
        C0700c cVar = this.f2154a;
        cVar.f2181d = i;
        cVar.f2182e = this.f2164k ? 1 : -1;
        C0700c cVar2 = this.f2154a;
        cVar2.f2183f = -1;
        cVar2.f2179b = i2;
        cVar2.f2184g = Integer.MIN_VALUE;
    }

    /* renamed from: h */
    private View m3388h(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return mo3129a(oVar, tVar, 0, mo4045u(), tVar.mo4136e());
    }

    /* renamed from: i */
    private int m3389i(C0787av.C0823t tVar) {
        if (mo4045u() == 0) {
            return 0;
        }
        mo3184h();
        C0784au auVar = this.f2163j;
        View a = m3370a(!this.f2158e, true);
        return C0831az.m4554a(tVar, auVar, a, m3380b(!this.f2158e, true), this, this.f2158e, this.f2164k);
    }

    /* renamed from: i */
    private View m3390i(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return mo3129a(oVar, tVar, mo4045u() - 1, -1, tVar.mo4136e());
    }

    /* renamed from: j */
    private int m3391j(C0787av.C0823t tVar) {
        if (mo4045u() == 0) {
            return 0;
        }
        mo3184h();
        C0784au auVar = this.f2163j;
        View a = m3370a(!this.f2158e, true);
        return C0831az.m4553a(tVar, auVar, a, m3380b(!this.f2158e, true), this, this.f2158e);
    }

    /* renamed from: j */
    private View m3392j(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return this.f2164k ? m3395l(oVar, tVar) : m3396m(oVar, tVar);
    }

    /* renamed from: k */
    private int m3393k(C0787av.C0823t tVar) {
        if (mo4045u() == 0) {
            return 0;
        }
        mo3184h();
        C0784au auVar = this.f2163j;
        View a = m3370a(!this.f2158e, true);
        return C0831az.m4555b(tVar, auVar, a, m3380b(!this.f2158e, true), this, this.f2158e);
    }

    /* renamed from: k */
    private View m3394k(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return this.f2164k ? m3396m(oVar, tVar) : m3395l(oVar, tVar);
    }

    /* renamed from: l */
    private View m3395l(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return mo3166b(0, mo4045u());
    }

    /* renamed from: m */
    private View m3396m(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return mo3166b(mo4045u() - 1, -1);
    }

    /* renamed from: a */
    public int mo3124a(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (this.f2162i == 1) {
            return 0;
        }
        return mo3169c(i, oVar, tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3157a(C0787av.C0816o oVar, C0700c cVar, C0787av.C0823t tVar, boolean z) {
        int i = cVar.f2180c;
        if (cVar.f2184g != Integer.MIN_VALUE) {
            if (cVar.f2180c < 0) {
                cVar.f2184g += cVar.f2180c;
            }
            m3376a(oVar, cVar);
        }
        int i2 = cVar.f2180c + cVar.f2185h;
        C0699b bVar = this.f2160g;
        while (true) {
            if ((!cVar.f2189l && i2 <= 0) || !cVar.mo3200a(tVar)) {
                break;
            }
            bVar.mo3196a();
            mo3134a(oVar, tVar, cVar, bVar);
            if (!bVar.f2175b) {
                cVar.f2179b += bVar.f2174a * cVar.f2183f;
                if (!bVar.f2176c || this.f2154a.f2188k != null || !tVar.mo4132a()) {
                    cVar.f2180c -= bVar.f2174a;
                    i2 -= bVar.f2174a;
                }
                if (cVar.f2184g != Integer.MIN_VALUE) {
                    cVar.f2184g += bVar.f2174a;
                    if (cVar.f2180c < 0) {
                        cVar.f2184g += cVar.f2180c;
                    }
                    m3376a(oVar, cVar);
                }
                if (z && bVar.f2177d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2180c;
    }

    /* renamed from: a */
    public C0787av.C0809i mo3126a() {
        return new C0787av.C0809i(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3158a(int i, int i2, boolean z, boolean z2) {
        mo3184h();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f2162i == 0 ? this.f2711r : this.f2712s).mo4325a(i, i2, i4, i3);
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
            if (d2 >= 0 && d2 < i3) {
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

    /* renamed from: a */
    public View mo3130a(View view, int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        int e;
        m3366J();
        if (mo4045u() == 0 || (e = mo3176e(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo3184h();
        mo3184h();
        m3372a(e, (int) (((float) this.f2163j.mo3746f()) * 0.33333334f), false, tVar);
        C0700c cVar = this.f2154a;
        cVar.f2184g = Integer.MIN_VALUE;
        cVar.f2178a = false;
        mo3157a(oVar, cVar, tVar, true);
        View k = e == -1 ? m3394k(oVar, tVar) : m3392j(oVar, tVar);
        View K = e == -1 ? m3367K() : m3368L();
        if (!K.hasFocusable()) {
            return k;
        }
        if (k == null) {
            return null;
        }
        return K;
    }

    /* renamed from: a */
    public void mo3159a(int i, int i2, C0787av.C0823t tVar, C0787av.C0804h.C0807a aVar) {
        if (this.f2162i != 0) {
            i = i2;
        }
        if (mo4045u() != 0 && i != 0) {
            mo3184h();
            m3372a(i > 0 ? 1 : -1, Math.abs(i), true, tVar);
            mo3137a(tVar, this.f2154a, aVar);
        }
    }

    /* renamed from: a */
    public void mo3160a(int i, C0787av.C0804h.C0807a aVar) {
        int i2;
        boolean z;
        C0701d dVar = this.f2167n;
        int i3 = -1;
        if (dVar == null || !dVar.mo3202a()) {
            m3366J();
            z = this.f2164k;
            i2 = this.f2165l;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = this.f2167n.f2192c;
            i2 = this.f2167n.f2190a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f2161h && i2 >= 0 && i2 < i; i4++) {
            aVar.mo3629b(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo3161a(Parcelable parcelable) {
        if (parcelable instanceof C0701d) {
            this.f2167n = (C0701d) parcelable;
            mo4037n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3133a(C0787av.C0816o oVar, C0787av.C0823t tVar, C0698a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3134a(C0787av.C0816o oVar, C0787av.C0823t tVar, C0700c cVar, C0699b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo3197a(oVar);
        if (a == null) {
            bVar.f2175b = true;
            return;
        }
        C0787av.C0809i iVar = (C0787av.C0809i) a.getLayoutParams();
        if (cVar.f2188k == null) {
            if (this.f2164k == (cVar.f2183f == -1)) {
                mo4003b(a);
            } else {
                mo4004b(a, 0);
            }
        } else {
            if (this.f2164k == (cVar.f2183f == -1)) {
                mo3979a(a);
            } else {
                mo3980a(a, 0);
            }
        }
        mo3981a(a, 0, 0);
        bVar.f2174a = this.f2163j.mo3745e(a);
        if (this.f2162i == 1) {
            if (mo3182g()) {
                i5 = mo4048x() - mo3964B();
                i4 = i5 - this.f2163j.mo3747f(a);
            } else {
                i4 = mo4050z();
                i5 = this.f2163j.mo3747f(a) + i4;
            }
            if (cVar.f2183f == -1) {
                int i6 = cVar.f2179b;
                i3 = cVar.f2179b - bVar.f2174a;
                i2 = i5;
                i = i6;
            } else {
                int i7 = cVar.f2179b;
                i = cVar.f2179b + bVar.f2174a;
                i2 = i5;
                i3 = i7;
            }
        } else {
            int A = mo3963A();
            int f = this.f2163j.mo3747f(a) + A;
            if (cVar.f2183f == -1) {
                i3 = A;
                i2 = cVar.f2179b;
                i = f;
                i4 = cVar.f2179b - bVar.f2174a;
            } else {
                int i8 = cVar.f2179b;
                i2 = cVar.f2179b + bVar.f2174a;
                i3 = A;
                i = f;
                i4 = i8;
            }
        }
        mo3982a(a, i4, i3, i2, i);
        if (iVar.mo4057d() || iVar.mo4058e()) {
            bVar.f2176c = true;
        }
        bVar.f2177d = a.hasFocusable();
    }

    /* renamed from: a */
    public void mo3136a(C0787av.C0823t tVar) {
        super.mo3136a(tVar);
        this.f2167n = null;
        this.f2165l = -1;
        this.f2166m = Integer.MIN_VALUE;
        this.f2168o.mo3190a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3137a(C0787av.C0823t tVar, C0700c cVar, C0787av.C0804h.C0807a aVar) {
        int i = cVar.f2181d;
        if (i >= 0 && i < tVar.mo4136e()) {
            aVar.mo3629b(i, Math.max(0, cVar.f2184g));
        }
    }

    /* renamed from: a */
    public void mo3162a(C0787av avVar, C0787av.C0816o oVar) {
        super.mo3162a(avVar, oVar);
        if (this.f2159f) {
            mo4008c(oVar);
            oVar.mo4078a();
        }
    }

    /* renamed from: a */
    public void mo3163a(AccessibilityEvent accessibilityEvent) {
        super.mo3163a(accessibilityEvent);
        if (mo4045u() > 0) {
            accessibilityEvent.setFromIndex(mo3188l());
            accessibilityEvent.setToIndex(mo3189m());
        }
    }

    /* renamed from: a */
    public void mo3164a(String str) {
        if (this.f2167n == null) {
            super.mo3164a(str);
        }
    }

    /* renamed from: a */
    public void mo3142a(boolean z) {
        mo3164a((String) null);
        if (this.f2157d != z) {
            this.f2157d = z;
            mo4037n();
        }
    }

    /* renamed from: b */
    public int mo3144b(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (this.f2162i == 0) {
            return 0;
        }
        return mo3169c(i, oVar, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo3165b(C0787av.C0823t tVar) {
        if (tVar.mo4135d()) {
            return this.f2163j.mo3746f();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3166b(int i, int i2) {
        int i3;
        int i4;
        mo3184h();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4030h(i);
        }
        if (this.f2163j.mo3735a(mo4030h(i)) < this.f2163j.mo3740c()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f2162i == 0 ? this.f2711r : this.f2712s).mo4325a(i, i2, i4, i3);
    }

    /* renamed from: b */
    public void mo3167b(int i) {
        if (i == 0 || i == 1) {
            mo3164a((String) null);
            if (i != this.f2162i) {
                this.f2162i = i;
                this.f2163j = null;
                mo4037n();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: b */
    public void mo3168b(boolean z) {
        mo3164a((String) null);
        if (z != this.f2156c) {
            this.f2156c = z;
            mo4037n();
        }
    }

    /* renamed from: b */
    public boolean mo3147b() {
        return this.f2167n == null && this.f2155b == this.f2157d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3169c(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (mo4045u() == 0 || i == 0) {
            return 0;
        }
        this.f2154a.f2178a = true;
        mo3184h();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3372a(i2, abs, true, tVar);
        int a = this.f2154a.f2184g + mo3157a(oVar, this.f2154a, tVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2163j.mo3737a(-i);
        this.f2154a.f2187j = i;
        return i;
    }

    /* renamed from: c */
    public int mo3170c(C0787av.C0823t tVar) {
        return m3389i(tVar);
    }

    /* renamed from: c */
    public Parcelable mo3171c() {
        C0701d dVar = this.f2167n;
        if (dVar != null) {
            return new C0701d(dVar);
        }
        C0701d dVar2 = new C0701d();
        if (mo4045u() > 0) {
            mo3184h();
            boolean z = this.f2155b ^ this.f2164k;
            dVar2.f2192c = z;
            if (z) {
                View L = m3368L();
                dVar2.f2191b = this.f2163j.mo3742d() - this.f2163j.mo3739b(L);
                dVar2.f2190a = mo4015d(L);
            } else {
                View K = m3367K();
                dVar2.f2190a = mo4015d(K);
                dVar2.f2191b = this.f2163j.mo3735a(K) - this.f2163j.mo3740c();
            }
        } else {
            dVar2.mo3203b();
        }
        return dVar2;
    }

    /* renamed from: c */
    public View mo3172c(int i) {
        int u = mo4045u();
        if (u == 0) {
            return null;
        }
        int d = i - mo4015d(mo4030h(0));
        if (d >= 0 && d < u) {
            View h = mo4030h(d);
            if (mo4015d(h) == i) {
                return h;
            }
        }
        return super.mo3172c(i);
    }

    /* renamed from: c */
    public void mo3148c(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View c;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f2167n == null && this.f2165l == -1) && tVar.mo4136e() == 0) {
            mo4008c(oVar);
            return;
        }
        C0701d dVar = this.f2167n;
        if (dVar != null && dVar.mo3202a()) {
            this.f2165l = this.f2167n.f2190a;
        }
        mo3184h();
        this.f2154a.f2178a = false;
        m3366J();
        View D = mo3966D();
        if (!this.f2168o.f2172d || this.f2165l != -1 || this.f2167n != null) {
            this.f2168o.mo3190a();
            C0698a aVar = this.f2168o;
            aVar.f2171c = this.f2164k ^ this.f2157d;
            m3377a(oVar, tVar, aVar);
            this.f2168o.f2172d = true;
        } else if (D != null && (this.f2163j.mo3735a(D) >= this.f2163j.mo3742d() || this.f2163j.mo3739b(D) <= this.f2163j.mo3740c())) {
            this.f2168o.mo3191a(D);
        }
        int b = mo3165b(tVar);
        if (this.f2154a.f2187j >= 0) {
            i = b;
            b = 0;
        } else {
            i = 0;
        }
        int c2 = b + this.f2163j.mo3740c();
        int g = i + this.f2163j.mo3748g();
        if (!(!tVar.mo4132a() || (i7 = this.f2165l) == -1 || this.f2166m == Integer.MIN_VALUE || (c = mo3172c(i7)) == null)) {
            if (this.f2164k) {
                i8 = this.f2163j.mo3742d() - this.f2163j.mo3739b(c);
                i9 = this.f2166m;
            } else {
                i9 = this.f2163j.mo3735a(c) - this.f2163j.mo3740c();
                i8 = this.f2166m;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                c2 += i11;
            } else {
                g -= i11;
            }
        }
        if (!this.f2168o.f2171c ? !this.f2164k : this.f2164k) {
            i10 = 1;
        }
        mo3133a(oVar, tVar, this.f2168o, i10);
        mo3975a(oVar);
        this.f2154a.f2189l = mo3186j();
        this.f2154a.f2186i = tVar.mo4132a();
        if (this.f2168o.f2171c) {
            m3381b(this.f2168o);
            C0700c cVar = this.f2154a;
            cVar.f2185h = c2;
            mo3157a(oVar, cVar, tVar, false);
            i3 = this.f2154a.f2179b;
            int i12 = this.f2154a.f2181d;
            if (this.f2154a.f2180c > 0) {
                g += this.f2154a.f2180c;
            }
            m3373a(this.f2168o);
            C0700c cVar2 = this.f2154a;
            cVar2.f2185h = g;
            cVar2.f2181d += this.f2154a.f2182e;
            mo3157a(oVar, this.f2154a, tVar, false);
            i2 = this.f2154a.f2179b;
            if (this.f2154a.f2180c > 0) {
                int i13 = this.f2154a.f2180c;
                m3387g(i12, i3);
                C0700c cVar3 = this.f2154a;
                cVar3.f2185h = i13;
                mo3157a(oVar, cVar3, tVar, false);
                i3 = this.f2154a.f2179b;
            }
        } else {
            m3373a(this.f2168o);
            C0700c cVar4 = this.f2154a;
            cVar4.f2185h = g;
            mo3157a(oVar, cVar4, tVar, false);
            i2 = this.f2154a.f2179b;
            int i14 = this.f2154a.f2181d;
            if (this.f2154a.f2180c > 0) {
                c2 += this.f2154a.f2180c;
            }
            m3381b(this.f2168o);
            C0700c cVar5 = this.f2154a;
            cVar5.f2185h = c2;
            cVar5.f2181d += this.f2154a.f2182e;
            mo3157a(oVar, this.f2154a, tVar, false);
            i3 = this.f2154a.f2179b;
            if (this.f2154a.f2180c > 0) {
                int i15 = this.f2154a.f2180c;
                mo3123a(i14, i2);
                C0700c cVar6 = this.f2154a;
                cVar6.f2185h = i15;
                mo3157a(oVar, cVar6, tVar, false);
                i2 = this.f2154a.f2179b;
            }
        }
        if (mo4045u() > 0) {
            if (this.f2164k ^ this.f2157d) {
                int a = m3369a(i2, oVar, tVar, true);
                i6 = i3 + a;
                i4 = i2 + a;
                i5 = m3379b(i6, oVar, tVar, false);
            } else {
                int b2 = m3379b(i3, oVar, tVar, true);
                i6 = i3 + b2;
                i4 = i2 + b2;
                i5 = m3369a(i4, oVar, tVar, false);
            }
            i3 = i6 + i5;
            i2 = i4 + i5;
        }
        m3383b(oVar, tVar, i3, i2);
        if (!tVar.mo4132a()) {
            this.f2163j.mo3736a();
        } else {
            this.f2168o.mo3190a();
        }
        this.f2155b = this.f2157d;
    }

    /* renamed from: d */
    public int mo3173d(C0787av.C0823t tVar) {
        return m3389i(tVar);
    }

    /* renamed from: d */
    public void mo3174d(int i) {
        this.f2165l = i;
        this.f2166m = Integer.MIN_VALUE;
        C0701d dVar = this.f2167n;
        if (dVar != null) {
            dVar.mo3203b();
        }
        mo4037n();
    }

    /* renamed from: d */
    public boolean mo3175d() {
        return this.f2162i == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3176e(int i) {
        if (i == 17) {
            return this.f2162i == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f2162i == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f2162i == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i == 130) {
            return this.f2162i == 1 ? 1 : Integer.MIN_VALUE;
        }
        switch (i) {
            case 1:
                return (this.f2162i != 1 && mo3182g()) ? 1 : -1;
            case 2:
                return (this.f2162i != 1 && mo3182g()) ? -1 : 1;
            default:
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: e */
    public int mo3177e(C0787av.C0823t tVar) {
        return m3391j(tVar);
    }

    /* renamed from: e */
    public boolean mo3178e() {
        return this.f2162i == 1;
    }

    /* renamed from: f */
    public int mo3179f() {
        return this.f2162i;
    }

    /* renamed from: f */
    public int mo3180f(C0787av.C0823t tVar) {
        return m3391j(tVar);
    }

    /* renamed from: g */
    public int mo3181g(C0787av.C0823t tVar) {
        return m3393k(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo3182g() {
        return mo4043s() == 1;
    }

    /* renamed from: h */
    public int mo3183h(C0787av.C0823t tVar) {
        return m3393k(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3184h() {
        if (this.f2154a == null) {
            this.f2154a = mo3185i();
        }
        if (this.f2163j == null) {
            this.f2163j = C0784au.m3991a(this, this.f2162i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0700c mo3185i() {
        return new C0700c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo3186j() {
        return this.f2163j.mo3749h() == 0 && this.f2163j.mo3744e() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo3187k() {
        return (mo4047w() == 1073741824 || mo4046v() == 1073741824 || !mo3971I()) ? false : true;
    }

    /* renamed from: l */
    public int mo3188l() {
        View a = mo3158a(0, mo4045u(), false, true);
        if (a == null) {
            return -1;
        }
        return mo4015d(a);
    }

    /* renamed from: m */
    public int mo3189m() {
        View a = mo3158a(mo4045u() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo4015d(a);
    }
}
