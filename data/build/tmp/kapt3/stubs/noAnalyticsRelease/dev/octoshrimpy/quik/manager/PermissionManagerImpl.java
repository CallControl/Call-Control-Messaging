package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/manager/PermissionManagerImpl;", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "notificationManager", "Landroid/app/NotificationManager;", "hasCalling", "", "hasContacts", "hasExactAlarms", "hasNotifications", "hasPermission", "permission", "", "hasPhone", "hasReadSms", "hasSendSms", "hasStorage", "isDefaultSms", "data_noAnalyticsRelease"})
public final class PermissionManagerImpl implements dev.octoshrimpy.quik.manager.PermissionManager {
    private final android.content.Context context = null;
    private final android.app.NotificationManager notificationManager = null;
    
    @javax.inject.Inject
    public PermissionManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public boolean isDefaultSms() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasReadSms() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasSendSms() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasContacts() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasNotifications() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasPhone() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasCalling() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasStorage() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasExactAlarms() {
        return false;
    }
    
    private final boolean hasPermission(java.lang.String permission) {
        return false;
    }
}