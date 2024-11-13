package dev.octoshrimpy.quik.feature.scheduled;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScheduledActivityModule_ProvideScheduledViewModelFactory
    implements Factory<ViewModel> {
  private final ScheduledActivityModule module;

  private final Provider<ScheduledViewModel> viewModelProvider;

  public ScheduledActivityModule_ProvideScheduledViewModelFactory(
      ScheduledActivityModule module, Provider<ScheduledViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      ScheduledActivityModule module, Provider<ScheduledViewModel> viewModelProvider) {
    return proxyProvideScheduledViewModel(module, viewModelProvider.get());
  }

  public static ScheduledActivityModule_ProvideScheduledViewModelFactory create(
      ScheduledActivityModule module, Provider<ScheduledViewModel> viewModelProvider) {
    return new ScheduledActivityModule_ProvideScheduledViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvideScheduledViewModel(
      ScheduledActivityModule instance, ScheduledViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideScheduledViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
