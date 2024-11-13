package dev.octoshrimpy.quik.feature.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\f\u0010A\u001a\u0006\u0012\u0002\b\u00030BH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0BH\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0BH\u0016J\u001a\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c0BH\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0BH\u0016J\u001a\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c0BH\u0016J\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020JH\u0014J\b\u0010K\u001a\u00020@H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020M0BH\u0016J\u0010\u0010N\u001a\u00020@2\u0006\u0010O\u001a\u00020\u0003H\u0016J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0BH\u0016J\b\u0010Q\u001a\u00020@H\u0016J\u0010\u0010R\u001a\u00020@2\u0006\u0010S\u001a\u00020\u000eH\u0016J\u0019\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010WJ\b\u0010X\u001a\u00020@H\u0016J\u0018\u0010Y\u001a\u00020@2\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\u000eH\u0016J\b\u0010\\\u001a\u00020@H\u0016J\b\u0010]\u001a\u00020@H\u0016J\b\u0010^\u001a\u00020@H\u0016J\u0010\u0010_\u001a\u00020@2\u0006\u0010`\u001a\u00020:H\u0016J\u0018\u0010a\u001a\u00020@2\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\u000eH\u0016J\b\u0010b\u001a\u00020@H\u0016J\b\u0010c\u001a\u00020@H\u0016J\b\u0010d\u001a\u00020@H\u0016J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020:0BH\u0016J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000e0BH\u0016J\f\u0010g\u001a\u0006\u0012\u0002\b\u00030BH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001e\u0010&\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R#\u0010+\u001a\n -*\u0004\u0018\u00010,0,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b.\u0010/R\u001e\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b6\u00107R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006h"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/SettingsController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/settings/SettingsView;", "Ldev/octoshrimpy/quik/feature/settings/SettingsState;", "Ldev/octoshrimpy/quik/feature/settings/SettingsPresenter;", "()V", "autoDeleteDialog", "Ldev/octoshrimpy/quik/feature/settings/autodelete/AutoDeleteDialog;", "getAutoDeleteDialog", "()Ldev/octoshrimpy/quik/feature/settings/autodelete/AutoDeleteDialog;", "autoDeleteDialog$delegate", "Lkotlin/Lazy;", "autoDeleteSubject", "Lio/reactivex/subjects/Subject;", "", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "endTimeSelectedSubject", "Lkotlin/Pair;", "mmsSizeDialog", "Ldev/octoshrimpy/quik/common/QkDialog;", "getMmsSizeDialog", "()Ldev/octoshrimpy/quik/common/QkDialog;", "setMmsSizeDialog", "(Ldev/octoshrimpy/quik/common/QkDialog;)V", "nightModeDialog", "getNightModeDialog", "setNightModeDialog", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/settings/SettingsPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/settings/SettingsPresenter;)V", "progressAnimator", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "getProgressAnimator", "()Landroid/animation/ObjectAnimator;", "progressAnimator$delegate", "sendDelayDialog", "getSendDelayDialog", "setSendDelayDialog", "signatureDialog", "Ldev/octoshrimpy/quik/common/widget/TextInputDialog;", "getSignatureDialog", "()Ldev/octoshrimpy/quik/common/widget/TextInputDialog;", "signatureDialog$delegate", "signatureSubject", "", "startTimeSelectedSubject", "textSizeDialog", "getTextSizeDialog", "setTextSizeDialog", "viewQksmsPlusSubject", "", "aboutLongClicks", "Lio/reactivex/Observable;", "autoDeleteChanged", "mmsSizeSelected", "nightEndSelected", "nightModeSelected", "nightStartSelected", "onAttach", "view", "Landroid/view/View;", "onViewCreated", "preferenceClicks", "Ldev/octoshrimpy/quik/common/widget/PreferenceView;", "render", "state", "sendDelaySelected", "showAbout", "showAutoDeleteDialog", "days", "showAutoDeleteWarningDialog", "", "messages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showDelayDurationDialog", "showEndTimePicker", "hour", "minute", "showMmsSizePicker", "showNightModeDialog", "showQksmsPlusSnackbar", "showSignatureDialog", "signature", "showStartTimePicker", "showSwipeActions", "showTextSizePicker", "showThemePicker", "signatureChanged", "textSizeSelected", "viewQksmsPlusClicks", "presentation_noAnalyticsRelease"})
public final class SettingsController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.settings.SettingsView, dev.octoshrimpy.quik.feature.settings.SettingsState, dev.octoshrimpy.quik.feature.settings.SettingsPresenter> implements dev.octoshrimpy.quik.feature.settings.SettingsView {
    @javax.inject.Inject
    public android.content.Context context;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog nightModeDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog textSizeDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog sendDelayDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog mmsSizeDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.settings.SettingsPresenter presenter;
    private final kotlin.Lazy signatureDialog$delegate = null;
    private final kotlin.Lazy autoDeleteDialog$delegate = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> viewQksmsPlusSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Pair<java.lang.Integer, java.lang.Integer>> startTimeSelectedSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Pair<java.lang.Integer, java.lang.Integer>> endTimeSelectedSubject = null;
    private final io.reactivex.subjects.Subject<java.lang.String> signatureSubject = null;
    private final io.reactivex.subjects.Subject<java.lang.Integer> autoDeleteSubject = null;
    private final kotlin.Lazy progressAnimator$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public SettingsController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getNightModeDialog() {
        return null;
    }
    
    public final void setNightModeDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getTextSizeDialog() {
        return null;
    }
    
    public final void setTextSizeDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getSendDelayDialog() {
        return null;
    }
    
    public final void setSendDelayDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getMmsSizeDialog() {
        return null;
    }
    
    public final void setMmsSizeDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.settings.SettingsPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.settings.SettingsPresenter p0) {
    }
    
    private final dev.octoshrimpy.quik.common.widget.TextInputDialog getSignatureDialog() {
        return null;
    }
    
    private final dev.octoshrimpy.quik.feature.settings.autodelete.AutoDeleteDialog getAutoDeleteDialog() {
        return null;
    }
    
    private final android.animation.ObjectAnimator getProgressAnimator() {
        return null;
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
    public io.reactivex.Observable<dev.octoshrimpy.quik.common.widget.PreferenceView> preferenceClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> aboutLongClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> viewQksmsPlusClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> nightModeSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> nightStartSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> nightEndSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> textSizeSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> sendDelaySelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.String> signatureChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> autoDeleteChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> mmsSizeSelected() {
        return null;
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.settings.SettingsState state) {
    }
    
    @java.lang.Override
    public void showQksmsPlusSnackbar() {
    }
    
    @java.lang.Override
    public void showNightModeDialog() {
    }
    
    @java.lang.Override
    public void showStartTimePicker(int hour, int minute) {
    }
    
    @java.lang.Override
    public void showEndTimePicker(int hour, int minute) {
    }
    
    @java.lang.Override
    public void showTextSizePicker() {
    }
    
    @java.lang.Override
    public void showDelayDurationDialog() {
    }
    
    @java.lang.Override
    public void showSignatureDialog(@org.jetbrains.annotations.NotNull
    java.lang.String signature) {
    }
    
    @java.lang.Override
    public void showAutoDeleteDialog(int days) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object showAutoDeleteWarningDialog(int messages, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @java.lang.Override
    public void showMmsSizePicker() {
    }
    
    @java.lang.Override
    public void showSwipeActions() {
    }
    
    @java.lang.Override
    public void showThemePicker() {
    }
    
    @java.lang.Override
    public void showAbout() {
    }
}