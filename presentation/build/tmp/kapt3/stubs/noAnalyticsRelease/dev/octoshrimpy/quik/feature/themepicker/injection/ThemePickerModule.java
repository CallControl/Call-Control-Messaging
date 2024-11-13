package dev.octoshrimpy.quik.feature.themepicker.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/injection/ThemePickerModule;", "", "controller", "Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerController;", "(Ldev/octoshrimpy/quik/feature/themepicker/ThemePickerController;)V", "provideThreadId", "", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class ThemePickerModule {
    private final dev.octoshrimpy.quik.feature.themepicker.ThemePickerController controller = null;
    
    public ThemePickerModule(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.themepicker.ThemePickerController controller) {
        super();
    }
    
    @javax.inject.Named(value = "recipientId")
    @dev.octoshrimpy.quik.injection.scope.ControllerScope
    @dagger.Provides
    public final long provideThreadId() {
        return 0L;
    }
}