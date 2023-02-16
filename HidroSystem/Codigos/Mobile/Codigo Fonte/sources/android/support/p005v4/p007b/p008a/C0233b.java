package android.support.p005v4.p007b.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p005v4.p007b.p008a.C0228a;
import android.support.p005v4.p009c.C0258c;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.b.a.b */
public final class C0233b {
    /* renamed from: a */
    public static Typeface m1089a(Context context, int i, TypedValue typedValue, int i2, TextView textView) {
        if (context.isRestricted()) {
            return null;
        }
        return m1092b(context, i, typedValue, i2, textView);
    }

    /* renamed from: a */
    private static Typeface m1090a(Context context, Resources resources, TypedValue typedValue, int i, int i2, TextView textView) {
        String str;
        StringBuilder sb;
        String str2;
        if (typedValue.string != null) {
            String charSequence = typedValue.string.toString();
            if (!charSequence.startsWith("res/")) {
                return null;
            }
            Typeface a = C0258c.m1203a(resources, i, i2);
            if (a != null) {
                return a;
            }
            try {
                if (!charSequence.toLowerCase().endsWith(".xml")) {
                    return C0258c.m1200a(context, resources, i, charSequence, i2);
                }
                C0228a.C0229a a2 = C0228a.m1074a((XmlPullParser) resources.getXml(i), resources);
                if (a2 != null) {
                    return C0258c.m1202a(context, a2, resources, i, i2, textView);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                return null;
            } catch (XmlPullParserException e) {
                e = e;
                str2 = "ResourcesCompat";
                sb = new StringBuilder();
                str = "Failed to parse xml resource ";
                sb.append(str);
                sb.append(charSequence);
                Log.e(str2, sb.toString(), e);
                return null;
            } catch (IOException e2) {
                e = e2;
                str2 = "ResourcesCompat";
                sb = new StringBuilder();
                str = "Failed to read xml resource ";
                sb.append(str);
                sb.append(charSequence);
                Log.e(str2, sb.toString(), e);
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
    }

    /* renamed from: a */
    public static Drawable m1091a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: b */
    private static Typeface m1092b(Context context, int i, TypedValue typedValue, int i2, TextView textView) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m1090a(context, resources, typedValue, i, i2, textView);
        if (a != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i));
    }
}
