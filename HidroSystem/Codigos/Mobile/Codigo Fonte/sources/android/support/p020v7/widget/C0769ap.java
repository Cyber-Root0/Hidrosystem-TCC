package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.widget.C0507k;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0675s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ap */
public class C0769ap implements C0675s {

    /* renamed from: a */
    private static Method f2539a;

    /* renamed from: b */
    private static Method f2540b;

    /* renamed from: h */
    private static Method f2541h;

    /* renamed from: A */
    private Drawable f2542A;

    /* renamed from: B */
    private AdapterView.OnItemClickListener f2543B;

    /* renamed from: C */
    private AdapterView.OnItemSelectedListener f2544C;

    /* renamed from: D */
    private final C0775d f2545D;

    /* renamed from: E */
    private final C0774c f2546E;

    /* renamed from: F */
    private final C0772a f2547F;

    /* renamed from: G */
    private Runnable f2548G;

    /* renamed from: H */
    private final Rect f2549H;

    /* renamed from: I */
    private Rect f2550I;

    /* renamed from: J */
    private boolean f2551J;

    /* renamed from: c */
    C0751ai f2552c;

    /* renamed from: d */
    int f2553d;

    /* renamed from: e */
    final C0776e f2554e;

    /* renamed from: f */
    final Handler f2555f;

    /* renamed from: g */
    PopupWindow f2556g;

    /* renamed from: i */
    private Context f2557i;

    /* renamed from: j */
    private ListAdapter f2558j;

    /* renamed from: k */
    private int f2559k;

    /* renamed from: l */
    private int f2560l;

    /* renamed from: m */
    private int f2561m;

    /* renamed from: n */
    private int f2562n;

    /* renamed from: o */
    private int f2563o;

    /* renamed from: p */
    private boolean f2564p;

    /* renamed from: q */
    private boolean f2565q;

    /* renamed from: r */
    private boolean f2566r;

    /* renamed from: s */
    private boolean f2567s;

    /* renamed from: t */
    private int f2568t;

    /* renamed from: u */
    private boolean f2569u;

    /* renamed from: v */
    private boolean f2570v;

    /* renamed from: w */
    private View f2571w;

    /* renamed from: x */
    private int f2572x;

    /* renamed from: y */
    private DataSetObserver f2573y;

    /* renamed from: z */
    private View f2574z;

    /* renamed from: android.support.v7.widget.ap$a */
    private class C0772a implements Runnable {
        C0772a() {
        }

        public void run() {
            C0769ap.this.mo3698m();
        }
    }

    /* renamed from: android.support.v7.widget.ap$b */
    private class C0773b extends DataSetObserver {
        C0773b() {
        }

        public void onChanged() {
            if (C0769ap.this.mo2648f()) {
                C0769ap.this.mo2646d();
            }
        }

        public void onInvalidated() {
            C0769ap.this.mo2647e();
        }
    }

    /* renamed from: android.support.v7.widget.ap$c */
    private class C0774c implements AbsListView.OnScrollListener {
        C0774c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0769ap.this.mo3699n() && C0769ap.this.f2556g.getContentView() != null) {
                C0769ap.this.f2555f.removeCallbacks(C0769ap.this.f2554e);
                C0769ap.this.f2554e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ap$d */
    private class C0775d implements View.OnTouchListener {
        C0775d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C0769ap.this.f2556g != null && C0769ap.this.f2556g.isShowing() && x >= 0 && x < C0769ap.this.f2556g.getWidth() && y >= 0 && y < C0769ap.this.f2556g.getHeight()) {
                C0769ap.this.f2555f.postDelayed(C0769ap.this.f2554e, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0769ap.this.f2555f.removeCallbacks(C0769ap.this.f2554e);
                return false;
            }
        }
    }

    /* renamed from: android.support.v7.widget.ap$e */
    private class C0776e implements Runnable {
        C0776e() {
        }

