package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.manager.ActiveConversationManager;
import dev.octoshrimpy.quik.manager.ActiveConversationManagerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideActiveConversationManagerFactory
    implements Factory<ActiveConversationManager> {
  private final AppModule module;

  private final Provider<ActiveConversationManagerImpl> managerProvider;

  public AppModule_ProvideActiveConversationManagerFactory(
      AppModule module, Provider<ActiveConversationManagerImpl> managerProvider) {
    this.module = module;
    this.managerProvider = managerProvider;
  }

  @Override
  public ActiveConversationManager get() {
    return provideInstance(module, managerProvider);
  }

  public static ActiveConversationManager provideInstance(
      AppModule module, Provider<ActiveConversationManagerImpl> managerProvider) {
    return proxyProvideActiveConversationManager(module, managerProvider.get());
  }

  public static AppModule_ProvideActiveConversationManagerFactory create(
      AppModule module, Provider<ActiveConversationManagerImpl> managerProvider) {
    return new AppModule_ProvideActiveConversationManagerFactory(module, managerProvider);
  }

  public static ActiveConversationManager proxyProvideActiveConversationManager(
      AppModule instance, ActiveConversationManagerImpl manager) {
    return Preconditions.checkNotNull(
        instance.provideActiveConversationManager(manager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
