package dev.octoshrimpy.quik.feature.themepicker;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThemePagerAdapter_Factory implements Factory<ThemePagerAdapter> {
  private final Provider<Context> contextProvider;

  public ThemePagerAdapter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ThemePagerAdapter get() {
    return provideInstance(contextProvider);
  }

  public static ThemePagerAdapter provideInstance(Provider<Context> contextProvider) {
    return new ThemePagerAdapter(contextProvider.get());
  }

  public static ThemePagerAdapter_Factory create(Provider<Context> contextProvider) {
    return new ThemePagerAdapter_Factory(contextProvider);
  }

  public static ThemePagerAdapter newThemePagerAdapter(Context context) {
    return new ThemePagerAdapter(context);
  }
}
