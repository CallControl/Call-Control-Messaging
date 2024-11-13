package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.KeyManager;
import dev.octoshrimpy.quik.manager.KeyManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideKeyManagerFactory implements Factory<KeyManager> {
  private final AppModule module;

  private final Provider<KeyManagerImpl> managerProvider;

  public AppModule_ProvideKeyManagerFactory(
      AppModule module, Provider<KeyManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public KeyManager get() {
    return provideInstance(module, managerProvider);
  }

  public static KeyManager provideInstance(
      AppModule module, Provider<KeyManagerImpl> managerProvider) {
    return proxyProvideKeyManager(module, managerProvider.get());
  }

  public static AppModule_ProvideKeyManagerFactory create(
      AppModule module, Provider<KeyManagerImpl> managerProvider) {
    return new AppModule_ProvideKeyManagerFactory(module, managerProvider);
  }

  public static KeyManager proxyProvideKeyManager(AppModule instance, KeyManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideKeyManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
