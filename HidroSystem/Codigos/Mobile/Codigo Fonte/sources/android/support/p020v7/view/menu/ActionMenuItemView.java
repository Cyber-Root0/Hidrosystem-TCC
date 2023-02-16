package android.support.p020v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.widget.ActionMenuView;
import android.support.p020v7.widget.C0732ab;
import android.support.p020v7.widget.C0759al;
import android.support.p020v7.widget.C0850bk;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C0732ab implements C0671p.C0672a, ActionMenuView.C0687a, View.OnClickListener {

    /* renamed from: a */
    C0657j f1799a;

    /* renamed from: b */
    C0653h.C0655b f1800b;

    /* renamed from: c */
    C0639b f1801c;

    /* renamed from: d */
    private CharSequence f1802d;

    /* renamed from: e */
    private Drawable f1803e;

    /* renamed from: f */
    private C0759al f1804f;

    /* renamed from: g */
    private boolean f1805g;

    /* renamed from: h */
    private boolean f1806h;

    /* renamed from: i */
    private int f1807i;

    /* renamed from: j */
    private int f1808j;

    /* renamed from: k */
    private int f1809k;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0638a extends C0759al {
        public C0638a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0675s mo2571a() {
            if (ActionMenuItemView.this.f1801c != null) {
                return ActionMenuItemView.this.f1801c.mo2573a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r0 = mo2571a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2572b() {
            /*
                r3 = this;
                android.support.v7.view.menu.ActionMenuItemView r0 = android.support.p020v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.h$b r0 = r0.f1800b
                r1 = 0
                if (r0 == 0) goto L_0x0022
                android.support.v7.view.menu.ActionMenuItemView r0 = android.support.p020v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.h$b r0 = r0.f1800b
                android.support.v7.view.menu.ActionMenuItemView r2 = android.support.p020v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.j r2 = r2.f1799a
                boolean r0 = r0.mo2574a(r2)
                if (r0 == 0) goto L_0x0022
                android.support.v7.view.menu.s r0 = r3.mo2571a()
                if (r0 == 0) goto L_0x0022
                boolean r0 = r0.mo2648f()
                if (r0 == 0) goto L_0x0022
                r1 = 1
            L_0x0022:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.view.menu.ActionMenuItemView.C0638a.mo2572b():boolean");
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0639b {
        /* renamed from: a */
        public abstract C0675s mo2573a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1805g = m2927e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.ActionMenuItemView, i, 0);
        this.f1807i = obtainStyledAttributes.getDimensionPixelSize(C0526a.C0536j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1809k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1808j = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m2927e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m2928f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1802d);
        if (this.f1803e != null && (!this.f1799a.mo2797m() || (!this.f1805g && !this.f1806h))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1802d : null);
        CharSequence contentDescription = this.f1799a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1799a.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1799a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1799a.getTitle();
            }
            C0850bk.m4690a(this, charSequence);
            return;
        }
        C0850bk.m4690a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo187a(C0657j jVar, int i) {
        this.f1799a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo2760a((C0671p.C0672a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1804f == null) {
            this.f1804f = new C0638a();
        }
    }

    /* renamed from: a */
    public boolean mo2555a() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: b */
    public boolean mo188b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo2556c() {
        return mo2555a() && this.f1799a.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo2557d() {
        return mo2555a();
    }

    public C0657j getItemData() {
        return this.f1799a;
    }

    public void onClick(View view) {
        C0653h.C0655b bVar = this.f1800b;
        if (bVar != null) {
            bVar.mo2574a(this.f1799a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1805g = m2927e();
        m2928f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean a = mo2555a();
        if (a && (i3 = this.f1808j) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1807i) : this.f1807i;
        if (mode != 1073741824 && this.f1807i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!a && this.f1803e != null) {
            super.setPadding((getMeasuredWidth() - this.f1803e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0759al alVar;
        if (!this.f1799a.hasSubMenu() || (alVar = this.f1804f) == null || !alVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1806h != z) {
            this.f1806h = z;
            C0657j jVar = this.f1799a;
            if (jVar != null) {
                jVar.mo2787h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1803e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1809k;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f1809k;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m2928f();
    }

    public void setItemInvoker(C0653h.C0655b bVar) {
        this.f1800b = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1808j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0639b bVar) {
        this.f1801c = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1802d = charSequence;
        m2928f();
    }
}
