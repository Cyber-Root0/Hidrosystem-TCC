package android.support.p020v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p020v7.app.AlertController;
import android.support.p020v7.p021a.C0526a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.d */
public class C0565d extends C0597n implements DialogInterface {

    /* renamed from: a */
    final AlertController f1518a = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.d$a */
    public static class C0566a {

        /* renamed from: a */
        private final AlertController.C0542a f1519a;

        /* renamed from: b */
        private final int f1520b;

        public C0566a(Context context) {
            this(context, C0565d.m2529a(context, 0));
        }

        public C0566a(Context context, int i) {
            this.f1519a = new AlertController.C0542a(new ContextThemeWrapper(context, C0565d.m2529a(context, i)));
            this.f1520b = i;
        }

        /* renamed from: a */
        public Context mo2269a() {
            return this.f1519a.f1456a;
        }

        /* renamed from: a */
        public C0566a mo2270a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1519a.f1473r = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0566a mo2271a(Drawable drawable) {
            this.f1519a.f1459d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0566a mo2272a(View view) {
            this.f1519a.f1462g = view;
            return this;
        }

        /* renamed from: a */
        public C0566a mo2273a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0542a aVar = this.f1519a;
            aVar.f1475t = listAdapter;
            aVar.f1476u = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0566a mo2274a(CharSequence charSequence) {
            this.f1519a.f1461f = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0565d mo2275b() {
            C0565d dVar = new C0565d(this.f1519a.f1456a, this.f1520b);
            this.f1519a.mo2215a(dVar.f1518a);
            dVar.setCancelable(this.f1519a.f1470o);
            if (this.f1519a.f1470o) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f1519a.f1471p);
            dVar.setOnDismissListener(this.f1519a.f1472q);
            if (this.f1519a.f1473r != null) {
                dVar.setOnKeyListener(this.f1519a.f1473r);
            }
            return dVar;
        }
    }

    protected C0565d(Context context, int i) {
        super(context, m2529a(context, i));
    }

    /* renamed from: a */
    static int m2529a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0526a.C0527a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1518a.mo2196a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1518a.mo2202a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1518a.mo2206b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1518a.mo2201a(charSequence);
    }
}
