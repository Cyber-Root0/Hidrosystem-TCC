package android.support.p005v4.p006a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.a.t */
class C0211t {
    /* renamed from: a */
    public static Object m1009a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: a */
    public static Object m1010a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    public static ArrayList<String> m1012a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(view.getTransitionName());
            view.setTransitionName((String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static void m1013a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public static void m1014a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName((String) null);
                String str = map.get(transitionName);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(transitionName);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C0224x.m1065a(view, new Runnable() {
            public void run() {
                for (int i = 0; i < size; i++) {
                    ((View) arrayList5.get(i)).setTransitionName((String) arrayList6.get(i));
                    ((View) arrayList7.get(i)).setTransitionName((String) arrayList4.get(i));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1015a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0224x.m1065a(view, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String transitionName = view.getTransitionName();
                    if (transitionName != null) {
                        view.setTransitionName(C0211t.m1032b((Map<String, String>) map, transitionName));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1016a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public static void m1017a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0224x.m1065a(viewGroup, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    view.setTransitionName((String) map.get(view.getTransitionName()));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1018a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1019a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m1013a(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1020a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1025a((List<View>) targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        m1022a((Object) transitionSet, arrayList);
    }

    /* renamed from: a */
    public static void m1021a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                Object obj = obj5;
                if (obj != null) {
                    C0211t.m1035b(obj, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    C0211t.m1035b(obj2, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    C0211t.m1035b(obj3, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m1022a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    m1022a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m1027a(transition) && m1028a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1023a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m1035b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public static void m1024a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean isTransitionGroup = viewGroup2.isTransitionGroup();
                viewGroup = viewGroup2;
                if (!isTransitionGroup) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m1024a(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: a */
    private static void m1025a(List<View> list, View view) {
        int size = list.size();
        if (!m1029a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1029a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1026a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1026a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1027a(Transition transition) {
        return !m1028a((List) transition.getTargetIds()) || !m1028a((List) transition.getTargetNames()) || !m1028a((List) transition.getTargetTypes());
    }

    /* renamed from: a */
    private static boolean m1028a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m1029a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Object m1030b(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: b */
    public static Object m1031b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m1032b(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m1033b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public static void m1034b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    /* renamed from: b */
    public static void m1035b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m1035b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m1027a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: c */
    public static void m1036c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }
}
