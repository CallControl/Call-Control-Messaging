package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToConversationImpl;", "Ldev/octoshrimpy/quik/mapper/CursorToConversation;", "context", "Landroid/content/Context;", "permissionManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/manager/PermissionManager;)V", "getConversationsCursor", "Landroid/database/Cursor;", "map", "Ldev/octoshrimpy/quik/model/Conversation;", "from", "Companion", "data_noAnalyticsRelease"})
public final class CursorToConversationImpl implements dev.octoshrimpy.quik.mapper.CursorToConversation {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissionManager = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.mapper.CursorToConversationImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final android.net.Uri URI = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] PROJECTION = {"_id", "recipient_ids"};
    public static final int ID = 0;
    public static final int RECIPIENT_IDS = 1;
    
    @javax.inject.Inject
    public CursorToConversationImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Conversation map(@org.jetbrains.annotations.NotNull
    android.database.Cursor from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getConversationsCursor() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToConversationImpl$Companion;", "", "()V", "ID", "", "PROJECTION", "", "", "getPROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "RECIPIENT_IDS", "URI", "Landroid/net/Uri;", "getURI", "()Landroid/net/Uri;", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.net.Uri getURI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getPROJECTION() {
            return null;
        }
    }
}