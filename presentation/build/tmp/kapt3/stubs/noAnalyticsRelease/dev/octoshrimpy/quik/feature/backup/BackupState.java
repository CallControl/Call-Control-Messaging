package dev.octoshrimpy.quik.feature.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006$"}, d2 = {"Ldev/octoshrimpy/quik/feature/backup/BackupState;", "", "backupProgress", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "restoreProgress", "showLocationRationale", "", "showSelectedBackupError", "selectedBackupDetails", "", "showStopRestoreDialog", "upgraded", "(Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;ZZLjava/lang/String;ZZ)V", "getBackupProgress", "()Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "getRestoreProgress", "getSelectedBackupDetails", "()Ljava/lang/String;", "getShowLocationRationale", "()Z", "getShowSelectedBackupError", "getShowStopRestoreDialog", "getUpgraded", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "presentation_noAnalyticsRelease"})
public final class BackupState {
    @org.jetbrains.annotations.NotNull
    private final dev.octoshrimpy.quik.repository.BackupRepository.Progress backupProgress = null;
    @org.jetbrains.annotations.NotNull
    private final dev.octoshrimpy.quik.repository.BackupRepository.Progress restoreProgress = null;
    private final boolean showLocationRationale = false;
    private final boolean showSelectedBackupError = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String selectedBackupDetails = null;
    private final boolean showStopRestoreDialog = false;
    private final boolean upgraded = false;
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.backup.BackupState copy(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepository.Progress backupProgress, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepository.Progress restoreProgress, boolean showLocationRationale, boolean showSelectedBackupError, @org.jetbrains.annotations.Nullable
    java.lang.String selectedBackupDetails, boolean showStopRestoreDialog, boolean upgraded) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BackupState() {
        super();
    }
    
    public BackupState(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepository.Progress backupProgress, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepository.Progress restoreProgress, boolean showLocationRationale, boolean showSelectedBackupError, @org.jetbrains.annotations.Nullable
    java.lang.String selectedBackupDetails, boolean showStopRestoreDialog, boolean upgraded) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.BackupRepository.Progress component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.BackupRepository.Progress getBackupProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.BackupRepository.Progress component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.BackupRepository.Progress getRestoreProgress() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getShowLocationRationale() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getShowSelectedBackupError() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSelectedBackupDetails() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getShowStopRestoreDialog() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getUpgraded() {
        return false;
    }
}