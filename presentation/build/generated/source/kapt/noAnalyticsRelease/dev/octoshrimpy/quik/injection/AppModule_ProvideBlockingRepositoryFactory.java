package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.BlockingRepository;
import dev.octoshrimpy.quik.repository.BlockingRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideBlockingRepositoryFactory
    implements Factory<BlockingRepository> {
  private final AppModule module;

  private final Provider<BlockingRepositoryImpl> repositoryProvider;

  public AppModule_ProvideBlockingRepositoryFactory(
      AppModule module, Provider<BlockingRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BlockingRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static BlockingRepository provideInstance(
      AppModule module, Provider<BlockingRepositoryImpl> repositoryProvider) {
    return proxyProvideBlockingRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideBlockingRepositoryFactory create(
      AppModule module, Provider<BlockingRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideBlockingRepositoryFactory(module, repositoryProvider);
  }

  public static BlockingRepository proxyProvideBlockingRepository(
      AppModule instance, BlockingRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideBlockingRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
