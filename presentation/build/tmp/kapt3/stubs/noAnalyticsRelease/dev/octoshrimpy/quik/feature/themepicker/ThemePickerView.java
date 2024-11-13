package dev.octoshrimpy.quik.feature.themepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\tH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\f\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H&\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerState;", "applyHsvThemeClicks", "Lio/reactivex/Observable;", "clearHsvThemeClicks", "hsvThemeSelected", "", "setCurrentTheme", "", "color", "showQksmsPlusSnackbar", "themeSelected", "viewQksmsPlusClicks", "presentation_noAnalyticsRelease"})
public abstract interface ThemePickerView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.themepicker.ThemePickerState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> themeSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> hsvThemeSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> clearHsvThemeClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> applyHsvThemeClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> viewQksmsPlusClicks();
    
    public abstract void setCurrentTheme(int color);
    
    public abstract void showQksmsPlusSnackbar();
}