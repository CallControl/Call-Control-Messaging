package dev.octoshrimpy.quik.common.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MessageDetailsFormatter_Factory implements Factory<MessageDetailsFormatter> {
  private final Provider<Context> contextProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  public MessageDetailsFormatter_Factory(
      Provider<Context> contextProvider, Provider<DateFormatter> dateFormatterProvider) {
    this.contextProvider = contextProvider;
    this.dateFormatterProvider = dateFormatterProvider;
  }

  @Override
  public MessageDetailsFormatter get() {
    return provideInstance(contextProvider, dateFormatterProvider);
  }

  public static MessageDetailsFormatter provideInstance(
      Provider<Context> contextProvider, Provider<DateFormatter> dateFormatterProvider) {
    return new MessageDetailsFormatter(contextProvider.get(), dateFormatterProvider.get());
  }

  public static MessageDetailsFormatter_Factory create(
      Provider<Context> contextProvider, Provider<DateFormatter> dateFormatterProvider) {
    return new MessageDetailsFormatter_Factory(contextProvider, dateFormatterProvider);
  }

  public static MessageDetailsFormatter newMessageDetailsFormatter(
      Context context, DateFormatter dateFormatter) {
    return new MessageDetailsFormatter(context, dateFormatter);
  }
}
