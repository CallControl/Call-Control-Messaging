package dev.octoshrimpy.quik.feature.compose;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeActivityModule_ProvideQueryFactory implements Factory<String> {
  private final ComposeActivityModule module;

  private final Provider<ComposeActivity> activityProvider;

  public ComposeActivityModule_ProvideQueryFactory(
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
    return proxyProvideQuery(module, activityProvider.get());
  }

  public static ComposeActivityModule_ProvideQueryFactory create(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return new ComposeActivityModule_ProvideQueryFactory(module, activityProvider);
  }

  public static String proxyProvideQuery(ComposeActivityModule instance, ComposeActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideQuery(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
