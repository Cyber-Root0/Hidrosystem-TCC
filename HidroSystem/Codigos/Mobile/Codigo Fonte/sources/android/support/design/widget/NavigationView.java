package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0045a;
import android.support.design.internal.C0057b;
import android.support.design.internal.C0058c;
import android.support.design.internal.C0073f;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.C0416y;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.support.p020v7.view.C0632g;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0669o;
import android.support.p020v7.widget.C0846bi;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class NavigationView extends C0073f {

    /* renamed from: d */
    private static final int[] f307d = {16842912};

    /* renamed from: e */
    private static final int[] f308e = {-16842910};

    /* renamed from: c */
    C0100a f309c;

    /* renamed from: f */
    private final C0057b f310f;

    /* renamed from: g */
    private final C0058c f311g;

    /* renamed from: h */
    private int f312h;

    /* renamed from: i */
    private MenuInflater f313i;

    /* renamed from: android.support.design.widget.NavigationView$a */
    public interface C0100a {
        /* renamed from: a */
        boolean mo550a(MenuItem menuItem);
    }

    /* renamed from: android.support.design.widget.NavigationView$b */
    public static class C0101b extends C0321a {
        public static final Parcelable.Creator<C0101b> CREATOR = new Parcelable.ClassLoaderCreator<C0101b>() {
            /* renamed from: a */
            public C0101b createFromParcel(Parcel parcel) {
                return new C0101b(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0101b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0101b(parcel, classLoader);
            }

            /* renamed from: a */
            public C0101b[] newArray(int i) {
                return new C0101b[i];
            }
        };

        /* renamed from: a */
        public Bundle f315a;

        public C0101b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f315a = parcel.readBundle(classLoader);
        }

        public C0101b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f315a);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        this.f311g = new C0058c();
        C0149m.m588a(context);
        this.f310f = new C0057b(context);
        C0846bi a = C0846bi.m4625a(context, attributeSet, C0045a.C0054i.NavigationView, i, C0045a.C0053h.Widget_Design_NavigationView);
        C0388q.m1644a((View) this, a.mo4291a(C0045a.C0054i.NavigationView_android_background));
        if (a.mo4305g(C0045a.C0054i.NavigationView_elevation)) {
            C0388q.m1638a((View) this, (float) a.mo4300e(C0045a.C0054i.NavigationView_elevation, 0));
        }
        C0388q.m1649a((View) this, a.mo4293a(C0045a.C0054i.NavigationView_android_fitsSystemWindows, false));
        this.f312h = a.mo4300e(C0045a.C0054i.NavigationView_android_maxWidth, 0);
        ColorStateList e = a.mo4305g(C0045a.C0054i.NavigationView_itemIconTint) ? a.mo4301e(C0045a.C0054i.NavigationView_itemIconTint) : m418c(16842808);
        if (a.mo4305g(C0045a.C0054i.NavigationView_itemTextAppearance)) {
            i2 = a.mo4304g(C0045a.C0054i.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList e2 = a.mo4305g(C0045a.C0054i.NavigationView_itemTextColor) ? a.mo4301e(C0045a.C0054i.NavigationView_itemTextColor) : null;
        if (!z && e2 == null) {
            e2 = m418c(16842806);
        }
        Drawable a2 = a.mo4291a(C0045a.C0054i.NavigationView_itemBackground);
        this.f310f.mo2690a((C0653h.C0654a) new C0653h.C0654a() {
            /* renamed from: a */
            public void mo548a(C0653h hVar) {
            }

            /* renamed from: a */
            public boolean mo549a(C0653h hVar, MenuItem menuItem) {
                return NavigationView.this.f309c != null && NavigationView.this.f309c.mo550a(menuItem);
            }
        });
        this.f311g.mo221a(1);
        this.f311g.mo222a(context, (C0653h) this.f310f);
        this.f311g.mo223a(e);
        if (z) {
            this.f311g.mo241c(i2);
        }
        this.f311g.mo237b(e2);
        this.f311g.mo224a(a2);
        this.f310f.mo2692a((C0669o) this.f311g);
        addView((View) this.f311g.mo220a((ViewGroup) this));
        if (a.mo4305g(C0045a.C0054i.NavigationView_menu)) {
            mo531a(a.mo4304g(C0045a.C0054i.NavigationView_menu, 0));
        }
        if (a.mo4305g(C0045a.C0054i.NavigationView_headerLayout)) {
            mo532b(a.mo4304g(C0045a.C0054i.NavigationView_headerLayout, 0));
        }
        a.mo4292a();
    }

    /* renamed from: c */
    private ColorStateList m418c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0616b.m2828a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0526a.C0527a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f308e, f307d, EMPTY_STATE_SET}, new int[]{a.getColorForState(f308e, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f313i == null) {
            this.f313i = new C0632g(getContext());
        }
        return this.f313i;
    }

    /* renamed from: a */
    public void mo531a(int i) {
        this.f311g.mo238b(true);
        getMenuInflater().inflate(i, this.f310f);
        this.f311g.mo238b(false);
        this.f311g.mo231a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo273a(C0416y yVar) {
        this.f311g.mo226a(yVar);
    }

    /* renamed from: b */
    public View mo532b(int i) {
        return this.f311g.mo236b(i);
    }

    public int getHeaderCount() {
        return this.f311g.mo242d();
    }

    public Drawable getItemBackground() {
        return this.f311g.mo245g();
    }

    public ColorStateList getItemIconTintList() {
        return this.f311g.mo243e();
    }

    public ColorStateList getItemTextColor() {
        return this.f311g.mo244f();
    }

    public Menu getMenu() {
        return this.f310f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f312h;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.f312h);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0101b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0101b bVar = (C0101b) parcelable;
        super.onRestoreInstanceState(bVar.mo1402a());
        this.f310f.mo2708b(bVar.f315a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0101b bVar = new C0101b(super.onSaveInstanceState());
        bVar.f315a = new Bundle();
        this.f310f.mo2689a(bVar.f315a);
        return bVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f310f.findItem(i);
        if (findItem != null) {
            this.f311g.mo228a((C0657j) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f311g.mo224a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0227a.m1070a(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f311g.mo223a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f311g.mo241c(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f311g.mo237b(colorStateList);
    }

    public void setNavigationItemSelectedListener(C0100a aVar) {
        this.f309c = aVar;
    }
}
