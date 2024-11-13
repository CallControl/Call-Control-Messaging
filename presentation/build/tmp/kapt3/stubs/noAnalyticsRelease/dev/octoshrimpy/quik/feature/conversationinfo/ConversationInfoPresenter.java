package dev.octoshrimpy.quik.feature.conversationinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoPresenter;", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoView;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoState;", "threadId", "", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "context", "Landroid/content/Context;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "deleteConversations", "Ldev/octoshrimpy/quik/interactor/DeleteConversations;", "markArchived", "Ldev/octoshrimpy/quik/interactor/MarkArchived;", "markUnarchived", "Ldev/octoshrimpy/quik/interactor/MarkUnarchived;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "permissionManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "(JLdev/octoshrimpy/quik/repository/MessageRepository;Landroid/content/Context;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/interactor/DeleteConversations;Ldev/octoshrimpy/quik/interactor/MarkArchived;Ldev/octoshrimpy/quik/interactor/MarkUnarchived;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/manager/PermissionManager;)V", "conversation", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/model/Conversation;", "bindIntents", "", "view", "presentation_noAnalyticsRelease"})
public final class ConversationInfoPresenter extends dev.octoshrimpy.quik.common.base.QkPresenter<dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoView, dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoState> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.interactor.DeleteConversations deleteConversations = null;
    private final dev.octoshrimpy.quik.interactor.MarkArchived markArchived = null;
    private final dev.octoshrimpy.quik.interactor.MarkUnarchived markUnarchived = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissionManager = null;
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Conversation> conversation = null;
    
    @javax.inject.Inject
    public ConversationInfoPresenter(@javax.inject.Named(value = "threadId")
    long threadId, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteConversations deleteConversations, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkArchived markArchived, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkUnarchived markUnarchived, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissionManager) {
        super(null);
    }
    
    @java.lang.Override
    public void bindIntents(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoView view) {
    }
}