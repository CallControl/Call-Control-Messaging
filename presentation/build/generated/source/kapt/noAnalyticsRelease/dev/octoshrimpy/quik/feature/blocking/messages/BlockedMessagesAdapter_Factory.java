package dev.octoshrimpy.quik.feature.blocking.messages;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockedMessagesAdapter_Factory implements Factory<BlockedMessagesAdapter> {
  private final Provider<Context> contextProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  public BlockedMessagesAdapter_Factory(
      Provider<Context> contextProvider, Provider<DateFormatter> dateFormatterProvider) {
    this.contextProvider = contextProvider;
    this.dateFormatterProvider = dateFormatterProvider;
  }

  @Override
  public BlockedMessagesAdapter get() {
    return provideInstance(contextProvider, dateFormatterProvider);
  }

  public static BlockedMessagesAdapter provideInstance(
      Provider<Context> contextProvider, Provider<DateFormatter> dateFormatterProvider) {
    return new BlockedMessagesAdapter(contextProvider.get(), dateFormatterProvider.get());
  }

  public static BlockedMessagesAdapter_Factory create(
      Provider<Context> contextProvider, Provider<DateFormatter> dateFormatterProvider) {
    return new BlockedMessagesAdapter_Factory(contextProvider, dateFormatterProvider);
  }

  public static BlockedMessagesAdapter newBlockedMessagesAdapter(
      Context context, DateFormatter dateFormatter) {
    return new BlockedMessagesAdapter(context, dateFormatter);
  }
}
