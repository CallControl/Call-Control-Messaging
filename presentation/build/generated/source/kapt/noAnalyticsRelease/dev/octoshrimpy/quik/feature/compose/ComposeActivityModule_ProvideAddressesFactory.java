package dev.octoshrimpy.quik.feature.compose;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeActivityModule_ProvideAddressesFactory implements Factory<List<String>> {
  private final ComposeActivityModule module;

  private final Provider<ComposeActivity> activityProvider;

  public ComposeActivityModule_ProvideAddressesFactory(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public List<String> get() {
    return provideInstance(module, activityProvider);
  }

  public static List<String> provideInstance(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return proxyProvideAddresses(module, activityProvider.get());
  }

  public static ComposeActivityModule_ProvideAddressesFactory create(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return new ComposeActivityModule_ProvideAddressesFactory(module, activityProvider);
  }

  public static List<String> proxyProvideAddresses(
      ComposeActivityModule instance, ComposeActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideAddresses(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
