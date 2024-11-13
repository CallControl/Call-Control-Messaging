package dev.octoshrimpy.quik.feature.qkreply;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkReplyActivityModule_ProvideThreadIdFactory implements Factory<Long> {
  private final QkReplyActivityModule module;

  private final Provider<QkReplyActivity> activityProvider;

  public QkReplyActivityModule_ProvideThreadIdFactory(
      QkReplyActivityModule module, Provider<QkReplyActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Long get() {
    return provideInstance(module, activityProvider);
  }

  public static Long provideInstance(
      QkReplyActivityModule module, Provider<QkReplyActivity> activityProvider) {
    return proxyProvideThreadId(module, activityProvider.get());
  }

  public static QkReplyActivityModule_ProvideThreadIdFactory create(
      QkReplyActivityModule module, Provider<QkReplyActivity> activityProvider) {
    return new QkReplyActivityModule_ProvideThreadIdFactory(module, activityProvider);
  }

  public static long proxyProvideThreadId(
      QkReplyActivityModule instance, QkReplyActivity activity) {
    return instance.provideThreadId(activity);
  }
}
