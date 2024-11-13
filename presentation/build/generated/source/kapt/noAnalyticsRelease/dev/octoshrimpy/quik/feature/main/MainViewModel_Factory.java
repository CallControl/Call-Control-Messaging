package dev.octoshrimpy.quik.feature.main;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.interactor.DeleteConversations;
import dev.octoshrimpy.quik.interactor.MarkAllSeen;
import dev.octoshrimpy.quik.interactor.MarkArchived;
import dev.octoshrimpy.quik.interactor.MarkPinned;
import dev.octoshrimpy.quik.interactor.MarkRead;
import dev.octoshrimpy.quik.interactor.MarkUnarchived;
import dev.octoshrimpy.quik.interactor.MarkUnpinned;
import dev.octoshrimpy.quik.interactor.MarkUnread;
import dev.octoshrimpy.quik.interactor.MigratePreferences;
import dev.octoshrimpy.quik.interactor.SyncContacts;
import dev.octoshrimpy.quik.interactor.SyncMessages;
import dev.octoshrimpy.quik.listener.ContactAddedListener;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.manager.ChangelogManager;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.manager.RatingManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.SyncRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<ContactAddedListener> contactAddedListenerProvider;

  private final Provider<MarkAllSeen> markAllSeenProvider;

  private final Provider<MigratePreferences> migratePreferencesProvider;

  private final Provider<SyncRepository> syncRepositoryProvider;

  private final Provider<ChangelogManager> changelogManagerProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<DeleteConversations> deleteConversationsProvider;

  private final Provider<MarkArchived> markArchivedProvider;

  private final Provider<MarkPinned> markPinnedProvider;

  private final Provider<MarkRead> markReadProvider;

  private final Provider<MarkUnarchived> markUnarchivedProvider;

  private final Provider<MarkUnpinned> markUnpinnedProvider;

  private final Provider<MarkUnread> markUnreadProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<RatingManager> ratingManagerProvider;

  private final Provider<SyncContacts> syncContactsProvider;

  private final Provider<SyncMessages> syncMessagesProvider;

  public MainViewModel_Factory(
      Provider<BillingManager> billingManagerProvider,
      Provider<ContactAddedListener> contactAddedListenerProvider,
      Provider<MarkAllSeen> markAllSeenProvider,
      Provider<MigratePreferences> migratePreferencesProvider,
      Provider<SyncRepository> syncRepositoryProvider,
      Provider<ChangelogManager> changelogManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<MarkArchived> markArchivedProvider,
      Provider<MarkPinned> markPinnedProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MarkUnarchived> markUnarchivedProvider,
      Provider<MarkUnpinned> markUnpinnedProvider,
      Provider<MarkUnread> markUnreadProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<RatingManager> ratingManagerProvider,
      Provider<SyncContacts> syncContactsProvider,
      Provider<SyncMessages> syncMessagesProvider) {
    this.billingManagerProvider = billingManagerProvider;
    this.contactAddedListenerProvider = contactAddedListenerProvider;
    this.markAllSeenProvider = markAllSeenProvider;
    this.migratePreferencesProvider = migratePreferencesProvider;
    this.syncRepositoryProvider = syncRepositoryProvider;
    this.changelogManagerProvider = changelogManagerProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.deleteConversationsProvider = deleteConversationsProvider;
    this.markArchivedProvider = markArchivedProvider;
    this.markPinnedProvider = markPinnedProvider;
    this.markReadProvider = markReadProvider;
    this.markUnarchivedProvider = markUnarchivedProvider;
    this.markUnpinnedProvider = markUnpinnedProvider;
    this.markUnreadProvider = markUnreadProvider;
    this.navigatorProvider = navigatorProvider;
    this.permissionManagerProvider = permissionManagerProvider;
    this.prefsProvider = prefsProvider;
    this.ratingManagerProvider = ratingManagerProvider;
    this.syncContactsProvider = syncContactsProvider;
    this.syncMessagesProvider = syncMessagesProvider;
  }

  @Override
  public MainViewModel get() {
    return provideInstance(
        billingManagerProvider,
        contactAddedListenerProvider,
        markAllSeenProvider,
        migratePreferencesProvider,
        syncRepositoryProvider,
        changelogManagerProvider,
        conversationRepoProvider,
        deleteConversationsProvider,
        markArchivedProvider,
        markPinnedProvider,
        markReadProvider,
        markUnarchivedProvider,
        markUnpinnedProvider,
        markUnreadProvider,
        navigatorProvider,
        permissionManagerProvider,
        prefsProvider,
        ratingManagerProvider,
        syncContactsProvider,
        syncMessagesProvider);
  }

  public static MainViewModel provideInstance(
      Provider<BillingManager> billingManagerProvider,
      Provider<ContactAddedListener> contactAddedListenerProvider,
      Provider<MarkAllSeen> markAllSeenProvider,
      Provider<MigratePreferences> migratePreferencesProvider,
      Provider<SyncRepository> syncRepositoryProvider,
      Provider<ChangelogManager> changelogManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<MarkArchived> markArchivedProvider,
      Provider<MarkPinned> markPinnedProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MarkUnarchived> markUnarchivedProvider,
      Provider<MarkUnpinned> markUnpinnedProvider,
      Provider<MarkUnread> markUnreadProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<RatingManager> ratingManagerProvider,
      Provider<SyncContacts> syncContactsProvider,
      Provider<SyncMessages> syncMessagesProvider) {
    return new MainViewModel(
        billingManagerProvider.get(),
        contactAddedListenerProvider.get(),
        markAllSeenProvider.get(),
        migratePreferencesProvider.get(),
        syncRepositoryProvider.get(),
        changelogManagerProvider.get(),
        conversationRepoProvider.get(),
        deleteConversationsProvider.get(),
        markArchivedProvider.get(),
        markPinnedProvider.get(),
        markReadProvider.get(),
        markUnarchivedProvider.get(),
        markUnpinnedProvider.get(),
        markUnreadProvider.get(),
        navigatorProvider.get(),
        permissionManagerProvider.get(),
        prefsProvider.get(),
        ratingManagerProvider.get(),
        syncContactsProvider.get(),
        syncMessagesProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<BillingManager> billingManagerProvider,
      Provider<ContactAddedListener> contactAddedListenerProvider,
      Provider<MarkAllSeen> markAllSeenProvider,
      Provider<MigratePreferences> migratePreferencesProvider,
      Provider<SyncRepository> syncRepositoryProvider,
      Provider<ChangelogManager> changelogManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<MarkArchived> markArchivedProvider,
      Provider<MarkPinned> markPinnedProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MarkUnarchived> markUnarchivedProvider,
      Provider<MarkUnpinned> markUnpinnedProvider,
      Provider<MarkUnread> markUnreadProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<RatingManager> ratingManagerProvider,
      Provider<SyncContacts> syncContactsProvider,
      Provider<SyncMessages> syncMessagesProvider) {
    return new MainViewModel_Factory(
        billingManagerProvider,
        contactAddedListenerProvider,
        markAllSeenProvider,
        migratePreferencesProvider,
        syncRepositoryProvider,
        changelogManagerProvider,
        conversationRepoProvider,
        deleteConversationsProvider,
        markArchivedProvider,
        markPinnedProvider,
        markReadProvider,
        markUnarchivedProvider,
        markUnpinnedProvider,
        markUnreadProvider,
        navigatorProvider,
        permissionManagerProvider,
        prefsProvider,
        ratingManagerProvider,
        syncContactsProvider,
        syncMessagesProvider);
  }

  public static MainViewModel newMainViewModel(
      BillingManager billingManager,
      ContactAddedListener contactAddedListener,
      MarkAllSeen markAllSeen,
      MigratePreferences migratePreferences,
      SyncRepository syncRepository,
      ChangelogManager changelogManager,
      ConversationRepository conversationRepo,
      DeleteConversations deleteConversations,
      MarkArchived markArchived,
      MarkPinned markPinned,
      MarkRead markRead,
      MarkUnarchived markUnarchived,
      MarkUnpinned markUnpinned,
      MarkUnread markUnread,
      Navigator navigator,
      PermissionManager permissionManager,
      Preferences prefs,
      RatingManager ratingManager,
      SyncContacts syncContacts,
      SyncMessages syncMessages) {
    return new MainViewModel(
        billingManager,
        contactAddedListener,
        markAllSeen,
        migratePreferences,
        syncRepository,
        changelogManager,
        conversationRepo,
        deleteConversations,
        markArchived,
        markPinned,
        markRead,
        markUnarchived,
        markUnpinned,
        markUnread,
        navigator,
        permissionManager,
        prefs,
        ratingManager,
        syncContacts,
        syncMessages);
  }
}
