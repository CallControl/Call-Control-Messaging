package dev.octoshrimpy.quik.feature.compose.part;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VCardBinder_Factory implements Factory<VCardBinder> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Context> contextProvider;

  public VCardBinder_Factory(Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    this.colorsProvider = colorsProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public VCardBinder get() {
    return provideInstance(colorsProvider, contextProvider);
  }

  public static VCardBinder provideInstance(
      Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    return new VCardBinder(colorsProvider.get(), contextProvider.get());
  }

  public static VCardBinder_Factory create(
      Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    return new VCardBinder_Factory(colorsProvider, contextProvider);
  }

  public static VCardBinder newVCardBinder(Colors colors, Context context) {
    return new VCardBinder(colors, context);
  }
}
