package dev.octoshrimpy.quik.feature.settings.swipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsView;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsState;", "context", "Landroid/content/Context;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/util/Preferences;)V", "bindIntents", "", "view", "iconForAction", "", "action", "presentation_noAnalyticsRelease"})
public final class SwipeActionsPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView, dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsState> {
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    
    @javax.inject.Inject
    public SwipeActionsPresenter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView view) {
    }
    
    @androidx.annotation.DrawableRes
    private final int iconForAction(int action) {
        return 0;
    }
}