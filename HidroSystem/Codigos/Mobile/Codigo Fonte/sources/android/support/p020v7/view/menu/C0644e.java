package android.support.p020v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.widget.C0779ar;
import android.support.p020v7.widget.C0780as;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C0644e extends C0666m implements C0669o, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    final Handler f1865a;

    /* renamed from: b */
    final List<C0649a> f1866b = new ArrayList();

    /* renamed from: c */
    View f1867c;

    /* renamed from: d */
    boolean f1868d;

    /* renamed from: e */
    private final Context f1869e;

    /* renamed from: f */
    private final int f1870f;

    /* renamed from: g */
    private final int f1871g;

    /* renamed from: h */
    private final int f1872h;

    /* renamed from: i */
    private final boolean f1873i;

    /* renamed from: j */
    private final List<C0653h> f1874j = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1875k = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0644e.this.mo2648f() && C0644e.this.f1866b.size() > 0 && !C0644e.this.f1866b.get(0).f1898a.mo3686c()) {
                View view = C0644e.this.f1867c;
                if (view == null || !view.isShown()) {
                    C0644e.this.mo2647e();
                    return;
                }
                for (C0649a aVar : C0644e.this.f1866b) {
                    aVar.f1898a.mo2646d();
                }
            }
        }
    };

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1876l = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0644e.this.f1889y != null) {
                if (!C0644e.this.f1889y.isAlive()) {
                    ViewTreeObserver unused = C0644e.this.f1889y = view.getViewTreeObserver();
                }
                C0644e.this.f1889y.removeGlobalOnLayoutListener(C0644e.this.f1875k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: m */
    private final C0779ar f1877m = new C0779ar() {
        /* renamed from: a */
        public void mo2656a(C0653h hVar, MenuItem menuItem) {
            C0644e.this.f1865a.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public void mo2657b(final C0653h hVar, final MenuItem menuItem) {
            final C0649a aVar = null;
            C0644e.this.f1865a.removeCallbacksAndMessages((Object) null);
            int size = C0644e.this.f1866b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == C0644e.this.f1866b.get(i).f1899b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0644e.this.f1866b.size()) {
                    aVar = C0644e.this.f1866b.get(i2);
                }
                C0644e.this.f1865a.postAtTime(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C0644e.this.f1868d = true;
                            aVar.f1899b.mo2711b(false);
                            C0644e.this.f1868d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo2697a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: n */
    private int f1878n = 0;

    /* renamed from: o */
    private int f1879o = 0;

    /* renamed from: p */
    private View f1880p;

    /* renamed from: q */
    private int f1881q;

    /* renamed from: r */
    private boolean f1882r;

    /* renamed from: s */
    private boolean f1883s;

    /* renamed from: t */
    private int f1884t;

    /* renamed from: u */
    private int f1885u;

    /* renamed from: v */
    private boolean f1886v;

    /* renamed from: w */
    private boolean f1887w;

    /* renamed from: x */
    private C0669o.C0670a f1888x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ViewTreeObserver f1889y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f1890z;

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C0649a {

        /* renamed from: a */
        public final C0780as f1898a;

        /* renamed from: b */
        public final C0653h f1899b;

        /* renamed from: c */
        public final int f1900c;

        public C0649a(C0780as asVar, C0653h hVar, int i) {
            this.f1898a = asVar;
            this.f1899b = hVar;
            this.f1900c = i;
        }

        /* renamed from: a */
        public ListView mo2659a() {
            return this.f1898a.mo2649g();
        }
    }

    public C0644e(Context context, View view, int i, int i2, boolean z) {
        this.f1869e = context;
        this.f1880p = view;
        this.f1871g = i;
        this.f1872h = i2;
        this.f1873i = z;
        this.f1886v = false;
        this.f1881q = m2985k();
        Resources resources = context.getResources();
        this.f1870f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0526a.C0530d.abc_config_prefDialogWidth));
        this.f1865a = new Handler();
    }

    /* renamed from: a */
    private MenuItem m2976a(C0653h hVar, C0653h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m2977a(C0649a aVar, C0653h hVar) {
        int i;
        C0652g gVar;
        int firstVisiblePosition;
        MenuItem a = m2976a(aVar.f1899b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo2659a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0652g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0652g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private void m2981c(C0653h hVar) {
        View view;
        C0649a aVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1869e);
        C0652g gVar = new C0652g(hVar, from, this.f1873i);
        if (!mo2648f() && this.f1886v) {
            gVar.mo2674a(true);
        } else if (mo2648f()) {
            gVar.mo2674a(C0666m.m3142b(hVar));
        }
        int a = m3140a(gVar, (ViewGroup) null, this.f1869e, this.f1870f);
        C0780as j = m2984j();
        j.mo3679a((ListAdapter) gVar);
        j.mo3690g(a);
        j.mo3688e(this.f1879o);
        if (this.f1866b.size() > 0) {
            List<C0649a> list = this.f1866b;
            aVar = list.get(list.size() - 1);
            view = m2977a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            j.mo3726c(false);
            j.mo3724a((Object) null);
            int d = m2982d(a);
            boolean z = d == 1;
            this.f1881q = d;
            if (Build.VERSION.SDK_INT >= 26) {
                j.mo3683b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1880p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1879o & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                j.mo3685c(i3);
                j.mo3684b(true);
                j.mo3687d(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                j.mo3685c(i3);
                j.mo3684b(true);
                j.mo3687d(i2);
            }
            i3 = i + a;
            j.mo3685c(i3);
            j.mo3684b(true);
            j.mo3687d(i2);
        } else {
            if (this.f1882r) {
                j.mo3685c(this.f1884t);
            }
            if (this.f1883s) {
                j.mo3687d(this.f1885u);
            }
            j.mo3676a(mo2880i());
        }
        this.f1866b.add(new C0649a(j, hVar, this.f1881q));
        j.mo2646d();
        ListView g = j.mo2649g();
        g.setOnKeyListener(this);
        if (aVar == null && this.f1887w && hVar.mo2738m() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0526a.C0533g.abc_popup_menu_header_item_layout, g, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.mo2738m());
            g.addHeaderView(frameLayout, (Object) null, false);
            j.mo2646d();
        }
    }

    /* renamed from: d */
    private int m2982d(int i) {
        List<C0649a> list = this.f1866b;
        ListView a = list.get(list.size() - 1).mo2659a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1867c.getWindowVisibleDisplayFrame(rect);
        return this.f1881q == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private int m2983d(C0653h hVar) {
        int size = this.f1866b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.f1866b.get(i).f1899b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private C0780as m2984j() {
        C0780as asVar = new C0780as(this.f1869e, (AttributeSet) null, this.f1871g, this.f1872h);
        asVar.mo3723a(this.f1877m);
        asVar.mo3678a((AdapterView.OnItemClickListener) this);
        asVar.mo3680a((PopupWindow.OnDismissListener) this);
        asVar.mo3683b(this.f1880p);
        asVar.mo3688e(this.f1879o);
        asVar.mo3681a(true);
        asVar.mo3692h(2);
        return asVar;
    }

    /* renamed from: k */
    private int m2985k() {
        return C0388q.m1658e(this.f1880p) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo2638a(int i) {
        if (this.f1878n != i) {
            this.f1878n = i;
            this.f1879o = C0370d.m1575a(i, C0388q.m1658e(this.f1880p));
        }
    }

    /* renamed from: a */
    public void mo225a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo2639a(C0653h hVar) {
        hVar.mo2693a((C0669o) this, this.f1869e);
        if (mo2648f()) {
            m2981c(hVar);
        } else {
            this.f1874j.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo227a(C0653h hVar, boolean z) {
        int d = m2983d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f1866b.size()) {
                this.f1866b.get(i).f1899b.mo2711b(false);
            }
            C0649a remove = this.f1866b.remove(d);
            remove.f1899b.mo2710b((C0669o) this);
            if (this.f1868d) {
                remove.f1898a.mo3725b((Object) null);
                remove.f1898a.mo3682b(0);
            }
            remove.f1898a.mo2647e();
            int size = this.f1866b.size();
            this.f1881q = size > 0 ? this.f1866b.get(size - 1).f1900c : m2985k();
            if (size == 0) {
                mo2647e();
                C0669o.C0670a aVar = this.f1888x;
                if (aVar != null) {
                    aVar.mo2384a(hVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1889y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1889y.removeGlobalOnLayoutListener(this.f1875k);
                    }
                    this.f1889y = null;
                }
                this.f1867c.removeOnAttachStateChangeListener(this.f1876l);
                this.f1890z.onDismiss();
            } else if (z) {
                this.f1866b.get(0).f1899b.mo2711b(false);
            }
        }
    }

    /* renamed from: a */
    public void mo229a(C0669o.C0670a aVar) {
        this.f1888x = aVar;
    }

    /* renamed from: a */
    public void mo2640a(View view) {
        if (this.f1880p != view) {
            this.f1880p = view;
            this.f1879o = C0370d.m1575a(this.f1878n, C0388q.m1658e(this.f1880p));
        }
    }

    /* renamed from: a */
    public void mo2641a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1890z = onDismissListener;
    }

    /* renamed from: a */
    public void mo231a(boolean z) {
        for (C0649a a : this.f1866b) {
            m3141a(a.mo2659a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo232a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo234a(C0679u uVar) {
        for (C0649a next : this.f1866b) {
            if (uVar == next.f1899b) {
                next.mo2659a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo2639a((C0653h) uVar);
        C0669o.C0670a aVar = this.f1888x;
        if (aVar != null) {
            aVar.mo2385a(uVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo2642b(int i) {
        this.f1882r = true;
        this.f1884t = i;
    }

    /* renamed from: b */
    public void mo2643b(boolean z) {
        this.f1886v = z;
    }

    /* renamed from: c */
    public Parcelable mo240c() {
        return null;
    }

    /* renamed from: c */
    public void mo2644c(int i) {
        this.f1883s = true;
        this.f1885u = i;
    }

    /* renamed from: c */
    public void mo2645c(boolean z) {
        this.f1887w = z;
    }

    /* renamed from: d */
    public void mo2646d() {
        if (!mo2648f()) {
            for (C0653h c : this.f1874j) {
                m2981c(c);
            }
            this.f1874j.clear();
            this.f1867c = this.f1880p;
            if (this.f1867c != null) {
                boolean z = this.f1889y == null;
                this.f1889y = this.f1867c.getViewTreeObserver();
                if (z) {
                    this.f1889y.addOnGlobalLayoutListener(this.f1875k);
                }
                this.f1867c.addOnAttachStateChangeListener(this.f1876l);
            }
        }
    }

    /* renamed from: e */
    public void mo2647e() {
        int size = this.f1866b.size();
        if (size > 0) {
            C0649a[] aVarArr = (C0649a[]) this.f1866b.toArray(new C0649a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0649a aVar = aVarArr[i];
                if (aVar.f1898a.mo2648f()) {
                    aVar.f1898a.mo2647e();
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo2648f() {
        return this.f1866b.size() > 0 && this.f1866b.get(0).f1898a.mo2648f();
    }

    /* renamed from: g */
    public ListView mo2649g() {
        if (this.f1866b.isEmpty()) {
            return null;
        }
        List<C0649a> list = this.f1866b;
        return list.get(list.size() - 1).mo2659a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo2650h() {
        return false;
    }

    public void onDismiss() {
        C0649a aVar;
        int size = this.f1866b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f1866b.get(i);
            if (!aVar.f1898a.mo2648f()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f1899b.mo2711b(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo2647e();
        return true;
    }
}
