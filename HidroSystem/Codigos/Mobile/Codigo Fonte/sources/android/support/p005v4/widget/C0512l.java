package android.support.p005v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.l */
public abstract class C0512l extends C0493e {

    /* renamed from: j */
    private int f1358j;

    /* renamed from: k */
    private int f1359k;

    /* renamed from: l */
    private LayoutInflater f1360l;

    @Deprecated
    public C0512l(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1359k = i;
        this.f1358j = i;
        this.f1360l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo2134a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1360l.inflate(this.f1358j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2139b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1360l.inflate(this.f1359k, viewGroup, false);
    }
}
