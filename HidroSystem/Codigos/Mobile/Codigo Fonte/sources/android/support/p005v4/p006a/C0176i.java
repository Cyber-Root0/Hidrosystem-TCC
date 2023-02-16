package android.support.p005v4.p006a;

import android.arch.lifecycle.C0011b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p005v4.p016h.C0319m;
import android.support.p005v4.p016h.C0320n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.i */
public class C0176i extends C0167f {

    /* renamed from: c */
    final Handler f592c = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (C0176i.this.f596g) {
                        C0176i.this.mo837a(false);
                        return;
                    }
                    return;
                case 2:
                    C0176i.this.mo839b_();
                    C0176i.this.f593d.mo902n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: d */
    final C0181k f593d = C0181k.m777a((C0182l<?>) new C0178a());

    /* renamed from: e */
    boolean f594e;

    /* renamed from: f */
    boolean f595f;

    /* renamed from: g */
    boolean f596g = true;

    /* renamed from: h */
    boolean f597h = true;

    /* renamed from: i */
    boolean f598i;

    /* renamed from: j */
    int f599j;

    /* renamed from: k */
    C0320n<String> f600k;

    /* renamed from: android.support.v4.a.i$a */
    class C0178a extends C0182l<C0176i> {
        public C0178a() {
            super(C0176i.this);
        }

        /* renamed from: a */
        public View mo832a(int i) {
            return C0176i.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo867a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0176i.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo833a() {
            Window window = C0176i.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: a */
        public boolean mo868a(C0170h hVar) {
            return !C0176i.this.isFinishing();
        }

        /* renamed from: b */
        public LayoutInflater mo869b() {
            return C0176i.this.getLayoutInflater().cloneInContext(C0176i.this);
        }

        /* renamed from: b */
        public void mo870b(C0170h hVar) {
            C0176i.this.mo836a(hVar);
        }

        /* renamed from: c */
        public void mo871c() {
            C0176i.this.mo841d();
        }

        /* renamed from: d */
        public boolean mo872d() {
            return C0176i.this.getWindow() != null;
        }

        /* renamed from: e */
        public int mo873e() {
            Window window = C0176i.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: android.support.v4.a.i$b */
    static final class C0179b {

        /* renamed from: a */
        Object f603a;

        /* renamed from: b */
        C0199o f604b;

        /* renamed from: c */
        C0319m<String, C0219u> f605c;

        C0179b() {
        }
    }

    /* renamed from: a */
    private static void m754a(C0183m mVar, C0011b.C0013b bVar) {
        for (C0170h next : mVar.mo923b()) {
            if (next != null) {
                next.f545U.mo27a(bVar);
                m754a(next.mo798g(), bVar);
            }
        }
    }

    /* renamed from: a */
    public C0011b mo25a() {
        return super.mo25a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo720a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f593d.mo876a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo836a(C0170h hVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo837a(boolean z) {
        if (!this.f597h) {
            this.f597h = true;
            this.f598i = z;
            this.f592c.removeMessages(1);
            mo843e();
        } else if (z) {
            this.f593d.mo903o();
            this.f593d.mo891c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo838a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b_ */
    public void mo839b_() {
        this.f593d.mo896h();
    }

    /* renamed from: c */
    public Object mo840c() {
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public void mo841d() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f594e);
        printWriter.print("mResumed=");
        printWriter.print(this.f595f);
        printWriter.print(" mStopped=");
        printWriter.print(this.f596g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f597h);
        this.f593d.mo881a(str2, fileDescriptor, printWriter, strArr);
        this.f593d.mo875a().mo921a(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo843e() {
        this.f593d.mo891c(this.f598i);
        this.f593d.mo899k();
    }

    /* renamed from: f */
    public C0183m mo844f() {
        return this.f593d.mo875a();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f593d.mo886b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.f600k.mo1390a(i4);
            this.f600k.mo1396c(i4);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0170h a2 = this.f593d.mo874a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.mo753a(i & 65535, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C0183m a = this.f593d.mo875a();
        boolean c = a.mo924c();
        if (c && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (c || !a.mo922a()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f593d.mo877a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0199o oVar = null;
        this.f593d.mo879a((C0170h) null);
        super.onCreate(bundle);
        C0179b bVar = (C0179b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f593d.mo880a(bVar.f605c);
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0181k kVar = this.f593d;
            if (bVar != null) {
                oVar = bVar.f604b;
            }
            kVar.mo878a(parcelable, oVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f599j = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f600k = new C0320n<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f600k.mo1394b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f600k == null) {
            this.f600k = new C0320n<>();
            this.f599j = 0;
        }
        this.f593d.mo893e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f593d.mo884a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo837a(false);
        this.f593d.mo900l();
        this.f593d.mo904p();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f593d.mo901m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f593d.mo885a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f593d.mo889b(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f593d.mo882a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f593d.mo886b();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f593d.mo887b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f595f = false;
        if (this.f592c.hasMessages(2)) {
            this.f592c.removeMessages(2);
            mo839b_();
        }
        this.f593d.mo897i();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f593d.mo888b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f592c.removeMessages(2);
        mo839b_();
        this.f593d.mo902n();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : mo838a(view, menu) | this.f593d.mo883a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.f600k.mo1390a(i3);
            this.f600k.mo1396c(i3);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0170h a2 = this.f593d.mo874a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.mo755a(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f592c.sendEmptyMessage(2);
        this.f595f = true;
        this.f593d.mo902n();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f596g) {
            mo837a(true);
        }
        Object c = mo840c();
        C0199o d = this.f593d.mo892d();
        C0319m<String, C0219u> r = this.f593d.mo906r();
        if (d == null && r == null && c == null) {
            return null;
        }
        C0179b bVar = new C0179b();
        bVar.f603a = c;
        bVar.f604b = d;
        bVar.f605c = r;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m754a(mo844f(), C0011b.C0013b.CREATED);
        Parcelable c = this.f593d.mo890c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f600k.mo1392b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f599j);
            int[] iArr = new int[this.f600k.mo1392b()];
            String[] strArr = new String[this.f600k.mo1392b()];
            for (int i = 0; i < this.f600k.mo1392b(); i++) {
                iArr[i] = this.f600k.mo1399d(i);
                strArr[i] = this.f600k.mo1400e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f596g = false;
        this.f597h = false;
        this.f592c.removeMessages(1);
        if (!this.f594e) {
            this.f594e = true;
            this.f593d.mo894f();
        }
        this.f593d.mo886b();
        this.f593d.mo902n();
        this.f593d.mo903o();
        this.f593d.mo895g();
        this.f593d.mo905q();
    }

    public void onStateNotSaved() {
        this.f593d.mo886b();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f596g = true;
        m754a(mo844f(), C0011b.C0013b.CREATED);
        this.f592c.sendEmptyMessage(1);
        this.f593d.mo898j();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f520b && i != -1) {
            m633a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
