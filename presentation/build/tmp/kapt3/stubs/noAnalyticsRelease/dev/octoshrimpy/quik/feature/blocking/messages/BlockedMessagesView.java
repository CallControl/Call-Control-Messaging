package dev.octoshrimpy.quik.feature.blocking.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0015\u001a\u00020\u000eH&J\b\u0010\u0016\u001a\u00020\u000eH&J\u001e\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bH&R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\u00a8\u0006\u001c"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesState;", "backClicked", "Lio/reactivex/Observable;", "getBackClicked", "()Lio/reactivex/Observable;", "confirmDeleteIntent", "", "", "getConfirmDeleteIntent", "conversationClicks", "getConversationClicks", "menuReadyIntent", "", "getMenuReadyIntent", "optionsItemIntent", "", "getOptionsItemIntent", "selectionChanges", "getSelectionChanges", "clearSelection", "goBack", "showBlockingDialog", "conversations", "block", "", "showDeleteDialog", "presentation_noAnalyticsRelease"})
public abstract interface BlockedMessagesView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getMenuReadyIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> getOptionsItemIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> getConversationClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<java.lang.Long>> getSelectionChanges();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<java.lang.Long>> getConfirmDeleteIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getBackClicked();
    
    public abstract void clearSelection();
    
    public abstract void showBlockingDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations, boolean block);
    
    public abstract void showDeleteDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations);
    
    public abstract void goBack();
}