package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p020v7.view.menu.ActionMenuItemView;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.widget.C0767ao;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C0767ao implements C0653h.C0655b, C0671p {

    /* renamed from: a */
    C0653h.C0654a f2086a;

    /* renamed from: b */
    C0691e f2087b;

    /* renamed from: c */
    private C0653h f2088c;

    /* renamed from: d */
    private Context f2089d;

    /* renamed from: e */
    private int f2090e;

    /* renamed from: f */
    private boolean f2091f;

    /* renamed from: g */
    private C0868d f2092g;

    /* renamed from: h */
    private C0669o.C0670a f2093h;

    /* renamed from: i */
    private boolean f2094i;

    /* renamed from: j */
    private int f2095j;

    /* renamed from: k */
    private int f2096k;

    /* renamed from: l */
    private int f2097l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0687a {
        /* renamed from: c */
        boolean mo2556c();

        /* renamed from: d */
        boolean mo2557d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0688b implements C0669o.C0670a {
        C0688b() {
        }

        /* renamed from: a */
        public void mo2384a(C0653h hVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo2385a(C0653h hVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0689c extends C0767ao.C0768a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f2098a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f2099b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f2100c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f2101d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f2102e;

        /* renamed from: f */
        boolean f2103f;

        public C0689c(int i, int i2) {
            super(i, i2);
            this.f2098a = false;
        }

        public C0689c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0689c(C0689c cVar) {
            super(cVar);
            this.f2098a = cVar.f2098a;
        }

        public C0689c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0690d implements C0653h.C0654a {
        C0690d() {
        }

        /* renamed from: a */
        public void mo548a(C0653h hVar) {
            if (ActionMenuView.this.f2086a != null) {
                ActionMenuView.this.f2086a.mo548a(hVar);
            }
        }

        /* renamed from: a */
        public boolean mo549a(C0653h hVar, MenuItem menuItem) {
            return ActionMenuView.this.f2087b != null && ActionMenuView.this.f2087b.mo3067a(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0691e {
        /* renamed from: a */
        boolean mo3067a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2096k = (int) (56.0f * f);
        this.f2097l = (int) (f * 4.0f);
        this.f2089d = context;
        this.f2090e = 0;
    }

    /* renamed from: a */
    static int m3265a(View view, int i, int i2, int i3, int i4) {
        C0689c cVar = (C0689c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo2555a();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f2098a || !z2) {
            z = false;
        }
        cVar.f2101d = z;
        cVar.f2099b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0251 A[LOOP:5: B:135:0x0251->B:139:0x0270, LOOP_START, PHI: r13 
      PHI: (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:134:0x024f, B:139:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0278  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3266c(int r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r31
            int r6 = getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f2096k
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L_0x0035
            r0.setMeasuredDimension(r2, r9)
            return
        L_0x0035:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r29.getChildCount()
            r14 = r7
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0045:
            if (r7 >= r8) goto L_0x00c5
            android.view.View r11 = r0.getChildAt(r7)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L_0x0057
            goto L_0x00bf
        L_0x0057:
            boolean r3 = r11 instanceof android.support.p020v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0066
            int r9 = r0.f2097l
            r20 = r13
            r13 = 0
            r11.setPadding(r9, r13, r9, r13)
            goto L_0x0069
        L_0x0066:
            r20 = r13
            r13 = 0
        L_0x0069:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.p020v7.widget.ActionMenuView.C0689c) r9
            r9.f2103f = r13
            r9.f2100c = r13
            r9.f2099b = r13
            r9.f2101d = r13
            r9.leftMargin = r13
            r9.rightMargin = r13
            if (r3 == 0) goto L_0x0088
            r3 = r11
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.p020v7.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.mo2555a()
            if (r3 == 0) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            r9.f2102e = r3
            boolean r3 = r9.f2098a
            if (r3 == 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = r14
        L_0x0092:
            int r3 = m3265a(r11, r4, r3, r6, r5)
            int r13 = java.lang.Math.max(r15, r3)
            boolean r15 = r9.f2101d
            if (r15 == 0) goto L_0x00a0
            int r16 = r16 + 1
        L_0x00a0:
            boolean r9 = r9.f2098a
            if (r9 == 0) goto L_0x00a5
            r12 = 1
        L_0x00a5:
            int r14 = r14 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto L_0x00bb
            int r3 = r9 << r7
            r11 = r10
            long r9 = (long) r3
            long r9 = r17 | r9
            r17 = r9
            r10 = r11
            goto L_0x00bc
        L_0x00bb:
            r11 = r10
        L_0x00bc:
            r15 = r13
            r13 = r20
        L_0x00bf:
            int r7 = r7 + 1
            r3 = r19
            r9 = 0
            goto L_0x0045
        L_0x00c5:
            r19 = r3
            r3 = 2
            if (r12 == 0) goto L_0x00ce
            if (r13 != r3) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            if (r16 <= 0) goto L_0x0182
            if (r14 <= 0) goto L_0x0182
            r9 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            r11 = 0
            r20 = 0
        L_0x00de:
            if (r9 >= r8) goto L_0x0124
            android.view.View r22 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r22 = r22.getLayoutParams()
            r23 = r7
            r7 = r22
            android.support.v7.widget.ActionMenuView$c r7 = (android.support.p020v7.widget.ActionMenuView.C0689c) r7
            r22 = r10
            boolean r10 = r7.f2101d
            if (r10 != 0) goto L_0x00f8
        L_0x00f4:
            r7 = r1
            r24 = r2
            goto L_0x011a
        L_0x00f8:
            int r10 = r7.f2099b
            if (r10 >= r3) goto L_0x0109
            int r3 = r7.f2099b
            r10 = 1
            int r7 = r10 << r9
            long r10 = (long) r7
            r7 = r1
            r24 = r2
            r20 = r10
            r11 = 1
            goto L_0x011a
        L_0x0109:
            int r7 = r7.f2099b
            if (r7 != r3) goto L_0x00f4
            r7 = 1
            int r10 = r7 << r9
            r7 = r1
            r24 = r2
            long r1 = (long) r10
            long r1 = r20 | r1
            int r11 = r11 + 1
            r20 = r1
        L_0x011a:
            int r9 = r9 + 1
            r1 = r7
            r10 = r22
            r7 = r23
            r2 = r24
            goto L_0x00de
        L_0x0124:
            r24 = r2
            r23 = r7
            r22 = r10
            r7 = r1
            long r17 = r17 | r20
            if (r11 <= r14) goto L_0x0130
            goto L_0x0189
        L_0x0130:
            int r3 = r3 + 1
            r1 = 0
        L_0x0133:
            if (r1 >= r8) goto L_0x0179
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.p020v7.widget.ActionMenuView.C0689c) r9
            r10 = 1
            int r11 = r10 << r1
            long r10 = (long) r11
            long r25 = r20 & r10
            r27 = 0
            int r23 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r23 != 0) goto L_0x0154
            int r2 = r9.f2099b
            if (r2 != r3) goto L_0x0151
            long r17 = r17 | r10
        L_0x0151:
            r23 = r3
            goto L_0x0174
        L_0x0154:
            if (r5 == 0) goto L_0x0168
            boolean r10 = r9.f2102e
            if (r10 == 0) goto L_0x0168
            r10 = 1
            if (r14 != r10) goto L_0x0168
            int r11 = r0.f2097l
            int r10 = r11 + r4
            r23 = r3
            r3 = 0
            r2.setPadding(r10, r3, r11, r3)
            goto L_0x016a
        L_0x0168:
            r23 = r3
        L_0x016a:
            int r2 = r9.f2099b
            r3 = 1
            int r2 = r2 + r3
            r9.f2099b = r2
            r9.f2103f = r3
            int r14 = r14 + -1
        L_0x0174:
            int r1 = r1 + 1
            r3 = r23
            goto L_0x0133
        L_0x0179:
            r1 = r7
            r10 = r22
            r2 = r24
            r3 = 2
            r7 = 1
            goto L_0x00d0
        L_0x0182:
            r24 = r2
            r23 = r7
            r22 = r10
            r7 = r1
        L_0x0189:
            if (r12 != 0) goto L_0x0190
            r1 = 1
            if (r13 != r1) goto L_0x0191
            r2 = 1
            goto L_0x0192
        L_0x0190:
            r1 = 1
        L_0x0191:
            r2 = 0
        L_0x0192:
            if (r14 <= 0) goto L_0x024c
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x024c
            int r13 = r13 - r1
            if (r14 < r13) goto L_0x01a1
            if (r2 != 0) goto L_0x01a1
            if (r15 <= r1) goto L_0x024c
        L_0x01a1:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x01e4
            r2 = 1
            long r2 = r17 & r2
            r5 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x01c5
            r13 = 0
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p020v7.widget.ActionMenuView.C0689c) r2
            boolean r2 = r2.f2102e
            if (r2 != 0) goto L_0x01c6
            float r1 = r1 - r5
            goto L_0x01c6
        L_0x01c5:
            r13 = 0
        L_0x01c6:
            int r2 = r8 + -1
            r3 = 1
            int r9 = r3 << r2
            long r9 = (long) r9
            long r9 = r17 & r9
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x01e5
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p020v7.widget.ActionMenuView.C0689c) r2
            boolean r2 = r2.f2102e
            if (r2 != 0) goto L_0x01e5
            float r1 = r1 - r5
            goto L_0x01e5
        L_0x01e4:
            r13 = 0
        L_0x01e5:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01f0
            int r14 = r14 * r4
            float r2 = (float) r14
            float r2 = r2 / r1
            int r9 = (int) r2
            goto L_0x01f1
        L_0x01f0:
            r9 = 0
        L_0x01f1:
            r11 = r23
            r1 = 0
        L_0x01f4:
            if (r1 >= r8) goto L_0x0249
            r2 = 1
            int r3 = r2 << r1
            long r2 = (long) r3
            long r2 = r17 & r2
            r14 = 0
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0205
            r2 = 1
            r5 = 2
            goto L_0x0246
        L_0x0205:
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p020v7.widget.ActionMenuView.C0689c) r3
            boolean r2 = r2 instanceof android.support.p020v7.view.menu.ActionMenuItemView
            if (r2 == 0) goto L_0x0227
            r3.f2100c = r9
            r2 = 1
            r3.f2103f = r2
            if (r1 != 0) goto L_0x0224
            boolean r2 = r3.f2102e
            if (r2 != 0) goto L_0x0224
            int r2 = -r9
            r5 = 2
            int r2 = r2 / r5
            r3.leftMargin = r2
            goto L_0x0225
        L_0x0224:
            r5 = 2
        L_0x0225:
            r2 = 1
            goto L_0x0235
        L_0x0227:
            r5 = 2
            boolean r2 = r3.f2098a
            if (r2 == 0) goto L_0x0237
            r3.f2100c = r9
            r2 = 1
            r3.f2103f = r2
            int r10 = -r9
            int r10 = r10 / r5
            r3.rightMargin = r10
        L_0x0235:
            r11 = 1
            goto L_0x0246
        L_0x0237:
            r2 = 1
            if (r1 == 0) goto L_0x023e
            int r10 = r9 / 2
            r3.leftMargin = r10
        L_0x023e:
            int r10 = r8 + -1
            if (r1 == r10) goto L_0x0246
            int r10 = r9 / 2
            r3.rightMargin = r10
        L_0x0246:
            int r1 = r1 + 1
            goto L_0x01f4
        L_0x0249:
            r23 = r11
            goto L_0x024d
        L_0x024c:
            r13 = 0
        L_0x024d:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r23 == 0) goto L_0x0273
        L_0x0251:
            if (r13 >= r8) goto L_0x0273
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p020v7.widget.ActionMenuView.C0689c) r3
            boolean r5 = r3.f2103f
            if (r5 != 0) goto L_0x0262
            goto L_0x0270
        L_0x0262:
            int r5 = r3.f2099b
            int r5 = r5 * r4
            int r3 = r3.f2100c
            int r5 = r5 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.measure(r3, r6)
        L_0x0270:
            int r13 = r13 + 1
            goto L_0x0251
        L_0x0273:
            if (r7 == r1) goto L_0x0278
            r1 = r22
            goto L_0x027a
        L_0x0278:
            r1 = r19
        L_0x027a:
            r2 = r24
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.ActionMenuView.m3266c(int, int):void");
    }

    /* renamed from: a */
    public C0689c generateLayoutParams(AttributeSet attributeSet) {
        return new C0689c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0689c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo3057j();
        }
        C0689c cVar = layoutParams instanceof C0689c ? new C0689c((C0689c) layoutParams) : new C0689c(layoutParams);
        if (cVar.f2538h <= 0) {
            cVar.f2538h = 16;
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo200a(C0653h hVar) {
        this.f2088c = hVar;
    }

    /* renamed from: a */
    public void mo3035a(C0669o.C0670a aVar, C0653h.C0654a aVar2) {
        this.f2093h = aVar;
        this.f2086a = aVar2;
    }

    /* renamed from: a */
    public boolean mo3036a() {
        return this.f2091f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3037a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0687a)) {
            z = false | ((C0687a) childAt).mo2557d();
        }
        return (i <= 0 || !(childAt2 instanceof C0687a)) ? z : z | ((C0687a) childAt2).mo2556c();
    }

    /* renamed from: a */
    public boolean mo2574a(C0657j jVar) {
        return this.f2088c.mo2697a((MenuItem) jVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0689c mo3057j() {
        C0689c cVar = new C0689c(-2, -2);
        cVar.f2538h = 16;
        return cVar;
    }

    /* renamed from: c */
    public C0689c mo3041c() {
        C0689c b = mo3057j();
        b.f2098a = true;
        return b;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0689c);
    }

    /* renamed from: d */
    public C0653h mo3043d() {
        return this.f2088c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo3045e() {
        C0868d dVar = this.f2092g;
        return dVar != null && dVar.mo4355f();
    }

    /* renamed from: f */
    public boolean mo3046f() {
        C0868d dVar = this.f2092g;
        return dVar != null && dVar.mo4356g();
    }

    /* renamed from: g */
    public boolean mo3047g() {
        C0868d dVar = this.f2092g;
        return dVar != null && dVar.mo4359j();
    }

    public Menu getMenu() {
        if (this.f2088c == null) {
            Context context = getContext();
            this.f2088c = new C0653h(context);
            this.f2088c.mo2690a((C0653h.C0654a) new C0690d());
            this.f2092g = new C0868d(context);
            this.f2092g.mo4352c(true);
            C0868d dVar = this.f2092g;
            C0669o.C0670a aVar = this.f2093h;
            if (aVar == null) {
                aVar = new C0688b();
            }
            dVar.mo229a(aVar);
            this.f2088c.mo2693a((C0669o) this.f2092g, this.f2089d);
            this.f2092g.mo4351a(this);
        }
        return this.f2088c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2092g.mo4354e();
    }

    public int getPopupTheme() {
        return this.f2090e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo3055h() {
        C0868d dVar = this.f2092g;
        return dVar != null && dVar.mo4360k();
    }

    /* renamed from: i */
    public void mo3056i() {
        C0868d dVar = this.f2092g;
        if (dVar != null) {
            dVar.mo4357h();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0868d dVar = this.f2092g;
        if (dVar != null) {
            dVar.mo231a(false);
            if (this.f2092g.mo4359j()) {
                this.f2092g.mo4356g();
                this.f2092g.mo4355f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3056i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f2094i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0866bq.m4743a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0689c cVar = (C0689c) childAt.getLayoutParams();
                if (cVar.f2098a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo3037a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean a2 = mo3037a(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0689c cVar2 = (C0689c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2098a) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C0689c cVar3 = (C0689c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f2098a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i6++;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0653h hVar;
        boolean z = this.f2094i;
        this.f2094i = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2094i) {
            this.f2095j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f2094i || (hVar = this.f2088c) == null || size == this.f2095j)) {
            this.f2095j = size;
            hVar.mo264a(true);
        }
        int childCount = getChildCount();
        if (!this.f2094i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0689c cVar = (C0689c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m3266c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2092g.mo4353d(z);
    }

    public void setOnMenuItemClickListener(C0691e eVar) {
        this.f2087b = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2092g.mo4350a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f2091f = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2090e != i) {
            this.f2090e = i;
            if (i == 0) {
                this.f2089d = getContext();
            } else {
                this.f2089d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0868d dVar) {
        this.f2092g = dVar;
        this.f2092g.mo4351a(this);
    }
}
