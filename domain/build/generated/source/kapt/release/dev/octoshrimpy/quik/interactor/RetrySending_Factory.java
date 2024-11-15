package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetrySending_Factory implements Factory<RetrySending> {
  private final Provider<MessageRepository> messageRepoProvider;

  public RetrySending_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public RetrySending get() {
    return provideInstance(messageRepoProvider);
  }

  public static RetrySending provideInstance(Provider<MessageRepository> messageRepoProvider) {
    return new RetrySending(messageRepoProvider.get());
  }

  public static RetrySending_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new RetrySending_Factory(messageRepoProvider);
  }

  public static RetrySending newRetrySending(MessageRepository messageRepo) {
    return new RetrySending(messageRepo);
  }
}
