package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0045a;
import android.support.design.widget.C0107b;
import android.support.design.widget.C0142k;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.p005v4.p017i.C0388q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: android.support.design.widget.b */
public abstract class C0107b<B extends C0107b<B>> {

    /* renamed from: a */
    static final Handler f337a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((C0107b) message.obj).mo570b();
                    return true;
                case 1:
                    ((C0107b) message.obj).mo571b(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f338d = (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19);

    /* renamed from: b */
    final C0124f f339b;

    /* renamed from: c */
    final C0142k.C0144a f340c;

    /* renamed from: e */
    private final ViewGroup f341e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0121c f342f;

    /* renamed from: g */
    private List<C0119a<B>> f343g;

    /* renamed from: h */
    private final AccessibilityManager f344h;

    /* renamed from: android.support.design.widget.b$a */
    public static abstract class C0119a<B> {
        /* renamed from: a */
        public void mo593a(B b) {
        }

        /* renamed from: a */
        public void mo594a(B b, int i) {
        }
    }

    /* renamed from: android.support.design.widget.b$b */
    final class C0120b extends SwipeDismissBehavior<C0124f> {
        C0120b() {
        }

        /* renamed from: a */
        public boolean mo358a(CoordinatorLayout coordinatorLayout, C0124f fVar, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.mo401a((View) fVar, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0142k.m567a().mo671c(C0107b.this.f340c);
                            break;
                        }
                        break;
                    case 1:
                        break;
                }
            }
            C0142k.m567a().mo672d(C0107b.this.f340c);
            return super.mo358a(coordinatorLayout, fVar, motionEvent);
        }

