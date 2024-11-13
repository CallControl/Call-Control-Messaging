package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToRecipient;", "Ldev/octoshrimpy/quik/mapper/Mapper;", "Landroid/database/Cursor;", "Ldev/octoshrimpy/quik/model/Recipient;", "getRecipientCursor", "id", "", "domain_release"})
public abstract interface CursorToRecipient extends dev.octoshrimpy.quik.mapper.Mapper<android.database.Cursor, dev.octoshrimpy.quik.model.Recipient> {
    
    @org.jetbrains.annotations.Nullable
    public abstract android.database.Cursor getRecipientCursor();
    
    @org.jetbrains.annotations.Nullable
    public abstract android.database.Cursor getRecipientCursor(long id);
}