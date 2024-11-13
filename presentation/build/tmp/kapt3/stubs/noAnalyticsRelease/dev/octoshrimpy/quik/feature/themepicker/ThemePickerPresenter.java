package dev.octoshrimpy.quik.feature.themepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerView;", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerState;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "recipientId", "", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "widgetManager", "Ldev/octoshrimpy/quik/manager/WidgetManager;", "(Ldev/octoshrimpy/quik/util/Preferences;JLdev/octoshrimpy/quik/manager/BillingManager;Ldev/octoshrimpy/quik/common/util/Colors;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/manager/WidgetManager;)V", "theme", "Lcom/f2prateek/rx/preferences2/Preference;", "", "bindIntents", "", "view", "presentation_noAnalyticsRelease"})
public final class ThemePickerPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.themepicker.ThemePickerView, dev.octoshrimpy.quik.feature.themepicker.ThemePickerState> {
    private final long recipientId = 0L;
    private final dev.octoshrimpy.quik.manager.BillingManager billingManager = null;
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.manager.WidgetManager widgetManager = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Integer> theme = null;
    
    @javax.inject.Inject
    public ThemePickerPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @javax.inject.Named(value = "recipientId")
    long recipientId, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager billingManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.WidgetManager widgetManager) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemePickerView view) {
    }
}