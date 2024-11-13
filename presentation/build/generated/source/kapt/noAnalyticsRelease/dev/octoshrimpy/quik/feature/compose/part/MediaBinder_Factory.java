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
public final class MediaBinder_Factory implements Factory<MediaBinder> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Context> contextProvider;

  public MediaBinder_Factory(Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    this.colorsProvider = colorsProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public MediaBinder get() {
    return provideInstance(colorsProvider, contextProvider);
  }

  public static MediaBinder provideInstance(
      Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    return new MediaBinder(colorsProvider.get(), contextProvider.get());
  }

  public static MediaBinder_Factory create(
      Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    return new MediaBinder_Factory(colorsProvider, contextProvider);
  }

  public static MediaBinder newMediaBinder(Colors colors, Context context) {
    return new MediaBinder(colors, context);
  }
}
