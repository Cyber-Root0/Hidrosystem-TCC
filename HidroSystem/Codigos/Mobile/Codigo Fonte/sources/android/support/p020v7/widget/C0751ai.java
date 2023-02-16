package android.support.p020v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p005v4.p017i.C0409u;
import android.support.p005v4.widget.C0505i;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.ai */
class C0751ai extends C0777aq {

    /* renamed from: g */
    private boolean f2446g;

    /* renamed from: h */
    private boolean f2447h;

    /* renamed from: i */
    private boolean f2448i;

    /* renamed from: j */
    private C0409u f2449j;

    /* renamed from: k */
    private C0505i f2450k;

    public C0751ai(Context context, boolean z) {
        super(context, (AttributeSet) null, C0526a.C0527a.dropDownListViewStyle);
        this.f2447h = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    private void m3842a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m3843a(View view, int i, float f, float f2) {
        View childAt;
        this.f2448i = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (!(this.f2588f == -1 || (childAt = getChildAt(this.f2588f - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f2588f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        mo3712a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: d */
    private void m3844d() {
        this.f2448i = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2588f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0409u uVar = this.f2449j;
        if (uVar != null) {
            uVar.mo1637b();
            this.f2449j = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3589a() {
        return this.f2448i || super.mo3589a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3590a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x0011;
                case 2: goto L_0x000f;
                case 3: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r9 = 0
            r3 = 1
            goto L_0x0041
        L_0x000c:
            r9 = 0
            r3 = 0
            goto L_0x0041
        L_0x000f:
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x0019
            goto L_0x000c
        L_0x0019:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x002c
            r9 = 1
            goto L_0x0041
        L_0x002c:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m3843a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x0009
            r7.m3842a((android.view.View) r3, (int) r5)
            goto L_0x0009
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            if (r9 == 0) goto L_0x0048
        L_0x0045:
            r7.m3844d()
        L_0x0048:
            if (r3 == 0) goto L_0x0060
            android.support.v4.widget.i r9 = r7.f2450k
            if (r9 != 0) goto L_0x0055
            android.support.v4.widget.i r9 = new android.support.v4.widget.i
            r9.<init>(r7)
            r7.f2450k = r9
        L_0x0055:
            android.support.v4.widget.i r9 = r7.f2450k
            r9.mo2049a((boolean) r2)
            android.support.v4.widget.i r9 = r7.f2450k
            r9.onTouch(r7, r8)
            goto L_0x0067
        L_0x0060:
            android.support.v4.widget.i r8 = r7.f2450k
            if (r8 == 0) goto L_0x0067
            r8.mo2049a((boolean) r1)
        L_0x0067:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0751ai.mo3590a(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f2447h || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f2447h || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f2447h || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f2447h && this.f2446g) || super.isInTouchMode();
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f2446g = z;
    }
}
