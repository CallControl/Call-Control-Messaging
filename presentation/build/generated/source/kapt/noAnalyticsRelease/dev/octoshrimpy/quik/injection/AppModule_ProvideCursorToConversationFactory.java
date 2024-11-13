package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToConversation;
import dev.octoshrimpy.quik.mapper.CursorToConversationImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToConversationFactory
    implements Factory<CursorToConversation> {
  private final AppModule module;

  private final Provider<CursorToConversationImpl> mapperProvider;

  public AppModule_ProvideCursorToConversationFactory(
      AppModule module, Provider<CursorToConversationImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToConversation get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToConversation provideInstance(
      AppModule module, Provider<CursorToConversationImpl> mapperProvider) {
    return proxyProvideCursorToConversation(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToConversationFactory create(
      AppModule module, Provider<CursorToConversationImpl> mapperProvider) {
    return new AppModule_ProvideCursorToConversationFactory(module, mapperProvider);
  }

  public static CursorToConversation proxyProvideCursorToConversation(
      AppModule instance, CursorToConversationImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToConversation(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
