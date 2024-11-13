package dev.octoshrimpy.quik.feature.blocking.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesView;", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesState;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "blockingClient", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "deleteConversations", "Ldev/octoshrimpy/quik/interactor/DeleteConversations;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/blocking/BlockingClient;Ldev/octoshrimpy/quik/interactor/DeleteConversations;Ldev/octoshrimpy/quik/common/Navigator;)V", "bindIntents", "", "view", "presentation_noAnalyticsRelease"})
public final class BlockedMessagesPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesView, dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesState> {
    private final dev.octoshrimpy.quik.blocking.BlockingClient blockingClient = null;
    private final dev.octoshrimpy.quik.interactor.DeleteConversations deleteConversations = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    
    @javax.inject.Inject
    public BlockedMessagesPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.BlockingClient blockingClient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteConversations deleteConversations, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesView view) {
    }
}