package dev.octoshrimpy.quik.common.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DateFormatter_Factory implements Factory<DateFormatter> {
  private final Provider<Context> contextProvider;

  public DateFormatter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DateFormatter get() {
    return provideInstance(contextProvider);
  }

  public static DateFormatter provideInstance(Provider<Context> contextProvider) {
    return new DateFormatter(contextProvider.get());
  }

  public static DateFormatter_Factory create(Provider<Context> contextProvider) {
    return new DateFormatter_Factory(contextProvider);
  }

  public static DateFormatter newDateFormatter(Context context) {
    return new DateFormatter(context);
  }
}
