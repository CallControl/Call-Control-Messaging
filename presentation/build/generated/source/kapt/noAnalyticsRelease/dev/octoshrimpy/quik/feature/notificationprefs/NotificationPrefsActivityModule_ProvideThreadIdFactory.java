package dev.octoshrimpy.quik.feature.notificationprefs;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationPrefsActivityModule_ProvideThreadIdFactory implements Factory<Long> {
  private final NotificationPrefsActivityModule module;

  private final Provider<NotificationPrefsActivity> activityProvider;

  public NotificationPrefsActivityModule_ProvideThreadIdFactory(
      NotificationPrefsActivityModule module,
      Provider<NotificationPrefsActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Long get() {
    return provideInstance(module, activityProvider);
  }

  public static Long provideInstance(
      NotificationPrefsActivityModule module,
      Provider<NotificationPrefsActivity> activityProvider) {
    return proxyProvideThreadId(module, activityProvider.get());
  }

  public static NotificationPrefsActivityModule_ProvideThreadIdFactory create(
      NotificationPrefsActivityModule module,
      Provider<NotificationPrefsActivity> activityProvider) {
    return new NotificationPrefsActivityModule_ProvideThreadIdFactory(module, activityProvider);
  }

  public static long proxyProvideThreadId(
      NotificationPrefsActivityModule instance, NotificationPrefsActivity activity) {
    return instance.provideThreadId(activity);
  }
}
