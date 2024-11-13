package dev.octoshrimpy.quik.injection;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideMoshiFactory implements Factory<Moshi> {
  private final AppModule module;

  public AppModule_ProvideMoshiFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Moshi get() {
    return provideInstance(module);
  }

  public static Moshi provideInstance(AppModule module) {
    return proxyProvideMoshi(module);
  }

  public static AppModule_ProvideMoshiFactory create(AppModule module) {
    return new AppModule_ProvideMoshiFactory(module);
  }

  public static Moshi proxyProvideMoshi(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideMoshi(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
