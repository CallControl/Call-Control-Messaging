package dev.octoshrimpy.quik.feature.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\u0004H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H&J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0010H&J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H&J\b\u0010\u001b\u001a\u00020\u0010H&J\b\u0010\u001c\u001a\u00020\u0010H&J\b\u0010\u001d\u001a\u00020\u0010H&J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H&J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H&J\b\u0010\"\u001a\u00020\u0010H&J\b\u0010#\u001a\u00020\u0010H&J\b\u0010$\u001a\u00020\u0010H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u0004H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H&J\f\u0010\'\u001a\u0006\u0012\u0002\b\u00030\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/SettingsView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/settings/SettingsState;", "aboutLongClicks", "Lio/reactivex/Observable;", "autoDeleteChanged", "", "mmsSizeSelected", "nightEndSelected", "Lkotlin/Pair;", "nightModeSelected", "nightStartSelected", "preferenceClicks", "Ldev/octoshrimpy/quik/common/widget/PreferenceView;", "sendDelaySelected", "showAbout", "", "showAutoDeleteDialog", "days", "showAutoDeleteWarningDialog", "", "messages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showDelayDurationDialog", "showEndTimePicker", "hour", "minute", "showMmsSizePicker", "showNightModeDialog", "showQksmsPlusSnackbar", "showSignatureDialog", "signature", "", "showStartTimePicker", "showSwipeActions", "showTextSizePicker", "showThemePicker", "signatureChanged", "textSizeSelected", "viewQksmsPlusClicks", "presentation_noAnalyticsRelease"})
public abstract interface SettingsView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.settings.SettingsState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.common.widget.PreferenceView> preferenceClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> aboutLongClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> viewQksmsPlusClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> nightModeSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> nightStartSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> nightEndSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> textSizeSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> sendDelaySelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.String> signatureChanged();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> autoDeleteChanged();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> mmsSizeSelected();
    
    public abstract void showQksmsPlusSnackbar();
    
    public abstract void showNightModeDialog();
    
    public abstract void showStartTimePicker(int hour, int minute);
    
    public abstract void showEndTimePicker(int hour, int minute);
    
    public abstract void showTextSizePicker();
    
    public abstract void showDelayDurationDialog();
    
    public abstract void showSignatureDialog(@org.jetbrains.annotations.NotNull
    java.lang.String signature);
    
    public abstract void showAutoDeleteDialog(int days);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object showAutoDeleteWarningDialog(int messages, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    public abstract void showMmsSizePicker();
    
    public abstract void showSwipeActions();
    
    public abstract void showThemePicker();
    
    public abstract void showAbout();
}