package dev.octoshrimpy.quik.feature.blocking.numbers;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.interactor.MarkUnblocked;
import dev.octoshrimpy.quik.repository.BlockingRepository;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockedNumbersPresenter_Factory implements Factory<BlockedNumbersPresenter> {
  private final Provider<BlockingRepository> blockingRepoProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MarkUnblocked> markUnblockedProvider;

  public BlockedNumbersPresenter_Factory(
      Provider<BlockingRepository> blockingRepoProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkUnblocked> markUnblockedProvider) {
    this.blockingRepoProvider = blockingRepoProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.markUnblockedProvider = markUnblockedProvider;
  }

  @Override
  public BlockedNumbersPresenter get() {
    return provideInstance(blockingRepoProvider, conversationRepoProvider, markUnblockedProvider);
  }

  public static BlockedNumbersPresenter provideInstance(
      Provider<BlockingRepository> blockingRepoProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkUnblocked> markUnblockedProvider) {
    return new BlockedNumbersPresenter(
        blockingRepoProvider.get(), conversationRepoProvider.get(), markUnblockedProvider.get());
  }

  public static BlockedNumbersPresenter_Factory create(
      Provider<BlockingRepository> blockingRepoProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkUnblocked> markUnblockedProvider) {
    return new BlockedNumbersPresenter_Factory(
        blockingRepoProvider, conversationRepoProvider, markUnblockedProvider);
  }

  public static BlockedNumbersPresenter newBlockedNumbersPresenter(
      BlockingRepository blockingRepo,
      ConversationRepository conversationRepo,
      MarkUnblocked markUnblocked) {
    return new BlockedNumbersPresenter(blockingRepo, conversationRepo, markUnblocked);
  }
}
