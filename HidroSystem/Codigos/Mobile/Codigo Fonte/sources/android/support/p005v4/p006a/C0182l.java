package android.support.p005v4.p006a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.p005v4.p016h.C0319m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.l */
public abstract class C0182l<E> extends C0180j {

    /* renamed from: a */
    private final Activity f607a;

    /* renamed from: b */
    final Context f608b;

    /* renamed from: c */
    final int f609c;

    /* renamed from: d */
    final C0186n f610d;

    /* renamed from: e */
    private final Handler f611e;

    /* renamed from: f */
    private C0319m<String, C0219u> f612f;

    /* renamed from: g */
    private boolean f613g;

    /* renamed from: h */
    private C0221v f614h;

    /* renamed from: i */
    private boolean f615i;

    /* renamed from: j */
    private boolean f616j;

    C0182l(Activity activity, Context context, Handler handler, int i) {
        this.f610d = new C0186n();
        this.f607a = activity;
        this.f608b = context;
        this.f611e = handler;
        this.f609c = i;
    }

    C0182l(C0176i iVar) {
        this(iVar, iVar, iVar.f592c, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0221v mo907a(String str, boolean z, boolean z2) {
        if (this.f612f == null) {
            this.f612f = new C0319m<>();
        }
        C0221v vVar = (C0221v) this.f612f.get(str);
        if (vVar == null && z2) {
            C0221v vVar2 = new C0221v(str, this, z);
            this.f612f.put(str, vVar2);
            return vVar2;
        } else if (!z || vVar == null || vVar.f747e) {
            return vVar;
        } else {
            vVar.mo1068b();
            return vVar;
        }
    }

    /* renamed from: a */
    public View mo832a(int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo908a(C0319m<String, C0219u> mVar) {
        if (mVar != null) {
            int size = mVar.size();
            for (int i = 0; i < size; i++) {
                ((C0221v) mVar.mo1376c(i)).mo1066a(this);
            }
        }
        this.f612f = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo909a(String str) {
        C0221v vVar;
        C0319m<String, C0219u> mVar = this.f612f;
        if (mVar != null && (vVar = (C0221v) mVar.get(str)) != null && !vVar.f748f) {
            vVar.mo1074h();
            this.f612f.remove(str);
        }
    }

    /* renamed from: a */
    public void mo867a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo910a(boolean z) {
        this.f613g = z;
        C0221v vVar = this.f614h;
        if (vVar != null && this.f616j) {
            this.f616j = false;
            if (z) {
                vVar.mo1070d();
            } else {
                vVar.mo1069c();
            }
        }
    }

    /* renamed from: a */
    public boolean mo833a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo868a(C0170h hVar) {
        return true;
    }

    /* renamed from: b */
    public LayoutInflater mo869b() {
        return (LayoutInflater) this.f608b.getSystemService("layout_inflater");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo870b(C0170h hVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo911b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f616j);
        if (this.f614h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f614h)));
            printWriter.println(":");
            C0221v vVar = this.f614h;
            vVar.mo1067a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: c */
    public void mo871c() {
    }

    /* renamed from: d */
    public boolean mo872d() {
        return true;
    }

    /* renamed from: e */
    public int mo873e() {
        return this.f609c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo912f() {
        return this.f607a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Context mo913g() {
        return this.f608b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler mo914h() {
        return this.f611e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0186n mo915i() {
        return this.f610d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo916j() {
        return this.f613g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo917k() {
        if (!this.f616j) {
            this.f616j = true;
            C0221v vVar = this.f614h;
            if (vVar == null) {
                if (!this.f615i) {
                    this.f614h = mo907a("(root)", this.f616j, false);
                    C0221v vVar2 = this.f614h;
                    if (vVar2 != null && !vVar2.f747e) {
                        vVar = this.f614h;
                    }
                }
                this.f615i = true;
            }
            vVar.mo1068b();
            this.f615i = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo918l() {
        C0221v vVar = this.f614h;
        if (vVar != null) {
            vVar.mo1074h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo919m() {
        C0319m<String, C0219u> mVar = this.f612f;
        if (mVar != null) {
            int size = mVar.size();
            C0221v[] vVarArr = new C0221v[size];
            for (int i = size - 1; i >= 0; i--) {
                vVarArr[i] = (C0221v) this.f612f.mo1376c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0221v vVar = vVarArr[i2];
                vVar.mo1071e();
                vVar.mo1073g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0319m<String, C0219u> mo920n() {
        C0319m<String, C0219u> mVar = this.f612f;
        int i = 0;
        if (mVar != null) {
            int size = mVar.size();
            C0221v[] vVarArr = new C0221v[size];
            for (int i2 = size - 1; i2 >= 0; i2--) {
                vVarArr[i2] = (C0221v) this.f612f.mo1376c(i2);
            }
            boolean j = mo916j();
            int i3 = 0;
            while (i < size) {
                C0221v vVar = vVarArr[i];
                if (!vVar.f748f && j) {
                    if (!vVar.f747e) {
                        vVar.mo1068b();
                    }
                    vVar.mo1070d();
                }
                if (vVar.f748f) {
                    i3 = 1;
                } else {
                    vVar.mo1074h();
                    this.f612f.remove(vVar.f746d);
                }
                i++;
            }
            i = i3;
        }
        if (i != 0) {
            return this.f612f;
        }
        return null;
    }
}
