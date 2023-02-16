package android.support.p020v7.widget;

/* renamed from: android.support.v7.widget.ay */
class C0830ay {

    /* renamed from: a */
    private int f2807a = 0;

    /* renamed from: b */
    private int f2808b = 0;

    /* renamed from: c */
    private int f2809c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2810d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2811e = 0;

    /* renamed from: f */
    private int f2812f = 0;

    /* renamed from: g */
    private boolean f2813g = false;

    /* renamed from: h */
    private boolean f2814h = false;

    C0830ay() {
    }

    /* renamed from: a */
    public int mo4227a() {
        return this.f2807a;
    }

    /* renamed from: a */
    public void mo4228a(int i, int i2) {
        this.f2809c = i;
        this.f2810d = i2;
        this.f2814h = true;
        if (this.f2813g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2807a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2808b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2807a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2808b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4229a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f2813g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f2813g = r2
            boolean r0 = r1.f2814h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f2810d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f2811e
        L_0x0016:
            r1.f2807a = r2
            int r2 = r1.f2809c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f2809c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f2811e
        L_0x0024:
            r1.f2807a = r2
            int r2 = r1.f2810d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f2811e
            r1.f2807a = r2
        L_0x002f:
            int r2 = r1.f2812f
        L_0x0031:
            r1.f2808b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.widget.C0830ay.mo4229a(boolean):void");
    }

    /* renamed from: b */
    public int mo4230b() {
        return this.f2808b;
    }

    /* renamed from: b */
    public void mo4231b(int i, int i2) {
        this.f2814h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2811e = i;
            this.f2807a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2812f = i2;
            this.f2808b = i2;
        }
    }

    /* renamed from: c */
    public int mo4232c() {
        return this.f2813g ? this.f2808b : this.f2807a;
    }

    /* renamed from: d */
    public int mo4233d() {
        return this.f2813g ? this.f2807a : this.f2808b;
    }
}
