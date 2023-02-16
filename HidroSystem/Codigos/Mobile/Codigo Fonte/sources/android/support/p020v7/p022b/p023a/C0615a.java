package android.support.p020v7.p022b.p023a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.p005v4.p009c.C0239a;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.b.a.a */
final class C0615a {
    /* renamed from: a */
    private static int m2823a(int i, float f) {
        return C0239a.m1118b(i, Math.round(((float) Color.alpha(i)) * f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2824a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m2825a((android.content.res.Resources) r4, (org.xmlpull.v1.XmlPullParser) r5, (android.util.AttributeSet) r0, (android.content.res.Resources.Theme) r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.p022b.p023a.C0615a.m2824a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static ColorStateList m2825a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2827b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: a */
    private static TypedArray m2826a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2827b(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r3 = new int[r3][]
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = 0
        L_0x0011:
            int r7 = r18.next()
            if (r7 == r2) goto L_0x00b2
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L_0x0020
            r9 = 3
            if (r7 == r9) goto L_0x00b2
        L_0x0020:
            r9 = 2
            if (r7 != r9) goto L_0x00ab
            if (r8 > r1) goto L_0x00ab
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0033
            goto L_0x00ab
        L_0x0033:
            int[] r7 = android.support.p020v7.p021a.C0526a.C0536j.ColorStateListItem
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = m2826a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r0, (int[]) r7)
            int r10 = android.support.p020v7.p021a.C0526a.C0536j.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = android.support.p020v7.p021a.C0526a.C0536j.ColorStateListItem_android_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L_0x0057
            int r12 = android.support.p020v7.p021a.C0526a.C0536j.ColorStateListItem_android_alpha
        L_0x0052:
            float r11 = r7.getFloat(r12, r11)
            goto L_0x0062
        L_0x0057:
            int r12 = android.support.p020v7.p021a.C0526a.C0536j.ColorStateListItem_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L_0x0062
            int r12 = android.support.p020v7.p021a.C0526a.C0536j.ColorStateListItem_alpha
            goto L_0x0052
        L_0x0062:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r12 = new int[r7]
            r13 = 0
            r14 = 0
        L_0x006d:
            if (r13 >= r7) goto L_0x0092
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L_0x008e
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L_0x008e
            int r2 = android.support.p020v7.p021a.C0526a.C0527a.alpha
            if (r15 == r2) goto L_0x008e
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            int r15 = -r15
        L_0x008b:
            r12[r14] = r15
            r14 = r2
        L_0x008e:
            int r13 = r13 + 1
            r2 = 1
            goto L_0x006d
        L_0x0092:
            int[] r2 = android.util.StateSet.trimStateSet(r12, r14)
            int r7 = m2823a(r10, r11)
            if (r6 == 0) goto L_0x009d
            int r10 = r2.length
        L_0x009d:
            int[] r4 = android.support.p020v7.p022b.p023a.C0618c.m2836a((int[]) r4, (int) r6, (int) r7)
            java.lang.Object[] r2 = android.support.p020v7.p022b.p023a.C0618c.m2837a((T[]) r3, (int) r6, r2)
            r3 = r2
            int[][] r3 = (int[][]) r3
            int r6 = r6 + 1
            goto L_0x00af
        L_0x00ab:
            r8 = r17
            r9 = r20
        L_0x00af:
            r2 = 1
            goto L_0x0011
        L_0x00b2:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r4, r5, r0, r5, r6)
            java.lang.System.arraycopy(r3, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.p022b.p023a.C0615a.m2827b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
