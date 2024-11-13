package dev.octoshrimpy.quik.feature.compose;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u00b9\u00012\u00020\u00012\u00020\u0002:\u0002\u00b9\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u008a\u0001\u001a\u00020\u000bH\u0016J\u000f\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020g0>H\u0016J\'\u0010\u008c\u0001\u001a\u00020\u000b2\u0007\u0010\u008d\u0001\u001a\u00020g2\u0007\u0010\u008e\u0001\u001a\u00020g2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0014J\t\u0010\u0091\u0001\u001a\u00020\u000bH\u0016J\u0015\u0010\u0092\u0001\u001a\u00020\u000b2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0014J\u0015\u0010\u0095\u0001\u001a\u00020\u00062\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001H\u0016J\u0013\u0010\u0098\u0001\u001a\u00020\u00062\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0016J\t\u0010\u009b\u0001\u001a\u00020\u000bH\u0014J\u0013\u0010\u009c\u0001\u001a\u00020\u000b2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0014J\u0013\u0010\u009d\u0001\u001a\u00020\u000b2\b\u0010\u009e\u0001\u001a\u00030\u0094\u0001H\u0014J\t\u0010\u009f\u0001\u001a\u00020\u000bH\u0014J\u0013\u0010\u00a0\u0001\u001a\u00020\u000b2\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001H\u0016J\t\u0010\u00a3\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a4\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a5\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a6\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a7\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a8\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a9\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u00aa\u0001\u001a\u00020\u000b2\u0007\u0010\u00ab\u0001\u001a\u00020(H\u0016J\u0012\u0010\u00ac\u0001\u001a\u00020\u000b2\u0007\u0010\u00ad\u0001\u001a\u00020:H\u0016J!\u0010\u00ae\u0001\u001a\u00020\u000b2\u0007\u0010\u00af\u0001\u001a\u00020\u00062\r\u0010\u00b0\u0001\u001a\b\u0012\u0004\u0012\u00020/0>H\u0016J\u0018\u0010\u00b1\u0001\u001a\u00020\u000b2\r\u0010\u00b2\u0001\u001a\b\u0012\u0004\u0012\u00020(0>H\u0016J\u0012\u0010\u00b3\u0001\u001a\u00020\u000b2\u0007\u0010\u00b4\u0001\u001a\u00020:H\u0016J\t\u0010\u00b5\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u00b6\u0001\u001a\u00020\u000b2\u0007\u0010\u00b7\u0001\u001a\u00020gH\u0016J\t\u0010\u00b8\u0001\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR?\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR?\u0010\u0011\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0010\u0010#\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R?\u0010$\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b%\u0010\u000eR!\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b)\u0010\bR!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b,\u0010\u000eR!\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b0\u0010\bR\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R:\u00108\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010:09j\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010:`;0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0>0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR?\u0010H\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\bI\u0010\u000eR!\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010\u0010\u001a\u0004\bM\u0010\bR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\u000eR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR!\u0010W\u001a\b\u0012\u0004\u0012\u00020(0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bX\u0010\bR!\u0010Z\u001a\b\u0012\u0004\u0012\u00020(0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\\\u0010\u0010\u001a\u0004\b[\u0010\bR\'\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0>0\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b_\u0010\u0010\u001a\u0004\b^\u0010\bR\u001e\u0010`\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010\bR!\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bk\u0010\u0010\u001a\u0004\bj\u0010\u000eR?\u0010l\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bn\u0010\u0010\u001a\u0004\bm\u0010\u000eR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020(0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010\bR!\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bs\u0010\u0010\u001a\u0004\br\u0010\u000eR!\u0010t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bv\u0010\u0010\u001a\u0004\bu\u0010\u000eR!\u0010w\u001a\b\u0012\u0004\u0012\u00020y0x8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b|\u0010\u0010\u001a\u0004\bz\u0010{R\u001d\u0010}\u001a\u00020~8BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0010\u001a\u0005\b\u007f\u0010\u0080\u0001R$\u0010\u0082\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0096\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010\b\u00a8\u0006\u00ba\u0001"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/ComposeActivity;", "Ldev/octoshrimpy/quik/common/base/QkThemedActivity;", "Ldev/octoshrimpy/quik/feature/compose/ComposeView;", "()V", "activityVisibleIntent", "Lio/reactivex/subjects/Subject;", "", "getActivityVisibleIntent", "()Lio/reactivex/subjects/Subject;", "attachContactIntent", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "getAttachContactIntent", "()Lio/reactivex/Observable;", "attachContactIntent$delegate", "Lkotlin/Lazy;", "attachIntent", "getAttachIntent", "attachIntent$delegate", "attachmentAdapter", "Ldev/octoshrimpy/quik/feature/compose/AttachmentAdapter;", "getAttachmentAdapter", "()Ldev/octoshrimpy/quik/feature/compose/AttachmentAdapter;", "setAttachmentAdapter", "(Ldev/octoshrimpy/quik/feature/compose/AttachmentAdapter;)V", "attachmentDeletedIntent", "Ldev/octoshrimpy/quik/model/Attachment;", "getAttachmentDeletedIntent", "attachmentDeletedIntent$delegate", "attachmentSelectedIntent", "Landroid/net/Uri;", "getAttachmentSelectedIntent", "backPressedIntent", "getBackPressedIntent", "cameraDestination", "cameraIntent", "getCameraIntent", "cameraIntent$delegate", "cancelSendingIntent", "", "getCancelSendingIntent", "cancelSendingIntent$delegate", "changeSimIntent", "getChangeSimIntent", "changeSimIntent$delegate", "chipDeletedIntent", "Ldev/octoshrimpy/quik/model/Recipient;", "getChipDeletedIntent", "chipDeletedIntent$delegate", "chipsAdapter", "Ldev/octoshrimpy/quik/feature/compose/editing/ChipsAdapter;", "getChipsAdapter", "()Ldev/octoshrimpy/quik/feature/compose/editing/ChipsAdapter;", "setChipsAdapter", "(Ldev/octoshrimpy/quik/feature/compose/editing/ChipsAdapter;)V", "chipsSelectedIntent", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getChipsSelectedIntent", "confirmDeleteIntent", "", "getConfirmDeleteIntent", "contactSelectedIntent", "getContactSelectedIntent", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "getDateFormatter", "()Ldev/octoshrimpy/quik/common/util/DateFormatter;", "setDateFormatter", "(Ldev/octoshrimpy/quik/common/util/DateFormatter;)V", "galleryIntent", "getGalleryIntent", "galleryIntent$delegate", "inputContentIntent", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "getInputContentIntent", "inputContentIntent$delegate", "menuReadyIntent", "getMenuReadyIntent", "messageAdapter", "Ldev/octoshrimpy/quik/feature/compose/MessagesAdapter;", "getMessageAdapter", "()Ldev/octoshrimpy/quik/feature/compose/MessagesAdapter;", "setMessageAdapter", "(Ldev/octoshrimpy/quik/feature/compose/MessagesAdapter;)V", "messageClickIntent", "getMessageClickIntent", "messageClickIntent$delegate", "messagePartClickIntent", "getMessagePartClickIntent", "messagePartClickIntent$delegate", "messagesSelectedIntent", "getMessagesSelectedIntent", "messagesSelectedIntent$delegate", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "getNavigator", "()Ldev/octoshrimpy/quik/common/Navigator;", "setNavigator", "(Ldev/octoshrimpy/quik/common/Navigator;)V", "optionsItemIntent", "", "getOptionsItemIntent", "scheduleCancelIntent", "getScheduleCancelIntent", "scheduleCancelIntent$delegate", "scheduleIntent", "getScheduleIntent", "scheduleIntent$delegate", "scheduleSelectedIntent", "getScheduleSelectedIntent", "sendAsGroupIntent", "getSendAsGroupIntent", "sendAsGroupIntent$delegate", "sendIntent", "getSendIntent", "sendIntent$delegate", "textChangedIntent", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "", "getTextChangedIntent", "()Lcom/jakewharton/rxbinding2/InitialValueObservable;", "textChangedIntent$delegate", "viewModel", "Ldev/octoshrimpy/quik/feature/compose/ComposeViewModel;", "getViewModel", "()Ldev/octoshrimpy/quik/feature/compose/ComposeViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewQksmsPlusIntent", "getViewQksmsPlusIntent", "clearSelection", "getColoredMenuItems", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onRestoreInstanceState", "onSaveInstanceState", "outState", "onStart", "render", "state", "Ldev/octoshrimpy/quik/feature/compose/ComposeState;", "requestCamera", "requestContact", "requestDatePicker", "requestDefaultSms", "requestGallery", "requestSmsPermission", "requestStoragePermission", "scrollToMessage", "id", "setDraft", "draft", "showContacts", "sharing", "chips", "showDeleteDialog", "messages", "showDetails", "details", "showKeyboard", "showQksmsPlusSnackbar", "message", "themeChanged", "Companion", "presentation_noAnalyticsRelease"})
public final class ComposeActivity extends dev.octoshrimpy.quik.common.base.QkThemedActivity implements dev.octoshrimpy.quik.feature.compose.ComposeView {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.feature.compose.ComposeActivity.Companion Companion = null;
    private static final int SelectContactRequestCode = 0;
    private static final int TakePhotoRequestCode = 1;
    private static final int AttachPhotoRequestCode = 2;
    private static final int AttachContactRequestCode = 3;
    private static final java.lang.String CameraDestinationKey = "camera_destination";
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.compose.AttachmentAdapter attachmentAdapter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.compose.editing.ChipsAdapter chipsAdapter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.compose.MessagesAdapter messageAdapter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.Navigator navigator;
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Boolean> activityVisibleIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.util.HashMap<java.lang.String, java.lang.String>> chipsSelectedIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chipDeletedIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.Observable<kotlin.Unit> menuReadyIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Integer> optionsItemIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sendAsGroupIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messageClickIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messagePartClickIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messagesSelectedIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cancelSendingIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy attachmentDeletedIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy textChangedIntent$delegate = null;
    private final kotlin.Lazy attachIntent$delegate = null;
    private final kotlin.Lazy cameraIntent$delegate = null;
    private final kotlin.Lazy galleryIntent$delegate = null;
    private final kotlin.Lazy scheduleIntent$delegate = null;
    private final kotlin.Lazy attachContactIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<android.net.Uri> attachmentSelectedIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<android.net.Uri> contactSelectedIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy inputContentIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> scheduleSelectedIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy changeSimIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy scheduleCancelIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sendIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> viewQksmsPlusIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> backPressedIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> confirmDeleteIntent = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.net.Uri cameraDestination;
    private java.util.HashMap _$_findViewCache;
    
