package android.support.p005v4.p006a;

import android.os.Build;
import android.support.p005v4.p006a.C0170h;
import android.support.p005v4.p006a.C0186n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.a.c */
final class C0162c extends C0204r implements C0186n.C0197f {

    /* renamed from: a */
    static final boolean f479a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    final C0186n f480b;

    /* renamed from: c */
    ArrayList<C0163a> f481c = new ArrayList<>();

    /* renamed from: d */
    int f482d;

    /* renamed from: e */
    int f483e;

    /* renamed from: f */
    int f484f;

    /* renamed from: g */
    int f485g;

    /* renamed from: h */
    int f486h;

    /* renamed from: i */
    int f487i;

    /* renamed from: j */
    boolean f488j;

    /* renamed from: k */
    boolean f489k = true;

    /* renamed from: l */
    String f490l;

    /* renamed from: m */
    boolean f491m;

    /* renamed from: n */
    int f492n = -1;

    /* renamed from: o */
    int f493o;

    /* renamed from: p */
    CharSequence f494p;

    /* renamed from: q */
    int f495q;

    /* renamed from: r */
    CharSequence f496r;

    /* renamed from: s */
    ArrayList<String> f497s;

    /* renamed from: t */
    ArrayList<String> f498t;

    /* renamed from: u */
    boolean f499u = false;

    /* renamed from: v */
    ArrayList<Runnable> f500v;

    /* renamed from: android.support.v4.a.c$a */
    static final class C0163a {

        /* renamed from: a */
        int f501a;

        /* renamed from: b */
        C0170h f502b;

        /* renamed from: c */
        int f503c;

        /* renamed from: d */
        int f504d;

        /* renamed from: e */
        int f505e;

        /* renamed from: f */
        int f506f;

        C0163a() {
        }

        C0163a(int i, C0170h hVar) {
            this.f501a = i;
            this.f502b = hVar;
        }
    }

    public C0162c(C0186n nVar) {
        this.f480b = nVar;
    }

    /* renamed from: b */
    private static boolean m614b(C0163a aVar) {
        C0170h hVar = aVar.f502b;
        return hVar != null && hVar.f555k && hVar.f532H != null && !hVar.f525A && !hVar.f570z && hVar.mo746U();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0170h mo697a(ArrayList<C0170h> arrayList, C0170h hVar) {
        C0170h hVar2 = hVar;
        int i = 0;
        while (i < this.f481c.size()) {
            C0163a aVar = this.f481c.get(i);
            switch (aVar.f501a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f502b);
                    break;
                case 2:
                    C0170h hVar3 = aVar.f502b;
                    int i2 = hVar3.f568x;
                    C0170h hVar4 = hVar2;
                    int i3 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0170h hVar5 = arrayList.get(size);
                        if (hVar5.f568x == i2) {
                            if (hVar5 == hVar3) {
                                z = true;
                            } else {
                                if (hVar5 == hVar4) {
                                    this.f481c.add(i3, new C0163a(9, hVar5));
                                    i3++;
                                    hVar4 = null;
                                }
                                C0163a aVar2 = new C0163a(3, hVar5);
                                aVar2.f503c = aVar.f503c;
                                aVar2.f505e = aVar.f505e;
                                aVar2.f504d = aVar.f504d;
                                aVar2.f506f = aVar.f506f;
                                this.f481c.add(i3, aVar2);
                                arrayList.remove(hVar5);
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        this.f481c.remove(i3);
                        i3--;
                    } else {
                        aVar.f501a = 1;
                        arrayList.add(hVar3);
                    }
                    i = i3;
                    hVar2 = hVar4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f502b);
                    if (aVar.f502b != hVar2) {
                        break;
                    } else {
                        this.f481c.add(i, new C0163a(9, aVar.f502b));
                        i++;
                        hVar2 = null;
                        break;
                    }
                case 8:
                    this.f481c.add(i, new C0163a(9, hVar2));
                    i++;
                    hVar2 = aVar.f502b;
                    break;
            }
            i++;
        }
        return hVar2;
    }

