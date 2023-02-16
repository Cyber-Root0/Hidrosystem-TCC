package android.support.p005v4.p007b.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.b.a.c */
public class C0234c {
    /* renamed from: a */
    public static float m1093a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m1098a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m1094a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1098a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m1095a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m1096a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1098a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m1097a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m1098a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m1098a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m1099b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1098a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m1100b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1098a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m1101c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1098a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
