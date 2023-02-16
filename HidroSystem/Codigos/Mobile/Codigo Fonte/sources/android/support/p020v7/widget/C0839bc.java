package android.support.p020v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.widget.C0512l;
import android.support.p020v7.p021a.C0526a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.bc */
class C0839bc extends C0512l implements View.OnClickListener {

    /* renamed from: j */
    private final SearchManager f2837j = ((SearchManager) this.f1342d.getSystemService("search"));

    /* renamed from: k */
    private final SearchView f2838k;

    /* renamed from: l */
    private final SearchableInfo f2839l;

    /* renamed from: m */
    private final Context f2840m;

    /* renamed from: n */
    private final WeakHashMap<String, Drawable.ConstantState> f2841n;

    /* renamed from: o */
    private final int f2842o;

    /* renamed from: p */
    private boolean f2843p = false;

    /* renamed from: q */
    private int f2844q = 1;

    /* renamed from: r */
    private ColorStateList f2845r;

    /* renamed from: s */
    private int f2846s = -1;

    /* renamed from: t */
    private int f2847t = -1;

    /* renamed from: u */
    private int f2848u = -1;

    /* renamed from: v */
    private int f2849v = -1;

    /* renamed from: w */
    private int f2850w = -1;

    /* renamed from: x */
    private int f2851x = -1;

    /* renamed from: android.support.v7.widget.bc$a */
    private static final class C0840a {

        /* renamed from: a */
        public final TextView f2852a;

        /* renamed from: b */
        public final TextView f2853b;

        /* renamed from: c */
        public final ImageView f2854c;

        /* renamed from: d */
        public final ImageView f2855d;

        /* renamed from: e */
        public final ImageView f2856e;

        public C0840a(View view) {
            this.f2852a = (TextView) view.findViewById(16908308);
            this.f2853b = (TextView) view.findViewById(16908309);
            this.f2854c = (ImageView) view.findViewById(16908295);
            this.f2855d = (ImageView) view.findViewById(16908296);
            this.f2856e = (ImageView) view.findViewById(C0526a.C0532f.edit_query);
        }
    }

