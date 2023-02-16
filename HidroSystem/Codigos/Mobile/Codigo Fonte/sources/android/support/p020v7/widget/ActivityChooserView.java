package android.support.p020v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0367c;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0692a f2105a;

    /* renamed from: b */
    final FrameLayout f2106b;

    /* renamed from: c */
    final FrameLayout f2107c;

    /* renamed from: d */
    C0367c f2108d;

    /* renamed from: e */
    final DataSetObserver f2109e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f2110f;

    /* renamed from: g */
    boolean f2111g;

    /* renamed from: h */
    int f2112h;

    /* renamed from: i */
    private final C0693b f2113i;

    /* renamed from: j */
    private final C0767ao f2114j;

    /* renamed from: k */
    private final ImageView f2115k;

    /* renamed from: l */
    private final int f2116l;

    /* renamed from: m */
    private final ViewTreeObserver.OnGlobalLayoutListener f2117m;

    /* renamed from: n */
    private C0769ap f2118n;

    /* renamed from: o */
    private boolean f2119o;

    /* renamed from: p */
    private int f2120p;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends C0767ao {

        /* renamed from: a */
        private static final int[] f2121a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0846bi a = C0846bi.m4624a(context, attributeSet, f2121a);
            setBackgroundDrawable(a.mo4291a(0));
            a.mo4292a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0692a extends BaseAdapter {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2122a;

        /* renamed from: b */
        private C0878e f2123b;

        /* renamed from: c */
        private int f2124c;

        /* renamed from: d */
        private boolean f2125d;

        /* renamed from: e */
        private boolean f2126e;

        /* renamed from: f */
        private boolean f2127f;

        /* renamed from: a */
        public int mo3085a() {
            int i = this.f2124c;
            this.f2124c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f2124c = i;
            return i2;
        }

        /* renamed from: a */
        public void mo3086a(int i) {
            if (this.f2124c != i) {
                this.f2124c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo3087a(C0878e eVar) {
            C0878e d = this.f2122a.f2105a.mo3092d();
            if (d != null && this.f2122a.isShown()) {
                d.unregisterObserver(this.f2122a.f2109e);
            }
            this.f2123b = eVar;
            if (eVar != null && this.f2122a.isShown()) {
                eVar.registerObserver(this.f2122a.f2109e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo3088a(boolean z) {
            if (this.f2127f != z) {
                this.f2127f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo3089a(boolean z, boolean z2) {
            if (this.f2125d != z || this.f2126e != z2) {
                this.f2125d = z;
                this.f2126e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo mo3090b() {
            return this.f2123b.mo4374b();
        }

        /* renamed from: c */
        public int mo3091c() {
            return this.f2123b.mo4370a();
        }

        /* renamed from: d */
        public C0878e mo3092d() {
            return this.f2123b;
        }

        /* renamed from: e */
        public boolean mo3093e() {
            return this.f2125d;
        }

        public int getCount() {
            int a = this.f2123b.mo4370a();
            if (!this.f2125d && this.f2123b.mo4374b() != null) {
                a--;
            }
            int min = Math.min(a, this.f2124c);
            return this.f2127f ? min + 1 : min;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f2125d && this.f2123b.mo4374b() != null) {
                        i++;
                    }
                    return this.f2123b.mo4372a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f2127f || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0526a.C0532f.list_item) {
                        view = LayoutInflater.from(this.f2122a.getContext()).inflate(C0526a.C0533g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f2122a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0526a.C0532f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0526a.C0532f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f2125d || i != 0 || !this.f2126e) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(this.f2122a.getContext()).inflate(C0526a.C0533g.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(C0526a.C0532f.title)).setText(this.f2122a.getContext().getString(C0526a.C0534h.abc_activity_chooser_view_see_all));
                    return inflate;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0693b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2128a;

        /* renamed from: a */
        private void m3305a() {
            if (this.f2128a.f2110f != null) {
                this.f2128a.f2110f.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == this.f2128a.f2107c) {
                this.f2128a.mo3070b();
                Intent b = this.f2128a.f2105a.mo3092d().mo4373b(this.f2128a.f2105a.mo3092d().mo4371a(this.f2128a.f2105a.mo3090b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f2128a.getContext().startActivity(b);
                }
            } else if (view == this.f2128a.f2106b) {
                ActivityChooserView activityChooserView = this.f2128a;
                activityChooserView.f2111g = false;
                activityChooserView.mo3068a(activityChooserView.f2112h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m3305a();
            if (this.f2128a.f2108d != null) {
                this.f2128a.f2108d.mo1536a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0692a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f2128a.mo3070b();
                    if (!this.f2128a.f2111g) {
                        if (!this.f2128a.f2105a.mo3093e()) {
                            i++;
                        }
                        Intent b = this.f2128a.f2105a.mo3092d().mo4373b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f2128a.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f2128a.f2105a.mo3092d().mo4375c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f2128a.mo3068a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f2128a.f2107c) {
                if (this.f2128a.f2105a.getCount() > 0) {
                    ActivityChooserView activityChooserView = this.f2128a;
                    activityChooserView.f2111g = true;
                    activityChooserView.mo3068a(activityChooserView.f2112h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3068a(int i) {
        C0692a aVar;
        if (this.f2105a.mo3092d() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f2117m);
            boolean z = this.f2107c.getVisibility() == 0;
            int c = this.f2105a.mo3091c();
            if (i == Integer.MAX_VALUE || c <= i + (z ? 1 : 0)) {
                this.f2105a.mo3088a(false);
                aVar = this.f2105a;
            } else {
                this.f2105a.mo3088a(true);
                aVar = this.f2105a;
                i--;
            }
            aVar.mo3086a(i);
            C0769ap listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo2648f()) {
                if (this.f2111g || !z) {
                    this.f2105a.mo3089a(true, z);
                } else {
                    this.f2105a.mo3089a(false, false);
                }
                listPopupWindow.mo3690g(Math.min(this.f2105a.mo3085a(), this.f2116l));
                listPopupWindow.mo2646d();
                C0367c cVar = this.f2108d;
                if (cVar != null) {
                    cVar.mo1536a(true);
                }
                listPopupWindow.mo2649g().setContentDescription(getContext().getString(C0526a.C0534h.abc_activitychooserview_choose_application));
                listPopupWindow.mo2649g().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: a */
    public boolean mo3069a() {
        if (mo3071c() || !this.f2119o) {
            return false;
        }
        this.f2111g = false;
        mo3068a(this.f2112h);
        return true;
    }

    /* renamed from: b */
    public boolean mo3070b() {
        if (!mo3071c()) {
            return true;
        }
        getListPopupWindow().mo2647e();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f2117m);
        return true;
    }

    /* renamed from: c */
    public boolean mo3071c() {
        return getListPopupWindow().mo2648f();
    }

    public C0878e getDataModel() {
        return this.f2105a.mo3092d();
    }

    /* access modifiers changed from: package-private */
    public C0769ap getListPopupWindow() {
        if (this.f2118n == null) {
            this.f2118n = new C0769ap(getContext());
            this.f2118n.mo3679a((ListAdapter) this.f2105a);
            this.f2118n.mo3683b((View) this);
            this.f2118n.mo3681a(true);
            this.f2118n.mo3678a((AdapterView.OnItemClickListener) this.f2113i);
            this.f2118n.mo3680a((PopupWindow.OnDismissListener) this.f2113i);
        }
        return this.f2118n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0878e d = this.f2105a.mo3092d();
        if (d != null) {
            d.registerObserver(this.f2109e);
        }
        this.f2119o = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0878e d = this.f2105a.mo3092d();
        if (d != null) {
            d.unregisterObserver(this.f2109e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2117m);
        }
        if (mo3071c()) {
            mo3070b();
        }
        this.f2119o = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2114j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo3071c()) {
            mo3070b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0767ao aoVar = this.f2114j;
        if (this.f2107c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(aoVar, i, i2);
        setMeasuredDimension(aoVar.getMeasuredWidth(), aoVar.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0878e eVar) {
        this.f2105a.mo3087a(eVar);
        if (mo3071c()) {
            mo3070b();
            mo3069a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f2120p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2115k.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2115k.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f2112h = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f2110f = onDismissListener;
    }

    public void setProvider(C0367c cVar) {
        this.f2108d = cVar;
    }
}
