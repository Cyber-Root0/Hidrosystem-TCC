package android.support.p020v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p005v4.p007b.C0227a;
import android.support.p005v4.p011d.p012a.C0268a;
import android.support.p020v7.p021a.C0526a;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C0653h implements C0268a {

    /* renamed from: d */
    private static final int[] f1919d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    CharSequence f1920a;

    /* renamed from: b */
    Drawable f1921b;

    /* renamed from: c */
    View f1922c;

    /* renamed from: e */
    private final Context f1923e;

    /* renamed from: f */
    private final Resources f1924f;

    /* renamed from: g */
    private boolean f1925g;

    /* renamed from: h */
    private boolean f1926h;

    /* renamed from: i */
    private C0654a f1927i;

    /* renamed from: j */
    private ArrayList<C0657j> f1928j;

    /* renamed from: k */
    private ArrayList<C0657j> f1929k;

    /* renamed from: l */
    private boolean f1930l;

    /* renamed from: m */
    private ArrayList<C0657j> f1931m;

    /* renamed from: n */
    private ArrayList<C0657j> f1932n;

    /* renamed from: o */
    private boolean f1933o;

    /* renamed from: p */
    private int f1934p = 0;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f1935q;

    /* renamed from: r */
    private boolean f1936r = false;

    /* renamed from: s */
    private boolean f1937s = false;

    /* renamed from: t */
    private boolean f1938t = false;

    /* renamed from: u */
    private boolean f1939u = false;

    /* renamed from: v */
    private boolean f1940v = false;

    /* renamed from: w */
    private ArrayList<C0657j> f1941w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0669o>> f1942x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0657j f1943y;

    /* renamed from: z */
    private boolean f1944z;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C0654a {
        /* renamed from: a */
        void mo548a(C0653h hVar);

        /* renamed from: a */
        boolean mo549a(C0653h hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C0655b {
        /* renamed from: a */
        boolean mo2574a(C0657j jVar);
    }

    public C0653h(Context context) {
        this.f1923e = context;
        this.f1924f = context.getResources();
        this.f1928j = new ArrayList<>();
        this.f1929k = new ArrayList<>();
        this.f1930l = true;
        this.f1931m = new ArrayList<>();
        this.f1932n = new ArrayList<>();
        this.f1933o = true;
        m3037e(true);
    }

    /* renamed from: a */
    private static int m3030a(ArrayList<C0657j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo2767c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0657j m3031a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0657j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m3032a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = mo2721d();
        if (view != null) {
            this.f1922c = view;
            this.f1920a = null;
            this.f1921b = null;
        } else {
            if (i > 0) {
                this.f1920a = d.getText(i);
            } else if (charSequence != null) {
                this.f1920a = charSequence;
            }
            if (i2 > 0) {
                this.f1921b = C0227a.m1070a(mo2725e(), i2);
            } else if (drawable != null) {
                this.f1921b = drawable;
            }
            this.f1922c = null;
        }
        mo264a(false);
    }

    /* renamed from: a */
    private void m3033a(int i, boolean z) {
        if (i >= 0 && i < this.f1928j.size()) {
            this.f1928j.remove(i);
            if (z) {
                mo264a(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m3034a(C0679u uVar, C0669o oVar) {
        boolean z = false;
        if (this.f1942x.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo234a(uVar);
        }
        Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0669o oVar2 = (C0669o) next.get();
            if (oVar2 == null) {
                this.f1942x.remove(next);
            } else if (!z) {
                z = oVar2.mo234a(uVar);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m3035d(boolean z) {
        if (!this.f1942x.isEmpty()) {
            mo2729g();
            Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0669o oVar = (C0669o) next.get();
                if (oVar == null) {
                    this.f1942x.remove(next);
                } else {
                    oVar.mo231a(z);
                }
            }
            mo2731h();
        }
    }

    /* renamed from: e */
    private void m3036e(Bundle bundle) {
        Parcelable c;
        if (!this.f1942x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0669o oVar = (C0669o) next.get();
                if (oVar == null) {
                    this.f1942x.remove(next);
                } else {
                    int b = oVar.mo235b();
                    if (b > 0 && (c = oVar.mo240c()) != null) {
                        sparseArray.put(b, c);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: e */
    private void m3037e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1924f.getConfiguration().keyboard == 1 || !this.f1924f.getBoolean(C0526a.C0528b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.f1926h = z2;
    }

    /* renamed from: f */
    private static int m3038f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1919d;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: f */
    private void m3039f(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1942x.isEmpty()) {
            Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0669o oVar = (C0669o) next.get();
                if (oVar == null) {
                    this.f1942x.remove(next);
                } else {
                    int b = oVar.mo235b();
                    if (b > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(b)) != null) {
                        oVar.mo225a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo2681a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1928j.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public C0653h mo2682a(int i) {
        this.f1934p = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0653h mo2683a(Drawable drawable) {
        m3032a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0653h mo2684a(View view) {
        m3032a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0653h mo2685a(CharSequence charSequence) {
        m3032a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0657j mo2686a(int i, KeyEvent keyEvent) {
        ArrayList<C0657j> arrayList = this.f1941w;
        arrayList.clear();
        mo2695a((List<C0657j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean b = mo2712b();
        for (int i2 = 0; i2 < size; i2++) {
            C0657j jVar = arrayList.get(i2);
            char alphabeticShortcut = b ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b && alphabeticShortcut == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo2687a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m3038f(i3);
        C0657j a = m3031a(i, i2, i3, f, charSequence, this.f1934p);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1935q;
        if (contextMenuInfo != null) {
            a.mo2762a(contextMenuInfo);
        }
        ArrayList<C0657j> arrayList = this.f1928j;
        arrayList.add(m3030a(arrayList, f), a);
        mo264a(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2688a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void mo2689a(Bundle bundle) {
        m3036e(bundle);
    }

    /* renamed from: a */
    public void mo2690a(C0654a aVar) {
        this.f1927i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2691a(C0657j jVar) {
        this.f1930l = true;
        mo264a(true);
    }

    /* renamed from: a */
    public void mo2692a(C0669o oVar) {
        mo2693a(oVar, this.f1923e);
    }

    /* renamed from: a */
    public void mo2693a(C0669o oVar, Context context) {
        this.f1942x.add(new WeakReference(oVar));
        oVar.mo222a(context, this);
        this.f1933o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2694a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1928j.size();
        mo2729g();
        for (int i = 0; i < size; i++) {
            C0657j jVar = this.f1928j.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo2774g() && jVar.isCheckable()) {
                jVar.mo2765b(jVar == menuItem);
            }
        }
        mo2731h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2695a(List<C0657j> list, int i, KeyEvent keyEvent) {
        boolean b = mo2712b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1928j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0657j jVar = this.f1928j.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0653h) jVar.getSubMenu()).mo2695a(list, i, keyEvent);
                }
                char alphabeticShortcut = b ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((b ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo264a(boolean z) {
        if (!this.f1936r) {
            if (z) {
                this.f1930l = true;
                this.f1933o = true;
            }
            m3035d(z);
            return;
        }
        this.f1937s = true;
        if (z) {
            this.f1938t = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2696a(C0653h hVar, MenuItem menuItem) {
        C0654a aVar = this.f1927i;
        return aVar != null && aVar.mo549a(hVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2697a(MenuItem menuItem, int i) {
        return mo2698a(menuItem, (C0669o) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2698a(android.view.MenuItem r7, android.support.p020v7.view.menu.C0669o r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.j r7 = (android.support.p020v7.view.menu.C0657j) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo2766b()
            android.support.v4.i.c r2 = r7.mo1185a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo1540e()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo2798n()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo2711b((boolean) r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo2711b((boolean) r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            android.support.v7.view.menu.u r9 = new android.support.v7.view.menu.u
            android.content.Context r0 = r6.mo2725e()
            r9.<init>(r0, r6, r7)
            r7.mo2761a((android.support.p020v7.view.menu.C0679u) r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.u r7 = (android.support.p020v7.view.menu.C0679u) r7
            if (r4 == 0) goto L_0x0063
            r2.mo1535a((android.view.SubMenu) r7)
        L_0x0063:
            boolean r7 = r6.m3034a((android.support.p020v7.view.menu.C0679u) r7, (android.support.p020v7.view.menu.C0669o) r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.view.menu.C0653h.mo2698a(android.view.MenuItem, android.support.v7.view.menu.o, int):boolean");
    }

    public MenuItem add(int i) {
        return mo2687a(0, 0, 0, this.f1924f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2687a(i, i2, i3, this.f1924f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2687a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2687a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1923e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1924f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1924f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0657j jVar = (C0657j) mo2687a(i, i2, i3, charSequence);
        C0679u uVar = new C0679u(this.f1923e, this, jVar);
        jVar.mo2761a(uVar);
        return uVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo2707b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1928j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo2708b(Bundle bundle) {
        m3039f(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2709b(C0657j jVar) {
        this.f1933o = true;
        mo264a(true);
    }

    /* renamed from: b */
    public void mo2710b(C0669o oVar) {
        Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0669o oVar2 = (C0669o) next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f1942x.remove(next);
            }
        }
    }

    /* renamed from: b */
    public final void mo2711b(boolean z) {
        if (!this.f1940v) {
            this.f1940v = true;
            Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0669o oVar = (C0669o) next.get();
                if (oVar == null) {
                    this.f1942x.remove(next);
                } else {
                    oVar.mo227a(this, z);
                }
            }
            this.f1940v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2712b() {
        return this.f1925g;
    }

    /* renamed from: c */
    public int mo2713c(int i) {
        return mo2681a(i, 0);
    }

    /* renamed from: c */
    public void mo2714c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0679u) item.getSubMenu()).mo2714c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2688a(), sparseArray);
        }
    }

    /* renamed from: c */
    public void mo2715c(boolean z) {
        this.f1944z = z;
    }

    /* renamed from: c */
    public boolean mo2716c() {
        return this.f1926h;
    }

    /* renamed from: c */
    public boolean mo2717c(C0657j jVar) {
        boolean z = false;
        if (this.f1942x.isEmpty()) {
            return false;
        }
        mo2729g();
        Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0669o oVar = (C0669o) next.get();
            if (oVar == null) {
                this.f1942x.remove(next);
            } else {
                z = oVar.mo233a(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo2731h();
        if (z) {
            this.f1943y = jVar;
        }
        return z;
    }

    public void clear() {
        C0657j jVar = this.f1943y;
        if (jVar != null) {
            mo2724d(jVar);
        }
        this.f1928j.clear();
        mo264a(true);
    }

    public void clearHeader() {
        this.f1921b = null;
        this.f1920a = null;
        this.f1922c = null;
        mo264a(false);
    }

    public void close() {
        mo2711b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Resources mo2721d() {
        return this.f1924f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0653h mo2722d(int i) {
        m3032a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: d */
    public void mo2723d(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo2688a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0679u) item.getSubMenu()).mo2723d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: d */
    public boolean mo2724d(C0657j jVar) {
        boolean z = false;
        if (!this.f1942x.isEmpty() && this.f1943y == jVar) {
            mo2729g();
            Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0669o oVar = (C0669o) next.get();
                if (oVar == null) {
                    this.f1942x.remove(next);
                } else {
                    z = oVar.mo239b(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo2731h();
            if (z) {
                this.f1943y = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public Context mo2725e() {
        return this.f1923e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0653h mo2726e(int i) {
        m3032a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public void mo2727f() {
        C0654a aVar = this.f1927i;
        if (aVar != null) {
            aVar.mo548a(this);
        }
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0657j jVar = this.f1928j.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo2729g() {
        if (!this.f1936r) {
            this.f1936r = true;
            this.f1937s = false;
            this.f1938t = false;
        }
    }

    public MenuItem getItem(int i) {
        return this.f1928j.get(i);
    }

    /* renamed from: h */
    public void mo2731h() {
        this.f1936r = false;
        if (this.f1937s) {
            this.f1937s = false;
            mo264a(this.f1938t);
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1944z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1928j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public ArrayList<C0657j> mo2733i() {
        if (!this.f1930l) {
            return this.f1929k;
        }
        this.f1929k.clear();
        int size = this.f1928j.size();
        for (int i = 0; i < size; i++) {
            C0657j jVar = this.f1928j.get(i);
            if (jVar.isVisible()) {
                this.f1929k.add(jVar);
            }
        }
        this.f1930l = false;
        this.f1933o = true;
        return this.f1929k;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo2686a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public void mo2735j() {
        ArrayList<C0657j> i = mo2733i();
        if (this.f1933o) {
            Iterator<WeakReference<C0669o>> it = this.f1942x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0669o oVar = (C0669o) next.get();
                if (oVar == null) {
                    this.f1942x.remove(next);
                } else {
                    z |= oVar.mo232a();
                }
            }
            if (z) {
                this.f1931m.clear();
                this.f1932n.clear();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0657j jVar = i.get(i2);
                    (jVar.mo2794j() ? this.f1931m : this.f1932n).add(jVar);
                }
            } else {
                this.f1931m.clear();
                this.f1932n.clear();
                this.f1932n.addAll(mo2733i());
            }
            this.f1933o = false;
        }
    }

    /* renamed from: k */
    public ArrayList<C0657j> mo2736k() {
        mo2735j();
        return this.f1931m;
    }

    /* renamed from: l */
    public ArrayList<C0657j> mo2737l() {
        mo2735j();
        return this.f1932n;
    }

    /* renamed from: m */
    public CharSequence mo2738m() {
        return this.f1920a;
    }

    /* renamed from: n */
    public Drawable mo2739n() {
        return this.f1921b;
    }

    /* renamed from: o */
    public View mo2740o() {
        return this.f1922c;
    }

    /* renamed from: p */
    public C0653h mo2741p() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo2697a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0657j a = mo2686a(i, keyEvent);
        boolean a2 = a != null ? mo2697a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo2711b(true);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo2744q() {
        return this.f1939u;
    }

    /* renamed from: r */
    public C0657j mo2745r() {
        return this.f1943y;
    }

    public void removeGroup(int i) {
        int c = mo2713c(i);
        if (c >= 0) {
            int size = this.f1928j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1928j.get(c).getGroupId() != i) {
                    mo264a(true);
                } else {
                    m3033a(c, false);
                    i2 = i3;
                }
            }
            mo264a(true);
        }
    }

    public void removeItem(int i) {
        m3033a(mo2707b(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1928j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0657j jVar = this.f1928j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo2763a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1928j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0657j jVar = this.f1928j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1928j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0657j jVar = this.f1928j.get(i2);
            if (jVar.getGroupId() == i && jVar.mo2768c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo264a(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1925g = z;
        mo264a(false);
    }

    public int size() {
        return this.f1928j.size();
    }
}
