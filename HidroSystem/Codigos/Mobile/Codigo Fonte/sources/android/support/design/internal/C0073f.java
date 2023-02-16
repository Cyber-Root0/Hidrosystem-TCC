package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0045a;
import android.support.p005v4.p017i.C0386o;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0416y;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.design.internal.f */
public class C0073f extends FrameLayout {

    /* renamed from: a */
    Drawable f185a;

    /* renamed from: b */
    Rect f186b;

    /* renamed from: c */
    private Rect f187c;

    public C0073f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0073f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f187c = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.ScrimInsetsFrameLayout, i, C0045a.C0053h.Widget_Design_ScrimInsetsFrameLayout);
        this.f185a = obtainStyledAttributes.getDrawable(C0045a.C0054i.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0388q.m1646a((View) this, (C0386o) new C0386o() {
            /* renamed from: a */
            public C0416y mo277a(View view, C0416y yVar) {
                if (C0073f.this.f186b == null) {
                    C0073f.this.f186b = new Rect();
                }
                C0073f.this.f186b.set(yVar.mo1647a(), yVar.mo1649b(), yVar.mo1650c(), yVar.mo1651d());
                C0073f.this.mo273a(yVar);
                C0073f.this.setWillNotDraw(!yVar.mo1652e() || C0073f.this.f185a == null);
                C0388q.m1655c(C0073f.this);
                return yVar.mo1655g();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo273a(C0416y yVar) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f186b != null && this.f185a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f187c.set(0, 0, width, this.f186b.top);
            this.f185a.setBounds(this.f187c);
            this.f185a.draw(canvas);
            this.f187c.set(0, height - this.f186b.bottom, width, height);
            this.f185a.setBounds(this.f187c);
            this.f185a.draw(canvas);
            this.f187c.set(0, this.f186b.top, this.f186b.left, height - this.f186b.bottom);
            this.f185a.setBounds(this.f187c);
            this.f185a.draw(canvas);
            this.f187c.set(width - this.f186b.right, this.f186b.top, width, height - this.f186b.bottom);
            this.f185a.setBounds(this.f187c);
            this.f185a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f185a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f185a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }
}
