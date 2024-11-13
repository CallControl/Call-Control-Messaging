package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003()*B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0014H\u0017J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0014H\u0016J\b\u0010\'\u001a\u00020#H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl;", "Ldev/octoshrimpy/quik/repository/BackupRepository;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "syncRepo", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/repository/SyncRepository;)V", "backupProgress", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/repository/BackupRepository$Progress;", "restoreProgress", "stopFlag", "", "getBackupDocumentTree", "Landroidx/documentfile/provider/DocumentFile;", "getBackupPathUriForPicker", "Landroid/net/Uri;", "getBackupProgress", "Lio/reactivex/Observable;", "getDefaultBackupPath", "", "getRestoreProgress", "isBackupOrRestoreRunning", "messageToBackupMessage", "Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl$BackupMessage;", "message", "Ldev/octoshrimpy/quik/model/Message;", "parseBackup", "Ldev/octoshrimpy/quik/model/BackupFile;", "uri", "performBackup", "", "performRestore", "persistBackupDirectory", "directory", "stopRestore", "Backup", "BackupMessage", "BackupMetadata", "data_noAnalyticsRelease"})
@javax.inject.Singleton
public final class BackupRepositoryImpl implements dev.octoshrimpy.quik.repository.BackupRepository {
    private final android.content.Context context = null;
    private final com.squareup.moshi.Moshi moshi = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.repository.SyncRepository syncRepo = null;
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.repository.BackupRepository.Progress> backupProgress = null;
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.repository.BackupRepository.Progress> restoreProgress = null;
    @kotlin.jvm.Volatile
    private volatile boolean stopFlag = false;
    
    @javax.inject.Inject
    public BackupRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository syncRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getDefaultBackupPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public androidx.documentfile.provider.DocumentFile getBackupDocumentTree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.net.Uri getBackupPathUriForPicker() {
        return null;
    }
    
    @java.lang.Override
    public void persistBackupDirectory(@org.jetbrains.annotations.NotNull
    android.net.Uri directory) {
    }
    
    @java.lang.Override
    public void performBackup() {
    }
    
    private final dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage messageToBackupMessage(dev.octoshrimpy.quik.model.Message message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<dev.octoshrimpy.quik.repository.BackupRepository.Progress> getBackupProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"Recycle"})
    @java.lang.Override
    public dev.octoshrimpy.quik.model.BackupFile parseBackup(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    @java.lang.Override
    public void performRestore(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<dev.octoshrimpy.quik.repository.BackupRepository.Progress> getRestoreProgress() {
        return null;
    }
    
    @java.lang.Override
    public void stopRestore() {
    }
    
    private final boolean isBackupOrRestoreRunning() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl$Backup;", "", "messageCount", "", "messages", "", "Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl$BackupMessage;", "(ILjava/util/List;)V", "getMessageCount", "()I", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "data_noAnalyticsRelease"})
    public static final class Backup {
        private final int messageCount = 0;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage> messages = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.repository.BackupRepositoryImpl.Backup copy(int messageCount, @org.jetbrains.annotations.NotNull
        java.util.List<dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage> messages) {
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
        
        public Backup() {
            super();
        }
        
        public Backup(int messageCount, @org.jetbrains.annotations.NotNull
        java.util.List<dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage> messages) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getMessageCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage> getMessages() {
            return null;
        }
    }
    
    /**
     * Simpler version of [Backup] which allows us to read certain fields from the backup without
     * needing to parse the entire file
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl$BackupMetadata;", "", "messageCount", "", "(I)V", "getMessageCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "data_noAnalyticsRelease"})
    public static final class BackupMetadata {
        private final int messageCount = 0;
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMetadata copy(int messageCount) {
            return null;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public BackupMetadata() {
            super();
        }
        
        public BackupMetadata(int messageCount) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getMessageCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\'\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jy\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b\u00a8\u00061"}, d2 = {"Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl$BackupMessage;", "", "type", "", "address", "", "date", "", "dateSent", "read", "", "status", "body", "protocol", "serviceCenter", "locked", "subId", "(ILjava/lang/String;JJZILjava/lang/String;ILjava/lang/String;ZI)V", "getAddress", "()Ljava/lang/String;", "getBody", "getDate", "()J", "getDateSent", "getLocked", "()Z", "getProtocol", "()I", "getRead", "getServiceCenter", "getStatus", "getSubId", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_noAnalyticsRelease"})
    public static final class BackupMessage {
        private final int type = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String address = null;
        private final long date = 0L;
        private final long dateSent = 0L;
        private final boolean read = false;
        private final int status = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String body = null;
        private final int protocol = 0;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String serviceCenter = null;
        private final boolean locked = false;
        private final int subId = 0;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.repository.BackupRepositoryImpl.BackupMessage copy(int type, @org.jetbrains.annotations.NotNull
        java.lang.String address, long date, long dateSent, boolean read, int status, @org.jetbrains.annotations.NotNull
        java.lang.String body, int protocol, @org.jetbrains.annotations.Nullable
        java.lang.String serviceCenter, boolean locked, int subId) {
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
        
        public BackupMessage(int type, @org.jetbrains.annotations.NotNull
        java.lang.String address, long date, long dateSent, boolean read, int status, @org.jetbrains.annotations.NotNull
        java.lang.String body, int protocol, @org.jetbrains.annotations.Nullable
        java.lang.String serviceCenter, boolean locked, int subId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getDate() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final long getDateSent() {
            return 0L;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean getRead() {
            return false;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getStatus() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBody() {
            return null;
        }
        
        public final int component8() {
            return 0;
        }
        
        public final int getProtocol() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getServiceCenter() {
            return null;
        }
        
        public final boolean component10() {
            return false;
        }
        
        public final boolean getLocked() {
            return false;
        }
        
        public final int component11() {
            return 0;
        }
        
        public final int getSubId() {
            return 0;
        }
    }
}