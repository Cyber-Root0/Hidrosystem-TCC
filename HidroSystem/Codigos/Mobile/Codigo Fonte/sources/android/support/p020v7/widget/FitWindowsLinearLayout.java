package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p020v7.widget.C0757ak;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C0757ak {

    /* renamed from: a */
    private C0757ak.C0758a f2141a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0757ak.C0758a aVar = this.f2141a;
        if (aVar != null) {
            aVar.mo2380a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0757ak.C0758a aVar) {
        this.f2141a = aVar;
    }
}
