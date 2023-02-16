package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0409u;
import android.support.p005v4.p017i.C0413v;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0729a extends ViewGroup {

    /* renamed from: a */
    protected final C0730a f2361a;

    /* renamed from: b */
    protected final Context f2362b;

    /* renamed from: c */
    protected ActionMenuView f2363c;

    /* renamed from: d */
    protected C0868d f2364d;

    /* renamed from: e */
    protected int f2365e;

    /* renamed from: f */
    protected C0409u f2366f;

    /* renamed from: g */
    private boolean f2367g;

    /* renamed from: h */
    private boolean f2368h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0730a implements C0413v {

        /* renamed from: a */
        int f2369a;

        /* renamed from: c */
        private boolean f2371c = false;

        protected C0730a() {
        }

        /* renamed from: a */
        public C0730a mo3460a(C0409u uVar, int i) {
            C0729a.this.f2366f = uVar;
            this.f2369a = i;
            return this;
        }

        /* renamed from: a */
        public void mo1643a(View view) {
            C0729a.super.setVisibility(0);
            this.f2371c = false;
        }

        /* renamed from: b */
        public void mo1644b(View view) {
            if (!this.f2371c) {
                C0729a aVar = C0729a.this;
                aVar.f2366f = null;
                C0729a.super.setVisibility(this.f2369a);
            }
        }

        /* renamed from: c */
        public void mo1645c(View view) {
            this.f2371c = true;
        }
    }

    C0729a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0729a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2361a = new C0730a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0526a.C0527a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2362b = context;
        } else {
            this.f2362b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m3700a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3457a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3458a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0409u mo2961a(int i, long j) {
        C0409u a;
        C0409u uVar = this.f2366f;
        if (uVar != null) {
            uVar.mo1637b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a = C0388q.m1664k(this).mo1630a(1.0f);
        } else {
            a = C0388q.m1664k(this).mo1630a(0.0f);
        }
        a.mo1631a(j);
        a.mo1632a((C0413v) this.f2361a.mo3460a(a, i));
        return a;
    }

    /* renamed from: a */
    public boolean mo2963a() {
        C0868d dVar = this.f2364d;
        if (dVar != null) {
            return dVar.mo4355f();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f2366f != null ? this.f2361a.f2369a : getVisibility();
    }

    public int getContentHeight() {
        return this.f2365e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0526a.C0536j.ActionBar, C0526a.C0527a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0526a.C0536j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0868d dVar = this.f2364d;
        if (dVar != null) {
            dVar.mo4349a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2368h = false;
        }
        if (!this.f2368h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2368h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2368h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2367g = false;
        }
        if (!this.f2367g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2367g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2367g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2365e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0409u uVar = this.f2366f;
            if (uVar != null) {
                uVar.mo1637b();
            }
            super.setVisibility(i);
        }
    }
}
