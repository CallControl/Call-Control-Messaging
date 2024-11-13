package dev.octoshrimpy.quik.repository;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.ActiveConversationManager;
import dev.octoshrimpy.quik.manager.KeyManager;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MessageRepositoryImpl_Factory implements Factory<MessageRepositoryImpl> {
  private final Provider<ActiveConversationManager> activeConversationManagerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<KeyManager> messageIdsProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<SyncRepository> syncRepositoryProvider;

  public MessageRepositoryImpl_Factory(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<Context> contextProvider,
      Provider<KeyManager> messageIdsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    this.activeConversationManagerProvider = activeConversationManagerProvider;
    this.contextProvider = contextProvider;
    this.messageIdsProvider = messageIdsProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.syncRepositoryProvider = syncRepositoryProvider;
  }

  @Override
  public MessageRepositoryImpl get() {
    return provideInstance(
        activeConversationManagerProvider,
        contextProvider,
        messageIdsProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        syncRepositoryProvider);
  }

  public static MessageRepositoryImpl provideInstance(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<Context> contextProvider,
      Provider<KeyManager> messageIdsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    return new MessageRepositoryImpl(
        activeConversationManagerProvider.get(),
        contextProvider.get(),
        messageIdsProvider.get(),
        phoneNumberUtilsProvider.get(),
        prefsProvider.get(),
        syncRepositoryProvider.get());
  }

  public static MessageRepositoryImpl_Factory create(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<Context> contextProvider,
      Provider<KeyManager> messageIdsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    return new MessageRepositoryImpl_Factory(
        activeConversationManagerProvider,
        contextProvider,
        messageIdsProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        syncRepositoryProvider);
  }

  public static MessageRepositoryImpl newMessageRepositoryImpl(
      ActiveConversationManager activeConversationManager,
      Context context,
      KeyManager messageIds,
      PhoneNumberUtils phoneNumberUtils,
      Preferences prefs,
      SyncRepository syncRepository) {
    return new MessageRepositoryImpl(
        activeConversationManager, context, messageIds, phoneNumberUtils, prefs, syncRepository);
  }
}
