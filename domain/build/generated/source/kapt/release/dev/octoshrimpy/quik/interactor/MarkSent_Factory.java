package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkSent_Factory implements Factory<MarkSent> {
  private final Provider<MessageRepository> messageRepoProvider;

  public MarkSent_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public MarkSent get() {
    return provideInstance(messageRepoProvider);
  }

  public static MarkSent provideInstance(Provider<MessageRepository> messageRepoProvider) {
    return new MarkSent(messageRepoProvider.get());
  }

  public static MarkSent_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new MarkSent_Factory(messageRepoProvider);
  }

  public static MarkSent newMarkSent(MessageRepository messageRepo) {
    return new MarkSent(messageRepo);
  }
}
