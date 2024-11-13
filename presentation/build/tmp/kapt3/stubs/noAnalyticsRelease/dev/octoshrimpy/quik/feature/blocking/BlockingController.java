package dev.octoshrimpy.quik.feature.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010\'\u001a\u00020\bH\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0003H\u0016R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001a\u0010\nR\u001e\u0010\u001c\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006*"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/BlockingController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/blocking/BlockingView;", "Ldev/octoshrimpy/quik/feature/blocking/BlockingState;", "Ldev/octoshrimpy/quik/feature/blocking/BlockingPresenter;", "()V", "blockedMessagesIntent", "Lio/reactivex/Observable;", "", "getBlockedMessagesIntent", "()Lio/reactivex/Observable;", "blockedMessagesIntent$delegate", "Lkotlin/Lazy;", "blockedNumbersIntent", "getBlockedNumbersIntent", "blockedNumbersIntent$delegate", "blockingManagerIntent", "getBlockingManagerIntent", "blockingManagerIntent$delegate", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "dropClickedIntent", "getDropClickedIntent", "dropClickedIntent$delegate", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/blocking/BlockingPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/blocking/BlockingPresenter;)V", "onAttach", "view", "Landroid/view/View;", "onViewCreated", "openBlockedMessages", "openBlockedNumbers", "openBlockingManager", "render", "state", "presentation_noAnalyticsRelease"})
public final class BlockingController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.blocking.BlockingView, dev.octoshrimpy.quik.feature.blocking.BlockingState, dev.octoshrimpy.quik.feature.blocking.BlockingPresenter> implements dev.octoshrimpy.quik.feature.blocking.BlockingView {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy blockingManagerIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy blockedNumbersIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy blockedMessagesIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy dropClickedIntent$delegate = null;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.blocking.BlockingPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    public BlockingController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getBlockingManagerIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getBlockedNumbersIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getBlockedMessagesIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getDropClickedIntent() {
        return null;
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
    public dev.octoshrimpy.quik.feature.blocking.BlockingPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.BlockingPresenter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated() {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.BlockingState state) {
    }
    
    @java.lang.Override
    public void openBlockedNumbers() {
    }
    
    @java.lang.Override
    public void openBlockedMessages() {
    }
    
    @java.lang.Override
    public void openBlockingManager() {
    }
}