package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.design.widget.o */
class C0151o<V extends View> extends CoordinatorLayout.C0088a<V> {

    /* renamed from: a */
    private C0152p f464a;

    /* renamed from: b */
    private int f465b = 0;

    /* renamed from: c */
    private int f466c = 0;

    public C0151o() {
    }

    public C0151o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo319a(int i) {
        C0152p pVar = this.f464a;
        if (pVar != null) {
            return pVar.mo683a(i);
        }
        this.f465b = i;
        return false;
    }

    /* renamed from: a */
    public boolean mo324a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo655b(coordinatorLayout, v, i);
        if (this.f464a == null) {
            this.f464a = new C0152p(v);
        }
        this.f464a.mo682a();
        int i2 = this.f465b;
        if (i2 != 0) {
            this.f464a.mo683a(i2);
            this.f465b = 0;
        }
        int i3 = this.f466c;
        if (i3 == 0) {
            return true;
        }
        this.f464a.mo685b(i3);
        this.f466c = 0;
        return true;
    }

    /* renamed from: b */
    public int mo327b() {
        C0152p pVar = this.f464a;
        if (pVar != null) {
            return pVar.mo684b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo655b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo394a((View) v, i);
    }
}
