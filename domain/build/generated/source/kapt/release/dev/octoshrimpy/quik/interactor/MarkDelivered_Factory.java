package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkDelivered_Factory implements Factory<MarkDelivered> {
  private final Provider<MessageRepository> messageRepoProvider;

  public MarkDelivered_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public MarkDelivered get() {
    return provideInstance(messageRepoProvider);
  }

  public static MarkDelivered provideInstance(Provider<MessageRepository> messageRepoProvider) {
    return new MarkDelivered(messageRepoProvider.get());
  }

  public static MarkDelivered_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new MarkDelivered_Factory(messageRepoProvider);
  }

  public static MarkDelivered newMarkDelivered(MessageRepository messageRepo) {
    return new MarkDelivered(messageRepo);
  }
}
