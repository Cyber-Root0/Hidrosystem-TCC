package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f2356a;

    /* renamed from: b */
    private int f2357b;

    /* renamed from: c */
    private WeakReference<View> f2358c;

    /* renamed from: d */
    private LayoutInflater f2359d;

    /* renamed from: e */
    private C0728a f2360e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0728a {
        /* renamed from: a */
        void mo3456a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2356a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.ViewStubCompat, i, 0);
        this.f2357b = obtainStyledAttributes.getResourceId(C0526a.C0536j.ViewStubCompat_android_inflatedId, -1);
        this.f2356a = obtainStyledAttributes.getResourceId(C0526a.C0536j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0526a.C0536j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo3444a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2356a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2359d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2356a, viewGroup, false);
            int i = this.f2357b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2358c = new WeakReference<>(inflate);
            C0728a aVar = this.f2360e;
            if (aVar != null) {
                aVar.mo3456a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2357b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2359d;
    }

    public int getLayoutResource() {
        return this.f2356a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2357b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2359d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2356a = i;
    }

    public void setOnInflateListener(C0728a aVar) {
        this.f2360e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2358c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo3444a();
        }
    }
}