    public C0839bc(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2838k = searchView;
        this.f2839l = searchableInfo;
        this.f2842o = searchView.getSuggestionCommitIconResId();
        this.f2840m = context;
        this.f2841n = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m4590a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f2841n.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f2841n.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f2840m.getResources());
        }
        Drawable b = m4597b(componentName);
        if (b != null) {
            constantState = b.getConstantState();
        }
        this.f2841n.put(flattenToShortString, constantState);
        return b;
    }

    /* renamed from: a */
    private Drawable m4591a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2840m.getPackageName() + "/" + parseInt;
            Drawable b = m4599b(str2);
            if (b != null) {
                return b;
            }
            Drawable a = C0227a.m1070a(this.f2840m, parseInt);
            m4596a(str2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable b2 = m4599b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable b3 = m4598b(Uri.parse(str));
            m4596a(str, b3);
            return b3;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private static String m4592a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m4593a(Cursor cursor, String str) {
        return m4592a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m4594a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m4595a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m4596a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2841n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m4597b(ComponentName componentName) {
        String str;
        String nameNotFoundException;
        PackageManager packageManager = this.f1342d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            str = "SuggestionsAdapter";
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w(str, nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            str = "SuggestionsAdapter";
            nameNotFoundException = e.toString();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4598b(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r7 = r6.mo4276a((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0012 }
            return r7
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0029:
            android.content.Context r1 = r6.f2840m     // Catch:{ FileNotFoundException -> 0x0089 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0072
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0054
        L_0x003d:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0054:
            return r2
        L_0x0055:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x0071
        L_0x005a:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0071:
            throw r2     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0072:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0839bc.m4598b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m4599b(String str) {
        Drawable.ConstantState constantState = this.f2841n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: b */
    private CharSequence m4600b(CharSequence charSequence) {
        if (this.f2845r == null) {
            TypedValue typedValue = new TypedValue();
            this.f1342d.getTheme().resolveAttribute(C0526a.C0527a.textColorSearchUrl, typedValue, true);
            this.f2845r = this.f1342d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f2845r, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private void m4601d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m4602e(Cursor cursor) {
        int i = this.f2849v;
        if (i == -1) {
            return null;
        }
        Drawable a = m4591a(cursor.getString(i));
        return a != null ? a : m4604g(cursor);
    }

    /* renamed from: f */
    private Drawable m4603f(Cursor cursor) {
        int i = this.f2850w;
        if (i == -1) {
            return null;
        }
        return m4591a(cursor.getString(i));
    }

    /* renamed from: g */
    private Drawable m4604g(Cursor cursor) {
        Drawable a = m4590a(this.f2839l.getSearchActivity());
        return a != null ? a : this.f1342d.getPackageManager().getDefaultActivityIcon();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo4275a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1342d.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: a */
    public Cursor mo2133a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2838k.getVisibility() == 0 && this.f2838k.getWindowVisibility() == 0) {
            try {
                Cursor a = mo4275a(this.f2839l, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4276a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1342d.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: a */
    public View mo2134a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo2134a(context, cursor, viewGroup);
        a.setTag(new C0840a(a));
        ((ImageView) a.findViewById(C0526a.C0532f.edit_query)).setImageResource(this.f2842o);
        return a;
    }

    /* renamed from: a */
    public void mo4277a(int i) {
        this.f2844q = i;
    }

    /* renamed from: a */
    public void mo2136a(Cursor cursor) {
        if (this.f2843p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2136a(cursor);
            if (cursor != null) {
                this.f2846s = cursor.getColumnIndex("suggest_text_1");
                this.f2847t = cursor.getColumnIndex("suggest_text_2");
                this.f2848u = cursor.getColumnIndex("suggest_text_2_url");
                this.f2849v = cursor.getColumnIndex("suggest_icon_1");
                this.f2850w = cursor.getColumnIndex("suggest_icon_2");
                this.f2851x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo2137a(View view, Context context, Cursor cursor) {
        C0840a aVar = (C0840a) view.getTag();
        int i = this.f2851x;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f2852a != null) {
            m4595a(aVar.f2852a, (CharSequence) m4592a(cursor, this.f2846s));
        }
        if (aVar.f2853b != null) {
            String a = m4592a(cursor, this.f2848u);
            CharSequence b = a != null ? m4600b((CharSequence) a) : m4592a(cursor, this.f2847t);
            if (TextUtils.isEmpty(b)) {
                if (aVar.f2852a != null) {
                    aVar.f2852a.setSingleLine(false);
                    aVar.f2852a.setMaxLines(2);
                }
            } else if (aVar.f2852a != null) {
                aVar.f2852a.setSingleLine(true);
                aVar.f2852a.setMaxLines(1);
            }
            m4595a(aVar.f2853b, b);
        }
        if (aVar.f2854c != null) {
            m4594a(aVar.f2854c, m4602e(cursor), 4);
        }
        if (aVar.f2855d != null) {
            m4594a(aVar.f2855d, m4603f(cursor), 8);
        }
        int i3 = this.f2844q;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f2856e.setVisibility(0);
            aVar.f2856e.setTag(aVar.f2852a.getText());
            aVar.f2856e.setOnClickListener(this);
            return;
        }
        aVar.f2856e.setVisibility(8);
    }

    /* renamed from: c */
    public CharSequence mo2141c(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m4593a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f2839l.shouldRewriteQueryFromData() && (a2 = m4593a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f2839l.shouldRewriteQueryFromText() || (a = m4593a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2139b(this.f1342d, this.f1341c, viewGroup);
            if (b != null) {
                ((C0840a) b.getTag()).f2852a.setText(e.toString());
            }
            return b;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo2134a(this.f1342d, this.f1341c, viewGroup);
            if (a != null) {
                ((C0840a) a.getTag()).f2852a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m4601d(mo2132a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m4601d(mo2132a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2838k.mo3211a((CharSequence) tag);
        }
    }
}
