package dev.octoshrimpy.quik.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Ldev/octoshrimpy/quik/feature/main/MainActivityModule;", "", "()V", "provideCompositeDiposableLifecycle", "Lio/reactivex/disposables/CompositeDisposable;", "provideMainViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/main/MainViewModel;", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class MainActivityModule {
    
    public MainActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    @dagger.Provides
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDiposableLifecycle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.main.MainViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel provideMainViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.main.MainViewModel viewModel) {
        return null;
    }
}