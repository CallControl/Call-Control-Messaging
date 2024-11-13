package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkSeen_Factory implements Factory<MarkSeen> {
  private final Provider<MessageRepository> messageRepoProvider;

  public MarkSeen_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public MarkSeen get() {
    return provideInstance(messageRepoProvider);
  }

  public static MarkSeen provideInstance(Provider<MessageRepository> messageRepoProvider) {
    return new MarkSeen(messageRepoProvider.get());
  }

  public static MarkSeen_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new MarkSeen_Factory(messageRepoProvider);
  }

  public static MarkSeen newMarkSeen(MessageRepository messageRepo) {
    return new MarkSeen(messageRepo);
  }
}
