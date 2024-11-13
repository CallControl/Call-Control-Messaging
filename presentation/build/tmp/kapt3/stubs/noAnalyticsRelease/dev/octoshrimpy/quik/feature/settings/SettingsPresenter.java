package dev.octoshrimpy.quik.feature.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bg\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/SettingsPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/settings/SettingsView;", "Ldev/octoshrimpy/quik/feature/settings/SettingsState;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "syncRepo", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "analytics", "Ldev/octoshrimpy/quik/manager/AnalyticsManager;", "context", "Landroid/content/Context;", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "deleteOldMessages", "Ldev/octoshrimpy/quik/interactor/DeleteOldMessages;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "nightModeManager", "Ldev/octoshrimpy/quik/util/NightModeManager;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "syncMessages", "Ldev/octoshrimpy/quik/interactor/SyncMessages;", "(Ldev/octoshrimpy/quik/common/util/Colors;Ldev/octoshrimpy/quik/repository/SyncRepository;Ldev/octoshrimpy/quik/manager/AnalyticsManager;Landroid/content/Context;Ldev/octoshrimpy/quik/manager/BillingManager;Ldev/octoshrimpy/quik/common/util/DateFormatter;Ldev/octoshrimpy/quik/interactor/DeleteOldMessages;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/util/NightModeManager;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/interactor/SyncMessages;)V", "bindIntents", "", "view", "presentation_noAnalyticsRelease"})
public final class SettingsPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.settings.SettingsView, dev.octoshrimpy.quik.feature.settings.SettingsState> {
    private final dev.octoshrimpy.quik.manager.AnalyticsManager analytics = null;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.manager.BillingManager billingManager = null;
    private final dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter = null;
    private final dev.octoshrimpy.quik.interactor.DeleteOldMessages deleteOldMessages = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.util.NightModeManager nightModeManager = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.interactor.SyncMessages syncMessages = null;
    
    @javax.inject.Inject
    public SettingsPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository syncRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.AnalyticsManager analytics, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager billingManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteOldMessages deleteOldMessages, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.NightModeManager nightModeManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SyncMessages syncMessages) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.settings.SettingsView view) {
    }
}