    /* renamed from: a */
    public void mo698a() {
        ArrayList<Runnable> arrayList = this.f500v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f500v.get(i).run();
            }
            this.f500v = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo699a(int i) {
        if (this.f488j) {
            if (C0186n.f621a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f481c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0163a aVar = this.f481c.get(i2);
                if (aVar.f502b != null) {
                    aVar.f502b.f561q += i;
                    if (C0186n.f621a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f502b + " to " + aVar.f502b.f561q);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo700a(C0163a aVar) {
        this.f481c.add(aVar);
        aVar.f503c = this.f482d;
        aVar.f504d = this.f483e;
        aVar.f505e = this.f484f;
        aVar.f506f = this.f485g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo701a(C0170h.C0175c cVar) {
        for (int i = 0; i < this.f481c.size(); i++) {
            C0163a aVar = this.f481c.get(i);
            if (m614b(aVar)) {
                aVar.f502b.mo763a(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo702a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo703a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo703a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f490l);
            printWriter.print(" mIndex=");
            printWriter.print(this.f492n);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f491m);
            if (this.f486h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f486h));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f487i));
            }
            if (!(this.f482d == 0 && this.f483e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f482d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f483e));
            }
            if (!(this.f484f == 0 && this.f485g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f484f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f485g));
            }
            if (!(this.f493o == 0 && this.f494p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f493o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f494p);
            }
            if (!(this.f495q == 0 && this.f496r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f495q));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f496r);
            }
        }
        if (!this.f481c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f481c.size();
            for (int i = 0; i < size; i++) {
                C0163a aVar = this.f481c.get(i);
                switch (aVar.f501a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f501a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f502b);
                if (z) {
                    if (!(aVar.f503c == 0 && aVar.f504d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f503c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f504d));
                    }
                    if (aVar.f505e != 0 || aVar.f506f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f505e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f506f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo704a(boolean z) {
        for (int size = this.f481c.size() - 1; size >= 0; size--) {
            C0163a aVar = this.f481c.get(size);
            C0170h hVar = aVar.f502b;
            if (hVar != null) {
                hVar.mo752a(C0186n.m880d(this.f486h), this.f487i);
            }
            int i = aVar.f501a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        hVar.mo751a(aVar.f505e);
                        this.f480b.mo954a(hVar, false);
                        break;
                    case 4:
                        hVar.mo751a(aVar.f505e);
                        this.f480b.mo994j(hVar);
                        break;
                    case 5:
                        hVar.mo751a(aVar.f506f);
                        this.f480b.mo992i(hVar);
                        break;
                    case 6:
                        hVar.mo751a(aVar.f505e);
                        this.f480b.mo998l(hVar);
                        break;
                    case 7:
                        hVar.mo751a(aVar.f506f);
                        this.f480b.mo996k(hVar);
                        break;
                    case 8:
                        this.f480b.mo1004o((C0170h) null);
                        break;
                    case 9:
                        this.f480b.mo1004o(hVar);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f501a);
                }
            } else {
                hVar.mo751a(aVar.f506f);
                this.f480b.mo989h(hVar);
            }
            if (!(this.f499u || aVar.f501a == 3 || hVar == null)) {
                this.f480b.mo979e(hVar);
            }
        }
        if (!this.f499u && z) {
            C0186n nVar = this.f480b;
            nVar.mo944a(nVar.f638l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo705a(ArrayList<C0162c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f481c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0163a aVar = this.f481c.get(i4);
            int i5 = aVar.f502b != null ? aVar.f502b.f568x : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0162c cVar = arrayList.get(i6);
                    int size2 = cVar.f481c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0163a aVar2 = cVar.f481c.get(i7);
                        if ((aVar2.f502b != null ? aVar2.f502b.f568x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo706a(ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0186n.f621a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f488j) {
            return true;
        }
        this.f480b.mo948a(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0170h mo707b(ArrayList<C0170h> arrayList, C0170h hVar) {
        for (int i = 0; i < this.f481c.size(); i++) {
            C0163a aVar = this.f481c.get(i);
            int i2 = aVar.f501a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            hVar = null;
                            break;
                        case 9:
                            hVar = aVar.f502b;
                            break;
                    }
                }
                arrayList.add(aVar.f502b);
            }
            arrayList.remove(aVar.f502b);
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo708b() {
        int size = this.f481c.size();
        for (int i = 0; i < size; i++) {
            C0163a aVar = this.f481c.get(i);
            C0170h hVar = aVar.f502b;
            if (hVar != null) {
                hVar.mo752a(this.f486h, this.f487i);
            }
            int i2 = aVar.f501a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        hVar.mo751a(aVar.f504d);
                        this.f480b.mo989h(hVar);
                        break;
                    case 4:
                        hVar.mo751a(aVar.f504d);
                        this.f480b.mo992i(hVar);
                        break;
                    case 5:
                        hVar.mo751a(aVar.f503c);
                        this.f480b.mo994j(hVar);
                        break;
                    case 6:
                        hVar.mo751a(aVar.f504d);
                        this.f480b.mo996k(hVar);
                        break;
                    case 7:
                        hVar.mo751a(aVar.f503c);
                        this.f480b.mo998l(hVar);
                        break;
                    case 8:
                        this.f480b.mo1004o(hVar);
                        break;
                    case 9:
                        this.f480b.mo1004o((C0170h) null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f501a);
                }
            } else {
                hVar.mo751a(aVar.f503c);
                this.f480b.mo954a(hVar, false);
            }
            if (!(this.f499u || aVar.f501a == 1 || hVar == null)) {
                this.f480b.mo979e(hVar);
            }
        }
        if (!this.f499u) {
            C0186n nVar = this.f480b;
            nVar.mo944a(nVar.f638l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo709b(int i) {
        int size = this.f481c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0163a aVar = this.f481c.get(i2);
            int i3 = aVar.f502b != null ? aVar.f502b.f568x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo710c() {
        for (int i = 0; i < this.f481c.size(); i++) {
            if (m614b(this.f481c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public String mo711d() {
        return this.f490l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f492n >= 0) {
            sb.append(" #");
            sb.append(this.f492n);
        }
        if (this.f490l != null) {
            sb.append(" ");
            sb.append(this.f490l);
        }
        sb.append("}");
        return sb.toString();
    }
}
