package android.support.p003b.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.p005v4.p007b.p008a.C0234c;
import android.support.p005v4.p009c.C0255b;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p016h.C0294a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.b.a.i */
public class C0037i extends C0036h {

    /* renamed from: a */
    static final PorterDuff.Mode f69a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0043f f70c;

    /* renamed from: d */
    private PorterDuffColorFilter f71d;

    /* renamed from: e */
    private ColorFilter f72e;

    /* renamed from: f */
    private boolean f73f;

    /* renamed from: g */
    private boolean f74g;

    /* renamed from: h */
    private Drawable.ConstantState f75h;

    /* renamed from: i */
    private final float[] f76i;

    /* renamed from: j */
    private final Matrix f77j;

    /* renamed from: k */
    private final Rect f78k;

    /* renamed from: android.support.b.a.i$a */
    private static class C0038a extends C0041d {
        public C0038a() {
        }

        public C0038a(C0038a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m88a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f106n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f105m = C0255b.m1193b(string2);
            }
        }

        /* renamed from: a */
        public void mo122a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0234c.m1098a(xmlPullParser, "pathData")) {
                TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f42d);
                m88a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo123a() {
            return true;
        }
    }

    /* renamed from: android.support.b.a.i$b */
    private static class C0039b extends C0041d {

        /* renamed from: a */
        int f79a = 0;

        /* renamed from: b */
        float f80b = 0.0f;

        /* renamed from: c */
        int f81c = 0;

        /* renamed from: d */
        float f82d = 1.0f;

        /* renamed from: e */
        int f83e = 0;

        /* renamed from: f */
        float f84f = 1.0f;

        /* renamed from: g */
        float f85g = 0.0f;

        /* renamed from: h */
        float f86h = 1.0f;

        /* renamed from: i */
        float f87i = 0.0f;

        /* renamed from: j */
        Paint.Cap f88j = Paint.Cap.BUTT;

        /* renamed from: k */
        Paint.Join f89k = Paint.Join.MITER;

        /* renamed from: l */
        float f90l = 4.0f;

        /* renamed from: p */
        private int[] f91p;

        public C0039b() {
        }

        public C0039b(C0039b bVar) {
            super(bVar);
            this.f91p = bVar.f91p;
            this.f79a = bVar.f79a;
            this.f80b = bVar.f80b;
            this.f82d = bVar.f82d;
            this.f81c = bVar.f81c;
            this.f83e = bVar.f83e;
            this.f84f = bVar.f84f;
            this.f85g = bVar.f85g;
            this.f86h = bVar.f86h;
            this.f87i = bVar.f87i;
            this.f88j = bVar.f88j;
            this.f89k = bVar.f89k;
            this.f90l = bVar.f90l;
        }

        /* renamed from: a */
        private Paint.Cap m91a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Paint.Join m92a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        private void m93a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f91p = null;
            if (C0234c.m1098a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f106n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f105m = C0255b.m1193b(string2);
                }
                this.f81c = C0234c.m1099b(typedArray, xmlPullParser, "fillColor", 1, this.f81c);
                this.f84f = C0234c.m1093a(typedArray, xmlPullParser, "fillAlpha", 12, this.f84f);
                this.f88j = m91a(C0234c.m1094a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f88j);
                this.f89k = m92a(C0234c.m1094a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f89k);
                this.f90l = C0234c.m1093a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f90l);
                this.f79a = C0234c.m1099b(typedArray, xmlPullParser, "strokeColor", 3, this.f79a);
                this.f82d = C0234c.m1093a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f82d);
                this.f80b = C0234c.m1093a(typedArray, xmlPullParser, "strokeWidth", 4, this.f80b);
                this.f86h = C0234c.m1093a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f86h);
                this.f87i = C0234c.m1093a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f87i);
                this.f85g = C0234c.m1093a(typedArray, xmlPullParser, "trimPathStart", 5, this.f85g);
                this.f83e = C0234c.m1094a(typedArray, xmlPullParser, "fillType", 13, this.f83e);
            }
        }

        /* renamed from: a */
        public void mo124a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f41c);
            m93a(a, xmlPullParser);
            a.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f84f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f81c;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f82d;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f79a;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f80b;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f86h;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f87i;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f85g;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f84f = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f81c = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f82d = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f79a = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f80b = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f86h = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f87i = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f85g = f;
        }
    }

    /* renamed from: android.support.b.a.i$c */
    private static class C0040c {

        /* renamed from: a */
        final ArrayList<Object> f92a = new ArrayList<>();

        /* renamed from: b */
        float f93b = 0.0f;

        /* renamed from: c */
        int f94c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Matrix f95d = new Matrix();

        /* renamed from: e */
        private float f96e = 0.0f;

        /* renamed from: f */
        private float f97f = 0.0f;

        /* renamed from: g */
        private float f98g = 1.0f;

        /* renamed from: h */
        private float f99h = 1.0f;

        /* renamed from: i */
        private float f100i = 0.0f;

        /* renamed from: j */
        private float f101j = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final Matrix f102k = new Matrix();

        /* renamed from: l */
        private int[] f103l;

        /* renamed from: m */
        private String f104m = null;

        public C0040c() {
        }

        public C0040c(C0040c cVar, C0294a<String, Object> aVar) {
            C0041d dVar;
            this.f93b = cVar.f93b;
            this.f96e = cVar.f96e;
            this.f97f = cVar.f97f;
            this.f98g = cVar.f98g;
            this.f99h = cVar.f99h;
            this.f100i = cVar.f100i;
            this.f101j = cVar.f101j;
            this.f103l = cVar.f103l;
            this.f104m = cVar.f104m;
            this.f94c = cVar.f94c;
            String str = this.f104m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f102k.set(cVar.f102k);
            ArrayList<Object> arrayList = cVar.f92a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0040c) {
                    this.f92a.add(new C0040c((C0040c) obj, aVar));
                } else {
                    if (obj instanceof C0039b) {
                        dVar = new C0039b((C0039b) obj);
                    } else if (obj instanceof C0038a) {
                        dVar = new C0038a((C0038a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f92a.add(dVar);
                    if (dVar.f106n != null) {
                        aVar.put(dVar.f106n, dVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m96a() {
            this.f102k.reset();
            this.f102k.postTranslate(-this.f96e, -this.f97f);
            this.f102k.postScale(this.f98g, this.f99h);
            this.f102k.postRotate(this.f93b, 0.0f, 0.0f);
            this.f102k.postTranslate(this.f100i + this.f96e, this.f101j + this.f97f);
        }

        /* renamed from: a */
        private void m97a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f103l = null;
            this.f93b = C0234c.m1093a(typedArray, xmlPullParser, "rotation", 5, this.f93b);
            this.f96e = typedArray.getFloat(1, this.f96e);
            this.f97f = typedArray.getFloat(2, this.f97f);
            this.f98g = C0234c.m1093a(typedArray, xmlPullParser, "scaleX", 3, this.f98g);
            this.f99h = C0234c.m1093a(typedArray, xmlPullParser, "scaleY", 4, this.f99h);
            this.f100i = C0234c.m1093a(typedArray, xmlPullParser, "translateX", 6, this.f100i);
            this.f101j = C0234c.m1093a(typedArray, xmlPullParser, "translateY", 7, this.f101j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f104m = string;
            }
            m96a();
        }

        /* renamed from: a */
        public void mo141a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f40b);
            m97a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f104m;
        }

        public Matrix getLocalMatrix() {
            return this.f102k;
        }

        public float getPivotX() {
            return this.f96e;
        }

        public float getPivotY() {
            return this.f97f;
        }

        public float getRotation() {
            return this.f93b;
        }

        public float getScaleX() {
            return this.f98g;
        }

        public float getScaleY() {
            return this.f99h;
        }

        public float getTranslateX() {
            return this.f100i;
        }

        public float getTranslateY() {
            return this.f101j;
        }

        public void setPivotX(float f) {
            if (f != this.f96e) {
                this.f96e = f;
                m96a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f97f) {
                this.f97f = f;
                m96a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f93b) {
                this.f93b = f;
                m96a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f98g) {
                this.f98g = f;
                m96a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f99h) {
                this.f99h = f;
                m96a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f100i) {
                this.f100i = f;
                m96a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f101j) {
                this.f101j = f;
                m96a();
            }
        }
    }

    /* renamed from: android.support.b.a.i$d */
    private static class C0041d {

        /* renamed from: m */
        protected C0255b.C0257b[] f105m = null;

        /* renamed from: n */
        String f106n;

        /* renamed from: o */
        int f107o;

        public C0041d() {
        }

        public C0041d(C0041d dVar) {
            this.f106n = dVar.f106n;
            this.f107o = dVar.f107o;
            this.f105m = C0255b.m1191a(dVar.f105m);
        }

        /* renamed from: a */
        public void mo158a(Path path) {
            path.reset();
            C0255b.C0257b[] bVarArr = this.f105m;
            if (bVarArr != null) {
                C0255b.C0257b.m1198a(bVarArr, path);
            }
        }

        /* renamed from: a */
        public boolean mo123a() {
            return false;
        }

        public C0255b.C0257b[] getPathData() {
            return this.f105m;
        }

        public String getPathName() {
            return this.f106n;
        }

        public void setPathData(C0255b.C0257b[] bVarArr) {
            if (!C0255b.m1189a(this.f105m, bVarArr)) {
                this.f105m = C0255b.m1191a(bVarArr);
            } else {
                C0255b.m1192b(this.f105m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.b.a.i$e */
    private static class C0042e {

        /* renamed from: k */
        private static final Matrix f108k = new Matrix();

        /* renamed from: a */
        final C0040c f109a;

        /* renamed from: b */
        float f110b;

        /* renamed from: c */
        float f111c;

        /* renamed from: d */
        float f112d;

        /* renamed from: e */
        float f113e;

        /* renamed from: f */
        int f114f;

        /* renamed from: g */
        String f115g;

        /* renamed from: h */
        final C0294a<String, Object> f116h;

        /* renamed from: i */
        private final Path f117i;

        /* renamed from: j */
        private final Path f118j;

        /* renamed from: l */
        private final Matrix f119l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Paint f120m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Paint f121n;

        /* renamed from: o */
        private PathMeasure f122o;

        /* renamed from: p */
        private int f123p;

        public C0042e() {
            this.f119l = new Matrix();
            this.f110b = 0.0f;
            this.f111c = 0.0f;
            this.f112d = 0.0f;
            this.f113e = 0.0f;
            this.f114f = 255;
            this.f115g = null;
            this.f116h = new C0294a<>();
            this.f109a = new C0040c();
            this.f117i = new Path();
            this.f118j = new Path();
        }

        public C0042e(C0042e eVar) {
            this.f119l = new Matrix();
            this.f110b = 0.0f;
            this.f111c = 0.0f;
            this.f112d = 0.0f;
            this.f113e = 0.0f;
            this.f114f = 255;
            this.f115g = null;
            this.f116h = new C0294a<>();
            this.f109a = new C0040c(eVar.f109a, this.f116h);
            this.f117i = new Path(eVar.f117i);
            this.f118j = new Path(eVar.f118j);
            this.f110b = eVar.f110b;
            this.f111c = eVar.f111c;
            this.f112d = eVar.f112d;
            this.f113e = eVar.f113e;
            this.f123p = eVar.f123p;
            this.f114f = eVar.f114f;
            this.f115g = eVar.f115g;
            String str = eVar.f115g;
            if (str != null) {
                this.f116h.put(str, this);
            }
        }

        /* renamed from: a */
        private static float m102a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m103a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m102a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m106a(C0040c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f95d.set(matrix);
            cVar.f95d.preConcat(cVar.f102k);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f92a.size(); i3++) {
                Object obj = cVar.f92a.get(i3);
                if (obj instanceof C0040c) {
                    m106a((C0040c) obj, cVar.f95d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0041d) {
                    m107a(cVar, (C0041d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m107a(C0040c cVar, C0041d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f112d;
            float f2 = ((float) i2) / this.f113e;
            float min = Math.min(f, f2);
            Matrix a = cVar.f95d;
            this.f119l.set(a);
            this.f119l.postScale(f, f2);
            float a2 = m103a(a);
            if (a2 != 0.0f) {
                dVar.mo158a(this.f117i);
                Path path = this.f117i;
                this.f118j.reset();
                if (dVar.mo123a()) {
                    this.f118j.addPath(path, this.f119l);
                    canvas.clipPath(this.f118j);
                    return;
                }
                C0039b bVar = (C0039b) dVar;
                if (!(bVar.f85g == 0.0f && bVar.f86h == 1.0f)) {
                    float f3 = (bVar.f85g + bVar.f87i) % 1.0f;
                    float f4 = (bVar.f86h + bVar.f87i) % 1.0f;
                    if (this.f122o == null) {
                        this.f122o = new PathMeasure();
                    }
                    this.f122o.setPath(this.f117i, false);
                    float length = this.f122o.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f122o.getSegment(f5, length, path, true);
                        this.f122o.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f122o.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f118j.addPath(path, this.f119l);
                if (bVar.f81c != 0) {
                    if (this.f121n == null) {
                        this.f121n = new Paint();
                        this.f121n.setStyle(Paint.Style.FILL);
                        this.f121n.setAntiAlias(true);
                    }
                    Paint paint = this.f121n;
                    paint.setColor(C0037i.m78a(bVar.f81c, bVar.f84f));
                    paint.setColorFilter(colorFilter);
                    this.f118j.setFillType(bVar.f83e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f118j, paint);
                }
                if (bVar.f79a != 0) {
                    if (this.f120m == null) {
                        this.f120m = new Paint();
                        this.f120m.setStyle(Paint.Style.STROKE);
                        this.f120m.setAntiAlias(true);
                    }
                    Paint paint2 = this.f120m;
                    if (bVar.f89k != null) {
                        paint2.setStrokeJoin(bVar.f89k);
                    }
                    if (bVar.f88j != null) {
                        paint2.setStrokeCap(bVar.f88j);
                    }
                    paint2.setStrokeMiter(bVar.f90l);
                    paint2.setColor(C0037i.m78a(bVar.f79a, bVar.f82d));
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(bVar.f80b * min * a2);
                    canvas.drawPath(this.f118j, paint2);
                }
            }
        }

        /* renamed from: a */
        public void mo162a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m106a(this.f109a, f108k, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f114f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f114f = i;
        }
    }

    /* renamed from: android.support.b.a.i$f */
    private static class C0043f extends Drawable.ConstantState {

        /* renamed from: a */
        int f124a;

        /* renamed from: b */
        C0042e f125b;

        /* renamed from: c */
        ColorStateList f126c;

        /* renamed from: d */
        PorterDuff.Mode f127d;

        /* renamed from: e */
        boolean f128e;

        /* renamed from: f */
        Bitmap f129f;

        /* renamed from: g */
        ColorStateList f130g;

        /* renamed from: h */
        PorterDuff.Mode f131h;

        /* renamed from: i */
        int f132i;

        /* renamed from: j */
        boolean f133j;

        /* renamed from: k */
        boolean f134k;

        /* renamed from: l */
        Paint f135l;

        public C0043f() {
            this.f126c = null;
            this.f127d = C0037i.f69a;
            this.f125b = new C0042e();
        }

        public C0043f(C0043f fVar) {
            this.f126c = null;
            this.f127d = C0037i.f69a;
            if (fVar != null) {
                this.f124a = fVar.f124a;
                this.f125b = new C0042e(fVar.f125b);
                if (fVar.f125b.f121n != null) {
                    Paint unused = this.f125b.f121n = new Paint(fVar.f125b.f121n);
                }
                if (fVar.f125b.f120m != null) {
                    Paint unused2 = this.f125b.f120m = new Paint(fVar.f125b.f120m);
                }
                this.f126c = fVar.f126c;
                this.f127d = fVar.f127d;
                this.f128e = fVar.f128e;
            }
        }

        /* renamed from: a */
        public Paint mo167a(ColorFilter colorFilter) {
            if (!mo170a() && colorFilter == null) {
                return null;
            }
            if (this.f135l == null) {
                this.f135l = new Paint();
                this.f135l.setFilterBitmap(true);
            }
            this.f135l.setAlpha(this.f125b.getRootAlpha());
            this.f135l.setColorFilter(colorFilter);
            return this.f135l;
        }

        /* renamed from: a */
        public void mo168a(int i, int i2) {
            this.f129f.eraseColor(0);
            this.f125b.mo162a(new Canvas(this.f129f), i, i2, (ColorFilter) null);
        }

        /* renamed from: a */
        public void mo169a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f129f, (Rect) null, rect, mo167a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo170a() {
            return this.f125b.getRootAlpha() < 255;
        }

        /* renamed from: b */
        public void mo171b(int i, int i2) {
            if (this.f129f == null || !mo174c(i, i2)) {
                this.f129f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f134k = true;
            }
        }

        /* renamed from: b */
        public boolean mo172b() {
            return !this.f134k && this.f130g == this.f126c && this.f131h == this.f127d && this.f133j == this.f128e && this.f132i == this.f125b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo173c() {
            this.f130g = this.f126c;
            this.f131h = this.f127d;
            this.f132i = this.f125b.getRootAlpha();
            this.f133j = this.f128e;
            this.f134k = false;
        }

        /* renamed from: c */
        public boolean mo174c(int i, int i2) {
            return i == this.f129f.getWidth() && i2 == this.f129f.getHeight();
        }

        public int getChangingConfigurations() {
            return this.f124a;
        }

        public Drawable newDrawable() {
            return new C0037i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0037i(this);
        }
    }

    /* renamed from: android.support.b.a.i$g */
    private static class C0044g extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f136a;

        public C0044g(Drawable.ConstantState constantState) {
            this.f136a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f136a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f136a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0037i iVar = new C0037i();
            iVar.f68b = (VectorDrawable) this.f136a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0037i iVar = new C0037i();
            iVar.f68b = (VectorDrawable) this.f136a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0037i iVar = new C0037i();
            iVar.f68b = (VectorDrawable) this.f136a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C0037i() {
        this.f74g = true;
        this.f76i = new float[9];
        this.f77j = new Matrix();
        this.f78k = new Rect();
        this.f70c = new C0043f();
    }

    C0037i(C0043f fVar) {
        this.f74g = true;
        this.f76i = new float[9];
        this.f77j = new Matrix();
        this.f78k = new Rect();
        this.f70c = fVar;
        this.f71d = mo98a(this.f71d, fVar.f126c, fVar.f127d);
    }

    /* renamed from: a */
    static int m78a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m79a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.ADD : mode;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p003b.p004a.C0037i m80a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            android.support.b.a.i r0 = new android.support.b.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = android.support.p005v4.p007b.p008a.C0233b.m1091a(r4, r5, r6)
            r0.f68b = r4
            android.support.b.a.i$g r4 = new android.support.b.a.i$g
            android.graphics.drawable.Drawable r5 = r0.f68b
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f75h = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            android.support.b.a.i r4 = m81a(r4, r5, r0, r6)     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
            throw r4     // Catch:{ XmlPullParserException -> 0x0043, IOException -> 0x0041 }
        L_0x0041:
            r4 = move-exception
            goto L_0x0044
        L_0x0043:
            r4 = move-exception
        L_0x0044:
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003b.p004a.C0037i.m80a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.b.a.i");
    }

    /* renamed from: a */
    public static C0037i m81a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0037i iVar = new C0037i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    private void m82a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0043f fVar = this.f70c;
        C0042e eVar = fVar.f125b;
        fVar.f127d = m79a(C0234c.m1094a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f126c = colorStateList;
        }
        fVar.f128e = C0234c.m1097a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f128e);
        eVar.f112d = C0234c.m1093a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f112d);
        eVar.f113e = C0234c.m1093a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f113e);
        if (eVar.f112d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (eVar.f113e > 0.0f) {
            eVar.f110b = typedArray.getDimension(3, eVar.f110b);
            eVar.f111c = typedArray.getDimension(2, eVar.f111c);
            if (eVar.f110b <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (eVar.f111c > 0.0f) {
                eVar.setAlpha(C0234c.m1093a(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    eVar.f115g = string;
                    eVar.f116h.put(string, eVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: a */
    private boolean m83a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0240a.m1135g(this) == 1;
    }

    /* renamed from: b */
    private void m84b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C0043f fVar = this.f70c;
        C0042e eVar = fVar.f125b;
        Stack stack = new Stack();
        stack.push(eVar.f109a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0040c cVar = (C0040c) stack.peek();
                if ("path".equals(name)) {
                    C0039b bVar = new C0039b();
                    bVar.mo124a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f92a.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.f116h.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    i = fVar.f124a;
                    i2 = bVar.f107o;
                } else if ("clip-path".equals(name)) {
                    C0038a aVar = new C0038a();
                    aVar.mo122a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f92a.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.f116h.put(aVar.getPathName(), aVar);
                    }
                    i = fVar.f124a;
                    i2 = aVar.f107o;
                } else if ("group".equals(name)) {
                    C0040c cVar2 = new C0040c();
                    cVar2.mo141a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f92a.add(cVar2);
                    stack.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.f116h.put(cVar2.getGroupName(), cVar2);
                    }
                    i = fVar.f124a;
                    i2 = cVar2.f94c;
                }
                fVar.f124a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo98a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo99a(String str) {
        return this.f70c.f125b.f116h.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100a(boolean z) {
        this.f74g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.f68b == null) {
            return false;
        }
        C0240a.m1132d(this.f68b);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f68b != null) {
            this.f68b.draw(canvas);
            return;
        }
        copyBounds(this.f78k);
        if (this.f78k.width() > 0 && this.f78k.height() > 0) {
            ColorFilter colorFilter = this.f72e;
            if (colorFilter == null) {
                colorFilter = this.f71d;
            }
            canvas.getMatrix(this.f77j);
            this.f77j.getValues(this.f76i);
            float abs = Math.abs(this.f76i[0]);
            float abs2 = Math.abs(this.f76i[4]);
            float abs3 = Math.abs(this.f76i[1]);
            float abs4 = Math.abs(this.f76i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f78k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f78k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f78k.left, (float) this.f78k.top);
                if (m83a()) {
                    canvas.translate((float) this.f78k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f78k.offsetTo(0, 0);
                this.f70c.mo171b(min, min2);
                if (!this.f74g) {
                    this.f70c.mo168a(min, min2);
                } else if (!this.f70c.mo172b()) {
                    this.f70c.mo168a(min, min2);
                    this.f70c.mo173c();
                }
                this.f70c.mo169a(canvas, colorFilter, this.f78k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        return this.f68b != null ? C0240a.m1131c(this.f68b) : this.f70c.f125b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        return this.f68b != null ? this.f68b.getChangingConfigurations() : super.getChangingConfigurations() | this.f70c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f68b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0044g(this.f68b.getConstantState());
        }
        this.f70c.f124a = getChangingConfigurations();
        return this.f70c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f68b != null ? this.f68b.getIntrinsicHeight() : (int) this.f70c.f125b.f111c;
    }

    public int getIntrinsicWidth() {
        return this.f68b != null ? this.f68b.getIntrinsicWidth() : (int) this.f70c.f125b.f110b;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        if (this.f68b != null) {
            return this.f68b.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f68b != null) {
            this.f68b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f68b != null) {
            C0240a.m1126a(this.f68b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0043f fVar = this.f70c;
        fVar.f125b = new C0042e();
        TypedArray a = C0234c.m1095a(resources, theme, attributeSet, C0024a.f39a);
        m82a(a, xmlPullParser);
        a.recycle();
        fVar.f124a = getChangingConfigurations();
        fVar.f134k = true;
        m84b(resources, xmlPullParser, attributeSet, theme);
        this.f71d = mo98a(this.f71d, fVar.f126c, fVar.f127d);
    }

    public void invalidateSelf() {
        if (this.f68b != null) {
            this.f68b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        return this.f68b != null ? C0240a.m1129b(this.f68b) : this.f70c.f128e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r1.f70c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f68b
            if (r0 == 0) goto L_0x000b
            android.graphics.drawable.Drawable r0 = r1.f68b
            boolean r0 = r0.isStateful()
            return r0
        L_0x000b:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0026
            android.support.b.a.i$f r0 = r1.f70c
            if (r0 == 0) goto L_0x0024
            android.content.res.ColorStateList r0 = r0.f126c
            if (r0 == 0) goto L_0x0024
            android.support.b.a.i$f r0 = r1.f70c
            android.content.res.ColorStateList r0 = r0.f126c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003b.p004a.C0037i.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f68b != null) {
            this.f68b.mutate();
            return this;
        }
        if (!this.f73f && super.mutate() == this) {
            this.f70c = new C0043f(this.f70c);
            this.f73f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f68b != null) {
            this.f68b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f68b != null) {
            return this.f68b.setState(iArr);
        }
        C0043f fVar = this.f70c;
        if (fVar.f126c == null || fVar.f127d == null) {
            return false;
        }
        this.f71d = mo98a(this.f71d, fVar.f126c, fVar.f127d);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f68b != null) {
            this.f68b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f68b != null) {
            this.f68b.setAlpha(i);
        } else if (this.f70c.f125b.getRootAlpha() != i) {
            this.f70c.f125b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f68b != null) {
            C0240a.m1128a(this.f68b, z);
        } else {
            this.f70c.f128e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f68b != null) {
            this.f68b.setColorFilter(colorFilter);
            return;
        }
        this.f72e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f68b != null) {
            C0240a.m1122a(this.f68b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f68b != null) {
            C0240a.m1124a(this.f68b, colorStateList);
            return;
        }
        C0043f fVar = this.f70c;
        if (fVar.f126c != colorStateList) {
            fVar.f126c = colorStateList;
            this.f71d = mo98a(this.f71d, colorStateList, fVar.f127d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f68b != null) {
            C0240a.m1127a(this.f68b, mode);
            return;
        }
        C0043f fVar = this.f70c;
        if (fVar.f127d != mode) {
            fVar.f127d = mode;
            this.f71d = mo98a(this.f71d, fVar.f126c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f68b != null ? this.f68b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f68b != null) {
            this.f68b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
