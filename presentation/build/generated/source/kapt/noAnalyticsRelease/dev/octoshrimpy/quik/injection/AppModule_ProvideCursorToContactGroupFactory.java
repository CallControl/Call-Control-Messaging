package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToContactGroup;
import dev.octoshrimpy.quik.mapper.CursorToContactGroupImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToContactGroupFactory
    implements Factory<CursorToContactGroup> {
  private final AppModule module;

  private final Provider<CursorToContactGroupImpl> mapperProvider;

  public AppModule_ProvideCursorToContactGroupFactory(
      AppModule module, Provider<CursorToContactGroupImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToContactGroup get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToContactGroup provideInstance(
      AppModule module, Provider<CursorToContactGroupImpl> mapperProvider) {
    return proxyProvideCursorToContactGroup(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToContactGroupFactory create(
      AppModule module, Provider<CursorToContactGroupImpl> mapperProvider) {
    return new AppModule_ProvideCursorToContactGroupFactory(module, mapperProvider);
  }

  public static CursorToContactGroup proxyProvideCursorToContactGroup(
      AppModule instance, CursorToContactGroupImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToContactGroup(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
