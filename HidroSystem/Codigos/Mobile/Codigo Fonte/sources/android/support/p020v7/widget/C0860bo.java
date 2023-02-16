package android.support.p020v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.bo */
class C0860bo {

    /* renamed from: a */
    final C0862b f2921a;

    /* renamed from: b */
    C0861a f2922b = new C0861a();

    /* renamed from: android.support.v7.widget.bo$a */
    static class C0861a {

        /* renamed from: a */
        int f2923a = 0;

        /* renamed from: b */
        int f2924b;

        /* renamed from: c */
        int f2925c;

        /* renamed from: d */
        int f2926d;

        /* renamed from: e */
        int f2927e;

        C0861a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4327a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4328a() {
            this.f2923a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4329a(int i) {
            this.f2923a = i | this.f2923a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4330a(int i, int i2, int i3, int i4) {
            this.f2924b = i;
            this.f2925c = i2;
            this.f2926d = i3;
            this.f2927e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4331b() {
            int i = this.f2923a;
            if ((i & 7) != 0 && (i & (mo4327a(this.f2926d, this.f2924b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2923a;
            if ((i2 & 112) != 0 && (i2 & (mo4327a(this.f2926d, this.f2925c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2923a;
            if ((i3 & 1792) != 0 && (i3 & (mo4327a(this.f2927e, this.f2924b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2923a;
            return (i4 & 28672) == 0 || (i4 & (mo4327a(this.f2927e, this.f2925c) << 12)) != 0;
        }
    }

    /* renamed from: android.support.v7.widget.bo$b */
    interface C0862b {
        /* renamed from: a */
        int mo4051a();

        /* renamed from: a */
        int mo4052a(View view);

        /* renamed from: a */
        View mo4053a(int i);

        /* renamed from: b */
        int mo4054b();

        /* renamed from: b */
        int mo4055b(View view);
    }

    C0860bo(C0862b bVar) {
        this.f2921a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4325a(int i, int i2, int i3, int i4) {
        int a = this.f2921a.mo4051a();
        int b = this.f2921a.mo4054b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f2921a.mo4053a(i);
            this.f2922b.mo4330a(a, b, this.f2921a.mo4052a(a2), this.f2921a.mo4055b(a2));
            if (i3 != 0) {
                this.f2922b.mo4328a();
                this.f2922b.mo4329a(i3);
                if (this.f2922b.mo4331b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f2922b.mo4328a();
                this.f2922b.mo4329a(i4);
                if (this.f2922b.mo4331b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4326a(View view, int i) {
        this.f2922b.mo4330a(this.f2921a.mo4051a(), this.f2921a.mo4054b(), this.f2921a.mo4052a(view), this.f2921a.mo4055b(view));
        if (i == 0) {
            return false;
        }
        this.f2922b.mo4328a();
        this.f2922b.mo4329a(i);
        return this.f2922b.mo4331b();
    }
}
