package android.support.p005v4.p006a;

import android.app.Activity;
import android.arch.lifecycle.C0011b;
import android.arch.lifecycle.C0014c;
import android.arch.lifecycle.C0015d;
import android.arch.lifecycle.C0020g;
import android.os.Bundle;
import android.support.p005v4.p016h.C0319m;

/* renamed from: android.support.v4.a.aa */
public class C0156aa extends Activity implements C0014c {

    /* renamed from: a */
    private C0319m<Class<? extends Object>, Object> f474a = new C0319m<>();

    /* renamed from: b */
    private C0015d f475b = new C0015d(this);

    /* renamed from: a */
    public C0011b mo25a() {
        return this.f475b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0020g.m37a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f475b.mo27a(C0011b.C0013b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
