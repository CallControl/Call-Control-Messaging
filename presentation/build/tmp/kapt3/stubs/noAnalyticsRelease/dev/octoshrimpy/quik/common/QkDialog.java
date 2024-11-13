package dev.octoshrimpy.quik.common;

import java.lang.System;

/**
 * Wrapper around AlertDialog which makes it easier to display lists that use our UI
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/common/QkDialog;", "", "context", "Landroid/content/Context;", "adapter", "Ldev/octoshrimpy/quik/common/MenuItemAdapter;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/common/MenuItemAdapter;)V", "getAdapter", "()Ldev/octoshrimpy/quik/common/MenuItemAdapter;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "", "", "show", "activity", "Landroid/app/Activity;", "presentation_noAnalyticsRelease"})
public final class QkDialog {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final dev.octoshrimpy.quik.common.MenuItemAdapter adapter = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String title;
    
    @javax.inject.Inject
    public QkDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.MenuItemAdapter adapter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.MenuItemAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public final void setTitle(@androidx.annotation.StringRes
    int title) {
    }
}