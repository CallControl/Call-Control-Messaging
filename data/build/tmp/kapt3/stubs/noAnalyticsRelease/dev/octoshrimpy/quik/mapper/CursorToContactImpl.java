package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToContactImpl;", "Ldev/octoshrimpy/quik/mapper/CursorToContact;", "context", "Landroid/content/Context;", "permissionManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/manager/PermissionManager;)V", "getContactsCursor", "Landroid/database/Cursor;", "map", "Ldev/octoshrimpy/quik/model/Contact;", "from", "Companion", "data_noAnalyticsRelease"})
public final class CursorToContactImpl implements dev.octoshrimpy.quik.mapper.CursorToContact {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissionManager = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.mapper.CursorToContactImpl.Companion Companion = null;
    private static final android.net.Uri URI = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] PROJECTION = {"_id", "lookup", "account_type_and_data_set", "data1", "data2", "data3", "display_name", "photo_uri", "starred", "contact_last_updated_timestamp"};
    public static final int COLUMN_ID = 0;
    public static final int COLUMN_LOOKUP_KEY = 1;
    public static final int COLUMN_ACCOUNT_TYPE = 2;
    public static final int COLUMN_NUMBER = 3;
    public static final int COLUMN_TYPE = 4;
    public static final int COLUMN_LABEL = 5;
    public static final int COLUMN_DISPLAY_NAME = 6;
    public static final int COLUMN_PHOTO_URI = 7;
    public static final int COLUMN_STARRED = 8;
    public static final int CONTACT_LAST_UPDATED = 9;
    
    @javax.inject.Inject
    public CursorToContactImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Contact map(@org.jetbrains.annotations.NotNull
    android.database.Cursor from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getContactsCursor() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToContactImpl$Companion;", "", "()V", "COLUMN_ACCOUNT_TYPE", "", "COLUMN_DISPLAY_NAME", "COLUMN_ID", "COLUMN_LABEL", "COLUMN_LOOKUP_KEY", "COLUMN_NUMBER", "COLUMN_PHOTO_URI", "COLUMN_STARRED", "COLUMN_TYPE", "CONTACT_LAST_UPDATED", "PROJECTION", "", "", "getPROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getURI", "()Landroid/net/Uri;", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final android.net.Uri getURI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getPROJECTION() {
            return null;
        }
    }
}