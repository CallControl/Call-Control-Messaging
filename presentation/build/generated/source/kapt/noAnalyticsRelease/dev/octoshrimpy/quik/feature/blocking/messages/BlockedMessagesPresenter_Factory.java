package dev.octoshrimpy.quik.feature.blocking.messages;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.interactor.DeleteConversations;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockedMessagesPresenter_Factory implements Factory<BlockedMessagesPresenter> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<DeleteConversations> deleteConversationsProvider;

  private final Provider<Navigator> navigatorProvider;

  public BlockedMessagesPresenter_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<Navigator> navigatorProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.blockingClientProvider = blockingClientProvider;
    this.deleteConversationsProvider = deleteConversationsProvider;
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public BlockedMessagesPresenter get() {
    return provideInstance(
        conversationRepoProvider,
        blockingClientProvider,
        deleteConversationsProvider,
        navigatorProvider);
  }

  public static BlockedMessagesPresenter provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<Navigator> navigatorProvider) {
    return new BlockedMessagesPresenter(
        conversationRepoProvider.get(),
        blockingClientProvider.get(),
        deleteConversationsProvider.get(),
        navigatorProvider.get());
  }

  public static BlockedMessagesPresenter_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<Navigator> navigatorProvider) {
    return new BlockedMessagesPresenter_Factory(
        conversationRepoProvider,
        blockingClientProvider,
        deleteConversationsProvider,
        navigatorProvider);
  }

  public static BlockedMessagesPresenter newBlockedMessagesPresenter(
      ConversationRepository conversationRepo,
      BlockingClient blockingClient,
      DeleteConversations deleteConversations,
      Navigator navigator) {
    return new BlockedMessagesPresenter(
        conversationRepo, blockingClient, deleteConversations, navigator);
  }
}
