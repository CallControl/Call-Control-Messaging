package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkUnblocked_Factory implements Factory<MarkUnblocked> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  public MarkUnblocked_Factory(Provider<ConversationRepository> conversationRepoProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
  }

  @Override
  public MarkUnblocked get() {
    return provideInstance(conversationRepoProvider);
  }

  public static MarkUnblocked provideInstance(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new MarkUnblocked(conversationRepoProvider.get());
  }

  public static MarkUnblocked_Factory create(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new MarkUnblocked_Factory(conversationRepoProvider);
  }

  public static MarkUnblocked newMarkUnblocked(ConversationRepository conversationRepo) {
    return new MarkUnblocked(conversationRepo);
  }
}
