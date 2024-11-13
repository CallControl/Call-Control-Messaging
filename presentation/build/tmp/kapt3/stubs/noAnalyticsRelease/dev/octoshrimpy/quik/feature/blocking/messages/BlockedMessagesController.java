package dev.octoshrimpy.quik.feature.blocking.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010:\u001a\u00020\bH\u0016J\b\u0010;\u001a\u00020\bH\u0016J\b\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020@H\u0014J\u0018\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020\bH\u0016J\u0010\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u0003H\u0016J\u001e\u0010L\u001a\u00020\b2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010N\u001a\u00020=H\u0016J\u0016\u0010O\u001a\u00020\b2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R!\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001f0(8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\nR\u001e\u00102\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\'\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b8\u0010\n\u00a8\u0006P"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesView;", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesState;", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesPresenter;", "()V", "backClicked", "Lio/reactivex/subjects/Subject;", "", "getBackClicked", "()Lio/reactivex/subjects/Subject;", "blockedMessagesAdapter", "Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesAdapter;", "getBlockedMessagesAdapter", "()Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesAdapter;", "setBlockedMessagesAdapter", "(Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesAdapter;)V", "blockingDialog", "Ldev/octoshrimpy/quik/feature/blocking/BlockingDialog;", "getBlockingDialog", "()Ldev/octoshrimpy/quik/feature/blocking/BlockingDialog;", "setBlockingDialog", "(Ldev/octoshrimpy/quik/feature/blocking/BlockingDialog;)V", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "confirmDeleteIntent", "", "", "getConfirmDeleteIntent", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "conversationClicks", "Lio/reactivex/subjects/PublishSubject;", "getConversationClicks", "()Lio/reactivex/subjects/PublishSubject;", "conversationClicks$delegate", "Lkotlin/Lazy;", "menuReadyIntent", "getMenuReadyIntent", "optionsItemIntent", "", "getOptionsItemIntent", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesPresenter;)V", "selectionChanges", "getSelectionChanges", "selectionChanges$delegate", "clearSelection", "goBack", "handleBack", "", "onAttach", "view", "Landroid/view/View;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "render", "state", "showBlockingDialog", "conversations", "block", "showDeleteDialog", "presentation_noAnalyticsRelease"})
public final class BlockedMessagesController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesView, dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesState, dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesPresenter> implements dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesView {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> menuReadyIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Integer> optionsItemIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conversationClicks$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy selectionChanges$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> confirmDeleteIntent = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> backClicked = null;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesAdapter blockedMessagesAdapter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.blocking.BlockingDialog blockingDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public android.content.Context context;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    public BlockedMessagesController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<kotlin.Unit> getMenuReadyIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Integer> getOptionsItemIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.PublishSubject<java.lang.Long> getConversationClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> getSelectionChanges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> getConfirmDeleteIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<kotlin.Unit> getBackClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesAdapter getBlockedMessagesAdapter() {
        return null;
    }
    
    public final void setBlockedMessagesAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.blocking.BlockingDialog getBlockingDialog() {
        return null;
    }
    
    public final void setBlockingDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.BlockingDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesPresenter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated() {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean handleBack() {
        return false;
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesState state) {
    }
    
    @java.lang.Override
    public void clearSelection() {
    }
    
    @java.lang.Override
    public void showBlockingDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations, boolean block) {
    }
    
    @java.lang.Override
    public void showDeleteDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations) {
    }
    
    @java.lang.Override
    public void goBack() {
    }
}