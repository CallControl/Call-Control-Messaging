package dev.octoshrimpy.quik.feature.conversationinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&J\f\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\b\u0010\u0010\u001a\u00020\u0011H&J\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0011H&J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000bH&J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\tH&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&\u00a8\u0006\u001d"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoState;", "archiveClicks", "Lio/reactivex/Observable;", "blockClicks", "confirmDelete", "deleteClicks", "mediaClicks", "", "nameChanges", "", "nameClicks", "notificationClicks", "recipientClicks", "recipientLongClicks", "requestDefaultSms", "", "showBlockingDialog", "conversations", "", "block", "", "showDeleteDialog", "showNameDialog", "name", "showThemePicker", "recipientId", "themeClicks", "presentation_noAnalyticsRelease"})
public abstract interface ConversationInfoView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> recipientClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> recipientLongClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> themeClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> nameClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.String> nameChanges();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> notificationClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> archiveClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> blockClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> deleteClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> confirmDelete();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> mediaClicks();
    
    public abstract void showNameDialog(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void showThemePicker(long recipientId);
    
    public abstract void showBlockingDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations, boolean block);
    
    public abstract void requestDefaultSms();
    
    public abstract void showDeleteDialog();
}