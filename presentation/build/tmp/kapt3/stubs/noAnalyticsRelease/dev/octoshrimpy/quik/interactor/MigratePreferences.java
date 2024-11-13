package dev.octoshrimpy.quik.interactor;

import java.lang.System;

/**
 * When upgrading from 2.7.3 to 3.0, migrate the preferences
 *
 * Blocked conversations will be migrated in SyncManager
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/interactor/MigratePreferences;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "", "nightModeManager", "Ldev/octoshrimpy/quik/util/NightModeManager;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "rxPrefs", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "(Ldev/octoshrimpy/quik/util/NightModeManager;Ldev/octoshrimpy/quik/util/Preferences;Lcom/f2prateek/rx/preferences2/RxSharedPreferences;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Flowable;", "presentation_noAnalyticsRelease"})
public final class MigratePreferences extends dev.octoshrimpy.quik.interactor.Interactor<kotlin.Unit> {
    private final dev.octoshrimpy.quik.util.NightModeManager nightModeManager = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs = null;
    
    @javax.inject.Inject
    public MigratePreferences(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.NightModeManager nightModeManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    kotlin.Unit params) {
        return null;
    }
}