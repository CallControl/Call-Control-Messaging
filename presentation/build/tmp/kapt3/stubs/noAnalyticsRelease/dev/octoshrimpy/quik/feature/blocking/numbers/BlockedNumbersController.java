package dev.octoshrimpy.quik.feature.blocking.numbers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0003H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersView;", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersState;", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersPresenter;", "()V", "adapter", "Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersAdapter;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "getPhoneNumberUtils", "()Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "setPhoneNumberUtils", "(Ldev/octoshrimpy/quik/util/PhoneNumberUtils;)V", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/blocking/numbers/BlockedNumbersPresenter;)V", "saveAddressSubject", "Lio/reactivex/subjects/Subject;", "", "addAddress", "Lio/reactivex/Observable;", "onAttach", "", "view", "Landroid/view/View;", "onViewCreated", "render", "state", "saveAddress", "showAddDialog", "unblockAddress", "", "presentation_noAnalyticsRelease"})
public final class BlockedNumbersController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersView, dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersState, dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersPresenter> implements dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersPresenter presenter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils;
    private final dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersAdapter adapter = null;
    private final io.reactivex.subjects.Subject<java.lang.String> saveAddressSubject = null;
    private java.util.HashMap _$_findViewCache;
    
    public BlockedNumbersController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.util.PhoneNumberUtils getPhoneNumberUtils() {
        return null;
    }
    
    public final void setPhoneNumberUtils(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils p0) {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onViewCreated() {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersState state) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Long> unblockAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> addAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.String> saveAddress() {
        return null;
    }
    
    @java.lang.Override
    public void showAddDialog() {
    }
}