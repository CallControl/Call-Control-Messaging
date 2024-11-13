package dev.octoshrimpy.quik.injection;

import androidx.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.common.ViewModelFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideViewModelFactoryFactory
    implements Factory<ViewModelProvider.Factory> {
  private final AppModule module;

  private final Provider<ViewModelFactory> factoryProvider;

  public AppModule_ProvideViewModelFactoryFactory(
      AppModule module, Provider<ViewModelFactory> factoryProvider) {
    this.module = module;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return provideInstance(module, factoryProvider);
  }

  public static ViewModelProvider.Factory provideInstance(
      AppModule module, Provider<ViewModelFactory> factoryProvider) {
    return proxyProvideViewModelFactory(module, factoryProvider.get());
  }

  public static AppModule_ProvideViewModelFactoryFactory create(
      AppModule module, Provider<ViewModelFactory> factoryProvider) {
    return new AppModule_ProvideViewModelFactoryFactory(module, factoryProvider);
  }

  public static ViewModelProvider.Factory proxyProvideViewModelFactory(
      AppModule instance, ViewModelFactory factory) {
    return Preconditions.checkNotNull(
        instance.provideViewModelFactory(factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
