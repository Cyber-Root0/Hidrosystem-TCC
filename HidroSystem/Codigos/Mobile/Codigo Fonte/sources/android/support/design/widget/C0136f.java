package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.f */
class C0136f extends C0127e {

    /* renamed from: p */
    private InsetDrawable f413p;

    C0136f(C0154r rVar, C0141j jVar) {
        super(rVar, jVar);
    }

    /* renamed from: a */
    public float mo619a() {
        return this.f392n.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo621a(float f, float f2) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f392n.isEnabled()) {
                this.f392n.setElevation(f);
                if (this.f392n.isFocused() || this.f392n.isPressed()) {
                    this.f392n.setTranslationZ(f2);
                }
            } else {
                this.f392n.setElevation(0.0f);
            }
            this.f392n.setTranslationZ(0.0f);
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.f392n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f392n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(f379a);
            stateListAnimator.addState(f380j, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.f392n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f392n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet2.setInterpolator(f379a);
            stateListAnimator.addState(f381k, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f392n, "elevation", new float[]{f}).setDuration(0));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f392n, View.TRANSLATION_Z, new float[]{this.f392n.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f392n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(f379a);
            stateListAnimator.addState(f382l, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.f392n, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f392n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            animatorSet4.setInterpolator(f379a);
            stateListAnimator.addState(f383m, animatorSet4);
            this.f392n.setStateListAnimator(stateListAnimator);
        }
        if (this.f393o.mo530b()) {
            mo633e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo622a(int i) {
        if (this.f387e instanceof RippleDrawable) {
            ((RippleDrawable) this.f387e).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo622a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo625a(Rect rect) {
        if (this.f393o.mo530b()) {
            float a = this.f393o.mo527a();
            float a2 = mo619a() + this.f391i;
            int ceil = (int) Math.ceil((double) C0140i.m556b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) C0140i.m553a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo627a(int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo628b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo629b(Rect rect) {
        C0141j jVar;
        Drawable drawable;
        if (this.f393o.mo530b()) {
            this.f413p = new InsetDrawable(this.f387e, rect.left, rect.top, rect.right, rect.bottom);
            jVar = this.f393o;
            drawable = this.f413p;
        } else {
            jVar = this.f393o;
            drawable = this.f387e;
        }
        jVar.mo529a(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo632d() {
        mo633e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo636h() {
        return false;
    }
}
