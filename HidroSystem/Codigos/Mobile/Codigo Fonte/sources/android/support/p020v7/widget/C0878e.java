package android.support.p020v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.e */
class C0878e extends DataSetObservable {

    /* renamed from: a */
    static final String f2967a = "e";

    /* renamed from: e */
    private static final Object f2968e = new Object();

    /* renamed from: f */
    private static final Map<String, C0878e> f2969f = new HashMap();

    /* renamed from: b */
    final Context f2970b;

    /* renamed from: c */
    final String f2971c;

    /* renamed from: d */
    boolean f2972d;

    /* renamed from: g */
    private final Object f2973g;

    /* renamed from: h */
    private final List<C0879a> f2974h;

    /* renamed from: i */
    private final List<C0881c> f2975i;

    /* renamed from: j */
    private Intent f2976j;

    /* renamed from: k */
    private C0880b f2977k;

    /* renamed from: l */
    private int f2978l;

    /* renamed from: m */
    private boolean f2979m;

    /* renamed from: n */
    private boolean f2980n;

    /* renamed from: o */
    private boolean f2981o;

    /* renamed from: p */
    private C0882d f2982p;

    /* renamed from: android.support.v7.widget.e$a */
    public static final class C0879a implements Comparable<C0879a> {

        /* renamed from: a */
        public final ResolveInfo f2983a;

        /* renamed from: b */
        public float f2984b;

        public C0879a(ResolveInfo resolveInfo) {
            this.f2983a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C0879a aVar) {
            return Float.floatToIntBits(aVar.f2984b) - Float.floatToIntBits(this.f2984b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f2984b) == Float.floatToIntBits(((C0879a) obj).f2984b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f2984b) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.f2983a.toString() + "; weight:" + new BigDecimal((double) this.f2984b) + "]";
        }
    }

    /* renamed from: android.support.v7.widget.e$b */
    public interface C0880b {
        /* renamed from: a */
        void mo4381a(Intent intent, List<C0879a> list, List<C0881c> list2);
    }

    /* renamed from: android.support.v7.widget.e$c */
    public static final class C0881c {

        /* renamed from: a */
        public final ComponentName f2985a;

        /* renamed from: b */
        public final long f2986b;

        /* renamed from: c */
        public final float f2987c;

        public C0881c(ComponentName componentName, long j, float f) {
            this.f2985a = componentName;
            this.f2986b = j;
            this.f2987c = f;
        }

        public C0881c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0881c cVar = (C0881c) obj;
            ComponentName componentName = this.f2985a;
            if (componentName == null) {
                if (cVar.f2985a != null) {
                    return false;
                }
            } else if (!componentName.equals(cVar.f2985a)) {
                return false;
            }
            return this.f2986b == cVar.f2986b && Float.floatToIntBits(this.f2987c) == Float.floatToIntBits(cVar.f2987c);
        }

