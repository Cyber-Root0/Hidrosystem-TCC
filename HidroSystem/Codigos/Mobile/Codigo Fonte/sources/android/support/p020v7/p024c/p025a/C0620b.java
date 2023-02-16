package android.support.p020v7.p024c.p025a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;

/* renamed from: android.support.v7.c.a.b */
public class C0620b extends Drawable {

    /* renamed from: b */
    private static final float f1714b = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f1715a = new Paint();

    /* renamed from: c */
    private float f1716c;

    /* renamed from: d */
    private float f1717d;

    /* renamed from: e */
    private float f1718e;

    /* renamed from: f */
    private float f1719f;

    /* renamed from: g */
    private boolean f1720g;

    /* renamed from: h */
    private final Path f1721h = new Path();

    /* renamed from: i */
    private final int f1722i;

    /* renamed from: j */
    private boolean f1723j = false;

    /* renamed from: k */
    private float f1724k;

    /* renamed from: l */
    private float f1725l;

    /* renamed from: m */
    private int f1726m = 2;

    public C0620b(Context context) {
        this.f1715a.setStyle(Paint.Style.STROKE);
        this.f1715a.setStrokeJoin(Paint.Join.MITER);
        this.f1715a.setStrokeCap(Paint.Cap.BUTT);
        this.f1715a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C0526a.C0536j.DrawerArrowToggle, C0526a.C0527a.drawerArrowStyle, C0526a.C0535i.Base_Widget_AppCompat_DrawerArrowToggle);
        mo2474a(obtainStyledAttributes.getColor(C0526a.C0536j.DrawerArrowToggle_color, 0));
        mo2473a(obtainStyledAttributes.getDimension(C0526a.C0536j.DrawerArrowToggle_thickness, 0.0f));
        mo2475a(obtainStyledAttributes.getBoolean(C0526a.C0536j.DrawerArrowToggle_spinBars, true));
        mo2476b((float) Math.round(obtainStyledAttributes.getDimension(C0526a.C0536j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f1722i = obtainStyledAttributes.getDimensionPixelSize(C0526a.C0536j.DrawerArrowToggle_drawableSize, 0);
        this.f1717d = (float) Math.round(obtainStyledAttributes.getDimension(C0526a.C0536j.DrawerArrowToggle_barLength, 0.0f));
        this.f1716c = (float) Math.round(obtainStyledAttributes.getDimension(C0526a.C0536j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f1718e = obtainStyledAttributes.getDimension(C0526a.C0536j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m2840a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void mo2473a(float f) {
        if (this.f1715a.getStrokeWidth() != f) {
            this.f1715a.setStrokeWidth(f);
            double d = (double) (f / 2.0f);
            double cos = Math.cos((double) f1714b);
            Double.isNaN(d);
            this.f1725l = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo2474a(int i) {
        if (i != this.f1715a.getColor()) {
            this.f1715a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo2475a(boolean z) {
        if (this.f1720g != z) {
            this.f1720g = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo2476b(float f) {
        if (f != this.f1719f) {
            this.f1719f = f;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo2477b(boolean z) {
        if (this.f1723j != z) {
            this.f1723j = z;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo2478c(float f) {
        if (this.f1724k != f) {
            this.f1724k = f;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (android.support.p005v4.p009c.p010a.C0240a.m1135g(r18) == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (android.support.p005v4.p009c.p010a.C0240a.m1135g(r18) == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r18.getBounds()
            int r3 = r0.f1726m
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x001a
            switch(r3) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r3 = android.support.p005v4.p009c.p010a.C0240a.m1135g(r18)
            if (r3 != r6) goto L_0x0021
        L_0x0018:
            r5 = 1
            goto L_0x0021
        L_0x001a:
            int r3 = android.support.p005v4.p009c.p010a.C0240a.m1135g(r18)
            if (r3 != 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            float r3 = r0.f1716c
            float r3 = r3 * r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.f1717d
            float r8 = r0.f1724k
            float r3 = m2840a(r7, r3, r8)
            float r7 = r0.f1717d
            float r8 = r0.f1718e
            float r9 = r0.f1724k
            float r7 = m2840a(r7, r8, r9)
            float r8 = r0.f1725l
            float r9 = r0.f1724k
            r10 = 0
            float r8 = m2840a(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = f1714b
            float r11 = r0.f1724k
            float r9 = m2840a(r10, r9, r11)
            if (r5 == 0) goto L_0x005b
            r11 = 0
            goto L_0x005d
        L_0x005b:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x005d:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r5 == 0) goto L_0x0064
            r13 = 1127481344(0x43340000, float:180.0)
            goto L_0x0065
        L_0x0064:
            r13 = 0
        L_0x0065:
            float r14 = r0.f1724k
            float r11 = m2840a(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            java.lang.Double.isNaN(r13)
            double r16 = r16 * r13
            long r3 = java.lang.Math.round(r16)
            float r3 = (float) r3
            double r10 = java.lang.Math.sin(r10)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r10
            long r10 = java.lang.Math.round(r13)
            float r4 = (float) r10
            android.graphics.Path r10 = r0.f1721h
            r10.rewind()
            float r10 = r0.f1719f
            android.graphics.Paint r11 = r0.f1715a
            float r11 = r11.getStrokeWidth()
            float r10 = r10 + r11
            float r11 = r0.f1725l
            float r11 = -r11
            float r13 = r0.f1724k
            float r10 = m2840a(r10, r11, r13)
            float r11 = -r7
            r9 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r9
            android.graphics.Path r13 = r0.f1721h
            float r14 = r11 + r8
            r6 = 0
            r13.moveTo(r14, r6)
            android.graphics.Path r13 = r0.f1721h
            float r8 = r8 * r9
            float r7 = r7 - r8
            r13.rLineTo(r7, r6)
            android.graphics.Path r6 = r0.f1721h
            r6.moveTo(r11, r10)
            android.graphics.Path r6 = r0.f1721h
            r6.rLineTo(r3, r4)
            android.graphics.Path r6 = r0.f1721h
            float r7 = -r10
            r6.moveTo(r11, r7)
            android.graphics.Path r6 = r0.f1721h
            float r4 = -r4
            r6.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.f1721h
            r3.close()
            r19.save()
            android.graphics.Paint r3 = r0.f1715a
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r6 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 * r3
            float r4 = r4 - r6
            float r6 = r0.f1719f
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r6
            float r4 = r4 - r7
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r7
            float r3 = r3 + r6
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.f1720g
            if (r2 == 0) goto L_0x0111
            boolean r2 = r0.f1723j
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0109
            r6 = -1
            goto L_0x010a
        L_0x0109:
            r6 = 1
        L_0x010a:
            float r2 = (float) r6
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L_0x0116
        L_0x0111:
            if (r5 == 0) goto L_0x0116
            r1.rotate(r12)
        L_0x0116:
            android.graphics.Path r2 = r0.f1721h
            android.graphics.Paint r3 = r0.f1715a
            r1.drawPath(r2, r3)
            r19.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.p024c.p025a.C0620b.draw(android.graphics.Canvas):void");
    }

    public int getIntrinsicHeight() {
        return this.f1722i;
    }

    public int getIntrinsicWidth() {
        return this.f1722i;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f1715a.getAlpha()) {
            this.f1715a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1715a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
