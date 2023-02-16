package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.p020v7.view.menu.C0652g;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.as */
public class C0780as extends C0769ap implements C0779ar {

    /* renamed from: a */
    private static Method f2592a;

    /* renamed from: b */
    private C0779ar f2593b;

    /* renamed from: android.support.v7.widget.as$a */
    public static class C0781a extends C0751ai {

        /* renamed from: g */
        final int f2594g;

        /* renamed from: h */
        final int f2595h;

        /* renamed from: i */
        private C0779ar f2596i;

        /* renamed from: j */
        private MenuItem f2597j;

        public C0781a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2594g = 22;
                this.f2595h = 21;
                return;
            }
            this.f2594g = 21;
            this.f2595h = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo3590a(MotionEvent motionEvent, int i) {
            return super.mo3590a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f2596i != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0652g gVar = (C0652g) adapter;
                C0657j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gVar.getCount()) {
                    jVar = gVar.getItem(i2);
                }
                MenuItem menuItem = this.f2597j;
                if (menuItem != jVar) {
                    C0653h a = gVar.mo2672a();
                    if (menuItem != null) {
                        this.f2596i.mo2656a(a, menuItem);
                    }
                    this.f2597j = jVar;
                    if (jVar != null) {
                        this.f2596i.mo2657b(a, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2594g) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2595h) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0652g) getAdapter()).mo2672a().mo2711b(false);
                return true;
            }
        }

        public void setHoverListener(C0779ar arVar) {
            this.f2596i = arVar;
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f2592a = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0780as(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0751ai mo3674a(Context context, boolean z) {
        C0781a aVar = new C0781a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo2656a(C0653h hVar, MenuItem menuItem) {
        C0779ar arVar = this.f2593b;
        if (arVar != null) {
            arVar.mo2656a(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo3723a(C0779ar arVar) {
        this.f2593b = arVar;
    }

    /* renamed from: a */
    public void mo3724a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2556g.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo2657b(C0653h hVar, MenuItem menuItem) {
        C0779ar arVar = this.f2593b;
        if (arVar != null) {
            arVar.mo2657b(hVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo3725b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2556g.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo3726c(boolean z) {
        Method method = f2592a;
        if (method != null) {
            try {
                method.invoke(this.f2556g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
