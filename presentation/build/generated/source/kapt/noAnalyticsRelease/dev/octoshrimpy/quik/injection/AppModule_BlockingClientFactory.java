package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.blocking.BlockingManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_BlockingClientFactory implements Factory<BlockingClient> {
  private final AppModule module;

  private final Provider<BlockingManager> managerProvider;

  public AppModule_BlockingClientFactory(
      AppModule module, Provider<BlockingManager> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public BlockingClient get() {
    return provideInstance(module, managerProvider);
  }

  public static BlockingClient provideInstance(
      AppModule module, Provider<BlockingManager> managerProvider) {
    return proxyBlockingClient(module, managerProvider.get());
  }

  public static AppModule_BlockingClientFactory create(
      AppModule module, Provider<BlockingManager> managerProvider) {
    return new AppModule_BlockingClientFactory(module, managerProvider);
  }

  public static BlockingClient proxyBlockingClient(AppModule instance, BlockingManager manager) {
    return Preconditions.checkNotNull(
        instance.blockingClient(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
