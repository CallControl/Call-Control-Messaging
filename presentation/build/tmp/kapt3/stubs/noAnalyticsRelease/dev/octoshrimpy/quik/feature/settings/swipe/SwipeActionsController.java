package dev.octoshrimpy.quik.feature.settings.swipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0003H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001cH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsView;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsState;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsPresenter;", "()V", "actionClicks", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsView$Action;", "actionsDialog", "Ldev/octoshrimpy/quik/common/QkDialog;", "getActionsDialog", "()Ldev/octoshrimpy/quik/common/QkDialog;", "setActionsDialog", "(Ldev/octoshrimpy/quik/common/QkDialog;)V", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsPresenter;)V", "Lio/reactivex/Observable;", "actionSelected", "", "onAttach", "", "view", "Landroid/view/View;", "onViewCreated", "render", "state", "showSwipeActions", "selected", "presentation_noAnalyticsRelease"})
public final class SwipeActionsController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView, dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsState, dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsPresenter> implements dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsPresenter presenter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog actionsDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    
    /**
     * Allows us to subscribe to [actionClicks] more than once
     */
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView.Action> actionClicks = null;
    private java.util.HashMap _$_findViewCache;
    
    public SwipeActionsController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getActionsDialog() {
        return null;
    }
    
    public final void setActionsDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @java.lang.Override
    public void onViewCreated() {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView.Action> actionClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> actionSelected() {
        return null;
    }
    
    @java.lang.Override
    public void showSwipeActions(int selected) {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsState state) {
    }
}