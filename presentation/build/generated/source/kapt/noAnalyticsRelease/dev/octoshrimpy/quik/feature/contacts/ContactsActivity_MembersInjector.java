package dev.octoshrimpy.quik.feature.contacts;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.ViewModelFactory;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.feature.compose.editing.ComposeItemAdapter;
import dev.octoshrimpy.quik.feature.compose.editing.PhoneNumberPickerAdapter;
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
public final class ContactsActivity_MembersInjector implements MembersInjector<ContactsActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<ComposeItemAdapter> contactsAdapterProvider;

  private final Provider<PhoneNumberPickerAdapter> phoneNumberAdapterProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ContactsActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<ComposeItemAdapter> contactsAdapterProvider,
      Provider<PhoneNumberPickerAdapter> phoneNumberAdapterProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.contactsAdapterProvider = contactsAdapterProvider;
    this.phoneNumberAdapterProvider = phoneNumberAdapterProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ContactsActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<ComposeItemAdapter> contactsAdapterProvider,
      Provider<PhoneNumberPickerAdapter> phoneNumberAdapterProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ContactsActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        contactsAdapterProvider,
        phoneNumberAdapterProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ContactsActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectContactsAdapter(instance, contactsAdapterProvider.get());
    injectPhoneNumberAdapter(instance, phoneNumberAdapterProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectContactsAdapter(
      ContactsActivity instance, ComposeItemAdapter contactsAdapter) {
    instance.contactsAdapter = contactsAdapter;
  }

  public static void injectPhoneNumberAdapter(
      ContactsActivity instance, PhoneNumberPickerAdapter phoneNumberAdapter) {
    instance.phoneNumberAdapter = phoneNumberAdapter;
  }

  public static void injectViewModelFactory(
      ContactsActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
