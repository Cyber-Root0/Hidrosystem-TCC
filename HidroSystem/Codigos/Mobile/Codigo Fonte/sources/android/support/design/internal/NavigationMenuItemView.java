package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0045a;
import android.support.p005v4.p007b.p008a.C0233b;
import android.support.p005v4.p009c.p010a.C0240a;
import android.support.p005v4.p017i.C0358b;
import android.support.p005v4.p017i.C0388q;
import android.support.p005v4.p017i.p018a.C0328b;
import android.support.p005v4.widget.C0513m;
import android.support.p020v7.p021a.C0526a;
import android.support.p020v7.view.menu.C0657j;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.widget.C0767ao;
import android.support.p020v7.widget.C0850bk;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends C0056a implements C0671p.C0672a {

    /* renamed from: d */
    private static final int[] f139d = {16842912};

    /* renamed from: c */
    boolean f140c;

    /* renamed from: e */
    private final int f141e;

    /* renamed from: f */
    private boolean f142f;

    /* renamed from: g */
    private final CheckedTextView f143g;

    /* renamed from: h */
    private FrameLayout f144h;

    /* renamed from: i */
    private C0657j f145i;

    /* renamed from: j */
    private ColorStateList f146j;

    /* renamed from: k */
    private boolean f147k;

    /* renamed from: l */
    private Drawable f148l;

    /* renamed from: m */
    private final C0358b f149m;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149m = new C0358b() {
            /* renamed from: a */
            public void mo199a(View view, C0328b bVar) {
                super.mo199a(view, bVar);
                bVar.mo1418a(NavigationMenuItemView.this.f140c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0045a.C0052g.design_navigation_menu_item, this, true);
        this.f141e = context.getResources().getDimensionPixelSize(C0045a.C0048c.design_navigation_icon_size);
        this.f143g = (CheckedTextView) findViewById(C0045a.C0050e.design_menu_item_text);
        this.f143g.setDuplicateParentStateEnabled(true);
        C0388q.m1645a((View) this.f143g, this.f149m);
    }

    /* renamed from: c */
    private boolean m119c() {
        return this.f145i.getTitle() == null && this.f145i.getIcon() == null && this.f145i.getActionView() != null;
    }

    /* renamed from: d */
    private void m120d() {
        int i;
        C0767ao.C0768a aVar;
        if (m119c()) {
            this.f143g.setVisibility(8);
            FrameLayout frameLayout = this.f144h;
            if (frameLayout != null) {
                aVar = (C0767ao.C0768a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f143g.setVisibility(0);
            FrameLayout frameLayout2 = this.f144h;
            if (frameLayout2 != null) {
                aVar = (C0767ao.C0768a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f144h.setLayoutParams(aVar);
    }

    /* renamed from: e */
    private StateListDrawable m121e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0526a.C0527a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f139d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f144h == null) {
                this.f144h = (FrameLayout) ((ViewStub) findViewById(C0045a.C0050e.design_menu_item_action_area_stub)).inflate();
            }
            this.f144h.removeAllViews();
            this.f144h.addView(view);
        }
    }

    /* renamed from: a */
    public void mo186a() {
        FrameLayout frameLayout = this.f144h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f143g.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: a */
    public void mo187a(C0657j jVar, int i) {
        this.f145i = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0388q.m1644a((View) this, (Drawable) m121e());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0850bk.m4690a(this, jVar.getTooltipText());
        m120d();
    }

    /* renamed from: b */
    public boolean mo188b() {
        return false;
    }

    public C0657j getItemData() {
        return this.f145i;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0657j jVar = this.f145i;
        if (jVar != null && jVar.isCheckable() && this.f145i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f139d);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f140c != z) {
            this.f140c = z;
            this.f149m.mo1505a((View) this.f143g, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f143g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f147k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0240a.m1134f(drawable).mutate();
                C0240a.m1124a(drawable, this.f146j);
            }
            int i = this.f141e;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f142f) {
            if (this.f148l == null) {
                this.f148l = C0233b.m1091a(getResources(), C0045a.C0049d.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f148l;
                if (drawable2 != null) {
                    int i2 = this.f141e;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f148l;
        }
        C0513m.m2370a(this.f143g, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f146j = colorStateList;
        this.f147k = this.f146j != null;
        C0657j jVar = this.f145i;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f142f = z;
    }

    public void setTextAppearance(int i) {
        C0513m.m2369a(this.f143g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f143g.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f143g.setText(charSequence);
    }
}
