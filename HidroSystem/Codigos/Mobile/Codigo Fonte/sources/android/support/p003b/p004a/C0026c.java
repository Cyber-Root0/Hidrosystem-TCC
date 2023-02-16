package android.support.p003b.p004a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p007b.p008a.C0234c;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p016h.C0294a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.b.a.c */
public class C0026c extends C0036h implements C0025b {

    /* renamed from: a */
    final Drawable.Callback f51a;

    /* renamed from: c */
    private C0028a f52c;

    /* renamed from: d */
    private Context f53d;

    /* renamed from: e */
    private ArgbEvaluator f54e;

    /* renamed from: f */
    private Animator.AnimatorListener f55f;

    /* renamed from: g */
    private ArrayList<Object> f56g;

    /* renamed from: android.support.b.a.c$a */
    private static class C0028a extends Drawable.ConstantState {

        /* renamed from: a */
        int f58a;

        /* renamed from: b */
        C0037i f59b;

        /* renamed from: c */
        AnimatorSet f60c;

        /* renamed from: d */
        C0294a<Animator, String> f61d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ArrayList<Animator> f62e;

        public C0028a(Context context, C0028a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f58a = aVar.f58a;
                C0037i iVar = aVar.f59b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f59b = (C0037i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f59b = (C0037i) this.f59b.mutate();
                    this.f59b.setCallback(callback);
                    this.f59b.setBounds(aVar.f59b.getBounds());
                    this.f59b.mo100a(false);
                }
                ArrayList<Animator> arrayList = aVar.f62e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f62e = new ArrayList<>(size);
                    this.f61d = new C0294a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f62e.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f61d.get(animator);
                        clone.setTarget(this.f59b.mo99a(str));
                        this.f62e.add(clone);
                        this.f61d.put(clone, str);
                    }
                    mo85a();
                }
            }
        }

        /* renamed from: a */
        public void mo85a() {
            if (this.f60c == null) {
                this.f60c = new AnimatorSet();
            }
            this.f60c.playTogether(this.f62e);
        }

        public int getChangingConfigurations() {
            return this.f58a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.b.a.c$b */
    private static class C0029b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f63a;

        public C0029b(Drawable.ConstantState constantState) {
            this.f63a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f63a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f63a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0026c cVar = new C0026c();
            cVar.f68b = this.f63a.newDrawable();
            cVar.f68b.setCallback(cVar.f51a);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0026c cVar = new C0026c();
            cVar.f68b = this.f63a.newDrawable(resources);
            cVar.f68b.setCallback(cVar.f51a);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0026c cVar = new C0026c();
            cVar.f68b = this.f63a.newDrawable(resources, theme);
            cVar.f68b.setCallback(cVar.f51a);
            return cVar;
        }
    }

    C0026c() {
        this((Context) null, (C0028a) null, (Resources) null);
    }

    private C0026c(Context context) {
        this(context, (C0028a) null, (Resources) null);
    }

    private C0026c(Context context, C0028a aVar, Resources resources) {
        this.f54e = null;
        this.f55f = null;
        this.f56g = null;
        this.f51a = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C0026c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0026c.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0026c.this.unscheduleSelf(runnable);
            }
        };
        this.f53d = context;
        if (aVar != null) {
            this.f52c = aVar;
        } else {
            this.f52c = new C0028a(context, aVar, this.f51a, resources);
        }
    }

    /* renamed from: a */
    public static C0026c m45a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0026c cVar = new C0026c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m46a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m46a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f54e == null) {
                    this.f54e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f54e);
            }
        }
    }

    /* renamed from: a */
    private void m47a(String str, Animator animator) {
        animator.setTarget(this.f52c.f59b.mo99a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m46a(animator);
        }
        if (this.f52c.f62e == null) {
            ArrayList unused = this.f52c.f62e = new ArrayList();
            this.f52c.f61d = new C0294a<>();
        }
        this.f52c.f62e.add(animator);
        this.f52c.f61d.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f68b != null) {
            C0240a.m1125a(this.f68b, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f68b != null) {
            return C0240a.m1132d(this.f68b);
        }
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
        this.f52c.f59b.draw(canvas);
        if (this.f52c.f60c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f68b != null ? C0240a.m1131c(this.f68b) : this.f52c.f59b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.f68b != null ? this.f68b.getChangingConfigurations() : super.getChangingConfigurations() | this.f52c.f58a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f68b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0029b(this.f68b.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f68b != null ? this.f68b.getIntrinsicHeight() : this.f52c.f59b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f68b != null ? this.f68b.getIntrinsicWidth() : this.f52c.f59b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f68b != null ? this.f68b.getOpacity() : this.f52c.f59b.getOpacity();
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
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        if (this.f68b != null) {
            C0240a.m1126a(this.f68b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0234c.m1095a(resources, theme, attributeSet, C0024a.f43e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0037i a = C0037i.m80a(resources, resourceId, theme);
                        a.mo100a(false);
                        a.setCallback(this.f51a);
                        if (this.f52c.f59b != null) {
                            this.f52c.f59b.setCallback((Drawable.Callback) null);
                        }
                        this.f52c.f59b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0024a.f44f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f53d;
                        if (context != null) {
                            m47a(string, C0031e.m55a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f52c.mo85a();
    }

    public boolean isAutoMirrored() {
        return this.f68b != null ? C0240a.m1129b(this.f68b) : this.f52c.f59b.isAutoMirrored();
    }

    public boolean isRunning() {
        return this.f68b != null ? ((AnimatedVectorDrawable) this.f68b).isRunning() : this.f52c.f60c.isRunning();
    }

    public boolean isStateful() {
        return this.f68b != null ? this.f68b.isStateful() : this.f52c.f59b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f68b != null) {
            this.f68b.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f68b != null) {
            this.f68b.setBounds(rect);
        } else {
            this.f52c.f59b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f68b != null ? this.f68b.setLevel(i) : this.f52c.f59b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f68b != null ? this.f68b.setState(iArr) : this.f52c.f59b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f68b != null) {
            this.f68b.setAlpha(i);
        } else {
            this.f52c.f59b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f68b != null) {
            C0240a.m1128a(this.f68b, z);
        } else {
            this.f52c.f59b.setAutoMirrored(z);
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
        } else {
            this.f52c.f59b.setColorFilter(colorFilter);
        }
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
            this.f52c.f59b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f68b != null) {
            C0240a.m1124a(this.f68b, colorStateList);
        } else {
            this.f52c.f59b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f68b != null) {
            C0240a.m1127a(this.f68b, mode);
        } else {
            this.f52c.f59b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f68b != null) {
            return this.f68b.setVisible(z, z2);
        }
        this.f52c.f59b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.f68b != null) {
            ((AnimatedVectorDrawable) this.f68b).start();
        } else if (!this.f52c.f60c.isStarted()) {
            this.f52c.f60c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f68b != null) {
            ((AnimatedVectorDrawable) this.f68b).stop();
        } else {
            this.f52c.f60c.end();
        }
    }
}
