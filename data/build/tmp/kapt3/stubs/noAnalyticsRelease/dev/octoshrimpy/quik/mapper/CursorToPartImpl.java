package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToPartImpl;", "Ldev/octoshrimpy/quik/mapper/CursorToPart;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPartsCursor", "Landroid/database/Cursor;", "messageId", "", "(Ljava/lang/Long;)Landroid/database/Cursor;", "map", "Ldev/octoshrimpy/quik/model/MmsPart;", "from", "Companion", "data_noAnalyticsRelease"})
public final class CursorToPartImpl implements dev.octoshrimpy.quik.mapper.CursorToPart {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.mapper.CursorToPartImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final android.net.Uri CONTENT_URI = null;
    
    @javax.inject.Inject
    public CursorToPartImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.MmsPart map(@org.jetbrains.annotations.NotNull
    android.database.Cursor from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.database.Cursor getPartsCursor(@org.jetbrains.annotations.Nullable
    java.lang.Long messageId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToPartImpl$Companion;", "", "()V", "CONTENT_URI", "Landroid/net/Uri;", "getCONTENT_URI", "()Landroid/net/Uri;", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.net.Uri getCONTENT_URI() {
            return null;
        }
    }
}