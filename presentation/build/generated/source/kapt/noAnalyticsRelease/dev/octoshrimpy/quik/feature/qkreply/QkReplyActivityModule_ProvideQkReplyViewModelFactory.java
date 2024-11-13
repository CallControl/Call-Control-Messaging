package dev.octoshrimpy.quik.feature.qkreply;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkReplyActivityModule_ProvideQkReplyViewModelFactory
    implements Factory<ViewModel> {
  private final QkReplyActivityModule module;

  private final Provider<QkReplyViewModel> viewModelProvider;

  public QkReplyActivityModule_ProvideQkReplyViewModelFactory(
      QkReplyActivityModule module, Provider<QkReplyViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      QkReplyActivityModule module, Provider<QkReplyViewModel> viewModelProvider) {
    return proxyProvideQkReplyViewModel(module, viewModelProvider.get());
  }

  public static QkReplyActivityModule_ProvideQkReplyViewModelFactory create(
      QkReplyActivityModule module, Provider<QkReplyViewModel> viewModelProvider) {
    return new QkReplyActivityModule_ProvideQkReplyViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvideQkReplyViewModel(
      QkReplyActivityModule instance, QkReplyViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideQkReplyViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
