package dev.octoshrimpy.quik.feature.plus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0016\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Ldev/octoshrimpy/quik/feature/plus/PlusView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/plus/PlusState;", "backupClicks", "Lio/reactivex/Observable;", "getBackupClicks", "()Lio/reactivex/Observable;", "delayedClicks", "getDelayedClicks", "donateIntent", "getDonateIntent", "nightClicks", "getNightClicks", "scheduleClicks", "getScheduleClicks", "themeClicks", "getThemeClicks", "upgradeDonateIntent", "", "getUpgradeDonateIntent", "upgradeIntent", "getUpgradeIntent", "initiatePurchaseFlow", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "sku", "", "presentation_noAnalyticsRelease"})
public abstract interface PlusView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.plus.PlusState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getUpgradeIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getUpgradeDonateIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getDonateIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getThemeClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getScheduleClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getBackupClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getDelayedClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getNightClicks();
    
    public abstract void initiatePurchaseFlow(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager billingManager, @org.jetbrains.annotations.NotNull
    java.lang.String sku);
}