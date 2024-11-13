package dev.octoshrimpy.quik.feature.compose.editing;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeItemAdapter_Factory implements Factory<ComposeItemAdapter> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  public ComposeItemAdapter_Factory(
      Provider<Colors> colorsProvider, Provider<ConversationRepository> conversationRepoProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
  }

  @Override
  public ComposeItemAdapter get() {
    return provideInstance(colorsProvider, conversationRepoProvider);
  }

  public static ComposeItemAdapter provideInstance(
      Provider<Colors> colorsProvider, Provider<ConversationRepository> conversationRepoProvider) {
    return new ComposeItemAdapter(colorsProvider.get(), conversationRepoProvider.get());
  }

  public static ComposeItemAdapter_Factory create(
      Provider<Colors> colorsProvider, Provider<ConversationRepository> conversationRepoProvider) {
    return new ComposeItemAdapter_Factory(colorsProvider, conversationRepoProvider);
  }

  public static ComposeItemAdapter newComposeItemAdapter(
      Colors colors, ConversationRepository conversationRepo) {
    return new ComposeItemAdapter(colors, conversationRepo);
  }
}
