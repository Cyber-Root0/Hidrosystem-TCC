package android.support.p020v7.widget;

import android.content.Context;
import android.support.p020v7.p022b.p023a.C0616b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.k */
public class C0891k extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f3013a = {16843016};

    /* renamed from: b */
    private final C0917z f3014b;

    public C0891k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0891k(Context context, AttributeSet attributeSet, int i) {
        super(C0843bf.m4620a(context), attributeSet, i);
        this.f3014b = C0917z.m4931a((TextView) this);
        this.f3014b.mo3462a(attributeSet, i);
        this.f3014b.mo3461a();
        C0846bi a = C0846bi.m4625a(getContext(), attributeSet, f3013a, i, 0);
        setCheckMarkDrawable(a.mo4291a(0));
        a.mo4292a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0917z zVar = this.f3014b;
        if (zVar != null) {
            zVar.mo3461a();
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0616b.m2831b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0917z zVar = this.f3014b;
        if (zVar != null) {
            zVar.mo4560a(context, i);
        }
    }
}
