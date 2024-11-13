package dev.octoshrimpy.quik.feature.blocking.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\f\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J\f\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0014J\f\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0003H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010&\u001a\u00020\'H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerView;", "Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerState;", "Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerPresenter;", "()V", "activityResumedSubject", "Lio/reactivex/subjects/PublishSubject;", "", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerPresenter;)V", "activityResumed", "Lio/reactivex/Observable;", "callControlClicked", "getActionIcon", "", "installed", "", "onActivityResumed", "activity", "Landroid/app/Activity;", "onAttach", "view", "Landroid/view/View;", "qksmsClicked", "render", "state", "showCopyDialog", "Lio/reactivex/Single;", "manager", "", "presentation_noAnalyticsRelease"})
public final class BlockingManagerController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerView, dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerState, dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerPresenter> implements dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerPresenter presenter;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> activityResumedSubject = null;
    private java.util.HashMap _$_findViewCache;
    
    public BlockingManagerController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerPresenter p0) {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    protected void onActivityResumed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerState state) {
    }
    
    private final int getActionIcon(boolean installed) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> activityResumed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> qksmsClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> callControlClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Single<java.lang.Boolean> showCopyDialog(@org.jetbrains.annotations.NotNull
    java.lang.String manager) {
        return null;
    }
}