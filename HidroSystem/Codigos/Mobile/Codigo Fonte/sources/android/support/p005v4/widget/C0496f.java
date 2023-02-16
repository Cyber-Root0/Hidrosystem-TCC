package android.support.p005v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.f */
class C0496f extends Filter {

    /* renamed from: a */
    C0497a f1350a;

    /* renamed from: android.support.v4.widget.f$a */
    interface C0497a {
        /* renamed from: a */
        Cursor mo2132a();

        /* renamed from: a */
        Cursor mo2133a(CharSequence charSequence);

        /* renamed from: a */
        void mo2136a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo2141c(Cursor cursor);
    }

    C0496f(C0497a aVar) {
        this.f1350a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1350a.mo2141c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1350a.mo2133a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f1350a.mo2132a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f1350a.mo2136a((Cursor) filterResults.values);
        }
    }
}
