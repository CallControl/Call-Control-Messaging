package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldev/octoshrimpy/quik/interactor/DeleteMessages;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "Ldev/octoshrimpy/quik/interactor/DeleteMessages$Params;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "notificationManager", "Ldev/octoshrimpy/quik/manager/NotificationManager;", "updateBadge", "Ldev/octoshrimpy/quik/interactor/UpdateBadge;", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/manager/NotificationManager;Ldev/octoshrimpy/quik/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_release"})
public final class DeleteMessages extends dev.octoshrimpy.quik.interactor.Interactor<dev.octoshrimpy.quik.interactor.DeleteMessages.Params> {
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.manager.NotificationManager notificationManager = null;
    private final dev.octoshrimpy.quik.interactor.UpdateBadge updateBadge = null;
    
    @javax.inject.Inject
    public DeleteMessages(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.UpdateBadge updateBadge) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteMessages.Params params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/interactor/DeleteMessages$Params;", "", "messageIds", "", "", "threadId", "(Ljava/util/List;J)V", "getMessageIds", "()Ljava/util/List;", "getThreadId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Long> messageIds = null;
        private final long threadId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.interactor.DeleteMessages.Params copy(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> messageIds, long threadId) {
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
        
        public Params(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> messageIds, long threadId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> getMessageIds() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getThreadId() {
            return 0L;
        }
    }
}