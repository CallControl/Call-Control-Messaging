package dev.octoshrimpy.quik.feature.notificationprefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0013H&J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsState;", "actionsSelectedIntent", "Lio/reactivex/subjects/Subject;", "", "getActionsSelectedIntent", "()Lio/reactivex/subjects/Subject;", "preferenceClickIntent", "Ldev/octoshrimpy/quik/common/widget/PreferenceView;", "getPreferenceClickIntent", "previewModeSelectedIntent", "getPreviewModeSelectedIntent", "ringtoneSelectedIntent", "Lio/reactivex/Observable;", "", "getRingtoneSelectedIntent", "()Lio/reactivex/Observable;", "showActionDialog", "", "selected", "showPreviewModeDialog", "showRingtonePicker", "default", "Landroid/net/Uri;", "presentation_noAnalyticsRelease"})
public abstract interface NotificationPrefsView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.common.widget.PreferenceView> getPreferenceClickIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<java.lang.Integer> getPreviewModeSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.String> getRingtoneSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<java.lang.Integer> getActionsSelectedIntent();
    
    public abstract void showPreviewModeDialog();
    
    public abstract void showRingtonePicker(@org.jetbrains.annotations.Nullable
    android.net.Uri p0_772401952);
    
    public abstract void showActionDialog(int selected);
}