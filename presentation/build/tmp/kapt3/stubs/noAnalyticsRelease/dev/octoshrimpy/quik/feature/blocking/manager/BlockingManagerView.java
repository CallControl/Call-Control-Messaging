package dev.octoshrimpy.quik.feature.blocking.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/blocking/manager/BlockingManagerState;", "activityResumed", "Lio/reactivex/Observable;", "callControlClicked", "qksmsClicked", "showCopyDialog", "Lio/reactivex/Single;", "", "manager", "", "presentation_noAnalyticsRelease"})
public abstract interface BlockingManagerView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> activityResumed();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> qksmsClicked();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> callControlClicked();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.lang.Boolean> showCopyDialog(@org.jetbrains.annotations.NotNull
    java.lang.String manager);
}