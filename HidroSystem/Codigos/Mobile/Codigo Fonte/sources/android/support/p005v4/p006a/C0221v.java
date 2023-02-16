package android.support.p005v4.p006a;

import android.os.Bundle;
import android.support.p005v4.p006a.C0219u;
import android.support.p005v4.p007b.C0235b;
import android.support.p005v4.p016h.C0299d;
import android.support.p005v4.p016h.C0320n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.a.v */
class C0221v extends C0219u {

    /* renamed from: a */
    static boolean f743a;

    /* renamed from: b */
    final C0320n<C0222a> f744b = new C0320n<>();

    /* renamed from: c */
    final C0320n<C0222a> f745c = new C0320n<>();

    /* renamed from: d */
    final String f746d;

    /* renamed from: e */
    boolean f747e;

    /* renamed from: f */
    boolean f748f;

    /* renamed from: g */
    C0182l f749g;

    /* renamed from: android.support.v4.a.v$a */
    final class C0222a implements C0235b.C0236a<Object>, C0235b.C0237b<Object> {

        /* renamed from: a */
        final int f750a;

        /* renamed from: b */
        final Bundle f751b;

        /* renamed from: c */
        C0219u.C0220a<Object> f752c;

        /* renamed from: d */
        C0235b<Object> f753d;

        /* renamed from: e */
        boolean f754e;

        /* renamed from: f */
        boolean f755f;

        /* renamed from: g */
        Object f756g;

        /* renamed from: h */
        boolean f757h;

        /* renamed from: i */
        boolean f758i;

        /* renamed from: j */
        boolean f759j;

        /* renamed from: k */
        boolean f760k;

        /* renamed from: l */
        boolean f761l;

        /* renamed from: m */
        boolean f762m;

        /* renamed from: n */
        C0222a f763n;

