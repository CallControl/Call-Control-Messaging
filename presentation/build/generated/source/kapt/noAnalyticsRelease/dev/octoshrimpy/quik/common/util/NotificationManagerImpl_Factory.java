package dev.octoshrimpy.quik.common.util;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationManagerImpl_Factory implements Factory<NotificationManagerImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PermissionManager> permissionsProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public NotificationManagerImpl_Factory(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PermissionManager> permissionsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.prefsProvider = prefsProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.permissionsProvider = permissionsProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  @Override
  public NotificationManagerImpl get() {
    return provideInstance(
        contextProvider,
        colorsProvider,
        conversationRepoProvider,
        prefsProvider,
        messageRepoProvider,
        permissionsProvider,
        phoneNumberUtilsProvider);
  }

  public static NotificationManagerImpl provideInstance(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PermissionManager> permissionsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new NotificationManagerImpl(
        contextProvider.get(),
        colorsProvider.get(),
        conversationRepoProvider.get(),
        prefsProvider.get(),
        messageRepoProvider.get(),
        permissionsProvider.get(),
        phoneNumberUtilsProvider.get());
  }

  public static NotificationManagerImpl_Factory create(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PermissionManager> permissionsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new NotificationManagerImpl_Factory(
        contextProvider,
        colorsProvider,
        conversationRepoProvider,
        prefsProvider,
        messageRepoProvider,
        permissionsProvider,
        phoneNumberUtilsProvider);
  }

  public static NotificationManagerImpl newNotificationManagerImpl(
      Context context,
      Colors colors,
      ConversationRepository conversationRepo,
      Preferences prefs,
      MessageRepository messageRepo,
      PermissionManager permissions,
      PhoneNumberUtils phoneNumberUtils) {
    return new NotificationManagerImpl(
        context, colors, conversationRepo, prefs, messageRepo, permissions, phoneNumberUtils);
  }
}
