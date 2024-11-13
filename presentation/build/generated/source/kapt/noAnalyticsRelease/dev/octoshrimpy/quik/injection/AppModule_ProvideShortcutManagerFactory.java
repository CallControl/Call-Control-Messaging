package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.common.util.ShortcutManagerImpl;
import dev.octoshrimpy.quik.manager.ShortcutManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideShortcutManagerFactory implements Factory<ShortcutManager> {
  private final AppModule module;

  private final Provider<ShortcutManagerImpl> managerProvider;

  public AppModule_ProvideShortcutManagerFactory(
      AppModule module, Provider<ShortcutManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public ShortcutManager get() {
    return provideInstance(module, managerProvider);
  }

  public static ShortcutManager provideInstance(
      AppModule module, Provider<ShortcutManagerImpl> managerProvider) {
    return proxyProvideShortcutManager(module, managerProvider.get());
  }

  public static AppModule_ProvideShortcutManagerFactory create(
      AppModule module, Provider<ShortcutManagerImpl> managerProvider) {
    return new AppModule_ProvideShortcutManagerFactory(module, managerProvider);
  }

  public static ShortcutManager proxyProvideShortcutManager(
      AppModule instance, ShortcutManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideShortcutManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
