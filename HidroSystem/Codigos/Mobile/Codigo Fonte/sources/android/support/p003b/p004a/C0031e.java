package android.support.p003b.p004a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.support.p005v4.p007b.p008a.C0234c;
import android.support.p005v4.p009c.C0255b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.b.a.e */
public class C0031e {

    /* renamed from: android.support.b.a.e$a */
    private static class C0033a implements TypeEvaluator<C0255b.C0257b[]> {

        /* renamed from: a */
        private C0255b.C0257b[] f64a;

        private C0033a() {
        }

        /* renamed from: a */
        public C0255b.C0257b[] evaluate(float f, C0255b.C0257b[] bVarArr, C0255b.C0257b[] bVarArr2) {
            if (C0255b.m1189a(bVarArr, bVarArr2)) {
                C0255b.C0257b[] bVarArr3 = this.f64a;
                if (bVarArr3 == null || !C0255b.m1189a(bVarArr3, bVarArr)) {
                    this.f64a = C0255b.m1191a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f64a[i].mo1171a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f64a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static int m53a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f48j);
        int i = 0;
        TypedValue b = C0234c.m1100b(a, xmlPullParser, "value", 0);
        if ((b != null) && m70a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m54a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !m70a(i3)) && (!z || !m70a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: a */
    public static Animator m55a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m56a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m56a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m57a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m57a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator a = m58a(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Animator m58a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m59a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m59a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00e1
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00e1
            r3 = 2
            if (r1 == r3) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0043
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m62a((android.content.Context) r0, (android.content.res.Resources) r1, (android.content.res.Resources.Theme) r2, (android.util.AttributeSet) r3, (float) r4, (org.xmlpull.v1.XmlPullParser) r5)
        L_0x003f:
            r3 = r18
            goto L_0x00b6
        L_0x0043:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m65a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x005d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0095
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = android.support.p003b.p004a.C0024a.f46h
            r7 = r22
            android.content.res.TypedArray r6 = android.support.p005v4.p007b.p008a.C0234c.m1095a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r7, (int[]) r0)
            java.lang.String r0 = "ordering"
            int r16 = android.support.p005v4.p007b.p008a.C0234c.m1094a((android.content.res.TypedArray) r6, (org.xmlpull.v1.XmlPullParser) r10, (java.lang.String) r0, (int) r14, (int) r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r6
            r6 = r16
            r7 = r25
            m59a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b6
        L_0x0095:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c6
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m71a((android.content.Context) r3, (android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (org.xmlpull.v1.XmlPullParser) r10, (android.util.AttributeSet) r1)
            if (r1 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b5
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b5:
            r14 = 1
        L_0x00b6:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00c1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00c1:
            r13.add(r0)
            goto L_0x000e
        L_0x00c6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            if (r11 == 0) goto L_0x010a
            if (r13 == 0) goto L_0x010a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ef
        L_0x0101:
            if (r24 != 0) goto L_0x0107
            r11.playTogether(r1)
            goto L_0x010a
        L_0x0107:
            r11.playSequentially(r1)
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003b.p004a.C0031e.m59a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m60a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m61a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        Keyframe keyframe;
        TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f48j);
        float a2 = C0234c.m1093a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0234c.m1100b(a, xmlPullParser, "value", 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !m70a(b.type)) ? 0 : 3;
        }
        if (z) {
            if (i != 3) {
                switch (i) {
                    case 0:
                        keyframe = Keyframe.ofFloat(a2, C0234c.m1093a(a, xmlPullParser, "value", 0, 0.0f));
                        break;
                    case 1:
                        break;
                    default:
                        keyframe = null;
                        break;
                }
            }
            keyframe = Keyframe.ofInt(a2, C0234c.m1094a(a, xmlPullParser, "value", 0, 0));
        } else {
            keyframe = i == 0 ? Keyframe.ofFloat(a2) : Keyframe.ofInt(a2);
        }
        int c = C0234c.m1101c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C0030d.m51a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* renamed from: a */
    private static ObjectAnimator m62a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m65a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m63a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            r1 = r14
            r14 = r0
        L_0x0003:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r4 = 1
            if (r2 == r4) goto L_0x0041
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0003
            r2 = 4
            if (r1 != r2) goto L_0x0024
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            int r1 = m53a((android.content.res.Resources) r10, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r1, (org.xmlpull.v1.XmlPullParser) r12)
        L_0x0024:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r1
            r7 = r12
            android.animation.Keyframe r2 = m61a((android.content.Context) r2, (android.content.res.Resources) r3, (android.content.res.Resources.Theme) r4, (android.util.AttributeSet) r5, (int) r6, (org.xmlpull.v1.XmlPullParser) r7)
            if (r2 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x003a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x003a:
            r14.add(r2)
        L_0x003d:
            r12.next()
            goto L_0x0003
        L_0x0041:
            if (r14 == 0) goto L_0x00ea
            int r9 = r14.size()
            if (r9 <= 0) goto L_0x00ea
            r10 = 0
            java.lang.Object r11 = r14.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r14.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r12.setFraction(r2)
            goto L_0x0078
        L_0x006b:
            int r0 = r14.size()
            android.animation.Keyframe r12 = m60a((android.animation.Keyframe) r12, (float) r2)
            r14.add(r0, r12)
            int r9 = r9 + 1
        L_0x0078:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r11.setFraction(r4)
            goto L_0x0091
        L_0x0088:
            android.animation.Keyframe r11 = m60a((android.animation.Keyframe) r11, (float) r4)
            r14.add(r10, r11)
            int r9 = r9 + 1
        L_0x0091:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r14.toArray(r11)
        L_0x0096:
            if (r10 >= r9) goto L_0x00dd
            r12 = r11[r10]
            float r14 = r12.getFraction()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00da
            if (r10 != 0) goto L_0x00a8
            r12.setFraction(r4)
            goto L_0x00da
        L_0x00a8:
            int r14 = r9 + -1
            if (r10 != r14) goto L_0x00b0
            r12.setFraction(r2)
            goto L_0x00da
        L_0x00b0:
            int r12 = r10 + 1
            r0 = r10
        L_0x00b3:
            if (r12 >= r14) goto L_0x00c6
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r0 = r12 + 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto L_0x00b3
        L_0x00c6:
            int r12 = r0 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r14 = r10 + -1
            r14 = r11[r14]
            float r14 = r14.getFraction()
            float r12 = r12 - r14
            m69a((android.animation.Keyframe[]) r11, (float) r12, (int) r10, (int) r0)
        L_0x00da:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00dd:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r1 != r3) goto L_0x00ea
            android.support.b.a.f r9 = android.support.p003b.p004a.C0034f.m73a()
            r0.setEvaluator(r9)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003b.p004a.C0031e.m63a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m64a(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m70a(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m70a(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 2
            r9 = 0
            if (r12 != r8) goto L_0x00a5
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            android.support.v4.c.b$b[] r13 = android.support.p005v4.p009c.C0255b.m1193b(r12)
            android.support.v4.c.b$b[] r14 = android.support.p005v4.p009c.C0255b.m1193b(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0163
        L_0x0054:
            if (r13 == 0) goto L_0x0094
            android.support.b.a.e$a r0 = new android.support.b.a.e$a
            r0.<init>()
            if (r14 == 0) goto L_0x0089
            boolean r3 = android.support.p005v4.p009c.C0255b.m1189a((android.support.p005v4.p009c.C0255b.C0257b[]) r13, (android.support.p005v4.p009c.C0255b.C0257b[]) r14)
            if (r3 == 0) goto L_0x006a
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r2] = r13
            r11[r1] = r14
            goto L_0x008d
        L_0x006a:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x0089:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
        L_0x008d:
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            r9 = r11
            goto L_0x0163
        L_0x0094:
            if (r14 == 0) goto L_0x0163
            android.support.b.a.e$a r11 = new android.support.b.a.e$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0163
        L_0x00a5:
            if (r12 != r7) goto L_0x00ac
            android.support.b.a.f r12 = android.support.p003b.p004a.C0034f.m73a()
            goto L_0x00ad
        L_0x00ac:
            r12 = r9
        L_0x00ad:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f5
            if (r3 == 0) goto L_0x00df
            if (r0 != r7) goto L_0x00ba
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00be
        L_0x00ba:
            float r13 = r11.getFloat(r13, r10)
        L_0x00be:
            if (r5 == 0) goto L_0x00d6
            if (r4 != r7) goto L_0x00c7
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cb
        L_0x00c7:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cb:
            float[] r14 = new float[r8]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x00f2
        L_0x00d6:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00f2
        L_0x00df:
            if (r4 != r7) goto L_0x00e6
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ea
        L_0x00e6:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ea:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
        L_0x00f2:
            r9 = r11
            goto L_0x015c
        L_0x00f5:
            if (r3 == 0) goto L_0x013b
            if (r0 != r7) goto L_0x00ff
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x010e
        L_0x00ff:
            boolean r0 = m70a(r0)
            if (r0 == 0) goto L_0x010a
            int r13 = r11.getColor(r13, r2)
            goto L_0x010e
        L_0x010a:
            int r13 = r11.getInt(r13, r2)
        L_0x010e:
            if (r5 == 0) goto L_0x0132
            if (r4 != r7) goto L_0x0118
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0127
        L_0x0118:
            boolean r0 = m70a(r4)
            if (r0 == 0) goto L_0x0123
            int r11 = r11.getColor(r14, r2)
            goto L_0x0127
        L_0x0123:
            int r11 = r11.getInt(r14, r2)
        L_0x0127:
            int[] r14 = new int[r8]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015c
        L_0x0132:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015c
        L_0x013b:
            if (r5 == 0) goto L_0x015c
            if (r4 != r7) goto L_0x0145
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0154
        L_0x0145:
            boolean r13 = m70a(r4)
            if (r13 == 0) goto L_0x0150
            int r11 = r11.getColor(r14, r2)
            goto L_0x0154
        L_0x0150:
            int r11 = r11.getInt(r14, r2)
        L_0x0154:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015c:
            if (r9 == 0) goto L_0x0163
            if (r12 == 0) goto L_0x0163
            r9.setEvaluator(r12)
        L_0x0163:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003b.p004a.C0031e.m64a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static ValueAnimator m65a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f45g);
        TypedArray a2 = C0234c.m1095a(resources, theme, attributeSet, C0024a.f49k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m67a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0234c.m1101c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0030d.m51a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m66a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0234c.m1096a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0234c.m1096a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0234c.m1096a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null && a3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m68a(C0255b.m1186a(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0234c.m1096a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m67a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0234c.m1094a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0234c.m1094a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0234c.m1094a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0234c.m1098a(xmlPullParser, "valueFrom") && C0234c.m1098a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = m54a(typedArray, 5, 6);
            }
            PropertyValuesHolder a4 = m64a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0234c.m1094a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0234c.m1094a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m66a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m68a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        char c = 0;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4, fArr3, (float[]) null);
            pathMeasure2.getPosTan(f4, fArr3, (float[]) null);
            fArr[i] = fArr3[c];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                f4 -= ((Float) arrayList.get(i3)).floatValue();
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
            c = 0;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else {
            objectAnimator2.setValues(propertyValuesHolder == null ? new PropertyValuesHolder[]{ofFloat} : new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static void m69a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m70a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m71a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006a
            r10 = 1
            if (r0 == r10) goto L_0x006a
            r2 = 2
            if (r0 == r2) goto L_0x0016
        L_0x0012:
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0063
            int[] r0 = android.support.p003b.p004a.C0024a.f47i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = android.support.p005v4.p007b.p008a.C0234c.m1095a((android.content.res.Resources) r11, (android.content.res.Resources.Theme) r12, (android.util.AttributeSet) r13, (int[]) r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = android.support.p005v4.p007b.p008a.C0234c.m1096a((android.content.res.TypedArray) r14, (org.xmlpull.v1.XmlPullParser) r6, (java.lang.String) r0, (int) r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = android.support.p005v4.p007b.p008a.C0234c.m1094a((android.content.res.TypedArray) r14, (org.xmlpull.v1.XmlPullParser) r6, (java.lang.String) r0, (int) r2, (int) r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m63a((android.content.Context) r0, (android.content.res.Resources) r1, (android.content.res.Resources.Theme) r2, (org.xmlpull.v1.XmlPullParser) r3, (java.lang.String) r4, (int) r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m64a((android.content.res.TypedArray) r14, (int) r1, (int) r9, (int) r10, (java.lang.String) r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005f
            if (r8 != 0) goto L_0x005c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
        L_0x005c:
            r8.add(r0)
        L_0x005f:
            r14.recycle()
            goto L_0x0012
        L_0x0063:
            r11 = r18
            r12 = r19
            r13 = r21
            goto L_0x0012
        L_0x006a:
            if (r8 == 0) goto L_0x007f
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0072:
            if (r9 >= r0) goto L_0x007f
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0072
        L_0x007f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003b.p004a.C0031e.m71a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}
