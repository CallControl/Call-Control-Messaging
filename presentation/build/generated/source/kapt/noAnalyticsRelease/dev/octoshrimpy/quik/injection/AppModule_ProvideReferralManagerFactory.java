package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.ReferralManager;
import dev.octoshrimpy.quik.manager.ReferralManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideReferralManagerFactory implements Factory<ReferralManager> {
  private final AppModule module;

  private final Provider<ReferralManagerImpl> managerProvider;

  public AppModule_ProvideReferralManagerFactory(
      AppModule module, Provider<ReferralManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public ReferralManager get() {
    return provideInstance(module, managerProvider);
  }

  public static ReferralManager provideInstance(
      AppModule module, Provider<ReferralManagerImpl> managerProvider) {
    return proxyProvideReferralManager(module, managerProvider.get());
  }

  public static AppModule_ProvideReferralManagerFactory create(
      AppModule module, Provider<ReferralManagerImpl> managerProvider) {
    return new AppModule_ProvideReferralManagerFactory(module, managerProvider);
  }

  public static ReferralManager proxyProvideReferralManager(
      AppModule instance, ReferralManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideReferralManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
