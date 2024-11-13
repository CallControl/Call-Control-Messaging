package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.ChangelogManager;
import dev.octoshrimpy.quik.manager.ChangelogManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ChangelogManagerFactory implements Factory<ChangelogManager> {
  private final AppModule module;

  private final Provider<ChangelogManagerImpl> managerProvider;

  public AppModule_ChangelogManagerFactory(
      AppModule module, Provider<ChangelogManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public ChangelogManager get() {
    return provideInstance(module, managerProvider);
  }

  public static ChangelogManager provideInstance(
      AppModule module, Provider<ChangelogManagerImpl> managerProvider) {
    return proxyChangelogManager(module, managerProvider.get());
  }

  public static AppModule_ChangelogManagerFactory create(
      AppModule module, Provider<ChangelogManagerImpl> managerProvider) {
    return new AppModule_ChangelogManagerFactory(module, managerProvider);
  }

  public static ChangelogManager proxyChangelogManager(
      AppModule instance, ChangelogManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.changelogManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
