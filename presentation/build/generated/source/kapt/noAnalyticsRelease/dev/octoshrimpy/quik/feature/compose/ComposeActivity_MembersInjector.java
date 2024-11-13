package dev.octoshrimpy.quik.feature.compose;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.feature.compose.editing.ChipsAdapter;
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
public final class ComposeActivity_MembersInjector implements MembersInjector<ComposeActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<AttachmentAdapter> attachmentAdapterProvider;

  private final Provider<ChipsAdapter> chipsAdapterProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<MessagesAdapter> messageAdapterProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ComposeActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<AttachmentAdapter> attachmentAdapterProvider,
      Provider<ChipsAdapter> chipsAdapterProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<MessagesAdapter> messageAdapterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.attachmentAdapterProvider = attachmentAdapterProvider;
    this.chipsAdapterProvider = chipsAdapterProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.messageAdapterProvider = messageAdapterProvider;
    this.navigatorProvider = navigatorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ComposeActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<AttachmentAdapter> attachmentAdapterProvider,
      Provider<ChipsAdapter> chipsAdapterProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<MessagesAdapter> messageAdapterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ComposeActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        attachmentAdapterProvider,
        chipsAdapterProvider,
        dateFormatterProvider,
        messageAdapterProvider,
        navigatorProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ComposeActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectAttachmentAdapter(instance, attachmentAdapterProvider.get());
    injectChipsAdapter(instance, chipsAdapterProvider.get());
    injectDateFormatter(instance, dateFormatterProvider.get());
    injectMessageAdapter(instance, messageAdapterProvider.get());
    injectNavigator(instance, navigatorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectAttachmentAdapter(
      ComposeActivity instance, AttachmentAdapter attachmentAdapter) {
    instance.attachmentAdapter = attachmentAdapter;
  }

  public static void injectChipsAdapter(ComposeActivity instance, ChipsAdapter chipsAdapter) {
    instance.chipsAdapter = chipsAdapter;
  }

  public static void injectDateFormatter(ComposeActivity instance, DateFormatter dateFormatter) {
    instance.dateFormatter = dateFormatter;
  }

  public static void injectMessageAdapter(
      ComposeActivity instance, MessagesAdapter messageAdapter) {
    instance.messageAdapter = messageAdapter;
  }

  public static void injectNavigator(ComposeActivity instance, Navigator navigator) {
    instance.navigator = navigator;
  }

  public static void injectViewModelFactory(
      ComposeActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
