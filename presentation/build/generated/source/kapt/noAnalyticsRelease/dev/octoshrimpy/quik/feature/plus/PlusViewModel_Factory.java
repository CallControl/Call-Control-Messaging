package dev.octoshrimpy.quik.feature.plus;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.manager.BillingManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlusViewModel_Factory implements Factory<PlusViewModel> {
  private final Provider<AnalyticsManager> analyticsManagerProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<Navigator> navigatorProvider;

  public PlusViewModel_Factory(
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Navigator> navigatorProvider) {
    this.analyticsManagerProvider = analyticsManagerProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public PlusViewModel get() {
    return provideInstance(analyticsManagerProvider, billingManagerProvider, navigatorProvider);
  }

  public static PlusViewModel provideInstance(
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Navigator> navigatorProvider) {
    return new PlusViewModel(
        analyticsManagerProvider.get(), billingManagerProvider.get(), navigatorProvider.get());
  }

  public static PlusViewModel_Factory create(
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Navigator> navigatorProvider) {
    return new PlusViewModel_Factory(
        analyticsManagerProvider, billingManagerProvider, navigatorProvider);
  }

  public static PlusViewModel newPlusViewModel(
      AnalyticsManager analyticsManager, BillingManager billingManager, Navigator navigator) {
    return new PlusViewModel(analyticsManager, billingManager, navigator);
  }
}
