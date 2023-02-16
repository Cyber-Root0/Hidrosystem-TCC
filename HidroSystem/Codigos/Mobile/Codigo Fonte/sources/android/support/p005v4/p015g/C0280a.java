package android.support.p005v4.p015g;

import android.support.p005v4.p016h.C0318l;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.g.a */
public final class C0280a {

    /* renamed from: a */
    private final String f832a;

    /* renamed from: b */
    private final String f833b;

    /* renamed from: c */
    private final String f834c;

    /* renamed from: d */
    private final List<List<byte[]>> f835d;

    /* renamed from: e */
    private final int f836e = 0;

    /* renamed from: f */
    private final String f837f = (this.f832a + "-" + this.f833b + "-" + this.f834c);

    public C0280a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f832a = (String) C0318l.m1390a(str);
        this.f833b = (String) C0318l.m1390a(str2);
        this.f834c = (String) C0318l.m1390a(str3);
        this.f835d = (List) C0318l.m1390a(list);
    }

    /* renamed from: a */
    public String mo1218a() {
        return this.f832a;
    }

    /* renamed from: b */
    public String mo1219b() {
        return this.f833b;
    }

    /* renamed from: c */
    public String mo1220c() {
        return this.f834c;
    }

    /* renamed from: d */
    public List<List<byte[]>> mo1221d() {
        return this.f835d;
    }

    /* renamed from: e */
    public int mo1222e() {
        return this.f836e;
    }

    /* renamed from: f */
    public String mo1223f() {
        return this.f837f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f832a + ", mProviderPackage: " + this.f833b + ", mQuery: " + this.f834c + ", mCertificates:");
        for (int i = 0; i < this.f835d.size(); i++) {
            sb.append(" [");
            List list = this.f835d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f836e);
        return sb.toString();
    }
}
