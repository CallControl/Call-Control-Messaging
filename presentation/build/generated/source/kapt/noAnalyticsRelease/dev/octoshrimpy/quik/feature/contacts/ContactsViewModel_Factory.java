package dev.octoshrimpy.quik.feature.contacts;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.filter.ContactFilter;
import dev.octoshrimpy.quik.filter.ContactGroupFilter;
import dev.octoshrimpy.quik.interactor.SetDefaultPhoneNumber;
import dev.octoshrimpy.quik.repository.ContactRepository;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import java.util.HashMap;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsViewModel_Factory implements Factory<ContactsViewModel> {
  private final Provider<Boolean> sharingProvider;

  private final Provider<HashMap<String, String>> serializedChipsProvider;

  private final Provider<ContactFilter> contactFilterProvider;

  private final Provider<ContactGroupFilter> contactGroupFilterProvider;

  private final Provider<ContactRepository> contactsRepoProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<SetDefaultPhoneNumber> setDefaultPhoneNumberProvider;

  public ContactsViewModel_Factory(
      Provider<Boolean> sharingProvider,
      Provider<HashMap<String, String>> serializedChipsProvider,
      Provider<ContactFilter> contactFilterProvider,
      Provider<ContactGroupFilter> contactGroupFilterProvider,
      Provider<ContactRepository> contactsRepoProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<SetDefaultPhoneNumber> setDefaultPhoneNumberProvider) {
    this.sharingProvider = sharingProvider;
    this.serializedChipsProvider = serializedChipsProvider;
    this.contactFilterProvider = contactFilterProvider;
    this.contactGroupFilterProvider = contactGroupFilterProvider;
    this.contactsRepoProvider = contactsRepoProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.setDefaultPhoneNumberProvider = setDefaultPhoneNumberProvider;
  }

  @Override
  public ContactsViewModel get() {
    return provideInstance(
        sharingProvider,
        serializedChipsProvider,
        contactFilterProvider,
        contactGroupFilterProvider,
        contactsRepoProvider,
        conversationRepoProvider,
        phoneNumberUtilsProvider,
        setDefaultPhoneNumberProvider);
  }

  public static ContactsViewModel provideInstance(
      Provider<Boolean> sharingProvider,
      Provider<HashMap<String, String>> serializedChipsProvider,
      Provider<ContactFilter> contactFilterProvider,
      Provider<ContactGroupFilter> contactGroupFilterProvider,
      Provider<ContactRepository> contactsRepoProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<SetDefaultPhoneNumber> setDefaultPhoneNumberProvider) {
    return new ContactsViewModel(
        sharingProvider.get(),
        serializedChipsProvider.get(),
        contactFilterProvider.get(),
        contactGroupFilterProvider.get(),
        contactsRepoProvider.get(),
        conversationRepoProvider.get(),
        phoneNumberUtilsProvider.get(),
        setDefaultPhoneNumberProvider.get());
  }

  public static ContactsViewModel_Factory create(
      Provider<Boolean> sharingProvider,
      Provider<HashMap<String, String>> serializedChipsProvider,
      Provider<ContactFilter> contactFilterProvider,
      Provider<ContactGroupFilter> contactGroupFilterProvider,
      Provider<ContactRepository> contactsRepoProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<SetDefaultPhoneNumber> setDefaultPhoneNumberProvider) {
    return new ContactsViewModel_Factory(
        sharingProvider,
        serializedChipsProvider,
        contactFilterProvider,
        contactGroupFilterProvider,
        contactsRepoProvider,
        conversationRepoProvider,
        phoneNumberUtilsProvider,
        setDefaultPhoneNumberProvider);
  }

  public static ContactsViewModel newContactsViewModel(
      boolean sharing,
      HashMap<String, String> serializedChips,
      ContactFilter contactFilter,
      ContactGroupFilter contactGroupFilter,
      ContactRepository contactsRepo,
      ConversationRepository conversationRepo,
      PhoneNumberUtils phoneNumberUtils,
      SetDefaultPhoneNumber setDefaultPhoneNumber) {
    return new ContactsViewModel(
        sharing,
        serializedChips,
        contactFilter,
        contactGroupFilter,
        contactsRepo,
        conversationRepo,
        phoneNumberUtils,
        setDefaultPhoneNumber);
  }
}
