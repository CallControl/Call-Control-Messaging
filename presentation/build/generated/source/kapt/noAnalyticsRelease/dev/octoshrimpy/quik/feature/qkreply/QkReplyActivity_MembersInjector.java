package dev.octoshrimpy.quik.feature.qkreply;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.feature.compose.MessagesAdapter;
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
public final class QkReplyActivity_MembersInjector implements MembersInjector<QkReplyActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<MessagesAdapter> adapterProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public QkReplyActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessagesAdapter> adapterProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.adapterProvider = adapterProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<QkReplyActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessagesAdapter> adapterProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new QkReplyActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        adapterProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(QkReplyActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectAdapter(instance, adapterProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectAdapter(QkReplyActivity instance, MessagesAdapter adapter) {
    instance.adapter = adapter;
  }

  public static void injectViewModelFactory(
      QkReplyActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
