package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p003b.p004a.C0026c;
import android.support.p003b.p004a.C0037i;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p009c.C0239a;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p016h.C0294a;
import android.support.p005v4.p016h.C0301f;
import android.support.p005v4.p016h.C0302g;
import android.support.p005v4.p016h.C0320n;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.m */
public final class C0893m {

    /* renamed from: a */
    private static final PorterDuff.Mode f3021a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0893m f3022b;

    /* renamed from: c */
    private static final C0895b f3023c = new C0895b(6);

    /* renamed from: d */
    private static final int[] f3024d = {C0526a.C0531e.abc_textfield_search_default_mtrl_alpha, C0526a.C0531e.abc_textfield_default_mtrl_alpha, C0526a.C0531e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f3025e = {C0526a.C0531e.abc_ic_commit_search_api_mtrl_alpha, C0526a.C0531e.abc_seekbar_tick_mark_material, C0526a.C0531e.abc_ic_menu_share_mtrl_alpha, C0526a.C0531e.abc_ic_menu_copy_mtrl_am_alpha, C0526a.C0531e.abc_ic_menu_cut_mtrl_alpha, C0526a.C0531e.abc_ic_menu_selectall_mtrl_alpha, C0526a.C0531e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f3026f = {C0526a.C0531e.abc_textfield_activated_mtrl_alpha, C0526a.C0531e.abc_textfield_search_activated_mtrl_alpha, C0526a.C0531e.abc_cab_background_top_mtrl_alpha, C0526a.C0531e.abc_text_cursor_material, C0526a.C0531e.abc_text_select_handle_left_mtrl_dark, C0526a.C0531e.abc_text_select_handle_middle_mtrl_dark, C0526a.C0531e.abc_text_select_handle_right_mtrl_dark, C0526a.C0531e.abc_text_select_handle_left_mtrl_light, C0526a.C0531e.abc_text_select_handle_middle_mtrl_light, C0526a.C0531e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f3027g = {C0526a.C0531e.abc_popup_background_mtrl_mult, C0526a.C0531e.abc_cab_background_internal_bg, C0526a.C0531e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f3028h = {C0526a.C0531e.abc_tab_indicator_material, C0526a.C0531e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f3029i = {C0526a.C0531e.abc_btn_check_material, C0526a.C0531e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0320n<ColorStateList>> f3030j;

    /* renamed from: k */
    private C0294a<String, C0896c> f3031k;

    /* renamed from: l */
    private C0320n<String> f3032l;

    /* renamed from: m */
    private final Object f3033m = new Object();

    /* renamed from: n */
    private final WeakHashMap<Context, C0301f<WeakReference<Drawable.ConstantState>>> f3034n = new WeakHashMap<>(0);

    /* renamed from: o */
    private TypedValue f3035o;

    /* renamed from: p */
    private boolean f3036p;

    /* renamed from: android.support.v7.widget.m$a */
    private static class C0894a implements C0896c {
        C0894a() {
        }

        /* renamed from: a */
        public Drawable mo4457a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0026c.m45a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.m$b */
    private static class C0895b extends C0302g<Integer, PorterDuffColorFilter> {
        public C0895b(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m4888b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo4458a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo1294a(Integer.valueOf(m4888b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo4459a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo1295a(Integer.valueOf(m4888b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.m$c */
    private interface C0896c {
        /* renamed from: a */
        Drawable mo4457a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: android.support.v7.widget.m$d */
    private static class C0897d implements C0896c {
        C0897d() {
        }

        /* renamed from: a */
        public Drawable mo4457a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0037i.m81a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m4857a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static PorterDuff.Mode m4858a(int i) {
        if (i == C0526a.C0531e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m4859a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a = f3023c.mo4458a(i, mode);
        if (a != null) {
            return a;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f3023c.mo4459a(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m4860a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m4859a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m4861a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = mo4456b(context, i);
        if (b != null) {
            if (C0750ah.m3840b(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f = C0240a.m1134f(drawable);
            C0240a.m1124a(f, b);
            PorterDuff.Mode a = m4858a(i);
            if (a == null) {
                return f;
            }
            C0240a.m1127a(f, a);
            return f;
        }
        if (i == C0526a.C0531e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m4865a(layerDrawable.findDrawableByLayerId(16908288), C0841bd.m4613a(context, C0526a.C0527a.colorControlNormal), f3021a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0526a.C0527a.colorControlNormal;
        } else if (i == C0526a.C0531e.abc_ratingbar_material || i == C0526a.C0531e.abc_ratingbar_indicator_material || i == C0526a.C0531e.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            m4865a(layerDrawable.findDrawableByLayerId(16908288), C0841bd.m4617c(context, C0526a.C0527a.colorControlNormal), f3021a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0526a.C0527a.colorControlActivated;
        } else if (m4869a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        m4865a(findDrawableByLayerId, C0841bd.m4613a(context, i2), f3021a);
        m4865a(layerDrawable.findDrawableByLayerId(16908301), C0841bd.m4613a(context, C0526a.C0527a.colorControlActivated), f3021a);
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4862a(android.content.Context r5, long r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3033m
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.support.v4.h.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r4.f3034n     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002f }
            android.support.v4.h.f r1 = (android.support.p005v4.p016h.C0301f) r1     // Catch:{ all -> 0x002f }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x0010:
            java.lang.Object r3 = r1.mo1283a((long) r6)     // Catch:{ all -> 0x002f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002a
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable r5 = r3.newDrawable(r5)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r5
        L_0x002a:
            r1.mo1288b((long) r6)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0893m.m4862a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static C0893m m4863a() {
        if (f3022b == null) {
            f3022b = new C0893m();
            m4867a(f3022b);
        }
        return f3022b;
    }

    /* renamed from: a */
    private void m4864a(Context context, int i, ColorStateList colorStateList) {
        if (this.f3030j == null) {
            this.f3030j = new WeakHashMap<>();
        }
        C0320n nVar = this.f3030j.get(context);
        if (nVar == null) {
            nVar = new C0320n();
            this.f3030j.put(context, nVar);
        }
        nVar.mo1397c(i, colorStateList);
    }

    /* renamed from: a */
    private static void m4865a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0750ah.m3840b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3021a;
        }
        drawable.setColorFilter(m4859a(i, mode));
    }

    /* renamed from: a */
    static void m4866a(Drawable drawable, C0844bg bgVar, int[] iArr) {
        if (!C0750ah.m3840b(drawable) || drawable.mutate() == drawable) {
            if (bgVar.f2874d || bgVar.f2873c) {
                drawable.setColorFilter(m4860a(bgVar.f2874d ? bgVar.f2871a : null, bgVar.f2873c ? bgVar.f2872b : f3021a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m4867a(C0893m mVar) {
        if (Build.VERSION.SDK_INT < 24) {
            mVar.m4868a("vector", (C0896c) new C0897d());
            if (Build.VERSION.SDK_INT >= 11) {
                mVar.m4868a("animated-vector", (C0896c) new C0894a());
            }
        }
    }

    /* renamed from: a */
    private void m4868a(String str, C0896c cVar) {
        if (this.f3031k == null) {
            this.f3031k = new C0294a<>();
        }
        this.f3031k.put(str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m4869a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f3021a
            int[] r1 = f3024d
            boolean r1 = m4872a((int[]) r1, (int) r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = android.support.p020v7.p021a.C0526a.C0527a.colorControlNormal
        L_0x0012:
            r7 = 1
            r1 = -1
            goto L_0x0044
        L_0x0015:
            int[] r1 = f3026f
            boolean r1 = m4872a((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x0020
            int r2 = android.support.p020v7.p021a.C0526a.C0527a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f3027g
            boolean r1 = m4872a((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0044
        L_0x003c:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            boolean r7 = android.support.p020v7.widget.C0750ah.m3840b(r8)
            if (r7 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0050:
            int r6 = android.support.p020v7.widget.C0841bd.m4613a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m4859a((int) r6, (android.graphics.PorterDuff.Mode) r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0060
            r8.setAlpha(r1)
        L_0x0060:
            return r5
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0893m.m4869a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private boolean m4870a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f3033m) {
            C0301f fVar = this.f3034n.get(context);
            if (fVar == null) {
                fVar = new C0301f();
                this.f3034n.put(context, fVar);
            }
            fVar.mo1289b(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m4871a(Drawable drawable) {
        return (drawable instanceof C0037i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m4872a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private ColorStateList m4873b(Context context) {
        return m4880f(context, C0841bd.m4613a(context, C0526a.C0527a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m4874c(Context context) {
        return m4880f(context, 0);
    }

    /* renamed from: c */
    private Drawable m4875c(Context context, int i) {
        if (this.f3035o == null) {
            this.f3035o = new TypedValue();
        }
        TypedValue typedValue = this.f3035o;
        context.getResources().getValue(i, typedValue, true);
        long a = m4857a(typedValue);
        Drawable a2 = m4862a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0526a.C0531e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{mo4452a(context, C0526a.C0531e.abc_cab_background_internal_bg), mo4452a(context, C0526a.C0531e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m4870a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: d */
    private ColorStateList m4876d(Context context) {
        return m4880f(context, C0841bd.m4613a(context, C0526a.C0527a.colorAccent));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[Catch:{ Exception -> 0x00a4 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4877d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.m$c> r0 = r9.f3031k
            r1 = 0
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b6
            android.support.v4.h.n<java.lang.String> r0 = r9.f3032l
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo1390a(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.m$c> r2 = r9.f3031k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            android.support.v4.h.n r0 = new android.support.v4.h.n
            r0.<init>()
            r9.f3032l = r0
        L_0x002f:
            android.util.TypedValue r0 = r9.f3035o
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f3035o = r0
        L_0x003a:
            android.util.TypedValue r0 = r9.f3035o
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            r1.getValue(r11, r0, r2)
            long r3 = m4857a((android.util.TypedValue) r0)
            android.graphics.drawable.Drawable r5 = r9.m4862a((android.content.Context) r10, (long) r3)
            if (r5 == 0) goto L_0x004f
            return r5
        L_0x004f:
            java.lang.CharSequence r6 = r0.string
            if (r6 == 0) goto L_0x00ac
            java.lang.CharSequence r6 = r0.string
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ".xml"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x00ac
            android.content.res.XmlResourceParser r1 = r1.getXml(r11)     // Catch:{ Exception -> 0x00a4 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a4 }
        L_0x0069:
            int r7 = r1.next()     // Catch:{ Exception -> 0x00a4 }
            r8 = 2
            if (r7 == r8) goto L_0x0073
            if (r7 == r2) goto L_0x0073
            goto L_0x0069
        L_0x0073:
            if (r7 != r8) goto L_0x009c
            java.lang.String r2 = r1.getName()     // Catch:{ Exception -> 0x00a4 }
            android.support.v4.h.n<java.lang.String> r7 = r9.f3032l     // Catch:{ Exception -> 0x00a4 }
            r7.mo1397c(r11, r2)     // Catch:{ Exception -> 0x00a4 }
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.m$c> r7 = r9.f3031k     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Exception -> 0x00a4 }
            android.support.v7.widget.m$c r2 = (android.support.p020v7.widget.C0893m.C0896c) r2     // Catch:{ Exception -> 0x00a4 }
            if (r2 == 0) goto L_0x0091
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x00a4 }
            android.graphics.drawable.Drawable r1 = r2.mo4457a(r10, r1, r6, r7)     // Catch:{ Exception -> 0x00a4 }
            r5 = r1
        L_0x0091:
            if (r5 == 0) goto L_0x00ac
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a4 }
            r5.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a4 }
            r9.m4870a((android.content.Context) r10, (long) r3, (android.graphics.drawable.Drawable) r5)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ac
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = "No start tag found"
            r10.<init>(r0)     // Catch:{ Exception -> 0x00a4 }
            throw r10     // Catch:{ Exception -> 0x00a4 }
        L_0x00a4:
            r10 = move-exception
            java.lang.String r0 = "AppCompatDrawableManager"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r10)
        L_0x00ac:
            if (r5 != 0) goto L_0x00b5
            android.support.v4.h.n<java.lang.String> r10 = r9.f3032l
            java.lang.String r0 = "appcompat_skip_skip"
            r10.mo1397c(r11, r0)
        L_0x00b5:
            return r5
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0893m.m4877d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    private ColorStateList m4878e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C0841bd.m4616b(context, C0526a.C0527a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C0841bd.f2857a;
            iArr2[0] = C0841bd.m4617c(context, C0526a.C0527a.colorSwitchThumbNormal);
            iArr[1] = C0841bd.f2861e;
            iArr2[1] = C0841bd.m4613a(context, C0526a.C0527a.colorControlActivated);
            iArr[2] = C0841bd.f2864h;
            iArr2[2] = C0841bd.m4613a(context, C0526a.C0527a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0841bd.f2857a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C0841bd.f2861e;
            iArr2[1] = C0841bd.m4613a(context, C0526a.C0527a.colorControlActivated);
            iArr[2] = C0841bd.f2864h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: e */
    private ColorStateList m4879e(Context context, int i) {
        C0320n nVar;
        WeakHashMap<Context, C0320n<ColorStateList>> weakHashMap = this.f3030j;
        if (weakHashMap == null || (nVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) nVar.mo1390a(i);
    }

    /* renamed from: f */
    private ColorStateList m4880f(Context context, int i) {
        int a = C0841bd.m4613a(context, C0526a.C0527a.colorControlHighlight);
        int c = C0841bd.m4617c(context, C0526a.C0527a.colorButtonNormal);
        return new ColorStateList(new int[][]{C0841bd.f2857a, C0841bd.f2860d, C0841bd.f2858b, C0841bd.f2864h}, new int[]{c, C0239a.m1116a(a, i), C0239a.m1116a(a, i), i});
    }

    /* renamed from: f */
    private void m4881f(Context context) {
        if (!this.f3036p) {
            this.f3036p = true;
            Drawable a = mo4452a(context, C0526a.C0531e.abc_vector_test);
            if (a == null || !m4871a(a)) {
                this.f3036p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public Drawable mo4452a(Context context, int i) {
        return mo4453a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4453a(Context context, int i, boolean z) {
        m4881f(context);
        Drawable d = m4877d(context, i);
        if (d == null) {
            d = m4875c(context, i);
        }
        if (d == null) {
            d = C0227a.m1070a(context, i);
        }
        if (d != null) {
            d = m4861a(context, i, z, d);
        }
        if (d != null) {
            C0750ah.m3839a(d);
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4454a(Context context, C0859bn bnVar, int i) {
        Drawable d = m4877d(context, i);
        if (d == null) {
            d = bnVar.mo4323a(i);
        }
        if (d != null) {
            return m4861a(context, i, false, d);
        }
        return null;
    }

    /* renamed from: a */
    public void mo4455a(Context context) {
        synchronized (this.f3033m) {
            C0301f fVar = this.f3034n.get(context);
            if (fVar != null) {
                fVar.mo1291c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo4456b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            android.content.res.ColorStateList r0 = r2.m4879e(r3, r4)
            if (r0 != 0) goto L_0x007a
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_edit_text_material
            if (r4 != r1) goto L_0x0012
            int r0 = android.support.p020v7.p021a.C0526a.C0529c.abc_tint_edittext
        L_0x000c:
            android.content.res.ColorStateList r0 = android.support.p020v7.p022b.p023a.C0616b.m2828a(r3, r0)
            goto L_0x0075
        L_0x0012:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_switch_track_mtrl_alpha
            if (r4 != r1) goto L_0x0019
            int r0 = android.support.p020v7.p021a.C0526a.C0529c.abc_tint_switch_track
            goto L_0x000c
        L_0x0019:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_switch_thumb_material
            if (r4 != r1) goto L_0x0022
            android.content.res.ColorStateList r0 = r2.m4878e(r3)
            goto L_0x0075
        L_0x0022:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_btn_default_mtrl_shape
            if (r4 != r1) goto L_0x002b
            android.content.res.ColorStateList r0 = r2.m4873b(r3)
            goto L_0x0075
        L_0x002b:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_btn_borderless_material
            if (r4 != r1) goto L_0x0034
            android.content.res.ColorStateList r0 = r2.m4874c(r3)
            goto L_0x0075
        L_0x0034:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_btn_colored_material
            if (r4 != r1) goto L_0x003d
            android.content.res.ColorStateList r0 = r2.m4876d(r3)
            goto L_0x0075
        L_0x003d:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_spinner_mtrl_am_alpha
            if (r4 == r1) goto L_0x0072
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_spinner_textfield_background_material
            if (r4 != r1) goto L_0x0046
            goto L_0x0072
        L_0x0046:
            int[] r1 = f3025e
            boolean r1 = m4872a((int[]) r1, (int) r4)
            if (r1 == 0) goto L_0x0055
            int r0 = android.support.p020v7.p021a.C0526a.C0527a.colorControlNormal
            android.content.res.ColorStateList r0 = android.support.p020v7.widget.C0841bd.m4616b(r3, r0)
            goto L_0x0075
        L_0x0055:
            int[] r1 = f3028h
            boolean r1 = m4872a((int[]) r1, (int) r4)
            if (r1 == 0) goto L_0x0060
            int r0 = android.support.p020v7.p021a.C0526a.C0529c.abc_tint_default
            goto L_0x000c
        L_0x0060:
            int[] r1 = f3029i
            boolean r1 = m4872a((int[]) r1, (int) r4)
            if (r1 == 0) goto L_0x006b
            int r0 = android.support.p020v7.p021a.C0526a.C0529c.abc_tint_btn_checkable
            goto L_0x000c
        L_0x006b:
            int r1 = android.support.p020v7.p021a.C0526a.C0531e.abc_seekbar_thumb_material
            if (r4 != r1) goto L_0x0075
            int r0 = android.support.p020v7.p021a.C0526a.C0529c.abc_tint_seek_thumb
            goto L_0x000c
        L_0x0072:
            int r0 = android.support.p020v7.p021a.C0526a.C0529c.abc_tint_spinner
            goto L_0x000c
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            r2.m4864a((android.content.Context) r3, (int) r4, (android.content.res.ColorStateList) r0)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0893m.mo4456b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
