package dev.octoshrimpy.quik.feature.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u001a\u001a\u00020\u0010J=\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/BlockingDialog;", "", "blockingManager", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "context", "Landroid/content/Context;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "markBlocked", "Ldev/octoshrimpy/quik/interactor/MarkBlocked;", "markUnblocked", "Ldev/octoshrimpy/quik/interactor/MarkUnblocked;", "(Ldev/octoshrimpy/quik/blocking/BlockingClient;Landroid/content/Context;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/interactor/MarkBlocked;Ldev/octoshrimpy/quik/interactor/MarkUnblocked;)V", "allBlocked", "", "addresses", "", "", "show", "Lkotlinx/coroutines/Job;", "activity", "Landroid/app/Activity;", "conversationIds", "", "block", "showDialog", "", "(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_noAnalyticsRelease"})
public final class BlockingDialog {
    private final dev.octoshrimpy.quik.blocking.BlockingClient blockingManager = null;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.interactor.MarkBlocked markBlocked = null;
    private final dev.octoshrimpy.quik.interactor.MarkUnblocked markUnblocked = null;
    
    @javax.inject.Inject
    public BlockingDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.BlockingClient blockingManager, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkBlocked markBlocked, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkUnblocked markUnblocked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job show(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversationIds, boolean block) {
        return null;
    }
    
    private final boolean allBlocked(java.util.List<java.lang.String> addresses) {
        return false;
    }
    
    private final java.lang.Object showDialog(android.app.Activity activity, java.util.List<java.lang.Long> conversationIds, java.util.List<java.lang.String> addresses, boolean block, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}