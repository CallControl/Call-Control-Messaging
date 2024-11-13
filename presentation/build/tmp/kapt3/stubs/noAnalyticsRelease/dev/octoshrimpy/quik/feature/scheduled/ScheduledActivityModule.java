package dev.octoshrimpy.quik.feature.scheduled;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/feature/scheduled/ScheduledActivityModule;", "", "()V", "provideScheduledViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledViewModel;", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class ScheduledActivityModule {
    
    public ScheduledActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.scheduled.ScheduledViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel provideScheduledViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.scheduled.ScheduledViewModel viewModel) {
        return null;
    }
}