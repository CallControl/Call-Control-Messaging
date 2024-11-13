package dev.octoshrimpy.quik.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010.\u001a\u00020\u000bH&J\b\u0010/\u001a\u00020\u000bH&J\b\u00100\u001a\u00020\u000bH&J\b\u00101\u001a\u00020\u000bH&J\b\u00102\u001a\u00020\u000bH&J\u001e\u00103\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00105\u001a\u00020\u0005H&J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u000208H&J\u0016\u00109\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\b\u0010:\u001a\u00020\u000bH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0016\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0007R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0007R\u0016\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0007R\u0018\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0007R$\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0*0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0007\u00a8\u0006;"}, d2 = {"Ldev/octoshrimpy/quik/feature/main/MainView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/main/MainState;", "activityResumedIntent", "Lio/reactivex/Observable;", "", "getActivityResumedIntent", "()Lio/reactivex/Observable;", "changelogMoreIntent", "getChangelogMoreIntent", "composeIntent", "", "getComposeIntent", "confirmDeleteIntent", "", "", "getConfirmDeleteIntent", "conversationsSelectedIntent", "getConversationsSelectedIntent", "dismissRatingIntent", "getDismissRatingIntent", "drawerOpenIntent", "getDrawerOpenIntent", "homeIntent", "getHomeIntent", "navigationIntent", "Ldev/octoshrimpy/quik/feature/main/NavItem;", "getNavigationIntent", "onNewIntentIntent", "Landroid/content/Intent;", "getOnNewIntentIntent", "optionsItemIntent", "", "getOptionsItemIntent", "queryChangedIntent", "", "getQueryChangedIntent", "rateIntent", "getRateIntent", "snackbarButtonIntent", "getSnackbarButtonIntent", "swipeConversationIntent", "Lkotlin/Pair;", "getSwipeConversationIntent", "undoArchiveIntent", "getUndoArchiveIntent", "clearSearch", "clearSelection", "requestDefaultSms", "requestPermissions", "showArchivedSnackbar", "showBlockingDialog", "conversations", "block", "showChangelog", "changelog", "Ldev/octoshrimpy/quik/manager/ChangelogManager$CumulativeChangelog;", "showDeleteDialog", "themeChanged", "presentation_noAnalyticsRelease"})
public abstract interface MainView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.main.MainState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<android.content.Intent> getOnNewIntentIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getActivityResumedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.CharSequence> getQueryChangedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getComposeIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getDrawerOpenIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getHomeIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.feature.main.NavItem> getNavigationIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> getOptionsItemIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getDismissRatingIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getRateIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<java.lang.Long>> getConversationsSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<java.lang.Long>> getConfirmDeleteIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Pair<java.lang.Long, java.lang.Integer>> getSwipeConversationIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getChangelogMoreIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getUndoArchiveIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getSnackbarButtonIntent();
    
    public abstract void requestDefaultSms();
    
    public abstract void requestPermissions();
    
    public abstract void clearSearch();
    
    public abstract void clearSelection();
    
    public abstract void themeChanged();
    
    public abstract void showBlockingDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations, boolean block);
    
    public abstract void showDeleteDialog(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> conversations);
    
    public abstract void showChangelog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ChangelogManager.CumulativeChangelog changelog);
    
    public abstract void showArchivedSnackbar();
}