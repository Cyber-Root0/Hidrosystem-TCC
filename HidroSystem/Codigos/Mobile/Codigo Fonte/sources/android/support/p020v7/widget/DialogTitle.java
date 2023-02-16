package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p020v7.p021a.C0526a;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.DialogTitle */
public class DialogTitle extends TextView {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0526a.C0536j.TextAppearance, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0526a.C0536j.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
    }
}
