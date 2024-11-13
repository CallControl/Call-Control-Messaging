package dev.octoshrimpy.quik.feature.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H&J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH&J\f\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0004H&\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/feature/backup/BackupView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/backup/BackupState;", "backupClicks", "Lio/reactivex/Observable;", "confirmRestoreBackupCancelClicks", "confirmRestoreBackupConfirmClicks", "documentSelected", "Landroid/net/Uri;", "documentTreeSelected", "locationRationaleCancelClicks", "locationRationaleConfirmClicks", "restoreClicks", "selectFile", "", "initialUri", "selectFolder", "selectedBackupErrorClicks", "setBackupLocationClicks", "stopRestoreCancel", "stopRestoreClicks", "stopRestoreConfirmed", "presentation_noAnalyticsRelease"})
public abstract interface BackupView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.backup.BackupState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> setBackupLocationClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> restoreClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> backupClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> locationRationaleConfirmClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> locationRationaleCancelClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> selectedBackupErrorClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> confirmRestoreBackupConfirmClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> confirmRestoreBackupCancelClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> stopRestoreClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> stopRestoreConfirmed();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> stopRestoreCancel();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<android.net.Uri> documentTreeSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<android.net.Uri> documentSelected();
    
    public abstract void selectFolder(@org.jetbrains.annotations.NotNull
    android.net.Uri initialUri);
    
    public abstract void selectFile(@org.jetbrains.annotations.NotNull
    android.net.Uri initialUri);
}