package dev.octoshrimpy.quik.injection;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProvideContextFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideInstance(module);
  }

  public static Context provideInstance(AppModule module) {
    return proxyProvideContext(module);
  }

  public static AppModule_ProvideContextFactory create(AppModule module) {
    return new AppModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
