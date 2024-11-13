package dev.octoshrimpy.quik.feature.notificationprefs;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.QkDialog;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
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
public final class NotificationPrefsActivity_MembersInjector
    implements MembersInjector<NotificationPrefsActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<QkDialog> actionsDialogAndPreviewModeDialogProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public NotificationPrefsActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<QkDialog> actionsDialogAndPreviewModeDialogProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.actionsDialogAndPreviewModeDialogProvider = actionsDialogAndPreviewModeDialogProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<NotificationPrefsActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<QkDialog> actionsDialogAndPreviewModeDialogProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new NotificationPrefsActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        actionsDialogAndPreviewModeDialogProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(NotificationPrefsActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectPreviewModeDialog(instance, actionsDialogAndPreviewModeDialogProvider.get());
    injectActionsDialog(instance, actionsDialogAndPreviewModeDialogProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectPreviewModeDialog(
      NotificationPrefsActivity instance, QkDialog previewModeDialog) {
    instance.previewModeDialog = previewModeDialog;
  }

  public static void injectActionsDialog(
      NotificationPrefsActivity instance, QkDialog actionsDialog) {
    instance.actionsDialog = actionsDialog;
  }

  public static void injectViewModelFactory(
      NotificationPrefsActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
