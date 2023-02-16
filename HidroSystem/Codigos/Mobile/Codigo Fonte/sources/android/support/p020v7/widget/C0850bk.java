package android.support.p020v7.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.bk */
public class C0850bk {

    /* renamed from: a */
    private static final C0854c f2901a = (Build.VERSION.SDK_INT >= 26 ? new C0852a() : new C0853b());

    @TargetApi(26)
    /* renamed from: android.support.v7.widget.bk$a */
    private static class C0852a implements C0854c {
        private C0852a() {
        }

        /* renamed from: a */
        public void mo4313a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.bk$b */
    private static class C0853b implements C0854c {
        private C0853b() {
        }

        /* renamed from: a */
        public void mo4313a(View view, CharSequence charSequence) {
            C0855bl.m4697a(view, charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.bk$c */
    private interface C0854c {
        /* renamed from: a */
        void mo4313a(View view, CharSequence charSequence);
    }

    /* renamed from: a */
    public static void m4690a(View view, CharSequence charSequence) {
        f2901a.mo4313a(view, charSequence);
    }
}
