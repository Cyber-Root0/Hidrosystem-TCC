package android.support.design.widget;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.support.design.C0045a;
import android.view.View;

/* renamed from: android.support.design.widget.q */
class C0153q {

    /* renamed from: a */
    private static final int[] f472a = {16843848};

    /* renamed from: a */
    static void m601a(View view, float f) {
        int integer = view.getResources().getInteger(C0045a.C0051f.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0045a.C0047b.state_collapsible, -C0045a.C0047b.state_collapsed}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
