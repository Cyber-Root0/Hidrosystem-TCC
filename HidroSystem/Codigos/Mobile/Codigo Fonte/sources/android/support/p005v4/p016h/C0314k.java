package android.support.p005v4.p016h;

/* renamed from: android.support.v4.h.k */
public final class C0314k {

    /* renamed from: android.support.v4.h.k$a */
    public interface C0315a<T> {
        /* renamed from: a */
        T mo1367a();

        /* renamed from: a */
        boolean mo1368a(T t);
    }

    /* renamed from: android.support.v4.h.k$b */
    public static class C0316b<T> implements C0315a<T> {

        /* renamed from: a */
        private final Object[] f929a;

        /* renamed from: b */
        private int f930b;

        public C0316b(int i) {
            if (i > 0) {
                this.f929a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: b */
        private boolean m1385b(T t) {
            for (int i = 0; i < this.f930b; i++) {
                if (this.f929a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public T mo1367a() {
            int i = this.f930b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f929a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f930b = i - 1;
            return t;
        }

        /* renamed from: a */
        public boolean mo1368a(T t) {
            if (!m1385b(t)) {
                int i = this.f930b;
                Object[] objArr = this.f929a;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.f930b = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    /* renamed from: android.support.v4.h.k$c */
    public static class C0317c<T> extends C0316b<T> {

        /* renamed from: a */
        private final Object f931a = new Object();

        public C0317c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo1367a() {
            T a;
            synchronized (this.f931a) {
                a = super.mo1367a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo1368a(T t) {
            boolean a;
            synchronized (this.f931a) {
                a = super.mo1368a(t);
            }
            return a;
        }
    }
}
