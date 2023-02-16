package android.support.p005v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p005v4.widget.C0496f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.e */
public abstract class C0493e extends BaseAdapter implements C0496f.C0497a, Filterable {

    /* renamed from: a */
    protected boolean f1339a;

    /* renamed from: b */
    protected boolean f1340b;

    /* renamed from: c */
    protected Cursor f1341c;

    /* renamed from: d */
    protected Context f1342d;

    /* renamed from: e */
    protected int f1343e;

    /* renamed from: f */
    protected C0494a f1344f;

    /* renamed from: g */
    protected DataSetObserver f1345g;

    /* renamed from: h */
    protected C0496f f1346h;

    /* renamed from: i */
    protected FilterQueryProvider f1347i;

    /* renamed from: android.support.v4.widget.e$a */
    private class C0494a extends ContentObserver {
        C0494a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0493e.this.mo2140b();
        }
    }

    /* renamed from: android.support.v4.widget.e$b */
    private class C0495b extends DataSetObserver {
        C0495b() {
        }

        public void onChanged() {
            C0493e eVar = C0493e.this;
            eVar.f1339a = true;
            eVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0493e eVar = C0493e.this;
            eVar.f1339a = false;
            eVar.notifyDataSetInvalidated();
        }
    }

    public C0493e(Context context, Cursor cursor, boolean z) {
        mo2135a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo2132a() {
        return this.f1341c;
    }

    /* renamed from: a */
    public Cursor mo2133a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f1347i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f1341c;
    }

    /* renamed from: a */
    public abstract View mo2134a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2135a(Context context, Cursor cursor, int i) {
        C0495b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1340b = true;
        } else {
            this.f1340b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f1341c = cursor;
        this.f1339a = z;
        this.f1342d = context;
        this.f1343e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1344f = new C0494a();
            bVar = new C0495b();
        } else {
            bVar = null;
            this.f1344f = null;
        }
        this.f1345g = bVar;
        if (z) {
            C0494a aVar = this.f1344f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1345g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo2136a(Cursor cursor) {
        Cursor b = mo2138b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: a */
    public abstract void mo2137a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor mo2138b(Cursor cursor) {
        Cursor cursor2 = this.f1341c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0494a aVar = this.f1344f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1345g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1341c = cursor;
        if (cursor != null) {
            C0494a aVar2 = this.f1344f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f1345g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1343e = cursor.getColumnIndexOrThrow("_id");
            this.f1339a = true;
            notifyDataSetChanged();
        } else {
            this.f1343e = -1;
            this.f1339a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public View mo2139b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2134a(context, cursor, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2140b() {
        Cursor cursor;
        if (this.f1340b && (cursor = this.f1341c) != null && !cursor.isClosed()) {
            this.f1339a = this.f1341c.requery();
        }
    }

    /* renamed from: c */
    public CharSequence mo2141c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f1339a || (cursor = this.f1341c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1339a) {
            return null;
        }
        this.f1341c.moveToPosition(i);
        if (view == null) {
            view = mo2139b(this.f1342d, this.f1341c, viewGroup);
        }
        mo2137a(view, this.f1342d, this.f1341c);
        return view;
    }

    public Filter getFilter() {
        if (this.f1346h == null) {
            this.f1346h = new C0496f(this);
        }
        return this.f1346h;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1339a || (cursor = this.f1341c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1341c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f1339a || (cursor = this.f1341c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f1341c.getLong(this.f1343e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1339a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1341c.moveToPosition(i)) {
            if (view == null) {
                view = mo2134a(this.f1342d, this.f1341c, viewGroup);
            }
            mo2137a(view, this.f1342d, this.f1341c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
