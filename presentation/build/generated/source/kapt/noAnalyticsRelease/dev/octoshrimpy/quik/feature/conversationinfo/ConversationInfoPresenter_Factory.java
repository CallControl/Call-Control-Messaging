package dev.octoshrimpy.quik.feature.conversationinfo;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.interactor.DeleteConversations;
import dev.octoshrimpy.quik.interactor.MarkArchived;
import dev.octoshrimpy.quik.interactor.MarkUnarchived;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationInfoPresenter_Factory implements Factory<ConversationInfoPresenter> {
  private final Provider<Long> threadIdProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<DeleteConversations> deleteConversationsProvider;

  private final Provider<MarkArchived> markArchivedProvider;

  private final Provider<MarkUnarchived> markUnarchivedProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  public ConversationInfoPresenter_Factory(
      Provider<Long> threadIdProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<MarkArchived> markArchivedProvider,
      Provider<MarkUnarchived> markUnarchivedProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider) {
    this.threadIdProvider = threadIdProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.deleteConversationsProvider = deleteConversationsProvider;
    this.markArchivedProvider = markArchivedProvider;
    this.markUnarchivedProvider = markUnarchivedProvider;
    this.navigatorProvider = navigatorProvider;
    this.permissionManagerProvider = permissionManagerProvider;
  }

  @Override
  public ConversationInfoPresenter get() {
    return provideInstance(
        threadIdProvider,
        messageRepoProvider,
        contextProvider,
        conversationRepoProvider,
        deleteConversationsProvider,
        markArchivedProvider,
        markUnarchivedProvider,
        navigatorProvider,
        permissionManagerProvider);
  }

  public static ConversationInfoPresenter provideInstance(
      Provider<Long> threadIdProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<MarkArchived> markArchivedProvider,
      Provider<MarkUnarchived> markUnarchivedProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider) {
    return new ConversationInfoPresenter(
        threadIdProvider.get(),
        messageRepoProvider.get(),
        contextProvider.get(),
        conversationRepoProvider.get(),
        deleteConversationsProvider.get(),
        markArchivedProvider.get(),
        markUnarchivedProvider.get(),
        navigatorProvider.get(),
        permissionManagerProvider.get());
  }

  public static ConversationInfoPresenter_Factory create(
      Provider<Long> threadIdProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteConversations> deleteConversationsProvider,
      Provider<MarkArchived> markArchivedProvider,
      Provider<MarkUnarchived> markUnarchivedProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider) {
    return new ConversationInfoPresenter_Factory(
        threadIdProvider,
        messageRepoProvider,
        contextProvider,
        conversationRepoProvider,
        deleteConversationsProvider,
        markArchivedProvider,
        markUnarchivedProvider,
        navigatorProvider,
        permissionManagerProvider);
  }

  public static ConversationInfoPresenter newConversationInfoPresenter(
      long threadId,
      MessageRepository messageRepo,
      Context context,
      ConversationRepository conversationRepo,
      DeleteConversations deleteConversations,
      MarkArchived markArchived,
      MarkUnarchived markUnarchived,
      Navigator navigator,
      PermissionManager permissionManager) {
    return new ConversationInfoPresenter(
        threadId,
        messageRepo,
        context,
        conversationRepo,
        deleteConversations,
        markArchived,
        markUnarchived,
        navigator,
        permissionManager);
  }
}
