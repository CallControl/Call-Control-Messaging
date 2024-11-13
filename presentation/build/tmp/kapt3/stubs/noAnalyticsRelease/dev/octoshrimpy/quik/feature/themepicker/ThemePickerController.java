package dev.octoshrimpy.quik.feature.themepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010$\u001a\u0006\u0012\u0002\b\u00030%H\u0016J\f\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0%H\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0014J\u0010\u0010,\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0014J\b\u0010-\u001a\u00020#H\u0016J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u0003H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020(H\u0016J\b\u00102\u001a\u00020#H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020(0%H\u0016J\f\u00104\u001a\u0006\u0012\u0002\b\u00030%H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerView;", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerState;", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerPresenter;", "recipientId", "", "(J)V", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerPresenter;)V", "getRecipientId", "()J", "themeAdapter", "Ldev/octoshrimpy/quik/feature/themepicker/ThemeAdapter;", "getThemeAdapter", "()Ldev/octoshrimpy/quik/feature/themepicker/ThemeAdapter;", "setThemeAdapter", "(Ldev/octoshrimpy/quik/feature/themepicker/ThemeAdapter;)V", "themePagerAdapter", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePagerAdapter;", "getThemePagerAdapter", "()Ldev/octoshrimpy/quik/feature/themepicker/ThemePagerAdapter;", "setThemePagerAdapter", "(Ldev/octoshrimpy/quik/feature/themepicker/ThemePagerAdapter;)V", "viewQksmsPlusSubject", "Lio/reactivex/subjects/Subject;", "", "applyHsvThemeClicks", "Lio/reactivex/Observable;", "clearHsvThemeClicks", "hsvThemeSelected", "", "onAttach", "view", "Landroid/view/View;", "onDetach", "onViewCreated", "render", "state", "setCurrentTheme", "color", "showQksmsPlusSnackbar", "themeSelected", "viewQksmsPlusClicks", "presentation_noAnalyticsRelease"})
public final class ThemePickerController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.themepicker.ThemePickerView, dev.octoshrimpy.quik.feature.themepicker.ThemePickerState, dev.octoshrimpy.quik.feature.themepicker.ThemePickerPresenter> implements dev.octoshrimpy.quik.feature.themepicker.ThemePickerView {
    private final long recipientId = 0L;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.themepicker.ThemePickerPresenter presenter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.themepicker.ThemeAdapter themeAdapter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.themepicker.ThemePagerAdapter themePagerAdapter;
    private final io.reactivex.subjects.Subject<kotlin.Unit> viewQksmsPlusSubject = null;
    private java.util.HashMap _$_findViewCache;
    
    public ThemePickerController() {
        super();
    }
    
    public ThemePickerController(long recipientId) {
        super();
    }
    
    public final long getRecipientId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.themepicker.ThemePickerPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemePickerPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.themepicker.ThemeAdapter getThemeAdapter() {
        return null;
    }
    
    public final void setThemeAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemeAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.themepicker.ThemePagerAdapter getThemePagerAdapter() {
        return null;
    }
    
    public final void setThemePagerAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemePagerAdapter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated() {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    protected void onDetach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void showQksmsPlusSnackbar() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> themeSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> hsvThemeSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> clearHsvThemeClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> applyHsvThemeClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> viewQksmsPlusClicks() {
        return null;
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemePickerState state) {
    }
    
    @java.lang.Override
    public void setCurrentTheme(int color) {
    }
}