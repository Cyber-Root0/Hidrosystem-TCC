package android.support.p020v7.p022b.p023a;

import java.lang.reflect.Array;

/* renamed from: android.support.v7.b.a.c */
final class C0618c {

    /* renamed from: a */
    static final /* synthetic */ boolean f1712a = (!C0618c.class.desiredAssertionStatus());

    private C0618c() {
    }

    /* renamed from: a */
    public static int m2835a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m2836a(int[] iArr, int i, int i2) {
        if (f1712a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m2835a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <T> T[] m2837a(T[] tArr, int i, T t) {
        if (f1712a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2835a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }
}
