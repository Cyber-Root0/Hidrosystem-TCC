package android.support.p020v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.widget.NestedScrollView;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.widget.C0767ao;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    private boolean f1387A = false;

    /* renamed from: B */
    private CharSequence f1388B;

    /* renamed from: C */
    private CharSequence f1389C;

    /* renamed from: D */
    private CharSequence f1390D;

    /* renamed from: E */
    private int f1391E = 0;

    /* renamed from: F */
    private Drawable f1392F;

    /* renamed from: G */
    private ImageView f1393G;

    /* renamed from: H */
    private TextView f1394H;

    /* renamed from: I */
    private TextView f1395I;

    /* renamed from: J */
    private View f1396J;

    /* renamed from: K */
    private int f1397K;

    /* renamed from: L */
    private int f1398L;

    /* renamed from: M */
    private boolean f1399M;

    /* renamed from: N */
    private int f1400N = 0;

    /* renamed from: O */
    private final View.OnClickListener f1401O = new View.OnClickListener() {
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                android.support.v7.app.AlertController r0 = android.support.p020v7.app.AlertController.this
                android.widget.Button r0 = r0.f1404c
                if (r3 != r0) goto L_0x0015
                android.support.v7.app.AlertController r0 = android.support.p020v7.app.AlertController.this
                android.os.Message r0 = r0.f1405d
                if (r0 == 0) goto L_0x0015
                android.support.v7.app.AlertController r3 = android.support.p020v7.app.AlertController.this
                android.os.Message r3 = r3.f1405d
            L_0x0010:
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0038
            L_0x0015:
                android.support.v7.app.AlertController r0 = android.support.p020v7.app.AlertController.this
                android.widget.Button r0 = r0.f1406e
                if (r3 != r0) goto L_0x0026
                android.support.v7.app.AlertController r0 = android.support.p020v7.app.AlertController.this
                android.os.Message r0 = r0.f1407f
                if (r0 == 0) goto L_0x0026
                android.support.v7.app.AlertController r3 = android.support.p020v7.app.AlertController.this
                android.os.Message r3 = r3.f1407f
                goto L_0x0010
            L_0x0026:
                android.support.v7.app.AlertController r0 = android.support.p020v7.app.AlertController.this
                android.widget.Button r0 = r0.f1408g
                if (r3 != r0) goto L_0x0037
                android.support.v7.app.AlertController r3 = android.support.p020v7.app.AlertController.this
                android.os.Message r3 = r3.f1409h
                if (r3 == 0) goto L_0x0037
                android.support.v7.app.AlertController r3 = android.support.p020v7.app.AlertController.this
                android.os.Message r3 = r3.f1409h
                goto L_0x0010
            L_0x0037:
                r3 = 0
            L_0x0038:
                if (r3 == 0) goto L_0x003d
                r3.sendToTarget()
            L_0x003d:
                android.support.v7.app.AlertController r3 = android.support.p020v7.app.AlertController.this
                android.os.Handler r3 = r3.f1417p
                r0 = 1
                android.support.v7.app.AlertController r1 = android.support.p020v7.app.AlertController.this
                android.support.v7.app.n r1 = r1.f1402a
                android.os.Message r3 = r3.obtainMessage(r0, r1)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.AlertController.C05371.onClick(android.view.View):void");
        }
    };

    /* renamed from: a */
    final C0597n f1402a;

    /* renamed from: b */
    ListView f1403b;

    /* renamed from: c */
    Button f1404c;

    /* renamed from: d */
    Message f1405d;

    /* renamed from: e */
    Button f1406e;

    /* renamed from: f */
    Message f1407f;

    /* renamed from: g */
    Button f1408g;

    /* renamed from: h */
    Message f1409h;

    /* renamed from: i */
    NestedScrollView f1410i;

    /* renamed from: j */
    ListAdapter f1411j;

    /* renamed from: k */
    int f1412k = -1;

    /* renamed from: l */
    int f1413l;

    /* renamed from: m */
    int f1414m;

    /* renamed from: n */
    int f1415n;

    /* renamed from: o */
    int f1416o;

    /* renamed from: p */
    Handler f1417p;

    /* renamed from: q */
    private final Context f1418q;

    /* renamed from: r */
    private final Window f1419r;

    /* renamed from: s */
    private CharSequence f1420s;

    /* renamed from: t */
    private CharSequence f1421t;

    /* renamed from: u */
    private View f1422u;

    /* renamed from: v */
    private int f1423v;

    /* renamed from: w */
    private int f1424w;

    /* renamed from: x */
    private int f1425x;

    /* renamed from: y */
    private int f1426y;

    /* renamed from: z */
    private int f1427z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f1441a;

        /* renamed from: b */
        private final int f1442b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0526a.C0536j.RecycleListView);
            this.f1442b = obtainStyledAttributes.getDimensionPixelOffset(C0526a.C0536j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1441a = obtainStyledAttributes.getDimensionPixelOffset(C0526a.C0536j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo2214a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1441a, getPaddingRight(), z2 ? getPaddingBottom() : this.f1442b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0542a {

        /* renamed from: A */
        public int f1443A;

        /* renamed from: B */
        public boolean f1444B = false;

        /* renamed from: C */
        public boolean[] f1445C;

        /* renamed from: D */
        public boolean f1446D;

        /* renamed from: E */
        public boolean f1447E;

        /* renamed from: F */
        public int f1448F = -1;

        /* renamed from: G */
        public DialogInterface.OnMultiChoiceClickListener f1449G;

        /* renamed from: H */
        public Cursor f1450H;

        /* renamed from: I */
        public String f1451I;

        /* renamed from: J */
        public String f1452J;

        /* renamed from: K */
        public AdapterView.OnItemSelectedListener f1453K;

        /* renamed from: L */
        public C0547a f1454L;

        /* renamed from: M */
        public boolean f1455M = true;

        /* renamed from: a */
        public final Context f1456a;

        /* renamed from: b */
        public final LayoutInflater f1457b;

        /* renamed from: c */
        public int f1458c = 0;

        /* renamed from: d */
        public Drawable f1459d;

        /* renamed from: e */
        public int f1460e = 0;

        /* renamed from: f */
        public CharSequence f1461f;

        /* renamed from: g */
        public View f1462g;

        /* renamed from: h */
        public CharSequence f1463h;

        /* renamed from: i */
        public CharSequence f1464i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f1465j;

        /* renamed from: k */
        public CharSequence f1466k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f1467l;

        /* renamed from: m */
        public CharSequence f1468m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1469n;

        /* renamed from: o */
        public boolean f1470o;

        /* renamed from: p */
        public DialogInterface.OnCancelListener f1471p;

        /* renamed from: q */
        public DialogInterface.OnDismissListener f1472q;

        /* renamed from: r */
        public DialogInterface.OnKeyListener f1473r;

        /* renamed from: s */
        public CharSequence[] f1474s;

        /* renamed from: t */
        public ListAdapter f1475t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f1476u;

        /* renamed from: v */
        public int f1477v;

        /* renamed from: w */
        public View f1478w;

        /* renamed from: x */
        public int f1479x;

        /* renamed from: y */
        public int f1480y;

        /* renamed from: z */
        public int f1481z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0547a {
            /* renamed from: a */
            void mo2221a(ListView listView);
        }

        public C0542a(Context context) {
            this.f1456a = context;
            this.f1470o = true;
            this.f1457b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m2458b(final android.support.p020v7.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f1457b
                int r1 = r12.f1413l
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p020v7.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f1446D
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f1450H
                if (r4 != 0) goto L_0x0026
                android.support.v7.app.AlertController$a$1 r9 = new android.support.v7.app.AlertController$a$1
                android.content.Context r3 = r11.f1456a
                int r4 = r12.f1414m
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f1474s
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                android.support.v7.app.AlertController$a$2 r9 = new android.support.v7.app.AlertController$a$2
                android.content.Context r3 = r11.f1456a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f1447E
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f1415n
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f1416o
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f1450H
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f1456a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f1451I
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f1475t
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r2 = r11.f1456a
                java.lang.CharSequence[] r3 = r11.f1474s
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                android.support.v7.app.AlertController$a$a r1 = r11.f1454L
                if (r1 == 0) goto L_0x006e
                r1.mo2221a(r0)
            L_0x006e:
                r12.f1411j = r9
                int r1 = r11.f1448F
                r12.f1412k = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f1476u
                if (r1 == 0) goto L_0x0081
                android.support.v7.app.AlertController$a$3 r1 = new android.support.v7.app.AlertController$a$3
                r1.<init>(r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f1449G
                if (r1 == 0) goto L_0x008b
                android.support.v7.app.AlertController$a$4 r1 = new android.support.v7.app.AlertController$a$4
                r1.<init>(r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f1453K
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f1447E
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f1446D
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f1403b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p020v7.app.AlertController.C0542a.m2458b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo2215a(AlertController alertController) {
            View view = this.f1462g;
            if (view != null) {
                alertController.mo2204b(view);
            } else {
                CharSequence charSequence = this.f1461f;
                if (charSequence != null) {
                    alertController.mo2201a(charSequence);
                }
                Drawable drawable = this.f1459d;
                if (drawable != null) {
                    alertController.mo2199a(drawable);
                }
                int i = this.f1458c;
                if (i != 0) {
                    alertController.mo2203b(i);
                }
                int i2 = this.f1460e;
                if (i2 != 0) {
                    alertController.mo2203b(alertController.mo2207c(i2));
                }
            }
            CharSequence charSequence2 = this.f1463h;
            if (charSequence2 != null) {
                alertController.mo2205b(charSequence2);
            }
            CharSequence charSequence3 = this.f1464i;
            if (charSequence3 != null) {
                alertController.mo2198a(-1, charSequence3, this.f1465j, (Message) null);
            }
            CharSequence charSequence4 = this.f1466k;
            if (charSequence4 != null) {
                alertController.mo2198a(-2, charSequence4, this.f1467l, (Message) null);
            }
            CharSequence charSequence5 = this.f1468m;
            if (charSequence5 != null) {
                alertController.mo2198a(-3, charSequence5, this.f1469n, (Message) null);
            }
            if (!(this.f1474s == null && this.f1450H == null && this.f1475t == null)) {
                m2458b(alertController);
            }
            View view2 = this.f1478w;
            if (view2 == null) {
                int i3 = this.f1477v;
                if (i3 != 0) {
                    alertController.mo2197a(i3);
                }
            } else if (this.f1444B) {
                alertController.mo2200a(view2, this.f1479x, this.f1480y, this.f1481z, this.f1443A);
            } else {
                alertController.mo2208c(view2);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0548b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1494a;

        public C0548b(DialogInterface dialogInterface) {
            this.f1494a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1494a.get(), message.what);
                        return;
                    default:
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0549c extends ArrayAdapter<CharSequence> {
        public C0549c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0597n nVar, Window window) {
        this.f1418q = context;
        this.f1402a = nVar;
        this.f1419r = window;
        this.f1417p = new C0548b(nVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0526a.C0536j.AlertDialog, C0526a.C0527a.alertDialogStyle, 0);
        this.f1397K = obtainStyledAttributes.getResourceId(C0526a.C0536j.AlertDialog_android_layout, 0);
        this.f1398L = obtainStyledAttributes.getResourceId(C0526a.C0536j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1413l = obtainStyledAttributes.getResourceId(C0526a.C0536j.AlertDialog_listLayout, 0);
        this.f1414m = obtainStyledAttributes.getResourceId(C0526a.C0536j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1415n = obtainStyledAttributes.getResourceId(C0526a.C0536j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1416o = obtainStyledAttributes.getResourceId(C0526a.C0536j.AlertDialog_listItemLayout, 0);
        this.f1399M = obtainStyledAttributes.getBoolean(C0526a.C0536j.AlertDialog_showTitle, true);
        obtainStyledAttributes.recycle();
        nVar.mo2398a(1);
    }

    /* renamed from: a */
    private ViewGroup m2431a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m2432a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m2433a(ViewGroup viewGroup) {
        View view = this.f1422u;
        boolean z = false;
        if (view == null) {
            view = this.f1423v != 0 ? LayoutInflater.from(this.f1418q).inflate(this.f1423v, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m2437a(view)) {
            this.f1419r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1419r.findViewById(C0526a.C0532f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1387A) {
                frameLayout.setPadding(this.f1424w, this.f1425x, this.f1426y, this.f1427z);
            }
            if (this.f1403b != null) {
                ((C0767ao.C0768a) viewGroup.getLayoutParams()).f2537g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m2434a(ViewGroup viewGroup, View view, int i, int i2) {
        final View findViewById = this.f1419r.findViewById(C0526a.C0532f.scrollIndicatorUp);
        View findViewById2 = this.f1419r.findViewById(C0526a.C0532f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0388q.m1640a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        final View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f1421t != null) {
                this.f1410i.setOnScrollChangeListener(new NestedScrollView.C0467b() {
                    /* renamed from: a */
                    public void mo1987a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m2432a(nestedScrollView, findViewById, view2);
                    }
                });
                this.f1410i.post(new Runnable() {
                    public void run() {
                        AlertController.m2432a(AlertController.this.f1410i, findViewById, view2);
                    }
                });
                return;
            }
            ListView listView = this.f1403b;
            if (listView != null) {
                listView.setOnScrollListener(new AbsListView.OnScrollListener() {
                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m2432a(absListView, findViewById, view2);
                    }

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }
                });
                this.f1403b.post(new Runnable() {
                    public void run() {
                        AlertController.m2432a(AlertController.this.f1403b, findViewById, view2);
                    }
                });
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m2435a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m2436a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0526a.C0527a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m2437a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2437a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m2438b() {
        int i = this.f1398L;
        return i == 0 ? this.f1397K : this.f1400N == 1 ? i : this.f1397K;
    }

    /* renamed from: b */
    private void m2439b(ViewGroup viewGroup) {
        if (this.f1396J != null) {
            viewGroup.addView(this.f1396J, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1419r.findViewById(C0526a.C0532f.title_template).setVisibility(8);
            return;
        }
        this.f1393G = (ImageView) this.f1419r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1420s)) || !this.f1399M) {
            this.f1419r.findViewById(C0526a.C0532f.title_template).setVisibility(8);
            this.f1393G.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1394H = (TextView) this.f1419r.findViewById(C0526a.C0532f.alertTitle);
        this.f1394H.setText(this.f1420s);
        int i = this.f1391E;
        if (i != 0) {
            this.f1393G.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1392F;
        if (drawable != null) {
            this.f1393G.setImageDrawable(drawable);
            return;
        }
        this.f1394H.setPadding(this.f1393G.getPaddingLeft(), this.f1393G.getPaddingTop(), this.f1393G.getPaddingRight(), this.f1393G.getPaddingBottom());
        this.f1393G.setVisibility(8);
    }

    /* renamed from: c */
    private void m2440c() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f1419r.findViewById(C0526a.C0532f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0526a.C0532f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0526a.C0532f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0526a.C0532f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0526a.C0532f.customPanel);
        m2433a(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0526a.C0532f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0526a.C0532f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0526a.C0532f.buttonPanel);
        ViewGroup a = m2431a(findViewById7, findViewById4);
        ViewGroup a2 = m2431a(findViewById8, findViewById5);
        ViewGroup a3 = m2431a(findViewById9, findViewById6);
        m2441c(a2);
        m2442d(a3);
        m2439b(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C0526a.C0532f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f1410i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f1421t == null && this.f1403b == null)) {
                view = a.findViewById(C0526a.C0532f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C0526a.C0532f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1403b;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo2214a(z2, z3);
        }
        if (!z) {
            View view2 = this.f1403b;
            if (view2 == null) {
                view2 = this.f1410i;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m2434a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f1403b;
        if (listView2 != null && (listAdapter = this.f1411j) != null) {
            listView2.setAdapter(listAdapter);
            int i = this.f1412k;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: c */
    private void m2441c(ViewGroup viewGroup) {
        this.f1410i = (NestedScrollView) this.f1419r.findViewById(C0526a.C0532f.scrollView);
        this.f1410i.setFocusable(false);
        this.f1410i.setNestedScrollingEnabled(false);
        this.f1395I = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f1395I;
        if (textView != null) {
            CharSequence charSequence = this.f1421t;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f1410i.removeView(this.f1395I);
            if (this.f1403b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f1410i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f1410i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f1403b, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m2442d(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f1404c = (Button) viewGroup.findViewById(16908313);
        this.f1404c.setOnClickListener(this.f1401O);
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f1388B)) {
            this.f1404c.setVisibility(8);
            z = false;
        } else {
            this.f1404c.setText(this.f1388B);
            this.f1404c.setVisibility(0);
            z = true;
        }
        this.f1406e = (Button) viewGroup.findViewById(16908314);
        this.f1406e.setOnClickListener(this.f1401O);
        if (TextUtils.isEmpty(this.f1389C)) {
            this.f1406e.setVisibility(8);
        } else {
            this.f1406e.setText(this.f1389C);
            this.f1406e.setVisibility(0);
            z |= true;
        }
        this.f1408g = (Button) viewGroup.findViewById(16908315);
        this.f1408g.setOnClickListener(this.f1401O);
        if (TextUtils.isEmpty(this.f1390D)) {
            this.f1408g.setVisibility(8);
        } else {
            this.f1408g.setText(this.f1390D);
            this.f1408g.setVisibility(0);
            z |= true;
        }
        if (m2436a(this.f1418q)) {
            if (z) {
                button = this.f1404c;
            } else if (z) {
                button = this.f1406e;
            } else if (z) {
                button = this.f1408g;
            }
            m2435a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo2196a() {
        this.f1402a.setContentView(m2438b());
        m2440c();
    }

    /* renamed from: a */
    public void mo2197a(int i) {
        this.f1422u = null;
        this.f1423v = i;
        this.f1387A = false;
    }

    /* renamed from: a */
    public void mo2198a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f1417p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f1390D = charSequence;
                this.f1409h = message;
                return;
            case -2:
                this.f1389C = charSequence;
                this.f1407f = message;
                return;
            case -1:
                this.f1388B = charSequence;
                this.f1405d = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo2199a(Drawable drawable) {
        this.f1392F = drawable;
        this.f1391E = 0;
        ImageView imageView = this.f1393G;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f1393G.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2200a(View view, int i, int i2, int i3, int i4) {
        this.f1422u = view;
        this.f1423v = 0;
        this.f1387A = true;
        this.f1424w = i;
        this.f1425x = i2;
        this.f1426y = i3;
        this.f1427z = i4;
    }

    /* renamed from: a */
    public void mo2201a(CharSequence charSequence) {
        this.f1420s = charSequence;
        TextView textView = this.f1394H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo2202a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1410i;
        return nestedScrollView != null && nestedScrollView.mo1931a(keyEvent);
    }

    /* renamed from: b */
    public void mo2203b(int i) {
        this.f1392F = null;
        this.f1391E = i;
        ImageView imageView = this.f1393G;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f1393G.setImageResource(this.f1391E);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo2204b(View view) {
        this.f1396J = view;
    }

    /* renamed from: b */
    public void mo2205b(CharSequence charSequence) {
        this.f1421t = charSequence;
        TextView textView = this.f1395I;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo2206b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1410i;
        return nestedScrollView != null && nestedScrollView.mo1931a(keyEvent);
    }

    /* renamed from: c */
    public int mo2207c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1418q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: c */
    public void mo2208c(View view) {
        this.f1422u = view;
        this.f1423v = 0;
        this.f1387A = false;
    }
}
