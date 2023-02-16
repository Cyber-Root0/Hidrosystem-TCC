package android.support.p020v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p005v4.p017i.C0321a;
import android.support.p005v4.widget.C0493e;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0627c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C0767ao implements C0627c {

    /* renamed from: i */
    static final C0704a f2193i = new C0704a();

    /* renamed from: A */
    private View.OnClickListener f2194A;

    /* renamed from: B */
    private boolean f2195B;

    /* renamed from: C */
    private boolean f2196C;

    /* renamed from: D */
    private boolean f2197D;

    /* renamed from: E */
    private CharSequence f2198E;

    /* renamed from: F */
    private boolean f2199F;

    /* renamed from: G */
    private boolean f2200G;

    /* renamed from: H */
    private int f2201H;

    /* renamed from: I */
    private boolean f2202I;

    /* renamed from: J */
    private CharSequence f2203J;

    /* renamed from: K */
    private boolean f2204K;

    /* renamed from: L */
    private int f2205L;

    /* renamed from: M */
    private Bundle f2206M;

    /* renamed from: N */
    private final Runnable f2207N;

    /* renamed from: O */
    private Runnable f2208O;

    /* renamed from: P */
    private final WeakHashMap<String, Drawable.ConstantState> f2209P;

    /* renamed from: a */
    final SearchAutoComplete f2210a;

    /* renamed from: b */
    final ImageView f2211b;

    /* renamed from: c */
    final ImageView f2212c;

    /* renamed from: d */
    final ImageView f2213d;

    /* renamed from: e */
    final ImageView f2214e;

    /* renamed from: f */
    View.OnFocusChangeListener f2215f;

    /* renamed from: g */
    C0493e f2216g;

    /* renamed from: h */
    SearchableInfo f2217h;

    /* renamed from: j */
    private final View f2218j;

    /* renamed from: k */
    private final View f2219k;

    /* renamed from: l */
    private C0710f f2220l;

    /* renamed from: m */
    private Rect f2221m;

    /* renamed from: n */
    private Rect f2222n;

    /* renamed from: o */
    private int[] f2223o;

    /* renamed from: p */
    private int[] f2224p;

    /* renamed from: q */
    private final ImageView f2225q;

    /* renamed from: r */
    private final Drawable f2226r;

    /* renamed from: s */
    private final int f2227s;

    /* renamed from: t */
    private final int f2228t;

    /* renamed from: u */
    private final Intent f2229u;

    /* renamed from: v */
    private final Intent f2230v;

    /* renamed from: w */
    private final CharSequence f2231w;

    /* renamed from: x */
    private C0706c f2232x;

    /* renamed from: y */
    private C0705b f2233y;

    /* renamed from: z */
    private C0707d f2234z;

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C0887g {

        /* renamed from: a */
        final Runnable f2235a;

        /* renamed from: b */
        private int f2236b;

        /* renamed from: c */
        private SearchView f2237c;

        /* renamed from: d */
        private boolean f2238d;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0526a.C0527a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2235a = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.m3484a();
                }
            };
            this.f2236b = getThreshold();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3484a() {
            if (this.f2238d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2238d = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2238d = false;
                removeCallbacks(this.f2235a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2238d = false;
                removeCallbacks(this.f2235a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2238d = true;
            }
        }

        public boolean enoughToFilter() {
            return this.f2236b <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2238d) {
                removeCallbacks(this.f2235a);
                post(this.f2235a);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2237c.mo3218g();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2237c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2237c.hasFocus() && getVisibility() == 0) {
                this.f2238d = true;
                if (SearchView.m3461a(getContext())) {
                    SearchView.f2193i.mo3261a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f2237c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2236b = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0704a {

        /* renamed from: a */
        private Method f2240a;

        /* renamed from: b */
        private Method f2241b;

        /* renamed from: c */
        private Method f2242c;

        C0704a() {
            try {
                this.f2240a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2240a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f2241b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2241b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f2242c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f2242c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3260a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2240a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3261a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f2242c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3262b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2241b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0705b {
        /* renamed from: a */
        boolean mo3263a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0706c {
        /* renamed from: a */
        boolean mo3264a(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0707d {
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C0708e extends C0321a {
        public static final Parcelable.Creator<C0708e> CREATOR = new Parcelable.ClassLoaderCreator<C0708e>() {
            /* renamed from: a */
            public C0708e createFromParcel(Parcel parcel) {
                return new C0708e(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0708e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0708e(parcel, classLoader);
            }

            /* renamed from: a */
            public C0708e[] newArray(int i) {
                return new C0708e[i];
            }
        };

        /* renamed from: a */
        boolean f2243a;

        public C0708e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2243a = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0708e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2243a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2243a));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    private static class C0710f extends TouchDelegate {

        /* renamed from: a */
        private final View f2244a;

        /* renamed from: b */
        private final Rect f2245b = new Rect();

        /* renamed from: c */
        private final Rect f2246c = new Rect();

        /* renamed from: d */
        private final Rect f2247d = new Rect();

        /* renamed from: e */
        private final int f2248e;

        /* renamed from: f */
        private boolean f2249f;

        public C0710f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2248e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo3272a(rect, rect2);
            this.f2244a = view;
        }

        /* renamed from: a */
        public void mo3272a(Rect rect, Rect rect2) {
            this.f2245b.set(rect);
            this.f2247d.set(rect);
            Rect rect3 = this.f2247d;
            int i = this.f2248e;
            rect3.inset(-i, -i);
            this.f2246c.set(rect2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f2249f
                r6.f2249f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f2249f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f2247d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = 0
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f2245b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f2249f = r3
                r2 = 1
                goto L_0x0034
            L_0x0033:
                r2 = 0
            L_0x0034:
                if (r2 == 0) goto L_0x0067
                if (r3 == 0) goto L_0x0052
                android.graphics.Rect r2 = r6.f2246c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0052
                android.view.View r0 = r6.f2244a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f2244a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                goto L_0x005d
            L_0x0052:
                android.graphics.Rect r2 = r6.f2246c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f2246c
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x005d:
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                android.view.View r0 = r6.f2244a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x0067:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.SearchView.C0710f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a */
    private Intent m3458a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2203J);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2206M;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2217h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m3459a(View view, Rect rect) {
        view.getLocationInWindow(this.f2223o);
        getLocationInWindow(this.f2224p);
        int[] iArr = this.f2223o;
        int i = iArr[1];
        int[] iArr2 = this.f2224p;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m3460a(boolean z) {
        this.f2196C = z;
        int i = 8;
        boolean z2 = false;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f2210a.getText());
        this.f2211b.setVisibility(i2);
        m3463b(z3);
        this.f2218j.setVisibility(z ? 8 : 0);
        if (this.f2225q.getDrawable() != null && !this.f2195B) {
            i = 0;
        }
        this.f2225q.setVisibility(i);
        m3468m();
        if (!z3) {
            z2 = true;
        }
        m3464c(z2);
        m3467l();
    }

    /* renamed from: a */
    static boolean m3461a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private CharSequence m3462b(CharSequence charSequence) {
        if (!this.f2195B || this.f2226r == null) {
            return charSequence;
        }
        double textSize = (double) this.f2210a.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f2226r.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2226r), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private void m3463b(boolean z) {
        this.f2212c.setVisibility((!this.f2197D || !m3466k() || !hasFocus() || (!z && this.f2202I)) ? 8 : 0);
    }

    /* renamed from: c */
    private void m3464c(boolean z) {
        int i;
        if (!this.f2202I || mo3213c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f2212c.setVisibility(8);
        }
        this.f2214e.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0526a.C0530d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0526a.C0530d.abc_search_view_preferred_width);
    }

    /* renamed from: i */
    private boolean m3465i() {
        SearchableInfo searchableInfo = this.f2217h;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f2217h.getVoiceSearchLaunchWebSearch()) {
            intent = this.f2229u;
        } else if (this.f2217h.getVoiceSearchLaunchRecognizer()) {
            intent = this.f2230v;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: k */
    private boolean m3466k() {
        return (this.f2197D || this.f2202I) && !mo3213c();
    }

    /* renamed from: l */
    private void m3467l() {
        this.f2219k.setVisibility((!m3466k() || !(this.f2212c.getVisibility() == 0 || this.f2214e.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: m */
    private void m3468m() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2210a.getText());
        int i = 0;
        if (!z2 && (!this.f2195B || this.f2204K)) {
            z = false;
        }
        ImageView imageView = this.f2213d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f2213d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: n */
    private void m3469n() {
        post(this.f2207N);
    }

    /* renamed from: o */
    private void m3470o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2210a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m3462b(queryHint));
    }

    /* renamed from: p */
    private void m3471p() {
        this.f2210a.setThreshold(this.f2217h.getSuggestThreshold());
        this.f2210a.setImeOptions(this.f2217h.getImeOptions());
        int inputType = this.f2217h.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2217h.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f2210a.setInputType(inputType);
        C0493e eVar = this.f2216g;
        if (eVar != null) {
            eVar.mo2136a((Cursor) null);
        }
        if (this.f2217h.getSuggestAuthority() != null) {
            this.f2216g = new C0839bc(getContext(), this, this.f2217h, this.f2209P);
            this.f2210a.setAdapter(this.f2216g);
            C0839bc bcVar = (C0839bc) this.f2216g;
            if (this.f2199F) {
                i = 2;
            }
            bcVar.mo4277a(i);
        }
    }

    /* renamed from: q */
    private void m3472q() {
        this.f2210a.dismissDropDown();
    }

    private void setQuery(CharSequence charSequence) {
        this.f2210a.setText(charSequence);
        this.f2210a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: a */
    public void mo2495a() {
        if (!this.f2204K) {
            this.f2204K = true;
            this.f2205L = this.f2210a.getImeOptions();
            this.f2210a.setImeOptions(this.f2205L | 33554432);
            this.f2210a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3210a(int i, String str, String str2) {
        getContext().startActivity(m3458a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3211a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo3212a(CharSequence charSequence, boolean z) {
        this.f2210a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f2210a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f2203J = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo3215d();
        }
    }

    /* renamed from: b */
    public void mo2496b() {
        mo3212a((CharSequence) "", false);
        clearFocus();
        m3460a(true);
        this.f2210a.setImeOptions(this.f2205L);
        this.f2204K = false;
    }

    /* renamed from: c */
    public boolean mo3213c() {
        return this.f2196C;
    }

    public void clearFocus() {
        this.f2200G = true;
        super.clearFocus();
        this.f2210a.clearFocus();
        this.f2210a.setImeVisibility(false);
        this.f2200G = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3215d() {
        Editable text = this.f2210a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0706c cVar = this.f2232x;
            if (cVar == null || !cVar.mo3264a(text.toString())) {
                if (this.f2217h != null) {
                    mo3210a(0, (String) null, text.toString());
                }
                this.f2210a.setImeVisibility(false);
                m3472q();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3216e() {
        if (!TextUtils.isEmpty(this.f2210a.getText())) {
            this.f2210a.setText("");
            this.f2210a.requestFocus();
            this.f2210a.setImeVisibility(true);
        } else if (this.f2195B) {
            C0705b bVar = this.f2233y;
            if (bVar == null || !bVar.mo3263a()) {
                clearFocus();
                m3460a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3217f() {
        m3460a(false);
        this.f2210a.requestFocus();
        this.f2210a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2194A;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3218g() {
        m3460a(mo3213c());
        m3469n();
        if (this.f2210a.hasFocus()) {
            mo3227h();
        }
    }

    public int getImeOptions() {
        return this.f2210a.getImeOptions();
    }

    public int getInputType() {
        return this.f2210a.getInputType();
    }

    public int getMaxWidth() {
        return this.f2201H;
    }

    public CharSequence getQuery() {
        return this.f2210a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2198E;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2217h;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2231w : getContext().getText(this.f2217h.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f2228t;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f2227s;
    }

    public C0493e getSuggestionsAdapter() {
        return this.f2216g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3227h() {
        f2193i.mo3260a(this.f2210a);
        f2193i.mo3262b(this.f2210a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2207N);
        post(this.f2208O);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m3459a((View) this.f2210a, this.f2221m);
            this.f2222n.set(this.f2221m.left, 0, this.f2221m.right, i4 - i2);
            C0710f fVar = this.f2220l;
            if (fVar == null) {
                this.f2220l = new C0710f(this.f2222n, this.f2221m, this.f2210a);
                setTouchDelegate(this.f2220l);
                return;
            }
            fVar.mo3272a(this.f2222n, this.f2221m);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo3213c()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f2201H
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f2201H
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f2201H
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0708e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0708e eVar = (C0708e) parcelable;
        super.onRestoreInstanceState(eVar.mo1402a());
        m3460a(eVar.f2243a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0708e eVar = new C0708e(super.onSaveInstanceState());
        eVar.f2243a = mo3213c();
        return eVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m3469n();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f2200G || !isFocusable()) {
            return false;
        }
        if (mo3213c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2210a.requestFocus(i, rect);
        if (requestFocus) {
            m3460a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2206M = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo3216e();
        } else {
            mo3217f();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2195B != z) {
            this.f2195B = z;
            m3460a(z);
            m3470o();
        }
    }

    public void setImeOptions(int i) {
        this.f2210a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2210a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2201H = i;
        requestLayout();
    }

    public void setOnCloseListener(C0705b bVar) {
        this.f2233y = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2215f = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0706c cVar) {
        this.f2232x = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2194A = onClickListener;
    }

    public void setOnSuggestionListener(C0707d dVar) {
        this.f2234z = dVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2198E = charSequence;
        m3470o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2199F = z;
        C0493e eVar = this.f2216g;
        if (eVar instanceof C0839bc) {
            ((C0839bc) eVar).mo4277a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2217h = searchableInfo;
        if (this.f2217h != null) {
            m3471p();
            m3470o();
        }
        this.f2202I = m3465i();
        if (this.f2202I) {
            this.f2210a.setPrivateImeOptions("nm");
        }
        m3460a(mo3213c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2197D = z;
        m3460a(mo3213c());
    }

    public void setSuggestionsAdapter(C0493e eVar) {
        this.f2216g = eVar;
        this.f2210a.setAdapter(this.f2216g);
    }
}
