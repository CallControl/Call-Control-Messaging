package dev.octoshrimpy.quik.common.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PagerTitleView_MembersInjector implements MembersInjector<PagerTitleView> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  public PagerTitleView_MembersInjector(
      Provider<Colors> colorsProvider, Provider<ConversationRepository> conversationRepoProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
  }

  public static MembersInjector<PagerTitleView> create(
      Provider<Colors> colorsProvider, Provider<ConversationRepository> conversationRepoProvider) {
    return new PagerTitleView_MembersInjector(colorsProvider, conversationRepoProvider);
  }

  @Override
  public void injectMembers(PagerTitleView instance) {
    injectColors(instance, colorsProvider.get());
    injectConversationRepo(instance, conversationRepoProvider.get());
  }

  public static void injectColors(PagerTitleView instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectConversationRepo(
      PagerTitleView instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }
}
