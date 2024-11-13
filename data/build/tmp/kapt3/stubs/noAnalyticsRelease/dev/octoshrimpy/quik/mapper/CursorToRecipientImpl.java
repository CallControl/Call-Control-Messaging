package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToRecipientImpl;", "Ldev/octoshrimpy/quik/mapper/CursorToRecipient;", "context", "Landroid/content/Context;", "permissionManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/manager/PermissionManager;)V", "getRecipientCursor", "Landroid/database/Cursor;", "id", "", "map", "Ldev/octoshrimpy/quik/model/Recipient;", "from", "Companion", "data_noAnalyticsRelease"})
public final class CursorToRecipientImpl implements dev.octoshrimpy.quik.mapper.CursorToRecipient {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissionManager = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.mapper.CursorToRecipientImpl.Companion Companion = null;
    private static final android.net.Uri URI = null;
    public static final int COLUMN_ID = 0;
    public static final int COLUMN_ADDRESS = 1;
    
    @javax.inject.Inject
    public CursorToRecipientImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Recipient map(@org.jetbrains.annotations.NotNull
    android.database.Cursor from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getRecipientCursor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getRecipientCursor(long id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToRecipientImpl$Companion;", "", "()V", "COLUMN_ADDRESS", "", "COLUMN_ID", "URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getURI", "()Landroid/net/Uri;", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final android.net.Uri getURI() {
            return null;
        }
    }
}