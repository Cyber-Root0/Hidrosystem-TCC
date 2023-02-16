package com.goyal.website2apk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.p005v4.widget.DrawerLayout;
import android.support.p005v4.widget.SwipeRefreshLayout;
import android.support.p020v7.app.C0554b;
import android.support.p020v7.app.C0567e;
import android.support.p020v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends C0567e implements NavigationView.C0100a {
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final String f3097z = "MainActivity";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f3098A;

    /* renamed from: B */
    private ValueCallback<Uri> f3099B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public ValueCallback<Uri[]> f3100C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public FrameLayout f3101D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public WebChromeClient.CustomViewCallback f3102E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public View f3103F;

    /* renamed from: l */
    NavigationView f3104l;

    /* renamed from: m */
    WebView f3105m;

    /* renamed from: n */
    ImageView f3106n;

    /* renamed from: o */
    String f3107o;

    /* renamed from: p */
    String f3108p;

    /* renamed from: q */
    ProgressBar f3109q;

    /* renamed from: r */
    WebChromeClient f3110r;

    /* renamed from: s */
    Context f3111s;

    /* renamed from: t */
    DrawerLayout f3112t;

    /* renamed from: u */
    C0554b f3113u;

    /* renamed from: v */
    Toolbar f3114v;

    /* renamed from: w */
    C0939a f3115w;

    /* renamed from: x */
    Boolean f3116x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public SwipeRefreshLayout f3117y;

    /* renamed from: com.goyal.website2apk.MainActivity$a */
    public class C0935a {

        /* renamed from: a */
        Context f3143a;

        C0935a(Context context) {
            this.f3143a = context;
        }

        @JavascriptInterface
        public void askEnableGPS() {
            MainActivity.this.mo4581p();
        }

        @JavascriptInterface
        public void clickMenuButton() {
            MainActivity.this.openOptionsMenu();
        }

        @JavascriptInterface
        public void exitApp() {
            MainActivity.this.mo4577n();
        }

        @JavascriptInterface
        public String getAppPackageName() {
            try {
                return MainActivity.this.getPackageManager().getPackageInfo(MainActivity.this.getPackageName(), 0).packageName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "ERROR";
            }
        }

        @JavascriptInterface
        public int getAppVersionCode() {
            try {
                return MainActivity.this.getPackageManager().getPackageInfo(MainActivity.this.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return 0;
            }
        }

        @JavascriptInterface
        public String getAppVersionName() {
            try {
                return MainActivity.this.getPackageManager().getPackageInfo(MainActivity.this.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "Error Fetching Version Info";
            }
        }

        @JavascriptInterface
        public String getUniqueDeviceID() {
            return MainActivity.this.mo4583r();
        }

        @JavascriptInterface
        public void keepScreenOn(final boolean z) {
            MainActivity.this.f3105m.post(new Runnable() {
                public void run() {
                    MainActivity.this.f3105m.setKeepScreenOn(z);
                }
            });
        }

        @JavascriptInterface
        public void openExternal(String str) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }

        @JavascriptInterface
        public void printPage() {
            MainActivity.this.f3105m.post(new Runnable() {
                public void run() {
                    MainActivity.this.mo4572a(MainActivity.this.f3105m);
                }
            });
        }

        @JavascriptInterface
        public void rateUs() {
            MainActivity.this.mo4582q();
        }

        @JavascriptInterface
        public void refreshPage() {
            MainActivity.this.f3105m.post(new Runnable() {
                public void run() {
                    MainActivity.this.f3105m.reload();
                }
            });
        }

        @JavascriptInterface
        public void shareIntent() {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.f3143a.getString(R.string.sharesubject));
            intent.putExtra("android.intent.extra.TEXT", this.f3143a.getString(R.string.sharetext));
            this.f3143a.startActivity(Intent.createChooser(intent, "Share App via"));
        }

        @JavascriptInterface
        public void showAboutDialog() {
            MainActivity.this.mo4578o();
        }

        @JavascriptInterface
        public void showAboutDialog(String str, String str2, String str3) {
            MainActivity.this.mo4573a(str, str2, str3);
        }

        @JavascriptInterface
        public void showToast(String str) {
            Toast.makeText(this.f3143a, str, 0).show();
        }
    }

    /* renamed from: a */
    public static final String m4956a(String str) {
        String str2 = str + "00110011";
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str2.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m4957a(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private String m4959b(int i) {
        InputStream openRawResource = getResources().openRawResource(i);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, "UTF-8"));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringWriter.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m4961b(String str) {
        Intent intent;
        if (str.startsWith("market://")) {
            try {
                this.f3105m.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        if (str.startsWith("tel:")) {
            intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
        } else if (str.startsWith("exit:")) {
            finish();
            return true;
        } else if (str.startsWith("intent://") && str.contains("scheme=http")) {
            Matcher matcher = Pattern.compile("intent://(.*?)#").matcher(Uri.decode(str));
            if (!matcher.find()) {
                return false;
            }
            String group = matcher.group(1);
            intent = new Intent("android.intent.action.VIEW", Uri.parse("http://" + group));
        } else if (str.startsWith("whatsapp:") || str.startsWith("skype:") || str.startsWith("geo:0,0?q=") || str.startsWith("maps:")) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        } else if (str.startsWith("sms:")) {
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else if (str.startsWith("mailto:")) {
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else if (!str.contains("#___external")) {
            return false;
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
        startActivity(intent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m4964c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("android.permission.");
        sb.append(str);
        return checkCallingOrSelfPermission(sb.toString()) == 0;
    }

    /* renamed from: t */
    private Boolean m4971t() {
        if (this.f3111s.getPackageName().equalsIgnoreCase("com.goyal.website2apk")) {
            return false;
        }
        if (getString(R.string.csum).toUpperCase().substring(16, 32).equals(m4976y())) {
            return true;
        }
        Date u = m4972u();
        String installerPackageName = this.f3111s.getPackageManager().getInstallerPackageName(this.f3111s.getPackageName());
        if ((new Date().getTime() - u.getTime()) / 86400000 > 30 && installerPackageName != null && !installerPackageName.equals("com.google.android.packageinstaller")) {
            this.f3107o = "https://websitetoapk.com/" + new StringBuffer("ptset/tsetppa").reverse().toString() + ".html";
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(getResources().getBoolean(R.bool.isDebugMode));
            }
        }
        return false;
    }

    /* renamed from: u */
    private Date m4972u() {
        Date date = new Date(Long.parseLong("1632928318556"));
        try {
            ZipFile zipFile = new ZipFile(getPackageManager().getApplicationInfo(getPackageName(), 0).sourceDir);
            Date date2 = new Date(zipFile.getEntry("classes.dex").getTime());
            try {
                zipFile.close();
                return date2;
            } catch (Exception unused) {
                return date2;
            }
        } catch (Exception unused2) {
            return date;
        }
    }

    /* renamed from: v */
    private void m4973v() {
        if (getResources().getBoolean(R.bool.enableNavDrawer)) {
            this.f3104l = (NavigationView) findViewById(R.id.nav_view);
            Menu menu = this.f3104l.getMenu();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(new String(this.f3115w.mo4633a(m4959b((int) R.raw.datx))));
            } catch (Exception e) {
                Toast.makeText(this.f3111s, e.getMessage(), 0).show();
            }
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    menu.add(0, i, 0, jSONArray.getJSONObject(i).getString("title"));
                    i++;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            if (getResources().getBoolean(R.bool.showAboutInNav)) {
                int length = jSONArray.length();
                menu.add(1, length + 1, 0, "Share App");
                menu.add(1, length + 2, 0, "Rate Us");
                menu.add(1, length + 3, 0, "About Us");
                menu.add(1, length + 4, 0, "Exit");
            }
            this.f3104l.invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public File m4974w() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return File.createTempFile("img_" + format + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public String m4975x() {
        return m4956a(getPackageName()).toUpperCase().substring(0, 16);
    }

    /* renamed from: y */
    private String m4976y() {
        return m4956a(getString(R.string.devid) + getPackageName()).toUpperCase().substring(16, 32);
    }

    /* renamed from: a */
    public void mo4572a(WebView webView) {
        Context applicationContext;
        String str;
        if (Build.VERSION.SDK_INT >= 19) {
            PrintDocumentAdapter createPrintDocumentAdapter = webView.createPrintDocumentAdapter();
            PrintAttributes.Builder builder = new PrintAttributes.Builder();
            builder.setMediaSize(PrintAttributes.MediaSize.ISO_A5);
            PrintJob print = ((PrintManager) getSystemService("print")).print(getString(R.string.app_name) + " Document", createPrintDocumentAdapter, builder.build());
            if (print.isCompleted()) {
                applicationContext = getApplicationContext();
                str = "Print Completed";
            } else if (print.isFailed()) {
                applicationContext = getApplicationContext();
                str = "Print Failed";
            } else {
                return;
            }
            Toast.makeText(applicationContext, str, 1).show();
        }
    }

    /* renamed from: a */
    public void mo4573a(String str, String str2, String str3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setTitle(str2);
        builder.setPositiveButton(str3, (DialogInterface.OnClickListener) null);
        builder.setCancelable(true);
        if (!((Activity) this.f3111s).isFinishing()) {
            builder.create().show();
        }
    }

    /* renamed from: a */
    public boolean mo550a(MenuItem menuItem) {
        this.f3112t.mo1872f(8388611);
        int itemId = menuItem.getItemId();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray = new JSONArray(new String(this.f3115w.mo4633a(m4959b((int) R.raw.datx))));
        } catch (Exception unused) {
            Toast.makeText(this.f3111s, "Error Occured while initializing nav menu", 0).show();
        }
        try {
            int length = jSONArray.length();
            if (itemId == length + 4) {
                mo4577n();
                return true;
            } else if (itemId == length + 3) {
                mo4578o();
                return true;
            } else if (itemId == length + 2) {
                mo4582q();
                return true;
            } else if (itemId == length + 1) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.sharesubject));
                intent.putExtra("android.intent.extra.TEXT", getString(R.string.sharetext));
                startActivity(Intent.createChooser(intent, "Share via"));
                return true;
            } else {
                this.f3105m.loadUrl(jSONArray.getJSONObject(itemId).getString("url"));
                this.f3104l.setCheckedItem(itemId);
                menuItem.setCheckable(true);
                return true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    public void mo4574k() {
        int i;
        if (!getResources().getBoolean(R.bool.fullscr)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(1024, 1024);
            return;
        }
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 19) {
            i = 1796;
        } else if (Build.VERSION.SDK_INT >= 19) {
            i = 3332;
        } else {
            return;
        }
        decorView.setSystemUiVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo4575l() {
        return Build.VERSION.SDK_INT > 23;
    }

    /* access modifiers changed from: protected */
    @TargetApi(23)
    /* renamed from: m */
    public void mo4576m() {
        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.CAMERA"}, 200);
    }

    /* renamed from: n */
    public void mo4577n() {
        if (getResources().getBoolean(R.bool.confexit)) {
            new AlertDialog.Builder(this).setTitle(R.string.cnfExit).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.finish();
                }
            }).create().show();
        } else {
            finish();
        }
    }

    /* renamed from: o */
    public void mo4578o() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.tag);
        builder.setTitle(R.string.aboutTitle);
        builder.setPositiveButton("OK", (DialogInterface.OnClickListener) null);
        builder.setCancelable(true);
        if (!((Activity) this.f3111s).isFinishing()) {
            builder.create().show();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        super.onActivityResult(i, i2, intent);
        if (Build.VERSION.SDK_INT >= 21) {
            if (i2 == -1 && i == 1) {
                if (this.f3100C != null) {
                    if (intent == null) {
                        String str = this.f3098A;
                        if (str != null) {
                            uriArr = new Uri[]{Uri.parse(str)};
                            this.f3100C.onReceiveValue(uriArr);
                            this.f3100C = null;
                        }
                    } else {
                        String dataString = intent.getDataString();
                        if (dataString != null) {
                            uriArr = new Uri[]{Uri.parse(dataString)};
                            this.f3100C.onReceiveValue(uriArr);
                            this.f3100C = null;
                        }
                    }
                } else {
                    return;
                }
            }
            uriArr = null;
            this.f3100C.onReceiveValue(uriArr);
            this.f3100C = null;
        } else if (i == 1 && this.f3099B != null) {
            this.f3099B.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
            this.f3099B = null;
        }
    }

    public void onBackPressed() {
        if (!this.f3116x.booleanValue() && this.f3105m.canGoBack()) {
            this.f3105m.goBack();
            this.f3116x = true;
        } else {
            mo4577n();
        }
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.f3116x = false;
            }
        }, 200);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(R.bool.flag_secure)) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView((int) R.layout.activity_main);
        this.f3105m = (WebView) findViewById(R.id.webView);
        this.f3106n = (ImageView) findViewById(R.id.imageView);
        this.f3101D = (FrameLayout) findViewById(R.id.customViewContainer);
        this.f3115w = new C0939a(m4956a(getString(R.string.devid)).substring(0, 16), getString(R.string.devid).substring(0, 16));
        this.f3117y = (SwipeRefreshLayout) findViewById(R.id.swiperefresh_items);
        this.f3117y.setColorSchemeColors(-16776961, -65536, -16711936);
        this.f3112t = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.f3114v = (Toolbar) findViewById(R.id.toolbar);
        mo2279a(this.f3114v);
        mo2288g().mo2236b(getResources().getBoolean(R.bool.enableNavDrawer));
        mo2288g().mo2232a(getResources().getBoolean(R.bool.enableNavDrawer));
        this.f3113u = new C0554b(this, this.f3112t, R.string.app_name, R.string.app_name) {
            /* renamed from: a */
            public void mo1909a(View view) {
            }

            /* renamed from: b */
            public void mo1911b(View view) {
            }
        };
        this.f3112t.setDrawerListener(this.f3113u);
        this.f3113u.mo2252a();
        m4973v();
        ((NavigationView) findViewById(R.id.nav_view)).setNavigationItemSelectedListener(this);
        this.f3111s = this;
        this.f3109q = (ProgressBar) findViewById(R.id.progressBar);
        if (!getResources().getBoolean(R.bool.defaultProgressBar)) {
            this.f3109q.setIndeterminateDrawable(getResources().getDrawable(R.drawable.spinr));
        }
        final Boolean valueOf = Boolean.valueOf(getResources().getBoolean(R.bool.extlink));
        final String substring = getString(R.string.csum).toUpperCase().substring(0, 16);
        WebSettings settings = this.f3105m.getSettings();
        if (mo4575l()) {
            mo4576m();
        }
        mo4574k();
        if (getResources().getBoolean(R.bool.desktopMode)) {
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
        }
        if (getResources().getBoolean(R.bool.hideMobileUserAgent)) {
            settings.setUserAgentString(settings.getUserAgentString().replace("Mobile", "").replace("Android", ""));
        }
        this.f3107o = "https://hidrosystem1.000webhostapp.com";
        if (m4971t().booleanValue()) {
            try {
                this.f3107o = new String(this.f3115w.mo4633a(m4959b((int) R.raw.uri)));
            } catch (Exception unused) {
                this.f3107o = "";
                Toast.makeText(this.f3111s, "Some error occurred at runtime!", 0).show();
            }
        }
        try {
            this.f3108p = new URL(this.f3107o).getHost();
        } catch (Exception unused2) {
            this.f3108p = "Error";
        }
        this.f3105m.setVisibility(8);
        this.f3106n.setVisibility(0);
        if (!getResources().getBoolean(R.bool.enableToolBar)) {
            this.f3114v.setVisibility(8);
        }
        if (!getResources().getBoolean(R.bool.enableNavDrawer)) {
            this.f3112t.setDrawerLockMode(1);
        }
        this.f3117y.setEnabled(getResources().getBoolean(R.bool.enablePullRefresh));
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.f3106n.setVisibility(8);
                MainActivity.this.f3105m.setVisibility(0);
                if (!substring.equals(MainActivity.this.m4975x())) {
                    MainActivity.this.mo4573a("This app is created using an unauthorized copy of 'Website 2 APK Builder Pro' Software.", "Unauthorized App", "Shame on me!");
                }
            }
        }, (long) getResources().getInteger(R.integer.duration));
        settings.setAppCacheEnabled(true);
        if (getString(R.string.CacheMode).equals("NoCache")) {
            settings.setCacheMode(2);
        } else if (getString(R.string.CacheMode).equals("HighCache")) {
            settings.setCacheMode(1);
        } else {
            settings.setCacheMode(-1);
        }
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3105m.setLayerType(2, (Paint) null);
        }
        settings.setAppCachePath("/data/data" + getPackageName() + "/cache");
        this.f3105m.setScrollBarStyle(33554432);
        settings.setSaveFormData(getResources().getBoolean(R.bool.SaveFormData));
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(getApplicationContext().getDir("database", 0).getPath());
        settings.setDomStorageEnabled(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        this.f3105m.setHapticFeedbackEnabled(true);
        this.f3105m.setHorizontalScrollBarEnabled(getResources().getBoolean(R.bool.ScrollBars));
        this.f3105m.setVerticalScrollBarEnabled(getResources().getBoolean(R.bool.ScrollBars));
        this.f3105m.setLongClickable(true);
        if (getResources().getBoolean(R.bool.hideWebView)) {
            this.f3105m.getSettings().setUserAgentString(this.f3105m.getSettings().getUserAgentString().replace("wv", ""));
        }
        settings.setGeolocationEnabled(true);
        if (getResources().getBoolean(R.bool.askGPS)) {
            mo4581p();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(getResources().getBoolean(R.bool.isDebugMode));
        }
        if (getResources().getBoolean(R.bool.enableJsApi)) {
            this.f3105m.addJavascriptInterface(new C0935a(this), "Website2APK");
        }
        this.f3105m.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return !MainActivity.this.getResources().getBoolean(R.bool.TextSelection);
            }
        });
        settings.setAllowFileAccess(getResources().getBoolean(R.bool.allow_file_access));
        if (Build.VERSION.SDK_INT >= 16) {
            Boolean valueOf2 = Boolean.valueOf(getResources().getBoolean(R.bool.allow_x_origin_from_file));
            settings.setAllowFileAccessFromFileURLs(valueOf2.booleanValue());
            settings.setAllowUniversalAccessFromFileURLs(valueOf2.booleanValue());
        }
        this.f3105m.loadUrl(this.f3107o);
        this.f3105m.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (MainActivity.this.f3105m.getRootView().getHeight() - MainActivity.this.f3105m.getHeight() < 100) {
                    MainActivity.this.mo4574k();
                }
            }
        });
        this.f3105m.setScrollBarStyle(33554432);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(getResources().getBoolean(R.bool.gestureZoom));
        settings.setDisplayZoomControls(getResources().getBoolean(R.bool.Zoom));
        CookieManager.setAcceptFileSchemeCookies(true);
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.acceptCookie();
        CookieSyncManager.createInstance(this.f3111s);
        if (Build.VERSION.SDK_INT > 21) {
            instance.setAcceptThirdPartyCookies(this.f3105m, true);
        }
        if (Build.VERSION.SDK_INT > 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (bundle != null) {
            this.f3105m.restoreState(bundle);
        }
        this.f3110r = new WebChromeClient() {

            /* renamed from: b */
            private View f3130b;

            public View getVideoLoadingProgressView() {
                if (this.f3130b == null) {
                    this.f3130b = LayoutInflater.from(MainActivity.this).inflate(R.layout.video_progress, (ViewGroup) null);
                }
                return this.f3130b;
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                onConsoleMessage(consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId());
                return true;
            }

            public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
                quotaUpdater.updateQuota(j2 * 2);
            }

            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                callback.invoke(str, true, false);
            }

            public void onHideCustomView() {
                super.onHideCustomView();
                if (MainActivity.this.f3103F != null) {
                    MainActivity.this.f3105m.setVisibility(0);
                    MainActivity.this.f3101D.setVisibility(8);
                    MainActivity.this.f3103F.setVisibility(8);
                    MainActivity.this.getWindow().clearFlags(128);
                    MainActivity.this.f3101D.removeView(MainActivity.this.f3103F);
                    MainActivity.this.f3102E.onCustomViewHidden();
                    View unused = MainActivity.this.f3103F = null;
                }
            }

            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                new AlertDialog.Builder(MainActivity.this).setTitle(MainActivity.this.getString(R.string.app_name)).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setCancelable(false).create().show();
                return true;
            }

            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                new AlertDialog.Builder(MainActivity.this.f3111s).setTitle(MainActivity.this.getString(R.string.app_name)).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.cancel();
                    }
                }).create().show();
                return true;
            }

            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (Build.VERSION.SDK_INT > 21) {
                    permissionRequest.grant(permissionRequest.getResources());
                }
            }

            public void onProgressChanged(WebView webView, int i) {
                if (i < 100 && MainActivity.this.f3109q.getVisibility() == 8) {
                    MainActivity.this.f3109q.setVisibility(0);
                }
                MainActivity.this.f3109q.setProgress(i);
                if (i == 100) {
                    MainActivity.this.f3109q.setVisibility(8);
                    if (MainActivity.this.f3117y.mo1999b()) {
                        MainActivity.this.f3117y.setRefreshing(false);
                    }
                }
            }

            public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
                onShowCustomView(view, customViewCallback);
            }

            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (MainActivity.this.f3103F != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                View unused = MainActivity.this.f3103F = view;
                MainActivity.this.f3105m.setVisibility(8);
                MainActivity.this.f3101D.setVisibility(0);
                MainActivity.this.getWindow().addFlags(128);
                MainActivity.this.f3101D.addView(view);
                WebChromeClient.CustomViewCallback unused2 = MainActivity.this.f3102E = customViewCallback;
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onShowFileChooser(android.webkit.WebView r4, android.webkit.ValueCallback<android.net.Uri[]> r5, android.webkit.WebChromeClient.FileChooserParams r6) {
                /*
                    r3 = this;
                    com.goyal.website2apk.MainActivity r4 = com.goyal.website2apk.MainActivity.this
                    android.webkit.ValueCallback r4 = r4.f3100C
                    r6 = 0
                    if (r4 == 0) goto L_0x0012
                    com.goyal.website2apk.MainActivity r4 = com.goyal.website2apk.MainActivity.this
                    android.webkit.ValueCallback r4 = r4.f3100C
                    r4.onReceiveValue(r6)
                L_0x0012:
                    com.goyal.website2apk.MainActivity r4 = com.goyal.website2apk.MainActivity.this
                    android.webkit.ValueCallback unused = r4.f3100C = r5
                    android.content.Intent r4 = new android.content.Intent
                    java.lang.String r5 = "android.media.action.IMAGE_CAPTURE"
                    r4.<init>(r5)
                    com.goyal.website2apk.MainActivity r5 = com.goyal.website2apk.MainActivity.this
                    android.content.pm.PackageManager r5 = r5.getPackageManager()
                    android.content.ComponentName r5 = r4.resolveActivity(r5)
                    if (r5 == 0) goto L_0x0070
                    com.goyal.website2apk.MainActivity r5 = com.goyal.website2apk.MainActivity.this     // Catch:{ IOException -> 0x003e }
                    java.io.File r5 = r5.m4974w()     // Catch:{ IOException -> 0x003e }
                    java.lang.String r0 = "PhotoPath"
                    com.goyal.website2apk.MainActivity r1 = com.goyal.website2apk.MainActivity.this     // Catch:{ IOException -> 0x003c }
                    java.lang.String r1 = r1.f3098A     // Catch:{ IOException -> 0x003c }
                    r4.putExtra(r0, r1)     // Catch:{ IOException -> 0x003c }
                    goto L_0x0049
                L_0x003c:
                    r0 = move-exception
                    goto L_0x0040
                L_0x003e:
                    r0 = move-exception
                    r5 = r6
                L_0x0040:
                    java.lang.String r1 = com.goyal.website2apk.MainActivity.f3097z
                    java.lang.String r2 = "Image file creation failed"
                    android.util.Log.e(r1, r2, r0)
                L_0x0049:
                    if (r5 == 0) goto L_0x006f
                    com.goyal.website2apk.MainActivity r6 = com.goyal.website2apk.MainActivity.this
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "file:"
                    r0.append(r1)
                    java.lang.String r1 = r5.getAbsolutePath()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String unused = r6.f3098A = r0
                    java.lang.String r6 = "output"
                    android.net.Uri r5 = android.net.Uri.fromFile(r5)
                    r4.putExtra(r6, r5)
                    goto L_0x0070
                L_0x006f:
                    r4 = r6
                L_0x0070:
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.String r6 = "android.intent.action.GET_CONTENT"
                    r5.<init>(r6)
                    java.lang.String r6 = "android.intent.category.OPENABLE"
                    r5.addCategory(r6)
                    java.lang.String r6 = "*/*"
                    r5.setType(r6)
                    android.content.Intent r6 = new android.content.Intent
                    java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
                    r6.<init>(r0)
                    r0 = 0
                    r1 = 1
                    if (r4 == 0) goto L_0x0094
                    r2 = 2
                    android.content.Intent[] r2 = new android.content.Intent[r2]
                    r2[r0] = r4
                    r2[r1] = r6
                    goto L_0x0096
                L_0x0094:
                    android.content.Intent[] r2 = new android.content.Intent[r0]
                L_0x0096:
                    android.content.Intent r4 = new android.content.Intent
                    java.lang.String r6 = "android.intent.action.CHOOSER"
                    r4.<init>(r6)
                    java.lang.String r6 = "android.intent.extra.INTENT"
                    r4.putExtra(r6, r5)
                    java.lang.String r5 = "android.intent.extra.TITLE"
                    java.lang.String r6 = "Choose File"
                    r4.putExtra(r5, r6)
                    java.lang.String r5 = "android.intent.extra.INITIAL_INTENTS"
                    r4.putExtra(r5, r2)
                    com.goyal.website2apk.MainActivity r5 = com.goyal.website2apk.MainActivity.this
                    r5.startActivityForResult(r4, r1)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.goyal.website2apk.MainActivity.C09288.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
            }
        };
        this.f3105m.setWebChromeClient(this.f3110r);
        this.f3105m.setWebViewClient(new WebViewClient() {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Boolean mo4607a(String str) {
                if (valueOf.booleanValue()) {
                    return Boolean.valueOf(MainActivity.this.m4961b(str));
                }
                if (MainActivity.this.m4961b(str)) {
                    return true;
                }
                if (str.contains(MainActivity.this.f3108p)) {
                    return false;
                }
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }

            public void onPageFinished(WebView webView, String str) {
                CookieSyncManager.getInstance().sync();
                if (MainActivity.this.getResources().getBoolean(R.bool.enableLiveTitle)) {
                    MainActivity.this.f3114v.setTitle((CharSequence) webView.getTitle());
                }
                super.onPageFinished(webView, str);
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                if (MainActivity.this.getResources().getBoolean(R.bool.isDebugMode)) {
                    Context applicationContext = MainActivity.this.getApplicationContext();
                    Toast.makeText(applicationContext, i + str + str2, 0).show();
                }
                webView.loadUrl("file:///android_asset/404r.html");
            }

            public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
                if (MainActivity.this.getResources().getBoolean(R.bool.isDebugMode)) {
                    Toast.makeText(MainActivity.this.getApplicationContext(), sslError.getPrimaryError(), 0).show();
                }
                AlertDialog create = new AlertDialog.Builder(MainActivity.this).create();
                String str = "SSL Certificate error.";
                switch (sslError.getPrimaryError()) {
                    case 0:
                        str = "The certificate is not yet valid.";
                        break;
                    case 1:
                        str = "The certificate has expired.";
                        break;
                    case 2:
                        str = "The certificate hostname mismatch.";
                        break;
                    case 3:
                        str = "The certificate authority is not trusted.";
                        break;
                    case 4:
                        str = "The date of the certificate is invalid";
                        break;
                }
                create.setTitle("SSL Certificate Error");
                create.setMessage(str + " Do you want to continue anyway?");
                create.setButton(-1, "OK, Continue", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        sslErrorHandler.proceed();
                    }
                });
                create.setButton(-2, "Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        sslErrorHandler.cancel();
                    }
                });
                create.show();
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                super.shouldOverrideUrlLoading(webView, str);
                if (mo4607a(str).booleanValue()) {
                    return true;
                }
                webView.loadUrl(str);
                return false;
            }
        });
        this.f3105m.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (MainActivity.this.m4964c("WRITE_EXTERNAL_STORAGE")) {
                    try {
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                        request.setMimeType(str4);
                        request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
                        request.addRequestHeader("User-Agent", str2);
                        request.setDescription("Downloading file...");
                        request.setTitle(URLUtil.guessFileName(str, str3, str4));
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(1);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str, str3, str4));
                        ((DownloadManager) MainActivity.this.getSystemService("download")).enqueue(request);
                        Toast.makeText(MainActivity.this.getApplicationContext(), "Downloading File", 1).show();
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this.getApplicationContext(), e.getMessage(), 0).show();
                    }
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    MainActivity.this.startActivity(intent);
                }
            }
        });
        this.f3117y.setOnRefreshListener(new SwipeRefreshLayout.C0479b() {
            /* renamed from: a */
            public void mo2046a() {
                MainActivity.this.f3105m.reload();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_home).setVisible(getResources().getBoolean(R.bool.showHomeBtn));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f3113u.mo2254a(menuItem)) {
            return true;
        }
        int itemId = menuItem.getItemId();
        Intent intent = new Intent("android.intent.action.SEND");
        if (itemId == R.id.action_exit) {
            mo4577n();
            return true;
        } else if (itemId == R.id.action_tag) {
            mo4578o();
            return true;
        } else if (itemId == R.id.rate_us) {
            mo4582q();
            return true;
        } else if (itemId == R.id.action_share) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.sharesubject));
            intent.putExtra("android.intent.extra.TEXT", getString(R.string.sharetext));
            startActivity(Intent.createChooser(intent, "Share via"));
            return true;
        } else {
            if (itemId == R.id.action_home) {
                this.f3105m.loadUrl(this.f3107o);
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onPause() {
        CookieSyncManager.getInstance().stopSync();
        this.f3105m.onPause();
        super.onPause();
    }

    public void onResume() {
        mo4574k();
        CookieSyncManager.getInstance().startSync();
        this.f3105m.onResume();
        super.onResume();
    }

    /* renamed from: p */
    public void mo4581p() {
        if (!m4957a(this.f3111s)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f3111s);
            builder.setTitle("Enable GPS");
            builder.setMessage("GPS is disabled. Do you want to enable it?");
            builder.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.f3111s.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
        }
    }

    /* renamed from: q */
    public void mo4582q() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f3111s.getPackageName()));
        intent.addFlags(1207959552);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f3111s.getPackageName())));
        }
    }

    /* renamed from: r */
    public String mo4583r() {
        return Settings.Secure.getString(this.f3111s.getContentResolver(), "android_id");
    }
}
