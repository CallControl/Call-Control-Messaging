package dev.octoshrimpy.quik.feature.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/feature/backup/BackupPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/backup/BackupView;", "Ldev/octoshrimpy/quik/feature/backup/BackupState;", "backupRepo", "Ldev/octoshrimpy/quik/repository/BackupRepository;", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "context", "Landroid/content/Context;", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "performBackup", "Ldev/octoshrimpy/quik/interactor/PerformBackup;", "(Ldev/octoshrimpy/quik/repository/BackupRepository;Ldev/octoshrimpy/quik/manager/BillingManager;Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/DateFormatter;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/interactor/PerformBackup;)V", "bindIntents", "", "view", "presentation_noAnalyticsRelease"})
public final class BackupPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.backup.BackupView, dev.octoshrimpy.quik.feature.backup.BackupState> {
    private final dev.octoshrimpy.quik.repository.BackupRepository backupRepo = null;
    private final dev.octoshrimpy.quik.manager.BillingManager billingManager = null;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.interactor.PerformBackup performBackup = null;
    
    @javax.inject.Inject
    public BackupPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepository backupRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager billingManager, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.PerformBackup performBackup) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.backup.BackupView view) {
    }
}