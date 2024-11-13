package dev.octoshrimpy.quik.feature.main;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DrawerBadgesExperiment_Factory implements Factory<DrawerBadgesExperiment> {
  private final Provider<Context> contextProvider;

  private final Provider<AnalyticsManager> analyticsManagerProvider;

  public DrawerBadgesExperiment_Factory(
      Provider<Context> contextProvider, Provider<AnalyticsManager> analyticsManagerProvider) {
    this.contextProvider = contextProvider;
    this.analyticsManagerProvider = analyticsManagerProvider;
  }

  @Override
  public DrawerBadgesExperiment get() {
    return provideInstance(contextProvider, analyticsManagerProvider);
  }

  public static DrawerBadgesExperiment provideInstance(
      Provider<Context> contextProvider, Provider<AnalyticsManager> analyticsManagerProvider) {
    return new DrawerBadgesExperiment(contextProvider.get(), analyticsManagerProvider.get());
  }

  public static DrawerBadgesExperiment_Factory create(
      Provider<Context> contextProvider, Provider<AnalyticsManager> analyticsManagerProvider) {
    return new DrawerBadgesExperiment_Factory(contextProvider, analyticsManagerProvider);
  }

  public static DrawerBadgesExperiment newDrawerBadgesExperiment(
      Context context, AnalyticsManager analyticsManager) {
    return new DrawerBadgesExperiment(context, analyticsManager);
  }
}
