package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p020v7.widget.C0757ak;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements C0757ak {

    /* renamed from: a */
    private C0757ak.C0758a f2140a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0757ak.C0758a aVar = this.f2140a;
        if (aVar != null) {
            aVar.mo2380a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0757ak.C0758a aVar) {
        this.f2140a = aVar;
    }
}
