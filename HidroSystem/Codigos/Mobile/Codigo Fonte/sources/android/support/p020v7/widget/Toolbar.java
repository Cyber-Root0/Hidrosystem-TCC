package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0374f;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.app.C0550a;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.support.p020v7.view.C0627c;
import android.support.p020v7.view.C0632g;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0679u;
import android.support.p020v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f2306A;

    /* renamed from: B */
    private int f2307B;

    /* renamed from: C */
    private boolean f2308C;

    /* renamed from: D */
    private boolean f2309D;

    /* renamed from: E */
    private final ArrayList<View> f2310E;

    /* renamed from: F */
    private final ArrayList<View> f2311F;

    /* renamed from: G */
    private final int[] f2312G;

    /* renamed from: H */
    private final ActionMenuView.C0691e f2313H;

    /* renamed from: I */
    private C0847bj f2314I;

    /* renamed from: J */
    private C0868d f2315J;

    /* renamed from: K */
    private C0723a f2316K;

    /* renamed from: L */
    private C0669o.C0670a f2317L;

    /* renamed from: M */
    private C0653h.C0654a f2318M;

    /* renamed from: N */
    private boolean f2319N;

    /* renamed from: O */
    private final Runnable f2320O;

    /* renamed from: a */
    ImageButton f2321a;

    /* renamed from: b */
    View f2322b;

    /* renamed from: c */
    int f2323c;

    /* renamed from: d */
    C0725c f2324d;

    /* renamed from: e */
    private ActionMenuView f2325e;

    /* renamed from: f */
    private TextView f2326f;

    /* renamed from: g */
    private TextView f2327g;

    /* renamed from: h */
    private ImageButton f2328h;

    /* renamed from: i */
    private ImageView f2329i;

    /* renamed from: j */
    private Drawable f2330j;

    /* renamed from: k */
    private CharSequence f2331k;

    /* renamed from: l */
    private Context f2332l;

    /* renamed from: m */
    private int f2333m;

    /* renamed from: n */
    private int f2334n;

    /* renamed from: o */
    private int f2335o;

    /* renamed from: p */
    private int f2336p;

    /* renamed from: q */
    private int f2337q;

    /* renamed from: r */
    private int f2338r;

    /* renamed from: s */
    private int f2339s;

    /* renamed from: t */
    private int f2340t;

    /* renamed from: u */
    private C0830ay f2341u;

    /* renamed from: v */
    private int f2342v;

    /* renamed from: w */
    private int f2343w;

    /* renamed from: x */
    private int f2344x;

    /* renamed from: y */
    private CharSequence f2345y;

    /* renamed from: z */
    private CharSequence f2346z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0723a implements C0669o {

        /* renamed from: a */
        C0653h f2350a;

        /* renamed from: b */
        C0657j f2351b;

        C0723a() {
        }

        /* renamed from: a */
        public void mo222a(Context context, C0653h hVar) {
            C0657j jVar;
            C0653h hVar2 = this.f2350a;
            if (!(hVar2 == null || (jVar = this.f2351b) == null)) {
                hVar2.mo2724d(jVar);
            }
            this.f2350a = hVar;
        }

        /* renamed from: a */
        public void mo225a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo227a(C0653h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo229a(C0669o.C0670a aVar) {
        }

        /* renamed from: a */
        public void mo231a(boolean z) {
            if (this.f2351b != null) {
                C0653h hVar = this.f2350a;
                boolean z2 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2350a.getItem(i) == this.f2351b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo239b(this.f2350a, this.f2351b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo232a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo233a(C0653h hVar, C0657j jVar) {
            Toolbar.this.mo3398i();
            ViewParent parent = Toolbar.this.f2321a.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                toolbar.addView(toolbar.f2321a);
            }
            Toolbar.this.f2322b = jVar.getActionView();
            this.f2351b = jVar;
            ViewParent parent2 = Toolbar.this.f2322b.getParent();
            Toolbar toolbar2 = Toolbar.this;
            if (parent2 != toolbar2) {
                C0724b j = toolbar2.generateDefaultLayoutParams();
                j.f1495a = 8388611 | (Toolbar.this.f2323c & 112);
                j.f2353b = 2;
                Toolbar.this.f2322b.setLayoutParams(j);
                Toolbar toolbar3 = Toolbar.this;
                toolbar3.addView(toolbar3.f2322b);
            }
            Toolbar.this.mo3400k();
            Toolbar.this.requestLayout();
            jVar.mo2772e(true);
            if (Toolbar.this.f2322b instanceof C0627c) {
                ((C0627c) Toolbar.this.f2322b).mo2495a();
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo234a(C0679u uVar) {
            return false;
        }

        /* renamed from: b */
        public int mo235b() {
            return 0;
        }

        /* renamed from: b */
        public boolean mo239b(C0653h hVar, C0657j jVar) {
            if (Toolbar.this.f2322b instanceof C0627c) {
                ((C0627c) Toolbar.this.f2322b).mo2496b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2322b);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2321a);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2322b = null;
            toolbar3.mo3401l();
            this.f2351b = null;
            Toolbar.this.requestLayout();
            jVar.mo2772e(false);
            return true;
        }

        /* renamed from: c */
        public Parcelable mo240c() {
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0724b extends C0550a.C0551a {

        /* renamed from: b */
        int f2353b = 0;

        public C0724b(int i, int i2) {
            super(i, i2);
            this.f1495a = 8388627;
        }

        public C0724b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0724b(C0550a.C0551a aVar) {
            super(aVar);
        }

        public C0724b(C0724b bVar) {
            super((C0550a.C0551a) bVar);
            this.f2353b = bVar.f2353b;
        }

        public C0724b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0724b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo3437a(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3437a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0725c {
        /* renamed from: a */
        boolean mo2413a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public static class C0726d extends C0321a {
        public static final Parcelable.Creator<C0726d> CREATOR = new Parcelable.ClassLoaderCreator<C0726d>() {
            /* renamed from: a */
            public C0726d createFromParcel(Parcel parcel) {
                return new C0726d(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0726d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0726d(parcel, classLoader);
            }

            /* renamed from: a */
            public C0726d[] newArray(int i) {
                return new C0726d[i];
            }
        };

        /* renamed from: a */
        int f2354a;

        /* renamed from: b */
        boolean f2355b;

        public C0726d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2354a = parcel.readInt();
            this.f2355b = parcel.readInt() != 0;
        }

        public C0726d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2354a);
            parcel.writeInt(this.f2355b ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2344x = 8388627;
        this.f2310E = new ArrayList<>();
        this.f2311F = new ArrayList<>();
        this.f2312G = new int[2];
        this.f2313H = new ActionMenuView.C0691e() {
            /* renamed from: a */
            public boolean mo3067a(MenuItem menuItem) {
                if (Toolbar.this.f2324d != null) {
                    return Toolbar.this.f2324d.mo2413a(menuItem);
                }
                return false;
            }
        };
        this.f2320O = new Runnable() {
            public void run() {
                Toolbar.this.mo3364d();
            }
        };
        C0846bi a = C0846bi.m4625a(getContext(), attributeSet, C0526a.C0536j.Toolbar, i, 0);
        this.f2334n = a.mo4304g(C0526a.C0536j.Toolbar_titleTextAppearance, 0);
        this.f2335o = a.mo4304g(C0526a.C0536j.Toolbar_subtitleTextAppearance, 0);
        this.f2344x = a.mo4296c(C0526a.C0536j.Toolbar_android_gravity, this.f2344x);
        this.f2323c = a.mo4296c(C0526a.C0536j.Toolbar_buttonGravity, 48);
        int d = a.mo4298d(C0526a.C0536j.Toolbar_titleMargin, 0);
        d = a.mo4305g(C0526a.C0536j.Toolbar_titleMargins) ? a.mo4298d(C0526a.C0536j.Toolbar_titleMargins, d) : d;
        this.f2340t = d;
        this.f2339s = d;
        this.f2338r = d;
        this.f2337q = d;
        int d2 = a.mo4298d(C0526a.C0536j.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f2337q = d2;
        }
        int d3 = a.mo4298d(C0526a.C0536j.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f2338r = d3;
        }
        int d4 = a.mo4298d(C0526a.C0536j.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f2339s = d4;
        }
        int d5 = a.mo4298d(C0526a.C0536j.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f2340t = d5;
        }
        this.f2336p = a.mo4300e(C0526a.C0536j.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo4298d(C0526a.C0536j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo4298d(C0526a.C0536j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo4300e(C0526a.C0536j.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo4300e(C0526a.C0536j.Toolbar_contentInsetRight, 0);
        m3661s();
        this.f2341u.mo4231b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f2341u.mo4228a(d6, d7);
        }
        this.f2342v = a.mo4298d(C0526a.C0536j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2343w = a.mo4298d(C0526a.C0536j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2330j = a.mo4291a(C0526a.C0536j.Toolbar_collapseIcon);
        this.f2331k = a.mo4297c(C0526a.C0536j.Toolbar_collapseContentDescription);
        CharSequence c = a.mo4297c(C0526a.C0536j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo4297c(C0526a.C0536j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f2332l = getContext();
        setPopupTheme(a.mo4304g(C0526a.C0536j.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo4291a(C0526a.C0536j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo4297c(C0526a.C0536j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo4291a(C0526a.C0536j.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo4297c(C0526a.C0536j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo4305g(C0526a.C0536j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo4294b(C0526a.C0536j.Toolbar_titleTextColor, -1));
        }
        if (a.mo4305g(C0526a.C0536j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo4294b(C0526a.C0536j.Toolbar_subtitleTextColor, -1));
        }
        a.mo4292a();
    }

    /* renamed from: a */
    private int m3641a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f2344x & 112;
    }

    /* renamed from: a */
    private int m3642a(View view, int i) {
        C0724b bVar = (C0724b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a = m3641a(bVar.f1495a);
        if (a == 48) {
            return getPaddingTop() - i2;
        }
        if (a == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < bVar.topMargin) {
            i3 = bVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < bVar.bottomMargin) {
                i3 = Math.max(0, i3 - (bVar.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m3643a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m3644a(View view, int i, int[] iArr, int i2) {
        C0724b bVar = (C0724b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m3642a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + bVar.rightMargin;
    }

    /* renamed from: a */
    private int m3645a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = list.get(i5);
            C0724b bVar = (C0724b) view.getLayoutParams();
            int i7 = bVar.leftMargin - i4;
            int i8 = bVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = max4;
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private void m3646a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m3647a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0724b j = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0724b) layoutParams;
        j.f2353b = 1;
        if (!z || this.f2322b == null) {
            addView(view, j);
            return;
        }
        view.setLayoutParams(j);
        this.f2311F.add(view);
    }

    /* renamed from: a */
    private void m3648a(List<View> list, int i) {
        boolean z = C0388q.m1658e(this) == 1;
        int childCount = getChildCount();
        int a = C0370d.m1575a(i, C0388q.m1658e(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0724b bVar = (C0724b) childAt.getLayoutParams();
                if (bVar.f2353b == 0 && m3649a(childAt) && m3650b(bVar.f1495a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0724b bVar2 = (C0724b) childAt2.getLayoutParams();
            if (bVar2.f2353b == 0 && m3649a(childAt2) && m3650b(bVar2.f1495a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private boolean m3649a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m3650b(int i) {
        int e = C0388q.m1658e(this);
        int a = C0370d.m1575a(i, e) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : e == 1 ? 5 : 3;
    }

    /* renamed from: b */
    private int m3651b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0374f.m1581a(marginLayoutParams) + C0374f.m1582b(marginLayoutParams);
    }

    /* renamed from: b */
    private int m3652b(View view, int i, int[] iArr, int i2) {
        C0724b bVar = (C0724b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m3642a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* renamed from: c */
    private int m3653c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: d */
    private boolean m3654d(View view) {
        return view.getParent() == this || this.f2311F.contains(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0632g(getContext());
    }

    /* renamed from: m */
    private void m3655m() {
        if (this.f2329i == null) {
            this.f2329i = new C0901q(getContext());
        }
    }

    /* renamed from: n */
    private void m3656n() {
        m3657o();
        if (this.f2325e.mo3043d() == null) {
            C0653h hVar = (C0653h) this.f2325e.getMenu();
            if (this.f2316K == null) {
                this.f2316K = new C0723a();
            }
            this.f2325e.setExpandedActionViewsExclusive(true);
            hVar.mo2693a((C0669o) this.f2316K, this.f2332l);
        }
    }

    /* renamed from: o */
    private void m3657o() {
        if (this.f2325e == null) {
            this.f2325e = new ActionMenuView(getContext());
            this.f2325e.setPopupTheme(this.f2333m);
            this.f2325e.setOnMenuItemClickListener(this.f2313H);
            this.f2325e.mo3035a(this.f2317L, this.f2318M);
            C0724b j = generateDefaultLayoutParams();
            j.f1495a = 8388613 | (this.f2323c & 112);
            this.f2325e.setLayoutParams(j);
            m3647a((View) this.f2325e, false);
        }
    }

    /* renamed from: p */
    private void m3658p() {
        if (this.f2328h == null) {
            this.f2328h = new C0899o(getContext(), (AttributeSet) null, C0526a.C0527a.toolbarNavigationButtonStyle);
            C0724b j = generateDefaultLayoutParams();
            j.f1495a = 8388611 | (this.f2323c & 112);
            this.f2328h.setLayoutParams(j);
        }
    }

    /* renamed from: q */
    private void m3659q() {
        removeCallbacks(this.f2320O);
        post(this.f2320O);
    }

    /* renamed from: r */
    private boolean m3660r() {
        if (!this.f2319N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m3649a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m3661s() {
        if (this.f2341u == null) {
            this.f2341u = new C0830ay();
        }
    }

    /* renamed from: a */
    public C0724b generateLayoutParams(AttributeSet attributeSet) {
        return new C0724b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0724b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0724b ? new C0724b((C0724b) layoutParams) : layoutParams instanceof C0550a.C0551a ? new C0724b((C0550a.C0551a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0724b((ViewGroup.MarginLayoutParams) layoutParams) : new C0724b(layoutParams);
    }

    /* renamed from: a */
    public void mo3355a(int i, int i2) {
        m3661s();
        this.f2341u.mo4228a(i, i2);
    }

    /* renamed from: a */
    public void mo3356a(Context context, int i) {
        this.f2334n = i;
        TextView textView = this.f2326f;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo3357a(C0653h hVar, C0868d dVar) {
        if (hVar != null || this.f2325e != null) {
            m3657o();
            C0653h d = this.f2325e.mo3043d();
            if (d != hVar) {
                if (d != null) {
                    d.mo2710b((C0669o) this.f2315J);
                    d.mo2710b((C0669o) this.f2316K);
                }
                if (this.f2316K == null) {
                    this.f2316K = new C0723a();
                }
                dVar.mo4353d(true);
                if (hVar != null) {
                    hVar.mo2693a((C0669o) dVar, this.f2332l);
                    hVar.mo2693a((C0669o) this.f2316K, this.f2332l);
                } else {
                    dVar.mo222a(this.f2332l, (C0653h) null);
                    this.f2316K.mo222a(this.f2332l, (C0653h) null);
                    dVar.mo231a(true);
                    this.f2316K.mo231a(true);
                }
                this.f2325e.setPopupTheme(this.f2333m);
                this.f2325e.setPresenter(dVar);
                this.f2315J = dVar;
            }
        }
    }

    /* renamed from: a */
    public void mo3358a(C0669o.C0670a aVar, C0653h.C0654a aVar2) {
        this.f2317L = aVar;
        this.f2318M = aVar2;
        ActionMenuView actionMenuView = this.f2325e;
        if (actionMenuView != null) {
            actionMenuView.mo3035a(aVar, aVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2325e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3359a() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            android.support.v7.widget.ActionMenuView r0 = r1.f2325e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo3036a()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.Toolbar.mo3359a():boolean");
    }

    /* renamed from: b */
    public void mo3360b(Context context, int i) {
        this.f2335o = i;
        TextView textView = this.f2327g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean mo3361b() {
        ActionMenuView actionMenuView = this.f2325e;
        return actionMenuView != null && actionMenuView.mo3047g();
    }

    /* renamed from: c */
    public boolean mo3362c() {
        ActionMenuView actionMenuView = this.f2325e;
        return actionMenuView != null && actionMenuView.mo3055h();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0724b);
    }

    /* renamed from: d */
    public boolean mo3364d() {
        ActionMenuView actionMenuView = this.f2325e;
        return actionMenuView != null && actionMenuView.mo3045e();
    }

    /* renamed from: e */
    public boolean mo3365e() {
        ActionMenuView actionMenuView = this.f2325e;
        return actionMenuView != null && actionMenuView.mo3046f();
    }

    /* renamed from: f */
    public void mo3366f() {
        ActionMenuView actionMenuView = this.f2325e;
        if (actionMenuView != null) {
            actionMenuView.mo3056i();
        }
    }

    /* renamed from: g */
    public boolean mo3367g() {
        C0723a aVar = this.f2316K;
        return (aVar == null || aVar.f2351b == null) ? false : true;
    }

    public int getContentInsetEnd() {
        C0830ay ayVar = this.f2341u;
        if (ayVar != null) {
            return ayVar.mo4233d();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2343w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0830ay ayVar = this.f2341u;
        if (ayVar != null) {
            return ayVar.mo4227a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0830ay ayVar = this.f2341u;
        if (ayVar != null) {
            return ayVar.mo4230b();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0830ay ayVar = this.f2341u;
        if (ayVar != null) {
            return ayVar.mo4232c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2342v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo3043d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f2325e
            r1 = 0
            if (r0 == 0) goto L_0x0013
            android.support.v7.view.menu.h r0 = r0.mo3043d()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f2343w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0388q.m1658e(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0388q.m1658e(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2342v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2329i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2329i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m3656n();
        return this.f2325e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2328h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2328h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0868d getOuterActionMenuPresenter() {
        return this.f2315J;
    }

    public Drawable getOverflowIcon() {
        m3656n();
        return this.f2325e.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f2332l;
    }

    public int getPopupTheme() {
        return this.f2333m;
    }

    public CharSequence getSubtitle() {
        return this.f2346z;
    }

    public CharSequence getTitle() {
        return this.f2345y;
    }

    public int getTitleMarginBottom() {
        return this.f2340t;
    }

    public int getTitleMarginEnd() {
        return this.f2338r;
    }

    public int getTitleMarginStart() {
        return this.f2337q;
    }

    public int getTitleMarginTop() {
        return this.f2339s;
    }

    public C0738af getWrapper() {
        if (this.f2314I == null) {
            this.f2314I = new C0847bj(this, true);
        }
        return this.f2314I;
    }

    /* renamed from: h */
    public void mo3397h() {
        C0723a aVar = this.f2316K;
        C0657j jVar = aVar == null ? null : aVar.f2351b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3398i() {
        if (this.f2321a == null) {
            this.f2321a = new C0899o(getContext(), (AttributeSet) null, C0526a.C0527a.toolbarNavigationButtonStyle);
            this.f2321a.setImageDrawable(this.f2330j);
            this.f2321a.setContentDescription(this.f2331k);
            C0724b j = generateDefaultLayoutParams();
            j.f1495a = 8388611 | (this.f2323c & 112);
            j.f2353b = 2;
            this.f2321a.setLayoutParams(j);
            this.f2321a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.mo3397h();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0724b generateDefaultLayoutParams() {
        return new C0724b(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3400k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0724b) childAt.getLayoutParams()).f2353b == 2 || childAt == this.f2325e)) {
                removeViewAt(childCount);
                this.f2311F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3401l() {
        for (int size = this.f2311F.size() - 1; size >= 0; size--) {
            addView(this.f2311F.get(size));
        }
        this.f2311F.clear();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2320O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2309D = false;
        }
        if (!this.f2309D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2309D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2309D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a5 A[LOOP:0: B:101:0x02a3->B:102:0x02a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c7 A[LOOP:1: B:104:0x02c5->B:105:0x02c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0301 A[LOOP:2: B:112:0x02ff->B:113:0x0301, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = android.support.p005v4.p017i.C0388q.m1658e(r18)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f2312G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = android.support.p005v4.p017i.C0388q.m1663j(r18)
            if (r12 < 0) goto L_0x003a
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f2328h
            boolean r13 = r0.m3649a((android.view.View) r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f2328h
            int r13 = r0.m3652b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f2328h
            int r13 = r0.m3644a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f2321a
            boolean r15 = r0.m3649a((android.view.View) r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f2321a
            int r14 = r0.m3652b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f2321a
            int r13 = r0.m3644a(r15, r13, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f2325e
            boolean r15 = r0.m3649a((android.view.View) r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f2325e
            int r13 = r0.m3644a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f2325e
            int r14 = r0.m3652b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r18.getCurrentContentInsetLeft()
            int r16 = r18.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f2322b
            boolean r13 = r0.m3649a((android.view.View) r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f2322b
            int r10 = r0.m3652b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f2322b
            int r2 = r0.m3644a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f2329i
            boolean r13 = r0.m3649a((android.view.View) r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f2329i
            int r10 = r0.m3652b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f2329i
            int r2 = r0.m3644a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f2326f
            boolean r13 = r0.m3649a((android.view.View) r13)
            android.widget.TextView r14 = r0.f2327g
            boolean r14 = r0.m3649a((android.view.View) r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f2326f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$b r15 = (android.support.p020v7.widget.Toolbar.C0724b) r15
            int r3 = r15.topMargin
            r22 = r7
            android.widget.TextView r7 = r0.f2326f
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r22 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f2327g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p020v7.widget.Toolbar.C0724b) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f2327g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r17 = r6
            r21 = r12
        L_0x0128:
            r7 = 0
            goto L_0x0295
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f2326f
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f2327g
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f2327g
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f2326f
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$b r4 = (android.support.p020v7.widget.Toolbar.C0724b) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p020v7.widget.Toolbar.C0724b) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f2326f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f2327g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f2344x
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a9
            r12 = 80
            if (r6 == r12) goto L_0x019d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.f2339s
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0184
            int r2 = r4.topMargin
            int r3 = r0.f2339s
            int r6 = r2 + r3
            goto L_0x019b
        L_0x0184:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f2340t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x019b
            int r2 = r7.bottomMargin
            int r3 = r0.f2340t
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x019b:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x019d:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f2340t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b6
        L_0x01a9:
            r23 = r2
            int r2 = r18.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f2339s
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x022b
            if (r15 == 0) goto L_0x01be
            int r3 = r0.f2337q
            r1 = 1
            goto L_0x01c0
        L_0x01be:
            r1 = 1
            r3 = 0
        L_0x01c0:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f6
            android.widget.TextView r1 = r0.f2326f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p020v7.widget.Toolbar.C0724b) r1
            android.widget.TextView r2 = r0.f2326f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f2326f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f2326f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f2338r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f7
        L_0x01f6:
            r2 = r10
        L_0x01f7:
            if (r14 == 0) goto L_0x021f
            android.widget.TextView r1 = r0.f2327g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p020v7.widget.Toolbar.C0724b) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f2327g
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f2327g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f2327g
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f2338r
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0220
        L_0x021f:
            r3 = r10
        L_0x0220:
            if (r15 == 0) goto L_0x0227
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0227:
            r2 = r23
            goto L_0x0128
        L_0x022b:
            if (r15 == 0) goto L_0x0230
            int r3 = r0.f2337q
            goto L_0x0231
        L_0x0230:
            r3 = 0
        L_0x0231:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r23 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x0267
            android.widget.TextView r1 = r0.f2326f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p020v7.widget.Toolbar.C0724b) r1
            android.widget.TextView r3 = r0.f2326f
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f2326f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f2326f
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f2338r
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0268
        L_0x0267:
            r3 = r2
        L_0x0268:
            if (r14 == 0) goto L_0x028e
            android.widget.TextView r1 = r0.f2327g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p020v7.widget.Toolbar.C0724b) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f2327g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f2327g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f2327g
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f2338r
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x028f
        L_0x028e:
            r4 = r2
        L_0x028f:
            if (r15 == 0) goto L_0x0295
            int r2 = java.lang.Math.max(r3, r4)
        L_0x0295:
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            r3 = 3
            r0.m3648a((java.util.List<android.view.View>) r1, (int) r3)
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a3:
            if (r2 >= r1) goto L_0x02b6
            java.util.ArrayList<android.view.View> r4 = r0.f2310E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r21
            int r3 = r0.m3644a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a3
        L_0x02b6:
            r12 = r21
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            r2 = 5
            r0.m3648a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            int r1 = r1.size()
            r2 = 0
        L_0x02c5:
            if (r2 >= r1) goto L_0x02d6
            java.util.ArrayList<android.view.View> r4 = r0.f2310E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m3652b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c5
        L_0x02d6:
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            r2 = 1
            r0.m3648a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            int r1 = r0.m3645a((java.util.List<android.view.View>) r1, (int[]) r11)
            int r4 = r16 - r17
            int r4 = r4 - r22
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f2
            goto L_0x02f9
        L_0x02f2:
            if (r1 <= r10) goto L_0x02f8
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02f9
        L_0x02f8:
            r3 = r2
        L_0x02f9:
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            int r1 = r1.size()
        L_0x02ff:
            if (r7 >= r1) goto L_0x0310
            java.util.ArrayList<android.view.View> r2 = r0.f2310E
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m3644a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x02ff
        L_0x0310:
            java.util.ArrayList<android.view.View> r1 = r0.f2310E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f2312G;
        if (C0866bq.m4743a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m3649a((View) this.f2328h)) {
            m3646a((View) this.f2328h, i, 0, i2, 0, this.f2336p);
            i5 = this.f2328h.getMeasuredWidth() + m3651b((View) this.f2328h);
            i4 = Math.max(0, this.f2328h.getMeasuredHeight() + m3653c(this.f2328h));
            i3 = View.combineMeasuredStates(0, this.f2328h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m3649a((View) this.f2321a)) {
            m3646a((View) this.f2321a, i, 0, i2, 0, this.f2336p);
            i5 = this.f2321a.getMeasuredWidth() + m3651b((View) this.f2321a);
            i4 = Math.max(i4, this.f2321a.getMeasuredHeight() + m3653c(this.f2321a));
            i3 = View.combineMeasuredStates(i3, this.f2321a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m3649a((View) this.f2325e)) {
            m3646a((View) this.f2325e, i, max, i2, 0, this.f2336p);
            i6 = this.f2325e.getMeasuredWidth() + m3651b((View) this.f2325e);
            i4 = Math.max(i4, this.f2325e.getMeasuredHeight() + m3653c(this.f2325e));
            i3 = View.combineMeasuredStates(i3, this.f2325e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m3649a(this.f2322b)) {
            max2 += m3643a(this.f2322b, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2322b.getMeasuredHeight() + m3653c(this.f2322b));
            i3 = View.combineMeasuredStates(i3, this.f2322b.getMeasuredState());
        }
        if (m3649a((View) this.f2329i)) {
            max2 += m3643a((View) this.f2329i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2329i.getMeasuredHeight() + m3653c(this.f2329i));
            i3 = View.combineMeasuredStates(i3, this.f2329i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0724b) childAt.getLayoutParams()).f2353b == 0 && m3649a(childAt)) {
                i11 += m3643a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m3653c(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f2339s + this.f2340t;
        int i14 = this.f2337q + this.f2338r;
        if (m3649a((View) this.f2326f)) {
            m3643a((View) this.f2326f, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f2326f.getMeasuredWidth() + m3651b((View) this.f2326f);
            i7 = this.f2326f.getMeasuredHeight() + m3653c(this.f2326f);
            i9 = View.combineMeasuredStates(i3, this.f2326f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m3649a((View) this.f2327g)) {
            int i15 = i7 + i13;
            i8 = Math.max(i8, m3643a((View) this.f2327g, i, i11 + i14, i2, i15, iArr));
            i7 += this.f2327g.getMeasuredHeight() + m3653c(this.f2327g);
            i9 = View.combineMeasuredStates(i9, this.f2327g.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int max3 = Math.max(i10, i7);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m3660r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0726d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0726d dVar = (C0726d) parcelable;
        super.onRestoreInstanceState(dVar.mo1402a());
        ActionMenuView actionMenuView = this.f2325e;
        C0653h d = actionMenuView != null ? actionMenuView.mo3043d() : null;
        if (!(dVar.f2354a == 0 || this.f2316K == null || d == null || (findItem = d.findItem(dVar.f2354a)) == null)) {
            findItem.expandActionView();
        }
        if (dVar.f2355b) {
            m3659q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m3661s();
        C0830ay ayVar = this.f2341u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        ayVar.mo4229a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0726d dVar = new C0726d(super.onSaveInstanceState());
        C0723a aVar = this.f2316K;
        if (!(aVar == null || aVar.f2351b == null)) {
            dVar.f2354a = this.f2316K.f2351b.getItemId();
        }
        dVar.f2355b = mo3361b();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2308C = false;
        }
        if (!this.f2308C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2308C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2308C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f2319N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2343w) {
            this.f2343w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2342v) {
            this.f2342v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0616b.m2831b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m3655m();
            if (!m3654d(this.f2329i)) {
                m3647a((View) this.f2329i, true);
            }
        } else {
            ImageView imageView = this.f2329i;
            if (imageView != null && m3654d(imageView)) {
                removeView(this.f2329i);
                this.f2311F.remove(this.f2329i);
            }
        }
        ImageView imageView2 = this.f2329i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3655m();
        }
        ImageView imageView = this.f2329i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3658p();
        }
        ImageButton imageButton = this.f2328h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0616b.m2831b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3658p();
            if (!m3654d(this.f2328h)) {
                m3647a((View) this.f2328h, true);
            }
        } else {
            ImageButton imageButton = this.f2328h;
            if (imageButton != null && m3654d(imageButton)) {
                removeView(this.f2328h);
                this.f2311F.remove(this.f2328h);
            }
        }
        ImageButton imageButton2 = this.f2328h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m3658p();
        this.f2328h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0725c cVar) {
        this.f2324d = cVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m3656n();
        this.f2325e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2333m != i) {
            this.f2333m = i;
            if (i == 0) {
                this.f2332l = getContext();
            } else {
                this.f2332l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2327g == null) {
                Context context = getContext();
                this.f2327g = new C0732ab(context);
                this.f2327g.setSingleLine();
                this.f2327g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2335o;
                if (i != 0) {
                    this.f2327g.setTextAppearance(context, i);
                }
                int i2 = this.f2307B;
                if (i2 != 0) {
                    this.f2327g.setTextColor(i2);
                }
            }
            if (!m3654d(this.f2327g)) {
                m3647a((View) this.f2327g, true);
            }
        } else {
            TextView textView = this.f2327g;
            if (textView != null && m3654d(textView)) {
                removeView(this.f2327g);
                this.f2311F.remove(this.f2327g);
            }
        }
        TextView textView2 = this.f2327g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2346z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f2307B = i;
        TextView textView = this.f2327g;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2326f == null) {
                Context context = getContext();
                this.f2326f = new C0732ab(context);
                this.f2326f.setSingleLine();
                this.f2326f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2334n;
                if (i != 0) {
                    this.f2326f.setTextAppearance(context, i);
                }
                int i2 = this.f2306A;
                if (i2 != 0) {
                    this.f2326f.setTextColor(i2);
                }
            }
            if (!m3654d(this.f2326f)) {
                m3647a((View) this.f2326f, true);
            }
        } else {
            TextView textView = this.f2326f;
            if (textView != null && m3654d(textView)) {
                removeView(this.f2326f);
                this.f2311F.remove(this.f2326f);
            }
        }
        TextView textView2 = this.f2326f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2345y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f2340t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2338r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2337q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2339s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f2306A = i;
        TextView textView = this.f2326f;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