        /* renamed from: o */
        final /* synthetic */ C0221v f764o;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1076a() {
            C0219u.C0220a<Object> aVar;
            if (this.f758i && this.f759j) {
                this.f757h = true;
            } else if (!this.f757h) {
                this.f757h = true;
                if (C0221v.f743a) {
                    Log.v("LoaderManager", "  Starting: " + this);
                }
                if (this.f753d == null && (aVar = this.f752c) != null) {
                    this.f753d = aVar.mo1063a(this.f750a, this.f751b);
                }
                C0235b<Object> bVar = this.f753d;
                if (bVar == null) {
                    return;
                }
                if (!bVar.getClass().isMemberClass() || Modifier.isStatic(this.f753d.getClass().getModifiers())) {
                    if (!this.f762m) {
                        this.f753d.mo1102a(this.f750a, this);
                        this.f753d.mo1103a(this);
                        this.f762m = true;
                    }
                    this.f753d.mo1101a();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f753d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1077a(C0235b<Object> bVar, Object obj) {
            if (this.f752c != null) {
                String str = null;
                if (this.f764o.f749g != null) {
                    str = this.f764o.f749g.f610d.f646u;
                    this.f764o.f749g.f610d.f646u = "onLoadFinished";
                }
                try {
                    if (C0221v.f743a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + bVar + ": " + bVar.mo1100a(obj));
                    }
                    this.f752c.mo1065a(bVar, obj);
                    this.f755f = true;
                } finally {
                    if (this.f764o.f749g != null) {
                        this.f764o.f749g.f610d.f646u = str;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo1078a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f750a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f751b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f752c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f753d);
            C0235b<Object> bVar = this.f753d;
            if (bVar != null) {
                bVar.mo1105a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f754e || this.f755f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f754e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f755f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f756g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f757h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f760k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f761l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f758i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f759j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f762m);
            if (this.f763n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f763n);
                printWriter.println(":");
                C0222a aVar = this.f763n;
                aVar.mo1078a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1079b() {
            if (C0221v.f743a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.f758i = true;
            this.f759j = this.f757h;
            this.f757h = false;
            this.f752c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1080c() {
            if (this.f758i) {
                if (C0221v.f743a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.f758i = false;
                boolean z = this.f757h;
                if (z != this.f759j && !z) {
                    mo1082e();
                }
            }
            if (this.f757h && this.f754e && !this.f760k) {
                mo1077a(this.f753d, this.f756g);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1081d() {
            if (this.f757h && this.f760k) {
                this.f760k = false;
                if (this.f754e && !this.f758i) {
                    mo1077a(this.f753d, this.f756g);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo1082e() {
            C0235b<Object> bVar;
            if (C0221v.f743a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f757h = false;
            if (!this.f758i && (bVar = this.f753d) != null && this.f762m) {
                this.f762m = false;
                bVar.mo1104a((C0235b.C0237b<Object>) this);
                this.f753d.mo1107b(this);
                this.f753d.mo1108c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo1083f() {
            String str;
            if (C0221v.f743a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f761l = true;
            boolean z = this.f755f;
            this.f755f = false;
            if (this.f752c != null && this.f753d != null && this.f754e && z) {
                if (C0221v.f743a) {
                    Log.v("LoaderManager", "  Resetting: " + this);
                }
                if (this.f764o.f749g != null) {
                    str = this.f764o.f749g.f610d.f646u;
                    this.f764o.f749g.f610d.f646u = "onLoaderReset";
                } else {
                    str = null;
                }
                try {
                    this.f752c.mo1064a(this.f753d);
                } finally {
                    if (this.f764o.f749g != null) {
                        this.f764o.f749g.f610d.f646u = str;
                    }
                }
            }
            this.f752c = null;
            this.f756g = null;
            this.f754e = false;
            C0235b<Object> bVar = this.f753d;
            if (bVar != null) {
                if (this.f762m) {
                    this.f762m = false;
                    bVar.mo1104a((C0235b.C0237b<Object>) this);
                    this.f753d.mo1107b(this);
                }
                this.f753d.mo1110e();
            }
            C0222a aVar = this.f763n;
            if (aVar != null) {
                aVar.mo1083f();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f750a);
            sb.append(" : ");
            C0299d.m1339a(this.f753d, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    C0221v(String str, C0182l lVar, boolean z) {
        this.f746d = str;
        this.f749g = lVar;
        this.f747e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1066a(C0182l lVar) {
        this.f749g = lVar;
    }

    /* renamed from: a */
    public void mo1067a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f744b.mo1392b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f744b.mo1392b(); i++) {
                C0222a e = this.f744b.mo1400e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f744b.mo1399d(i));
                printWriter.print(": ");
                printWriter.println(e.toString());
                e.mo1078a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f745c.mo1392b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f745c.mo1392b(); i2++) {
                C0222a e2 = this.f745c.mo1400e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f745c.mo1399d(i2));
                printWriter.print(": ");
                printWriter.println(e2.toString());
                e2.mo1078a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1062a() {
        int b = this.f744b.mo1392b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            C0222a e = this.f744b.mo1400e(i);
            z |= e.f757h && !e.f755f;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1068b() {
        if (f743a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f747e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f747e = true;
        for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
            this.f744b.mo1400e(b).mo1076a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1069c() {
        if (f743a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f747e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
            this.f744b.mo1400e(b).mo1082e();
        }
        this.f747e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1070d() {
        if (f743a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f747e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.f748f = true;
        this.f747e = false;
        for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
            this.f744b.mo1400e(b).mo1079b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1071e() {
        if (this.f748f) {
            if (f743a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f748f = false;
            for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
                this.f744b.mo1400e(b).mo1080c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1072f() {
        for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
            this.f744b.mo1400e(b).f760k = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1073g() {
        for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
            this.f744b.mo1400e(b).mo1081d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1074h() {
        if (!this.f748f) {
            if (f743a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int b = this.f744b.mo1392b() - 1; b >= 0; b--) {
                this.f744b.mo1400e(b).mo1083f();
            }
            this.f744b.mo1395c();
        }
        if (f743a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int b2 = this.f745c.mo1392b() - 1; b2 >= 0; b2--) {
            this.f745c.mo1400e(b2).mo1083f();
        }
        this.f745c.mo1395c();
        this.f749g = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0299d.m1339a(this.f749g, sb);
        sb.append("}}");
        return sb.toString();
    }
}
