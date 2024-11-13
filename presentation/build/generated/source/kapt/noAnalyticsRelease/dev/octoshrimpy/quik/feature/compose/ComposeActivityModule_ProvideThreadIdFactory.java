package dev.octoshrimpy.quik.feature.compose;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeActivityModule_ProvideThreadIdFactory implements Factory<Long> {
  private final ComposeActivityModule module;

  private final Provider<ComposeActivity> activityProvider;

  public ComposeActivityModule_ProvideThreadIdFactory(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Long get() {
    return provideInstance(module, activityProvider);
  }

  public static Long provideInstance(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return proxyProvideThreadId(module, activityProvider.get());
  }

  public static ComposeActivityModule_ProvideThreadIdFactory create(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return new ComposeActivityModule_ProvideThreadIdFactory(module, activityProvider);
  }

  public static long proxyProvideThreadId(
      ComposeActivityModule instance, ComposeActivity activity) {
    return instance.provideThreadId(activity);
  }
}
