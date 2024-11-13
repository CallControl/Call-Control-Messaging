package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/interactor/MarkPinned;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "", "", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "updateBadge", "Ldev/octoshrimpy/quik/interactor/UpdateBadge;", "shortcutManager", "Ldev/octoshrimpy/quik/manager/ShortcutManager;", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/interactor/UpdateBadge;Ldev/octoshrimpy/quik/manager/ShortcutManager;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_release"})
public final class MarkPinned extends dev.octoshrimpy.quik.interactor.Interactor<java.util.List<? extends java.lang.Long>> {
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.interactor.UpdateBadge updateBadge = null;
    private final dev.octoshrimpy.quik.manager.ShortcutManager shortcutManager = null;
    
    @javax.inject.Inject
    public MarkPinned(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.UpdateBadge updateBadge, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ShortcutManager shortcutManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> params) {
        return null;
    }
}