package dev.octoshrimpy.quik.feature.compose;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeActivityModule_ProvideComposeViewModelFactory
    implements Factory<ViewModel> {
  private final ComposeActivityModule module;

  private final Provider<ComposeViewModel> viewModelProvider;

  public ComposeActivityModule_ProvideComposeViewModelFactory(
      ComposeActivityModule module, Provider<ComposeViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      ComposeActivityModule module, Provider<ComposeViewModel> viewModelProvider) {
    return proxyProvideComposeViewModel(module, viewModelProvider.get());
  }

  public static ComposeActivityModule_ProvideComposeViewModelFactory create(
      ComposeActivityModule module, Provider<ComposeViewModel> viewModelProvider) {
    return new ComposeActivityModule_ProvideComposeViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvideComposeViewModel(
      ComposeActivityModule instance, ComposeViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideComposeViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
