package android.support.design.internal;

import android.content.Context;
import android.support.p020v7.view.menu.C0653h;
import android.support.p020v7.view.menu.C0671p;
import android.support.p020v7.widget.C0787av;
import android.support.p020v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

public class NavigationMenuView extends C0787av implements C0671p {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    /* renamed from: a */
    public void mo200a(C0653h hVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
