package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToContact;
import dev.octoshrimpy.quik.mapper.CursorToContactImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToContactFactory implements Factory<CursorToContact> {
  private final AppModule module;

  private final Provider<CursorToContactImpl> mapperProvider;

  public AppModule_ProvideCursorToContactFactory(
      AppModule module, Provider<CursorToContactImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToContact get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToContact provideInstance(
      AppModule module, Provider<CursorToContactImpl> mapperProvider) {
    return proxyProvideCursorToContact(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToContactFactory create(
      AppModule module, Provider<CursorToContactImpl> mapperProvider) {
    return new AppModule_ProvideCursorToContactFactory(module, mapperProvider);
  }

  public static CursorToContact proxyProvideCursorToContact(
      AppModule instance, CursorToContactImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToContact(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
