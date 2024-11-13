package dev.octoshrimpy.quik.common.util;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Colors_Factory implements Factory<Colors> {
  private final Provider<Context> contextProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  public Colors_Factory(
      Provider<Context> contextProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider) {
    this.contextProvider = contextProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public Colors get() {
    return provideInstance(contextProvider, phoneNumberUtilsProvider, prefsProvider);
  }

  public static Colors provideInstance(
      Provider<Context> contextProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider) {
    return new Colors(contextProvider.get(), phoneNumberUtilsProvider.get(), prefsProvider.get());
  }

  public static Colors_Factory create(
      Provider<Context> contextProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider) {
    return new Colors_Factory(contextProvider, phoneNumberUtilsProvider, prefsProvider);
  }

  public static Colors newColors(
      Context context, PhoneNumberUtils phoneNumberUtils, Preferences prefs) {
    return new Colors(context, phoneNumberUtils, prefs);
  }
}
