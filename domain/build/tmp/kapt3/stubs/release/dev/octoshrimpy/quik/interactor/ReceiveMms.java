package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldev/octoshrimpy/quik/interactor/ReceiveMms;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "Landroid/net/Uri;", "activeConversationManager", "Ldev/octoshrimpy/quik/manager/ActiveConversationManager;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "blockingClient", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "syncManager", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "notificationManager", "Ldev/octoshrimpy/quik/manager/NotificationManager;", "updateBadge", "Ldev/octoshrimpy/quik/interactor/UpdateBadge;", "(Ldev/octoshrimpy/quik/manager/ActiveConversationManager;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/blocking/BlockingClient;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/repository/SyncRepository;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/manager/NotificationManager;Ldev/octoshrimpy/quik/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_release"})
public final class ReceiveMms extends dev.octoshrimpy.quik.interactor.Interactor<android.net.Uri> {
    private final dev.octoshrimpy.quik.manager.ActiveConversationManager activeConversationManager = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.blocking.BlockingClient blockingClient = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.repository.SyncRepository syncManager = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.manager.NotificationManager notificationManager = null;
    private final dev.octoshrimpy.quik.interactor.UpdateBadge updateBadge = null;
    
    @javax.inject.Inject
    public ReceiveMms(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ActiveConversationManager activeConversationManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.BlockingClient blockingClient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository syncManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.UpdateBadge updateBadge) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    android.net.Uri params) {
        return null;
    }
}