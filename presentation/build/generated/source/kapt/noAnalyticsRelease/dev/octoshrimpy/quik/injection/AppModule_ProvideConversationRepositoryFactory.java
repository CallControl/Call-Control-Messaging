package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.ConversationRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideConversationRepositoryFactory
    implements Factory<ConversationRepository> {
  private final AppModule module;

  private final Provider<ConversationRepositoryImpl> repositoryProvider;

  public AppModule_ProvideConversationRepositoryFactory(
      AppModule module, Provider<ConversationRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ConversationRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static ConversationRepository provideInstance(
      AppModule module, Provider<ConversationRepositoryImpl> repositoryProvider) {
    return proxyProvideConversationRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideConversationRepositoryFactory create(
      AppModule module, Provider<ConversationRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideConversationRepositoryFactory(module, repositoryProvider);
  }

  public static ConversationRepository proxyProvideConversationRepository(
      AppModule instance, ConversationRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideConversationRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
