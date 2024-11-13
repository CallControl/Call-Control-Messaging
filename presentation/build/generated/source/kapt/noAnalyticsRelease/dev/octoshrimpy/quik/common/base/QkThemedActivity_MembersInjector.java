package dev.octoshrimpy.quik.common.base;

import dagger.MembersInjector;
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
public final class QkThemedActivity_MembersInjector implements MembersInjector<QkThemedActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  public QkThemedActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<QkThemedActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider) {
    return new QkThemedActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider);
  }

  @Override
  public void injectMembers(QkThemedActivity instance) {
    injectColors(instance, colorsProvider.get());
    injectConversationRepo(instance, conversationRepoProvider.get());
    injectMessageRepo(instance, messageRepoProvider.get());
    injectPhoneNumberUtils(instance, phoneNumberUtilsProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  public static void injectColors(QkThemedActivity instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectConversationRepo(
      QkThemedActivity instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }

  public static void injectMessageRepo(QkThemedActivity instance, MessageRepository messageRepo) {
    instance.messageRepo = messageRepo;
  }

  public static void injectPhoneNumberUtils(
      QkThemedActivity instance, PhoneNumberUtils phoneNumberUtils) {
    instance.phoneNumberUtils = phoneNumberUtils;
  }

  public static void injectPrefs(QkThemedActivity instance, Preferences prefs) {
    instance.prefs = prefs;
  }
}
