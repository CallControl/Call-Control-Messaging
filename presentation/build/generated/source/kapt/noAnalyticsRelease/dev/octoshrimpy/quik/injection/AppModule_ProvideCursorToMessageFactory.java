package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToMessage;
import dev.octoshrimpy.quik.mapper.CursorToMessageImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToMessageFactory implements Factory<CursorToMessage> {
  private final AppModule module;

  private final Provider<CursorToMessageImpl> mapperProvider;

  public AppModule_ProvideCursorToMessageFactory(
      AppModule module, Provider<CursorToMessageImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToMessage get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToMessage provideInstance(
      AppModule module, Provider<CursorToMessageImpl> mapperProvider) {
    return proxyProvideCursorToMessage(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToMessageFactory create(
      AppModule module, Provider<CursorToMessageImpl> mapperProvider) {
    return new AppModule_ProvideCursorToMessageFactory(module, mapperProvider);
  }

  public static CursorToMessage proxyProvideCursorToMessage(
      AppModule instance, CursorToMessageImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToMessage(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
