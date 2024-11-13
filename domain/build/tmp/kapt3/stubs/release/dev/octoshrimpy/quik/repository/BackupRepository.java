package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0010H&\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository;", "", "getBackupDocumentTree", "Landroidx/documentfile/provider/DocumentFile;", "getBackupPathUriForPicker", "Landroid/net/Uri;", "getBackupProgress", "Lio/reactivex/Observable;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "getDefaultBackupPath", "", "getRestoreProgress", "parseBackup", "Ldev/octoshrimpy/quik/model/BackupFile;", "uri", "performBackup", "", "performRestore", "persistBackupDirectory", "directory", "stopRestore", "Progress", "domain_release"})
public abstract interface BackupRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getDefaultBackupPath();
    
    @org.jetbrains.annotations.Nullable
    public abstract androidx.documentfile.provider.DocumentFile getBackupDocumentTree();
    
    @org.jetbrains.annotations.NotNull
    public abstract android.net.Uri getBackupPathUriForPicker();
    
    public abstract void persistBackupDirectory(@org.jetbrains.annotations.NotNull
    android.net.Uri directory);
    
    public abstract void performBackup();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.repository.BackupRepository.Progress> getBackupProgress();
    
    @org.jetbrains.annotations.NotNull
    public abstract dev.octoshrimpy.quik.model.BackupFile parseBackup(@org.jetbrains.annotations.NotNull
    android.net.Uri uri);
    
    public abstract void performRestore(@org.jetbrains.annotations.NotNull
    android.net.Uri uri);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.repository.BackupRepository.Progress> getRestoreProgress();
    
    public abstract void stopRestore();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "", "running", "", "indeterminate", "(ZZ)V", "getIndeterminate", "()Z", "getRunning", "Finished", "Idle", "Parsing", "Running", "Saving", "Syncing", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Finished;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Idle;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Parsing;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Running;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Saving;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Syncing;", "domain_release"})
    public static abstract class Progress {
        private final boolean running = false;
        private final boolean indeterminate = false;
        
        private Progress(boolean running, boolean indeterminate) {
            super();
        }
        
        public final boolean getRunning() {
            return false;
        }
        
        public final boolean getIndeterminate() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Idle;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "()V", "domain_release"})
        public static final class Idle extends dev.octoshrimpy.quik.repository.BackupRepository.Progress {
            
            public Idle() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Parsing;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "()V", "domain_release"})
        public static final class Parsing extends dev.octoshrimpy.quik.repository.BackupRepository.Progress {
            
            public Parsing() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Running;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "max", "", "count", "(II)V", "getCount", "()I", "getMax", "domain_release"})
        public static final class Running extends dev.octoshrimpy.quik.repository.BackupRepository.Progress {
            private final int max = 0;
            private final int count = 0;
            
            public Running(int max, int count) {
                super(false, false);
            }
            
            public final int getMax() {
                return 0;
            }
            
            public final int getCount() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Saving;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "()V", "domain_release"})
        public static final class Saving extends dev.octoshrimpy.quik.repository.BackupRepository.Progress {
            
            public Saving() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Syncing;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "()V", "domain_release"})
        public static final class Syncing extends dev.octoshrimpy.quik.repository.BackupRepository.Progress {
            
            public Syncing() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepository$Progress$Finished;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "()V", "domain_release"})
        public static final class Finished extends dev.octoshrimpy.quik.repository.BackupRepository.Progress {
            
            public Finished() {
                super(false, false);
            }
        }
    }
}