package android.support.p005v4.p017i.p019b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.i.b.d */
abstract class C0366d implements Interpolator {

    /* renamed from: a */
    private final float[] f1003a;

    /* renamed from: b */
    private final float f1004b = (1.0f / ((float) (this.f1003a.length - 1)));

    public C0366d(float[] fArr) {
        this.f1003a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1003a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f1004b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f1003a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
