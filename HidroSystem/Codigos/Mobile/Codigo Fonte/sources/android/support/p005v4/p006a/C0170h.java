package android.support.p005v4.p006a;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0011b;
import android.arch.lifecycle.C0014c;
import android.arch.lifecycle.C0015d;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p005v4.p016h.C0299d;
import android.support.p005v4.p016h.C0319m;
import android.support.p005v4.p017i.C0371e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.a.h */
public class C0170h implements C0014c, ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: V */
    private static final C0319m<String, Class<?>> f523V = new C0319m<>();

    /* renamed from: a */
    static final Object f524a = new Object();

    /* renamed from: A */
    boolean f525A;

    /* renamed from: B */
    boolean f526B;

    /* renamed from: C */
    boolean f527C;

    /* renamed from: D */
    boolean f528D;

    /* renamed from: E */
    boolean f529E = true;

    /* renamed from: F */
    boolean f530F;

    /* renamed from: G */
    ViewGroup f531G;

    /* renamed from: H */
    View f532H;

    /* renamed from: I */
    View f533I;

    /* renamed from: J */
    boolean f534J;

    /* renamed from: K */
    boolean f535K = true;

    /* renamed from: L */
    C0221v f536L;

    /* renamed from: M */
    boolean f537M;

    /* renamed from: N */
    boolean f538N;

    /* renamed from: O */
    C0173a f539O;

    /* renamed from: P */
    boolean f540P;

    /* renamed from: Q */
    boolean f541Q;

    /* renamed from: R */
    float f542R;

    /* renamed from: S */
    LayoutInflater f543S;

    /* renamed from: T */
    boolean f544T;

    /* renamed from: U */
    C0015d f545U = new C0015d(this);

    /* renamed from: b */
    int f546b = 0;

    /* renamed from: c */
    Bundle f547c;

    /* renamed from: d */
    SparseArray<Parcelable> f548d;

    /* renamed from: e */
    int f549e = -1;

    /* renamed from: f */
    String f550f;

    /* renamed from: g */
    Bundle f551g;

    /* renamed from: h */
    C0170h f552h;

    /* renamed from: i */
    int f553i = -1;

    /* renamed from: j */
    int f554j;

    /* renamed from: k */
    boolean f555k;

    /* renamed from: l */
    boolean f556l;

    /* renamed from: m */
    boolean f557m;

    /* renamed from: n */
    boolean f558n;

    /* renamed from: o */
    boolean f559o;

    /* renamed from: p */
    boolean f560p;

    /* renamed from: q */
    int f561q;

    /* renamed from: r */
    C0186n f562r;

    /* renamed from: s */
    C0182l f563s;

    /* renamed from: t */
    C0186n f564t;

    /* renamed from: u */
    C0199o f565u;

    /* renamed from: v */
    C0170h f566v;

    /* renamed from: w */
    int f567w;

    /* renamed from: x */
    int f568x;

    /* renamed from: y */
    String f569y;

    /* renamed from: z */
    boolean f570z;

    /* renamed from: android.support.v4.a.h$a */
    static class C0173a {

        /* renamed from: a */
        View f573a;

        /* renamed from: b */
        Animator f574b;

        /* renamed from: c */
        int f575c;

        /* renamed from: d */
        int f576d;

        /* renamed from: e */
        int f577e;

        /* renamed from: f */
        int f578f;

        /* renamed from: g */
        C0225y f579g = null;

        /* renamed from: h */
        C0225y f580h = null;

        /* renamed from: i */
        boolean f581i;

        /* renamed from: j */
        C0175c f582j;

        /* renamed from: k */
        boolean f583k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Object f584l = null;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Object f585m = C0170h.f524a;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Object f586n = null;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Object f587o = C0170h.f524a;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Object f588p = null;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Object f589q = C0170h.f524a;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Boolean f590r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public Boolean f591s;

        C0173a() {
        }
    }

    /* renamed from: android.support.v4.a.h$b */
    public static class C0174b extends RuntimeException {
        public C0174b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.a.h$c */
    interface C0175c {
        /* renamed from: a */
        void mo834a();

        /* renamed from: b */
        void mo835b();
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m637W() {
        C0175c cVar;
        C0173a aVar = this.f539O;
        if (aVar == null) {
            cVar = null;
        } else {
            aVar.f581i = false;
            cVar = aVar.f582j;
            this.f539O.f582j = null;
        }
        if (cVar != null) {
            cVar.mo834a();
        }
    }

    /* renamed from: X */
    private C0173a m638X() {
        if (this.f539O == null) {
            this.f539O = new C0173a();
        }
        return this.f539O;
    }

    /* renamed from: a */
    public static C0170h m639a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f523V.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f523V.put(str, cls);
            }
            C0170h hVar = (C0170h) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(hVar.getClass().getClassLoader());
                hVar.mo775b(bundle);
            }
            return hVar;
        } catch (ClassNotFoundException e) {
            throw new C0174b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0174b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0174b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0174b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0174b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* renamed from: a */
    static boolean m640a(Context context, String str) {
        try {
            Class<?> cls = f523V.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f523V.put(str, cls);
            }
            return C0170h.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: A */
    public void mo726A() {
        C0186n nVar = this.f562r;
        if (nVar == null || nVar.f639m == null) {
            m638X().f581i = false;
        } else if (Looper.myLooper() != this.f562r.f639m.mo914h().getLooper()) {
            this.f562r.f639m.mo914h().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    C0170h.this.m637W();
                }
            });
        } else {
            m637W();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo727B() {
        if (this.f563s != null) {
            this.f564t = new C0186n();
            this.f564t.mo955a(this.f563s, (C0180j) new C0180j() {
                /* renamed from: a */
                public C0170h mo831a(Context context, String str, Bundle bundle) {
                    return C0170h.this.f563s.mo831a(context, str, bundle);
                }

                /* renamed from: a */
                public View mo832a(int i) {
                    if (C0170h.this.f532H != null) {
                        return C0170h.this.f532H.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                /* renamed from: a */
                public boolean mo833a() {
                    return C0170h.this.f532H != null;
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo728C() {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo995k();
            this.f564t.mo981e();
        }
        this.f546b = 4;
        this.f530F = false;
        mo805j();
        if (this.f530F) {
            C0186n nVar2 = this.f564t;
            if (nVar2 != null) {
                nVar2.mo1002n();
            }
            C0221v vVar = this.f536L;
            if (vVar != null) {
                vVar.mo1073g();
            }
            this.f545U.mo26a(C0011b.C0012a.ON_START);
            return;
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo729D() {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo995k();
            this.f564t.mo981e();
        }
        this.f546b = 5;
        this.f530F = false;
        mo807k();
        if (this.f530F) {
            C0186n nVar2 = this.f564t;
            if (nVar2 != null) {
                nVar2.mo1003o();
                this.f564t.mo981e();
            }
            this.f545U.mo26a(C0011b.C0012a.ON_RESUME);
            return;
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo730E() {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo995k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo731F() {
        onLowMemory();
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo1013u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo732G() {
        this.f545U.mo26a(C0011b.C0012a.ON_PAUSE);
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo1007p();
        }
        this.f546b = 4;
        this.f530F = false;
        mo809l();
        if (!this.f530F) {
            throw new C0226z("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo733H() {
        this.f545U.mo26a(C0011b.C0012a.ON_STOP);
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo1008q();
        }
        this.f546b = 3;
        this.f530F = false;
        mo811m();
        if (!this.f530F) {
            throw new C0226z("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo734I() {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo1009r();
        }
        this.f546b = 2;
        if (this.f537M) {
            this.f537M = false;
            if (!this.f538N) {
                this.f538N = true;
                this.f536L = this.f563s.mo907a(this.f550f, this.f537M, false);
            }
            if (this.f536L == null) {
                return;
            }
            if (this.f563s.mo916j()) {
                this.f536L.mo1070d();
            } else {
                this.f536L.mo1069c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo735J() {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo1010s();
        }
        this.f546b = 1;
        this.f530F = false;
        mo813n();
        if (this.f530F) {
            C0221v vVar = this.f536L;
            if (vVar != null) {
                vVar.mo1072f();
            }
            this.f560p = false;
            return;
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo736K() {
        this.f545U.mo26a(C0011b.C0012a.ON_DESTROY);
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo1011t();
        }
        this.f546b = 0;
        this.f530F = false;
        this.f544T = false;
        mo814o();
        if (this.f530F) {
            this.f564t = null;
            return;
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo737L() {
        this.f530F = false;
        mo819q();
        this.f543S = null;
        if (this.f530F) {
            C0186n nVar = this.f564t;
            if (nVar == null) {
                return;
            }
            if (this.f527C) {
                nVar.mo1011t();
                this.f564t = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo738M() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f576d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public int mo739N() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f577e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public int mo740O() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f578f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public C0225y mo741P() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f579g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C0225y mo742Q() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f580h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public View mo743R() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f573a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public Animator mo744S() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f574b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public int mo745T() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f575c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean mo746U() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return false;
        }
        return aVar.f581i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo747V() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return false;
        }
        return aVar.f583k;
    }

    /* renamed from: a */
    public C0011b mo25a() {
        return this.f545U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0170h mo748a(String str) {
        if (str.equals(this.f550f)) {
            return this;
        }
        C0186n nVar = this.f564t;
        if (nVar != null) {
            return nVar.mo963b(str);
        }
        return null;
    }

    /* renamed from: a */
    public View mo749a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo750a(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo751a(int i) {
        if (this.f539O != null || i != 0) {
            m638X().f576d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo752a(int i, int i2) {
        if (this.f539O != null || i != 0 || i2 != 0) {
            m638X();
            C0173a aVar = this.f539O;
            aVar.f577e = i;
            aVar.f578f = i2;
        }
    }

    /* renamed from: a */
    public void mo753a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo754a(int i, C0170h hVar) {
        String str;
        StringBuilder sb;
        this.f549e = i;
        if (hVar != null) {
            sb = new StringBuilder();
            sb.append(hVar.f550f);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f549e);
        this.f550f = sb.toString();
    }

    /* renamed from: a */
    public void mo755a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo756a(Animator animator) {
        m638X().f574b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo757a(Activity activity) {
        this.f530F = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo758a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f530F = true;
    }

    /* renamed from: a */
    public void mo759a(Context context) {
        this.f530F = true;
        C0182l lVar = this.f563s;
        Activity f = lVar == null ? null : lVar.mo912f();
        if (f != null) {
            this.f530F = false;
            mo757a(f);
        }
    }

    /* renamed from: a */
    public void mo760a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f530F = true;
        C0182l lVar = this.f563s;
        Activity f = lVar == null ? null : lVar.mo912f();
        if (f != null) {
            this.f530F = false;
            mo758a(f, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo761a(Configuration configuration) {
        onConfigurationChanged(configuration);
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo945a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo762a(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f548d;
        if (sparseArray != null) {
            this.f533I.restoreHierarchyState(sparseArray);
            this.f548d = null;
        }
        this.f530F = false;
        mo804i(bundle);
        if (!this.f530F) {
            throw new C0226z("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo763a(C0175c cVar) {
        m638X();
        if (cVar != this.f539O.f582j) {
            if (cVar == null || this.f539O.f582j == null) {
                if (this.f539O.f581i) {
                    this.f539O.f582j = cVar;
                }
                if (cVar != null) {
                    cVar.mo835b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: a */
    public void mo764a(C0170h hVar) {
    }

    /* renamed from: a */
    public void mo765a(Menu menu) {
    }

    /* renamed from: a */
    public void mo766a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo767a(View view) {
        m638X().f573a = view;
    }

    /* renamed from: a */
    public void mo768a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo769a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f567w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f568x));
        printWriter.print(" mTag=");
        printWriter.println(this.f569y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f546b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f549e);
        printWriter.print(" mWho=");
        printWriter.print(this.f550f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f561q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f555k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f556l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f557m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f558n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f570z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f525A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f529E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f528D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f526B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f527C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f535K);
        if (this.f562r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f562r);
        }
        if (this.f563s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f563s);
        }
        if (this.f566v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f566v);
        }
        if (this.f551g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f551g);
        }
        if (this.f547c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f547c);
        }
        if (this.f548d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f548d);
        }
        if (this.f552h != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f552h);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f554j);
        }
        if (mo738M() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo738M());
        }
        if (this.f531G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f531G);
        }
        if (this.f532H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f532H);
        }
        if (this.f533I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f532H);
        }
        if (mo743R() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo743R());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo745T());
        }
        if (this.f536L != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            C0221v vVar = this.f536L;
            vVar.mo1067a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f564t != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f564t + ":");
            C0186n nVar = this.f564t;
            nVar.mo921a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void mo770a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo771a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public Animator mo772b(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo773b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo995k();
        }
        this.f560p = true;
        return mo749a(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo774b(int i) {
        m638X().f575c = i;
    }

    /* renamed from: b */
    public void mo775b(Bundle bundle) {
        if (this.f549e < 0 || !mo783c()) {
            this.f551g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: b */
    public void mo776b(Menu menu) {
    }

    /* renamed from: b */
    public void mo777b(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo778b() {
        return this.f561q > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo779b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f570z) {
            return false;
        }
        if (this.f528D && this.f529E) {
            mo766a(menu, menuInflater);
            z = true;
        }
        C0186n nVar = this.f564t;
        return nVar != null ? z | nVar.mo959a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo780b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: c */
    public LayoutInflater mo781c(Bundle bundle) {
        return mo792e(bundle);
    }

    /* renamed from: c */
    public void mo782c(boolean z) {
    }

    /* renamed from: c */
    public final boolean mo783c() {
        C0186n nVar = this.f562r;
        if (nVar == null) {
            return false;
        }
        return nVar.mo924c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo784c(Menu menu) {
        boolean z = false;
        if (this.f570z) {
            return false;
        }
        if (this.f528D && this.f529E) {
            mo765a(menu);
            z = true;
        }
        C0186n nVar = this.f564t;
        return nVar != null ? z | nVar.mo958a(menu) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo785c(MenuItem menuItem) {
        if (this.f570z) {
            return false;
        }
        if (this.f528D && this.f529E && mo771a(menuItem)) {
            return true;
        }
        C0186n nVar = this.f564t;
        return nVar != null && nVar.mo960a(menuItem);
    }

    /* renamed from: d */
    public final C0176i mo786d() {
        C0182l lVar = this.f563s;
        if (lVar == null) {
            return null;
        }
        return (C0176i) lVar.mo912f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LayoutInflater mo787d(Bundle bundle) {
        this.f543S = mo781c(bundle);
        return this.f543S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo788d(Menu menu) {
        if (!this.f570z) {
            if (this.f528D && this.f529E) {
                mo776b(menu);
            }
            C0186n nVar = this.f564t;
            if (nVar != null) {
                nVar.mo968b(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo789d(boolean z) {
        mo777b(z);
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo956a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo790d(MenuItem menuItem) {
        if (this.f570z) {
            return false;
        }
        if (mo780b(menuItem)) {
            return true;
        }
        C0186n nVar = this.f564t;
        return nVar != null && nVar.mo970b(menuItem);
    }

    /* renamed from: e */
    public final Resources mo791e() {
        C0182l lVar = this.f563s;
        if (lVar != null) {
            return lVar.mo913g().getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    /* renamed from: e */
    public LayoutInflater mo792e(Bundle bundle) {
        C0182l lVar = this.f563s;
        if (lVar != null) {
            LayoutInflater b = lVar.mo869b();
            mo798g();
            C0371e.m1578b(b, this.f564t.mo1015w());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo793e(boolean z) {
        mo782c(z);
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo969b(z);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C0183m mo795f() {
        return this.f562r;
    }

    /* renamed from: f */
    public void mo796f(Bundle bundle) {
        this.f530F = true;
        mo799g(bundle);
        C0186n nVar = this.f564t;
        if (nVar != null && !nVar.mo957a(1)) {
            this.f564t.mo997l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo797f(boolean z) {
        m638X().f583k = z;
    }

    /* renamed from: g */
    public final C0183m mo798g() {
        if (this.f564t == null) {
            mo727B();
            int i = this.f546b;
            if (i >= 5) {
                this.f564t.mo1003o();
            } else if (i >= 4) {
                this.f564t.mo1002n();
            } else if (i >= 2) {
                this.f564t.mo999m();
            } else if (i >= 1) {
                this.f564t.mo997l();
            }
        }
        return this.f564t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo799g(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f564t == null) {
                mo727B();
            }
            this.f564t.mo947a(parcelable, this.f565u);
            this.f565u = null;
            this.f564t.mo997l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0183m mo800h() {
        return this.f564t;
    }

    /* renamed from: h */
    public void mo801h(Bundle bundle) {
        this.f530F = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public View mo803i() {
        return this.f532H;
    }

    /* renamed from: i */
    public void mo804i(Bundle bundle) {
        this.f530F = true;
    }

    /* renamed from: j */
    public void mo805j() {
        this.f530F = true;
        if (!this.f537M) {
            this.f537M = true;
            if (!this.f538N) {
                this.f538N = true;
                this.f536L = this.f563s.mo907a(this.f550f, this.f537M, false);
                return;
            }
            C0221v vVar = this.f536L;
            if (vVar != null) {
                vVar.mo1068b();
            }
        }
    }

    /* renamed from: j */
    public void mo806j(Bundle bundle) {
    }

    /* renamed from: k */
    public void mo807k() {
        this.f530F = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo808k(Bundle bundle) {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo995k();
        }
        this.f546b = 1;
        this.f530F = false;
        mo796f(bundle);
        this.f544T = true;
        if (this.f530F) {
            this.f545U.mo26a(C0011b.C0012a.ON_CREATE);
            return;
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: l */
    public void mo809l() {
        this.f530F = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo810l(Bundle bundle) {
        C0186n nVar = this.f564t;
        if (nVar != null) {
            nVar.mo995k();
        }
        this.f546b = 2;
        this.f530F = false;
        mo801h(bundle);
        if (this.f530F) {
            C0186n nVar2 = this.f564t;
            if (nVar2 != null) {
                nVar2.mo999m();
                return;
            }
            return;
        }
        throw new C0226z("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: m */
    public void mo811m() {
        this.f530F = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo812m(Bundle bundle) {
        Parcelable j;
        mo806j(bundle);
        C0186n nVar = this.f564t;
        if (nVar != null && (j = nVar.mo993j()) != null) {
            bundle.putParcelable("android:support:fragments", j);
        }
    }

    /* renamed from: n */
    public void mo813n() {
        this.f530F = true;
    }

    /* renamed from: o */
    public void mo814o() {
        this.f530F = true;
        if (!this.f538N) {
            this.f538N = true;
            this.f536L = this.f563s.mo907a(this.f550f, this.f537M, false);
        }
        C0221v vVar = this.f536L;
        if (vVar != null) {
            vVar.mo1074h();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f530F = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo786d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f530F = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo818p() {
        this.f549e = -1;
        this.f550f = null;
        this.f555k = false;
        this.f556l = false;
        this.f557m = false;
        this.f558n = false;
        this.f559o = false;
        this.f561q = 0;
        this.f562r = null;
        this.f564t = null;
        this.f563s = null;
        this.f567w = 0;
        this.f568x = 0;
        this.f569y = null;
        this.f570z = false;
        this.f525A = false;
        this.f527C = false;
        this.f536L = null;
        this.f537M = false;
        this.f538N = false;
    }

    /* renamed from: q */
    public void mo819q() {
        this.f530F = true;
    }

    /* renamed from: r */
    public void mo820r() {
    }

    /* renamed from: s */
    public Object mo821s() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f584l;
    }

    /* renamed from: t */
    public Object mo822t() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f585m == f524a ? mo821s() : this.f539O.f585m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0299d.m1339a(this, sb);
        if (this.f549e >= 0) {
            sb.append(" #");
            sb.append(this.f549e);
        }
        if (this.f567w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f567w));
        }
        if (this.f569y != null) {
            sb.append(" ");
            sb.append(this.f569y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public Object mo824u() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f586n;
    }

    /* renamed from: v */
    public Object mo825v() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f587o == f524a ? mo824u() : this.f539O.f587o;
    }

    /* renamed from: w */
    public Object mo826w() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f588p;
    }

    /* renamed from: x */
    public Object mo827x() {
        C0173a aVar = this.f539O;
        if (aVar == null) {
            return null;
        }
        return aVar.f589q == f524a ? mo826w() : this.f539O.f589q;
    }

    /* renamed from: y */
    public boolean mo828y() {
        C0173a aVar = this.f539O;
        if (aVar == null || aVar.f591s == null) {
            return true;
        }
        return this.f539O.f591s.booleanValue();
    }

    /* renamed from: z */
    public boolean mo829z() {
        C0173a aVar = this.f539O;
        if (aVar == null || aVar.f590r == null) {
            return true;
        }
        return this.f539O.f590r.booleanValue();
    }
}
