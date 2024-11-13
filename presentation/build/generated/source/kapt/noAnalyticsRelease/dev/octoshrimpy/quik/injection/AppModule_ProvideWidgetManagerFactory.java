package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.WidgetManager;
import dev.octoshrimpy.quik.manager.WidgetManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideWidgetManagerFactory implements Factory<WidgetManager> {
  private final AppModule module;

  private final Provider<WidgetManagerImpl> managerProvider;

  public AppModule_ProvideWidgetManagerFactory(
      AppModule module, Provider<WidgetManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public WidgetManager get() {
    return provideInstance(module, managerProvider);
  }

  public static WidgetManager provideInstance(
      AppModule module, Provider<WidgetManagerImpl> managerProvider) {
    return proxyProvideWidgetManager(module, managerProvider.get());
  }

  public static AppModule_ProvideWidgetManagerFactory create(
      AppModule module, Provider<WidgetManagerImpl> managerProvider) {
    return new AppModule_ProvideWidgetManagerFactory(module, managerProvider);
  }

  public static WidgetManager proxyProvideWidgetManager(
      AppModule instance, WidgetManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideWidgetManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
