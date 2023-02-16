package android.support.p005v4.p015g;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.support.p005v4.p007b.p008a.C0228a;
import android.support.p005v4.p009c.C0258c;
import android.support.p005v4.p009c.C0267h;
import android.support.p005v4.p015g.C0288c;
import android.support.p005v4.p016h.C0302g;
import android.support.p005v4.p016h.C0318l;
import android.support.p005v4.p016h.C0319m;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.g.b */
public class C0281b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0302g<String, Typeface> f838a = new C0302g<>(16);

    /* renamed from: b */
    private static final C0288c f839b = new C0288c("fonts", 10, 10000);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f840c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C0319m<String, ArrayList<C0288c.C0293a<Typeface>>> f841d = new C0319m<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f842e = new Comparator<byte[]>() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p015g.C0281b.C02854.compare(byte[], byte[]):int");
        }
    };

    /* renamed from: android.support.v4.g.b$a */
    public static class C0286a {

        /* renamed from: a */
        private final int f851a;

        /* renamed from: b */
        private final C0287b[] f852b;

        public C0286a(int i, C0287b[] bVarArr) {
            this.f851a = i;
            this.f852b = bVarArr;
        }

        /* renamed from: a */
        public int mo1232a() {
            return this.f851a;
        }

        /* renamed from: b */
        public C0287b[] mo1233b() {
            return this.f852b;
        }
    }

    /* renamed from: android.support.v4.g.b$b */
    public static class C0287b {

        /* renamed from: a */
        private final Uri f853a;

        /* renamed from: b */
        private final int f854b;

        /* renamed from: c */
        private final int f855c;

        /* renamed from: d */
        private final boolean f856d;

        /* renamed from: e */
        private final int f857e;

        public C0287b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f853a = (Uri) C0318l.m1390a(uri);
            this.f854b = i;
            this.f855c = i2;
            this.f856d = z;
            this.f857e = i3;
        }

        /* renamed from: a */
        public Uri mo1234a() {
            return this.f853a;
        }

        /* renamed from: b */
        public int mo1235b() {
            return this.f854b;
        }

        /* renamed from: c */
        public int mo1236c() {
            return this.f855c;
        }

        /* renamed from: d */
        public boolean mo1237d() {
            return this.f856d;
        }

        /* renamed from: e */
        public int mo1238e() {
            return this.f857e;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m1270a(PackageManager packageManager, C0280a aVar, Resources resources) {
        String a = aVar.mo1218a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + a);
        } else if (resolveContentProvider.packageName.equals(aVar.mo1219b())) {
            List<byte[]> a2 = m1276a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f842e);
            List<List<byte[]>> a3 = m1275a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList(a3.get(i));
                Collections.sort(arrayList, f842e);
                if (m1278a(a2, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + a + ", but package was not " + aVar.mo1219b());
        }
    }

    /* renamed from: a */
    public static Typeface m1272a(final Context context, final C0280a aVar, final TextView textView, int i, int i2, final int i3) {
        final String str = aVar.mo1223f() + "-" + i3;
        Typeface a = f838a.mo1294a(str);
        if (a != null) {
            return a;
        }
        boolean z = i == 0;
        if (z && i2 == -1) {
            return m1280b(context, aVar, i3);
        }
        C02821 r1 = new Callable<Typeface>() {
            /* renamed from: a */
            public Typeface call() {
                Typeface a = C0281b.m1280b(context, aVar, i3);
                if (a != null) {
                    C0281b.f838a.mo1295a(str, a);
                }
                return a;
            }
        };
        if (z) {
            try {
                return (Typeface) f839b.mo1239a(r1, i2);
            } catch (InterruptedException unused) {
                return null;
            }
        } else {
            final WeakReference weakReference = new WeakReference(textView);
            C02832 r5 = new C0288c.C0293a<Typeface>() {
                /* renamed from: a */
                public void mo1228a(Typeface typeface) {
                    if (((TextView) weakReference.get()) != null) {
                        textView.setTypeface(typeface, i3);
                    }
                }
            };
            synchronized (f840c) {
                if (f841d.containsKey(str)) {
                    f841d.get(str).add(r5);
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(r5);
                f841d.put(str, arrayList);
                f839b.mo1240a(r1, new C0288c.C0293a<Typeface>() {
                    /* renamed from: a */
                    public void mo1228a(Typeface typeface) {
                        ArrayList arrayList;
                        synchronized (C0281b.f840c) {
                            arrayList = (ArrayList) C0281b.f841d.get(str);
                            C0281b.f841d.remove(str);
                        }
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((C0288c.C0293a) arrayList.get(i)).mo1228a(typeface);
                        }
                    }
                });
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C0286a m1273a(Context context, CancellationSignal cancellationSignal, C0280a aVar) {
        ProviderInfo a = m1270a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C0286a(1, (C0287b[]) null) : new C0286a(0, m1279a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    private static List<List<byte[]>> m1275a(C0280a aVar, Resources resources) {
        return aVar.mo1221d() != null ? aVar.mo1221d() : C0228a.m1075a(resources, aVar.mo1222e());
    }

    /* renamed from: a */
    private static List<byte[]> m1276a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m1277a(Context context, C0287b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0287b bVar : bVarArr) {
            if (bVar.mo1238e() == 0) {
                Uri a = bVar.mo1234a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0267h.m1245a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m1278a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static C0287b[] m1279a(Context context, C0280a aVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1220c()}, (String) null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1220c()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new C0287b(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0287b[]) arrayList.toArray(new C0287b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Typeface m1280b(Context context, C0280a aVar, int i) {
        try {
            C0286a a = m1273a(context, (CancellationSignal) null, aVar);
            if (a.mo1232a() == 0) {
                return C0258c.m1201a(context, (CancellationSignal) null, a.mo1233b(), i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
