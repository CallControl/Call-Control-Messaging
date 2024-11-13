package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkUnarchived_Factory implements Factory<MarkUnarchived> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  public MarkUnarchived_Factory(Provider<ConversationRepository> conversationRepoProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
  }

  @Override
  public MarkUnarchived get() {
    return provideInstance(conversationRepoProvider);
  }

  public static MarkUnarchived provideInstance(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new MarkUnarchived(conversationRepoProvider.get());
  }

  public static MarkUnarchived_Factory create(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new MarkUnarchived_Factory(conversationRepoProvider);
  }

  public static MarkUnarchived newMarkUnarchived(ConversationRepository conversationRepo) {
    return new MarkUnarchived(conversationRepo);
  }
}
