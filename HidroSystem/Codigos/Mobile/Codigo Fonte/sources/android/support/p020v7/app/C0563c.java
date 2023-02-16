package android.support.p020v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.c */
class C0563c {

    /* renamed from: a */
    private static final int[] f1514a = {16843531};

    /* renamed from: android.support.v7.app.c$a */
    static class C0564a {

        /* renamed from: a */
        public Method f1515a;

        /* renamed from: b */
        public Method f1516b;

        /* renamed from: c */
        public ImageView f1517c;

        C0564a(Activity activity) {
            try {
                this.f1515a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f1516b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (childAt2 instanceof ImageView) {
                            this.f1517c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m2526a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f1514a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: a */
    public static C0564a m2527a(C0564a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0564a(activity);
        }
        if (aVar.f1515a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f1516b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C0564a m2528a(C0564a aVar, Activity activity, Drawable drawable, int i) {
        C0564a aVar2 = new C0564a(activity);
        if (aVar2.f1515a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f1515a.invoke(actionBar, new Object[]{drawable});
                aVar2.f1516b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (aVar2.f1517c != null) {
            aVar2.f1517c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
        }
        return aVar2;
    }
}
