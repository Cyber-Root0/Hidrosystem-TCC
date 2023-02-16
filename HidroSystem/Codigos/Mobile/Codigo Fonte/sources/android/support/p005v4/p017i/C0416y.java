package android.support.p005v4.p017i;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: android.support.v4.i.y */
public class C0416y {

    /* renamed from: a */
    private final Object f1047a;

    private C0416y(Object obj) {
        this.f1047a = obj;
    }

    /* renamed from: a */
    static C0416y m1817a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0416y(obj);
    }

    /* renamed from: a */
    static Object m1818a(C0416y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar.f1047a;
    }

    /* renamed from: a */
    public int mo1647a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1047a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: a */
    public C0416y mo1648a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0416y(((WindowInsets) this.f1047a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo1649b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1047a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo1650c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1047a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo1651d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1047a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo1652e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1047a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0416y yVar = (C0416y) obj;
        Object obj2 = this.f1047a;
        return obj2 == null ? yVar.f1047a == null : obj2.equals(yVar.f1047a);
    }

    /* renamed from: f */
    public boolean mo1654f() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1047a).isConsumed();
        }
        return false;
    }

    /* renamed from: g */
    public C0416y mo1655g() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0416y(((WindowInsets) this.f1047a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f1047a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
