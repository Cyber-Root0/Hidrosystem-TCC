package android.support.p020v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.support.p020v7.p021a.C0526a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

/* renamed from: android.support.v7.widget.ac */
class C0733ac {

    /* renamed from: a */
    private static final RectF f2376a = new RectF();

    /* renamed from: b */
    private static Hashtable<String, Method> f2377b = new Hashtable<>();

    /* renamed from: c */
    private int f2378c = 0;

    /* renamed from: d */
    private boolean f2379d = false;

    /* renamed from: e */
    private float f2380e = -1.0f;

    /* renamed from: f */
    private float f2381f = -1.0f;

    /* renamed from: g */
    private float f2382g = -1.0f;

    /* renamed from: h */
    private int[] f2383h = new int[0];

    /* renamed from: i */
    private boolean f2384i = false;

    /* renamed from: j */
    private TextPaint f2385j;

    /* renamed from: k */
    private final TextView f2386k;

    /* renamed from: l */
    private final Context f2387l;

    C0733ac(TextView textView) {
        this.f2386k = textView;
        this.f2387l = this.f2386k.getContext();
    }

    /* renamed from: a */
    private int m3713a(RectF rectF) {
        int length = this.f2383h.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m3721a(this.f2383h[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f2383h[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @TargetApi(14)
    /* renamed from: a */
    private StaticLayout m3714a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT >= 16) {
            f2 = this.f2386k.getLineSpacingMultiplier();
            f = this.f2386k.getLineSpacingExtra();
            z = this.f2386k.getIncludeFontPadding();
        } else {
            f2 = ((Float) m3716a((Object) this.f2386k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            f = ((Float) m3716a((Object) this.f2386k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) m3716a((Object) this.f2386k, "getIncludeFontPadding", true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f2385j, i, alignment, f2, f, z);
    }

    @TargetApi(23)
    /* renamed from: a */
    private StaticLayout m3715a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m3716a((Object) this.f2386k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2385j, i).setAlignment(alignment).setLineSpacing(this.f2386k.getLineSpacingExtra(), this.f2386k.getLineSpacingMultiplier()).setIncludePad(this.f2386k.getIncludeFontPadding()).setBreakStrategy(this.f2386k.getBreakStrategy()).setHyphenationFrequency(this.f2386k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m3716a(Object obj, String str, T t) {
        try {
            return m3717a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m3717a(String str) {
        try {
            Method method = f2377b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2377b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m3718a(float f) {
        if (f != this.f2386k.getPaint().getTextSize()) {
            this.f2386k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2386k.isInLayout() : false;
            if (this.f2386k.getLayout() != null) {
                this.f2379d = false;
                try {
                    Method a = m3717a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f2386k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f2386k.requestLayout();
                } else {
                    this.f2386k.forceLayout();
                }
                this.f2386k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m3719a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f2378c = 1;
            this.f2381f = f;
            this.f2382g = f2;
            this.f2380e = f3;
            this.f2384i = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private void m3720a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2383h = m3722a(iArr);
            m3723h();
        }
    }

    /* renamed from: a */
    private boolean m3721a(int i, RectF rectF) {
        CharSequence text = this.f2386k.getText();
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f2386k.getMaxLines() : -1;
        TextPaint textPaint = this.f2385j;
        if (textPaint == null) {
            this.f2385j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2385j.set(this.f2386k.getPaint());
        this.f2385j.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) m3716a((Object) this.f2386k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout a = Build.VERSION.SDK_INT >= 23 ? m3715a(text, alignment, Math.round(rectF.right), maxLines) : m3714a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m3722a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private boolean m3723h() {
        int length = this.f2383h.length;
        this.f2384i = length > 0;
        if (this.f2384i) {
            this.f2378c = 1;
            int[] iArr = this.f2383h;
            this.f2381f = (float) iArr[0];
            this.f2382g = (float) iArr[length - 1];
            this.f2380e = -1.0f;
        }
        return this.f2384i;
    }

    /* renamed from: i */
    private boolean m3724i() {
        if (!m3726k() || this.f2378c != 1) {
            this.f2379d = false;
        } else {
            if (!this.f2384i || this.f2383h.length == 0) {
                float round = (float) Math.round(this.f2381f);
                int i = 1;
                while (Math.round(this.f2380e + round) <= Math.round(this.f2382g)) {
                    i++;
                    round += this.f2380e;
                }
                int[] iArr = new int[i];
                float f = this.f2381f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f2380e;
                }
                this.f2383h = m3722a(iArr);
            }
            this.f2379d = true;
        }
        return this.f2379d;
    }

    /* renamed from: j */
    private void m3725j() {
        this.f2378c = 0;
        this.f2381f = -1.0f;
        this.f2382g = -1.0f;
        this.f2380e = -1.0f;
        this.f2383h = new int[0];
        this.f2379d = false;
    }

    /* renamed from: k */
    private boolean m3726k() {
        return !(this.f2386k instanceof C0898n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3478a() {
        return this.f2378c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3479a(int i) {
        if (m3726k()) {
            switch (i) {
                case 0:
                    m3725j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f2387l.getResources().getDisplayMetrics();
                    m3719a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m3724i()) {
                        mo3488f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3480a(int i, float f) {
        Context context = this.f2387l;
        m3718a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3481a(int i, int i2, int i3, int i4) {
        if (m3726k()) {
            DisplayMetrics displayMetrics = this.f2387l.getResources().getDisplayMetrics();
            m3719a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m3724i()) {
                mo3488f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3482a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2387l.obtainStyledAttributes(attributeSet, C0526a.C0536j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextView_autoSizeTextType)) {
            this.f2378c = obtainStyledAttributes.getInt(C0526a.C0536j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0526a.C0536j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0526a.C0536j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0526a.C0536j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0526a.C0536j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0526a.C0536j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m3720a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m3726k()) {
            this.f2378c = 0;
        } else if (this.f2378c == 1) {
            if (!this.f2384i) {
                DisplayMetrics displayMetrics = this.f2387l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m3719a(dimension2, dimension3, dimension);
            }
            m3724i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3483a(int[] iArr, int i) {
        if (m3726k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2387l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f2383h = m3722a(iArr2);
                if (!m3723h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2384i = false;
            }
            if (m3724i()) {
                mo3488f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3484b() {
        return Math.round(this.f2380e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3485c() {
        return Math.round(this.f2381f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3486d() {
        return Math.round(this.f2382g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo3487e() {
        return this.f2383h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3488f() {
        if (mo3489g()) {
            if (this.f2379d) {
                if (this.f2386k.getMeasuredHeight() > 0 && this.f2386k.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m3716a((Object) this.f2386k, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.f2386k.getMeasuredWidth() - this.f2386k.getTotalPaddingLeft()) - this.f2386k.getTotalPaddingRight();
                    int height = (this.f2386k.getHeight() - this.f2386k.getCompoundPaddingBottom()) - this.f2386k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f2376a) {
                            f2376a.setEmpty();
                            f2376a.right = (float) measuredWidth;
                            f2376a.bottom = (float) height;
                            float a = (float) m3713a(f2376a);
                            if (a != this.f2386k.getTextSize()) {
                                mo3480a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2379d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo3489g() {
        return m3726k() && this.f2378c != 0;
    }
}
