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
public final class FileBinder_Factory implements Factory<FileBinder> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Context> contextProvider;

  public FileBinder_Factory(Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    this.colorsProvider = colorsProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public FileBinder get() {
    return provideInstance(colorsProvider, contextProvider);
  }

  public static FileBinder provideInstance(
      Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    return new FileBinder(colorsProvider.get(), contextProvider.get());
  }

  public static FileBinder_Factory create(
      Provider<Colors> colorsProvider, Provider<Context> contextProvider) {
    return new FileBinder_Factory(colorsProvider, contextProvider);
  }

  public static FileBinder newFileBinder(Colors colors, Context context) {
    return new FileBinder(colors, context);
  }
}