    public ComposeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.compose.AttachmentAdapter getAttachmentAdapter() {
        return null;
    }
    
    public final void setAttachmentAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.AttachmentAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.compose.editing.ChipsAdapter getChipsAdapter() {
        return null;
    }
    
    public final void setChipsAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.editing.ChipsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.DateFormatter getDateFormatter() {
        return null;
    }
    
    public final void setDateFormatter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.compose.MessagesAdapter getMessageAdapter() {
        return null;
    }
    
    public final void setMessageAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.MessagesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.Navigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Boolean> getActivityVisibleIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.util.HashMap<java.lang.String, java.lang.String>> getChipsSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Recipient> getChipDeletedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getMenuReadyIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Integer> getOptionsItemIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getSendAsGroupIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Long> getMessageClickIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Long> getMessagePartClickIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> getMessagesSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Long> getCancelSendingIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Attachment> getAttachmentDeletedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.jakewharton.rxbinding2.InitialValueObservable<java.lang.CharSequence> getTextChangedIntent() {
        return null;
    }
    
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getAttachIntent() {
        return null;
    }
    
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getCameraIntent() {
        return null;
    }
    
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getGalleryIntent() {
        return null;
    }
    
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getScheduleIntent() {
        return null;
    }
    
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getAttachContactIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<android.net.Uri> getAttachmentSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<android.net.Uri> getContactSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<androidx.core.view.inputmethod.InputContentInfoCompat> getInputContentIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Long> getScheduleSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getChangeSimIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getScheduleCancelIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getSendIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<kotlin.Unit> getViewQksmsPlusIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<kotlin.Unit> getBackPressedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> getConfirmDeleteIntent() {
        return null;
    }
    
