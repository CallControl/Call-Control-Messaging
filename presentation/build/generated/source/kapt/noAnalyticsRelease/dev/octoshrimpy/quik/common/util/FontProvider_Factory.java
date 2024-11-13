package dev.octoshrimpy.quik.common.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FontProvider_Factory implements Factory<FontProvider> {
  private final Provider<Context> contextProvider;

  public FontProvider_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FontProvider get() {
    return provideInstance(contextProvider);
  }

  public static FontProvider provideInstance(Provider<Context> contextProvider) {
    return new FontProvider(contextProvider.get());
  }

  public static FontProvider_Factory create(Provider<Context> contextProvider) {
    return new FontProvider_Factory(contextProvider);
  }

  public static FontProvider newFontProvider(Context context) {
    return new FontProvider(context);
  }
}
