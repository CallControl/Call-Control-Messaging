package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.ScheduledMessageRepository;
import dev.octoshrimpy.quik.repository.ScheduledMessageRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideScheduledMessagesRepositoryFactory
    implements Factory<ScheduledMessageRepository> {
  private final AppModule module;

  private final Provider<ScheduledMessageRepositoryImpl> repositoryProvider;

  public AppModule_ProvideScheduledMessagesRepositoryFactory(
      AppModule module, Provider<ScheduledMessageRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ScheduledMessageRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static ScheduledMessageRepository provideInstance(
      AppModule module, Provider<ScheduledMessageRepositoryImpl> repositoryProvider) {
    return proxyProvideScheduledMessagesRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideScheduledMessagesRepositoryFactory create(
      AppModule module, Provider<ScheduledMessageRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideScheduledMessagesRepositoryFactory(module, repositoryProvider);
  }

  public static ScheduledMessageRepository proxyProvideScheduledMessagesRepository(
      AppModule instance, ScheduledMessageRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideScheduledMessagesRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
