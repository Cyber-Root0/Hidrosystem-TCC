package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p017i.C0370d;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.ao */
public class C0767ao extends ViewGroup {

    /* renamed from: a */
    private boolean f2522a;

    /* renamed from: b */
    private int f2523b;

    /* renamed from: c */
    private int f2524c;

    /* renamed from: d */
    private int f2525d;

    /* renamed from: e */
    private int f2526e;

    /* renamed from: f */
    private int f2527f;

    /* renamed from: g */
    private float f2528g;

    /* renamed from: h */
    private boolean f2529h;

    /* renamed from: i */
    private int[] f2530i;

    /* renamed from: j */
    private int[] f2531j;

    /* renamed from: k */
    private Drawable f2532k;

    /* renamed from: l */
    private int f2533l;

    /* renamed from: m */
    private int f2534m;

    /* renamed from: n */
    private int f2535n;

    /* renamed from: o */
    private int f2536o;

    /* renamed from: android.support.v7.widget.ao$a */
    public static class C0768a extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f2537g;

        /* renamed from: h */
        public int f2538h;

        public C0768a(int i, int i2) {
            super(i, i2);
            this.f2538h = -1;
            this.f2537g = 0.0f;
        }

        public C0768a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2538h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.LinearLayoutCompat_Layout);
            this.f2537g = obtainStyledAttributes.getFloat(C0526a.C0536j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f2538h = obtainStyledAttributes.getInt(C0526a.C0536j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0768a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2538h = -1;
        }
    }

    public C0767ao(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0767ao(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2522a = true;
        this.f2523b = -1;
        this.f2524c = 0;
        this.f2526e = 8388659;
        C0846bi a = C0846bi.m4625a(context, attributeSet, C0526a.C0536j.LinearLayoutCompat, i, 0);
        int a2 = a.mo4289a(C0526a.C0536j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo4289a(C0526a.C0536j.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo4293a(C0526a.C0536j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f2528g = a.mo4288a(C0526a.C0536j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2523b = a.mo4289a(C0526a.C0536j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2529h = a.mo4293a(C0526a.C0536j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo4291a(C0526a.C0536j.LinearLayoutCompat_divider));
        this.f2535n = a.mo4289a(C0526a.C0536j.LinearLayoutCompat_showDividers, 0);
        this.f2536o = a.mo4300e(C0526a.C0536j.LinearLayoutCompat_dividerPadding, 0);
        a.mo4292a();
    }

    /* renamed from: a */
    private void m3908a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m3909c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo3642b(i3);
            if (b.getVisibility() != 8) {
                C0768a aVar = (C0768a) b.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m3910d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo3642b(i3);
            if (b.getVisibility() != 8) {
                C0768a aVar = (C0768a) b.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3634a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3635a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e2, code lost:
        if (r15 > 0) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ed, code lost:
        if (r15 < 0) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ef, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f0, code lost:
        r13.measure(r6, android.view.View.MeasureSpec.makeMeasureSpec(r15, r9));
        r10 = android.view.View.combineMeasuredStates(r10, r13.getMeasuredState() & -256);
        r6 = r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3636a(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f2527f = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f2523b
            boolean r15 = r7.f2529h
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r5 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
        L_0x002b:
            if (r5 >= r11) goto L_0x01a6
            android.view.View r4 = r7.mo3642b((int) r5)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.f2527f
            int r22 = r7.mo3648d(r5)
            int r4 = r4 + r22
            r7.f2527f = r4
            r6 = r1
            r22 = r11
            r1 = r21
        L_0x0042:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = r13
            goto L_0x0197
        L_0x0048:
            int r6 = r4.getVisibility()
            r26 = r1
            r1 = 8
            if (r6 != r1) goto L_0x005e
            int r1 = r7.mo3635a((android.view.View) r4, (int) r5)
            int r5 = r5 + r1
            r22 = r11
            r1 = r21
            r6 = r26
            goto L_0x0042
        L_0x005e:
            boolean r1 = r7.mo3647c(r5)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.f2527f
            int r6 = r7.f2534m
            int r1 = r1 + r6
            r7.f2527f = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r6 = r1
            android.support.v7.widget.ao$a r6 = (android.support.p020v7.widget.C0767ao.C0768a) r6
            float r1 = r6.f2537g
            float r23 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a9
            int r0 = r6.height
            if (r0 != 0) goto L_0x00a9
            float r0 = r6.f2537g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            int r0 = r7.f2527f
            int r1 = r6.topMargin
            int r1 = r1 + r0
            r27 = r2
            int r2 = r6.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f2527f = r0
            r25 = r3
            r3 = r4
            r22 = r11
            r8 = r26
            r2 = r27
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = 1
            r11 = r5
            r27 = r21
            r21 = r13
            r13 = r6
            goto L_0x0122
        L_0x00a9:
            r27 = r2
            int r0 = r6.height
            if (r0 != 0) goto L_0x00ba
            float r0 = r6.f2537g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ba
            r0 = -2
            r6.height = r0
            r2 = 0
            goto L_0x00bc
        L_0x00ba:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00bc:
            r28 = 0
            int r0 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            int r0 = r7.f2527f
            r29 = r0
            goto L_0x00c9
        L_0x00c7:
            r29 = 0
        L_0x00c9:
            r0 = r33
            r8 = r26
            r24 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r31 = r2
            r30 = r27
            r2 = r5
            r9 = r3
            r3 = r34
            r26 = r4
            r22 = r11
            r11 = 1073741824(0x40000000, float:2.0)
            r32 = r21
            r21 = r13
            r13 = r32
            r4 = r28
            r11 = r5
            r5 = r35
            r25 = r9
            r27 = r13
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r6
            r6 = r29
            r0.mo3640a(r1, r2, r3, r4, r5, r6)
            r0 = r31
            if (r0 == r9) goto L_0x00fb
            r13.height = r0
        L_0x00fb:
            int r0 = r26.getMeasuredHeight()
            int r1 = r7.f2527f
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = r26
            int r4 = r7.mo3641b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f2527f = r1
            if (r15 == 0) goto L_0x011f
            r6 = r30
            int r2 = java.lang.Math.max(r0, r6)
            goto L_0x0122
        L_0x011f:
            r6 = r30
            r2 = r6
        L_0x0122:
            if (r14 < 0) goto L_0x012c
            int r5 = r11 + 1
            if (r14 != r5) goto L_0x012c
            int r0 = r7.f2527f
            r7.f2524c = r0
        L_0x012c:
            if (r11 >= r14) goto L_0x013d
            float r0 = r13.f2537g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0135
            goto L_0x013d
        L_0x0135:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x013d:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x014a
            int r0 = r13.width
            r1 = -1
            if (r0 != r1) goto L_0x014b
            r0 = 1
            r20 = 1
            goto L_0x014c
        L_0x014a:
            r1 = -1
        L_0x014b:
            r0 = 0
        L_0x014c:
            int r4 = r13.leftMargin
            int r5 = r13.rightMargin
            int r4 = r4 + r5
            int r5 = r3.getMeasuredWidth()
            int r5 = r5 + r4
            int r6 = java.lang.Math.max(r8, r5)
            int r8 = r3.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r10, r8)
            if (r19 == 0) goto L_0x016a
            int r10 = r13.width
            if (r10 != r1) goto L_0x016a
            r1 = 1
            goto L_0x016b
        L_0x016a:
            r1 = 0
        L_0x016b:
            float r10 = r13.f2537g
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x017f
            if (r0 == 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r4 = r5
        L_0x0175:
            r13 = r25
            int r0 = java.lang.Math.max(r13, r4)
            r13 = r0
            r0 = r27
            goto L_0x018a
        L_0x017f:
            r13 = r25
            if (r0 == 0) goto L_0x0184
            r5 = r4
        L_0x0184:
            r4 = r27
            int r0 = java.lang.Math.max(r4, r5)
        L_0x018a:
            int r3 = r7.mo3635a((android.view.View) r3, (int) r11)
            int r5 = r11 + r3
            r19 = r1
            r10 = r8
            r3 = r13
            r1 = r0
            r0 = r23
        L_0x0197:
            int r5 = r5 + 1
            r13 = r21
            r11 = r22
            r8 = r34
            r9 = r35
            r21 = r1
            r1 = r6
            goto L_0x002b
        L_0x01a6:
            r8 = r1
            r6 = r2
            r22 = r11
            r4 = r21
            r1 = -1
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = r13
            r13 = r3
            int r2 = r7.f2527f
            if (r2 <= 0) goto L_0x01c6
            r2 = r22
            boolean r3 = r7.mo3647c(r2)
            if (r3 == 0) goto L_0x01c8
            int r3 = r7.f2527f
            int r5 = r7.f2534m
            int r3 = r3 + r5
            r7.f2527f = r3
            goto L_0x01c8
        L_0x01c6:
            r2 = r22
        L_0x01c8:
            if (r15 == 0) goto L_0x0216
            r3 = r21
            if (r3 == r9) goto L_0x01d0
            if (r3 != 0) goto L_0x0218
        L_0x01d0:
            r5 = 0
            r7.f2527f = r5
            r5 = 0
        L_0x01d4:
            if (r5 >= r2) goto L_0x0218
            android.view.View r9 = r7.mo3642b((int) r5)
            if (r9 != 0) goto L_0x01e6
            int r9 = r7.f2527f
            int r11 = r7.mo3648d(r5)
            int r9 = r9 + r11
            r7.f2527f = r9
            goto L_0x0212
        L_0x01e6:
            int r11 = r9.getVisibility()
            r14 = 8
            if (r11 != r14) goto L_0x01f4
            int r9 = r7.mo3635a((android.view.View) r9, (int) r5)
            int r5 = r5 + r9
            goto L_0x0212
        L_0x01f4:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            android.support.v7.widget.ao$a r11 = (android.support.p020v7.widget.C0767ao.C0768a) r11
            int r14 = r7.f2527f
            int r21 = r14 + r6
            int r1 = r11.topMargin
            int r21 = r21 + r1
            int r1 = r11.bottomMargin
            int r21 = r21 + r1
            int r1 = r7.mo3641b((android.view.View) r9)
            int r1 = r21 + r1
            int r1 = java.lang.Math.max(r14, r1)
            r7.f2527f = r1
        L_0x0212:
            int r5 = r5 + 1
            r1 = -1
            goto L_0x01d4
        L_0x0216:
            r3 = r21
        L_0x0218:
            int r1 = r7.f2527f
            int r5 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r5 = r5 + r9
            int r1 = r1 + r5
            r7.f2527f = r1
            int r1 = r7.f2527f
            int r5 = r33.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r1, r5)
            r9 = r13
            r5 = r35
            r11 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r5, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r1
            int r13 = r7.f2527f
            int r11 = r11 - r13
            if (r18 != 0) goto L_0x0288
            if (r11 == 0) goto L_0x0248
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0248
            goto L_0x0288
        L_0x0248:
            int r0 = java.lang.Math.max(r4, r9)
            if (r15 == 0) goto L_0x0284
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L_0x0284
            r3 = 0
        L_0x0253:
            if (r3 >= r2) goto L_0x0284
            android.view.View r4 = r7.mo3642b((int) r3)
            if (r4 == 0) goto L_0x0281
            int r9 = r4.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0264
            goto L_0x0281
        L_0x0264:
            android.view.ViewGroup$LayoutParams r9 = r4.getLayoutParams()
            android.support.v7.widget.ao$a r9 = (android.support.p020v7.widget.C0767ao.C0768a) r9
            float r9 = r9.f2537g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0281
            int r9 = r4.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            r4.measure(r9, r13)
        L_0x0281:
            int r3 = r3 + 1
            goto L_0x0253
        L_0x0284:
            r11 = r34
            goto L_0x0371
        L_0x0288:
            float r6 = r7.f2528g
            int r9 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x028f
            r0 = r6
        L_0x028f:
            r6 = 0
            r7.f2527f = r6
            r9 = r0
            r0 = 0
        L_0x0294:
            if (r0 >= r2) goto L_0x0360
            android.view.View r13 = r7.mo3642b((int) r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02aa
            r21 = r3
            r22 = r11
            r11 = r34
            goto L_0x0357
        L_0x02aa:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.ao$a r14 = (android.support.p020v7.widget.C0767ao.C0768a) r14
            float r6 = r14.f2537g
            int r18 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0304
            float r15 = (float) r11
            float r15 = r15 * r6
            float r15 = r15 / r9
            int r15 = (int) r15
            float r9 = r9 - r6
            int r11 = r11 - r15
            int r6 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r6 = r6 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r34
            int r6 = getChildMeasureSpec(r11, r6, r9)
            int r9 = r14.height
            if (r9 != 0) goto L_0x02e5
            r9 = 1073741824(0x40000000, float:2.0)
            if (r3 == r9) goto L_0x02e2
            goto L_0x02e7
        L_0x02e2:
            if (r15 <= 0) goto L_0x02ef
            goto L_0x02f0
        L_0x02e5:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x02e7:
            int r22 = r13.getMeasuredHeight()
            int r15 = r22 + r15
            if (r15 >= 0) goto L_0x02f0
        L_0x02ef:
            r15 = 0
        L_0x02f0:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
            r13.measure(r6, r15)
            int r6 = r13.getMeasuredState()
            r6 = r6 & -256(0xffffffffffffff00, float:NaN)
            int r10 = android.view.View.combineMeasuredStates(r10, r6)
            r6 = r21
            goto L_0x0309
        L_0x0304:
            r6 = r11
            r11 = r34
            r18 = r9
        L_0x0309:
            int r9 = r14.leftMargin
            int r15 = r14.rightMargin
            int r9 = r9 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r9
            int r8 = java.lang.Math.max(r8, r15)
            r21 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0326
            int r3 = r14.width
            r22 = r6
            r6 = -1
            if (r3 != r6) goto L_0x0329
            r3 = 1
            goto L_0x032a
        L_0x0326:
            r22 = r6
            r6 = -1
        L_0x0329:
            r3 = 0
        L_0x032a:
            if (r3 == 0) goto L_0x032d
            r15 = r9
        L_0x032d:
            int r3 = java.lang.Math.max(r4, r15)
            if (r19 == 0) goto L_0x0339
            int r4 = r14.width
            if (r4 != r6) goto L_0x0339
            r4 = 1
            goto L_0x033a
        L_0x0339:
            r4 = 0
        L_0x033a:
            int r9 = r7.f2527f
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r9
            int r6 = r14.topMargin
            int r15 = r15 + r6
            int r6 = r14.bottomMargin
            int r15 = r15 + r6
            int r6 = r7.mo3641b((android.view.View) r13)
            int r15 = r15 + r6
            int r6 = java.lang.Math.max(r9, r15)
            r7.f2527f = r6
            r19 = r4
            r9 = r18
            r4 = r3
        L_0x0357:
            int r0 = r0 + 1
            r3 = r21
            r11 = r22
            r6 = 0
            goto L_0x0294
        L_0x0360:
            r11 = r34
            int r0 = r7.f2527f
            int r3 = r33.getPaddingTop()
            int r6 = r33.getPaddingBottom()
            int r3 = r3 + r6
            int r0 = r0 + r3
            r7.f2527f = r0
            r0 = r4
        L_0x0371:
            if (r19 != 0) goto L_0x0378
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0378
            goto L_0x0379
        L_0x0378:
            r0 = r8
        L_0x0379:
            int r3 = r33.getPaddingLeft()
            int r4 = r33.getPaddingRight()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r10)
            r7.setMeasuredDimension(r0, r1)
            if (r20 == 0) goto L_0x0397
            r7.m3909c(r2, r5)
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0767ao.mo3636a(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3637a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f2526e;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f2527f : getPaddingTop() + (((i4 - i2) - this.f2527f) / 2);
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View b = mo3642b(i11);
            if (b == null) {
                paddingTop += mo3648d(i11);
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0768a aVar = (C0768a) b.getLayoutParams();
                int i12 = aVar.f2538h;
                if (i12 < 0) {
                    i12 = i10;
                }
                int a = C0370d.m1575a(i12, C0388q.m1658e(this)) & 7;
                if (a == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i6 = i5 - aVar.rightMargin;
                } else if (a != 5) {
                    i6 = aVar.leftMargin + paddingLeft;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = i5 - aVar.rightMargin;
                }
                int i13 = i6;
                if (mo3647c(i11)) {
                    paddingTop += this.f2534m;
                }
                int i14 = paddingTop + aVar.topMargin;
                m3908a(b, i13, i14 + mo3634a(b), measuredWidth, measuredHeight);
                i11 += mo3635a(b, i11);
                paddingTop = i14 + measuredHeight + aVar.bottomMargin + mo3641b(b);
            }
            i11++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3638a(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View b = mo3642b(i);
            if (!(b == null || b.getVisibility() == 8 || !mo3647c(i))) {
                mo3639a(canvas, (b.getTop() - ((C0768a) b.getLayoutParams()).topMargin) - this.f2534m);
            }
        }
        if (mo3647c(virtualChildCount)) {
            View b2 = mo3642b(virtualChildCount - 1);
            mo3639a(canvas, b2 == null ? (getHeight() - getPaddingBottom()) - this.f2534m : b2.getBottom() + ((C0768a) b2.getLayoutParams()).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3639a(Canvas canvas, int i) {
        this.f2532k.setBounds(getPaddingLeft() + this.f2536o, i, (getWidth() - getPaddingRight()) - this.f2536o, this.f2534m + i);
        this.f2532k.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3640a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3641b(View view) {
        return 0;
    }

    /* renamed from: b */
    public C0768a generateLayoutParams(AttributeSet attributeSet) {
        return new C0768a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0768a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0768a(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3642b(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x039c, code lost:
        if (r3 > 0) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a7, code lost:
        if (r3 < 0) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a9, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03aa, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r3, r5), r2);
        r10 = android.view.View.combineMeasuredStates(r10, r14.getMeasuredState() & -16777216);
        r2 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3643b(int r38, int r39) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = 0
            r7.f2527f = r10
            int r11 = r37.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r38)
            int r13 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r7.f2530i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f2531j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f2530i = r0
            int[] r0 = new int[r14]
            r7.f2531j = r0
        L_0x0026:
            int[] r15 = r7.f2530i
            int[] r6 = r7.f2531j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f2522a
            boolean r3 = r7.f2529h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 1
            r29 = 0
        L_0x0063:
            r30 = r6
            r1 = 8
            if (r0 >= r11) goto L_0x0204
            android.view.View r6 = r7.mo3642b((int) r0)
            if (r6 != 0) goto L_0x007f
            int r1 = r7.f2527f
            int r6 = r7.mo3648d(r0)
            int r1 = r1 + r6
            r7.f2527f = r1
        L_0x0078:
            r33 = r3
            r36 = r4
            r8 = -1
            goto L_0x01f2
        L_0x007f:
            int r5 = r6.getVisibility()
            if (r5 != r1) goto L_0x008b
            int r1 = r7.mo3635a((android.view.View) r6, (int) r0)
            int r0 = r0 + r1
            goto L_0x0078
        L_0x008b:
            boolean r1 = r7.mo3647c(r0)
            if (r1 == 0) goto L_0x0098
            int r1 = r7.f2527f
            int r5 = r7.f2533l
            int r1 = r1 + r5
            r7.f2527f = r1
        L_0x0098:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r5 = r1
            android.support.v7.widget.ao$a r5 = (android.support.p020v7.widget.C0767ao.C0768a) r5
            float r1 = r5.f2537g
            float r21 = r21 + r1
            if (r12 != r2) goto L_0x00f0
            int r1 = r5.width
            if (r1 != 0) goto L_0x00f0
            float r1 = r5.f2537g
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f0
            if (r19 == 0) goto L_0x00ba
            int r1 = r7.f2527f
            int r2 = r5.leftMargin
            int r10 = r5.rightMargin
            int r2 = r2 + r10
            int r1 = r1 + r2
            goto L_0x00c6
        L_0x00ba:
            int r1 = r7.f2527f
            int r2 = r5.leftMargin
            int r2 = r2 + r1
            int r10 = r5.rightMargin
            int r2 = r2 + r10
            int r1 = java.lang.Math.max(r1, r2)
        L_0x00c6:
            r7.f2527f = r1
            if (r4 == 0) goto L_0x00df
            r1 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r6.measure(r2, r2)
            r35 = r0
            r33 = r3
            r36 = r4
            r9 = r5
            r3 = r6
            r8 = -1
            r32 = -2
            goto L_0x0169
        L_0x00df:
            r35 = r0
            r33 = r3
            r36 = r4
            r9 = r5
            r3 = r6
            r0 = 1073741824(0x40000000, float:2.0)
            r8 = -1
            r25 = 1
            r32 = -2
            goto L_0x016b
        L_0x00f0:
            int r1 = r5.width
            if (r1 != 0) goto L_0x00ff
            float r1 = r5.f2537g
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ff
            r10 = -2
            r5.width = r10
            r2 = 0
            goto L_0x0102
        L_0x00ff:
            r10 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0102:
            int r1 = (r21 > r20 ? 1 : (r21 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x010b
            int r1 = r7.f2527f
            r32 = r1
            goto L_0x010d
        L_0x010b:
            r32 = 0
        L_0x010d:
            r34 = 0
            r1 = r0
            r0 = r37
            r35 = r1
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6
            r10 = r2
            r2 = r35
            r33 = r3
            r3 = r38
            r36 = r4
            r4 = r32
            r9 = r5
            r8 = -1
            r5 = r39
            r31 = r6
            r32 = -2
            r6 = r34
            r0.mo3640a(r1, r2, r3, r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0135
            r9.width = r10
        L_0x0135:
            int r0 = r31.getMeasuredWidth()
            if (r19 == 0) goto L_0x014c
            int r1 = r7.f2527f
            int r2 = r9.leftMargin
            int r2 = r2 + r0
            int r3 = r9.rightMargin
            int r2 = r2 + r3
            r3 = r31
            int r4 = r7.mo3641b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x0161
        L_0x014c:
            r3 = r31
            int r1 = r7.f2527f
            int r2 = r1 + r0
            int r4 = r9.leftMargin
            int r2 = r2 + r4
            int r4 = r9.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo3641b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0161:
            r7.f2527f = r1
            if (r33 == 0) goto L_0x0169
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0169:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x016b:
            if (r13 == r0) goto L_0x0175
            int r1 = r9.height
            if (r1 != r8) goto L_0x0175
            r1 = 1
            r29 = 1
            goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            int r2 = r9.topMargin
            int r4 = r9.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r10 = r27
            int r5 = android.view.View.combineMeasuredStates(r10, r5)
            if (r36 == 0) goto L_0x01b7
            int r6 = r3.getBaseline()
            if (r6 == r8) goto L_0x01b7
            int r10 = r9.f2538h
            if (r10 >= 0) goto L_0x0199
            int r10 = r7.f2526e
            goto L_0x019b
        L_0x0199:
            int r10 = r9.f2538h
        L_0x019b:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r26 = 4
            int r10 = r10 >> 4
            r10 = r10 & -2
            int r10 = r10 >> 1
            r0 = r15[r10]
            int r0 = java.lang.Math.max(r0, r6)
            r15[r10] = r0
            r0 = r30[r10]
            int r6 = r4 - r6
            int r0 = java.lang.Math.max(r0, r6)
            r30[r10] = r0
        L_0x01b7:
            r0 = r22
            int r0 = java.lang.Math.max(r0, r4)
            if (r28 == 0) goto L_0x01c5
            int r6 = r9.height
            if (r6 != r8) goto L_0x01c5
            r6 = 1
            goto L_0x01c6
        L_0x01c5:
            r6 = 0
        L_0x01c6:
            float r9 = r9.f2537g
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d7
            if (r1 == 0) goto L_0x01cf
            goto L_0x01d0
        L_0x01cf:
            r2 = r4
        L_0x01d0:
            r9 = r24
            int r24 = java.lang.Math.max(r9, r2)
            goto L_0x01e4
        L_0x01d7:
            r9 = r24
            if (r1 == 0) goto L_0x01dc
            r4 = r2
        L_0x01dc:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r4)
            r24 = r9
        L_0x01e4:
            r10 = r35
            int r1 = r7.mo3635a((android.view.View) r3, (int) r10)
            int r1 = r1 + r10
            r22 = r0
            r0 = r1
            r27 = r5
            r28 = r6
        L_0x01f2:
            int r0 = r0 + 1
            r6 = r30
            r3 = r33
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r8 = r38
            r9 = r39
            r10 = 0
            goto L_0x0063
        L_0x0204:
            r33 = r3
            r36 = r4
            r0 = r22
            r2 = r23
            r9 = r24
            r10 = r27
            r8 = -1
            r32 = -2
            int r3 = r7.f2527f
            if (r3 <= 0) goto L_0x0224
            boolean r3 = r7.mo3647c(r11)
            if (r3 == 0) goto L_0x0224
            int r3 = r7.f2527f
            int r4 = r7.f2533l
            int r3 = r3 + r4
            r7.f2527f = r3
        L_0x0224:
            r3 = r15[r18]
            if (r3 != r8) goto L_0x0235
            r3 = 0
            r4 = r15[r3]
            if (r4 != r8) goto L_0x0235
            r3 = r15[r17]
            if (r3 != r8) goto L_0x0235
            r3 = r15[r16]
            if (r3 == r8) goto L_0x0265
        L_0x0235:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r6 = r15[r18]
            r8 = r15[r17]
            int r6 = java.lang.Math.max(r6, r8)
            int r5 = java.lang.Math.max(r5, r6)
            int r3 = java.lang.Math.max(r3, r5)
            r5 = r30[r16]
            r6 = r30[r4]
            r4 = r30[r18]
            r8 = r30[r17]
            int r4 = java.lang.Math.max(r4, r8)
            int r4 = java.lang.Math.max(r6, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = r3 + r4
            int r22 = java.lang.Math.max(r0, r3)
            r0 = r22
        L_0x0265:
            if (r33 == 0) goto L_0x02c2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x026d
            if (r12 != 0) goto L_0x02c2
        L_0x026d:
            r3 = 0
            r7.f2527f = r3
            r3 = 0
        L_0x0271:
            if (r3 >= r11) goto L_0x02c2
            android.view.View r4 = r7.mo3642b((int) r3)
            if (r4 != 0) goto L_0x0283
            int r4 = r7.f2527f
            int r5 = r7.mo3648d(r3)
            int r4 = r4 + r5
            r7.f2527f = r4
            goto L_0x02bd
        L_0x0283:
            int r5 = r4.getVisibility()
            if (r5 != r1) goto L_0x028f
            int r4 = r7.mo3635a((android.view.View) r4, (int) r3)
            int r3 = r3 + r4
            goto L_0x02bd
        L_0x028f:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.ao$a r5 = (android.support.p020v7.widget.C0767ao.C0768a) r5
            if (r19 == 0) goto L_0x02a8
            int r6 = r7.f2527f
            int r8 = r5.leftMargin
            int r8 = r8 + r14
            int r5 = r5.rightMargin
            int r8 = r8 + r5
            int r4 = r7.mo3641b((android.view.View) r4)
            int r8 = r8 + r4
            int r6 = r6 + r8
            r7.f2527f = r6
            goto L_0x02bd
        L_0x02a8:
            int r6 = r7.f2527f
            int r8 = r6 + r14
            int r1 = r5.leftMargin
            int r8 = r8 + r1
            int r1 = r5.rightMargin
            int r8 = r8 + r1
            int r1 = r7.mo3641b((android.view.View) r4)
            int r8 = r8 + r1
            int r1 = java.lang.Math.max(r6, r8)
            r7.f2527f = r1
        L_0x02bd:
            int r3 = r3 + 1
            r1 = 8
            goto L_0x0271
        L_0x02c2:
            int r1 = r7.f2527f
            int r3 = r37.getPaddingLeft()
            int r4 = r37.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f2527f = r1
            int r1 = r7.f2527f
            int r3 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r38
            r4 = 0
            r8 = -1
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r1
            int r5 = r7.f2527f
            int r4 = r4 - r5
            if (r25 != 0) goto L_0x0332
            if (r4 == 0) goto L_0x02f2
            int r6 = (r21 > r20 ? 1 : (r21 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x02f2
            goto L_0x0332
        L_0x02f2:
            int r2 = java.lang.Math.max(r2, r9)
            if (r33 == 0) goto L_0x032e
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x032e
            r4 = 0
        L_0x02fd:
            if (r4 >= r11) goto L_0x032e
            android.view.View r6 = r7.mo3642b((int) r4)
            if (r6 == 0) goto L_0x032b
            int r8 = r6.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x030e
            goto L_0x032b
        L_0x030e:
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            android.support.v7.widget.ao$a r8 = (android.support.p020v7.widget.C0767ao.C0768a) r8
            float r8 = r8.f2537g
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x032b
            r8 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r8)
            int r12 = r6.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            r6.measure(r9, r12)
        L_0x032b:
            int r4 = r4 + 1
            goto L_0x02fd
        L_0x032e:
            r4 = r39
            goto L_0x04c4
        L_0x0332:
            float r0 = r7.f2528g
            int r6 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0339
            goto L_0x033b
        L_0x0339:
            r0 = r21
        L_0x033b:
            r15[r16] = r8
            r15[r17] = r8
            r15[r18] = r8
            r6 = 0
            r15[r6] = r8
            r30[r16] = r8
            r30[r17] = r8
            r30[r18] = r8
            r30[r6] = r8
            r7.f2527f = r6
            r9 = r2
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0352:
            if (r0 >= r11) goto L_0x0470
            android.view.View r14 = r7.mo3642b((int) r0)
            if (r14 == 0) goto L_0x0463
            int r8 = r14.getVisibility()
            r5 = 8
            if (r8 != r5) goto L_0x0364
            goto L_0x0463
        L_0x0364:
            android.view.ViewGroup$LayoutParams r8 = r14.getLayoutParams()
            android.support.v7.widget.ao$a r8 = (android.support.p020v7.widget.C0767ao.C0768a) r8
            float r5 = r8.f2537g
            int r23 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03c1
            float r3 = (float) r4
            float r3 = r3 * r5
            float r3 = r3 / r2
            int r3 = (int) r3
            float r2 = r2 - r5
            int r4 = r4 - r3
            int r5 = r37.getPaddingTop()
            int r23 = r37.getPaddingBottom()
            int r5 = r5 + r23
            r23 = r2
            int r2 = r8.topMargin
            int r5 = r5 + r2
            int r2 = r8.bottomMargin
            int r5 = r5 + r2
            int r2 = r8.height
            r24 = r4
            r4 = r39
            int r2 = getChildMeasureSpec(r4, r5, r2)
            int r5 = r8.width
            if (r5 != 0) goto L_0x039f
            r5 = 1073741824(0x40000000, float:2.0)
            if (r12 == r5) goto L_0x039c
            goto L_0x03a1
        L_0x039c:
            if (r3 <= 0) goto L_0x03a9
            goto L_0x03aa
        L_0x039f:
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x03a1:
            int r25 = r14.getMeasuredWidth()
            int r3 = r25 + r3
            if (r3 >= 0) goto L_0x03aa
        L_0x03a9:
            r3 = 0
        L_0x03aa:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r14.measure(r3, r2)
            int r2 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r3
            int r10 = android.view.View.combineMeasuredStates(r10, r2)
            r2 = r23
            r3 = r24
            goto L_0x03c4
        L_0x03c1:
            r3 = r4
            r4 = r39
        L_0x03c4:
            if (r19 == 0) goto L_0x03e3
            int r5 = r7.f2527f
            int r23 = r14.getMeasuredWidth()
            r24 = r2
            int r2 = r8.leftMargin
            int r23 = r23 + r2
            int r2 = r8.rightMargin
            int r23 = r23 + r2
            int r2 = r7.mo3641b((android.view.View) r14)
            int r23 = r23 + r2
            int r5 = r5 + r23
            r7.f2527f = r5
            r23 = r3
            goto L_0x03ff
        L_0x03e3:
            r24 = r2
            int r2 = r7.f2527f
            int r5 = r14.getMeasuredWidth()
            int r5 = r5 + r2
            r23 = r3
            int r3 = r8.leftMargin
            int r5 = r5 + r3
            int r3 = r8.rightMargin
            int r5 = r5 + r3
            int r3 = r7.mo3641b((android.view.View) r14)
            int r5 = r5 + r3
            int r2 = java.lang.Math.max(r2, r5)
            r7.f2527f = r2
        L_0x03ff:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x040a
            int r2 = r8.height
            r3 = -1
            if (r2 != r3) goto L_0x040a
            r2 = 1
            goto L_0x040b
        L_0x040a:
            r2 = 0
        L_0x040b:
            int r3 = r8.topMargin
            int r5 = r8.bottomMargin
            int r3 = r3 + r5
            int r5 = r14.getMeasuredHeight()
            int r5 = r5 + r3
            int r6 = java.lang.Math.max(r6, r5)
            if (r2 == 0) goto L_0x041c
            goto L_0x041d
        L_0x041c:
            r3 = r5
        L_0x041d:
            int r2 = java.lang.Math.max(r9, r3)
            if (r28 == 0) goto L_0x042a
            int r3 = r8.height
            r9 = -1
            if (r3 != r9) goto L_0x042b
            r3 = 1
            goto L_0x042c
        L_0x042a:
            r9 = -1
        L_0x042b:
            r3 = 0
        L_0x042c:
            if (r36 == 0) goto L_0x0459
            int r14 = r14.getBaseline()
            if (r14 == r9) goto L_0x0459
            int r9 = r8.f2538h
            if (r9 >= 0) goto L_0x043b
            int r8 = r7.f2526e
            goto L_0x043d
        L_0x043b:
            int r8 = r8.f2538h
        L_0x043d:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r8 = r8 >> 4
            r8 = r8 & -2
            int r8 = r8 >> 1
            r9 = r15[r8]
            int r9 = java.lang.Math.max(r9, r14)
            r15[r8] = r9
            r9 = r30[r8]
            int r5 = r5 - r14
            int r5 = java.lang.Math.max(r9, r5)
            r30[r8] = r5
            goto L_0x045b
        L_0x0459:
            r25 = 4
        L_0x045b:
            r9 = r2
            r28 = r3
            r3 = r23
            r2 = r24
            goto L_0x0468
        L_0x0463:
            r3 = r4
            r4 = r39
            r25 = 4
        L_0x0468:
            int r0 = r0 + 1
            r4 = r3
            r3 = r38
            r8 = -1
            goto L_0x0352
        L_0x0470:
            r4 = r39
            int r0 = r7.f2527f
            int r2 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r2 = r2 + r3
            int r0 = r0 + r2
            r7.f2527f = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x0495
            r0 = 0
            r3 = r15[r0]
            if (r3 != r2) goto L_0x0495
            r0 = r15[r17]
            if (r0 != r2) goto L_0x0495
            r0 = r15[r16]
            if (r0 == r2) goto L_0x0493
            goto L_0x0495
        L_0x0493:
            r0 = r6
            goto L_0x04c3
        L_0x0495:
            r0 = r15[r16]
            r2 = 0
            r3 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r30[r16]
            r2 = r30[r2]
            r5 = r30[r18]
            r8 = r30[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04c3:
            r2 = r9
        L_0x04c4:
            if (r28 != 0) goto L_0x04cb
            r3 = 1073741824(0x40000000, float:2.0)
            if (r13 == r3) goto L_0x04cb
            r0 = r2
        L_0x04cb:
            int r2 = r37.getPaddingTop()
            int r3 = r37.getPaddingBottom()
            int r2 = r2 + r3
            int r0 = r0 + r2
            int r2 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r10
            r1 = r1 | r2
            int r2 = r10 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r29 == 0) goto L_0x04f1
            r0 = r38
            r7.m3910d(r11, r0)
        L_0x04f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0767ao.mo3643b(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3644b(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = android.support.p020v7.widget.C0866bq.m4743a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f2526e
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f2522a
            int[] r13 = r6.f2530i
            int[] r14 = r6.f2531j
            int r1 = android.support.p005v4.p017i.C0388q.m1658e(r24)
            int r1 = android.support.p005v4.p017i.C0370d.m1575a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f2527f
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f2527f
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0145
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo3642b((int) r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo3648d(r2)
            int r1 = r1 + r0
            goto L_0x012f
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x012d
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            android.support.v7.widget.ao$a r4 = (android.support.p020v7.widget.C0767ao.C0768a) r4
            if (r12 == 0) goto L_0x00a0
            r18 = r3
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a4
            int r3 = r0.getBaseline()
            goto L_0x00a5
        L_0x00a0:
            r18 = r3
            r19 = r10
        L_0x00a4:
            r3 = -1
        L_0x00a5:
            int r10 = r4.f2538h
            if (r10 >= 0) goto L_0x00aa
            r10 = r11
        L_0x00aa:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00e9
            r11 = 48
            if (r10 == r11) goto L_0x00d6
            r11 = 80
            if (r10 == r11) goto L_0x00bf
            r3 = r7
            r11 = -1
        L_0x00bc:
            r21 = 1
            goto L_0x00f7
        L_0x00bf:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00d4
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
        L_0x00d4:
            r3 = r10
            goto L_0x00bc
        L_0x00d6:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            if (r3 == r11) goto L_0x00e5
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
            goto L_0x00e7
        L_0x00e5:
            r21 = 1
        L_0x00e7:
            r3 = r10
            goto L_0x00f7
        L_0x00e9:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f7:
            boolean r10 = r6.mo3647c(r2)
            if (r10 == 0) goto L_0x0100
            int r10 = r6.f2533l
            int r1 = r1 + r10
        L_0x0100:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo3634a((android.view.View) r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m3908a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo3641b((android.view.View) r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo3635a((android.view.View) r0, (int) r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0139
        L_0x012d:
            r18 = r3
        L_0x012f:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0139:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0767ao.mo3644b(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3645b(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0866bq.m4743a(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View b = mo3642b(i4);
            if (!(b == null || b.getVisibility() == 8 || !mo3647c(i4))) {
                C0768a aVar = (C0768a) b.getLayoutParams();
                mo3646b(canvas, a ? b.getRight() + aVar.rightMargin : (b.getLeft() - aVar.leftMargin) - this.f2533l);
            }
        }
        if (mo3647c(virtualChildCount)) {
            View b2 = mo3642b(virtualChildCount - 1);
            if (b2 != null) {
                C0768a aVar2 = (C0768a) b2.getLayoutParams();
                if (a) {
                    i3 = b2.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = b2.getRight() + aVar2.rightMargin;
                    mo3646b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo3646b(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f2533l;
            mo3646b(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3646b(Canvas canvas, int i) {
        this.f2532k.setBounds(i, getPaddingTop() + this.f2536o, this.f2533l + i, (getHeight() - getPaddingBottom()) - this.f2536o);
        this.f2532k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3647c(int i) {
        if (i == 0) {
            return (this.f2535n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2535n & 4) != 0;
        }
        if ((this.f2535n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0768a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3648d(int i) {
        return 0;
    }

    public int getBaseline() {
        int i;
        if (this.f2523b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2523b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f2524c;
                if (this.f2525d == 1 && (i = this.f2526e & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2527f) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2527f;
                    }
                }
                return i3 + ((C0768a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f2523b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2523b;
    }

    public Drawable getDividerDrawable() {
        return this.f2532k;
    }

    public int getDividerPadding() {
        return this.f2536o;
    }

    public int getDividerWidth() {
        return this.f2533l;
    }

    public int getGravity() {
        return this.f2526e;
    }

    public int getOrientation() {
        return this.f2525d;
    }

    public int getShowDividers() {
        return this.f2535n;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2528g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0768a generateDefaultLayoutParams() {
        int i = this.f2525d;
        if (i == 0) {
            return new C0768a(-2, -2);
        }
        if (i == 1) {
            return new C0768a(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f2532k != null) {
            if (this.f2525d == 1) {
                mo3638a(canvas);
            } else {
                mo3645b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0767ao.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0767ao.class.getName());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2525d == 1) {
            mo3637a(i, i2, i3, i4);
        } else {
            mo3644b(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2525d == 1) {
            mo3636a(i, i2);
        } else {
            mo3643b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f2522a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f2523b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f2532k) {
            this.f2532k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f2533l = drawable.getIntrinsicWidth();
                this.f2534m = drawable.getIntrinsicHeight();
            } else {
                this.f2533l = 0;
                this.f2534m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f2536o = i;
    }

    public void setGravity(int i) {
        if (this.f2526e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2526e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2526e;
        if ((8388615 & i3) != i2) {
            this.f2526e = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2529h = z;
    }

    public void setOrientation(int i) {
        if (this.f2525d != i) {
            this.f2525d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2535n) {
            requestLayout();
        }
        this.f2535n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2526e;
        if ((i3 & 112) != i2) {
            this.f2526e = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2528g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
