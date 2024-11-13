package dev.octoshrimpy.quik.feature.notificationprefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0012\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\fH\u0016J\b\u00106\u001a\u00020)H\u0016J\u0012\u00107\u001a\u00020)2\b\u00108\u001a\u0004\u0018\u000109H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006:"}, d2 = {"Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsActivity;", "Ldev/octoshrimpy/quik/common/base/QkThemedActivity;", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsView;", "()V", "actionsDialog", "Ldev/octoshrimpy/quik/common/QkDialog;", "getActionsDialog", "()Ldev/octoshrimpy/quik/common/QkDialog;", "setActionsDialog", "(Ldev/octoshrimpy/quik/common/QkDialog;)V", "actionsSelectedIntent", "Lio/reactivex/subjects/Subject;", "", "getActionsSelectedIntent", "()Lio/reactivex/subjects/Subject;", "actionsSelectedIntent$delegate", "Lkotlin/Lazy;", "preferenceClickIntent", "Ldev/octoshrimpy/quik/common/widget/PreferenceView;", "getPreferenceClickIntent", "previewModeDialog", "getPreviewModeDialog", "setPreviewModeDialog", "previewModeSelectedIntent", "getPreviewModeSelectedIntent", "previewModeSelectedIntent$delegate", "ringtoneSelectedIntent", "", "getRingtoneSelectedIntent", "viewModel", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsViewModel;", "getViewModel", "()Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "render", "state", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsState;", "showActionDialog", "selected", "showPreviewModeDialog", "showRingtonePicker", "default", "Landroid/net/Uri;", "presentation_noAnalyticsRelease"})
public final class NotificationPrefsActivity extends dev.octoshrimpy.quik.common.base.QkThemedActivity implements dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog previewModeDialog;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.QkDialog actionsDialog;
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.common.widget.PreferenceView> preferenceClickIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy previewModeSelectedIntent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.String> ringtoneSelectedIntent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy actionsSelectedIntent$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public NotificationPrefsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getPreviewModeDialog() {
        return null;
    }
    
    public final void setPreviewModeDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.QkDialog getActionsDialog() {
        return null;
    }
    
    public final void setActionsDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.QkDialog p0) {
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
    public io.reactivex.subjects.Subject<dev.octoshrimpy.quik.common.widget.PreferenceView> getPreferenceClickIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Integer> getPreviewModeSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.String> getRingtoneSelectedIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<java.lang.Integer> getActionsSelectedIntent() {
        return null;
    }
    
    private final dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsState state) {
    }
    
    @java.lang.Override
    public void showPreviewModeDialog() {
    }
    
    @java.lang.Override
    public void showRingtonePicker(@org.jetbrains.annotations.Nullable
    android.net.Uri p0_772401952) {
    }
    
    @java.lang.Override
    public void showActionDialog(int selected) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
}