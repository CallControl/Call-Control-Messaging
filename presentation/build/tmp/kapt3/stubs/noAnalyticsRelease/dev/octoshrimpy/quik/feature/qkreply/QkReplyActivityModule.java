package dev.octoshrimpy.quik.feature.qkreply;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Ldev/octoshrimpy/quik/feature/qkreply/QkReplyActivityModule;", "", "()V", "provideQkReplyViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/qkreply/QkReplyViewModel;", "provideThreadId", "", "activity", "Ldev/octoshrimpy/quik/feature/qkreply/QkReplyActivity;", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class QkReplyActivityModule {
    
    public QkReplyActivityModule() {
        super();
    }
    
    @javax.inject.Named(value = "threadId")
    @dagger.Provides
    public final long provideThreadId(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.qkreply.QkReplyActivity activity) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.qkreply.QkReplyViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel provideQkReplyViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.qkreply.QkReplyViewModel viewModel) {
        return null;
    }
}