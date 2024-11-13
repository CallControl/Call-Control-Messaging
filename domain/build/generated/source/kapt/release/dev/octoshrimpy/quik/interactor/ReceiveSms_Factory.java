package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.manager.NotificationManager;
import dev.octoshrimpy.quik.manager.ShortcutManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveSms_Factory implements Factory<ReceiveSms> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  private final Provider<ShortcutManager> shortcutManagerProvider;

  public ReceiveSms_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.blockingClientProvider = blockingClientProvider;
    this.prefsProvider = prefsProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
    this.shortcutManagerProvider = shortcutManagerProvider;
  }

  @Override
  public ReceiveSms get() {
    return provideInstance(
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider,
        shortcutManagerProvider);
  }

  public static ReceiveSms provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new ReceiveSms(
        conversationRepoProvider.get(),
        blockingClientProvider.get(),
        prefsProvider.get(),
        messageRepoProvider.get(),
        notificationManagerProvider.get(),
        updateBadgeProvider.get(),
        shortcutManagerProvider.get());
  }

  public static ReceiveSms_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new ReceiveSms_Factory(
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider,
        shortcutManagerProvider);
  }

  public static ReceiveSms newReceiveSms(
      ConversationRepository conversationRepo,
      BlockingClient blockingClient,
      Preferences prefs,
      MessageRepository messageRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge,
      ShortcutManager shortcutManager) {
    return new ReceiveSms(
        conversationRepo,
        blockingClient,
        prefs,
        messageRepo,
        notificationManager,
        updateBadge,
        shortcutManager);
  }
}
