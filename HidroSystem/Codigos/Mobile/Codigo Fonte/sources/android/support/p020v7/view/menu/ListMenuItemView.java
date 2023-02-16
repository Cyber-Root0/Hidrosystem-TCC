package android.support.p020v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p005v4.p017i.C0388q;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.widget.C0846bi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0671p.C0672a {

    /* renamed from: a */
    private C0657j f1814a;

    /* renamed from: b */
    private ImageView f1815b;

    /* renamed from: c */
    private RadioButton f1816c;

    /* renamed from: d */
    private TextView f1817d;

    /* renamed from: e */
    private CheckBox f1818e;

    /* renamed from: f */
    private TextView f1819f;

    /* renamed from: g */
    private ImageView f1820g;

    /* renamed from: h */
    private Drawable f1821h;

    /* renamed from: i */
    private int f1822i;

    /* renamed from: j */
    private Context f1823j;

    /* renamed from: k */
    private boolean f1824k;

    /* renamed from: l */
    private Drawable f1825l;

    /* renamed from: m */
    private int f1826m;

    /* renamed from: n */
    private LayoutInflater f1827n;

    /* renamed from: o */
    private boolean f1828o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0526a.C0527a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0846bi a = C0846bi.m4625a(getContext(), attributeSet, C0526a.C0536j.MenuView, i, 0);
        this.f1821h = a.mo4291a(C0526a.C0536j.MenuView_android_itemBackground);
        this.f1822i = a.mo4304g(C0526a.C0536j.MenuView_android_itemTextAppearance, -1);
        this.f1824k = a.mo4293a(C0526a.C0536j.MenuView_preserveIconSpacing, false);
        this.f1823j = context;
        this.f1825l = a.mo4291a(C0526a.C0536j.MenuView_subMenuArrow);
        a.mo4292a();
    }

    /* renamed from: a */
    private void m2939a() {
        this.f1815b = (ImageView) getInflater().inflate(C0526a.C0533g.abc_list_menu_item_icon, this, false);
        addView(this.f1815b, 0);
    }

    /* renamed from: c */
    private void m2940c() {
        this.f1816c = (RadioButton) getInflater().inflate(C0526a.C0533g.abc_list_menu_item_radio, this, false);
        addView(this.f1816c);
    }

    /* renamed from: d */
    private void m2941d() {
        this.f1818e = (CheckBox) getInflater().inflate(C0526a.C0533g.abc_list_menu_item_checkbox, this, false);
        addView(this.f1818e);
    }

    private LayoutInflater getInflater() {
        if (this.f1827n == null) {
            this.f1827n = LayoutInflater.from(getContext());
        }
        return this.f1827n;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1820g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo187a(C0657j jVar, int i) {
        this.f1814a = jVar;
        this.f1826m = i;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo2760a((C0671p.C0672a) this));
        setCheckable(jVar.isCheckable());
        mo2578a(jVar.mo2773f(), jVar.mo2769d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo2578a(boolean z, char c) {
        int i = (!z || !this.f1814a.mo2773f()) ? 8 : 0;
        if (i == 0) {
            this.f1819f.setText(this.f1814a.mo2771e());
        }
        if (this.f1819f.getVisibility() != i) {
            this.f1819f.setVisibility(i);
        }
    }

    /* renamed from: b */
    public boolean mo188b() {
        return false;
    }

    public C0657j getItemData() {
        return this.f1814a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0388q.m1644a((View) this, this.f1821h);
        this.f1817d = (TextView) findViewById(C0526a.C0532f.title);
        int i = this.f1822i;
        if (i != -1) {
            this.f1817d.setTextAppearance(this.f1823j, i);
        }
        this.f1819f = (TextView) findViewById(C0526a.C0532f.shortcut);
        this.f1820g = (ImageView) findViewById(C0526a.C0532f.submenuarrow);
        ImageView imageView = this.f1820g;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1825l);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1815b != null && this.f1824k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1815b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1816c != null || this.f1818e != null) {
            if (this.f1814a.mo2774g()) {
                if (this.f1816c == null) {
                    m2940c();
                }
                compoundButton2 = this.f1816c;
                compoundButton = this.f1818e;
            } else {
                if (this.f1818e == null) {
                    m2941d();
                }
                compoundButton2 = this.f1818e;
                compoundButton = this.f1816c;
            }
            if (z) {
                compoundButton2.setChecked(this.f1814a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton2.getVisibility() != i) {
                    compoundButton2.setVisibility(i);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1818e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1816c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1814a.mo2774g()) {
            if (this.f1816c == null) {
                m2940c();
            }
            compoundButton = this.f1816c;
        } else {
            if (this.f1818e == null) {
                m2941d();
            }
            compoundButton = this.f1818e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1828o = z;
        this.f1824k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1814a.mo2789i() || this.f1828o;
        if (!z && !this.f1824k) {
            return;
        }
        if (this.f1815b != null || drawable != null || this.f1824k) {
            if (this.f1815b == null) {
                m2939a();
            }
            if (drawable != null || this.f1824k) {
                ImageView imageView = this.f1815b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1815b.getVisibility() != 0) {
                    this.f1815b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1815b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f1817d.setText(charSequence);
            if (this.f1817d.getVisibility() != 0) {
                textView = this.f1817d;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f1817d.getVisibility() != 8) {
                textView = this.f1817d;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
