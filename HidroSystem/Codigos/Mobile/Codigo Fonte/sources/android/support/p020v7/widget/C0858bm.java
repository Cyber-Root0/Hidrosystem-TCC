package android.support.p020v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p020v7.p021a.C0526a;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bm */
class C0858bm {

    /* renamed from: a */
    private final Context f2913a;

    /* renamed from: b */
    private final View f2914b;

    /* renamed from: c */
    private final TextView f2915c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f2916d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f2917e = new Rect();

    /* renamed from: f */
    private final int[] f2918f = new int[2];

    /* renamed from: g */
    private final int[] f2919g = new int[2];

    C0858bm(Context context) {
        this.f2913a = context;
        this.f2914b = LayoutInflater.from(this.f2913a).inflate(C0526a.C0533g.tooltip, (ViewGroup) null);
        this.f2915c = (TextView) this.f2914b.findViewById(C0526a.C0532f.message);
        this.f2916d.setTitle(getClass().getSimpleName());
        this.f2916d.packageName = this.f2913a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f2916d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0526a.C0535i.Animation_AppCompat_Tooltip;
        this.f2916d.flags = 24;
    }

    /* renamed from: a */
    private static View m4699a(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return view.getRootView();
    }

    /* renamed from: a */
    private void m4700a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        int dimensionPixelOffset = this.f2913a.getResources().getDimensionPixelOffset(C0526a.C0530d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2913a.getResources().getDimensionPixelOffset(C0526a.C0530d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2913a.getResources().getDimensionPixelOffset(z ? C0526a.C0530d.tooltip_y_offset_touch : C0526a.C0530d.tooltip_y_offset_non_touch);
        View a = m4699a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f2917e);
        if (this.f2917e.left < 0 && this.f2917e.top < 0) {
            Resources resources = this.f2913a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2917e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f2919g);
        view.getLocationOnScreen(this.f2918f);
        int[] iArr = this.f2918f;
        int i5 = iArr[0];
        int[] iArr2 = this.f2919g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (this.f2917e.width() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2914b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2914b.getMeasuredHeight();
        int[] iArr3 = this.f2918f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f2917e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4320a() {
        if (mo4322b()) {
            ((WindowManager) this.f2913a.getSystemService("window")).removeView(this.f2914b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4321a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo4322b()) {
            mo4320a();
        }
        this.f2915c.setText(charSequence);
        m4700a(view, i, i2, z, this.f2916d);
        ((WindowManager) this.f2913a.getSystemService("window")).addView(this.f2914b, this.f2916d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4322b() {
        return this.f2914b.getParent() != null;
    }
}
