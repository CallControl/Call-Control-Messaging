package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.manager.ActiveConversationManager;
import dev.octoshrimpy.quik.manager.NotificationManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.repository.SyncRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveMms_Factory implements Factory<ReceiveMms> {
  private final Provider<ActiveConversationManager> activeConversationManagerProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<SyncRepository> syncManagerProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public ReceiveMms_Factory(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.activeConversationManagerProvider = activeConversationManagerProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.blockingClientProvider = blockingClientProvider;
    this.prefsProvider = prefsProvider;
    this.syncManagerProvider = syncManagerProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public ReceiveMms get() {
    return provideInstance(
        activeConversationManagerProvider,
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        syncManagerProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider);
  }

  public static ReceiveMms provideInstance(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new ReceiveMms(
        activeConversationManagerProvider.get(),
        conversationRepoProvider.get(),
        blockingClientProvider.get(),
        prefsProvider.get(),
        syncManagerProvider.get(),
        messageRepoProvider.get(),
        notificationManagerProvider.get(),
        updateBadgeProvider.get());
  }

  public static ReceiveMms_Factory create(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new ReceiveMms_Factory(
        activeConversationManagerProvider,
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        syncManagerProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider);
  }

  public static ReceiveMms newReceiveMms(
      ActiveConversationManager activeConversationManager,
      ConversationRepository conversationRepo,
      BlockingClient blockingClient,
      Preferences prefs,
      SyncRepository syncManager,
      MessageRepository messageRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge) {
    return new ReceiveMms(
        activeConversationManager,
        conversationRepo,
        blockingClient,
        prefs,
        syncManager,
        messageRepo,
        notificationManager,
        updateBadge);
  }
}
