package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/interactor/DeleteOldMessages;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/util/Preferences;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Flowable;", "domain_release"})
public final class DeleteOldMessages extends dev.octoshrimpy.quik.interactor.Interactor<kotlin.Unit> {
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    
    @javax.inject.Inject
    public DeleteOldMessages(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    kotlin.Unit params) {
        return null;
    }
}