package dev.octoshrimpy.quik.common.util;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShortcutManagerImpl_Factory implements Factory<ShortcutManagerImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  public ShortcutManagerImpl_Factory(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider) {
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public ShortcutManagerImpl get() {
    return provideInstance(contextProvider, conversationRepoProvider, messageRepoProvider);
  }

  public static ShortcutManagerImpl provideInstance(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider) {
    return new ShortcutManagerImpl(
        contextProvider.get(), conversationRepoProvider.get(), messageRepoProvider.get());
  }

  public static ShortcutManagerImpl_Factory create(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider) {
    return new ShortcutManagerImpl_Factory(
        contextProvider, conversationRepoProvider, messageRepoProvider);
  }

  public static ShortcutManagerImpl newShortcutManagerImpl(
      Context context, ConversationRepository conversationRepo, MessageRepository messageRepo) {
    return new ShortcutManagerImpl(context, conversationRepo, messageRepo);
  }
}
