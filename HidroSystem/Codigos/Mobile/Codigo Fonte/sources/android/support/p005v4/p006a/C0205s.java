package android.support.p005v4.p006a;

import android.graphics.Rect;
import android.os.Build;
import android.support.p005v4.p016h.C0294a;
import android.support.p005v4.p017i.C0388q;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.a.s */
class C0205s {

    /* renamed from: a */
    private static final int[] f692a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: android.support.v4.a.s$a */
    static class C0210a {

        /* renamed from: a */
        public C0170h f718a;

        /* renamed from: b */
        public boolean f719b;

        /* renamed from: c */
        public C0162c f720c;

        /* renamed from: d */
        public C0170h f721d;

        /* renamed from: e */
        public boolean f722e;

        /* renamed from: f */
        public C0162c f723f;

        C0210a() {
        }
    }

    /* renamed from: a */
    private static C0210a m978a(C0210a aVar, SparseArray<C0210a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0210a aVar2 = new C0210a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0294a<String, String> m979a(int i, ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0294a<String, String> aVar = new C0294a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0162c cVar = arrayList.get(i4);
            if (cVar.mo709b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (cVar.f497s != null) {
                    int size = cVar.f497s.size();
                    if (booleanValue) {
                        arrayList3 = cVar.f497s;
                        arrayList4 = cVar.f498t;
                    } else {
                        ArrayList<String> arrayList5 = cVar.f497s;
                        arrayList3 = cVar.f498t;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static Object m982a(C0170h hVar, C0170h hVar2, boolean z) {
        if (hVar == null || hVar2 == null) {
            return null;
        }
        return C0211t.m1030b(C0211t.m1009a(z ? hVar2.mo827x() : hVar.mo826w()));
    }

    /* renamed from: a */
    private static Object m983a(C0170h hVar, boolean z) {
        if (hVar == null) {
            return null;
        }
        return C0211t.m1009a(z ? hVar.mo825v() : hVar.mo821s());
    }

    /* renamed from: a */
    private static Object m984a(ViewGroup viewGroup, View view, C0294a<String, String> aVar, C0210a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        final Rect rect;
        final View view2;
        C0170h hVar = aVar2.f718a;
        C0170h hVar2 = aVar2.f721d;
        if (hVar != null) {
            hVar.mo803i().setVisibility(0);
        }
        if (hVar == null || hVar2 == null) {
            return null;
        }
        boolean z = aVar2.f719b;
        Object a = aVar.isEmpty() ? null : m982a(hVar, hVar2, z);
        C0294a<String, View> b = m999b(aVar, a, aVar2);
        C0294a<String, View> c = m1008c(aVar, a, aVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (c != null) {
                c.clear();
            }
            a = null;
        } else {
            m998a(arrayList, b, (Collection<String>) aVar.keySet());
            m998a(arrayList2, c, aVar.values());
        }
        if (obj == null && obj2 == null && a == null) {
            return null;
        }
        m1005b(hVar, hVar2, z, b, true);
        if (a != null) {
            arrayList2.add(view);
            C0211t.m1020a(a, view, arrayList);
            m996a(a, obj2, b, aVar2.f722e, aVar2.f723f);
            Rect rect2 = new Rect();
            View b2 = m1000b(c, aVar2, obj, z);
            if (b2 != null) {
                C0211t.m1018a(obj, rect2);
            }
            rect = rect2;
            view2 = b2;
        } else {
            view2 = null;
            rect = null;
        }
        final C0170h hVar3 = hVar;
        final C0170h hVar4 = hVar2;
        final boolean z2 = z;
        final C0294a<String, View> aVar3 = c;
        C0224x.m1065a(viewGroup, new Runnable() {
            public void run() {
                C0205s.m1005b(hVar3, hVar4, z2, (C0294a<String, View>) aVar3, false);
                View view = view2;
                if (view != null) {
                    C0211t.m1013a(view, rect);
                }
            }
        });
        return a;
    }

    /* renamed from: a */
    private static Object m985a(Object obj, Object obj2, Object obj3, C0170h hVar, boolean z) {
        return (obj == null || obj2 == null || hVar == null) ? true : z ? hVar.mo829z() : hVar.mo828y() ? C0211t.m1010a(obj2, obj, obj3) : C0211t.m1031b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m986a(C0294a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo1376c(i))) {
                return aVar.mo1375b(i);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r10.f555k != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        r13 = r1;
        r1 = false;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0088, code lost:
        if (r10.f570z == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m988a(android.support.p005v4.p006a.C0162c r16, android.support.p005v4.p006a.C0162c.C0163a r17, android.util.SparseArray<android.support.p005v4.p006a.C0205s.C0210a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            android.support.v4.a.h r10 = r1.f502b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f568x
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f692a
            int r1 = r1.f501a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f501a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x007d
            switch(r1) {
                case 3: goto L_0x0053;
                case 4: goto L_0x003b;
                case 5: goto L_0x0029;
                case 6: goto L_0x0053;
                case 7: goto L_0x007d;
                default: goto L_0x0024;
            }
        L_0x0024:
            r1 = 0
        L_0x0025:
            r12 = 0
            r13 = 0
            goto L_0x0090
        L_0x0029:
            if (r20 == 0) goto L_0x0038
            boolean r1 = r10.f541Q
            if (r1 == 0) goto L_0x008c
            boolean r1 = r10.f570z
            if (r1 != 0) goto L_0x008c
            boolean r1 = r10.f555k
            if (r1 == 0) goto L_0x008c
            goto L_0x008a
        L_0x0038:
            boolean r1 = r10.f570z
            goto L_0x008d
        L_0x003b:
            if (r20 == 0) goto L_0x004a
            boolean r1 = r10.f541Q
            if (r1 == 0) goto L_0x006e
            boolean r1 = r10.f555k
            if (r1 == 0) goto L_0x006e
            boolean r1 = r10.f570z
            if (r1 == 0) goto L_0x006e
        L_0x0049:
            goto L_0x006c
        L_0x004a:
            boolean r1 = r10.f555k
            if (r1 == 0) goto L_0x006e
            boolean r1 = r10.f570z
            if (r1 != 0) goto L_0x006e
            goto L_0x0049
        L_0x0053:
            if (r20 == 0) goto L_0x0070
            boolean r1 = r10.f555k
            if (r1 != 0) goto L_0x006e
            android.view.View r1 = r10.f532H
            if (r1 == 0) goto L_0x006e
            android.view.View r1 = r10.f532H
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x006e
            float r1 = r10.f542R
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x006e
        L_0x006c:
            r1 = 1
            goto L_0x0079
        L_0x006e:
            r1 = 0
            goto L_0x0079
        L_0x0070:
            boolean r1 = r10.f555k
            if (r1 == 0) goto L_0x006e
            boolean r1 = r10.f570z
            if (r1 != 0) goto L_0x006e
            goto L_0x006c
        L_0x0079:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x0090
        L_0x007d:
            if (r20 == 0) goto L_0x0082
            boolean r1 = r10.f540P
            goto L_0x008d
        L_0x0082:
            boolean r1 = r10.f555k
            if (r1 != 0) goto L_0x008c
            boolean r1 = r10.f570z
            if (r1 != 0) goto L_0x008c
        L_0x008a:
            r1 = 1
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            r4 = r1
            r1 = 1
            goto L_0x0025
        L_0x0090:
            java.lang.Object r6 = r2.get(r11)
            android.support.v4.a.s$a r6 = (android.support.p005v4.p006a.C0205s.C0210a) r6
            if (r4 == 0) goto L_0x00a2
            android.support.v4.a.s$a r6 = m978a((android.support.p005v4.p006a.C0205s.C0210a) r6, (android.util.SparseArray<android.support.p005v4.p006a.C0205s.C0210a>) r2, (int) r11)
            r6.f718a = r10
            r6.f719b = r3
            r6.f720c = r0
        L_0x00a2:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c9
            if (r14 == 0) goto L_0x00b0
            android.support.v4.a.h r1 = r14.f721d
            if (r1 != r10) goto L_0x00b0
            r14.f721d = r15
        L_0x00b0:
            android.support.v4.a.n r4 = r0.f480b
            int r1 = r10.f546b
            if (r1 >= r5) goto L_0x00c9
            int r1 = r4.f638l
            if (r1 < r5) goto L_0x00c9
            boolean r1 = r0.f499u
            if (r1 != 0) goto L_0x00c9
            r4.mo983f(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo950a((android.support.p005v4.p006a.C0170h) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
        L_0x00c9:
            if (r13 == 0) goto L_0x00db
            if (r14 == 0) goto L_0x00d1
            android.support.v4.a.h r1 = r14.f721d
            if (r1 != 0) goto L_0x00db
        L_0x00d1:
            android.support.v4.a.s$a r14 = m978a((android.support.p005v4.p006a.C0205s.C0210a) r14, (android.util.SparseArray<android.support.p005v4.p006a.C0205s.C0210a>) r2, (int) r11)
            r14.f721d = r10
            r14.f722e = r3
            r14.f723f = r0
        L_0x00db:
            if (r20 != 0) goto L_0x00e7
            if (r12 == 0) goto L_0x00e7
            if (r14 == 0) goto L_0x00e7
            android.support.v4.a.h r0 = r14.f718a
            if (r0 != r10) goto L_0x00e7
            r14.f718a = r15
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p005v4.p006a.C0205s.m988a(android.support.v4.a.c, android.support.v4.a.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m989a(C0162c cVar, SparseArray<C0210a> sparseArray, boolean z) {
        int size = cVar.f481c.size();
        for (int i = 0; i < size; i++) {
            m988a(cVar, cVar.f481c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    private static void m991a(C0186n nVar, int i, C0210a aVar, View view, C0294a<String, String> aVar2) {
        Object obj;
        C0186n nVar2 = nVar;
        C0210a aVar3 = aVar;
        View view2 = view;
        ViewGroup viewGroup = nVar2.f640n.mo833a() ? (ViewGroup) nVar2.f640n.mo832a(i) : null;
        if (viewGroup != null) {
            C0170h hVar = aVar3.f718a;
            C0170h hVar2 = aVar3.f721d;
            boolean z = aVar3.f719b;
            boolean z2 = aVar3.f722e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object a = m983a(hVar, z);
            Object b = m1001b(hVar2, z2);
            Object obj2 = b;
            Object a2 = m984a(viewGroup, view, aVar2, aVar, (ArrayList<View>) arrayList2, (ArrayList<View>) arrayList, a, b);
            if (a == null && a2 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> b2 = m1003b(obj, hVar2, (ArrayList<View>) arrayList2, view2);
            ArrayList<View> b3 = m1003b(a, hVar, (ArrayList<View>) arrayList, view2);
            m1007b(b3, 4);
            Object a3 = m985a(a, obj, a2, hVar, z);
            if (a3 != null) {
                m995a(obj, hVar2, b2);
                ArrayList<String> a4 = C0211t.m1012a((ArrayList<View>) arrayList);
                C0211t.m1021a(a3, a, b3, obj, b2, a2, arrayList);
                C0211t.m1016a(viewGroup, a3);
                C0211t.m1014a(viewGroup, arrayList2, arrayList, a4, aVar2);
                m1007b(b3, 0);
                C0211t.m1023a(a2, (ArrayList<View>) arrayList2, (ArrayList<View>) arrayList);
            }
        }
    }

    /* renamed from: a */
    static void m992a(C0186n nVar, ArrayList<C0162c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (nVar.f638l >= 1 && Build.VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0162c cVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m1004b(cVar, (SparseArray<C0210a>) sparseArray, z);
                } else {
                    m989a(cVar, (SparseArray<C0210a>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(nVar.f639m.mo913g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0294a<String, String> a = m979a(keyAt, arrayList, arrayList2, i, i2);
                    C0210a aVar = (C0210a) sparseArray.valueAt(i4);
                    if (z) {
                        m991a(nVar, keyAt, aVar, view, a);
                    } else {
                        m1006b(nVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m993a(C0294a<String, String> aVar, C0294a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo1376c(size))) {
                aVar.mo1380d(size);
            }
        }
    }

    /* renamed from: a */
    private static void m994a(ViewGroup viewGroup, C0170h hVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final View view2 = view;
        final C0170h hVar2 = hVar;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        ViewGroup viewGroup2 = viewGroup;
        C0224x.m1065a(viewGroup, new Runnable() {
            public void run() {
                Object obj = obj3;
                if (obj != null) {
                    C0211t.m1036c(obj, view2);
                    arrayList5.addAll(C0205s.m1003b(obj3, hVar2, (ArrayList<View>) arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        C0211t.m1035b(obj4, (ArrayList<View>) arrayList6, (ArrayList<View>) arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    /* renamed from: a */
    private static void m995a(Object obj, C0170h hVar, final ArrayList<View> arrayList) {
        if (hVar != null && obj != null && hVar.f555k && hVar.f570z && hVar.f541Q) {
            hVar.mo797f(true);
            C0211t.m1034b(obj, hVar.mo803i(), arrayList);
            C0224x.m1065a(hVar.f531G, new Runnable() {
                public void run() {
                    C0205s.m1007b((ArrayList<View>) arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m996a(Object obj, Object obj2, C0294a<String, View> aVar, boolean z, C0162c cVar) {
        if (cVar.f497s != null && !cVar.f497s.isEmpty()) {
            View view = aVar.get((z ? cVar.f498t : cVar.f497s).get(0));
            C0211t.m1019a(obj, view);
            if (obj2 != null) {
                C0211t.m1019a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m998a(ArrayList<View> arrayList, C0294a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c = aVar.mo1376c(size);
            if (collection.contains(C0388q.m1666m(c))) {
                arrayList.add(c);
            }
        }
    }

    /* renamed from: b */
    private static C0294a<String, View> m999b(C0294a<String, String> aVar, Object obj, C0210a aVar2) {
        ArrayList<String> arrayList;
        C0225y yVar;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        C0170h hVar = aVar2.f721d;
        C0294a<String, View> aVar3 = new C0294a<>();
        C0211t.m1026a((Map<String, View>) aVar3, hVar.mo803i());
        C0162c cVar = aVar2.f723f;
        if (aVar2.f722e) {
            yVar = hVar.mo741P();
            arrayList = cVar.f498t;
        } else {
            yVar = hVar.mo742Q();
            arrayList = cVar.f497s;
        }
        aVar3.mo1245a(arrayList);
        if (yVar != null) {
            yVar.mo1090a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0388q.m1666m(view))) {
                    aVar.put(C0388q.m1666m(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo1245a(aVar3.keySet());
        }
        return aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static View m1000b(C0294a<String, View> aVar, C0210a aVar2, Object obj, boolean z) {
        C0162c cVar = aVar2.f720c;
        if (obj == null || aVar == null || cVar.f497s == null || cVar.f497s.isEmpty()) {
            return null;
        }
        return aVar.get((z ? cVar.f497s : cVar.f498t).get(0));
    }

    /* renamed from: b */
    private static Object m1001b(C0170h hVar, boolean z) {
        if (hVar == null) {
            return null;
        }
        return C0211t.m1009a(z ? hVar.mo822t() : hVar.mo824u());
    }

    /* renamed from: b */
    private static Object m1002b(ViewGroup viewGroup, View view, C0294a<String, String> aVar, C0210a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        C0294a<String, String> aVar3;
        Object obj4;
        C0210a aVar4 = aVar2;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Object obj6 = obj2;
        final C0170h hVar = aVar4.f718a;
        final C0170h hVar2 = aVar4.f721d;
        Rect rect = null;
        if (hVar == null || hVar2 == null) {
            return null;
        }
        final boolean z = aVar4.f719b;
        if (aVar.isEmpty()) {
            aVar3 = aVar;
            obj3 = null;
        } else {
            obj3 = m982a(hVar, hVar2, z);
            aVar3 = aVar;
        }
        C0294a<String, View> b = m999b(aVar3, obj3, aVar4);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj6 == null && obj4 == null) {
            return null;
        }
        m1005b(hVar, hVar2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            C0211t.m1020a(obj4, view, arrayList3);
            m996a(obj4, obj6, b, aVar4.f722e, aVar4.f723f);
            if (obj5 != null) {
                C0211t.m1018a(obj5, rect);
            }
        } else {
            View view2 = view;
        }
        Rect rect2 = rect;
        final C0294a<String, String> aVar5 = aVar;
        final Object obj7 = obj4;
        final C0210a aVar6 = aVar2;
        final ArrayList<View> arrayList4 = arrayList2;
        final View view3 = view;
        final ArrayList<View> arrayList5 = arrayList;
        final Object obj8 = obj;
        final Rect rect3 = rect2;
        ViewGroup viewGroup2 = viewGroup;
        C0224x.m1065a(viewGroup, new Runnable() {
            public void run() {
                C0294a a = C0205s.m1008c(aVar5, obj7, aVar6);
                if (a != null) {
                    arrayList4.addAll(a.values());
                    arrayList4.add(view3);
                }
                C0205s.m1005b(hVar, hVar2, z, (C0294a<String, View>) a, false);
                Object obj = obj7;
                if (obj != null) {
                    C0211t.m1023a(obj, (ArrayList<View>) arrayList5, (ArrayList<View>) arrayList4);
                    View a2 = C0205s.m1000b((C0294a<String, View>) a, aVar6, obj8, z);
                    if (a2 != null) {
                        C0211t.m1013a(a2, rect3);
                    }
                }
            }
        });
        return obj4;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static ArrayList<View> m1003b(Object obj, C0170h hVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View i = hVar.mo803i();
        if (i != null) {
            C0211t.m1024a(arrayList2, i);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        C0211t.m1022a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: b */
    public static void m1004b(C0162c cVar, SparseArray<C0210a> sparseArray, boolean z) {
        if (cVar.f480b.f640n.mo833a()) {
            for (int size = cVar.f481c.size() - 1; size >= 0; size--) {
                m988a(cVar, cVar.f481c.get(size), sparseArray, true, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1005b(C0170h hVar, C0170h hVar2, boolean z, C0294a<String, View> aVar, boolean z2) {
        C0225y P = z ? hVar2.mo741P() : hVar.mo741P();
        if (P != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo1375b(i));
                arrayList.add(aVar.mo1376c(i));
            }
            if (z2) {
                P.mo1089a(arrayList2, arrayList, (List<View>) null);
            } else {
                P.mo1091b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: b */
    private static void m1006b(C0186n nVar, int i, C0210a aVar, View view, C0294a<String, String> aVar2) {
        Object obj;
        C0186n nVar2 = nVar;
        C0210a aVar3 = aVar;
        View view2 = view;
        C0294a<String, String> aVar4 = aVar2;
        ViewGroup viewGroup = nVar2.f640n.mo833a() ? (ViewGroup) nVar2.f640n.mo832a(i) : null;
        if (viewGroup != null) {
            C0170h hVar = aVar3.f718a;
            C0170h hVar2 = aVar3.f721d;
            boolean z = aVar3.f719b;
            boolean z2 = aVar3.f722e;
            Object a = m983a(hVar, z);
            Object b = m1001b(hVar2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = arrayList;
            Object obj2 = b;
            Object b2 = m1002b(viewGroup, view, aVar2, aVar, arrayList, arrayList2, a, b);
            if (a == null && b2 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> b3 = m1003b(obj, hVar2, (ArrayList<View>) arrayList4, view2);
            Object obj3 = (b3 == null || b3.isEmpty()) ? null : obj;
            C0211t.m1033b(a, view2);
            Object a2 = m985a(a, obj3, b2, hVar, aVar3.f719b);
            if (a2 != null) {
                ArrayList arrayList5 = new ArrayList();
                C0211t.m1021a(a2, a, arrayList5, obj3, b3, b2, arrayList3);
                m994a(viewGroup, hVar, view, (ArrayList<View>) arrayList3, a, (ArrayList<View>) arrayList5, obj3, b3);
                ArrayList arrayList6 = arrayList3;
                C0211t.m1015a((View) viewGroup, (ArrayList<View>) arrayList6, (Map<String, String>) aVar4);
                C0211t.m1016a(viewGroup, a2);
                C0211t.m1017a(viewGroup, (ArrayList<View>) arrayList6, (Map<String, String>) aVar4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1007b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C0294a<String, View> m1008c(C0294a<String, String> aVar, Object obj, C0210a aVar2) {
        C0225y yVar;
        ArrayList<String> arrayList;
        String a;
        C0170h hVar = aVar2.f718a;
        View i = hVar.mo803i();
        if (aVar.isEmpty() || obj == null || i == null) {
            aVar.clear();
            return null;
        }
        C0294a<String, View> aVar3 = new C0294a<>();
        C0211t.m1026a((Map<String, View>) aVar3, i);
        C0162c cVar = aVar2.f720c;
        if (aVar2.f719b) {
            yVar = hVar.mo742Q();
            arrayList = cVar.f497s;
        } else {
            yVar = hVar.mo741P();
            arrayList = cVar.f498t;
        }
        if (arrayList != null) {
            aVar3.mo1245a(arrayList);
        }
        if (yVar != null) {
            yVar.mo1090a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    String a2 = m986a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C0388q.m1666m(view)) && (a = m986a(aVar, str)) != null) {
                    aVar.put(a, C0388q.m1666m(view));
                }
            }
        } else {
            m993a(aVar, aVar3);
        }
        return aVar3;
    }
}
