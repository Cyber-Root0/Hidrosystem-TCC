package android.support.design.widget;

import android.content.Context;
import android.support.p005v4.p017i.C0358b;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.widget.C0899o;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends C0899o implements Checkable {

    /* renamed from: a */
    private static final int[] f241a = {16842912};

    /* renamed from: b */
    private boolean f242b;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0388q.m1645a((View) this, (C0358b) new C0358b() {
            /* renamed from: a */
            public void mo199a(View view, C0328b bVar) {
                super.mo199a(view, bVar);
                bVar.mo1418a(true);
                bVar.mo1425b(CheckableImageButton.this.isChecked());
            }

            /* renamed from: a */
            public void mo387a(View view, AccessibilityEvent accessibilityEvent) {
                super.mo387a(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    public boolean isChecked() {
        return this.f242b;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f242b ? mergeDrawableStates(super.onCreateDrawableState(i + f241a.length), f241a) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f242b != z) {
            this.f242b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f242b);
    }
}
