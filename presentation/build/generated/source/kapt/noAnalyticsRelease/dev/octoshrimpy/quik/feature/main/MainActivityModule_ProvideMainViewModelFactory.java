package dev.octoshrimpy.quik.feature.main;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityModule_ProvideMainViewModelFactory implements Factory<ViewModel> {
  private final MainActivityModule module;

  private final Provider<MainViewModel> viewModelProvider;

  public MainActivityModule_ProvideMainViewModelFactory(
      MainActivityModule module, Provider<MainViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      MainActivityModule module, Provider<MainViewModel> viewModelProvider) {
    return proxyProvideMainViewModel(module, viewModelProvider.get());
  }

  public static MainActivityModule_ProvideMainViewModelFactory create(
      MainActivityModule module, Provider<MainViewModel> viewModelProvider) {
    return new MainActivityModule_ProvideMainViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvideMainViewModel(
      MainActivityModule instance, MainViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideMainViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
