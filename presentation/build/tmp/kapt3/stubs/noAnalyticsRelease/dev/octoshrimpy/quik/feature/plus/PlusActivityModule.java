package dev.octoshrimpy.quik.feature.plus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/feature/plus/PlusActivityModule;", "", "()V", "providePlusViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/plus/PlusViewModel;", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class PlusActivityModule {
    
    public PlusActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.plus.PlusViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel providePlusViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.plus.PlusViewModel viewModel) {
        return null;
    }
}