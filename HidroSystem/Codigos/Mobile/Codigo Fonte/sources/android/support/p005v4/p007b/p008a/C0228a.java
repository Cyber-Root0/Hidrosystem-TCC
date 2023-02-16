package android.support.p005v4.p007b.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p002a.C0022a;
import android.support.p005v4.p015g.C0280a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.b.a.a */
public class C0228a {

    /* renamed from: android.support.v4.b.a.a$a */
    public interface C0229a {
    }

    /* renamed from: android.support.v4.b.a.a$b */
    public static final class C0230b implements C0229a {

        /* renamed from: a */
        private final C0231c[] f771a;

        public C0230b(C0231c[] cVarArr) {
            this.f771a = cVarArr;
        }

        /* renamed from: a */
        public C0231c[] mo1092a() {
            return this.f771a;
        }
    }

    /* renamed from: android.support.v4.b.a.a$c */
    public static final class C0231c {

        /* renamed from: a */
        private final String f772a;

        /* renamed from: b */
        private int f773b;

        /* renamed from: c */
        private boolean f774c;

        /* renamed from: d */
        private int f775d;

        public C0231c(String str, int i, boolean z, int i2) {
            this.f772a = str;
            this.f773b = i;
            this.f774c = z;
            this.f775d = i2;
        }

        /* renamed from: a */
        public String mo1093a() {
            return this.f772a;
        }

        /* renamed from: b */
        public int mo1094b() {
            return this.f773b;
        }

        /* renamed from: c */
        public boolean mo1095c() {
            return this.f774c;
        }

        /* renamed from: d */
        public int mo1096d() {
            return this.f775d;
        }
    }

    /* renamed from: android.support.v4.b.a.a$d */
    public static final class C0232d implements C0229a {

        /* renamed from: a */
        private final C0280a f776a;

        /* renamed from: b */
        private final int f777b;

        /* renamed from: c */
        private final int f778c;

        public C0232d(C0280a aVar, int i, int i2) {
            this.f776a = aVar;
            this.f778c = i;
            this.f777b = i2;
        }

        /* renamed from: a */
        public C0280a mo1097a() {
            return this.f776a;
        }

        /* renamed from: b */
        public int mo1098b() {
            return this.f778c;
        }

        /* renamed from: c */
        public int mo1099c() {
            return this.f777b;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static android.support.p005v4.p007b.p008a.C0228a.C0229a m1074a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            android.support.v4.b.a.a$a r3 = m1078b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p007b.p008a.C0228a.m1074a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):android.support.v4.b.a.a$a");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1075a(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(m1076a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(m1076a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: a */
    private static List<byte[]> m1076a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m1077a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* renamed from: b */
    private static C0229a m1078b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1079c(xmlPullParser, resources);
        }
        m1077a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0229a m1079c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0022a.C0023a.FontFamily);
        String string = obtainAttributes.getString(C0022a.C0023a.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0022a.C0023a.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0022a.C0023a.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0022a.C0023a.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0022a.C0023a.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0022a.C0023a.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1080d(xmlPullParser, resources));
                    } else {
                        m1077a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0230b((C0231c[]) arrayList.toArray(new C0231c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1077a(xmlPullParser);
        }
        return new C0232d(new C0280a(string, string2, string3, m1075a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0231c m1080d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0022a.C0023a.FontFamilyFont);
        int i = obtainAttributes.getInt(C0022a.C0023a.FontFamilyFont_fontWeight, 400);
        boolean z = true;
        if (1 != obtainAttributes.getInt(C0022a.C0023a.FontFamilyFont_fontStyle, 0)) {
            z = false;
        }
        int resourceId = obtainAttributes.getResourceId(C0022a.C0023a.FontFamilyFont_font, 0);
        String string = obtainAttributes.getString(C0022a.C0023a.FontFamilyFont_font);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1077a(xmlPullParser);
        }
        return new C0231c(string, i, z, resourceId);
    }
}
