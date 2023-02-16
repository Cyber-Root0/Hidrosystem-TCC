package android.support.p005v4.p016h;

/* renamed from: android.support.v4.h.c */
class C0298c {

    /* renamed from: a */
    static final int[] f893a = new int[0];

    /* renamed from: b */
    static final long[] f894b = new long[0];

    /* renamed from: c */
    static final Object[] f895c = new Object[0];

    /* renamed from: a */
    public static int m1333a(int i) {
        return m1338c(i * 4) / 4;
    }

    /* renamed from: a */
    static int m1334a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: a */
    static int m1335a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public static boolean m1336a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m1337b(int i) {
        return m1338c(i * 8) / 8;
    }

    /* renamed from: c */
    public static int m1338c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
