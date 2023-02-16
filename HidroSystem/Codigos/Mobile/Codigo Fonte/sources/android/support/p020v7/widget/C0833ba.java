package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p020v7.app.C0550a;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0624a;
import android.support.p020v7.widget.C0767ao;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ba */
public class C0833ba extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    private static final Interpolator f2816j = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f2817a;

    /* renamed from: b */
    C0767ao f2818b;

    /* renamed from: c */
    int f2819c;

    /* renamed from: d */
    int f2820d;

    /* renamed from: e */
    private C0836b f2821e;

    /* renamed from: f */
    private Spinner f2822f;

    /* renamed from: g */
    private boolean f2823g;

    /* renamed from: h */
    private int f2824h;

    /* renamed from: i */
    private int f2825i;

    /* renamed from: android.support.v7.widget.ba$a */
    private class C0835a extends BaseAdapter {
        C0835a() {
        }

        public int getCount() {
            return C0833ba.this.f2818b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0837c) C0833ba.this.f2818b.getChildAt(i)).mo4257b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0833ba.this.mo4238a((C0550a.C0553c) getItem(i), true);
            }
            ((C0837c) view).mo4256a((C0550a.C0553c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.ba$b */
    private class C0836b implements View.OnClickListener {
        C0836b() {
        }

        public void onClick(View view) {
            ((C0837c) view).mo4257b().mo2250d();
            int childCount = C0833ba.this.f2818b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0833ba.this.f2818b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ba$c */
    private class C0837c extends C0767ao {

        /* renamed from: b */
        private final int[] f2831b = {16842964};

        /* renamed from: c */
        private C0550a.C0553c f2832c;

        /* renamed from: d */
        private TextView f2833d;

        /* renamed from: e */
        private ImageView f2834e;

        /* renamed from: f */
        private View f2835f;

        public C0837c(Context context, C0550a.C0553c cVar, boolean z) {
            super(context, (AttributeSet) null, C0526a.C0527a.actionBarTabStyle);
            this.f2832c = cVar;
            C0846bi a = C0846bi.m4625a(context, (AttributeSet) null, this.f2831b, C0526a.C0527a.actionBarTabStyle, 0);
            if (a.mo4305g(0)) {
                setBackgroundDrawable(a.mo4291a(0));
            }
            a.mo4292a();
            if (z) {
                setGravity(8388627);
            }
            mo4255a();
        }

        /* renamed from: a */
        public void mo4255a() {
            C0550a.C0553c cVar = this.f2832c;
            View c = cVar.mo2249c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f2835f = c;
                TextView textView = this.f2833d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2834e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2834e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f2835f;
            if (view != null) {
                removeView(view);
                this.f2835f = null;
            }
            Drawable a = cVar.mo2247a();
            CharSequence b = cVar.mo2248b();
            if (a != null) {
                if (this.f2834e == null) {
                    C0901q qVar = new C0901q(getContext());
                    C0767ao.C0768a aVar = new C0767ao.C0768a(-2, -2);
                    aVar.f2538h = 16;
                    qVar.setLayoutParams(aVar);
                    addView(qVar, 0);
                    this.f2834e = qVar;
                }
                this.f2834e.setImageDrawable(a);
                this.f2834e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2834e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2834e.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f2833d == null) {
                    C0732ab abVar = new C0732ab(getContext(), (AttributeSet) null, C0526a.C0527a.actionBarTabTextStyle);
                    abVar.setEllipsize(TextUtils.TruncateAt.END);
                    C0767ao.C0768a aVar2 = new C0767ao.C0768a(-2, -2);
                    aVar2.f2538h = 16;
                    abVar.setLayoutParams(aVar2);
                    addView(abVar);
                    this.f2833d = abVar;
                }
                this.f2833d.setText(b);
                this.f2833d.setVisibility(0);
            } else {
                TextView textView2 = this.f2833d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2833d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2834e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo2251e());
            }
            if (!z) {
                charSequence = cVar.mo2251e();
            }
            C0850bk.m4690a(this, charSequence);
        }

        /* renamed from: a */
        public void mo4256a(C0550a.C0553c cVar) {
            this.f2832c = cVar;
            mo4255a();
        }

        /* renamed from: b */
        public C0550a.C0553c mo4257b() {
            return this.f2832c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0550a.C0553c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0550a.C0553c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0833ba.this.f2819c > 0 && getMeasuredWidth() > C0833ba.this.f2819c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0833ba.this.f2819c, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private boolean m4556a() {
        Spinner spinner = this.f2822f;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: b */
    private void m4557b() {
        if (!m4556a()) {
            if (this.f2822f == null) {
                this.f2822f = m4559d();
            }
            removeView(this.f2818b);
            addView(this.f2822f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2822f.getAdapter() == null) {
                this.f2822f.setAdapter(new C0835a());
            }
            Runnable runnable = this.f2817a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2817a = null;
            }
            this.f2822f.setSelection(this.f2825i);
        }
    }

    /* renamed from: c */
    private boolean m4558c() {
        if (!m4556a()) {
            return false;
        }
        removeView(this.f2822f);
        addView(this.f2818b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2822f.getSelectedItemPosition());
        return false;
    }

    /* renamed from: d */
    private Spinner m4559d() {
        C0910y yVar = new C0910y(getContext(), (AttributeSet) null, C0526a.C0527a.actionDropDownStyle);
        yVar.setLayoutParams(new C0767ao.C0768a(-2, -1));
        yVar.setOnItemSelectedListener(this);
        return yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0837c mo4238a(C0550a.C0553c cVar, boolean z) {
        C0837c cVar2 = new C0837c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable((Drawable) null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2824h));
        } else {
            cVar2.setFocusable(true);
            if (this.f2821e == null) {
                this.f2821e = new C0836b();
            }
            cVar2.setOnClickListener(this.f2821e);
        }
        return cVar2;
    }

    /* renamed from: a */
    public void mo4239a(int i) {
        final View childAt = this.f2818b.getChildAt(i);
        Runnable runnable = this.f2817a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f2817a = new Runnable() {
            public void run() {
                C0833ba.this.smoothScrollTo(childAt.getLeft() - ((C0833ba.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0833ba.this.f2817a = null;
            }
        };
        post(this.f2817a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2817a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0624a a = C0624a.m2847a(getContext());
        setContentHeight(a.mo2489e());
        this.f2820d = a.mo2491g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2817a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0837c) view).mo4257b().mo2250d();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2818b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f2819c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f2819c = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f2819c, this.f2820d);
        }
        this.f2819c = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2824h, 1073741824);
        if (z2 || !this.f2823g) {
            z = false;
        }
        if (z) {
            this.f2818b.measure(0, makeMeasureSpec);
            if (this.f2818b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m4557b();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f2825i);
                    return;
                }
            }
        }
        m4558c();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2823g = z;
    }

    public void setContentHeight(int i) {
        this.f2824h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2825i = i;
        int childCount = this.f2818b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2818b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo4239a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2822f;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
