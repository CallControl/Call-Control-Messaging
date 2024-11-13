package dev.octoshrimpy.quik.feature.plus;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlusActivityModule_ProvidePlusViewModelFactory implements Factory<ViewModel> {
  private final PlusActivityModule module;

  private final Provider<PlusViewModel> viewModelProvider;

  public PlusActivityModule_ProvidePlusViewModelFactory(
      PlusActivityModule module, Provider<PlusViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      PlusActivityModule module, Provider<PlusViewModel> viewModelProvider) {
    return proxyProvidePlusViewModel(module, viewModelProvider.get());
  }

  public static PlusActivityModule_ProvidePlusViewModelFactory create(
      PlusActivityModule module, Provider<PlusViewModel> viewModelProvider) {
    return new PlusActivityModule_ProvidePlusViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvidePlusViewModel(
      PlusActivityModule instance, PlusViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.providePlusViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
