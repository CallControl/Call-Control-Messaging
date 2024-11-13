package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.manager.AnalyticsManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideAnalyticsManagerFactory implements Factory<AnalyticsManager> {
  private final AppModule module;

  private final Provider<AnalyticsManagerImpl> managerProvider;

  public AppModule_ProvideAnalyticsManagerFactory(
      AppModule module, Provider<AnalyticsManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public AnalyticsManager get() {
    return provideInstance(module, managerProvider);
  }

  public static AnalyticsManager provideInstance(
      AppModule module, Provider<AnalyticsManagerImpl> managerProvider) {
    return proxyProvideAnalyticsManager(module, managerProvider.get());
  }

  public static AppModule_ProvideAnalyticsManagerFactory create(
      AppModule module, Provider<AnalyticsManagerImpl> managerProvider) {
    return new AppModule_ProvideAnalyticsManagerFactory(module, managerProvider);
  }

  public static AnalyticsManager proxyProvideAnalyticsManager(
      AppModule instance, AnalyticsManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideAnalyticsManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
