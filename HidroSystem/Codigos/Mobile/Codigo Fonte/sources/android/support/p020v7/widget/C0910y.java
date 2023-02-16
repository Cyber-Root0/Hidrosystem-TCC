package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p017i.C0387p;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.p022b.p023a.C0616b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.y */
public class C0910y extends Spinner implements C0387p {

    /* renamed from: a */
    private static final int[] f3067a = {16843505};

    /* renamed from: b */
    private final C0888h f3068b;

    /* renamed from: c */
    private final Context f3069c;

    /* renamed from: d */
    private C0759al f3070d;

    /* renamed from: e */
    private SpinnerAdapter f3071e;

    /* renamed from: f */
    private final boolean f3072f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0913b f3073g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f3074h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Rect f3075i;

    /* renamed from: android.support.v7.widget.y$a */
    private static class C0912a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f3078a;

        /* renamed from: b */
        private ListAdapter f3079b;

        public C0912a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3078a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3079b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0842be) {
                C0842be beVar = (C0842be) spinnerAdapter;
                if (beVar.mo4281a() == null) {
                    beVar.mo4282a(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3079b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f3079b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3078a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.y$b */
    private class C0913b extends C0769ap {

        /* renamed from: a */
        ListAdapter f3080a;

        /* renamed from: h */
        private CharSequence f3082h;

        /* renamed from: i */
        private final Rect f3083i = new Rect();

        public C0913b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo3683b((View) C0910y.this);
            mo3681a(true);
            mo3675a(0);
            mo3678a((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(C0910y.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C0910y.this.setSelection(i);
                    if (C0910y.this.getOnItemClickListener() != null) {
                        C0910y.this.performItemClick(view, i, C0913b.this.f3080a.getItemId(i));
                    }
                    C0913b.this.mo2647e();
                }
            });
        }

        /* renamed from: a */
        public CharSequence mo4550a() {
            return this.f3082h;
        }

        /* renamed from: a */
        public void mo3679a(ListAdapter listAdapter) {
            super.mo3679a(listAdapter);
            this.f3080a = listAdapter;
        }

        /* renamed from: a */
        public void mo4551a(CharSequence charSequence) {
            this.f3082h = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4552a(View view) {
            return C0388q.m1678y(view) && view.getGlobalVisibleRect(this.f3083i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4553b() {
            int i;
            Drawable h = mo3691h();
            int i2 = 0;
            if (h != null) {
                h.getPadding(C0910y.this.f3075i);
                i2 = C0866bq.m4743a(C0910y.this) ? C0910y.this.f3075i.right : -C0910y.this.f3075i.left;
            } else {
                Rect b = C0910y.this.f3075i;
                C0910y.this.f3075i.right = 0;
                b.left = 0;
            }
            int paddingLeft = C0910y.this.getPaddingLeft();
            int paddingRight = C0910y.this.getPaddingRight();
            int width = C0910y.this.getWidth();
            if (C0910y.this.f3074h == -2) {
                int a = C0910y.this.mo4515a((SpinnerAdapter) this.f3080a, mo3691h());
                int i3 = (C0910y.this.getContext().getResources().getDisplayMetrics().widthPixels - C0910y.this.f3075i.left) - C0910y.this.f3075i.right;
                if (a > i3) {
                    a = i3;
                }
                i = Math.max(a, (width - paddingLeft) - paddingRight);
            } else {
                i = C0910y.this.f3074h == -1 ? (width - paddingLeft) - paddingRight : C0910y.this.f3074h;
            }
            mo3690g(i);
            mo3685c(C0866bq.m4743a(C0910y.this) ? i2 + ((width - paddingRight) - mo3697l()) : i2 + paddingLeft);
        }

        /* renamed from: d */
        public void mo2646d() {
            ViewTreeObserver viewTreeObserver;
            boolean f = mo2648f();
            mo4553b();
            mo3692h(2);
            super.mo2646d();
            mo2649g().setChoiceMode(1);
            mo3694i(C0910y.this.getSelectedItemPosition());
            if (!f && (viewTreeObserver = C0910y.this.getViewTreeObserver()) != null) {
                final C09152 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        C0913b bVar = C0913b.this;
                        if (!bVar.mo4552a((View) C0910y.this)) {
                            C0913b.this.mo2647e();
                            return;
                        }
                        C0913b.this.mo4553b();
                        C0913b.super.mo2646d();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                mo3680a((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = C0910y.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }
    }

    public C0910y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.spinnerStyle);
    }

    public C0910y(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0910y(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r12 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (r12 != null) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0910y(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f3075i = r0
            int[] r0 = android.support.p020v7.p021a.C0526a.C0536j.Spinner
            r1 = 0
            android.support.v7.widget.bi r0 = android.support.p020v7.widget.C0846bi.m4625a(r8, r9, r0, r10, r1)
            android.support.v7.widget.h r2 = new android.support.v7.widget.h
            r2.<init>(r7)
            r7.f3068b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>((android.content.Context) r8, (android.content.res.Resources.Theme) r12)
        L_0x0020:
            r7.f3069c = r3
            goto L_0x003c
        L_0x0023:
            int r12 = android.support.p020v7.p021a.C0526a.C0536j.Spinner_popupTheme
            int r12 = r0.mo4304g(r12, r1)
            if (r12 == 0) goto L_0x0031
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>((android.content.Context) r8, (int) r12)
            goto L_0x0020
        L_0x0031:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0039
            r12 = r8
            goto L_0x003a
        L_0x0039:
            r12 = r2
        L_0x003a:
            r7.f3069c = r12
        L_0x003c:
            android.content.Context r12 = r7.f3069c
            r3 = 1
            if (r12 == 0) goto L_0x00b1
            r12 = -1
            if (r11 != r12) goto L_0x0079
            int r12 = android.os.Build.VERSION.SDK_INT
            r4 = 11
            if (r12 < r4) goto L_0x0078
            int[] r12 = f3067a     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            int r11 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x0060 }
        L_0x005a:
            if (r12 == 0) goto L_0x0079
        L_0x005c:
            r12.recycle()
            goto L_0x0079
        L_0x0060:
            r4 = move-exception
            goto L_0x0067
        L_0x0062:
            r8 = move-exception
            r12 = r2
            goto L_0x0072
        L_0x0065:
            r4 = move-exception
            r12 = r2
        L_0x0067:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x0071 }
            if (r12 == 0) goto L_0x0079
            goto L_0x005c
        L_0x0071:
            r8 = move-exception
        L_0x0072:
            if (r12 == 0) goto L_0x0077
            r12.recycle()
        L_0x0077:
            throw r8
        L_0x0078:
            r11 = 1
        L_0x0079:
            if (r11 != r3) goto L_0x00b1
            android.support.v7.widget.y$b r11 = new android.support.v7.widget.y$b
            android.content.Context r12 = r7.f3069c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f3069c
            int[] r4 = android.support.p020v7.p021a.C0526a.C0536j.Spinner
            android.support.v7.widget.bi r12 = android.support.p020v7.widget.C0846bi.m4625a(r12, r9, r4, r10, r1)
            int r1 = android.support.p020v7.p021a.C0526a.C0536j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.mo4302f(r1, r4)
            r7.f3074h = r1
            int r1 = android.support.p020v7.p021a.C0526a.C0536j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.mo4291a(r1)
            r11.mo3677a((android.graphics.drawable.Drawable) r1)
            int r1 = android.support.p020v7.p021a.C0526a.C0536j.Spinner_android_prompt
            java.lang.String r1 = r0.mo4299d(r1)
            r11.mo4551a((java.lang.CharSequence) r1)
            r12.mo4292a()
            r7.f3073g = r11
            android.support.v7.widget.y$1 r12 = new android.support.v7.widget.y$1
            r12.<init>(r7, r11)
            r7.f3070d = r12
        L_0x00b1:
            int r11 = android.support.p020v7.p021a.C0526a.C0536j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.mo4303f(r11)
            if (r11 == 0) goto L_0x00c9
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = android.support.p020v7.p021a.C0526a.C0533g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter((android.widget.SpinnerAdapter) r12)
        L_0x00c9:
            r0.mo4292a()
            r7.f3072f = r3
            android.widget.SpinnerAdapter r8 = r7.f3071e
            if (r8 == 0) goto L_0x00d7
            r7.setAdapter((android.widget.SpinnerAdapter) r8)
            r7.f3071e = r2
        L_0x00d7:
            android.support.v7.widget.h r8 = r7.f3068b
            r8.mo4414a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0910y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4515a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f3075i);
        return i2 + this.f3075i.left + this.f3075i.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            hVar.mo4417c();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            return bVar.mo3695j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            return bVar.mo3696k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f3073g != null) {
            return this.f3074h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            return bVar.mo3691h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f3073g != null) {
            return this.f3069c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        C0913b bVar = this.f3073g;
        return bVar != null ? bVar.mo4550a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            return hVar.mo4409a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            return hVar.mo4415b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0913b bVar = this.f3073g;
        if (bVar != null && bVar.mo2648f()) {
            this.f3073g.mo2647e();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3073g != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo4515a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0759al alVar = this.f3070d;
        if (alVar == null || !alVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0913b bVar = this.f3073g;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.mo2648f()) {
            return true;
        }
        this.f3073g.mo2646d();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3072f) {
            this.f3071e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3073g != null) {
            Context context = this.f3069c;
            if (context == null) {
                context = getContext();
            }
            this.f3073g.mo3679a((ListAdapter) new C0912a(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            hVar.mo4413a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            hVar.mo4410a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            bVar.mo3685c(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            bVar.mo3687d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f3073g != null) {
            this.f3074h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            bVar.mo3677a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0616b.m2831b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0913b bVar = this.f3073g;
        if (bVar != null) {
            bVar.mo4551a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            hVar.mo4411a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0888h hVar = this.f3068b;
        if (hVar != null) {
            hVar.mo4412a(mode);
        }
    }
}
