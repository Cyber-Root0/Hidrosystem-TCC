package android.support.p005v4.p016h;

/* renamed from: android.support.v4.h.j */
public class C0313j<F, S> {

    /* renamed from: a */
    public final F f927a;

    /* renamed from: b */
    public final S f928b;

    /* renamed from: a */
    private static boolean m1382a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0313j)) {
            return false;
        }
        C0313j jVar = (C0313j) obj;
        return m1382a(jVar.f927a, this.f927a) && m1382a(jVar.f928b, this.f928b);
    }

    public int hashCode() {
        F f = this.f927a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f928b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f927a) + " " + String.valueOf(this.f928b) + "}";
    }
}
