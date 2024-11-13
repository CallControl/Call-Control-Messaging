package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToRecipient;
import dev.octoshrimpy.quik.mapper.CursorToRecipientImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToRecipientFactory implements Factory<CursorToRecipient> {
  private final AppModule module;

  private final Provider<CursorToRecipientImpl> mapperProvider;

  public AppModule_ProvideCursorToRecipientFactory(
      AppModule module, Provider<CursorToRecipientImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToRecipient get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToRecipient provideInstance(
      AppModule module, Provider<CursorToRecipientImpl> mapperProvider) {
    return proxyProvideCursorToRecipient(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToRecipientFactory create(
      AppModule module, Provider<CursorToRecipientImpl> mapperProvider) {
    return new AppModule_ProvideCursorToRecipientFactory(module, mapperProvider);
  }

  public static CursorToRecipient proxyProvideCursorToRecipient(
      AppModule instance, CursorToRecipientImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToRecipient(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
