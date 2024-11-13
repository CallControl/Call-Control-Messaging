package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Ldev/octoshrimpy/quik/common/util/NotificationManagerImpl;", "Ldev/octoshrimpy/quik/manager/NotificationManager;", "context", "Landroid/content/Context;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "permissions", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/Colors;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/manager/PermissionManager;Ldev/octoshrimpy/quik/util/PhoneNumberUtils;)V", "notificationManager", "Landroid/app/NotificationManager;", "buildNotificationChannelId", "", "threadId", "", "createNotificationChannel", "", "getChannelIdForNotification", "getNotificationChannel", "Landroid/app/NotificationChannel;", "getNotificationForBackup", "Landroidx/core/app/NotificationCompat$Builder;", "getReplyAction", "Landroidx/core/app/NotificationCompat$Action;", "notifyFailed", "msgId", "update", "Companion", "presentation_noAnalyticsRelease"})
@javax.inject.Singleton
public final class NotificationManagerImpl implements dev.octoshrimpy.quik.manager.NotificationManager {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissions = null;
    private final dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.common.util.NotificationManagerImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_CHANNEL_ID = "notifications_default";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BACKUP_RESTORE_CHANNEL_ID = "notifications_backup_restore";
    @org.jetbrains.annotations.NotNull
    private static final long[] VIBRATE_PATTERN = {0L, 200L, 0L, 200L};
    private final android.app.NotificationManager notificationManager = null;
    
    @javax.inject.Inject
    public NotificationManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissions, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils) {
        super();
    }
    
    /**
     * Updates the notification for a particular conversation
     */
    @java.lang.Override
    public void update(long threadId) {
    }
    
    @java.lang.Override
    public void notifyFailed(long msgId) {
    }
    
    private final androidx.core.app.NotificationCompat.Action getReplyAction(long threadId) {
        return null;
    }
    
    /**
     * Creates a notification channel for the given conversation
     */
    @java.lang.Override
    public void createNotificationChannel(long threadId) {
    }
    
    /**
     * Returns the notification channel for the given conversation, or null if it doesn't exist
     */
    private final android.app.NotificationChannel getNotificationChannel(long threadId) {
        return null;
    }
    
    /**
     * Returns the channel id that should be used for a notification based on the threadId
     *
     * If a notification channel for the conversation exists, use the id for that. Otherwise return
     * the default channel id
     */
    private final java.lang.String getChannelIdForNotification(long threadId) {
        return null;
    }
    
    /**
     * Formats a notification channel id for a given thread id, whether the channel exists or not
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String buildNotificationChannelId(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.core.app.NotificationCompat.Builder getNotificationForBackup() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/common/util/NotificationManagerImpl$Companion;", "", "()V", "BACKUP_RESTORE_CHANNEL_ID", "", "DEFAULT_CHANNEL_ID", "VIBRATE_PATTERN", "", "getVIBRATE_PATTERN", "()[J", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final long[] getVIBRATE_PATTERN() {
            return null;
        }
    }
}