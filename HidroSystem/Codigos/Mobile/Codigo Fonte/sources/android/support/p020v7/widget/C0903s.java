package android.support.p020v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p005v4.widget.C0507k;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.s */
class C0903s extends PopupWindow {

    /* renamed from: a */
    private static final boolean f3050a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f3051b;

    public C0903s(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4903a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m4903a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0846bi a = C0846bi.m4625a(context, attributeSet, C0526a.C0536j.PopupWindow, i, i2);
        if (a.mo4305g(C0526a.C0536j.PopupWindow_overlapAnchor)) {
            mo4495a(a.mo4293a(C0526a.C0536j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo4291a(C0526a.C0536j.PopupWindow_android_popupBackground));
        int i3 = Build.VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && a.mo4305g(C0526a.C0536j.PopupWindow_android_popupAnimationStyle)) {
            setAnimationStyle(a.mo4304g(C0526a.C0536j.PopupWindow_android_popupAnimationStyle, -1));
        }
        a.mo4292a();
        if (Build.VERSION.SDK_INT < 14) {
            m4904a((PopupWindow) this);
        }
    }

    /* renamed from: a */
    private static void m4904a(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() {
                public void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference == null) {
                            return;
                        }
                        if (weakReference.get() != null) {
                            onScrollChangedListener.onScrollChanged();
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            });
        } catch (Exception e) {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    /* renamed from: a */
    public void mo4495a(boolean z) {
        if (f3050a) {
            this.f3051b = z;
        } else {
            C0507k.m2359a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f3050a && this.f3051b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3050a && this.f3051b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f3050a && this.f3051b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
