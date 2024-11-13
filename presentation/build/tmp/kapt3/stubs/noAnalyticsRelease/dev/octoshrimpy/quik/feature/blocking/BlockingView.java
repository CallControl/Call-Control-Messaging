package dev.octoshrimpy.quik.feature.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/BlockingView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/blocking/BlockingState;", "blockedMessagesIntent", "Lio/reactivex/Observable;", "getBlockedMessagesIntent", "()Lio/reactivex/Observable;", "blockedNumbersIntent", "getBlockedNumbersIntent", "blockingManagerIntent", "getBlockingManagerIntent", "dropClickedIntent", "getDropClickedIntent", "openBlockedMessages", "", "openBlockedNumbers", "openBlockingManager", "presentation_noAnalyticsRelease"})
public abstract interface BlockingView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.blocking.BlockingState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getBlockingManagerIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getBlockedNumbersIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getBlockedMessagesIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getDropClickedIntent();
    
    public abstract void openBlockingManager();
    
    public abstract void openBlockedNumbers();
    
    public abstract void openBlockedMessages();
}