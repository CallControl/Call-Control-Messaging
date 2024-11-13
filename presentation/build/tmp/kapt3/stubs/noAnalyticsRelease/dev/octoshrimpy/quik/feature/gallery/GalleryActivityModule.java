package dev.octoshrimpy.quik.feature.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/feature/gallery/GalleryActivityModule;", "", "()V", "provideGalleryViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/gallery/GalleryViewModel;", "provideIntent", "Landroid/content/Intent;", "activity", "Ldev/octoshrimpy/quik/feature/gallery/GalleryActivity;", "providePartId", "", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class GalleryActivityModule {
    
    public GalleryActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.Intent provideIntent(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.gallery.GalleryActivity activity) {
        return null;
    }
    
    @javax.inject.Named(value = "partId")
    @dagger.Provides
    public final long providePartId(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.gallery.GalleryActivity activity) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.gallery.GalleryViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel provideGalleryViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.gallery.GalleryViewModel viewModel) {
        return null;
    }
}