package dev.octoshrimpy.quik.feature.scheduled;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0016\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/feature/scheduled/ScheduledView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledState;", "composeIntent", "Lio/reactivex/Observable;", "getComposeIntent", "()Lio/reactivex/Observable;", "messageClickIntent", "", "getMessageClickIntent", "messageMenuIntent", "", "getMessageMenuIntent", "upgradeIntent", "getUpgradeIntent", "showMessageOptions", "", "presentation_noAnalyticsRelease"})
public abstract interface ScheduledView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.scheduled.ScheduledState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> getMessageClickIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> getMessageMenuIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getComposeIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getUpgradeIntent();
    
    public abstract void showMessageOptions();
}