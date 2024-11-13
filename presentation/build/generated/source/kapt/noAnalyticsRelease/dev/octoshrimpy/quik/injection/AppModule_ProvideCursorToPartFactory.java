package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToPart;
import dev.octoshrimpy.quik.mapper.CursorToPartImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToPartFactory implements Factory<CursorToPart> {
  private final AppModule module;

  private final Provider<CursorToPartImpl> mapperProvider;

  public AppModule_ProvideCursorToPartFactory(
      AppModule module, Provider<CursorToPartImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToPart get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToPart provideInstance(
      AppModule module, Provider<CursorToPartImpl> mapperProvider) {
    return proxyProvideCursorToPart(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToPartFactory create(
      AppModule module, Provider<CursorToPartImpl> mapperProvider) {
    return new AppModule_ProvideCursorToPartFactory(module, mapperProvider);
  }

  public static CursorToPart proxyProvideCursorToPart(AppModule instance, CursorToPartImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToPart(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
