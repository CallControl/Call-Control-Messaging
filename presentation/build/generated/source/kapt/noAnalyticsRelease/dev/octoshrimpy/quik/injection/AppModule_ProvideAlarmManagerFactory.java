package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.AlarmManager;
import dev.octoshrimpy.quik.manager.AlarmManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideAlarmManagerFactory implements Factory<AlarmManager> {
  private final AppModule module;

  private final Provider<AlarmManagerImpl> managerProvider;

  public AppModule_ProvideAlarmManagerFactory(
      AppModule module, Provider<AlarmManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public AlarmManager get() {
    return provideInstance(module, managerProvider);
  }

  public static AlarmManager provideInstance(
      AppModule module, Provider<AlarmManagerImpl> managerProvider) {
    return proxyProvideAlarmManager(module, managerProvider.get());
  }

  public static AppModule_ProvideAlarmManagerFactory create(
      AppModule module, Provider<AlarmManagerImpl> managerProvider) {
    return new AppModule_ProvideAlarmManagerFactory(module, managerProvider);
  }

  public static AlarmManager proxyProvideAlarmManager(
      AppModule instance, AlarmManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideAlarmManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
