package android.support.p020v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.c */
class C0867c extends C0832b {
    public C0867c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        if (this.f2815a.f2034d) {
            if (this.f2815a.f2033c != null) {
                drawable = this.f2815a.f2033c;
            } else {
                return;
            }
        } else if (this.f2815a.f2031a != null) {
            drawable = this.f2815a.f2031a;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }
}
