package dev.octoshrimpy.quik.feature.scheduled;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.repository.ContactRepository;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScheduledMessageAdapter_Factory implements Factory<ScheduledMessageAdapter> {
  private final Provider<Context> contextProvider;

  private final Provider<ContactRepository> contactRepoProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public ScheduledMessageAdapter_Factory(
      Provider<Context> contextProvider,
      Provider<ContactRepository> contactRepoProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.contextProvider = contextProvider;
    this.contactRepoProvider = contactRepoProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  @Override
  public ScheduledMessageAdapter get() {
    return provideInstance(
        contextProvider, contactRepoProvider, dateFormatterProvider, phoneNumberUtilsProvider);
  }

  public static ScheduledMessageAdapter provideInstance(
      Provider<Context> contextProvider,
      Provider<ContactRepository> contactRepoProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new ScheduledMessageAdapter(
        contextProvider.get(),
        contactRepoProvider.get(),
        dateFormatterProvider.get(),
        phoneNumberUtilsProvider.get());
  }

  public static ScheduledMessageAdapter_Factory create(
      Provider<Context> contextProvider,
      Provider<ContactRepository> contactRepoProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new ScheduledMessageAdapter_Factory(
        contextProvider, contactRepoProvider, dateFormatterProvider, phoneNumberUtilsProvider);
  }

  public static ScheduledMessageAdapter newScheduledMessageAdapter(
      Context context,
      ContactRepository contactRepo,
      DateFormatter dateFormatter,
      PhoneNumberUtils phoneNumberUtils) {
    return new ScheduledMessageAdapter(context, contactRepo, dateFormatter, phoneNumberUtils);
  }
}
