package android.support.p020v7.widget;

import android.support.p020v7.widget.C0884f;
import java.util.List;

/* renamed from: android.support.v7.widget.at */
class C0782at {

    /* renamed from: a */
    final C0783a f2598a;

    /* renamed from: android.support.v7.widget.at$a */
    interface C0783a {
        /* renamed from: a */
        C0884f.C0886b mo3733a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo3734a(C0884f.C0886b bVar);
    }

    C0782at(C0783a aVar) {
        this.f2598a = aVar;
    }

    /* renamed from: a */
    private void m3982a(List<C0884f.C0886b> list, int i, int i2) {
        C0884f.C0886b bVar = list.get(i);
        C0884f.C0886b bVar2 = list.get(i2);
        int i3 = bVar2.f2997a;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    m3984c(list, i, bVar, i2, bVar2);
                    return;
                case 2:
                    mo3731a(list, i, bVar, i2, bVar2);
                    return;
                default:
                    return;
            }
        } else {
            mo3732b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private int m3983b(List<C0884f.C0886b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2997a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m3984c(List<C0884f.C0886b> list, int i, C0884f.C0886b bVar, int i2, C0884f.C0886b bVar2) {
        int i3 = bVar.f3000d < bVar2.f2998b ? -1 : 0;
        if (bVar.f2998b < bVar2.f2998b) {
            i3++;
        }
        if (bVar2.f2998b <= bVar.f2998b) {
            bVar.f2998b += bVar2.f3000d;
        }
        if (bVar2.f2998b <= bVar.f3000d) {
            bVar.f3000d += bVar2.f3000d;
        }
        bVar2.f2998b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3730a(List<C0884f.C0886b> list) {
        while (true) {
            int b = m3983b(list);
            if (b != -1) {
                m3982a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        if (r11.f3000d > r13.f2998b) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r11.f3000d >= r13.f2998b) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3731a(java.util.List<android.support.p020v7.widget.C0884f.C0886b> r9, int r10, android.support.p020v7.widget.C0884f.C0886b r11, int r12, android.support.p020v7.widget.C0884f.C0886b r13) {
        /*
            r8 = this;
            int r0 = r11.f2998b
            int r1 = r11.f3000d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x001b
            int r0 = r13.f2998b
            int r1 = r11.f2998b
            if (r0 != r1) goto L_0x0019
            int r0 = r13.f3000d
            int r1 = r11.f3000d
            int r4 = r11.f2998b
            int r1 = r1 - r4
            if (r0 != r1) goto L_0x0019
            r0 = 0
            goto L_0x002c
        L_0x0019:
            r0 = 0
            goto L_0x002f
        L_0x001b:
            int r0 = r13.f2998b
            int r1 = r11.f3000d
            int r1 = r1 + r3
            if (r0 != r1) goto L_0x002e
            int r0 = r13.f3000d
            int r1 = r11.f2998b
            int r4 = r11.f3000d
            int r1 = r1 - r4
            if (r0 != r1) goto L_0x002e
            r0 = 1
        L_0x002c:
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            int r1 = r11.f3000d
            int r4 = r13.f2998b
            r5 = 2
            if (r1 >= r4) goto L_0x003c
            int r1 = r13.f2998b
            int r1 = r1 - r3
            r13.f2998b = r1
            goto L_0x005b
        L_0x003c:
            int r1 = r11.f3000d
            int r4 = r13.f2998b
            int r6 = r13.f3000d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x005b
            int r10 = r13.f3000d
            int r10 = r10 - r3
            r13.f3000d = r10
            r11.f2997a = r5
            r11.f3000d = r3
            int r10 = r13.f3000d
            if (r10 != 0) goto L_0x005a
            r9.remove(r12)
            android.support.v7.widget.at$a r9 = r8.f2598a
            r9.mo3734a(r13)
        L_0x005a:
            return
        L_0x005b:
            int r1 = r11.f2998b
            int r4 = r13.f2998b
            r6 = 0
            if (r1 > r4) goto L_0x0068
            int r1 = r13.f2998b
            int r1 = r1 + r3
            r13.f2998b = r1
            goto L_0x0089
        L_0x0068:
            int r1 = r11.f2998b
            int r4 = r13.f2998b
            int r7 = r13.f3000d
            int r4 = r4 + r7
            if (r1 >= r4) goto L_0x0089
            int r1 = r13.f2998b
            int r4 = r13.f3000d
            int r1 = r1 + r4
            int r4 = r11.f2998b
            int r1 = r1 - r4
            android.support.v7.widget.at$a r4 = r8.f2598a
            int r7 = r11.f2998b
            int r7 = r7 + r3
            android.support.v7.widget.f$b r6 = r4.mo3733a(r5, r7, r1, r6)
            int r1 = r11.f2998b
            int r3 = r13.f2998b
            int r1 = r1 - r3
            r13.f3000d = r1
        L_0x0089:
            if (r2 == 0) goto L_0x0097
            r9.set(r10, r13)
            r9.remove(r12)
            android.support.v7.widget.at$a r9 = r8.f2598a
            r9.mo3734a(r11)
            return
        L_0x0097:
            if (r0 == 0) goto L_0x00c9
            if (r6 == 0) goto L_0x00b5
            int r0 = r11.f2998b
            int r1 = r6.f2998b
            if (r0 <= r1) goto L_0x00a8
            int r0 = r11.f2998b
            int r1 = r6.f3000d
            int r0 = r0 - r1
            r11.f2998b = r0
        L_0x00a8:
            int r0 = r11.f3000d
            int r1 = r6.f2998b
            if (r0 <= r1) goto L_0x00b5
            int r0 = r11.f3000d
            int r1 = r6.f3000d
            int r0 = r0 - r1
            r11.f3000d = r0
        L_0x00b5:
            int r0 = r11.f2998b
            int r1 = r13.f2998b
            if (r0 <= r1) goto L_0x00c2
            int r0 = r11.f2998b
            int r1 = r13.f3000d
            int r0 = r0 - r1
            r11.f2998b = r0
        L_0x00c2:
            int r0 = r11.f3000d
            int r1 = r13.f2998b
            if (r0 <= r1) goto L_0x00ff
            goto L_0x00f8
        L_0x00c9:
            if (r6 == 0) goto L_0x00e5
            int r0 = r11.f2998b
            int r1 = r6.f2998b
            if (r0 < r1) goto L_0x00d8
            int r0 = r11.f2998b
            int r1 = r6.f3000d
            int r0 = r0 - r1
            r11.f2998b = r0
        L_0x00d8:
            int r0 = r11.f3000d
            int r1 = r6.f2998b
            if (r0 < r1) goto L_0x00e5
            int r0 = r11.f3000d
            int r1 = r6.f3000d
            int r0 = r0 - r1
            r11.f3000d = r0
        L_0x00e5:
            int r0 = r11.f2998b
            int r1 = r13.f2998b
            if (r0 < r1) goto L_0x00f2
            int r0 = r11.f2998b
            int r1 = r13.f3000d
            int r0 = r0 - r1
            r11.f2998b = r0
        L_0x00f2:
            int r0 = r11.f3000d
            int r1 = r13.f2998b
            if (r0 < r1) goto L_0x00ff
        L_0x00f8:
            int r0 = r11.f3000d
            int r1 = r13.f3000d
            int r0 = r0 - r1
            r11.f3000d = r0
        L_0x00ff:
            r9.set(r10, r13)
            int r13 = r11.f2998b
            int r0 = r11.f3000d
            if (r13 == r0) goto L_0x010c
            r9.set(r12, r11)
            goto L_0x010f
        L_0x010c:
            r9.remove(r12)
        L_0x010f:
            if (r6 == 0) goto L_0x0114
            r9.add(r10, r6)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0782at.mo3731a(java.util.List, int, android.support.v7.widget.f$b, int, android.support.v7.widget.f$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3732b(java.util.List<android.support.p020v7.widget.C0884f.C0886b> r8, int r9, android.support.p020v7.widget.C0884f.C0886b r10, int r11, android.support.p020v7.widget.C0884f.C0886b r12) {
        /*
            r7 = this;
            int r0 = r10.f3000d
            int r1 = r12.f2998b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000f
            int r0 = r12.f2998b
            int r0 = r0 - r4
            r12.f2998b = r0
            goto L_0x0028
        L_0x000f:
            int r0 = r10.f3000d
            int r1 = r12.f2998b
            int r5 = r12.f3000d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0028
            int r0 = r12.f3000d
            int r0 = r0 - r4
            r12.f3000d = r0
            android.support.v7.widget.at$a r0 = r7.f2598a
            int r1 = r10.f2998b
            java.lang.Object r5 = r12.f2999c
            android.support.v7.widget.f$b r0 = r0.mo3733a(r2, r1, r4, r5)
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            int r1 = r10.f2998b
            int r5 = r12.f2998b
            if (r1 > r5) goto L_0x0035
            int r1 = r12.f2998b
            int r1 = r1 + r4
            r12.f2998b = r1
            goto L_0x0056
        L_0x0035:
            int r1 = r10.f2998b
            int r5 = r12.f2998b
            int r6 = r12.f3000d
            int r5 = r5 + r6
            if (r1 >= r5) goto L_0x0056
            int r1 = r12.f2998b
            int r3 = r12.f3000d
            int r1 = r1 + r3
            int r3 = r10.f2998b
            int r1 = r1 - r3
            android.support.v7.widget.at$a r3 = r7.f2598a
            int r5 = r10.f2998b
            int r5 = r5 + r4
            java.lang.Object r4 = r12.f2999c
            android.support.v7.widget.f$b r3 = r3.mo3733a(r2, r5, r1, r4)
            int r2 = r12.f3000d
            int r2 = r2 - r1
            r12.f3000d = r2
        L_0x0056:
            r8.set(r11, r10)
            int r10 = r12.f3000d
            if (r10 <= 0) goto L_0x0061
            r8.set(r9, r12)
            goto L_0x0069
        L_0x0061:
            r8.remove(r9)
            android.support.v7.widget.at$a r10 = r7.f2598a
            r10.mo3734a(r12)
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            r8.add(r9, r0)
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r8.add(r9, r3)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0782at.mo3732b(java.util.List, int, android.support.v7.widget.f$b, int, android.support.v7.widget.f$b):void");
    }
}
