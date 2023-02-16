package android.support.p020v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0832b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2815a;

    public C0832b(ActionBarContainer actionBarContainer) {
        this.f2815a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        if (!this.f2815a.f2034d) {
            if (this.f2815a.f2031a != null) {
                this.f2815a.f2031a.draw(canvas);
            }
            if (this.f2815a.f2032b != null && this.f2815a.f2035e) {
                drawable = this.f2815a.f2032b;
            } else {
                return;
            }
        } else if (this.f2815a.f2033c != null) {
            drawable = this.f2815a.f2033c;
        } else {
            return;
        }
        drawable.draw(canvas);
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
