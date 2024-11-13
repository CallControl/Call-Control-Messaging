package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.SendScheduledMessage;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SendScheduledMessageReceiver_MembersInjector
    implements MembersInjector<SendScheduledMessageReceiver> {
  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<SendScheduledMessage> sendScheduledMessageProvider;

  public SendScheduledMessageReceiver_MembersInjector(
      Provider<MessageRepository> messageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    this.messageRepoProvider = messageRepoProvider;
    this.sendScheduledMessageProvider = sendScheduledMessageProvider;
  }

  public static MembersInjector<SendScheduledMessageReceiver> create(
      Provider<MessageRepository> messageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    return new SendScheduledMessageReceiver_MembersInjector(
        messageRepoProvider, sendScheduledMessageProvider);
  }

  @Override
  public void injectMembers(SendScheduledMessageReceiver instance) {
    injectMessageRepo(instance, messageRepoProvider.get());
    injectSendScheduledMessage(instance, sendScheduledMessageProvider.get());
  }

  public static void injectMessageRepo(
      SendScheduledMessageReceiver instance, MessageRepository messageRepo) {
    instance.messageRepo = messageRepo;
  }

  public static void injectSendScheduledMessage(
      SendScheduledMessageReceiver instance, SendScheduledMessage sendScheduledMessage) {
    instance.sendScheduledMessage = sendScheduledMessage;
  }
}
