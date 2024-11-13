package dev.octoshrimpy.quik.feature.blocking.numbers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersView;", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersState;", "blockingRepo", "Ldev/octoshrimpy/quik/repository/BlockingRepository;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "markUnblocked", "Ldev/octoshrimpy/quik/interactor/MarkUnblocked;", "(Ldev/octoshrimpy/quik/repository/BlockingRepository;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/interactor/MarkUnblocked;)V", "bindIntents", "", "view", "presentation_noAnalyticsRelease"})
public final class BlockedNumbersPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersView, dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersState> {
    private final dev.octoshrimpy.quik.repository.BlockingRepository blockingRepo = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.interactor.MarkUnblocked markUnblocked = null;
    
    @javax.inject.Inject
    public BlockedNumbersPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BlockingRepository blockingRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkUnblocked markUnblocked) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersView view) {
    }
}