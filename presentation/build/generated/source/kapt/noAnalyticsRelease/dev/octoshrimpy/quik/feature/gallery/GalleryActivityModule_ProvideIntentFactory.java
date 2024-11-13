package dev.octoshrimpy.quik.feature.gallery;

import android.content.Intent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GalleryActivityModule_ProvideIntentFactory implements Factory<Intent> {
  private final GalleryActivityModule module;

  private final Provider<GalleryActivity> activityProvider;

  public GalleryActivityModule_ProvideIntentFactory(
      GalleryActivityModule module, Provider<GalleryActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Intent get() {
    return provideInstance(module, activityProvider);
  }

  public static Intent provideInstance(
      GalleryActivityModule module, Provider<GalleryActivity> activityProvider) {
    return proxyProvideIntent(module, activityProvider.get());
  }

  public static GalleryActivityModule_ProvideIntentFactory create(
      GalleryActivityModule module, Provider<GalleryActivity> activityProvider) {
    return new GalleryActivityModule_ProvideIntentFactory(module, activityProvider);
  }

  public static Intent proxyProvideIntent(
      GalleryActivityModule instance, GalleryActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideIntent(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
