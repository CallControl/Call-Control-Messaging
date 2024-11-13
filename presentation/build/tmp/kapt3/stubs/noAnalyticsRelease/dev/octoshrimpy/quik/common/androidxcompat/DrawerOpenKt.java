package dev.octoshrimpy.quik.common.androidxcompat;

import java.lang.System;

@kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b\u00a8\u0006\b"}, d2 = {"drawerOpen", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "", "Landroidx/drawerlayout/widget/DrawerLayout;", "gravity", "", "open", "Lio/reactivex/functions/Consumer;", "presentation_noAnalyticsRelease"})
public final class DrawerOpenKt {
    
    /**
     * Create an observable of the open state of the drawer of `view`.
     *
     * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
     * to free this reference.
     *
     * *Note:* A value will be emitted immediately on subscribe.
     */
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.CheckResult
    public static final com.jakewharton.rxbinding2.InitialValueObservable<java.lang.Boolean> drawerOpen(@org.jetbrains.annotations.NotNull
    androidx.drawerlayout.widget.DrawerLayout $this$drawerOpen, int gravity) {
        return null;
    }
    
    /**
     * An action which sets whether the drawer with `gravity` of `view` is open.
     *
     * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
     * to free this reference.
     */
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.CheckResult
    public static final io.reactivex.functions.Consumer<? super java.lang.Boolean> open(@org.jetbrains.annotations.NotNull
    androidx.drawerlayout.widget.DrawerLayout $this$open, int gravity) {
        return null;
    }
}