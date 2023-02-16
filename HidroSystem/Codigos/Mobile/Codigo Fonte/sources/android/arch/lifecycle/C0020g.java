package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0011b;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.g */
public class C0020g extends Fragment {

    /* renamed from: a */
    private C0021a f38a;

    /* renamed from: android.arch.lifecycle.g$a */
    interface C0021a {
        /* renamed from: a */
        void mo37a();

        /* renamed from: b */
        void mo38b();

        /* renamed from: c */
        void mo39c();
    }

    /* renamed from: a */
    public static void m37a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0020g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m38a(C0011b.C0012a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0018e) {
            ((C0018e) activity).mo29b().mo26a(aVar);
        } else if (activity instanceof C0014c) {
            C0011b a = ((C0014c) activity).mo25a();
            if (a instanceof C0015d) {
                ((C0015d) a).mo26a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m39a(C0021a aVar) {
        if (aVar != null) {
            aVar.mo37a();
        }
    }

    /* renamed from: b */
    private void m40b(C0021a aVar) {
        if (aVar != null) {
            aVar.mo38b();
        }
    }

    /* renamed from: c */
    private void m41c(C0021a aVar) {
        if (aVar != null) {
            aVar.mo39c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m39a(this.f38a);
        m38a(C0011b.C0012a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m38a(C0011b.C0012a.ON_DESTROY);
        this.f38a = null;
    }

    public void onPause() {
        super.onPause();
        m38a(C0011b.C0012a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m41c(this.f38a);
        m38a(C0011b.C0012a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m40b(this.f38a);
        m38a(C0011b.C0012a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m38a(C0011b.C0012a.ON_STOP);
    }
}
