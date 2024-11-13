package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteOldMessages_Factory implements Factory<DeleteOldMessages> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<Preferences> prefsProvider;

  public DeleteOldMessages_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Preferences> prefsProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public DeleteOldMessages get() {
    return provideInstance(conversationRepoProvider, messageRepoProvider, prefsProvider);
  }

  public static DeleteOldMessages provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Preferences> prefsProvider) {
    return new DeleteOldMessages(
        conversationRepoProvider.get(), messageRepoProvider.get(), prefsProvider.get());
  }

  public static DeleteOldMessages_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Preferences> prefsProvider) {
    return new DeleteOldMessages_Factory(
        conversationRepoProvider, messageRepoProvider, prefsProvider);
  }

  public static DeleteOldMessages newDeleteOldMessages(
      ConversationRepository conversationRepo, MessageRepository messageRepo, Preferences prefs) {
    return new DeleteOldMessages(conversationRepo, messageRepo, prefs);
  }
}
