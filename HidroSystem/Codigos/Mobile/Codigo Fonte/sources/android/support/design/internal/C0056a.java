package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0045a;
import android.support.p020v7.widget.C0767ao;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: android.support.design.internal.a */
public class C0056a extends C0767ao {

    /* renamed from: a */
    protected boolean f155a;

    /* renamed from: b */
    boolean f156b;

    /* renamed from: c */
    private Drawable f157c;

    /* renamed from: d */
    private final Rect f158d;

    /* renamed from: e */
    private final Rect f159e;

    /* renamed from: f */
    private int f160f;

    public C0056a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0056a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158d = new Rect();
        this.f159e = new Rect();
        this.f160f = 119;
        this.f155a = true;
        this.f156b = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.ForegroundLinearLayout, i, 0);
        this.f160f = obtainStyledAttributes.getInt(C0045a.C0054i.ForegroundLinearLayout_android_foregroundGravity, this.f160f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0045a.C0054i.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f155a = obtainStyledAttributes.getBoolean(C0045a.C0054i.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f157c;
        if (drawable != null) {
            if (this.f156b) {
                this.f156b = false;
                Rect rect = this.f158d;
                Rect rect2 = this.f159e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f155a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f160f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f157c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f157c;
        if (drawable != null && drawable.isStateful()) {
            this.f157c.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f157c;
    }

    public int getForegroundGravity() {
        return this.f160f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f157c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f156b = z | this.f156b;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f156b = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f157c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f157c);
            }
            this.f157c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f160f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f160f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f160f = i;
            if (this.f160f == 119 && this.f157c != null) {
                this.f157c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f157c;
    }
}