        public void run() {
            if (C0769ap.this.f2552c != null && C0388q.m1678y(C0769ap.this.f2552c) && C0769ap.this.f2552c.getCount() > C0769ap.this.f2552c.getChildCount() && C0769ap.this.f2552c.getChildCount() <= C0769ap.this.f2553d) {
                C0769ap.this.f2556g.setInputMethodMode(2);
                C0769ap.this.mo2646d();
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f2539a = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            f2540b = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f2541h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0769ap(Context context) {
        this(context, (AttributeSet) null, C0526a.C0527a.listPopupWindowStyle);
    }

    public C0769ap(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0769ap(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2559k = -2;
        this.f2560l = -2;
        this.f2563o = 1002;
        this.f2565q = true;
        this.f2568t = 0;
        this.f2569u = false;
        this.f2570v = false;
        this.f2553d = Integer.MAX_VALUE;
        this.f2572x = 0;
        this.f2554e = new C0776e();
        this.f2545D = new C0775d();
        this.f2546E = new C0774c();
        this.f2547F = new C0772a();
        this.f2549H = new Rect();
        this.f2557i = context;
        this.f2555f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.ListPopupWindow, i, i2);
        this.f2561m = obtainStyledAttributes.getDimensionPixelOffset(C0526a.C0536j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f2562n = obtainStyledAttributes.getDimensionPixelOffset(C0526a.C0536j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f2562n != 0) {
            this.f2564p = true;
        }
        obtainStyledAttributes.recycle();
        this.f2556g = new C0903s(context, attributeSet, i, i2);
        this.f2556g.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m3929a(View view, int i, boolean z) {
        Method method = f2540b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2556g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2556g.getMaxAvailableHeight(view, i);
    }

    /* renamed from: a */
    private void mo4550a() {
        View view = this.f2571w;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2571w);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.support.v7.widget.ai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: android.support.v7.widget.ai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: android.support.v7.widget.ai} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo4553b() {
        /*
            r12 = this;
            android.support.v7.widget.ai r0 = r12.f2552c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00c0
            android.content.Context r0 = r12.f2557i
            android.support.v7.widget.ap$1 r5 = new android.support.v7.widget.ap$1
            r5.<init>()
            r12.f2548G = r5
            boolean r5 = r12.f2551J
            r5 = r5 ^ r3
            android.support.v7.widget.ai r5 = r12.mo3674a(r0, r5)
            r12.f2552c = r5
            android.graphics.drawable.Drawable r5 = r12.f2542A
            if (r5 == 0) goto L_0x0024
            android.support.v7.widget.ai r6 = r12.f2552c
            r6.setSelector(r5)
        L_0x0024:
            android.support.v7.widget.ai r5 = r12.f2552c
            android.widget.ListAdapter r6 = r12.f2558j
            r5.setAdapter(r6)
            android.support.v7.widget.ai r5 = r12.f2552c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f2543B
            r5.setOnItemClickListener(r6)
            android.support.v7.widget.ai r5 = r12.f2552c
            r5.setFocusable(r3)
            android.support.v7.widget.ai r5 = r12.f2552c
            r5.setFocusableInTouchMode(r3)
            android.support.v7.widget.ai r5 = r12.f2552c
            android.support.v7.widget.ap$2 r6 = new android.support.v7.widget.ap$2
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            android.support.v7.widget.ai r5 = r12.f2552c
            android.support.v7.widget.ap$c r6 = r12.f2546E
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f2544C
            if (r5 == 0) goto L_0x0056
            android.support.v7.widget.ai r6 = r12.f2552c
            r6.setOnItemSelectedListener(r5)
        L_0x0056:
            android.support.v7.widget.ai r5 = r12.f2552c
            android.view.View r6 = r12.f2571w
            if (r6 == 0) goto L_0x00b9
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f2572x
            switch(r8) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0089;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Invalid hint position "
            r5.append(r8)
            int r8 = r12.f2572x
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            goto L_0x0096
        L_0x0089:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0096
        L_0x0090:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0096:
            int r0 = r12.f2560l
            if (r0 < 0) goto L_0x009d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009f
        L_0x009d:
            r0 = 0
            r5 = 0
        L_0x009f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            android.widget.PopupWindow r6 = r12.f2556g
            r6.setContentView(r5)
            goto L_0x00de
        L_0x00c0:
            android.widget.PopupWindow r0 = r12.f2556g
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f2571w
            if (r0 == 0) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            android.widget.PopupWindow r5 = r12.f2556g
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x0100
            android.graphics.Rect r6 = r12.f2549H
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f2549H
            int r5 = r5.top
            android.graphics.Rect r6 = r12.f2549H
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r12.f2564p
            if (r6 != 0) goto L_0x0106
            android.graphics.Rect r6 = r12.f2549H
            int r6 = r6.top
            int r6 = -r6
            r12.f2562n = r6
            goto L_0x0106
        L_0x0100:
            android.graphics.Rect r5 = r12.f2549H
            r5.setEmpty()
            r5 = 0
        L_0x0106:
            android.widget.PopupWindow r6 = r12.f2556g
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r3 = 0
        L_0x0111:
            android.view.View r4 = r12.mo3693i()
            int r6 = r12.f2562n
            int r3 = r12.m3929a(r4, r6, r3)
            boolean r4 = r12.f2569u
            if (r4 != 0) goto L_0x0185
            int r4 = r12.f2559k
            if (r4 != r2) goto L_0x0124
            goto L_0x0185
        L_0x0124:
            int r2 = r12.f2560l
            r4 = 1073741824(0x40000000, float:2.0)
            switch(r2) {
                case -2: goto L_0x014c;
                case -1: goto L_0x0131;
                default: goto L_0x012b;
            }
        L_0x012b:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
        L_0x012f:
            r7 = r1
            goto L_0x0167
        L_0x0131:
            android.content.Context r1 = r12.f2557i
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.graphics.Rect r2 = r12.f2549H
            int r2 = r2.left
            android.graphics.Rect r6 = r12.f2549H
            int r6 = r6.right
            int r2 = r2 + r6
            int r1 = r1 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
            goto L_0x012f
        L_0x014c:
            android.content.Context r2 = r12.f2557i
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2549H
            int r4 = r4.left
            android.graphics.Rect r6 = r12.f2549H
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x012f
        L_0x0167:
            android.support.v7.widget.ai r6 = r12.f2552c
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo3710a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0183
            android.support.v7.widget.ai r2 = r12.f2552c
            int r2 = r2.getPaddingTop()
            android.support.v7.widget.ai r3 = r12.f2552c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0183:
            int r1 = r1 + r0
            return r1
        L_0x0185:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0769ap.mo4553b():int");
    }

    /* renamed from: c */
    private void mo3726c(boolean z) {
        Method method = f2539a;
        if (method != null) {
            try {
                method.invoke(this.f2556g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0751ai mo3674a(Context context, boolean z) {
        return new C0751ai(context, z);
    }

    /* renamed from: a */
    public void mo3675a(int i) {
        this.f2572x = i;
    }

    /* renamed from: a */
    public void mo3676a(Rect rect) {
        this.f2550I = rect;
    }

    /* renamed from: a */
    public void mo3677a(Drawable drawable) {
        this.f2556g.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo3678a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2543B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo3679a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2573y;
        if (dataSetObserver == null) {
            this.f2573y = new C0773b();
        } else {
            ListAdapter listAdapter2 = this.f2558j;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2558j = listAdapter;
        if (this.f2558j != null) {
            listAdapter.registerDataSetObserver(this.f2573y);
        }
        C0751ai aiVar = this.f2552c;
        if (aiVar != null) {
            aiVar.setAdapter(this.f2558j);
        }
    }

    /* renamed from: a */
    public void mo3680a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2556g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo3681a(boolean z) {
        this.f2551J = z;
        this.f2556g.setFocusable(z);
    }

    /* renamed from: b */
    public void mo3682b(int i) {
        this.f2556g.setAnimationStyle(i);
    }

    /* renamed from: b */
    public void mo3683b(View view) {
        this.f2574z = view;
    }

    /* renamed from: b */
    public void mo3684b(boolean z) {
        this.f2567s = true;
        this.f2566r = z;
    }

    /* renamed from: c */
    public void mo3685c(int i) {
        this.f2561m = i;
    }

    /* renamed from: c */
    public boolean mo3686c() {
        return this.f2551J;
    }

    /* renamed from: d */
    public void mo2646d() {
        int b = mo4553b();
        boolean n = mo3699n();
        C0507k.m2357a(this.f2556g, this.f2563o);
        boolean z = true;
        if (!this.f2556g.isShowing()) {
            int i = this.f2560l;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo3693i().getWidth();
            }
            int i2 = this.f2559k;
            if (i2 == -1) {
                b = -1;
            } else if (i2 != -2) {
                b = i2;
            }
            this.f2556g.setWidth(i);
            this.f2556g.setHeight(b);
            mo3726c(true);
            this.f2556g.setOutsideTouchable(!this.f2570v && !this.f2569u);
            this.f2556g.setTouchInterceptor(this.f2545D);
            if (this.f2567s) {
                C0507k.m2359a(this.f2556g, this.f2566r);
            }
            Method method = f2541h;
            if (method != null) {
                try {
                    method.invoke(this.f2556g, new Object[]{this.f2550I});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0507k.m2358a(this.f2556g, mo3693i(), this.f2561m, this.f2562n, this.f2568t);
            this.f2552c.setSelection(-1);
            if (!this.f2551J || this.f2552c.isInTouchMode()) {
                mo3698m();
            }
            if (!this.f2551J) {
                this.f2555f.post(this.f2547F);
            }
        } else if (C0388q.m1678y(mo3693i())) {
            int i3 = this.f2560l;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo3693i().getWidth();
            }
            int i4 = this.f2559k;
            if (i4 == -1) {
                if (!n) {
                    b = -1;
                }
                if (n) {
                    this.f2556g.setWidth(this.f2560l == -1 ? -1 : 0);
                    this.f2556g.setHeight(0);
                } else {
                    this.f2556g.setWidth(this.f2560l == -1 ? -1 : 0);
                    this.f2556g.setHeight(-1);
                }
            } else if (i4 != -2) {
                b = i4;
            }
            PopupWindow popupWindow = this.f2556g;
            if (this.f2570v || this.f2569u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f2556g.update(mo3693i(), this.f2561m, this.f2562n, i3 < 0 ? -1 : i3, b < 0 ? -1 : b);
        }
    }

    /* renamed from: d */
    public void mo3687d(int i) {
        this.f2562n = i;
        this.f2564p = true;
    }

    /* renamed from: e */
    public void mo2647e() {
        this.f2556g.dismiss();
        mo4550a();
        this.f2556g.setContentView((View) null);
        this.f2552c = null;
        this.f2555f.removeCallbacks(this.f2554e);
    }

    /* renamed from: e */
    public void mo3688e(int i) {
        this.f2568t = i;
    }

    /* renamed from: f */
    public void mo3689f(int i) {
        this.f2560l = i;
    }

    /* renamed from: f */
    public boolean mo2648f() {
        return this.f2556g.isShowing();
    }

    /* renamed from: g */
    public ListView mo2649g() {
        return this.f2552c;
    }

    /* renamed from: g */
    public void mo3690g(int i) {
        Drawable background = this.f2556g.getBackground();
        if (background != null) {
            background.getPadding(this.f2549H);
            this.f2560l = this.f2549H.left + this.f2549H.right + i;
            return;
        }
        mo3689f(i);
    }

    /* renamed from: h */
    public Drawable mo3691h() {
        return this.f2556g.getBackground();
    }

    /* renamed from: h */
    public void mo3692h(int i) {
        this.f2556g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public View mo3693i() {
        return this.f2574z;
    }

    /* renamed from: i */
    public void mo3694i(int i) {
        C0751ai aiVar = this.f2552c;
        if (mo2648f() && aiVar != null) {
            aiVar.setListSelectionHidden(false);
            aiVar.setSelection(i);
            if (aiVar.getChoiceMode() != 0) {
                aiVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public int mo3695j() {
        return this.f2561m;
    }

    /* renamed from: k */
    public int mo3696k() {
        if (!this.f2564p) {
            return 0;
        }
        return this.f2562n;
    }

    /* renamed from: l */
    public int mo3697l() {
        return this.f2560l;
    }

    /* renamed from: m */
    public void mo3698m() {
        C0751ai aiVar = this.f2552c;
        if (aiVar != null) {
            aiVar.setListSelectionHidden(true);
            aiVar.requestLayout();
        }
    }

    /* renamed from: n */
    public boolean mo3699n() {
        return this.f2556g.getInputMethodMode() == 2;
    }
}
