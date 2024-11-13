package dev.octoshrimpy.quik.feature.themepicker.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/injection/ThemePickerComponent;", "", "inject", "", "controller", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerController;", "Builder", "presentation_noAnalyticsRelease"})
@dagger.Subcomponent(modules = {dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerModule.class})
@dev.octoshrimpy.quik.injection.scope.ControllerScope
public abstract interface ThemePickerComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemePickerController controller);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/injection/ThemePickerComponent$Builder;", "", "build", "Ldev/octoshrimpy/quik/feature/themepicker/injection/ThemePickerComponent;", "themePickerModule", "module", "Ldev/octoshrimpy/quik/feature/themepicker/injection/ThemePickerModule;", "presentation_noAnalyticsRelease"})
    @dagger.Subcomponent.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        public abstract dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerComponent.Builder themePickerModule(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerModule module);
        
        @org.jetbrains.annotations.NotNull
        public abstract dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerComponent build();
    }
}