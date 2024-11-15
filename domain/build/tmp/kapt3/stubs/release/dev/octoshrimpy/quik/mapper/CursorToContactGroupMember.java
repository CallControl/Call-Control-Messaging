package dev.octoshrimpy.quik.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&\u00a8\u0006\u0006"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMember;", "Ldev/octoshrimpy/quik/mapper/Mapper;", "Landroid/database/Cursor;", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMember$GroupMember;", "getGroupMembersCursor", "GroupMember", "domain_release"})
public abstract interface CursorToContactGroupMember extends dev.octoshrimpy.quik.mapper.Mapper<android.database.Cursor, dev.octoshrimpy.quik.mapper.CursorToContactGroupMember.GroupMember> {
    
    @org.jetbrains.annotations.Nullable
    public abstract android.database.Cursor getGroupMembersCursor();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMember$GroupMember;", "", "lookupKey", "", "groupId", "", "(Ljava/lang/String;J)V", "getGroupId", "()J", "getLookupKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"})
    public static final class GroupMember {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String lookupKey = null;
        private final long groupId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.mapper.CursorToContactGroupMember.GroupMember copy(@org.jetbrains.annotations.NotNull
        java.lang.String lookupKey, long groupId) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public GroupMember(@org.jetbrains.annotations.NotNull
        java.lang.String lookupKey, long groupId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLookupKey() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getGroupId() {
            return 0L;
        }
    }
}