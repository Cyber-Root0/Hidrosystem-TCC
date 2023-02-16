package android.support.p020v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p020v7.p021a.C0526a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.w */
public class C0908w extends SeekBar {

    /* renamed from: a */
    private final C0909x f3060a;

    public C0908w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.seekBarStyle);
    }

    public C0908w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3060a = new C0909x(this);
        this.f3060a.mo4501a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3060a.mo4514c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3060a.mo4513b();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3060a.mo4511a(canvas);
    }
}
