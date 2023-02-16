package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p020v7.widget.C0787av;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C0787av.C0804h {

    /* renamed from: A */
    private C0717d f2250A;

    /* renamed from: B */
    private int f2251B;

    /* renamed from: C */
    private final Rect f2252C = new Rect();

    /* renamed from: D */
    private final C0712a f2253D = new C0712a();

    /* renamed from: E */
    private boolean f2254E = false;

    /* renamed from: F */
    private boolean f2255F;

    /* renamed from: G */
    private int[] f2256G;

    /* renamed from: H */
    private final Runnable f2257H;

    /* renamed from: a */
    C0719e[] f2258a;

    /* renamed from: b */
    C0784au f2259b;

    /* renamed from: c */
    C0784au f2260c;

    /* renamed from: d */
    boolean f2261d = false;

    /* renamed from: e */
    boolean f2262e = false;

    /* renamed from: f */
    int f2263f = -1;

    /* renamed from: g */
    int f2264g = Integer.MIN_VALUE;

    /* renamed from: h */
    C0714c f2265h = new C0714c();

    /* renamed from: i */
    private int f2266i = -1;

    /* renamed from: j */
    private int f2267j;

    /* renamed from: k */
    private int f2268k;

    /* renamed from: l */
    private final C0766an f2269l;

    /* renamed from: m */
    private BitSet f2270m;

    /* renamed from: n */
    private int f2271n = 2;

    /* renamed from: o */
    private boolean f2272o;

    /* renamed from: z */
    private boolean f2273z;

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0712a {

        /* renamed from: a */
        int f2275a;

        /* renamed from: b */
        int f2276b;

        /* renamed from: c */
        boolean f2277c;

        /* renamed from: d */
        boolean f2278d;

        /* renamed from: e */
        boolean f2279e;

        /* renamed from: f */
        int[] f2280f;

        C0712a() {
            mo3297a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3297a() {
            this.f2275a = -1;
            this.f2276b = Integer.MIN_VALUE;
            this.f2277c = false;
            this.f2278d = false;
            this.f2279e = false;
            int[] iArr = this.f2280f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3298a(int i) {
            this.f2276b = this.f2277c ? StaggeredGridLayoutManager.this.f2259b.mo3742d() - i : StaggeredGridLayoutManager.this.f2259b.mo3740c() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3299a(C0719e[] eVarArr) {
            int length = eVarArr.length;
            int[] iArr = this.f2280f;
            if (iArr == null || iArr.length < length) {
                this.f2280f = new int[StaggeredGridLayoutManager.this.f2258a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2280f[i] = eVarArr[i].mo3331a(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3300b() {
            this.f2276b = this.f2277c ? StaggeredGridLayoutManager.this.f2259b.mo3742d() : StaggeredGridLayoutManager.this.f2259b.mo3740c();
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    public static class C0713b extends C0787av.C0809i {

        /* renamed from: a */
        C0719e f2282a;

        /* renamed from: b */
        boolean f2283b;

        public C0713b(int i, int i2) {
            super(i, i2);
        }

        public C0713b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0713b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0713b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public boolean mo3301a() {
            return this.f2283b;
        }

        /* renamed from: b */
        public final int mo3302b() {
            C0719e eVar = this.f2282a;
            if (eVar == null) {
                return -1;
            }
            return eVar.f2304e;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c */
    static class C0714c {

        /* renamed from: a */
        int[] f2284a;

        /* renamed from: b */
        List<C0715a> f2285b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c$a */
        static class C0715a implements Parcelable {
            public static final Parcelable.Creator<C0715a> CREATOR = new Parcelable.Creator<C0715a>() {
                /* renamed from: a */
                public C0715a createFromParcel(Parcel parcel) {
                    return new C0715a(parcel);
                }

                /* renamed from: a */
                public C0715a[] newArray(int i) {
                    return new C0715a[i];
                }
            };

            /* renamed from: a */
            int f2286a;

            /* renamed from: b */
            int f2287b;

            /* renamed from: c */
            int[] f2288c;

            /* renamed from: d */
            boolean f2289d;

            C0715a() {
            }

            C0715a(Parcel parcel) {
                this.f2286a = parcel.readInt();
                this.f2287b = parcel.readInt();
                this.f2289d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2288c = new int[readInt];
                    parcel.readIntArray(this.f2288c);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo3315a(int i) {
                int[] iArr = this.f2288c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2286a + ", mGapDir=" + this.f2287b + ", mHasUnwantedGapAfter=" + this.f2289d + ", mGapPerSpan=" + Arrays.toString(this.f2288c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2286a);
                parcel.writeInt(this.f2287b);
                parcel.writeInt(this.f2289d ? 1 : 0);
                int[] iArr = this.f2288c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2288c);
            }
        }

        C0714c() {
        }

        /* renamed from: c */
        private void m3597c(int i, int i2) {
            List<C0715a> list = this.f2285b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0715a aVar = this.f2285b.get(size);
                    if (aVar.f2286a >= i) {
                        if (aVar.f2286a < i3) {
                            this.f2285b.remove(size);
                        } else {
                            aVar.f2286a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m3598d(int i, int i2) {
            List<C0715a> list = this.f2285b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0715a aVar = this.f2285b.get(size);
                    if (aVar.f2286a >= i) {
                        aVar.f2286a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m3599g(int i) {
            if (this.f2285b == null) {
                return -1;
            }
            C0715a f = mo3314f(i);
            if (f != null) {
                this.f2285b.remove(f);
            }
            int size = this.f2285b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2285b.get(i2).f2286a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2285b.remove(i2);
            return this.f2285b.get(i2).f2286a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3303a(int i) {
            List<C0715a> list = this.f2285b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2285b.get(size).f2286a >= i) {
                        this.f2285b.remove(size);
                    }
                }
            }
            return mo3309b(i);
        }

        /* renamed from: a */
        public C0715a mo3304a(int i, int i2, int i3, boolean z) {
            List<C0715a> list = this.f2285b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0715a aVar = this.f2285b.get(i4);
                if (aVar.f2286a >= i2) {
                    return null;
                }
                if (aVar.f2286a >= i && (i3 == 0 || aVar.f2287b == i3 || (z && aVar.f2289d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3305a() {
            int[] iArr = this.f2284a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2285b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3306a(int i, int i2) {
            int[] iArr = this.f2284a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3313e(i3);
                int[] iArr2 = this.f2284a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2284a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m3597c(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3307a(int i, C0719e eVar) {
            mo3313e(i);
            this.f2284a[i] = eVar.f2304e;
        }

        /* renamed from: a */
        public void mo3308a(C0715a aVar) {
            if (this.f2285b == null) {
                this.f2285b = new ArrayList();
            }
            int size = this.f2285b.size();
            for (int i = 0; i < size; i++) {
                C0715a aVar2 = this.f2285b.get(i);
                if (aVar2.f2286a == aVar.f2286a) {
                    this.f2285b.remove(i);
                }
                if (aVar2.f2286a >= aVar.f2286a) {
                    this.f2285b.add(i, aVar);
                    return;
                }
            }
            this.f2285b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3309b(int i) {
            int[] iArr = this.f2284a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m3599g(i);
            if (g == -1) {
                int[] iArr2 = this.f2284a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2284a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2284a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3310b(int i, int i2) {
            int[] iArr = this.f2284a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3313e(i3);
                int[] iArr2 = this.f2284a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2284a, i, i3, -1);
                m3598d(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo3311c(int i) {
            int[] iArr = this.f2284a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3312d(int i) {
            int length = this.f2284a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3313e(int i) {
            int[] iArr = this.f2284a;
            if (iArr == null) {
                this.f2284a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f2284a, -1);
            } else if (i >= iArr.length) {
                this.f2284a = new int[mo3312d(i)];
                System.arraycopy(iArr, 0, this.f2284a, 0, iArr.length);
                int[] iArr2 = this.f2284a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* renamed from: f */
        public C0715a mo3314f(int i) {
            List<C0715a> list = this.f2285b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0715a aVar = this.f2285b.get(size);
                if (aVar.f2286a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d */
    public static class C0717d implements Parcelable {
        public static final Parcelable.Creator<C0717d> CREATOR = new Parcelable.Creator<C0717d>() {
            /* renamed from: a */
            public C0717d createFromParcel(Parcel parcel) {
                return new C0717d(parcel);
            }

            /* renamed from: a */
            public C0717d[] newArray(int i) {
                return new C0717d[i];
            }
        };

        /* renamed from: a */
        int f2290a;

        /* renamed from: b */
        int f2291b;

        /* renamed from: c */
        int f2292c;

        /* renamed from: d */
        int[] f2293d;

        /* renamed from: e */
        int f2294e;

        /* renamed from: f */
        int[] f2295f;

        /* renamed from: g */
        List<C0714c.C0715a> f2296g;

        /* renamed from: h */
        boolean f2297h;

        /* renamed from: i */
        boolean f2298i;

        /* renamed from: j */
        boolean f2299j;

        public C0717d() {
        }

        C0717d(Parcel parcel) {
            this.f2290a = parcel.readInt();
            this.f2291b = parcel.readInt();
            this.f2292c = parcel.readInt();
            int i = this.f2292c;
            if (i > 0) {
                this.f2293d = new int[i];
                parcel.readIntArray(this.f2293d);
            }
            this.f2294e = parcel.readInt();
            int i2 = this.f2294e;
            if (i2 > 0) {
                this.f2295f = new int[i2];
                parcel.readIntArray(this.f2295f);
            }
            boolean z = false;
            this.f2297h = parcel.readInt() == 1;
            this.f2298i = parcel.readInt() == 1;
            this.f2299j = parcel.readInt() == 1 ? true : z;
            this.f2296g = parcel.readArrayList(C0714c.C0715a.class.getClassLoader());
        }

        public C0717d(C0717d dVar) {
            this.f2292c = dVar.f2292c;
            this.f2290a = dVar.f2290a;
            this.f2291b = dVar.f2291b;
            this.f2293d = dVar.f2293d;
            this.f2294e = dVar.f2294e;
            this.f2295f = dVar.f2295f;
            this.f2297h = dVar.f2297h;
            this.f2298i = dVar.f2298i;
            this.f2299j = dVar.f2299j;
            this.f2296g = dVar.f2296g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3323a() {
            this.f2293d = null;
            this.f2292c = 0;
            this.f2294e = 0;
            this.f2295f = null;
            this.f2296g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3324b() {
            this.f2293d = null;
            this.f2292c = 0;
            this.f2290a = -1;
            this.f2291b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2290a);
            parcel.writeInt(this.f2291b);
            parcel.writeInt(this.f2292c);
            if (this.f2292c > 0) {
                parcel.writeIntArray(this.f2293d);
            }
            parcel.writeInt(this.f2294e);
            if (this.f2294e > 0) {
                parcel.writeIntArray(this.f2295f);
            }
            parcel.writeInt(this.f2297h ? 1 : 0);
            parcel.writeInt(this.f2298i ? 1 : 0);
            parcel.writeInt(this.f2299j ? 1 : 0);
            parcel.writeList(this.f2296g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$e */
    class C0719e {

        /* renamed from: a */
        ArrayList<View> f2300a = new ArrayList<>();

        /* renamed from: b */
        int f2301b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2302c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2303d = 0;

        /* renamed from: e */
        final int f2304e;

        C0719e(int i) {
            this.f2304e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3331a(int i) {
            int i2 = this.f2301b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2300a.size() == 0) {
                return i;
            }
            mo3335a();
            return this.f2301b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3332a(int i, int i2, boolean z) {
            return mo3333a(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3333a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int c = StaggeredGridLayoutManager.this.f2259b.mo3740c();
            int d = StaggeredGridLayoutManager.this.f2259b.mo3742d();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2300a.get(i);
                int a = StaggeredGridLayoutManager.this.f2259b.mo3735a(view);
                int b = StaggeredGridLayoutManager.this.f2259b.mo3739b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? a < d : a <= d;
                if (!z3 ? b > c : b >= c) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && a >= c && b <= d) {
                        }
                    } else if (a >= c && b <= d) {
                    }
                    return StaggeredGridLayoutManager.this.mo4015d(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View mo3334a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2300a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2300a.get(size);
                    if ((StaggeredGridLayoutManager.this.f2261d && StaggeredGridLayoutManager.this.mo4015d(view2) >= i) || ((!StaggeredGridLayoutManager.this.f2261d && StaggeredGridLayoutManager.this.mo4015d(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2300a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2300a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f2261d && StaggeredGridLayoutManager.this.mo4015d(view3) <= i) || ((!StaggeredGridLayoutManager.this.f2261d && StaggeredGridLayoutManager.this.mo4015d(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3335a() {
            C0714c.C0715a f;
            View view = this.f2300a.get(0);
            C0713b c = mo3341c(view);
            this.f2301b = StaggeredGridLayoutManager.this.f2259b.mo3735a(view);
            if (c.f2283b && (f = StaggeredGridLayoutManager.this.f2265h.mo3314f(c.mo4059f())) != null && f.f2287b == -1) {
                this.f2301b -= f.mo3315a(this.f2304e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3336a(View view) {
            C0713b c = mo3341c(view);
            c.f2282a = this;
            this.f2300a.add(0, view);
            this.f2301b = Integer.MIN_VALUE;
            if (this.f2300a.size() == 1) {
                this.f2302c = Integer.MIN_VALUE;
            }
            if (c.mo4057d() || c.mo4058e()) {
                this.f2303d += StaggeredGridLayoutManager.this.f2259b.mo3745e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3337a(boolean z, int i) {
            int b = z ? mo3339b(Integer.MIN_VALUE) : mo3331a(Integer.MIN_VALUE);
            mo3346e();
            if (b != Integer.MIN_VALUE) {
                if (z && b < StaggeredGridLayoutManager.this.f2259b.mo3742d()) {
                    return;
                }
                if (z || b <= StaggeredGridLayoutManager.this.f2259b.mo3740c()) {
                    if (i != Integer.MIN_VALUE) {
                        b += i;
                    }
                    this.f2302c = b;
                    this.f2301b = b;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3338b() {
            int i = this.f2301b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3335a();
            return this.f2301b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3339b(int i) {
            int i2 = this.f2302c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2300a.size() == 0) {
                return i;
            }
            mo3342c();
            return this.f2302c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3340b(View view) {
            C0713b c = mo3341c(view);
            c.f2282a = this;
            this.f2300a.add(view);
            this.f2302c = Integer.MIN_VALUE;
            if (this.f2300a.size() == 1) {
                this.f2301b = Integer.MIN_VALUE;
            }
            if (c.mo4057d() || c.mo4058e()) {
                this.f2303d += StaggeredGridLayoutManager.this.f2259b.mo3745e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0713b mo3341c(View view) {
            return (C0713b) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3342c() {
            C0714c.C0715a f;
            ArrayList<View> arrayList = this.f2300a;
            View view = arrayList.get(arrayList.size() - 1);
            C0713b c = mo3341c(view);
            this.f2302c = StaggeredGridLayoutManager.this.f2259b.mo3739b(view);
            if (c.f2283b && (f = StaggeredGridLayoutManager.this.f2265h.mo3314f(c.mo4059f())) != null && f.f2287b == 1) {
                this.f2302c += f.mo3315a(this.f2304e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3343c(int i) {
            this.f2301b = i;
            this.f2302c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3344d() {
            int i = this.f2302c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3342c();
            return this.f2302c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3345d(int i) {
            int i2 = this.f2301b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2301b = i2 + i;
            }
            int i3 = this.f2302c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2302c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3346e() {
            this.f2300a.clear();
            mo3347f();
            this.f2303d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3347f() {
            this.f2301b = Integer.MIN_VALUE;
            this.f2302c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3348g() {
            int size = this.f2300a.size();
            View remove = this.f2300a.remove(size - 1);
            C0713b c = mo3341c(remove);
            c.f2282a = null;
            if (c.mo4057d() || c.mo4058e()) {
                this.f2303d -= StaggeredGridLayoutManager.this.f2259b.mo3745e(remove);
            }
            if (size == 1) {
                this.f2301b = Integer.MIN_VALUE;
            }
            this.f2302c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3349h() {
            View remove = this.f2300a.remove(0);
            C0713b c = mo3341c(remove);
            c.f2282a = null;
            if (this.f2300a.size() == 0) {
                this.f2302c = Integer.MIN_VALUE;
            }
            if (c.mo4057d() || c.mo4058e()) {
                this.f2303d -= StaggeredGridLayoutManager.this.f2259b.mo3745e(remove);
            }
            this.f2301b = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public int mo3350i() {
            return this.f2303d;
        }

        /* renamed from: j */
        public int mo3351j() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2261d) {
                i2 = this.f2300a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f2300a.size();
            }
            return mo3332a(i2, i, true);
        }

        /* renamed from: k */
        public int mo3352k() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2261d) {
                i2 = 0;
                i = this.f2300a.size();
            } else {
                i2 = this.f2300a.size() - 1;
                i = -1;
            }
            return mo3332a(i2, i, true);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        boolean z = true;
        this.f2255F = true;
        this.f2257H = new Runnable() {
            public void run() {
                StaggeredGridLayoutManager.this.mo3286f();
            }
        };
        this.f2267j = i2;
        mo3276a(i);
        mo4013c(this.f2271n == 0 ? false : z);
        this.f2269l = new C0766an();
        m3496L();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = true;
        this.f2255F = true;
        this.f2257H = new Runnable() {
            public void run() {
                StaggeredGridLayoutManager.this.mo3286f();
            }
        };
        C0787av.C0804h.C0808b a = m4240a(context, attributeSet, i, i2);
        mo3281b(a.f2721a);
        mo3276a(a.f2722b);
        mo3279a(a.f2723c);
        mo4013c(this.f2271n == 0 ? false : z);
        this.f2269l = new C0766an();
        m3496L();
    }

    /* renamed from: L */
    private void m3496L() {
        this.f2259b = C0784au.m3991a(this, this.f2267j);
        this.f2260c = C0784au.m3991a(this, 1 - this.f2267j);
    }

    /* renamed from: M */
    private void m3497M() {
        this.f2262e = (this.f2267j == 1 || !mo3290i()) ? this.f2261d : !this.f2261d;
    }

    /* renamed from: N */
    private void m3498N() {
        int i;
        int i2;
        if (this.f2260c.mo3749h() != 1073741824) {
            int u = mo4045u();
            float f = 0.0f;
            for (int i3 = 0; i3 < u; i3++) {
                View h = mo4030h(i3);
                float e = (float) this.f2260c.mo3745e(h);
                if (e >= f) {
                    if (((C0713b) h.getLayoutParams()).mo3301a()) {
                        e = (e * 1.0f) / ((float) this.f2266i);
                    }
                    f = Math.max(f, e);
                }
            }
            int i4 = this.f2268k;
            int round = Math.round(f * ((float) this.f2266i));
            if (this.f2260c.mo3749h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2260c.mo3746f());
            }
            mo3285e(round);
            if (this.f2268k != i4) {
                for (int i5 = 0; i5 < u; i5++) {
                    View h2 = mo4030h(i5);
                    C0713b bVar = (C0713b) h2.getLayoutParams();
                    if (!bVar.f2283b) {
                        if (!mo3290i() || this.f2267j != 1) {
                            i = bVar.f2282a.f2304e * this.f2268k;
                            i2 = bVar.f2282a.f2304e * i4;
                            if (this.f2267j != 1) {
                                h2.offsetTopAndBottom(i - i2);
                            }
                        } else {
                            i = (-((this.f2266i - 1) - bVar.f2282a.f2304e)) * this.f2268k;
                            i2 = (-((this.f2266i - 1) - bVar.f2282a.f2304e)) * i4;
                        }
                        h2.offsetLeftAndRight(i - i2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* renamed from: a */
    private int m3499a(C0787av.C0816o oVar, C0766an anVar, C0787av.C0823t tVar) {
        int i;
        C0719e eVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        C0787av.C0816o oVar2 = oVar;
        C0766an anVar2 = anVar;
        ? r9 = 0;
        this.f2270m.set(0, this.f2266i, true);
        if (this.f2269l.f2521i) {
            i = anVar2.f2517e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = anVar2.f2517e == 1 ? anVar2.f2519g + anVar2.f2514b : anVar2.f2518f - anVar2.f2514b;
        }
        m3501a(anVar2.f2517e, i);
        int d = this.f2262e ? this.f2259b.mo3742d() : this.f2259b.mo3740c();
        boolean z = false;
        while (anVar.mo3632a(tVar) && (this.f2269l.f2521i || !this.f2270m.isEmpty())) {
            View a = anVar2.mo3631a(oVar2);
            C0713b bVar = (C0713b) a.getLayoutParams();
            int f = bVar.mo4059f();
            int c = this.f2265h.mo3311c(f);
            boolean z2 = c == -1;
            if (z2) {
                eVar = bVar.f2283b ? this.f2258a[r9] : m3500a(anVar2);
                this.f2265h.mo3307a(f, eVar);
            } else {
                eVar = this.f2258a[c];
            }
            C0719e eVar2 = eVar;
            bVar.f2282a = eVar2;
            if (anVar2.f2517e == 1) {
                mo4003b(a);
            } else {
                mo4004b(a, (int) r9);
            }
            m3509a(a, bVar, (boolean) r9);
            if (anVar2.f2517e == 1) {
                int q = bVar.f2283b ? m3527q(d) : eVar2.mo3339b(d);
                int e = this.f2259b.mo3745e(a) + q;
                if (z2 && bVar.f2283b) {
                    C0714c.C0715a m = m3522m(q);
                    m.f2287b = -1;
                    m.f2286a = f;
                    this.f2265h.mo3308a(m);
                }
                i2 = e;
                i3 = q;
            } else {
                int p = bVar.f2283b ? m3525p(d) : eVar2.mo3331a(d);
                i3 = p - this.f2259b.mo3745e(a);
                if (z2 && bVar.f2283b) {
                    C0714c.C0715a n = m3523n(p);
                    n.f2287b = 1;
                    n.f2286a = f;
                    this.f2265h.mo3308a(n);
                }
                i2 = p;
            }
            if (bVar.f2283b && anVar2.f2516d == -1) {
                if (!z2) {
                    if (!(anVar2.f2517e == 1 ? mo3294l() : mo3295m())) {
                        C0714c.C0715a f2 = this.f2265h.mo3314f(f);
                        if (f2 != null) {
                            f2.f2289d = true;
                        }
                    }
                }
                this.f2254E = true;
            }
            m3508a(a, bVar, anVar2);
            if (!mo3290i() || this.f2267j != 1) {
                int c2 = bVar.f2283b ? this.f2260c.mo3740c() : (eVar2.f2304e * this.f2268k) + this.f2260c.mo3740c();
                i5 = c2;
                i4 = this.f2260c.mo3745e(a) + c2;
            } else {
                int d2 = bVar.f2283b ? this.f2260c.mo3742d() : this.f2260c.mo3742d() - (((this.f2266i - 1) - eVar2.f2304e) * this.f2268k);
                i4 = d2;
                i5 = d2 - this.f2260c.mo3745e(a);
            }
            if (this.f2267j == 1) {
                staggeredGridLayoutManager = this;
                view = a;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = a;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo3982a(view, i7, i5, i6, i2);
            if (bVar.f2283b) {
                m3501a(this.f2269l.f2517e, i);
            } else {
                m3503a(eVar2, this.f2269l.f2517e, i);
            }
            m3505a(oVar2, this.f2269l);
            if (this.f2269l.f2520h && a.hasFocusable()) {
                if (bVar.f2283b) {
                    this.f2270m.clear();
                } else {
                    this.f2270m.set(eVar2.f2304e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m3505a(oVar2, this.f2269l);
        }
        int c3 = this.f2269l.f2517e == -1 ? this.f2259b.mo3740c() - m3525p(this.f2259b.mo3740c()) : m3527q(this.f2259b.mo3742d()) - this.f2259b.mo3742d();
        if (c3 > 0) {
            return Math.min(anVar2.f2514b, c3);
        }
        return 0;
    }

    /* renamed from: a */
    private C0719e m3500a(C0766an anVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3530s(anVar.f2517e)) {
            i2 = this.f2266i - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2266i;
            i = 1;
        }
        C0719e eVar = null;
        if (anVar.f2517e == 1) {
            int i4 = Integer.MAX_VALUE;
            int c = this.f2259b.mo3740c();
            while (i2 != i3) {
                C0719e eVar2 = this.f2258a[i2];
                int b = eVar2.mo3339b(c);
                if (b < i4) {
                    eVar = eVar2;
                    i4 = b;
                }
                i2 += i;
            }
            return eVar;
        }
        int i5 = Integer.MIN_VALUE;
        int d = this.f2259b.mo3742d();
        while (i2 != i3) {
            C0719e eVar3 = this.f2258a[i2];
            int a = eVar3.mo3331a(d);
            if (a > i5) {
                eVar = eVar3;
                i5 = a;
            }
            i2 += i;
        }
        return eVar;
    }

    /* renamed from: a */
    private void m3501a(int i, int i2) {
        for (int i3 = 0; i3 < this.f2266i; i3++) {
            if (!this.f2258a[i3].f2300a.isEmpty()) {
                m3503a(this.f2258a[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m3502a(C0712a aVar) {
        boolean z;
        if (this.f2250A.f2292c > 0) {
            if (this.f2250A.f2292c == this.f2266i) {
                for (int i = 0; i < this.f2266i; i++) {
                    this.f2258a[i].mo3346e();
                    int i2 = this.f2250A.f2293d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        i2 += this.f2250A.f2298i ? this.f2259b.mo3742d() : this.f2259b.mo3740c();
                    }
                    this.f2258a[i].mo3343c(i2);
                }
            } else {
                this.f2250A.mo3323a();
                C0717d dVar = this.f2250A;
                dVar.f2290a = dVar.f2291b;
            }
        }
        this.f2273z = this.f2250A.f2299j;
        mo3279a(this.f2250A.f2297h);
        m3497M();
        if (this.f2250A.f2290a != -1) {
            this.f2263f = this.f2250A.f2290a;
            z = this.f2250A.f2298i;
        } else {
            z = this.f2262e;
        }
        aVar.f2277c = z;
        if (this.f2250A.f2294e > 1) {
            this.f2265h.f2284a = this.f2250A.f2295f;
            this.f2265h.f2285b = this.f2250A.f2296g;
        }
    }

    /* renamed from: a */
    private void m3503a(C0719e eVar, int i, int i2) {
        int i3 = eVar.mo3350i();
        if (i == -1) {
            if (eVar.mo3338b() + i3 > i2) {
                return;
            }
        } else if (eVar.mo3344d() - i3 < i2) {
            return;
        }
        this.f2270m.set(eVar.f2304e, false);
    }

    /* renamed from: a */
    private void m3504a(C0787av.C0816o oVar, int i) {
        while (mo4045u() > 0) {
            View h = mo4030h(0);
            if (this.f2259b.mo3739b(h) <= i && this.f2259b.mo3741c(h) <= i) {
                C0713b bVar = (C0713b) h.getLayoutParams();
                if (bVar.f2283b) {
                    int i2 = 0;
                    while (i2 < this.f2266i) {
                        if (this.f2258a[i2].f2300a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2266i; i3++) {
                        this.f2258a[i3].mo3349h();
                    }
                } else if (bVar.f2282a.f2300a.size() != 1) {
                    bVar.f2282a.mo3349h();
                } else {
                    return;
                }
                mo3986a(h, oVar);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f2517e == -1) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3505a(android.support.p020v7.widget.C0787av.C0816o r3, android.support.p020v7.widget.C0766an r4) {
        /*
            r2 = this;
            boolean r0 = r4.f2513a
            if (r0 == 0) goto L_0x004f
            boolean r0 = r4.f2521i
            if (r0 == 0) goto L_0x0009
            goto L_0x004f
        L_0x0009:
            int r0 = r4.f2514b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f2517e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f2519g
        L_0x0014:
            r2.m3514b((android.support.p020v7.widget.C0787av.C0816o) r3, (int) r4)
            goto L_0x004f
        L_0x0018:
            int r4 = r4.f2518f
        L_0x001a:
            r2.m3504a((android.support.p020v7.widget.C0787av.C0816o) r3, (int) r4)
            goto L_0x004f
        L_0x001e:
            int r0 = r4.f2517e
            if (r0 != r1) goto L_0x0039
            int r0 = r4.f2518f
            int r1 = r4.f2518f
            int r1 = r2.m3524o(r1)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002e
            goto L_0x0012
        L_0x002e:
            int r1 = r4.f2519g
            int r4 = r4.f2514b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0039:
            int r0 = r4.f2519g
            int r0 = r2.m3529r(r0)
            int r1 = r4.f2519g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0018
        L_0x0045:
            int r1 = r4.f2518f
            int r4 = r4.f2514b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.StaggeredGridLayoutManager.m3505a(android.support.v7.widget.av$o, android.support.v7.widget.an):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0151, code lost:
        if (mo3286f() != false) goto L_0x0155;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3506a(android.support.p020v7.widget.C0787av.C0816o r9, android.support.p020v7.widget.C0787av.C0823t r10, boolean r11) {
        /*
            r8 = this;
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f2253D
            android.support.v7.widget.StaggeredGridLayoutManager$d r1 = r8.f2250A
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2263f
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4136e()
            if (r1 != 0) goto L_0x0018
            r8.mo4008c((android.support.p020v7.widget.C0787av.C0816o) r9)
            r0.mo3297a()
            return
        L_0x0018:
            boolean r1 = r0.f2279e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2263f
            if (r1 != r2) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$d r1 = r8.f2250A
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo3297a()
            android.support.v7.widget.StaggeredGridLayoutManager$d r5 = r8.f2250A
            if (r5 == 0) goto L_0x0037
            r8.m3502a((android.support.p020v7.widget.StaggeredGridLayoutManager.C0712a) r0)
            goto L_0x003e
        L_0x0037:
            r8.m3497M()
            boolean r5 = r8.f2262e
            r0.f2277c = r5
        L_0x003e:
            r8.mo3278a((android.support.p020v7.widget.C0787av.C0823t) r10, (android.support.p020v7.widget.StaggeredGridLayoutManager.C0712a) r0)
            r0.f2279e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$d r5 = r8.f2250A
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2263f
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2277c
            boolean r6 = r8.f2272o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo3290i()
            boolean r6 = r8.f2273z
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$c r5 = r8.f2265h
            r5.mo3305a()
            r0.f2278d = r4
        L_0x0060:
            int r5 = r8.mo4045u()
            if (r5 <= 0) goto L_0x00cb
            android.support.v7.widget.StaggeredGridLayoutManager$d r5 = r8.f2250A
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2292c
            if (r5 >= r4) goto L_0x00cb
        L_0x006e:
            boolean r5 = r0.f2278d
            if (r5 == 0) goto L_0x0090
            r1 = 0
        L_0x0073:
            int r5 = r8.f2266i
            if (r1 >= r5) goto L_0x00cb
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2258a
            r5 = r5[r1]
            r5.mo3346e()
            int r5 = r0.f2276b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008d
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2258a
            r5 = r5[r1]
            int r6 = r0.f2276b
            r5.mo3343c((int) r6)
        L_0x008d:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0090:
            if (r1 != 0) goto L_0x00b1
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f2253D
            int[] r1 = r1.f2280f
            if (r1 != 0) goto L_0x0099
            goto L_0x00b1
        L_0x0099:
            r1 = 0
        L_0x009a:
            int r5 = r8.f2266i
            if (r1 >= r5) goto L_0x00cb
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2258a
            r5 = r5[r1]
            r5.mo3346e()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f2253D
            int[] r6 = r6.f2280f
            r6 = r6[r1]
            r5.mo3343c((int) r6)
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            int r5 = r8.f2266i
            if (r1 >= r5) goto L_0x00c4
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2258a
            r5 = r5[r1]
            boolean r6 = r8.f2262e
            int r7 = r0.f2276b
            r5.mo3337a((boolean) r6, (int) r7)
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c4:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f2253D
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2258a
            r1.mo3299a((android.support.p020v7.widget.StaggeredGridLayoutManager.C0719e[]) r5)
        L_0x00cb:
            r8.mo3975a((android.support.p020v7.widget.C0787av.C0816o) r9)
            android.support.v7.widget.an r1 = r8.f2269l
            r1.f2513a = r3
            r8.f2254E = r3
            android.support.v7.widget.au r1 = r8.f2260c
            int r1 = r1.mo3746f()
            r8.mo3285e((int) r1)
            int r1 = r0.f2275a
            r8.m3513b((int) r1, (android.support.p020v7.widget.C0787av.C0823t) r10)
            boolean r1 = r0.f2277c
            if (r1 == 0) goto L_0x00f2
            r8.m3521l(r2)
            android.support.v7.widget.an r1 = r8.f2269l
            r8.m3499a((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0766an) r1, (android.support.p020v7.widget.C0787av.C0823t) r10)
            r8.m3521l(r4)
            goto L_0x00fd
        L_0x00f2:
            r8.m3521l(r4)
            android.support.v7.widget.an r1 = r8.f2269l
            r8.m3499a((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0766an) r1, (android.support.p020v7.widget.C0787av.C0823t) r10)
            r8.m3521l(r2)
        L_0x00fd:
            android.support.v7.widget.an r1 = r8.f2269l
            int r2 = r0.f2275a
            android.support.v7.widget.an r5 = r8.f2269l
            int r5 = r5.f2516d
            int r2 = r2 + r5
            r1.f2515c = r2
            android.support.v7.widget.an r1 = r8.f2269l
            r8.m3499a((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0766an) r1, (android.support.p020v7.widget.C0787av.C0823t) r10)
            r8.m3498N()
            int r1 = r8.mo4045u()
            if (r1 <= 0) goto L_0x0127
            boolean r1 = r8.f2262e
            if (r1 == 0) goto L_0x0121
            r8.m3515b((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0787av.C0823t) r10, (boolean) r4)
            r8.m3517c((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0787av.C0823t) r10, (boolean) r3)
            goto L_0x0127
        L_0x0121:
            r8.m3517c((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0787av.C0823t) r10, (boolean) r4)
            r8.m3515b((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0787av.C0823t) r10, (boolean) r3)
        L_0x0127:
            if (r11 == 0) goto L_0x0154
            boolean r11 = r10.mo4132a()
            if (r11 != 0) goto L_0x0154
            int r11 = r8.f2271n
            if (r11 == 0) goto L_0x0145
            int r11 = r8.mo4045u()
            if (r11 <= 0) goto L_0x0145
            boolean r11 = r8.f2254E
            if (r11 != 0) goto L_0x0143
            android.view.View r11 = r8.mo3287g()
            if (r11 == 0) goto L_0x0145
        L_0x0143:
            r11 = 1
            goto L_0x0146
        L_0x0145:
            r11 = 0
        L_0x0146:
            if (r11 == 0) goto L_0x0154
            java.lang.Runnable r11 = r8.f2257H
            r8.mo3999a((java.lang.Runnable) r11)
            boolean r11 = r8.mo3286f()
            if (r11 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r4 = 0
        L_0x0155:
            boolean r11 = r10.mo4132a()
            if (r11 == 0) goto L_0x0160
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f2253D
            r11.mo3297a()
        L_0x0160:
            boolean r11 = r0.f2277c
            r8.f2272o = r11
            boolean r11 = r8.mo3290i()
            r8.f2273z = r11
            if (r4 == 0) goto L_0x0174
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f2253D
            r11.mo3297a()
            r8.m3506a((android.support.p020v7.widget.C0787av.C0816o) r9, (android.support.p020v7.widget.C0787av.C0823t) r10, (boolean) r3)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.StaggeredGridLayoutManager.m3506a(android.support.v7.widget.av$o, android.support.v7.widget.av$t, boolean):void");
    }

    /* renamed from: a */
    private void m3507a(View view, int i, int i2, boolean z) {
        mo4005b(view, this.f2252C);
        C0713b bVar = (C0713b) view.getLayoutParams();
        int b = m3511b(i, bVar.leftMargin + this.f2252C.left, bVar.rightMargin + this.f2252C.right);
        int b2 = m3511b(i2, bVar.topMargin + this.f2252C.top, bVar.bottomMargin + this.f2252C.bottom);
        if (z ? mo3996a(view, b, b2, (C0787av.C0809i) bVar) : mo4006b(view, b, b2, (C0787av.C0809i) bVar)) {
            view.measure(b, b2);
        }
    }

    /* renamed from: a */
    private void m3508a(View view, C0713b bVar, C0766an anVar) {
        if (anVar.f2517e == 1) {
            if (bVar.f2283b) {
                m3526p(view);
            } else {
                bVar.f2282a.mo3340b(view);
            }
        } else if (bVar.f2283b) {
            m3528q(view);
        } else {
            bVar.f2282a.mo3336a(view);
        }
    }

    /* renamed from: a */
    private void m3509a(View view, C0713b bVar, boolean z) {
        int i;
        int i2;
        if (bVar.f2283b) {
            if (this.f2267j == 1) {
                i2 = this.f2251B;
            } else {
                m3507a(view, m4239a(mo4048x(), mo4046v(), 0, bVar.width, true), this.f2251B, z);
                return;
            }
        } else if (this.f2267j == 1) {
            i2 = m4239a(this.f2268k, mo4046v(), 0, bVar.width, false);
        } else {
            i2 = m4239a(mo4048x(), mo4046v(), 0, bVar.width, true);
            i = m4239a(this.f2268k, mo4047w(), 0, bVar.height, false);
            m3507a(view, i2, i, z);
        }
        i = m4239a(mo4049y(), mo4047w(), 0, bVar.height, true);
        m3507a(view, i2, i, z);
    }

    /* renamed from: a */
    private boolean m3510a(C0719e eVar) {
        if (this.f2262e) {
            if (eVar.mo3344d() < this.f2259b.mo3742d()) {
                return !eVar.mo3341c(eVar.f2300a.get(eVar.f2300a.size() - 1)).f2283b;
            }
        } else if (eVar.mo3338b() > this.f2259b.mo3740c()) {
            return !eVar.mo3341c(eVar.f2300a.get(0)).f2283b;
        }
        return false;
    }

    /* renamed from: b */
    private int m3511b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: b */
    private int m3512b(C0787av.C0823t tVar) {
        if (mo4045u() == 0) {
            return 0;
        }
        return C0831az.m4554a(tVar, this.f2259b, mo3280b(!this.f2255F), mo3284d(!this.f2255F), this, this.f2255F, this.f2262e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3513b(int r5, android.support.p020v7.widget.C0787av.C0823t r6) {
        /*
            r4 = this;
            android.support.v7.widget.an r0 = r4.f2269l
            r1 = 0
            r0.f2514b = r1
            r0.f2515c = r5
            boolean r0 = r4.mo4042r()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4134c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2262e
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            android.support.v7.widget.au r5 = r4.f2259b
            int r5 = r5.mo3746f()
            goto L_0x002f
        L_0x0025:
            android.support.v7.widget.au r5 = r4.f2259b
            int r5 = r5.mo3746f()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo4041q()
            if (r0 == 0) goto L_0x004d
            android.support.v7.widget.an r0 = r4.f2269l
            android.support.v7.widget.au r3 = r4.f2259b
            int r3 = r3.mo3740c()
            int r3 = r3 - r6
            r0.f2518f = r3
            android.support.v7.widget.an r6 = r4.f2269l
            android.support.v7.widget.au r0 = r4.f2259b
            int r0 = r0.mo3742d()
            int r0 = r0 + r5
            r6.f2519g = r0
            goto L_0x005d
        L_0x004d:
            android.support.v7.widget.an r0 = r4.f2269l
            android.support.v7.widget.au r3 = r4.f2259b
            int r3 = r3.mo3744e()
            int r3 = r3 + r5
            r0.f2519g = r3
            android.support.v7.widget.an r5 = r4.f2269l
            int r6 = -r6
            r5.f2518f = r6
        L_0x005d:
            android.support.v7.widget.an r5 = r4.f2269l
            r5.f2520h = r1
            r5.f2513a = r2
            android.support.v7.widget.au r6 = r4.f2259b
            int r6 = r6.mo3749h()
            if (r6 != 0) goto L_0x0074
            android.support.v7.widget.au r6 = r4.f2259b
            int r6 = r6.mo3744e()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f2521i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.StaggeredGridLayoutManager.m3513b(int, android.support.v7.widget.av$t):void");
    }

    /* renamed from: b */
    private void m3514b(C0787av.C0816o oVar, int i) {
        int u = mo4045u() - 1;
        while (u >= 0) {
            View h = mo4030h(u);
            if (this.f2259b.mo3735a(h) >= i && this.f2259b.mo3743d(h) >= i) {
                C0713b bVar = (C0713b) h.getLayoutParams();
                if (bVar.f2283b) {
                    int i2 = 0;
                    while (i2 < this.f2266i) {
                        if (this.f2258a[i2].f2300a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2266i; i3++) {
                        this.f2258a[i3].mo3348g();
                    }
                } else if (bVar.f2282a.f2300a.size() != 1) {
                    bVar.f2282a.mo3348g();
                } else {
                    return;
                }
                mo3986a(h, oVar);
                u--;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3515b(C0787av.C0816o oVar, C0787av.C0823t tVar, boolean z) {
        int d;
        int q = m3527q(Integer.MIN_VALUE);
        if (q != Integer.MIN_VALUE && (d = this.f2259b.mo3742d() - q) > 0) {
            int i = d - (-mo3283c(-d, oVar, tVar));
            if (z && i > 0) {
                this.f2259b.mo3737a(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3516c(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.f2262e
            if (r0 == 0) goto L_0x0009
            int r0 = r5.mo3274J()
            goto L_0x000d
        L_0x0009:
            int r0 = r5.mo3275K()
        L_0x000d:
            r1 = 8
            if (r8 != r1) goto L_0x001b
            if (r6 >= r7) goto L_0x0016
            int r2 = r7 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L_0x001f
        L_0x001b:
            int r2 = r6 + r7
        L_0x001d:
            r3 = r2
            r2 = r6
        L_0x001f:
            android.support.v7.widget.StaggeredGridLayoutManager$c r4 = r5.f2265h
            r4.mo3309b(r2)
            if (r8 == r1) goto L_0x0036
            switch(r8) {
                case 1: goto L_0x0030;
                case 2: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0041
        L_0x002a:
            android.support.v7.widget.StaggeredGridLayoutManager$c r8 = r5.f2265h
            r8.mo3306a((int) r6, (int) r7)
            goto L_0x0041
        L_0x0030:
            android.support.v7.widget.StaggeredGridLayoutManager$c r8 = r5.f2265h
            r8.mo3310b(r6, r7)
            goto L_0x0041
        L_0x0036:
            android.support.v7.widget.StaggeredGridLayoutManager$c r8 = r5.f2265h
            r1 = 1
            r8.mo3306a((int) r6, (int) r1)
            android.support.v7.widget.StaggeredGridLayoutManager$c r6 = r5.f2265h
            r6.mo3310b(r7, r1)
        L_0x0041:
            if (r3 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r5.f2262e
            if (r6 == 0) goto L_0x004d
            int r6 = r5.mo3275K()
            goto L_0x0051
        L_0x004d:
            int r6 = r5.mo3274J()
        L_0x0051:
            if (r2 > r6) goto L_0x0056
            r5.mo4037n()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.StaggeredGridLayoutManager.m3516c(int, int, int):void");
    }

    /* renamed from: c */
    private void m3517c(C0787av.C0816o oVar, C0787av.C0823t tVar, boolean z) {
        int c;
        int p = m3525p(Integer.MAX_VALUE);
        if (p != Integer.MAX_VALUE && (c = p - this.f2259b.mo3740c()) > 0) {
            int c2 = c - mo3283c(c, oVar, tVar);
            if (z && c2 > 0) {
                this.f2259b.mo3737a(-c2);
            }
        }
    }

    /* renamed from: c */
    private boolean m3518c(C0787av.C0823t tVar, C0712a aVar) {
        aVar.f2275a = this.f2272o ? m3533v(tVar.mo4136e()) : m3532u(tVar.mo4136e());
        aVar.f2276b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: i */
    private int m3519i(C0787av.C0823t tVar) {
        if (mo4045u() == 0) {
            return 0;
        }
        return C0831az.m4553a(tVar, this.f2259b, mo3280b(!this.f2255F), mo3284d(!this.f2255F), this, this.f2255F);
    }

    /* renamed from: j */
    private int m3520j(C0787av.C0823t tVar) {
        if (mo4045u() == 0) {
            return 0;
        }
        return C0831az.m4555b(tVar, this.f2259b, mo3280b(!this.f2255F), mo3284d(!this.f2255F), this, this.f2255F);
    }

    /* renamed from: l */
    private void m3521l(int i) {
        C0766an anVar = this.f2269l;
        anVar.f2517e = i;
        int i2 = 1;
        if (this.f2262e != (i == -1)) {
            i2 = -1;
        }
        anVar.f2516d = i2;
    }

    /* renamed from: m */
    private C0714c.C0715a m3522m(int i) {
        C0714c.C0715a aVar = new C0714c.C0715a();
        aVar.f2288c = new int[this.f2266i];
        for (int i2 = 0; i2 < this.f2266i; i2++) {
            aVar.f2288c[i2] = i - this.f2258a[i2].mo3339b(i);
        }
        return aVar;
    }

    /* renamed from: n */
    private C0714c.C0715a m3523n(int i) {
        C0714c.C0715a aVar = new C0714c.C0715a();
        aVar.f2288c = new int[this.f2266i];
        for (int i2 = 0; i2 < this.f2266i; i2++) {
            aVar.f2288c[i2] = this.f2258a[i2].mo3331a(i) - i;
        }
        return aVar;
    }

    /* renamed from: o */
    private int m3524o(int i) {
        int a = this.f2258a[0].mo3331a(i);
        for (int i2 = 1; i2 < this.f2266i; i2++) {
            int a2 = this.f2258a[i2].mo3331a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: p */
    private int m3525p(int i) {
        int a = this.f2258a[0].mo3331a(i);
        for (int i2 = 1; i2 < this.f2266i; i2++) {
            int a2 = this.f2258a[i2].mo3331a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: p */
    private void m3526p(View view) {
        for (int i = this.f2266i - 1; i >= 0; i--) {
            this.f2258a[i].mo3340b(view);
        }
    }

    /* renamed from: q */
    private int m3527q(int i) {
        int b = this.f2258a[0].mo3339b(i);
        for (int i2 = 1; i2 < this.f2266i; i2++) {
            int b2 = this.f2258a[i2].mo3339b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: q */
    private void m3528q(View view) {
        for (int i = this.f2266i - 1; i >= 0; i--) {
            this.f2258a[i].mo3336a(view);
        }
    }

    /* renamed from: r */
    private int m3529r(int i) {
        int b = this.f2258a[0].mo3339b(i);
        for (int i2 = 1; i2 < this.f2266i; i2++) {
            int b2 = this.f2258a[i2].mo3339b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: s */
    private boolean m3530s(int i) {
        if (this.f2267j == 0) {
            return (i == -1) != this.f2262e;
        }
        return ((i == -1) == this.f2262e) == mo3290i();
    }

    /* renamed from: t */
    private int m3531t(int i) {
        if (mo4045u() == 0) {
            return this.f2262e ? 1 : -1;
        }
        return (i < mo3275K()) != this.f2262e ? -1 : 1;
    }

    /* renamed from: u */
    private int m3532u(int i) {
        int u = mo4045u();
        for (int i2 = 0; i2 < u; i2++) {
            int d = mo4015d(mo4030h(i2));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: v */
    private int m3533v(int i) {
        for (int u = mo4045u() - 1; u >= 0; u--) {
            int d = mo4015d(mo4030h(u));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: w */
    private int m3534w(int i) {
        if (i == 17) {
            return this.f2267j == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f2267j == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f2267j == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i == 130) {
            return this.f2267j == 1 ? 1 : Integer.MIN_VALUE;
        }
        switch (i) {
            case 1:
                return (this.f2267j != 1 && mo3290i()) ? 1 : -1;
            case 2:
                return (this.f2267j != 1 && mo3290i()) ? -1 : 1;
            default:
                return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo3274J() {
        int u = mo4045u();
        if (u == 0) {
            return 0;
        }
        return mo4015d(mo4030h(u - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo3275K() {
        if (mo4045u() == 0) {
            return 0;
        }
        return mo4015d(mo4030h(0));
    }

    /* renamed from: a */
    public int mo3124a(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return mo3283c(i, oVar, tVar);
    }

    /* renamed from: a */
    public int mo3125a(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return this.f2267j == 0 ? this.f2266i : super.mo3125a(oVar, tVar);
    }

    /* renamed from: a */
    public C0787av.C0809i mo3126a() {
        return this.f2267j == 0 ? new C0713b(-2, -1) : new C0713b(-1, -2);
    }

    /* renamed from: a */
    public C0787av.C0809i mo3127a(Context context, AttributeSet attributeSet) {
        return new C0713b(context, attributeSet);
    }

    /* renamed from: a */
    public C0787av.C0809i mo3128a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0713b((ViewGroup.MarginLayoutParams) layoutParams) : new C0713b(layoutParams);
    }

    /* renamed from: a */
    public View mo3130a(View view, int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        View e;
        View a;
        if (mo4045u() == 0 || (e = mo4019e(view)) == null) {
            return null;
        }
        m3497M();
        int w = m3534w(i);
        if (w == Integer.MIN_VALUE) {
            return null;
        }
        C0713b bVar = (C0713b) e.getLayoutParams();
        boolean z = bVar.f2283b;
        C0719e eVar = bVar.f2282a;
        int J = w == 1 ? mo3274J() : mo3275K();
        m3513b(J, tVar);
        m3521l(w);
        C0766an anVar = this.f2269l;
        anVar.f2515c = anVar.f2516d + J;
        this.f2269l.f2514b = (int) (((float) this.f2259b.mo3746f()) * 0.33333334f);
        C0766an anVar2 = this.f2269l;
        anVar2.f2520h = true;
        anVar2.f2513a = false;
        m3499a(oVar, anVar2, tVar);
        this.f2272o = this.f2262e;
        if (!z && (a = eVar.mo3334a(J, w)) != null && a != e) {
            return a;
        }
        if (m3530s(w)) {
            for (int i2 = this.f2266i - 1; i2 >= 0; i2--) {
                View a2 = this.f2258a[i2].mo3334a(J, w);
                if (a2 != null && a2 != e) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2266i; i3++) {
                View a3 = this.f2258a[i3].mo3334a(J, w);
                if (a3 != null && a3 != e) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2261d ^ true) == (w == -1);
        if (!z) {
            View c = mo3172c(z2 ? eVar.mo3351j() : eVar.mo3352k());
            if (!(c == null || c == e)) {
                return c;
            }
        }
        if (m3530s(w)) {
            for (int i4 = this.f2266i - 1; i4 >= 0; i4--) {
                if (i4 != eVar.f2304e) {
                    View c2 = mo3172c(z2 ? this.f2258a[i4].mo3351j() : this.f2258a[i4].mo3352k());
                    if (!(c2 == null || c2 == e)) {
                        return c2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2266i; i5++) {
                View c3 = mo3172c(z2 ? this.f2258a[i5].mo3351j() : this.f2258a[i5].mo3352k());
                if (c3 != null && c3 != e) {
                    return c3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3276a(int i) {
        mo3164a((String) null);
        if (i != this.f2266i) {
            mo3288h();
            this.f2266i = i;
            this.f2270m = new BitSet(this.f2266i);
            this.f2258a = new C0719e[this.f2266i];
            for (int i2 = 0; i2 < this.f2266i; i2++) {
                this.f2258a[i2] = new C0719e(i2);
            }
            mo4037n();
        }
    }

    /* renamed from: a */
    public void mo3159a(int i, int i2, C0787av.C0823t tVar, C0787av.C0804h.C0807a aVar) {
        int i3;
        int i4;
        if (this.f2267j != 0) {
            i = i2;
        }
        if (mo4045u() != 0 && i != 0) {
            mo3277a(i, tVar);
            int[] iArr = this.f2256G;
            if (iArr == null || iArr.length < this.f2266i) {
                this.f2256G = new int[this.f2266i];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2266i; i6++) {
                if (this.f2269l.f2516d == -1) {
                    i4 = this.f2269l.f2518f;
                    i3 = this.f2258a[i6].mo3331a(this.f2269l.f2518f);
                } else {
                    i4 = this.f2258a[i6].mo3339b(this.f2269l.f2519g);
                    i3 = this.f2269l.f2519g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2256G[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2256G, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f2269l.mo3632a(tVar); i8++) {
                aVar.mo3629b(this.f2269l.f2515c, this.f2256G[i8]);
                this.f2269l.f2515c += this.f2269l.f2516d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3277a(int i, C0787av.C0823t tVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo3274J();
            i2 = 1;
        } else {
            i3 = mo3275K();
            i2 = -1;
        }
        this.f2269l.f2513a = true;
        m3513b(i3, tVar);
        m3521l(i2);
        C0766an anVar = this.f2269l;
        anVar.f2515c = i3 + anVar.f2516d;
        this.f2269l.f2514b = Math.abs(i);
    }

    /* renamed from: a */
    public void mo3132a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int z = mo4050z() + mo3964B();
        int A = mo3963A() + mo3965C();
        if (this.f2267j == 1) {
            i4 = m4238a(i2, rect.height() + A, mo3968F());
            i3 = m4238a(i, (this.f2268k * this.f2266i) + z, mo3967E());
        } else {
            i3 = m4238a(i, rect.width() + z, mo3967E());
            i4 = m4238a(i2, (this.f2268k * this.f2266i) + A, mo3968F());
        }
        mo4025f(i3, i4);
    }

    /* renamed from: a */
    public void mo3161a(Parcelable parcelable) {
        if (parcelable instanceof C0717d) {
            this.f2250A = (C0717d) parcelable;
            mo4037n();
        }
    }

    /* renamed from: a */
    public void mo3135a(C0787av.C0816o oVar, C0787av.C0823t tVar, View view, C0328b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0713b)) {
            super.mo3985a(view, bVar);
            return;
        }
        C0713b bVar2 = (C0713b) layoutParams;
        if (this.f2267j == 0) {
            i4 = bVar2.mo3302b();
            i3 = bVar2.f2283b ? this.f2266i : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = bVar2.mo3302b();
            i = bVar2.f2283b ? this.f2266i : 1;
        }
        bVar.mo1424b((Object) C0328b.C0340l.m1514a(i4, i3, i2, i, bVar2.f2283b, false));
    }

    /* renamed from: a */
    public void mo3136a(C0787av.C0823t tVar) {
        super.mo3136a(tVar);
        this.f2263f = -1;
        this.f2264g = Integer.MIN_VALUE;
        this.f2250A = null;
        this.f2253D.mo3297a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3278a(C0787av.C0823t tVar, C0712a aVar) {
        if (!mo3282b(tVar, aVar) && !m3518c(tVar, aVar)) {
            aVar.mo3300b();
            aVar.f2275a = 0;
        }
    }

    /* renamed from: a */
    public void mo3138a(C0787av avVar) {
        this.f2265h.mo3305a();
        mo4037n();
    }

    /* renamed from: a */
    public void mo3139a(C0787av avVar, int i, int i2) {
        m3516c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo3140a(C0787av avVar, int i, int i2, int i3) {
        m3516c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo3141a(C0787av avVar, int i, int i2, Object obj) {
        m3516c(i, i2, 4);
    }

    /* renamed from: a */
    public void mo3162a(C0787av avVar, C0787av.C0816o oVar) {
        mo3999a(this.f2257H);
        for (int i = 0; i < this.f2266i; i++) {
            this.f2258a[i].mo3346e();
        }
        avVar.requestLayout();
    }

    /* renamed from: a */
    public void mo3163a(AccessibilityEvent accessibilityEvent) {
        super.mo3163a(accessibilityEvent);
        if (mo4045u() > 0) {
            View b = mo3280b(false);
            View d = mo3284d(false);
            if (b != null && d != null) {
                int d2 = mo4015d(b);
                int d3 = mo4015d(d);
                if (d2 < d3) {
                    accessibilityEvent.setFromIndex(d2);
                    accessibilityEvent.setToIndex(d3);
                    return;
                }
                accessibilityEvent.setFromIndex(d3);
                accessibilityEvent.setToIndex(d2);
            }
        }
    }

    /* renamed from: a */
    public void mo3164a(String str) {
        if (this.f2250A == null) {
            super.mo3164a(str);
        }
    }

    /* renamed from: a */
    public void mo3279a(boolean z) {
        mo3164a((String) null);
        C0717d dVar = this.f2250A;
        if (!(dVar == null || dVar.f2297h == z)) {
            this.f2250A.f2297h = z;
        }
        this.f2261d = z;
        mo4037n();
    }

    /* renamed from: a */
    public boolean mo3143a(C0787av.C0809i iVar) {
        return iVar instanceof C0713b;
    }

    /* renamed from: b */
    public int mo3144b(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return mo3283c(i, oVar, tVar);
    }

    /* renamed from: b */
    public int mo3145b(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        return this.f2267j == 1 ? this.f2266i : super.mo3145b(oVar, tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3280b(boolean z) {
        int c = this.f2259b.mo3740c();
        int d = this.f2259b.mo3742d();
        int u = mo4045u();
        View view = null;
        for (int i = 0; i < u; i++) {
            View h = mo4030h(i);
            int a = this.f2259b.mo3735a(h);
            if (this.f2259b.mo3739b(h) > c && a < d) {
                if (a >= c || !z) {
                    return h;
                }
                if (view == null) {
                    view = h;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    public void mo3281b(int i) {
        if (i == 0 || i == 1) {
            mo3164a((String) null);
            if (i != this.f2267j) {
                this.f2267j = i;
                C0784au auVar = this.f2259b;
                this.f2259b = this.f2260c;
                this.f2260c = auVar;
                mo4037n();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: b */
    public void mo3146b(C0787av avVar, int i, int i2) {
        m3516c(i, i2, 2);
    }

    /* renamed from: b */
    public boolean mo3147b() {
        return this.f2250A == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3282b(C0787av.C0823t tVar, C0712a aVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!tVar.mo4132a() && (i = this.f2263f) != -1) {
            if (i < 0 || i >= tVar.mo4136e()) {
                this.f2263f = -1;
                this.f2264g = Integer.MIN_VALUE;
            } else {
                C0717d dVar = this.f2250A;
                if (dVar == null || dVar.f2290a == -1 || this.f2250A.f2292c < 1) {
                    View c = mo3172c(this.f2263f);
                    if (c != null) {
                        aVar.f2275a = this.f2262e ? mo3274J() : mo3275K();
                        if (this.f2264g != Integer.MIN_VALUE) {
                            if (aVar.f2277c) {
                                i3 = this.f2259b.mo3742d() - this.f2264g;
                                i2 = this.f2259b.mo3739b(c);
                            } else {
                                i3 = this.f2259b.mo3740c() + this.f2264g;
                                i2 = this.f2259b.mo3735a(c);
                            }
                            aVar.f2276b = i3 - i2;
                            return true;
                        } else if (this.f2259b.mo3745e(c) > this.f2259b.mo3746f()) {
                            aVar.f2276b = aVar.f2277c ? this.f2259b.mo3742d() : this.f2259b.mo3740c();
                            return true;
                        } else {
                            int a = this.f2259b.mo3735a(c) - this.f2259b.mo3740c();
                            if (a < 0) {
                                aVar.f2276b = -a;
                                return true;
                            }
                            int d = this.f2259b.mo3742d() - this.f2259b.mo3739b(c);
                            if (d < 0) {
                                aVar.f2276b = d;
                                return true;
                            }
                            aVar.f2276b = Integer.MIN_VALUE;
                        }
                    } else {
                        aVar.f2275a = this.f2263f;
                        int i4 = this.f2264g;
                        if (i4 == Integer.MIN_VALUE) {
                            if (m3531t(aVar.f2275a) == 1) {
                                z = true;
                            }
                            aVar.f2277c = z;
                            aVar.mo3300b();
                        } else {
                            aVar.mo3298a(i4);
                        }
                        aVar.f2278d = true;
                    }
                } else {
                    aVar.f2276b = Integer.MIN_VALUE;
                    aVar.f2275a = this.f2263f;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3283c(int i, C0787av.C0816o oVar, C0787av.C0823t tVar) {
        if (mo4045u() == 0 || i == 0) {
            return 0;
        }
        mo3277a(i, tVar);
        int a = m3499a(oVar, this.f2269l, tVar);
        if (this.f2269l.f2514b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2259b.mo3737a(-i);
        this.f2272o = this.f2262e;
        C0766an anVar = this.f2269l;
        anVar.f2514b = 0;
        m3505a(oVar, anVar);
        return i;
    }

    /* renamed from: c */
    public int mo3170c(C0787av.C0823t tVar) {
        return m3512b(tVar);
    }

    /* renamed from: c */
    public Parcelable mo3171c() {
        int i;
        int i2;
        C0717d dVar = this.f2250A;
        if (dVar != null) {
            return new C0717d(dVar);
        }
        C0717d dVar2 = new C0717d();
        dVar2.f2297h = this.f2261d;
        dVar2.f2298i = this.f2272o;
        dVar2.f2299j = this.f2273z;
        C0714c cVar = this.f2265h;
        if (cVar == null || cVar.f2284a == null) {
            dVar2.f2294e = 0;
        } else {
            dVar2.f2295f = this.f2265h.f2284a;
            dVar2.f2294e = dVar2.f2295f.length;
            dVar2.f2296g = this.f2265h.f2285b;
        }
        if (mo4045u() > 0) {
            dVar2.f2290a = this.f2272o ? mo3274J() : mo3275K();
            dVar2.f2291b = mo3291j();
            int i3 = this.f2266i;
            dVar2.f2292c = i3;
            dVar2.f2293d = new int[i3];
            for (int i4 = 0; i4 < this.f2266i; i4++) {
                if (this.f2272o) {
                    i = this.f2258a[i4].mo3339b(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2259b.mo3742d();
                    } else {
                        dVar2.f2293d[i4] = i;
                    }
                } else {
                    i = this.f2258a[i4].mo3331a(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2259b.mo3740c();
                    } else {
                        dVar2.f2293d[i4] = i;
                    }
                }
                i -= i2;
                dVar2.f2293d[i4] = i;
            }
        } else {
            dVar2.f2290a = -1;
            dVar2.f2291b = -1;
            dVar2.f2292c = 0;
        }
        return dVar2;
    }

    /* renamed from: c */
    public void mo3148c(C0787av.C0816o oVar, C0787av.C0823t tVar) {
        m3506a(oVar, tVar, true);
    }

    /* renamed from: d */
    public int mo3173d(C0787av.C0823t tVar) {
        return m3512b(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo3284d(boolean z) {
        int c = this.f2259b.mo3740c();
        int d = this.f2259b.mo3742d();
        View view = null;
        for (int u = mo4045u() - 1; u >= 0; u--) {
            View h = mo4030h(u);
            int a = this.f2259b.mo3735a(h);
            int b = this.f2259b.mo3739b(h);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return h;
                }
                if (view == null) {
                    view = h;
                }
            }
        }
        return view;
    }

    /* renamed from: d */
    public void mo3174d(int i) {
        C0717d dVar = this.f2250A;
        if (!(dVar == null || dVar.f2290a == i)) {
            this.f2250A.mo3324b();
        }
        this.f2263f = i;
        this.f2264g = Integer.MIN_VALUE;
        mo4037n();
    }

    /* renamed from: d */
    public boolean mo3175d() {
        return this.f2267j == 0;
    }

    /* renamed from: e */
    public int mo3177e(C0787av.C0823t tVar) {
        return m3519i(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3285e(int i) {
        this.f2268k = i / this.f2266i;
        this.f2251B = View.MeasureSpec.makeMeasureSpec(i, this.f2260c.mo3749h());
    }

    /* renamed from: e */
    public boolean mo3178e() {
        return this.f2267j == 1;
    }

    /* renamed from: f */
    public int mo3180f(C0787av.C0823t tVar) {
        return m3519i(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo3286f() {
        int i;
        int i2;
        if (mo4045u() == 0 || this.f2271n == 0 || !mo4040p()) {
            return false;
        }
        if (this.f2262e) {
            i2 = mo3274J();
            i = mo3275K();
        } else {
            i2 = mo3275K();
            i = mo3274J();
        }
        if (i2 == 0 && mo3287g() != null) {
            this.f2265h.mo3305a();
        } else if (!this.f2254E) {
            return false;
        } else {
            int i3 = this.f2262e ? -1 : 1;
            int i4 = i + 1;
            C0714c.C0715a a = this.f2265h.mo3304a(i2, i4, i3, true);
            if (a == null) {
                this.f2254E = false;
                this.f2265h.mo3303a(i4);
                return false;
            }
            C0714c.C0715a a2 = this.f2265h.mo3304a(i2, a.f2286a, i3 * -1, true);
            if (a2 == null) {
                this.f2265h.mo3303a(a.f2286a);
            } else {
                this.f2265h.mo3303a(a2.f2286a + 1);
            }
        }
        mo3970H();
        mo4037n();
        return true;
    }

    /* renamed from: g */
    public int mo3181g(C0787av.C0823t tVar) {
        return m3520j(tVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3287g() {
        /*
            r12 = this;
            int r0 = r12.mo4045u()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2266i
            r2.<init>(r3)
            int r3 = r12.f2266i
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2267j
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo3290i()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2262e
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4030h((int) r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = (android.support.p020v7.widget.StaggeredGridLayoutManager.C0713b) r8
            android.support.v7.widget.StaggeredGridLayoutManager$e r9 = r8.f2282a
            int r9 = r9.f2304e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            android.support.v7.widget.StaggeredGridLayoutManager$e r9 = r8.f2282a
            boolean r9 = r12.m3510a((android.support.p020v7.widget.StaggeredGridLayoutManager.C0719e) r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            android.support.v7.widget.StaggeredGridLayoutManager$e r9 = r8.f2282a
            int r9 = r9.f2304e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2283b
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4030h((int) r9)
            boolean r10 = r12.f2262e
            if (r10 == 0) goto L_0x0077
            android.support.v7.widget.au r10 = r12.f2259b
            int r10 = r10.mo3739b((android.view.View) r7)
            android.support.v7.widget.au r11 = r12.f2259b
            int r11 = r11.mo3739b((android.view.View) r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            android.support.v7.widget.au r10 = r12.f2259b
            int r10 = r10.mo3735a((android.view.View) r7)
            android.support.v7.widget.au r11 = r12.f2259b
            int r11 = r11.mo3735a((android.view.View) r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = (android.support.p020v7.widget.StaggeredGridLayoutManager.C0713b) r9
            android.support.v7.widget.StaggeredGridLayoutManager$e r8 = r8.f2282a
            int r8 = r8.f2304e
            android.support.v7.widget.StaggeredGridLayoutManager$e r9 = r9.f2282a
            int r9 = r9.f2304e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.StaggeredGridLayoutManager.mo3287g():android.view.View");
    }

    /* renamed from: h */
    public int mo3183h(C0787av.C0823t tVar) {
        return m3520j(tVar);
    }

    /* renamed from: h */
    public void mo3288h() {
        this.f2265h.mo3305a();
        mo4037n();
    }

    /* renamed from: i */
    public void mo3289i(int i) {
        super.mo3289i(i);
        for (int i2 = 0; i2 < this.f2266i; i2++) {
            this.f2258a[i2].mo3345d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo3290i() {
        return mo4043s() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo3291j() {
        View d = this.f2262e ? mo3284d(true) : mo3280b(true);
        if (d == null) {
            return -1;
        }
        return mo4015d(d);
    }

    /* renamed from: j */
    public void mo3292j(int i) {
        super.mo3292j(i);
        for (int i2 = 0; i2 < this.f2266i; i2++) {
            this.f2258a[i2].mo3345d(i);
        }
    }

    /* renamed from: k */
    public void mo3293k(int i) {
        if (i == 0) {
            mo3286f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo3294l() {
        int b = this.f2258a[0].mo3339b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2266i; i++) {
            if (this.f2258a[i].mo3339b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo3295m() {
        int a = this.f2258a[0].mo3331a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2266i; i++) {
            if (this.f2258a[i].mo3331a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }
}
