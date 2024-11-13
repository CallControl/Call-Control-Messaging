package dev.octoshrimpy.quik.feature.blocking.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BO\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerView;", "Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerState;", "analytics", "Ldev/octoshrimpy/quik/manager/AnalyticsManager;", "callBlocker", "Ldev/octoshrimpy/quik/blocking/CallBlockerBlockingClient;", "callControl", "Ldev/octoshrimpy/quik/blocking/CallControlBlockingClient;", "context", "Landroid/content/Context;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "qksms", "Ldev/octoshrimpy/quik/blocking/QksmsBlockingClient;", "shouldIAnswer", "Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient;", "(Ldev/octoshrimpy/quik/manager/AnalyticsManager;Ldev/octoshrimpy/quik/blocking/CallBlockerBlockingClient;Ldev/octoshrimpy/quik/blocking/CallControlBlockingClient;Landroid/content/Context;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/blocking/QksmsBlockingClient;Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient;)V", "bindIntents", "", "view", "getAddressesToBlock", "", "", "client", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "presentation_noAnalyticsRelease"})
public final class BlockingManagerPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerView, dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerState> {
    private final dev.octoshrimpy.quik.manager.AnalyticsManager analytics = null;
    private final dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient callBlocker = null;
    private final dev.octoshrimpy.quik.blocking.CallControlBlockingClient callControl = null;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.blocking.QksmsBlockingClient qksms = null;
    private final dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient shouldIAnswer = null;
    
    @javax.inject.Inject
    public BlockingManagerPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.AnalyticsManager analytics, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient callBlocker, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.CallControlBlockingClient callControl, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.QksmsBlockingClient qksms, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient shouldIAnswer) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerView view) {
    }
    
    private final java.util.List<java.lang.String> getAddressesToBlock(dev.octoshrimpy.quik.blocking.BlockingClient client) {
        return null;
    }
}