    private final dev.octoshrimpy.quik.feature.compose.ComposeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeState state) {
    }
    
    @java.lang.Override
    public void clearSelection() {
    }
    
    @java.lang.Override
    public void showDetails(@org.jetbrains.annotations.NotNull
    java.lang.String details) {
    }
    
    @java.lang.Override
    public void requestDefaultSms() {
    }
    
    @java.lang.Override
    public void requestStoragePermission() {
    }
    
    @java.lang.Override
    public void requestSmsPermission() {
    }
    
    @java.lang.Override
    public void requestDatePicker() {
    }
    
    @java.lang.Override
    public void requestContact() {
    }
    
    @java.lang.Override
    public void showContacts(boolean sharing, @org.jetbrains.annotations.NotNull
    java.util.List<? extends dev.octoshrimpy.quik.model.Recipient> chips) {
    }
    
    @java.lang.Override
    public void themeChanged() {
    }
    
    @java.lang.Override
    public void showKeyboard() {
    }
    
    @java.lang.Override
    public void requestCamera() {
    }
    
    @java.lang.Override
    public void requestGallery() {
    }
    
    @java.lang.Override
    public void setDraft(@org.jetbrains.annotations.NotNull
    java.lang.String draft) {
    }
    
    @java.lang.Override
    public void scrollToMessage(long id) {
    }
    
    @java.lang.Override
    public void showQksmsPlusSnackbar(int message) {
    }
    
    @java.lang.Override
    public void showDeleteDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> messages) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.lang.Integer> getColoredMenuItems() {
        return null;
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/ComposeActivity$Companion;", "", "()V", "AttachContactRequestCode", "", "AttachPhotoRequestCode", "CameraDestinationKey", "", "SelectContactRequestCode", "TakePhotoRequestCode", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}