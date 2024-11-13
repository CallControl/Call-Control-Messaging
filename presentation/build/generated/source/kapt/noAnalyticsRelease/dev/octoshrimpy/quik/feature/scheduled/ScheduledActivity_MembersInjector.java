package dev.octoshrimpy.quik.feature.scheduled;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.QkDialog;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.FontProvider;
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
public final class ScheduledActivity_MembersInjector implements MembersInjector<ScheduledActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<QkDialog> dialogProvider;

  private final Provider<FontProvider> fontProvider;

  private final Provider<ScheduledMessageAdapter> messageAdapterProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ScheduledActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<QkDialog> dialogProvider,
      Provider<FontProvider> fontProvider,
      Provider<ScheduledMessageAdapter> messageAdapterProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.dialogProvider = dialogProvider;
    this.fontProvider = fontProvider;
    this.messageAdapterProvider = messageAdapterProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ScheduledActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<QkDialog> dialogProvider,
      Provider<FontProvider> fontProvider,
      Provider<ScheduledMessageAdapter> messageAdapterProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ScheduledActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        dialogProvider,
        fontProvider,
        messageAdapterProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ScheduledActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectDialog(instance, dialogProvider.get());
    injectFontProvider(instance, fontProvider.get());
    injectMessageAdapter(instance, messageAdapterProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectDialog(ScheduledActivity instance, QkDialog dialog) {
    instance.dialog = dialog;
  }

  public static void injectFontProvider(ScheduledActivity instance, FontProvider fontProvider) {
    instance.fontProvider = fontProvider;
  }

  public static void injectMessageAdapter(
      ScheduledActivity instance, ScheduledMessageAdapter messageAdapter) {
    instance.messageAdapter = messageAdapter;
  }

  public static void injectViewModelFactory(
      ScheduledActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
