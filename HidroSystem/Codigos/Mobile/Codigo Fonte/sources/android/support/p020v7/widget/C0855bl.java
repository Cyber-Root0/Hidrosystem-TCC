package android.support.p020v7.widget;

import android.support.p005v4.p017i.C0388q;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.bl */
class C0855bl implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: i */
    private static C0855bl f2902i;

    /* renamed from: a */
    private final View f2903a;

    /* renamed from: b */
    private final CharSequence f2904b;

    /* renamed from: c */
    private final Runnable f2905c = new Runnable() {
        public void run() {
            C0855bl.this.m4698a(false);
        }
    };

    /* renamed from: d */
    private final Runnable f2906d = new Runnable() {
        public void run() {
            C0855bl.this.m4694a();
        }
    };

    /* renamed from: e */
    private int f2907e;

    /* renamed from: f */
    private int f2908f;

    /* renamed from: g */
    private C0858bm f2909g;

    /* renamed from: h */
    private boolean f2910h;

    private C0855bl(View view, CharSequence charSequence) {
        this.f2903a = view;
        this.f2904b = charSequence;
        this.f2903a.setOnLongClickListener(this);
        this.f2903a.setOnHoverListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4694a() {
        if (f2902i == this) {
            f2902i = null;
            C0858bm bmVar = this.f2909g;
            if (bmVar != null) {
                bmVar.mo4320a();
                this.f2909g = null;
                this.f2903a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        this.f2903a.removeCallbacks(this.f2905c);
        this.f2903a.removeCallbacks(this.f2906d);
    }

    /* renamed from: a */
    public static void m4697a(View view, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0855bl blVar = f2902i;
            if (blVar != null && blVar.f2903a == view) {
                blVar.m4694a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0855bl(view, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4698a(boolean z) {
        long j;
        if (C0388q.m1678y(this.f2903a)) {
            C0855bl blVar = f2902i;
            if (blVar != null) {
                blVar.m4694a();
            }
            f2902i = this;
            this.f2910h = z;
            this.f2909g = new C0858bm(this.f2903a.getContext());
            this.f2909g.mo4321a(this.f2903a, this.f2907e, this.f2908f, this.f2910h, this.f2904b);
            this.f2903a.addOnAttachStateChangeListener(this);
            if (this.f2910h) {
                j = 2500;
            } else {
                j = ((C0388q.m1667n(this.f2903a) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f2903a.removeCallbacks(this.f2906d);
            this.f2903a.postDelayed(this.f2906d, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2909g != null && this.f2910h) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2903a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m4694a();
            }
        } else if (this.f2903a.isEnabled() && this.f2909g == null) {
            this.f2907e = (int) motionEvent.getX();
            this.f2908f = (int) motionEvent.getY();
            this.f2903a.removeCallbacks(this.f2905c);
            this.f2903a.postDelayed(this.f2905c, (long) ViewConfiguration.getLongPressTimeout());
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2907e = view.getWidth() / 2;
        this.f2908f = view.getHeight() / 2;
        m4698a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        m4694a();
    }
}
