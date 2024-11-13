package dev.octoshrimpy.quik.feature.gallery;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GalleryActivityModule_ProvideGalleryViewModelFactory
    implements Factory<ViewModel> {
  private final GalleryActivityModule module;

  private final Provider<GalleryViewModel> viewModelProvider;

  public GalleryActivityModule_ProvideGalleryViewModelFactory(
      GalleryActivityModule module, Provider<GalleryViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      GalleryActivityModule module, Provider<GalleryViewModel> viewModelProvider) {
    return proxyProvideGalleryViewModel(module, viewModelProvider.get());
  }

  public static GalleryActivityModule_ProvideGalleryViewModelFactory create(
      GalleryActivityModule module, Provider<GalleryViewModel> viewModelProvider) {
    return new GalleryActivityModule_ProvideGalleryViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvideGalleryViewModel(
      GalleryActivityModule instance, GalleryViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideGalleryViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
