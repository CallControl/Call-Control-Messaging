package dev.octoshrimpy.quik.feature.compose;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u0013H\u0002\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/ComposeActivityModule;", "", "()V", "provideAddresses", "", "", "activity", "Ldev/octoshrimpy/quik/feature/compose/ComposeActivity;", "provideComposeViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/compose/ComposeViewModel;", "provideQuery", "provideSharedAttachments", "Ldev/octoshrimpy/quik/model/Attachments;", "provideSharedText", "provideThreadId", "", "decodedDataString", "Landroid/content/Intent;", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class ComposeActivityModule {
    
    public ComposeActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "query")
    @dagger.Provides
    public final java.lang.String provideQuery(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeActivity activity) {
        return null;
    }
    
    @javax.inject.Named(value = "threadId")
    @dagger.Provides
    public final long provideThreadId(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeActivity activity) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "addresses")
    @dagger.Provides
    public final java.util.List<java.lang.String> provideAddresses(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "text")
    @dagger.Provides
    public final java.lang.String provideSharedText(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "attachments")
    @dagger.Provides
    public final dev.octoshrimpy.quik.model.Attachments provideSharedAttachments(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.compose.ComposeViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel provideComposeViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.ComposeViewModel viewModel) {
        return null;
    }
    
    private final java.lang.String decodedDataString(android.content.Intent $this$decodedDataString) {
        return null;
    }
}