package android.support.p020v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p005v4.p007b.C0238c;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.s */
class C0608s {

    /* renamed from: a */
    private static C0608s f1655a;

    /* renamed from: b */
    private final Context f1656b;

    /* renamed from: c */
    private final LocationManager f1657c;

    /* renamed from: d */
    private final C0609a f1658d = new C0609a();

    /* renamed from: android.support.v7.app.s$a */
    private static class C0609a {

        /* renamed from: a */
        boolean f1659a;

        /* renamed from: b */
        long f1660b;

        /* renamed from: c */
        long f1661c;

        /* renamed from: d */
        long f1662d;

        /* renamed from: e */
        long f1663e;

        /* renamed from: f */
        long f1664f;

        C0609a() {
        }
    }

    C0608s(Context context, LocationManager locationManager) {
        this.f1656b = context;
        this.f1657c = locationManager;
    }

    /* renamed from: a */
    private Location m2761a(String str) {
        LocationManager locationManager = this.f1657c;
        if (locationManager == null) {
            return null;
        }
        try {
            if (locationManager.isProviderEnabled(str)) {
                return this.f1657c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0608s m2762a(Context context) {
        if (f1655a == null) {
            Context applicationContext = context.getApplicationContext();
            f1655a = new C0608s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1655a;
    }

    /* renamed from: a */
    private void m2763a(Location location) {
        long j;
        C0609a aVar = this.f1658d;
        long currentTimeMillis = System.currentTimeMillis();
        C0607r a = C0607r.m2759a();
        C0607r rVar = a;
        rVar.mo2415a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f1652a;
        rVar.mo2415a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f1654c == 1;
        long j3 = a.f1653b;
        long j4 = j2;
        long j5 = a.f1652a;
        long j6 = j3;
        boolean z2 = z;
        a.mo2415a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f1653b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f1659a = z2;
        aVar.f1660b = j4;
        aVar.f1661c = j6;
        aVar.f1662d = j5;
        aVar.f1663e = j7;
        aVar.f1664f = j;
    }

    /* renamed from: b */
    private Location m2764b() {
        Location location = null;
        Location a = C0238c.m1114a(this.f1656b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2761a("network") : null;
        if (C0238c.m1114a(this.f1656b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2761a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: c */
    private boolean m2765c() {
        C0609a aVar = this.f1658d;
        return aVar != null && aVar.f1664f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2416a() {
        C0609a aVar = this.f1658d;
        if (m2765c()) {
            return aVar.f1659a;
        }
        Location b = m2764b();
        if (b != null) {
            m2763a(b);
            return aVar.f1659a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
