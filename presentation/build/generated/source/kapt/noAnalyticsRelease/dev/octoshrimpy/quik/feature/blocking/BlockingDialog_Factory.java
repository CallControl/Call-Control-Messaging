package dev.octoshrimpy.quik.feature.blocking;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.interactor.MarkBlocked;
import dev.octoshrimpy.quik.interactor.MarkUnblocked;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingDialog_Factory implements Factory<BlockingDialog> {
  private final Provider<BlockingClient> blockingManagerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<MarkBlocked> markBlockedProvider;

  private final Provider<MarkUnblocked> markUnblockedProvider;

  public BlockingDialog_Factory(
      Provider<BlockingClient> blockingManagerProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<MarkBlocked> markBlockedProvider,
      Provider<MarkUnblocked> markUnblockedProvider) {
    this.blockingManagerProvider = blockingManagerProvider;
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.prefsProvider = prefsProvider;
    this.markBlockedProvider = markBlockedProvider;
    this.markUnblockedProvider = markUnblockedProvider;
  }

  @Override
  public BlockingDialog get() {
    return provideInstance(
        blockingManagerProvider,
        contextProvider,
        conversationRepoProvider,
        prefsProvider,
        markBlockedProvider,
        markUnblockedProvider);
  }

  public static BlockingDialog provideInstance(
      Provider<BlockingClient> blockingManagerProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<MarkBlocked> markBlockedProvider,
      Provider<MarkUnblocked> markUnblockedProvider) {
    return new BlockingDialog(
        blockingManagerProvider.get(),
        contextProvider.get(),
        conversationRepoProvider.get(),
        prefsProvider.get(),
        markBlockedProvider.get(),
        markUnblockedProvider.get());
  }

  public static BlockingDialog_Factory create(
      Provider<BlockingClient> blockingManagerProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<MarkBlocked> markBlockedProvider,
      Provider<MarkUnblocked> markUnblockedProvider) {
    return new BlockingDialog_Factory(
        blockingManagerProvider,
        contextProvider,
        conversationRepoProvider,
        prefsProvider,
        markBlockedProvider,
        markUnblockedProvider);
  }

  public static BlockingDialog newBlockingDialog(
      BlockingClient blockingManager,
      Context context,
      ConversationRepository conversationRepo,
      Preferences prefs,
      MarkBlocked markBlocked,
      MarkUnblocked markUnblocked) {
    return new BlockingDialog(
        blockingManager, context, conversationRepo, prefs, markBlocked, markUnblocked);
  }
}
