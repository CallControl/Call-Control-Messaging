package dev.octoshrimpy.quik.feature.conversationinfo;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationInfoAdapter_Factory implements Factory<ConversationInfoAdapter> {
  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  public ConversationInfoAdapter_Factory(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
  }

  @Override
  public ConversationInfoAdapter get() {
    return provideInstance(contextProvider, colorsProvider);
  }

  public static ConversationInfoAdapter provideInstance(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    return new ConversationInfoAdapter(contextProvider.get(), colorsProvider.get());
  }

  public static ConversationInfoAdapter_Factory create(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    return new ConversationInfoAdapter_Factory(contextProvider, colorsProvider);
  }

  public static ConversationInfoAdapter newConversationInfoAdapter(Context context, Colors colors) {
    return new ConversationInfoAdapter(context, colors);
  }
}
