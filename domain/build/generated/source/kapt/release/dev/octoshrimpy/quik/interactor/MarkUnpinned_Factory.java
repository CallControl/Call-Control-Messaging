package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.ShortcutManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkUnpinned_Factory implements Factory<MarkUnpinned> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  private final Provider<ShortcutManager> shortcutManagerProvider;

  public MarkUnpinned_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.updateBadgeProvider = updateBadgeProvider;
    this.shortcutManagerProvider = shortcutManagerProvider;
  }

  @Override
  public MarkUnpinned get() {
    return provideInstance(conversationRepoProvider, updateBadgeProvider, shortcutManagerProvider);
  }

  public static MarkUnpinned provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new MarkUnpinned(
        conversationRepoProvider.get(), updateBadgeProvider.get(), shortcutManagerProvider.get());
  }

  public static MarkUnpinned_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new MarkUnpinned_Factory(
        conversationRepoProvider, updateBadgeProvider, shortcutManagerProvider);
  }

  public static MarkUnpinned newMarkUnpinned(
      ConversationRepository conversationRepo,
      UpdateBadge updateBadge,
      ShortcutManager shortcutManager) {
    return new MarkUnpinned(conversationRepo, updateBadge, shortcutManager);
  }
}
