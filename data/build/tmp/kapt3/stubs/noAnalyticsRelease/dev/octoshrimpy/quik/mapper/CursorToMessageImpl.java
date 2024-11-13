package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u001c\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToMessageImpl;", "Ldev/octoshrimpy/quik/mapper/CursorToMessage;", "context", "Landroid/content/Context;", "cursorToPart", "Ldev/octoshrimpy/quik/mapper/CursorToPart;", "keys", "Ldev/octoshrimpy/quik/manager/KeyManager;", "permissionManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "preferences", "Ldev/octoshrimpy/quik/util/Preferences;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/mapper/CursorToPart;Ldev/octoshrimpy/quik/manager/KeyManager;Ldev/octoshrimpy/quik/manager/PermissionManager;Ldev/octoshrimpy/quik/util/Preferences;)V", "projection", "", "", "[Ljava/lang/String;", "uri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getMessageCursor", "Landroid/database/Cursor;", "id", "", "getMessagesCursor", "getMmsAddress", "messageId", "map", "Ldev/octoshrimpy/quik/model/Message;", "from", "Lkotlin/Pair;", "Ldev/octoshrimpy/quik/mapper/CursorToMessage$MessageColumns;", "data_noAnalyticsRelease"})
public final class CursorToMessageImpl implements dev.octoshrimpy.quik.mapper.CursorToMessage {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.mapper.CursorToPart cursorToPart = null;
    private final dev.octoshrimpy.quik.manager.KeyManager keys = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissionManager = null;
    private final dev.octoshrimpy.quik.util.Preferences preferences = null;
    private final android.net.Uri uri = null;
    private final java.lang.String[] projection = {"transport_type", "_id", "date", "date_sent", "read", "thread_id", "locked", "address", "body", "seen", "type", "status", "error_code", "sub", "sub_cs", "seen", "m_type", "msg_box", "d_rpt", "rr", "err_type", "st"};
    
    @javax.inject.Inject
    public CursorToMessageImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToPart cursorToPart, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.KeyManager keys, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissionManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Message map(@org.jetbrains.annotations.NotNull
    kotlin.Pair<? extends android.database.Cursor, dev.octoshrimpy.quik.mapper.CursorToMessage.MessageColumns> from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getMessagesCursor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getMessageCursor(long id) {
        return null;
    }
    
    private final java.lang.String getMmsAddress(long messageId) {
        return null;
    }
}