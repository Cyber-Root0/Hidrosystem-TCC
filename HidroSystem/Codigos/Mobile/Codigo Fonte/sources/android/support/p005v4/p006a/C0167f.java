package android.support.p005v4.p006a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.a.f */
abstract class C0167f extends C0166e {

    /* renamed from: b */
    boolean f520b;

    C0167f() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f520b && i != -1) {
            m633a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f519a && i != -1) {
            m633a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
