package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.v */
public class C0907v extends RatingBar {

    /* renamed from: a */
    private final C0905t f3059a;

    public C0907v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.ratingBarStyle);
    }

    public C0907v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3059a = new C0905t(this);
        this.f3059a.mo4501a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f3059a.mo4500a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
