package dev.octoshrimpy.quik.common.util;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkChooserTargetService_MembersInjector
    implements MembersInjector<QkChooserTargetService> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  public QkChooserTargetService_MembersInjector(
      Provider<ConversationRepository> conversationRepoProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
  }

  public static MembersInjector<QkChooserTargetService> create(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new QkChooserTargetService_MembersInjector(conversationRepoProvider);
  }

  @Override
  public void injectMembers(QkChooserTargetService instance) {
    injectConversationRepo(instance, conversationRepoProvider.get());
  }

  public static void injectConversationRepo(
      QkChooserTargetService instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }
}
