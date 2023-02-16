package android.support.p020v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.p005v4.p017i.C0387p;
import android.support.p005v4.widget.C0521o;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.q */
public class C0901q extends ImageView implements C0387p, C0521o {

    /* renamed from: a */
    private final C0888h f3045a;

    /* renamed from: b */
    private final C0900p f3046b;

    public C0901q(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0901q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0901q(Context context, AttributeSet attributeSet, int i) {
        super(C0843bf.m4620a(context), attributeSet, i);
        this.f3045a = new C0888h(this);
        this.f3045a.mo4414a(attributeSet, i);
        this.f3046b = new C0900p(this);
        this.f3046b.mo4476a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            hVar.mo4417c();
        }
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4480d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            return hVar.mo4409a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            return hVar.mo4415b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            return pVar.mo4478b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            return pVar.mo4479c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f3046b.mo4477a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            hVar.mo4413a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            hVar.mo4410a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4480d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4480d();
        }
    }

    public void setImageIcon(Icon icon) {
        super.setImageIcon(icon);
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4480d();
        }
    }

    public void setImageResource(int i) {
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4473a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4480d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            hVar.mo4411a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0888h hVar = this.f3045a;
        if (hVar != null) {
            hVar.mo4412a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4474a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0900p pVar = this.f3046b;
        if (pVar != null) {
            pVar.mo4475a(mode);
        }
    }
}
