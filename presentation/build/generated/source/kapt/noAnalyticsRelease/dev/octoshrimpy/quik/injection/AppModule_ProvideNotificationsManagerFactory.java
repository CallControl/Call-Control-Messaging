package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.common.util.NotificationManagerImpl;
import dev.octoshrimpy.quik.manager.NotificationManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideNotificationsManagerFactory
    implements Factory<NotificationManager> {
  private final AppModule module;

  private final Provider<NotificationManagerImpl> managerProvider;

  public AppModule_ProvideNotificationsManagerFactory(
      AppModule module, Provider<NotificationManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public NotificationManager get() {
    return provideInstance(module, managerProvider);
  }

  public static NotificationManager provideInstance(
      AppModule module, Provider<NotificationManagerImpl> managerProvider) {
    return proxyProvideNotificationsManager(module, managerProvider.get());
  }

  public static AppModule_ProvideNotificationsManagerFactory create(
      AppModule module, Provider<NotificationManagerImpl> managerProvider) {
    return new AppModule_ProvideNotificationsManagerFactory(module, managerProvider);
  }

  public static NotificationManager proxyProvideNotificationsManager(
      AppModule instance, NotificationManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideNotificationsManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
