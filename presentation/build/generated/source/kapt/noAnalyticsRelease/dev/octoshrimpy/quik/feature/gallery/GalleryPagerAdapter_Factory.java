package dev.octoshrimpy.quik.feature.gallery;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GalleryPagerAdapter_Factory implements Factory<GalleryPagerAdapter> {
  private final Provider<Context> contextProvider;

  public GalleryPagerAdapter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public GalleryPagerAdapter get() {
    return provideInstance(contextProvider);
  }

  public static GalleryPagerAdapter provideInstance(Provider<Context> contextProvider) {
    return new GalleryPagerAdapter(contextProvider.get());
  }

  public static GalleryPagerAdapter_Factory create(Provider<Context> contextProvider) {
    return new GalleryPagerAdapter_Factory(contextProvider);
  }

  public static GalleryPagerAdapter newGalleryPagerAdapter(Context context) {
    return new GalleryPagerAdapter(context);
  }
}
