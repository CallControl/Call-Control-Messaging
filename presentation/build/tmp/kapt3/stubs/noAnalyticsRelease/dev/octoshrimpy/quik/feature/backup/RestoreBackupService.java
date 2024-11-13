package dev.octoshrimpy.quik.feature.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\b\u0010 \u001a\u00020\u001aH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Ldev/octoshrimpy/quik/feature/backup/RestoreBackupService;", "Landroid/app/Service;", "()V", "backupRepo", "Ldev/octoshrimpy/quik/repository/BackupRepository;", "getBackupRepo", "()Ldev/octoshrimpy/quik/repository/BackupRepository;", "setBackupRepo", "(Ldev/octoshrimpy/quik/repository/BackupRepository;)V", "notification", "Landroidx/core/app/NotificationCompat$Builder;", "getNotification", "()Landroidx/core/app/NotificationCompat$Builder;", "notification$delegate", "Lkotlin/Lazy;", "notificationManager", "Ldev/octoshrimpy/quik/manager/NotificationManager;", "getNotificationManager", "()Ldev/octoshrimpy/quik/manager/NotificationManager;", "setNotificationManager", "(Ldev/octoshrimpy/quik/manager/NotificationManager;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onStartCommand", "", "flags", "startId", "start", "stop", "Companion", "presentation_noAnalyticsRelease"})
public final class RestoreBackupService extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.feature.backup.RestoreBackupService.Companion Companion = null;
    private static final int NOTIFICATION_ID = -1;
    private static final java.lang.String ACTION_START = "dev.octoshrimpy.quik.ACTION_START";
    private static final java.lang.String ACTION_STOP = "dev.octoshrimpy.quik.ACTION_STOP";
    private static final java.lang.String EXTRA_FILE_URI = "dev.octoshrimpy.quik.EXTRA_FILE_URI";
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.BackupRepository backupRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.manager.NotificationManager notificationManager;
    private final kotlin.Lazy notification$delegate = null;
    
    public RestoreBackupService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.BackupRepository getBackupRepo() {
        return null;
    }
    
    public final void setBackupRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.manager.NotificationManager getNotificationManager() {
        return null;
    }
    
    public final void setNotificationManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.NotificationManager p0) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder getNotification() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.NotNull
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void start(android.content.Intent intent) {
    }
    
    private final void stop() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/feature/backup/RestoreBackupService$Companion;", "", "()V", "ACTION_START", "", "ACTION_STOP", "EXTRA_FILE_URI", "NOTIFICATION_ID", "", "start", "", "context", "Landroid/content/Context;", "backupFile", "Landroid/net/Uri;", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.net.Uri backupFile) {
        }
    }
}