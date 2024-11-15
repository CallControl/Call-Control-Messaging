package dev.octoshrimpy.quik.feature.conversationinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoState;", "", "threadId", "", "data", "", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem;", "hasError", "", "(JLjava/util/List;Z)V", "getData", "()Ljava/util/List;", "getHasError", "()Z", "getThreadId", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
public final class ConversationInfoState {
    private final long threadId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem> data = null;
    private final boolean hasError = false;
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoState copy(long threadId, @org.jetbrains.annotations.NotNull
    java.util.List<? extends dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem> data, boolean hasError) {
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
    
    public ConversationInfoState() {
        super();
    }
    
    public ConversationInfoState(long threadId, @org.jetbrains.annotations.NotNull
    java.util.List<? extends dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem> data, boolean hasError) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getThreadId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem> getData() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getHasError() {
        return false;
    }
}