package dev.octoshrimpy.quik.feature.conversations;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationsAdapter_Factory implements Factory<ConversationsAdapter> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Context> contextProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public ConversationsAdapter_Factory(
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.colorsProvider = colorsProvider;
    this.contextProvider = contextProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.navigatorProvider = navigatorProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  @Override
  public ConversationsAdapter get() {
    return provideInstance(
        colorsProvider,
        contextProvider,
        dateFormatterProvider,
        navigatorProvider,
        phoneNumberUtilsProvider);
  }

  public static ConversationsAdapter provideInstance(
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new ConversationsAdapter(
        colorsProvider.get(),
        contextProvider.get(),
        dateFormatterProvider.get(),
        navigatorProvider.get(),
        phoneNumberUtilsProvider.get());
  }

  public static ConversationsAdapter_Factory create(
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new ConversationsAdapter_Factory(
        colorsProvider,
        contextProvider,
        dateFormatterProvider,
        navigatorProvider,
        phoneNumberUtilsProvider);
  }

  public static ConversationsAdapter newConversationsAdapter(
      Colors colors,
      Context context,
      DateFormatter dateFormatter,
      Navigator navigator,
      PhoneNumberUtils phoneNumberUtils) {
    return new ConversationsAdapter(colors, context, dateFormatter, navigator, phoneNumberUtils);
  }
}
