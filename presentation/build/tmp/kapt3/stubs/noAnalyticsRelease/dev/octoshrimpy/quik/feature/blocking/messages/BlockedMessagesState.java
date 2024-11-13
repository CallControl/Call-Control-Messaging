package dev.octoshrimpy.quik.feature.blocking.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesState;", "", "data", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Conversation;", "selected", "", "(Lio/realm/RealmResults;I)V", "getData", "()Lio/realm/RealmResults;", "getSelected", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "presentation_noAnalyticsRelease"})
public final class BlockedMessagesState {
    @org.jetbrains.annotations.Nullable
    private final io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> data = null;
    private final int selected = 0;
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesState copy(@org.jetbrains.annotations.Nullable
    io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> data, int selected) {
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
    
    public BlockedMessagesState() {
        super();
    }
    
    public BlockedMessagesState(@org.jetbrains.annotations.Nullable
    io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> data, int selected) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> getData() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSelected() {
        return 0;
    }
}