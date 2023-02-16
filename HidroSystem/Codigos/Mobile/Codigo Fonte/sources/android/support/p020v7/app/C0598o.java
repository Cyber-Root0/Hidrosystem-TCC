package android.support.p020v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p005v4.p016h.C0294a;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.C0628d;
import android.support.p020v7.widget.C0732ab;
import android.support.p020v7.widget.C0843bf;
import android.support.p020v7.widget.C0887g;
import android.support.p020v7.widget.C0889i;
import android.support.p020v7.widget.C0890j;
import android.support.p020v7.widget.C0891k;
import android.support.p020v7.widget.C0898n;
import android.support.p020v7.widget.C0899o;
import android.support.p020v7.widget.C0901q;
import android.support.p020v7.widget.C0902r;
import android.support.p020v7.widget.C0906u;
import android.support.p020v7.widget.C0907v;
import android.support.p020v7.widget.C0908w;
import android.support.p020v7.widget.C0910y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.o */
class C0598o {

    /* renamed from: a */
    private static final Class<?>[] f1620a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f1621b = {16843375};

    /* renamed from: c */
    private static final String[] f1622c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f1623d = new C0294a();

    /* renamed from: e */
    private final Object[] f1624e = new Object[2];

    /* renamed from: android.support.v7.app.o$a */
    private static class C0599a implements View.OnClickListener {

        /* renamed from: a */
        private final View f1625a;

        /* renamed from: b */
        private final String f1626b;

        /* renamed from: c */
        private Method f1627c;

        /* renamed from: d */
        private Context f1628d;

        public C0599a(View view, String str) {
            this.f1625a = view;
            this.f1626b = str;
        }

        /* renamed from: a */
        private void m2725a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1626b, new Class[]{View.class})) != null) {
                        this.f1627c = method;
                        this.f1628d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1625a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f1625a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1626b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f1625a.getClass() + str2);
        }

        public void onClick(View view) {
            if (this.f1627c == null) {
                m2725a(this.f1625a.getContext(), this.f1626b);
            }
            try {
                this.f1627c.invoke(this.f1628d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    C0598o() {
    }

    /* renamed from: a */
    private static Context m2720a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0526a.C0536j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0526a.C0536j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0628d) || ((C0628d) context).mo2497a() != resourceId) ? new C0628d(context, resourceId) : context : context;
    }

    /* renamed from: a */
    private View m2721a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f1624e[0] = context;
            this.f1624e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f1622c) {
                    View a2 = m2722a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f1624e;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m2722a(context, str, (String) null);
            Object[] objArr2 = this.f1624e;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f1624e;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* renamed from: a */
    private View m2722a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = f1623d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1620a);
                f1623d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1624e);
    }

    /* renamed from: a */
    private void m2723a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0388q.m1679z(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1621b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0599a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final View mo2407a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m2720a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0843bf.m4620a(context2);
        }
        View view2 = null;
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = new C0732ab(context2, attributeSet);
                break;
            case 1:
                view2 = new C0901q(context2, attributeSet);
                break;
            case 2:
                view2 = new C0889i(context2, attributeSet);
                break;
            case 3:
                view2 = new C0898n(context2, attributeSet);
                break;
            case 4:
                view2 = new C0910y(context2, attributeSet);
                break;
            case 5:
                view2 = new C0899o(context2, attributeSet);
                break;
            case 6:
                view2 = new C0890j(context2, attributeSet);
                break;
            case 7:
                view2 = new C0906u(context2, attributeSet);
                break;
            case 8:
                view2 = new C0891k(context2, attributeSet);
                break;
            case 9:
                view2 = new C0887g(context2, attributeSet);
                break;
            case 10:
                view2 = new C0902r(context2, attributeSet);
                break;
            case 11:
                view2 = new C0907v(context2, attributeSet);
                break;
            case 12:
                view2 = new C0908w(context2, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m2721a(context2, str, attributeSet);
        }
        if (view2 != null) {
            m2723a(view2, attributeSet);
        }
        return view2;
    }
}
