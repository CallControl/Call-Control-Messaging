package dev.octoshrimpy.quik.feature.qkreply;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0016R?\u0010\u0015\u001a&\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u0017 \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Ldev/octoshrimpy/quik/feature/qkreply/QkReplyViewModel;", "Ldev/octoshrimpy/quik/common/base/QkViewModel;", "Ldev/octoshrimpy/quik/feature/qkreply/QkReplyView;", "Ldev/octoshrimpy/quik/feature/qkreply/QkReplyState;", "threadId", "", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "deleteMessages", "Ldev/octoshrimpy/quik/interactor/DeleteMessages;", "markRead", "Ldev/octoshrimpy/quik/interactor/MarkRead;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "sendMessage", "Ldev/octoshrimpy/quik/interactor/SendMessage;", "subscriptionManager", "Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;", "(JLdev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/interactor/DeleteMessages;Ldev/octoshrimpy/quik/interactor/MarkRead;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/interactor/SendMessage;Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;)V", "conversation", "Lio/reactivex/Observable;", "Ldev/octoshrimpy/quik/model/Conversation;", "kotlin.jvm.PlatformType", "getConversation", "()Lio/reactivex/Observable;", "conversation$delegate", "Lkotlin/Lazy;", "messages", "Lio/reactivex/subjects/Subject;", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Message;", "bindView", "", "view", "presentation_noAnalyticsRelease"})
public final class QkReplyViewModel extends dev.octoshrimpy.quik.common.base.QkViewModel<dev.octoshrimpy.quik.feature.qkreply.QkReplyView, dev.octoshrimpy.quik.feature.qkreply.QkReplyState> {
    private final long threadId = 0L;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.interactor.DeleteMessages deleteMessages = null;
    private final dev.octoshrimpy.quik.interactor.MarkRead markRead = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.interactor.SendMessage sendMessage = null;
    private final dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager = null;
    private final kotlin.Lazy conversation$delegate = null;
    private final io.reactivex.subjects.Subject<io.realm.RealmResults<dev.octoshrimpy.quik.model.Message>> messages = null;
    
    @javax.inject.Inject
    public QkReplyViewModel(@javax.inject.Named(value = "threadId")
    long threadId, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteMessages deleteMessages, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkRead markRead, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SendMessage sendMessage, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager) {
        super(null);
    }
    
    private final io.reactivex.Observable<dev.octoshrimpy.quik.model.Conversation> getConversation() {
        return null;
    }
    
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.qkreply.QkReplyView view) {
    }
}