package dev.octoshrimpy.quik.feature.themepicker;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThemeAdapter_Factory implements Factory<ThemeAdapter> {
  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  public ThemeAdapter_Factory(Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
  }

  @Override
  public ThemeAdapter get() {
    return provideInstance(contextProvider, colorsProvider);
  }

  public static ThemeAdapter provideInstance(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    return new ThemeAdapter(contextProvider.get(), colorsProvider.get());
  }

  public static ThemeAdapter_Factory create(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    return new ThemeAdapter_Factory(contextProvider, colorsProvider);
  }

  public static ThemeAdapter newThemeAdapter(Context context, Colors colors) {
    return new ThemeAdapter(context, colors);
  }
}
