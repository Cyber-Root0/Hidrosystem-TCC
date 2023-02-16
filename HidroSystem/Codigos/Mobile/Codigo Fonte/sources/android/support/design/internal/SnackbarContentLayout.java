package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0045a;
import android.support.design.widget.C0107b;
import android.support.p005v4.p017i.C0388q;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements C0107b.C0121c {

    /* renamed from: a */
    private TextView f151a;

    /* renamed from: b */
    private Button f152b;

    /* renamed from: c */
    private int f153c;

    /* renamed from: d */
    private int f154d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.SnackbarLayout);
        this.f153c = obtainStyledAttributes.getDimensionPixelSize(C0045a.C0054i.SnackbarLayout_android_maxWidth, -1);
        this.f154d = obtainStyledAttributes.getDimensionPixelSize(C0045a.C0054i.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m127a(View view, int i, int i2) {
        if (C0388q.m1671r(view)) {
            C0388q.m1641a(view, C0388q.m1660g(view), i, C0388q.m1661h(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m128a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f151a.getPaddingTop() == i2 && this.f151a.getPaddingBottom() == i3) {
            return z;
        }
        m127a((View) this.f151a, i2, i3);
        return true;
    }

    /* renamed from: a */
    public void mo202a(int i, int i2) {
        this.f151a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f151a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f152b.getVisibility() == 0) {
            this.f152b.setAlpha(0.0f);
            this.f152b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo203b(int i, int i2) {
        this.f151a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f151a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f152b.getVisibility() == 0) {
            this.f152b.setAlpha(1.0f);
            this.f152b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f152b;
    }

    public TextView getMessageView() {
        return this.f151a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f151a = (TextView) findViewById(C0045a.C0050e.snackbar_text);
        this.f152b = (Button) findViewById(C0045a.C0050e.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m128a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m128a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f153c
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f153c
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = android.support.design.C0045a.C0048c.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = android.support.design.C0045a.C0048c.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f151a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f154d
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f152b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f154d
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m128a((int) r4, (int) r0, (int) r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m128a((int) r3, (int) r0, (int) r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
