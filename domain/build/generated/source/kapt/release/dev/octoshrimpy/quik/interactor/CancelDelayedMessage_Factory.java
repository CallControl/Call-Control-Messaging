package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CancelDelayedMessage_Factory implements Factory<CancelDelayedMessage> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  public CancelDelayedMessage_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public CancelDelayedMessage get() {
    return provideInstance(conversationRepoProvider, messageRepoProvider);
  }

  public static CancelDelayedMessage provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider) {
    return new CancelDelayedMessage(conversationRepoProvider.get(), messageRepoProvider.get());
  }

  public static CancelDelayedMessage_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider) {
    return new CancelDelayedMessage_Factory(conversationRepoProvider, messageRepoProvider);
  }

  public static CancelDelayedMessage newCancelDelayedMessage(
      ConversationRepository conversationRepo, MessageRepository messageRepo) {
    return new CancelDelayedMessage(conversationRepo, messageRepo);
  }
}
