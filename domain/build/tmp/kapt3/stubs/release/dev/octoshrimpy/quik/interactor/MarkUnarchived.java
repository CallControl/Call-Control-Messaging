package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/interactor/MarkUnarchived;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "", "", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_release"})
public final class MarkUnarchived extends dev.octoshrimpy.quik.interactor.Interactor<java.util.List<? extends java.lang.Long>> {
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    
    @javax.inject.Inject
    public MarkUnarchived(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> params) {
        return null;
    }
}