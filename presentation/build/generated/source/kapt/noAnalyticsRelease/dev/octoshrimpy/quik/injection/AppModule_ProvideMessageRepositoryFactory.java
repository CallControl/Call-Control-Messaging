package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.repository.MessageRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideMessageRepositoryFactory implements Factory<MessageRepository> {
  private final AppModule module;

  private final Provider<MessageRepositoryImpl> repositoryProvider;

  public AppModule_ProvideMessageRepositoryFactory(
      AppModule module, Provider<MessageRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MessageRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static MessageRepository provideInstance(
      AppModule module, Provider<MessageRepositoryImpl> repositoryProvider) {
    return proxyProvideMessageRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideMessageRepositoryFactory create(
      AppModule module, Provider<MessageRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideMessageRepositoryFactory(module, repositoryProvider);
  }

  public static MessageRepository proxyProvideMessageRepository(
      AppModule instance, MessageRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideMessageRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
