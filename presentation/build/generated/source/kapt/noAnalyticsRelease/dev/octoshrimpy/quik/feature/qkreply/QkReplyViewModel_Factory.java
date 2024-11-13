package dev.octoshrimpy.quik.feature.qkreply;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.compat.SubscriptionManagerCompat;
import dev.octoshrimpy.quik.interactor.DeleteMessages;
import dev.octoshrimpy.quik.interactor.MarkRead;
import dev.octoshrimpy.quik.interactor.SendMessage;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkReplyViewModel_Factory implements Factory<QkReplyViewModel> {
  private final Provider<Long> threadIdProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<DeleteMessages> deleteMessagesProvider;

  private final Provider<MarkRead> markReadProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<SendMessage> sendMessageProvider;

  private final Provider<SubscriptionManagerCompat> subscriptionManagerProvider;

  public QkReplyViewModel_Factory(
      Provider<Long> threadIdProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteMessages> deleteMessagesProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    this.threadIdProvider = threadIdProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.deleteMessagesProvider = deleteMessagesProvider;
    this.markReadProvider = markReadProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.navigatorProvider = navigatorProvider;
    this.sendMessageProvider = sendMessageProvider;
    this.subscriptionManagerProvider = subscriptionManagerProvider;
  }

  @Override
  public QkReplyViewModel get() {
    return provideInstance(
        threadIdProvider,
        conversationRepoProvider,
        deleteMessagesProvider,
        markReadProvider,
        messageRepoProvider,
        navigatorProvider,
        sendMessageProvider,
        subscriptionManagerProvider);
  }

  public static QkReplyViewModel provideInstance(
      Provider<Long> threadIdProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteMessages> deleteMessagesProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    return new QkReplyViewModel(
        threadIdProvider.get(),
        conversationRepoProvider.get(),
        deleteMessagesProvider.get(),
        markReadProvider.get(),
        messageRepoProvider.get(),
        navigatorProvider.get(),
        sendMessageProvider.get(),
        subscriptionManagerProvider.get());
  }

  public static QkReplyViewModel_Factory create(
      Provider<Long> threadIdProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteMessages> deleteMessagesProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    return new QkReplyViewModel_Factory(
        threadIdProvider,
        conversationRepoProvider,
        deleteMessagesProvider,
        markReadProvider,
        messageRepoProvider,
        navigatorProvider,
        sendMessageProvider,
        subscriptionManagerProvider);
  }

  public static QkReplyViewModel newQkReplyViewModel(
      long threadId,
      ConversationRepository conversationRepo,
      DeleteMessages deleteMessages,
      MarkRead markRead,
      MessageRepository messageRepo,
      Navigator navigator,
      SendMessage sendMessage,
      SubscriptionManagerCompat subscriptionManager) {
    return new QkReplyViewModel(
        threadId,
        conversationRepo,
        deleteMessages,
        markRead,
        messageRepo,
        navigator,
        sendMessage,
        subscriptionManager);
  }
}
