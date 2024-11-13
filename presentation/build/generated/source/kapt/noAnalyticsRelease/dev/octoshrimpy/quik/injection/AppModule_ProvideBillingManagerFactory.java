package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.common.util.BillingManagerImpl;
import dev.octoshrimpy.quik.manager.BillingManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideBillingManagerFactory implements Factory<BillingManager> {
  private final AppModule module;

  private final Provider<BillingManagerImpl> managerProvider;

  public AppModule_ProvideBillingManagerFactory(
      AppModule module, Provider<BillingManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public BillingManager get() {
    return provideInstance(module, managerProvider);
  }

  public static BillingManager provideInstance(
      AppModule module, Provider<BillingManagerImpl> managerProvider) {
    return proxyProvideBillingManager(module, managerProvider.get());
  }

  public static AppModule_ProvideBillingManagerFactory create(
      AppModule module, Provider<BillingManagerImpl> managerProvider) {
    return new AppModule_ProvideBillingManagerFactory(module, managerProvider);
  }

  public static BillingManager proxyProvideBillingManager(
      AppModule instance, BillingManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideBillingManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
