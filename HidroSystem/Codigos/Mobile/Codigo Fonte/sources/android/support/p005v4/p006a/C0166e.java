package android.support.p005v4.p006a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.a.e */
abstract class C0166e extends C0156aa {

    /* renamed from: a */
    boolean f519a;

    C0166e() {
    }

    /* renamed from: a */
    static void m633a(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo720a(View view, String str, Context context, AttributeSet attributeSet);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo720a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo720a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f519a && i != -1) {
            m633a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
