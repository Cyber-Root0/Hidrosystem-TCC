package android.support.p020v7.view;

import android.content.Context;
import android.support.p005v4.p011d.p012a.C0268a;
import android.support.p005v4.p011d.p012a.C0269b;
import android.support.p005v4.p016h.C0319m;
import android.support.p020v7.view.C0625b;
import android.support.p020v7.view.menu.C0673q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public class C0630f extends ActionMode {

    /* renamed from: a */
    final Context f1742a;

    /* renamed from: b */
    final C0625b f1743b;

    /* renamed from: android.support.v7.view.f$a */
    public static class C0631a implements C0625b.C0626a {

        /* renamed from: a */
        final ActionMode.Callback f1744a;

        /* renamed from: b */
        final Context f1745b;

        /* renamed from: c */
        final ArrayList<C0630f> f1746c = new ArrayList<>();

        /* renamed from: d */
        final C0319m<Menu, Menu> f1747d = new C0319m<>();

        public C0631a(Context context, ActionMode.Callback callback) {
            this.f1745b = context;
            this.f1744a = callback;
        }

        /* renamed from: a */
        private Menu m2898a(Menu menu) {
            Menu menu2 = this.f1747d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0673q.m3188a(this.f1745b, (C0268a) menu);
            this.f1747d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public void mo2386a(C0625b bVar) {
            this.f1744a.onDestroyActionMode(mo2522b(bVar));
        }

        /* renamed from: a */
        public boolean mo2387a(C0625b bVar, Menu menu) {
            return this.f1744a.onCreateActionMode(mo2522b(bVar), m2898a(menu));
        }

        /* renamed from: a */
        public boolean mo2388a(C0625b bVar, MenuItem menuItem) {
            return this.f1744a.onActionItemClicked(mo2522b(bVar), C0673q.m3189a(this.f1745b, (C0269b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo2522b(C0625b bVar) {
            int size = this.f1746c.size();
            for (int i = 0; i < size; i++) {
                C0630f fVar = this.f1746c.get(i);
                if (fVar != null && fVar.f1743b == bVar) {
                    return fVar;
                }
            }
            C0630f fVar2 = new C0630f(this.f1745b, bVar);
            this.f1746c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo2389b(C0625b bVar, Menu menu) {
            return this.f1744a.onPrepareActionMode(mo2522b(bVar), m2898a(menu));
        }
    }

    public C0630f(Context context, C0625b bVar) {
        this.f1742a = context;
        this.f1743b = bVar;
    }

    public void finish() {
        this.f1743b.mo2437c();
    }

    public View getCustomView() {
        return this.f1743b.mo2443i();
    }

    public Menu getMenu() {
        return C0673q.m3188a(this.f1742a, (C0268a) this.f1743b.mo2434b());
    }

    public MenuInflater getMenuInflater() {
        return this.f1743b.mo2429a();
    }

    public CharSequence getSubtitle() {
        return this.f1743b.mo2441g();
    }

    public Object getTag() {
        return this.f1743b.mo2493j();
    }

    public CharSequence getTitle() {
        return this.f1743b.mo2440f();
    }

    public boolean getTitleOptionalHint() {
        return this.f1743b.mo2494k();
    }

    public void invalidate() {
        this.f1743b.mo2438d();
    }

    public boolean isTitleOptional() {
        return this.f1743b.mo2442h();
    }

    public void setCustomView(View view) {
        this.f1743b.mo2431a(view);
    }

    public void setSubtitle(int i) {
        this.f1743b.mo2435b(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1743b.mo2432a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1743b.mo2492a(obj);
    }

    public void setTitle(int i) {
        this.f1743b.mo2430a(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1743b.mo2436b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1743b.mo2433a(z);
    }
}
