package android.support.p005v4.p006a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p005v4.p007b.C0227a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.a.ab */
public final class C0157ab implements Iterable<Intent> {

    /* renamed from: a */
    private static final C0160c f476a = (Build.VERSION.SDK_INT >= 16 ? new C0159b() : new C0160c());

    /* renamed from: b */
    private final ArrayList<Intent> f477b = new ArrayList<>();

    /* renamed from: c */
    private final Context f478c;

    /* renamed from: android.support.v4.a.ab$a */
    public interface C0158a {
        /* renamed from: a_ */
        Intent mo696a_();
    }

    /* renamed from: android.support.v4.a.ab$b */
    static class C0159b extends C0160c {
        C0159b() {
        }
    }

    /* renamed from: android.support.v4.a.ab$c */
    static class C0160c {
        C0160c() {
        }
    }

    private C0157ab(Context context) {
        this.f478c = context;
    }

    /* renamed from: a */
    public static C0157ab m605a(Context context) {
        return new C0157ab(context);
    }

    /* renamed from: a */
    public C0157ab mo690a(Activity activity) {
        Intent a_ = activity instanceof C0158a ? ((C0158a) activity).mo696a_() : null;
        if (a_ == null) {
            a_ = C0223w.m1059a(activity);
        }
        if (a_ != null) {
            ComponentName component = a_.getComponent();
            if (component == null) {
                component = a_.resolveActivity(this.f478c.getPackageManager());
            }
            mo691a(component);
            mo692a(a_);
        }
        return this;
    }

    /* renamed from: a */
    public C0157ab mo691a(ComponentName componentName) {
        int size = this.f477b.size();
        try {
            Context context = this.f478c;
            while (true) {
                Intent a = C0223w.m1060a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f477b.add(size, a);
                context = this.f478c;
                componentName = a.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0157ab mo692a(Intent intent) {
        this.f477b.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo693a() {
        mo694a((Bundle) null);
    }

    /* renamed from: a */
    public void mo694a(Bundle bundle) {
        if (!this.f477b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f477b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0227a.m1071a(this.f478c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f478c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f477b.iterator();
    }
}
