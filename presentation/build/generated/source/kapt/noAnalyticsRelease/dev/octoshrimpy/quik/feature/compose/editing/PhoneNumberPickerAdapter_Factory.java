package dev.octoshrimpy.quik.feature.compose.editing;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberPickerAdapter_Factory implements Factory<PhoneNumberPickerAdapter> {
  private final Provider<Context> contextProvider;

  public PhoneNumberPickerAdapter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PhoneNumberPickerAdapter get() {
    return provideInstance(contextProvider);
  }

  public static PhoneNumberPickerAdapter provideInstance(Provider<Context> contextProvider) {
    return new PhoneNumberPickerAdapter(contextProvider.get());
  }

  public static PhoneNumberPickerAdapter_Factory create(Provider<Context> contextProvider) {
    return new PhoneNumberPickerAdapter_Factory(contextProvider);
  }

  public static PhoneNumberPickerAdapter newPhoneNumberPickerAdapter(Context context) {
    return new PhoneNumberPickerAdapter(context);
  }
}
