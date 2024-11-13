package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/interactor/MarkAllSeen;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "(Ldev/octoshrimpy/quik/repository/MessageRepository;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Flowable;", "domain_release"})
public final class MarkAllSeen extends dev.octoshrimpy.quik.interactor.Interactor<kotlin.Unit> {
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    
    @javax.inject.Inject
    public MarkAllSeen(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<kotlin.Unit> buildObservable(@org.jetbrains.annotations.NotNull
    kotlin.Unit params) {
        return null;
    }
}