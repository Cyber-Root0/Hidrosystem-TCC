package android.support.p005v4.p017i;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.i.k */
public class C0382k {

    /* renamed from: a */
    private ViewParent f1012a;

    /* renamed from: b */
    private ViewParent f1013b;

    /* renamed from: c */
    private final View f1014c;

    /* renamed from: d */
    private boolean f1015d;

    /* renamed from: e */
    private int[] f1016e;

    public C0382k(View view) {
        this.f1014c = view;
    }

    /* renamed from: a */
    private void m1609a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1012a = viewParent;
                return;
            case 1:
                this.f1013b = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private ViewParent m1610d(int i) {
        switch (i) {
            case 0:
                return this.f1012a;
            case 1:
                return this.f1013b;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void mo1553a(boolean z) {
        if (this.f1015d) {
            C0388q.m1675v(this.f1014c);
        }
        this.f1015d = z;
    }

    /* renamed from: a */
    public boolean mo1554a() {
        return this.f1015d;
    }

    /* renamed from: a */
    public boolean mo1555a(float f, float f2) {
        ViewParent d;
        if (!mo1554a() || (d = m1610d(0)) == null) {
            return false;
        }
        return C0405t.m1778a(d, this.f1014c, f, f2);
    }

    /* renamed from: a */
    public boolean mo1556a(float f, float f2, boolean z) {
        ViewParent d;
        if (!mo1554a() || (d = m1610d(0)) == null) {
            return false;
        }
        return C0405t.m1779a(d, this.f1014c, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo1557a(int i) {
        return m1610d(i) != null;
    }

    /* renamed from: a */
    public boolean mo1558a(int i, int i2) {
        if (mo1557a(i2)) {
            return true;
        }
        if (!mo1554a()) {
            return false;
        }
        View view = this.f1014c;
        for (ViewParent parent = this.f1014c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0405t.m1780a(parent, view, this.f1014c, i, i2)) {
                m1609a(i2, parent);
                C0405t.m1781b(parent, view, this.f1014c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1559a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo1560a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean mo1560a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (!mo1554a() || (d = m1610d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1014c.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        C0405t.m1776a(d, this.f1014c, i, i2, i3, i4, i5);
        if (iArr2 != null) {
            this.f1014c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i6;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo1561a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo1562a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo1562a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!mo1554a() || (d = m1610d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1014c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f1016e == null) {
                this.f1016e = new int[2];
            }
            iArr = this.f1016e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0405t.m1777a(d, this.f1014c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f1014c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean mo1563b() {
        return mo1557a(0);
    }

    /* renamed from: b */
    public boolean mo1564b(int i) {
        return mo1558a(i, 0);
    }

    /* renamed from: c */
    public void mo1565c() {
        mo1566c(0);
    }

    /* renamed from: c */
    public void mo1566c(int i) {
        ViewParent d = m1610d(i);
        if (d != null) {
            C0405t.m1775a(d, this.f1014c, i);
            m1609a(i, (ViewParent) null);
        }
    }
}
