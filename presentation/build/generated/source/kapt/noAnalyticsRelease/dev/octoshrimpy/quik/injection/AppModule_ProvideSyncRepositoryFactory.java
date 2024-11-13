package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.SyncRepository;
import dev.octoshrimpy.quik.repository.SyncRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSyncRepositoryFactory implements Factory<SyncRepository> {
  private final AppModule module;

  private final Provider<SyncRepositoryImpl> repositoryProvider;

  public AppModule_ProvideSyncRepositoryFactory(
      AppModule module, Provider<SyncRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SyncRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static SyncRepository provideInstance(
      AppModule module, Provider<SyncRepositoryImpl> repositoryProvider) {
    return proxyProvideSyncRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideSyncRepositoryFactory create(
      AppModule module, Provider<SyncRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideSyncRepositoryFactory(module, repositoryProvider);
  }

  public static SyncRepository proxyProvideSyncRepository(
      AppModule instance, SyncRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideSyncRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
