package dev.octoshrimpy.quik.feature.plus.experiment;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpgradeButtonExperiment_Factory implements Factory<UpgradeButtonExperiment> {
  private final Provider<Context> contextProvider;

  private final Provider<AnalyticsManager> analyticsProvider;

  public UpgradeButtonExperiment_Factory(
      Provider<Context> contextProvider, Provider<AnalyticsManager> analyticsProvider) {
    this.contextProvider = contextProvider;
    this.analyticsProvider = analyticsProvider;
  }

  @Override
  public UpgradeButtonExperiment get() {
    return provideInstance(contextProvider, analyticsProvider);
  }

  public static UpgradeButtonExperiment provideInstance(
      Provider<Context> contextProvider, Provider<AnalyticsManager> analyticsProvider) {
    return new UpgradeButtonExperiment(contextProvider.get(), analyticsProvider.get());
  }

  public static UpgradeButtonExperiment_Factory create(
      Provider<Context> contextProvider, Provider<AnalyticsManager> analyticsProvider) {
    return new UpgradeButtonExperiment_Factory(contextProvider, analyticsProvider);
  }

  public static UpgradeButtonExperiment newUpgradeButtonExperiment(
      Context context, AnalyticsManager analytics) {
    return new UpgradeButtonExperiment(context, analytics);
  }
}
