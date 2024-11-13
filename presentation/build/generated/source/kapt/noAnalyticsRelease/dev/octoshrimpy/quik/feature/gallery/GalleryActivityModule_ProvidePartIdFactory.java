package dev.octoshrimpy.quik.feature.gallery;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GalleryActivityModule_ProvidePartIdFactory implements Factory<Long> {
  private final GalleryActivityModule module;

  private final Provider<GalleryActivity> activityProvider;

  public GalleryActivityModule_ProvidePartIdFactory(
      GalleryActivityModule module, Provider<GalleryActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Long get() {
    return provideInstance(module, activityProvider);
  }

  public static Long provideInstance(
      GalleryActivityModule module, Provider<GalleryActivity> activityProvider) {
    return proxyProvidePartId(module, activityProvider.get());
  }

  public static GalleryActivityModule_ProvidePartIdFactory create(
      GalleryActivityModule module, Provider<GalleryActivity> activityProvider) {
    return new GalleryActivityModule_ProvidePartIdFactory(module, activityProvider);
  }

  public static long proxyProvidePartId(GalleryActivityModule instance, GalleryActivity activity) {
    return instance.providePartId(activity);
  }
}