        public int hashCode() {
            ComponentName componentName = this.f2985a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f2986b;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f2987c);
        }

        public String toString() {
            return "[" + "; activity:" + this.f2985a + "; time:" + this.f2986b + "; weight:" + new BigDecimal((double) this.f2987c) + "]";
        }
    }

    /* renamed from: android.support.v7.widget.e$d */
    public interface C0882d {
        /* renamed from: a */
        boolean mo4385a(C0878e eVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.e$e */
    private final class C0883e extends AsyncTask<Object, Void, Void> {
        C0883e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r12 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
            if (r12 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r12 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
            if (r12 == null) goto L_0x00dd;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.e r4 = android.support.p020v7.widget.C0878e.this     // Catch:{ FileNotFoundException -> 0x00e8 }
                android.content.Context r4 = r4.f2970b     // Catch:{ FileNotFoundException -> 0x00e8 }
                java.io.FileOutputStream r12 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x00e8 }
                org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
                r4.setOutput(r12, r3)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "historical-records"
                r4.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r6 = 0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.e$c r7 = (android.support.p020v7.widget.C0878e.C0881c) r7     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "historical-record"
                r4.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f2985a     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "time"
                long r9 = r7.f2986b     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "weight"
                float r7 = r7.f2987c     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = "historical-record"
                r4.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r4.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.endDocument()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.e r0 = android.support.p020v7.widget.C0878e.this
                r0.f2972d = r2
                if (r12 == 0) goto L_0x00dd
            L_0x0071:
                r12.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00dd
            L_0x0075:
                r0 = move-exception
                goto L_0x00de
            L_0x0077:
                r0 = move-exception
                java.lang.String r1 = android.support.p020v7.widget.C0878e.f2967a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.e r5 = android.support.p020v7.widget.C0878e.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f2971c     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.e r0 = android.support.p020v7.widget.C0878e.this
                r0.f2972d = r2
                if (r12 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x0099:
                r0 = move-exception
                java.lang.String r1 = android.support.p020v7.widget.C0878e.f2967a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.e r5 = android.support.p020v7.widget.C0878e.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f2971c     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.e r0 = android.support.p020v7.widget.C0878e.this
                r0.f2972d = r2
                if (r12 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00bb:
                r0 = move-exception
                java.lang.String r1 = android.support.p020v7.widget.C0878e.f2967a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.e r5 = android.support.p020v7.widget.C0878e.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f2971c     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.e r0 = android.support.p020v7.widget.C0878e.this
                r0.f2972d = r2
                if (r12 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00dd:
                return r3
            L_0x00de:
                android.support.v7.widget.e r1 = android.support.p020v7.widget.C0878e.this
                r1.f2972d = r2
                if (r12 == 0) goto L_0x00e7
                r12.close()     // Catch:{ IOException -> 0x00e7 }
            L_0x00e7:
                throw r0
            L_0x00e8:
                r0 = move-exception
                java.lang.String r1 = android.support.p020v7.widget.C0878e.f2967a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Error writing historical record file: "
                r2.append(r4)
                r2.append(r12)
                java.lang.String r12 = r2.toString()
                android.util.Log.e(r1, r12, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0878e.C0883e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    private boolean m4789a(C0881c cVar) {
        boolean add = this.f2975i.add(cVar);
        if (add) {
            this.f2980n = true;
            m4795h();
            m4790c();
            m4792e();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: c */
    private void m4790c() {
        if (!this.f2979m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f2980n) {
            this.f2980n = false;
            if (!TextUtils.isEmpty(this.f2971c)) {
                new C0883e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f2975i), this.f2971c});
            }
        }
    }

    /* renamed from: d */
    private void m4791d() {
        boolean f = m4793f() | m4794g();
        m4795h();
        if (f) {
            m4792e();
            notifyChanged();
        }
    }

    /* renamed from: e */
    private boolean m4792e() {
        if (this.f2977k == null || this.f2976j == null || this.f2974h.isEmpty() || this.f2975i.isEmpty()) {
            return false;
        }
        this.f2977k.mo4381a(this.f2976j, this.f2974h, Collections.unmodifiableList(this.f2975i));
        return true;
    }

    /* renamed from: f */
    private boolean m4793f() {
        if (!this.f2981o || this.f2976j == null) {
            return false;
        }
        this.f2981o = false;
        this.f2974h.clear();
        List<ResolveInfo> queryIntentActivities = this.f2970b.getPackageManager().queryIntentActivities(this.f2976j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f2974h.add(new C0879a(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: g */
    private boolean m4794g() {
        if (!this.f2972d || !this.f2980n || TextUtils.isEmpty(this.f2971c)) {
            return false;
        }
        this.f2972d = false;
        this.f2979m = true;
        m4796i();
        return true;
    }

    /* renamed from: h */
    private void m4795h() {
        int size = this.f2975i.size() - this.f2978l;
        if (size > 0) {
            this.f2980n = true;
            for (int i = 0; i < size; i++) {
                C0881c remove = this.f2975i.remove(0);
            }
        }
    }

    /* renamed from: i */
    private void m4796i() {
        try {
            FileInputStream openFileInput = this.f2970b.openFileInput(this.f2971c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<C0881c> list = this.f2975i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new C0881c(newPullParser.getAttributeValue((String) null, "activity"), Long.parseLong(newPullParser.getAttributeValue((String) null, "time")), Float.parseFloat(newPullParser.getAttributeValue((String) null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException e) {
                String str = f2967a;
                Log.e(str, "Error reading historical recrod file: " + this.f2971c, e);
                if (openFileInput == null) {
                }
            } catch (IOException e2) {
                String str2 = f2967a;
                Log.e(str2, "Error reading historical recrod file: " + this.f2971c, e2);
                if (openFileInput == null) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* renamed from: a */
    public int mo4370a() {
        int size;
        synchronized (this.f2973g) {
            m4791d();
            size = this.f2974h.size();
        }
        return size;
    }

    /* renamed from: a */
    public int mo4371a(ResolveInfo resolveInfo) {
        synchronized (this.f2973g) {
            m4791d();
            List<C0879a> list = this.f2974h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f2983a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ResolveInfo mo4372a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f2973g) {
            m4791d();
            resolveInfo = this.f2974h.get(i).f2983a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public Intent mo4373b(int i) {
        synchronized (this.f2973g) {
            if (this.f2976j == null) {
                return null;
            }
            m4791d();
            C0879a aVar = this.f2974h.get(i);
            ComponentName componentName = new ComponentName(aVar.f2983a.activityInfo.packageName, aVar.f2983a.activityInfo.name);
            Intent intent = new Intent(this.f2976j);
            intent.setComponent(componentName);
            if (this.f2982p != null) {
                if (this.f2982p.mo4385a(this, new Intent(intent))) {
                    return null;
                }
            }
            m4789a(new C0881c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo mo4374b() {
        synchronized (this.f2973g) {
            m4791d();
            if (this.f2974h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f2974h.get(0).f2983a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void mo4375c(int i) {
        synchronized (this.f2973g) {
            m4791d();
            C0879a aVar = this.f2974h.get(i);
            C0879a aVar2 = this.f2974h.get(0);
            m4789a(new C0881c(new ComponentName(aVar.f2983a.activityInfo.packageName, aVar.f2983a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f2984b - aVar.f2984b) + 5.0f : 1.0f));
        }
    }
}
