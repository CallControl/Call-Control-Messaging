package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.manager.PermissionManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidePermissionsManagerFactory
    implements Factory<PermissionManager> {
  private final AppModule module;

  private final Provider<PermissionManagerImpl> managerProvider;

  public AppModule_ProvidePermissionsManagerFactory(
      AppModule module, Provider<PermissionManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public PermissionManager get() {
    return provideInstance(module, managerProvider);
  }

  public static PermissionManager provideInstance(
      AppModule module, Provider<PermissionManagerImpl> managerProvider) {
    return proxyProvidePermissionsManager(module, managerProvider.get());
  }

  public static AppModule_ProvidePermissionsManagerFactory create(
      AppModule module, Provider<PermissionManagerImpl> managerProvider) {
    return new AppModule_ProvidePermissionsManagerFactory(module, managerProvider);
  }

  public static PermissionManager proxyProvidePermissionsManager(
      AppModule instance, PermissionManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.providePermissionsManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
