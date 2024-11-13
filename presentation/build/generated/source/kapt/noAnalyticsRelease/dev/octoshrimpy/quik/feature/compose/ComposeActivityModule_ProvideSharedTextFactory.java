package dev.octoshrimpy.quik.feature.compose;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeActivityModule_ProvideSharedTextFactory implements Factory<String> {
  private final ComposeActivityModule module;

  private final Provider<ComposeActivity> activityProvider;

  public ComposeActivityModule_ProvideSharedTextFactory(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public String get() {
    return provideInstance(module, activityProvider);
  }

  public static String provideInstance(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return proxyProvideSharedText(module, activityProvider.get());
  }

  public static ComposeActivityModule_ProvideSharedTextFactory create(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return new ComposeActivityModule_ProvideSharedTextFactory(module, activityProvider);
  }

  public static String proxyProvideSharedText(
      ComposeActivityModule instance, ComposeActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideSharedText(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
