package android.support.p005v4.p009c;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.c.b */
public class C0255b {

    /* renamed from: android.support.v4.c.b$a */
    private static class C0256a {

        /* renamed from: a */
        int f805a;

        /* renamed from: b */
        boolean f806b;

        C0256a() {
        }
    }

    /* renamed from: android.support.v4.c.b$b */
    public static class C0257b {

        /* renamed from: a */
        public char f807a;

        /* renamed from: b */
        public float[] f808b;

        C0257b(char c, float[] fArr) {
            this.f807a = c;
            this.f808b = fArr;
        }

        C0257b(C0257b bVar) {
            this.f807a = bVar.f807a;
            float[] fArr = bVar.f808b;
            this.f808b = C0255b.m1190a(fArr, 0, fArr.length);
        }

        /* renamed from: a */
        private static void m1195a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = (double) ceil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            double d20 = d5;
            double d21 = d6;
            double d22 = d17;
            double d23 = d14;
            int i = 0;
            double d24 = d8;
            while (i < ceil) {
                double d25 = d24 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d27 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d28 = (d12 * sin3) - (d13 * cos3);
                double d29 = (sin3 * d15) + (cos3 * d16);
                double d30 = d25 - d24;
                double tan = Math.tan(d30 / 2.0d);
                double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                int i2 = ceil;
                double d31 = cos;
                path.rLineTo(0.0f, 0.0f);
                float f = (float) (d21 + (d22 * sin4));
                float f2 = (float) (d26 - (sin4 * d28));
                path.cubicTo((float) (d20 + (d23 * sin4)), f, f2, (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
                i++;
                d19 = d19;
                ceil = i2;
                sin = sin;
                d21 = d27;
                d15 = d15;
                d24 = d25;
                d22 = d29;
                d23 = d28;
                cos = d31;
                d10 = d3;
                d20 = d26;
            }
        }

        /* renamed from: a */
        private static void m1196a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            float f10 = f5;
            boolean z3 = z2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            Double.isNaN(d3);
            double d4 = d3 * cos;
            double d5 = d3;
            double d6 = (double) f2;
            Double.isNaN(d6);
            double d7 = (double) f10;
            Double.isNaN(d7);
            double d8 = (d4 + (d6 * sin)) / d7;
            double d9 = (double) (-f8);
            Double.isNaN(d9);
            Double.isNaN(d6);
            double d10 = (d9 * sin) + (d6 * cos);
            double d11 = d6;
            double d12 = (double) f6;
            Double.isNaN(d12);
            double d13 = (double) f9;
            Double.isNaN(d13);
            double d14 = d10 / d12;
            double d15 = (double) f4;
            Double.isNaN(d15);
            Double.isNaN(d7);
            double d16 = ((d13 * cos) + (d15 * sin)) / d7;
            double d17 = d7;
            double d18 = (double) (-f9);
            Double.isNaN(d18);
            Double.isNaN(d15);
            Double.isNaN(d12);
            double d19 = ((d18 * sin) + (d15 * cos)) / d12;
            double d20 = d8 - d16;
            double d21 = d14 - d19;
            double d22 = (d8 + d16) / 2.0d;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = sin;
            double d25 = (d20 * d20) + (d21 * d21);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
                m1196a(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d26);
            double d27 = d20 * sqrt2;
            double d28 = sqrt2 * d21;
            boolean z4 = z2;
            if (z == z4) {
                d2 = d22 - d28;
                d = d23 + d27;
            } else {
                d2 = d22 + d28;
                d = d23 - d27;
            }
            double atan2 = Math.atan2(d14 - d, d8 - d2);
            double atan22 = Math.atan2(d19 - d, d16 - d2) - atan2;
            if (z4 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d17);
            double d29 = d2 * d17;
            Double.isNaN(d12);
            double d30 = d * d12;
            m1195a(path, (d29 * cos) - (d30 * d24), (d29 * d24) + (d30 * cos), d17, d12, d5, d11, radians, atan2, atan22);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0115, code lost:
            r7 = r7 + r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x014a, code lost:
            r7 = r7 + r2;
            r2 = r0;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x014d, code lost:
            r22 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01af, code lost:
            r7 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x022f, code lost:
            r2 = r0;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x02df, code lost:
            r9 = r22 + r18;
            r0 = r26;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m1197a(android.graphics.Path r23, float[] r24, char r25, char r26, float[] r27) {
            /*
                r10 = r23
                r11 = r27
                r12 = 0
                r0 = r24[r12]
                r13 = 1
                r1 = r24[r13]
                r14 = 2
                r2 = r24[r14]
                r15 = 3
                r3 = r24[r15]
                r16 = 4
                r4 = r24[r16]
                r17 = 5
                r5 = r24[r17]
                switch(r26) {
                    case 65: goto L_0x0033;
                    case 67: goto L_0x002f;
                    case 72: goto L_0x002c;
                    case 76: goto L_0x001b;
                    case 77: goto L_0x001b;
                    case 81: goto L_0x0029;
                    case 83: goto L_0x0029;
                    case 84: goto L_0x001b;
                    case 86: goto L_0x002c;
                    case 90: goto L_0x001e;
                    case 97: goto L_0x0033;
                    case 99: goto L_0x002f;
                    case 104: goto L_0x002c;
                    case 108: goto L_0x001b;
                    case 109: goto L_0x001b;
                    case 113: goto L_0x0029;
                    case 115: goto L_0x0029;
                    case 116: goto L_0x001b;
                    case 118: goto L_0x002c;
                    case 122: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r18 = 2
                goto L_0x0036
            L_0x001e:
                r23.close()
                r10.moveTo(r4, r5)
                r0 = r4
                r2 = r0
                r1 = r5
                r3 = r1
                goto L_0x001b
            L_0x0029:
                r18 = 4
                goto L_0x0036
            L_0x002c:
                r18 = 1
                goto L_0x0036
            L_0x002f:
                r6 = 6
                r18 = 6
                goto L_0x0036
            L_0x0033:
                r6 = 7
                r18 = 7
            L_0x0036:
                r8 = r0
                r7 = r1
                r19 = r4
                r20 = r5
                r9 = 0
                r0 = r25
            L_0x003f:
                int r1 = r11.length
                if (r9 >= r1) goto L_0x02e9
                r1 = 81
                r4 = 67
                r5 = 116(0x74, float:1.63E-43)
                r6 = 115(0x73, float:1.61E-43)
                r15 = 113(0x71, float:1.58E-43)
                r14 = 99
                r21 = 1073741824(0x40000000, float:2.0)
                r13 = 0
                switch(r26) {
                    case 65: goto L_0x02a1;
                    case 67: goto L_0x0276;
                    case 72: goto L_0x0268;
                    case 76: goto L_0x0255;
                    case 77: goto L_0x0233;
                    case 81: goto L_0x0212;
                    case 83: goto L_0x01da;
                    case 84: goto L_0x01b2;
                    case 86: goto L_0x019f;
                    case 97: goto L_0x0151;
                    case 99: goto L_0x0122;
                    case 104: goto L_0x0117;
                    case 108: goto L_0x0105;
                    case 109: goto L_0x00e5;
                    case 113: goto L_0x00c6;
                    case 115: goto L_0x0090;
                    case 116: goto L_0x0066;
                    case 118: goto L_0x005b;
                    default: goto L_0x0054;
                }
            L_0x0054:
                r12 = r7
                r7 = r8
                r22 = r9
                r7 = r12
                goto L_0x02df
            L_0x005b:
                int r0 = r9 + 0
                r1 = r11[r0]
                r10.rLineTo(r13, r1)
                r0 = r11[r0]
                goto L_0x0115
            L_0x0066:
                if (r0 == r15) goto L_0x0073
                if (r0 == r5) goto L_0x0073
                if (r0 == r1) goto L_0x0073
                r1 = 84
                if (r0 != r1) goto L_0x0071
                goto L_0x0073
            L_0x0071:
                r0 = 0
                goto L_0x0077
            L_0x0073:
                float r13 = r8 - r2
                float r0 = r7 - r3
            L_0x0077:
                int r1 = r9 + 0
                r2 = r11[r1]
                int r3 = r9 + 1
                r4 = r11[r3]
                r10.rQuadTo(r13, r0, r2, r4)
                float r13 = r13 + r8
                float r0 = r0 + r7
                r1 = r11[r1]
                float r8 = r8 + r1
                r1 = r11[r3]
                float r7 = r7 + r1
                r3 = r0
                r22 = r9
                r2 = r13
                goto L_0x02df
            L_0x0090:
                if (r0 == r14) goto L_0x009e
                if (r0 == r6) goto L_0x009e
                if (r0 == r4) goto L_0x009e
                r1 = 83
                if (r0 != r1) goto L_0x009b
                goto L_0x009e
            L_0x009b:
                r1 = 0
                r2 = 0
                goto L_0x00a4
            L_0x009e:
                float r0 = r8 - r2
                float r1 = r7 - r3
                r2 = r1
                r1 = r0
            L_0x00a4:
                int r13 = r9 + 0
                r3 = r11[r13]
                int r14 = r9 + 1
                r4 = r11[r14]
                int r15 = r9 + 2
                r5 = r11[r15]
                int r21 = r9 + 3
                r6 = r11[r21]
                r0 = r23
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r11[r13]
                float r0 = r0 + r8
                r1 = r11[r14]
                float r1 = r1 + r7
                r2 = r11[r15]
                float r8 = r8 + r2
                r2 = r11[r21]
                goto L_0x014a
            L_0x00c6:
                int r0 = r9 + 0
                r1 = r11[r0]
                int r2 = r9 + 1
                r3 = r11[r2]
                int r4 = r9 + 2
                r5 = r11[r4]
                int r6 = r9 + 3
                r13 = r11[r6]
                r10.rQuadTo(r1, r3, r5, r13)
                r0 = r11[r0]
                float r0 = r0 + r8
                r1 = r11[r2]
                float r1 = r1 + r7
                r2 = r11[r4]
                float r8 = r8 + r2
                r2 = r11[r6]
                goto L_0x014a
            L_0x00e5:
                int r0 = r9 + 0
                r1 = r11[r0]
                float r8 = r8 + r1
                int r1 = r9 + 1
                r4 = r11[r1]
                float r7 = r7 + r4
                if (r9 <= 0) goto L_0x00f9
                r0 = r11[r0]
                r1 = r11[r1]
                r10.rLineTo(r0, r1)
                goto L_0x014d
            L_0x00f9:
                r0 = r11[r0]
                r1 = r11[r1]
                r10.rMoveTo(r0, r1)
                r20 = r7
                r19 = r8
                goto L_0x014d
            L_0x0105:
                int r0 = r9 + 0
                r1 = r11[r0]
                int r4 = r9 + 1
                r5 = r11[r4]
                r10.rLineTo(r1, r5)
                r0 = r11[r0]
                float r8 = r8 + r0
                r0 = r11[r4]
            L_0x0115:
                float r7 = r7 + r0
                goto L_0x014d
            L_0x0117:
                int r0 = r9 + 0
                r1 = r11[r0]
                r10.rLineTo(r1, r13)
                r0 = r11[r0]
                float r8 = r8 + r0
                goto L_0x014d
            L_0x0122:
                int r0 = r9 + 0
                r1 = r11[r0]
                int r0 = r9 + 1
                r2 = r11[r0]
                int r13 = r9 + 2
                r3 = r11[r13]
                int r14 = r9 + 3
                r4 = r11[r14]
                int r15 = r9 + 4
                r5 = r11[r15]
                int r21 = r9 + 5
                r6 = r11[r21]
                r0 = r23
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r11[r13]
                float r0 = r0 + r8
                r1 = r11[r14]
                float r1 = r1 + r7
                r2 = r11[r15]
                float r8 = r8 + r2
                r2 = r11[r21]
            L_0x014a:
                float r7 = r7 + r2
                r2 = r0
                r3 = r1
            L_0x014d:
                r22 = r9
                goto L_0x02df
            L_0x0151:
                int r14 = r9 + 5
                r0 = r11[r14]
                float r3 = r0 + r8
                int r15 = r9 + 6
                r0 = r11[r15]
                float r4 = r0 + r7
                int r0 = r9 + 0
                r5 = r11[r0]
                int r0 = r9 + 1
                r6 = r11[r0]
                int r0 = r9 + 2
                r21 = r11[r0]
                int r0 = r9 + 3
                r0 = r11[r0]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L_0x0174
                r22 = 1
                goto L_0x0176
            L_0x0174:
                r22 = 0
            L_0x0176:
                int r0 = r9 + 4
                r0 = r11[r0]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L_0x0180
                r13 = 1
                goto L_0x0181
            L_0x0180:
                r13 = 0
            L_0x0181:
                r0 = r23
                r1 = r8
                r2 = r7
                r12 = r7
                r7 = r21
                r10 = r8
                r8 = r22
                r22 = r9
                r9 = r13
                m1196a((android.graphics.Path) r0, (float) r1, (float) r2, (float) r3, (float) r4, (float) r5, (float) r6, (float) r7, (boolean) r8, (boolean) r9)
                r0 = r11[r14]
                float r8 = r10 + r0
                r0 = r11[r15]
                float r7 = r12 + r0
                r3 = r7
                r2 = r8
                r10 = r23
                goto L_0x02df
            L_0x019f:
                r10 = r8
                r22 = r9
                int r9 = r22 + 0
                r0 = r11[r9]
                r7 = r10
                r10 = r23
                r10.lineTo(r7, r0)
                r0 = r11[r9]
                r8 = r7
            L_0x01af:
                r7 = r0
                goto L_0x02df
            L_0x01b2:
                r12 = r7
                r7 = r8
                r22 = r9
                if (r0 == r15) goto L_0x01c0
                if (r0 == r5) goto L_0x01c0
                if (r0 == r1) goto L_0x01c0
                r1 = 84
                if (r0 != r1) goto L_0x01c8
            L_0x01c0:
                float r8 = r7 * r21
                float r8 = r8 - r2
                float r7 = r12 * r21
                float r7 = r7 - r3
                r12 = r7
                r7 = r8
            L_0x01c8:
                int r9 = r22 + 0
                r0 = r11[r9]
                int r1 = r22 + 1
                r2 = r11[r1]
                r10.quadTo(r7, r12, r0, r2)
                r8 = r11[r9]
                r0 = r11[r1]
                r2 = r7
                r3 = r12
                goto L_0x01af
            L_0x01da:
                r12 = r7
                r7 = r8
                r22 = r9
                if (r0 == r14) goto L_0x01ec
                if (r0 == r6) goto L_0x01ec
                if (r0 == r4) goto L_0x01ec
                r1 = 83
                if (r0 != r1) goto L_0x01e9
                goto L_0x01ec
            L_0x01e9:
                r1 = r7
                r2 = r12
                goto L_0x01f4
            L_0x01ec:
                float r8 = r7 * r21
                float r8 = r8 - r2
                float r7 = r12 * r21
                float r7 = r7 - r3
                r2 = r7
                r1 = r8
            L_0x01f4:
                int r9 = r22 + 0
                r3 = r11[r9]
                int r7 = r22 + 1
                r4 = r11[r7]
                int r8 = r22 + 2
                r5 = r11[r8]
                int r12 = r22 + 3
                r6 = r11[r12]
                r0 = r23
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r11[r9]
                r1 = r11[r7]
                r8 = r11[r8]
                r7 = r11[r12]
                goto L_0x022f
            L_0x0212:
                r22 = r9
                int r9 = r22 + 0
                r0 = r11[r9]
                int r1 = r22 + 1
                r2 = r11[r1]
                int r3 = r22 + 2
                r4 = r11[r3]
                int r5 = r22 + 3
                r6 = r11[r5]
                r10.quadTo(r0, r2, r4, r6)
                r0 = r11[r9]
                r1 = r11[r1]
                r8 = r11[r3]
                r7 = r11[r5]
            L_0x022f:
                r2 = r0
                r3 = r1
                goto L_0x02df
            L_0x0233:
                r22 = r9
                int r9 = r22 + 0
                r8 = r11[r9]
                int r0 = r22 + 1
                r7 = r11[r0]
                if (r22 <= 0) goto L_0x0248
                r1 = r11[r9]
                r0 = r11[r0]
                r10.lineTo(r1, r0)
                goto L_0x02df
            L_0x0248:
                r1 = r11[r9]
                r0 = r11[r0]
                r10.moveTo(r1, r0)
                r20 = r7
                r19 = r8
                goto L_0x02df
            L_0x0255:
                r22 = r9
                int r9 = r22 + 0
                r0 = r11[r9]
                int r1 = r22 + 1
                r4 = r11[r1]
                r10.lineTo(r0, r4)
                r8 = r11[r9]
                r7 = r11[r1]
                goto L_0x02df
            L_0x0268:
                r12 = r7
                r22 = r9
                int r9 = r22 + 0
                r0 = r11[r9]
                r10.lineTo(r0, r12)
                r8 = r11[r9]
                goto L_0x02df
            L_0x0276:
                r22 = r9
                int r9 = r22 + 0
                r1 = r11[r9]
                int r9 = r22 + 1
                r2 = r11[r9]
                int r9 = r22 + 2
                r3 = r11[r9]
                int r7 = r22 + 3
                r4 = r11[r7]
                int r8 = r22 + 4
                r5 = r11[r8]
                int r12 = r22 + 5
                r6 = r11[r12]
                r0 = r23
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r8 = r11[r8]
                r0 = r11[r12]
                r1 = r11[r9]
                r2 = r11[r7]
                r7 = r0
                r3 = r2
                r2 = r1
                goto L_0x02df
            L_0x02a1:
                r12 = r7
                r7 = r8
                r22 = r9
                int r14 = r22 + 5
                r3 = r11[r14]
                int r15 = r22 + 6
                r4 = r11[r15]
                int r9 = r22 + 0
                r5 = r11[r9]
                int r9 = r22 + 1
                r6 = r11[r9]
                int r9 = r22 + 2
                r8 = r11[r9]
                int r9 = r22 + 3
                r0 = r11[r9]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L_0x02c3
                r9 = 1
                goto L_0x02c4
            L_0x02c3:
                r9 = 0
            L_0x02c4:
                int r0 = r22 + 4
                r0 = r11[r0]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L_0x02ce
                r13 = 1
                goto L_0x02cf
            L_0x02ce:
                r13 = 0
            L_0x02cf:
                r0 = r23
                r1 = r7
                r2 = r12
                r7 = r8
                r8 = r9
                r9 = r13
                m1196a((android.graphics.Path) r0, (float) r1, (float) r2, (float) r3, (float) r4, (float) r5, (float) r6, (float) r7, (boolean) r8, (boolean) r9)
                r8 = r11[r14]
                r7 = r11[r15]
                r3 = r7
                r2 = r8
            L_0x02df:
                int r9 = r22 + r18
                r0 = r26
                r12 = 0
                r13 = 1
                r14 = 2
                r15 = 3
                goto L_0x003f
            L_0x02e9:
                r12 = r7
                r7 = r8
                r0 = 0
                r24[r0] = r7
                r0 = 1
                r24[r0] = r12
                r0 = 2
                r24[r0] = r2
                r0 = 3
                r24[r0] = r3
                r24[r16] = r19
                r24[r17] = r20
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p009c.C0255b.C0257b.m1197a(android.graphics.Path, float[], char, char, float[]):void");
        }

        /* renamed from: a */
        public static void m1198a(C0257b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m1197a(path, fArr, c, bVarArr[i].f807a, bVarArr[i].f808b);
                c = bVarArr[i].f807a;
            }
        }

        /* renamed from: a */
        public void mo1171a(C0257b bVar, C0257b bVar2, float f) {
            int i = 0;
            while (true) {
                float[] fArr = bVar.f808b;
                if (i < fArr.length) {
                    this.f808b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f808b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m1185a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static Path m1186a(String str) {
        Path path = new Path();
        C0257b[] b = m1193b(str);
        if (b == null) {
            return null;
        }
        try {
            C0257b.m1198a(b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r10.f806b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[LOOP:0: B:1:0x0007->B:19:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1187a(java.lang.String r8, int r9, android.support.p005v4.p009c.C0255b.C0256a r10) {
        /*
            r0 = 0
            r10.f806b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0033
            r6 = 69
            if (r5 == r6) goto L_0x0031
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0031
            switch(r5) {
                case 44: goto L_0x0033;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x002f
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0035
        L_0x0027:
            r10.f806b = r7
            goto L_0x0033
        L_0x002a:
            if (r1 == r9) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            r2 = 0
            goto L_0x0035
        L_0x0031:
            r2 = 1
            goto L_0x0035
        L_0x0033:
            r2 = 0
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003b:
            r10.f805a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p009c.C0255b.m1187a(java.lang.String, int, android.support.v4.c.b$a):void");
    }

    /* renamed from: a */
    private static void m1188a(ArrayList<C0257b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0257b(c, fArr));
    }

    /* renamed from: a */
    public static boolean m1189a(C0257b[] bVarArr, C0257b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f807a != bVarArr2[i].f807a || bVarArr[i].f808b.length != bVarArr2[i].f808b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static float[] m1190a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C0257b[] m1191a(C0257b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0257b[] bVarArr2 = new C0257b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0257b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: b */
    public static void m1192b(C0257b[] bVarArr, C0257b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f807a = bVarArr2[i].f807a;
            for (int i2 = 0; i2 < bVarArr2[i].f808b.length; i2++) {
                bVarArr[i].f808b[i2] = bVarArr2[i].f808b[i2];
            }
        }
    }

    /* renamed from: b */
    public static C0257b[] m1193b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m1185a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m1188a((ArrayList<C0257b>) arrayList, trim.charAt(0), m1194c(trim));
            }
            i2 = a;
            i = a + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m1188a((ArrayList<C0257b>) arrayList, str.charAt(i2), new float[0]);
        }
        return (C0257b[]) arrayList.toArray(new C0257b[arrayList.size()]);
    }

    /* renamed from: c */
    private static float[] m1194c(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0256a aVar = new C0256a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m1187a(str, i, aVar);
                int i3 = aVar.f805a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.f806b ? i3 : i3 + 1;
            }
            return m1190a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}
