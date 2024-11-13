package dev.octoshrimpy.quik.feature.scheduled;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0010\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0006H\u0016R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b \u0010!R!\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b%\u0010!R!\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b(\u0010\bR\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b,\u0010-R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006<"}, d2 = {"Ldev/octoshrimpy/quik/feature/scheduled/ScheduledActivity;", "Ldev/octoshrimpy/quik/common/base/QkThemedActivity;", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledView;", "()V", "composeIntent", "Lio/reactivex/Observable;", "", "getComposeIntent", "()Lio/reactivex/Observable;", "composeIntent$delegate", "Lkotlin/Lazy;", "dialog", "Ldev/octoshrimpy/quik/common/QkDialog;", "getDialog", "()Ldev/octoshrimpy/quik/common/QkDialog;", "setDialog", "(Ldev/octoshrimpy/quik/common/QkDialog;)V", "fontProvider", "Ldev/octoshrimpy/quik/common/util/FontProvider;", "getFontProvider", "()Ldev/octoshrimpy/quik/common/util/FontProvider;", "setFontProvider", "(Ldev/octoshrimpy/quik/common/util/FontProvider;)V", "messageAdapter", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter;", "getMessageAdapter", "()Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter;", "setMessageAdapter", "(Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter;)V", "messageClickIntent", "Lio/reactivex/subjects/Subject;", "", "getMessageClickIntent", "()Lio/reactivex/subjects/Subject;", "messageClickIntent$delegate", "messageMenuIntent", "", "getMessageMenuIntent", "messageMenuIntent$delegate", "upgradeIntent", "getUpgradeIntent", "upgradeIntent$delegate", "viewModel", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledViewModel;", "getViewModel", "()Ldev/octoshrimpy/quik/feature/scheduled/ScheduledViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "render", "state", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledState;", "showMessageOptions", "presentation_noAnalyticsRelease"})
public final class ScheduledActivity extends dev.octoshrimpy.quik.common.base.QkThemedActivity implements dev.octoshrimpy.quik.feature.scheduled.ScheduledView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog dialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.FontProvider fontProvider;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.scheduled.ScheduledMessageAdapter messageAdapter;
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messageClickIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messageMenuIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy composeIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy upgradeIntent$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public ScheduledActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.FontProvider getFontProvider() {
        return null;
    }
    
    public final void setFontProvider(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.FontProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.scheduled.ScheduledMessageAdapter getMessageAdapter() {
        return null;
    }
    
    public final void setMessageAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.scheduled.ScheduledMessageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Long> getMessageClickIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Integer> getMessageMenuIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getComposeIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Unit> getUpgradeIntent() {
        return null;
    }
    
    private final dev.octoshrimpy.quik.feature.scheduled.ScheduledViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.scheduled.ScheduledState state) {
    }
    
    @java.lang.Override
    public void showMessageOptions() {
    }
}