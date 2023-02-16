package android.support.p020v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.view.i */
public class C0637i implements Window.Callback {

    /* renamed from: e */
    final Window.Callback f1798e;

    public C0637i(Window.Callback callback) {
        if (callback != null) {
            this.f1798e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1798e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1798e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1798e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1798e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1798e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1798e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f1798e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f1798e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f1798e.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f1798e.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f1798e.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f1798e.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f1798e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1798e.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f1798e.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f1798e.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f1798e.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f1798e.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f1798e.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f1798e.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f1798e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1798e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f1798e.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1798e.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f1798e.onWindowStartingActionMode(callback, i);
    }
}