        /* renamed from: a */
        public boolean mo561a(View view) {
            return view instanceof C0124f;
        }
    }

    /* renamed from: android.support.design.widget.b$c */
    public interface C0121c {
        /* renamed from: a */
        void mo202a(int i, int i2);

        /* renamed from: b */
        void mo203b(int i, int i2);
    }

    /* renamed from: android.support.design.widget.b$d */
    interface C0122d {
        /* renamed from: a */
        void mo586a(View view);

        /* renamed from: b */
        void mo587b(View view);
    }

    /* renamed from: android.support.design.widget.b$e */
    interface C0123e {
        /* renamed from: a */
        void mo589a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.design.widget.b$f */
    static class C0124f extends FrameLayout {

        /* renamed from: a */
        private C0123e f361a;

        /* renamed from: b */
        private C0122d f362b;

        C0124f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045a.C0054i.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C0045a.C0054i.SnackbarLayout_elevation)) {
                C0388q.m1638a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0045a.C0054i.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0122d dVar = this.f362b;
            if (dVar != null) {
                dVar.mo586a(this);
            }
            C0388q.m1668o(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C0122d dVar = this.f362b;
            if (dVar != null) {
                dVar.mo587b(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C0123e eVar = this.f361a;
            if (eVar != null) {
                eVar.mo589a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C0122d dVar) {
            this.f362b = dVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C0123e eVar) {
            this.f361a = eVar;
        }
    }

    /* renamed from: d */
    private void m451d(final int i) {
        if (Build.VERSION.SDK_INT >= 12) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{0, this.f339b.getHeight()});
            valueAnimator.setInterpolator(C0106a.f333b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    C0107b.this.mo573c(i);
                }

                public void onAnimationStart(Animator animator) {
                    C0107b.this.f342f.mo203b(0, 180);
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: b */
                private int f349b = 0;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0107b.f338d) {
                        C0388q.m1653b((View) C0107b.this.f339b, intValue - this.f349b);
                    } else {
                        C0107b.this.f339b.setTranslationY((float) intValue);
                    }
                    this.f349b = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f339b.getContext(), C0045a.C0046a.design_snackbar_out);
        loadAnimation.setInterpolator(C0106a.f333b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                C0107b.this.mo573c(i);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.f339b.startAnimation(loadAnimation);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo568a(int i) {
        C0142k.m567a().mo668a(this.f340c, i);
    }

    /* renamed from: a */
    public boolean mo569a() {
        return C0142k.m567a().mo673e(this.f340c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo570b() {
        if (this.f339b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f339b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0091d) {
                CoordinatorLayout.C0091d dVar = (CoordinatorLayout.C0091d) layoutParams;
                C0120b bVar = new C0120b();
                bVar.mo558a(0.1f);
                bVar.mo562b(0.6f);
                bVar.mo559a(0);
                bVar.mo560a((SwipeDismissBehavior.C0104a) new SwipeDismissBehavior.C0104a() {
                    /* renamed from: a */
                    public void mo565a(int i) {
                        switch (i) {
                            case 0:
                                C0142k.m567a().mo672d(C0107b.this.f340c);
                                return;
                            case 1:
                            case 2:
                                C0142k.m567a().mo671c(C0107b.this.f340c);
                                return;
                            default:
                                return;
                        }
                    }

                    /* renamed from: a */
                    public void mo566a(View view) {
                        view.setVisibility(8);
                        C0107b.this.mo568a(0);
                    }
                });
                dVar.mo470a((CoordinatorLayout.C0088a) bVar);
                dVar.f276g = 80;
            }
            this.f341e.addView(this.f339b);
        }
        this.f339b.setOnAttachStateChangeListener(new C0122d() {
            /* renamed from: a */
            public void mo586a(View view) {
            }

            /* renamed from: b */
            public void mo587b(View view) {
                if (C0107b.this.mo569a()) {
                    C0107b.f337a.post(new Runnable() {
                        public void run() {
                            C0107b.this.mo573c(3);
                        }
                    });
                }
            }
        });
        if (!C0388q.m1676w(this.f339b)) {
            this.f339b.setOnLayoutChangeListener(new C0123e() {
                /* renamed from: a */
                public void mo589a(View view, int i, int i2, int i3, int i4) {
                    C0107b.this.f339b.setOnLayoutChangeListener((C0123e) null);
                    if (C0107b.this.mo575e()) {
                        C0107b.this.mo572c();
                    } else {
                        C0107b.this.mo574d();
                    }
                }
            });
        } else if (mo575e()) {
            mo572c();
        } else {
            mo574d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo571b(int i) {
        if (!mo575e() || this.f339b.getVisibility() != 0) {
            mo573c(i);
        } else {
            m451d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo572c() {
        if (Build.VERSION.SDK_INT >= 12) {
            final int height = this.f339b.getHeight();
            if (f338d) {
                C0388q.m1653b((View) this.f339b, height);
            } else {
                this.f339b.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C0106a.f333b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    C0107b.this.mo574d();
                }

                public void onAnimationStart(Animator animator) {
                    C0107b.this.f342f.mo202a(70, 180);
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: c */
                private int f359c = height;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0107b.f338d) {
                        C0388q.m1653b((View) C0107b.this.f339b, intValue - this.f359c);
                    } else {
                        C0107b.this.f339b.setTranslationY((float) intValue);
                    }
                    this.f359c = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f339b.getContext(), C0045a.C0046a.design_snackbar_in);
        loadAnimation.setInterpolator(C0106a.f333b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                C0107b.this.mo574d();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.f339b.startAnimation(loadAnimation);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo573c(int i) {
        C0142k.m567a().mo667a(this.f340c);
        List<C0119a<B>> list = this.f343g;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f343g.get(size).mo594a(this, i);
            }
        }
        if (Build.VERSION.SDK_INT < 11) {
            this.f339b.setVisibility(8);
        }
        ViewParent parent = this.f339b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f339b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo574d() {
        C0142k.m567a().mo670b(this.f340c);
        List<C0119a<B>> list = this.f343g;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f343g.get(size).mo593a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo575e() {
        return !this.f344h.isEnabled();
    }
}
