package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.RatingManager;
import dev.octoshrimpy.quik.mapper.RatingManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRatingManagerFactory implements Factory<RatingManager> {
  private final AppModule module;

  private final Provider<RatingManagerImpl> managerProvider;

  public AppModule_ProvideRatingManagerFactory(
      AppModule module, Provider<RatingManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public RatingManager get() {
    return provideInstance(module, managerProvider);
  }

  public static RatingManager provideInstance(
      AppModule module, Provider<RatingManagerImpl> managerProvider) {
    return proxyProvideRatingManager(module, managerProvider.get());
  }

  public static AppModule_ProvideRatingManagerFactory create(
      AppModule module, Provider<RatingManagerImpl> managerProvider) {
    return new AppModule_ProvideRatingManagerFactory(module, managerProvider);
  }

  public static RatingManager proxyProvideRatingManager(
      AppModule instance, RatingManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideRatingManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
