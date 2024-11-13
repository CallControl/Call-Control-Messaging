package dev.octoshrimpy.quik.feature.blocking.numbers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H&J\b\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H&\u00a8\u0006\u000b"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersState;", "addAddress", "Lio/reactivex/Observable;", "saveAddress", "", "showAddDialog", "", "unblockAddress", "", "presentation_noAnalyticsRelease"})
public abstract interface BlockedNumbersView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Long> unblockAddress();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> addAddress();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.String> saveAddress();
    
    public abstract void showAddDialog();
}