package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToPart;", "Ldev/octoshrimpy/quik/mapper/Mapper;", "Landroid/database/Cursor;", "Ldev/octoshrimpy/quik/model/MmsPart;", "getPartsCursor", "messageId", "", "(Ljava/lang/Long;)Landroid/database/Cursor;", "domain_release"})
public abstract interface CursorToPart extends dev.octoshrimpy.quik.mapper.Mapper<android.database.Cursor, dev.octoshrimpy.quik.model.MmsPart> {
    
    @org.jetbrains.annotations.Nullable
    public abstract android.database.Cursor getPartsCursor(@org.jetbrains.annotations.Nullable
    java.lang.Long messageId);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}