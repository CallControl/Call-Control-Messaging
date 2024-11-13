package dev.octoshrimpy.quik.feature.compose;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.common.util.TextViewStyler;
import dev.octoshrimpy.quik.compat.SubscriptionManagerCompat;
import dev.octoshrimpy.quik.feature.compose.part.PartsAdapter;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MessagesAdapter_Factory implements Factory<MessagesAdapter> {
  private final Provider<SubscriptionManagerCompat> subscriptionManagerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<PartsAdapter> partsAdapterProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<TextViewStyler> textViewStylerProvider;

  public MessagesAdapter_Factory(
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider,
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<PartsAdapter> partsAdapterProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<TextViewStyler> textViewStylerProvider) {
    this.subscriptionManagerProvider = subscriptionManagerProvider;
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.partsAdapterProvider = partsAdapterProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.textViewStylerProvider = textViewStylerProvider;
  }

  @Override
  public MessagesAdapter get() {
    return provideInstance(
        subscriptionManagerProvider,
        contextProvider,
        colorsProvider,
        dateFormatterProvider,
        partsAdapterProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        textViewStylerProvider);
  }

  public static MessagesAdapter provideInstance(
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider,
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<PartsAdapter> partsAdapterProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<TextViewStyler> textViewStylerProvider) {
    return new MessagesAdapter(
        subscriptionManagerProvider.get(),
        contextProvider.get(),
        colorsProvider.get(),
        dateFormatterProvider.get(),
        partsAdapterProvider,
        phoneNumberUtilsProvider.get(),
        prefsProvider.get(),
        textViewStylerProvider.get());
  }

  public static MessagesAdapter_Factory create(
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider,
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<PartsAdapter> partsAdapterProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<TextViewStyler> textViewStylerProvider) {
    return new MessagesAdapter_Factory(
        subscriptionManagerProvider,
        contextProvider,
        colorsProvider,
        dateFormatterProvider,
        partsAdapterProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        textViewStylerProvider);
  }

  public static MessagesAdapter newMessagesAdapter(
      SubscriptionManagerCompat subscriptionManager,
      Context context,
      Colors colors,
      DateFormatter dateFormatter,
      Provider<PartsAdapter> partsAdapterProvider,
      PhoneNumberUtils phoneNumberUtils,
      Preferences prefs,
      TextViewStyler textViewStyler) {
    return new MessagesAdapter(
        subscriptionManager,
        context,
        colors,
        dateFormatter,
        partsAdapterProvider,
        phoneNumberUtils,
        prefs,
        textViewStyler);
  }
}
