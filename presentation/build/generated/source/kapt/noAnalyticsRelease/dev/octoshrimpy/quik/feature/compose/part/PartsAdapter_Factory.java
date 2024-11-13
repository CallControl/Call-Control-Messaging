package dev.octoshrimpy.quik.feature.compose.part;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PartsAdapter_Factory implements Factory<PartsAdapter> {
  private final Provider<Colors> colorsProvider;

  private final Provider<FileBinder> fileBinderProvider;

  private final Provider<MediaBinder> mediaBinderProvider;

  private final Provider<VCardBinder> vCardBinderProvider;

  public PartsAdapter_Factory(
      Provider<Colors> colorsProvider,
      Provider<FileBinder> fileBinderProvider,
      Provider<MediaBinder> mediaBinderProvider,
      Provider<VCardBinder> vCardBinderProvider) {
    this.colorsProvider = colorsProvider;
    this.fileBinderProvider = fileBinderProvider;
    this.mediaBinderProvider = mediaBinderProvider;
    this.vCardBinderProvider = vCardBinderProvider;
  }

  @Override
  public PartsAdapter get() {
    return provideInstance(
        colorsProvider, fileBinderProvider, mediaBinderProvider, vCardBinderProvider);
  }

  public static PartsAdapter provideInstance(
      Provider<Colors> colorsProvider,
      Provider<FileBinder> fileBinderProvider,
      Provider<MediaBinder> mediaBinderProvider,
      Provider<VCardBinder> vCardBinderProvider) {
    return new PartsAdapter(
        colorsProvider.get(),
        fileBinderProvider.get(),
        mediaBinderProvider.get(),
        vCardBinderProvider.get());
  }

  public static PartsAdapter_Factory create(
      Provider<Colors> colorsProvider,
      Provider<FileBinder> fileBinderProvider,
      Provider<MediaBinder> mediaBinderProvider,
      Provider<VCardBinder> vCardBinderProvider) {
    return new PartsAdapter_Factory(
        colorsProvider, fileBinderProvider, mediaBinderProvider, vCardBinderProvider);
  }

  public static PartsAdapter newPartsAdapter(
      Colors colors, FileBinder fileBinder, MediaBinder mediaBinder, VCardBinder vCardBinder) {
    return new PartsAdapter(colors, fileBinder, mediaBinder, vCardBinder);
  }
}
