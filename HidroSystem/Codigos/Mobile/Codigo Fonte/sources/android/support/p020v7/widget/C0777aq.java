package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p020v7.p024c.p025a.C0619a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.aq */
public class C0777aq extends ListView {

    /* renamed from: g */
    private static final int[] f2582g = {0};

    /* renamed from: a */
    final Rect f2583a = new Rect();

    /* renamed from: b */
    int f2584b = 0;

    /* renamed from: c */
    int f2585c = 0;

    /* renamed from: d */
    int f2586d = 0;

    /* renamed from: e */
    int f2587e = 0;

    /* renamed from: f */
    protected int f2588f;

    /* renamed from: h */
    private Field f2589h;

    /* renamed from: i */
    private C0778a f2590i;

    /* renamed from: android.support.v7.widget.aq$a */
    private static class C0778a extends C0619a {

        /* renamed from: a */
        private boolean f2591a = true;

        public C0778a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3722a(boolean z) {
            this.f2591a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f2591a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f2591a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2591a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f2591a) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2591a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public C0777aq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            this.f2589h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2589h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int mo3710a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3711a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        mo3715b(i, view);
        if (z2) {
            Rect rect = this.f2583a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0240a.m1121a(selector, exactCenterX, exactCenterY);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3712a(int i, View view, float f, float f2) {
        mo3711a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0240a.m1121a(selector, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3713a(Canvas canvas) {
        Drawable selector;
        if (!this.f2583a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2583a);
            selector.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3589a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3714b() {
        Drawable selector = getSelector();
        if (selector != null && mo3716c()) {
            selector.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3715b(int i, View view) {
        Rect rect = this.f2583a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2584b;
        rect.top -= this.f2585c;
        rect.right += this.f2586d;
        rect.bottom += this.f2587e;
        try {
            boolean z = this.f2589h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f2589h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3716c() {
        return mo3589a() && isPressed();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        mo3713a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        mo3714b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2588f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        this.f2590i = drawable != null ? new C0778a(drawable) : null;
        super.setSelector(this.f2590i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2584b = rect.left;
        this.f2585c = rect.top;
        this.f2586d = rect.right;
        this.f2587e = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void setSelectorEnabled(boolean z) {
        C0778a aVar = this.f2590i;
        if (aVar != null) {
            aVar.mo3722a(z);
        }
    }
}
