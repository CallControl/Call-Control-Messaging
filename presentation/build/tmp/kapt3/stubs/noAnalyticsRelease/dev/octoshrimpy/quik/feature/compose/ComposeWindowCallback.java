package dev.octoshrimpy.quik.feature.compose;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010\'\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0007H\u0016J\u0012\u00101\u001a\u0004\u0018\u00010\u00162\u0006\u00102\u001a\u000203H\u0016J\u001a\u00101\u001a\u0004\u0018\u00010\u00162\u0006\u00102\u001a\u0002032\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/ComposeWindowCallback;", "Landroid/view/Window$Callback;", "localCallback", "activity", "Landroid/app/Activity;", "(Landroid/view/Window$Callback;Landroid/app/Activity;)V", "dispatchGenericMotionEvent", "", "motionEvent", "Landroid/view/MotionEvent;", "dispatchKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "dispatchKeyShortcutEvent", "dispatchPopulateAccessibilityEvent", "accessibilityEvent", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchTouchEvent", "dispatchTrackballEvent", "onActionModeFinished", "", "actionMode", "Landroid/view/ActionMode;", "onActionModeStarted", "onAttachedToWindow", "onContentChanged", "onCreatePanelMenu", "i", "", "menu", "Landroid/view/Menu;", "onCreatePanelView", "Landroid/view/View;", "onDetachedFromWindow", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "onMenuOpened", "onPanelClosed", "onPreparePanel", "view", "onSearchRequested", "searchEvent", "Landroid/view/SearchEvent;", "onWindowAttributesChanged", "layoutParams", "Landroid/view/WindowManager$LayoutParams;", "onWindowFocusChanged", "b", "onWindowStartingActionMode", "callback", "Landroid/view/ActionMode$Callback;", "presentation_noAnalyticsRelease"})
public final class ComposeWindowCallback implements android.view.Window.Callback {
    private final android.view.Window.Callback localCallback = null;
    private final android.app.Activity activity = null;
    
    public ComposeWindowCallback(@org.jetbrains.annotations.NotNull
    android.view.Window.Callback localCallback, @org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        super();
    }
    
    @java.lang.Override
    public boolean dispatchKeyEvent(@org.jetbrains.annotations.NotNull
    android.view.KeyEvent keyEvent) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchKeyShortcutEvent(@org.jetbrains.annotations.NotNull
    android.view.KeyEvent keyEvent) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchTrackballEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchGenericMotionEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchPopulateAccessibilityEvent(@org.jetbrains.annotations.NotNull
    android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreatePanelView(int i) {
        return null;
    }
    
    @java.lang.Override
    public boolean onCreatePanelMenu(int i, @org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onPreparePanel(int i, @org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onMenuOpened(int i, @org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onMenuItemSelected(int i, @org.jetbrains.annotations.NotNull
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @java.lang.Override
    public void onWindowAttributesChanged(@org.jetbrains.annotations.NotNull
    android.view.WindowManager.LayoutParams layoutParams) {
    }
    
    @java.lang.Override
    public void onContentChanged() {
    }
    
    @java.lang.Override
    public void onWindowFocusChanged(boolean b) {
    }
    
    @java.lang.Override
    public void onAttachedToWindow() {
    }
    
    @java.lang.Override
    public void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onPanelClosed(int i, @org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
    }
    
    @java.lang.Override
    public boolean onSearchRequested() {
        return false;
    }
    
    @java.lang.Override
    public boolean onSearchRequested(@org.jetbrains.annotations.NotNull
    android.view.SearchEvent searchEvent) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.ActionMode onWindowStartingActionMode(@org.jetbrains.annotations.NotNull
    android.view.ActionMode.Callback callback) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.ActionMode onWindowStartingActionMode(@org.jetbrains.annotations.NotNull
    android.view.ActionMode.Callback callback, int i) {
        return null;
    }
    
    @java.lang.Override
    public void onActionModeStarted(@org.jetbrains.annotations.NotNull
    android.view.ActionMode actionMode) {
    }
    
    @java.lang.Override
    public void onActionModeFinished(@org.jetbrains.annotations.NotNull
    android.view.ActionMode actionMode) {
    }
}