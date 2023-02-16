package android.support.p020v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.view.menu.C0669o;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.n */
public class C0667n {

    /* renamed from: a */
    private final Context f1994a;

    /* renamed from: b */
    private final C0653h f1995b;

    /* renamed from: c */
    private final boolean f1996c;

    /* renamed from: d */
    private final int f1997d;

    /* renamed from: e */
    private final int f1998e;

    /* renamed from: f */
    private View f1999f;

    /* renamed from: g */
    private int f2000g;

    /* renamed from: h */
    private boolean f2001h;

    /* renamed from: i */
    private C0669o.C0670a f2002i;

    /* renamed from: j */
    private C0666m f2003j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f2004k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f2005l;

    public C0667n(Context context, C0653h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C0667n(Context context, C0653h hVar, View view, boolean z, int i, int i2) {
        this.f2000g = 8388611;
        this.f2005l = new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                C0667n.this.mo2892e();
            }
        };
        this.f1994a = context;
        this.f1995b = hVar;
        this.f1999f = view;
        this.f1996c = z;
        this.f1997d = i;
        this.f1998e = i2;
    }

    /* renamed from: a */
    private void m3158a(int i, int i2, boolean z, boolean z2) {
        C0666m b = mo2889b();
        b.mo2645c(z2);
        if (z) {
            if ((C0370d.m1575a(this.f2000g, C0388q.m1658e(this.f1999f)) & 7) == 5) {
                i += this.f1999f.getWidth();
            }
            b.mo2642b(i);
            b.mo2644c(i2);
            int i3 = (int) ((this.f1994a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo2879a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo2646d();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.m] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p020v7.view.menu.C0666m m3159g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1994a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1994a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = android.support.p020v7.p021a.C0526a.C0530d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            android.support.v7.view.menu.e r0 = new android.support.v7.view.menu.e
            android.content.Context r2 = r14.f1994a
            android.view.View r3 = r14.f1999f
            int r4 = r14.f1997d
            int r5 = r14.f1998e
            boolean r6 = r14.f1996c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            android.support.v7.view.menu.t r0 = new android.support.v7.view.menu.t
            android.content.Context r8 = r14.f1994a
            android.support.v7.view.menu.h r9 = r14.f1995b
            android.view.View r10 = r14.f1999f
            int r11 = r14.f1997d
            int r12 = r14.f1998e
            boolean r13 = r14.f1996c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            android.support.v7.view.menu.h r1 = r14.f1995b
            r0.mo2639a((android.support.p020v7.view.menu.C0653h) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f2005l
            r0.mo2641a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f1999f
            r0.mo2640a((android.view.View) r1)
            android.support.v7.view.menu.o$a r1 = r14.f2002i
            r0.mo229a((android.support.p020v7.view.menu.C0669o.C0670a) r1)
            boolean r1 = r14.f2001h
            r0.mo2643b((boolean) r1)
            int r1 = r14.f2000g
            r0.mo2638a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.view.menu.C0667n.m3159g():android.support.v7.view.menu.m");
    }

    /* renamed from: a */
    public void mo2882a() {
        if (!mo2890c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo2883a(int i) {
        this.f2000g = i;
    }

    /* renamed from: a */
    public void mo2884a(C0669o.C0670a aVar) {
        this.f2002i = aVar;
        C0666m mVar = this.f2003j;
        if (mVar != null) {
            mVar.mo229a(aVar);
        }
    }

    /* renamed from: a */
    public void mo2885a(View view) {
        this.f1999f = view;
    }

    /* renamed from: a */
    public void mo2886a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2004k = onDismissListener;
    }

    /* renamed from: a */
    public void mo2887a(boolean z) {
        this.f2001h = z;
        C0666m mVar = this.f2003j;
        if (mVar != null) {
            mVar.mo2643b(z);
        }
    }

    /* renamed from: a */
    public boolean mo2888a(int i, int i2) {
        if (mo2893f()) {
            return true;
        }
        if (this.f1999f == null) {
            return false;
        }
        m3158a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0666m mo2889b() {
        if (this.f2003j == null) {
            this.f2003j = m3159g();
        }
        return this.f2003j;
    }

    /* renamed from: c */
    public boolean mo2890c() {
        if (mo2893f()) {
            return true;
        }
        if (this.f1999f == null) {
            return false;
        }
        m3158a(0, 0, false, false);
        return true;
    }

    /* renamed from: d */
    public void mo2891d() {
        if (mo2893f()) {
            this.f2003j.mo2647e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2892e() {
        this.f2003j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2004k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean mo2893f() {
        C0666m mVar = this.f2003j;
        return mVar != null && mVar.mo2648f();
    }
}
