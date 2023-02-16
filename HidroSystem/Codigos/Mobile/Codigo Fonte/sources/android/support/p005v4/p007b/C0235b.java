package android.support.p005v4.p007b;

import android.support.p005v4.p016h.C0299d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.b.b */
public class C0235b<D> {

    /* renamed from: a */
    int f779a;

    /* renamed from: b */
    C0237b<D> f780b;

    /* renamed from: c */
    C0236a<D> f781c;

    /* renamed from: d */
    boolean f782d;

    /* renamed from: e */
    boolean f783e;

    /* renamed from: f */
    boolean f784f;

    /* renamed from: g */
    boolean f785g;

    /* renamed from: h */
    boolean f786h;

    /* renamed from: android.support.v4.b.b$a */
    public interface C0236a<D> {
    }

    /* renamed from: android.support.v4.b.b$b */
    public interface C0237b<D> {
    }

    /* renamed from: a */
    public String mo1100a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0299d.m1339a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo1101a() {
        this.f782d = true;
        this.f784f = false;
        this.f783e = false;
        mo1106b();
    }

    /* renamed from: a */
    public void mo1102a(int i, C0237b<D> bVar) {
        if (this.f780b == null) {
            this.f780b = bVar;
            this.f779a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void mo1103a(C0236a<D> aVar) {
        if (this.f781c == null) {
            this.f781c = aVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void mo1104a(C0237b<D> bVar) {
        C0237b<D> bVar2 = this.f780b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f780b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo1105a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f779a);
        printWriter.print(" mListener=");
        printWriter.println(this.f780b);
        if (this.f782d || this.f785g || this.f786h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f782d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f785g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f786h);
        }
        if (this.f783e || this.f784f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f783e);
            printWriter.print(" mReset=");
            printWriter.println(this.f784f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1106b() {
    }

    /* renamed from: b */
    public void mo1107b(C0236a<D> aVar) {
        C0236a<D> aVar2 = this.f781c;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.f781c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: c */
    public void mo1108c() {
        this.f782d = false;
        mo1109d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1109d() {
    }

    /* renamed from: e */
    public void mo1110e() {
        mo1111f();
        this.f784f = true;
        this.f782d = false;
        this.f783e = false;
        this.f785g = false;
        this.f786h = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1111f() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0299d.m1339a(this, sb);
        sb.append(" id=");
        sb.append(this.f779a);
        sb.append("}");
        return sb.toString();
    }
}
