package dev.octoshrimpy.quik.feature.compose;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u001b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010J\u001a\u00020\u000bH&J\b\u0010K\u001a\u00020\u000bH&J\b\u0010L\u001a\u00020\u000bH&J\b\u0010M\u001a\u00020\u000bH&J\b\u0010N\u001a\u00020\u000bH&J\b\u0010O\u001a\u00020\u000bH&J\b\u0010P\u001a\u00020\u000bH&J\b\u0010Q\u001a\u00020\u000bH&J\u0010\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u001aH&J\u0010\u0010T\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020#H&J\u001e\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u00052\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001f0\'H&J\u0016\u0010Y\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001a0\'H&J\u0010\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020#H&J\b\u0010]\u001a\u00020\u000bH&J\u0012\u0010^\u001a\u00020\u000b2\b\b\u0001\u0010_\u001a\u000209H&J\b\u0010`\u001a\u00020\u000bH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0016\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0011R8\u0010!\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#0\"j\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#`$0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u001e\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\'0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0007R\u0016\u0010+\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0007R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u0011R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u001e\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\'0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0018\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u0007R\u0016\u0010;\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u0007R\u0016\u0010=\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u0007R\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b@\u0010\u0007R\u0016\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\bB\u0010\u0007R\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\bD\u0010\u0007R\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\bG\u0010\u0007R\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\bI\u0010\u0011\u00a8\u0006a"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/ComposeView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/compose/ComposeState;", "activityVisibleIntent", "Lio/reactivex/Observable;", "", "getActivityVisibleIntent", "()Lio/reactivex/Observable;", "attachContactIntent", "getAttachContactIntent", "attachIntent", "", "getAttachIntent", "attachmentDeletedIntent", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/model/Attachment;", "getAttachmentDeletedIntent", "()Lio/reactivex/subjects/Subject;", "attachmentSelectedIntent", "Landroid/net/Uri;", "getAttachmentSelectedIntent", "backPressedIntent", "getBackPressedIntent", "cameraIntent", "getCameraIntent", "cancelSendingIntent", "", "getCancelSendingIntent", "changeSimIntent", "getChangeSimIntent", "chipDeletedIntent", "Ldev/octoshrimpy/quik/model/Recipient;", "getChipDeletedIntent", "chipsSelectedIntent", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getChipsSelectedIntent", "confirmDeleteIntent", "", "getConfirmDeleteIntent", "contactSelectedIntent", "getContactSelectedIntent", "galleryIntent", "getGalleryIntent", "inputContentIntent", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "getInputContentIntent", "menuReadyIntent", "getMenuReadyIntent", "messageClickIntent", "getMessageClickIntent", "messagePartClickIntent", "getMessagePartClickIntent", "messagesSelectedIntent", "getMessagesSelectedIntent", "optionsItemIntent", "", "getOptionsItemIntent", "scheduleCancelIntent", "getScheduleCancelIntent", "scheduleIntent", "getScheduleIntent", "scheduleSelectedIntent", "getScheduleSelectedIntent", "sendAsGroupIntent", "getSendAsGroupIntent", "sendIntent", "getSendIntent", "textChangedIntent", "", "getTextChangedIntent", "viewQksmsPlusIntent", "getViewQksmsPlusIntent", "clearSelection", "requestCamera", "requestContact", "requestDatePicker", "requestDefaultSms", "requestGallery", "requestSmsPermission", "requestStoragePermission", "scrollToMessage", "id", "setDraft", "draft", "showContacts", "sharing", "chips", "showDeleteDialog", "messages", "showDetails", "details", "showKeyboard", "showQksmsPlusSnackbar", "message", "themeChanged", "presentation_noAnalyticsRelease"})
public abstract interface ComposeView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.compose.ComposeState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getActivityVisibleIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<java.util.HashMap<java.lang.String, java.lang.String>> getChipsSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Recipient> getChipDeletedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getMenuReadyIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> getOptionsItemIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getSendAsGroupIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<java.lang.Long> getMessageClickIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<java.lang.Long> getMessagePartClickIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<java.lang.Long>> getMessagesSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<java.lang.Long> getCancelSendingIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Attachment> getAttachmentDeletedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.CharSequence> getTextChangedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getAttachIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getCameraIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getGalleryIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getScheduleIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getAttachContactIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<android.net.Uri> getAttachmentSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<android.net.Uri> getContactSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<androidx.core.view.inputmethod.InputContentInfoCompat> getInputContentIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> getScheduleSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getScheduleCancelIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getChangeSimIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getSendIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<kotlin.Unit> getViewQksmsPlusIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getBackPressedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<java.lang.Long>> getConfirmDeleteIntent();
    
    public abstract void clearSelection();
    
    public abstract void showDetails(@org.jetbrains.annotations.NotNull
    java.lang.String details);
    
    public abstract void requestDefaultSms();
    
    public abstract void requestStoragePermission();
    
    public abstract void requestSmsPermission();
    
    public abstract void showContacts(boolean sharing, @org.jetbrains.annotations.NotNull
    java.util.List<? extends dev.octoshrimpy.quik.model.Recipient> chips);
    
    public abstract void themeChanged();
    
    public abstract void showKeyboard();
    
    public abstract void requestCamera();
    
    public abstract void requestGallery();
    
    public abstract void requestDatePicker();
    
    public abstract void requestContact();
    
    public abstract void setDraft(@org.jetbrains.annotations.NotNull
    java.lang.String draft);
    
    public abstract void scrollToMessage(long id);
    
    public abstract void showQksmsPlusSnackbar(@androidx.annotation.StringRes
    int message);
    
    public abstract void showDeleteDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> messages);
}