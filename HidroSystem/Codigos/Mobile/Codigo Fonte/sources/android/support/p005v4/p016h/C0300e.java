package android.support.p005v4.p016h;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.h.e */
public class C0300e extends Writer {

    /* renamed from: a */
    private final String f896a;

    /* renamed from: b */
    private StringBuilder f897b = new StringBuilder(128);

    public C0300e(String str) {
        this.f896a = str;
    }

    /* renamed from: a */
    private void m1340a() {
        if (this.f897b.length() > 0) {
            Log.d(this.f896a, this.f897b.toString());
            StringBuilder sb = this.f897b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m1340a();
    }

    public void flush() {
        m1340a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m1340a();
            } else {
                this.f897b.append(c);
            }
        }
    }
}
