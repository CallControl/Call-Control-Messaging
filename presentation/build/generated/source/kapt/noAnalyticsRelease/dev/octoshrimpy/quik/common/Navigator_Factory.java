package dev.octoshrimpy.quik.common;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.manager.NotificationManager;
import dev.octoshrimpy.quik.manager.PermissionManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Navigator_Factory implements Factory<Navigator> {
  private final Provider<Context> contextProvider;

  private final Provider<AnalyticsManager> analyticsManagerProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<PermissionManager> permissionsProvider;

  public Navigator_Factory(
      Provider<Context> contextProvider,
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<PermissionManager> permissionsProvider) {
    this.contextProvider = contextProvider;
    this.analyticsManagerProvider = analyticsManagerProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.permissionsProvider = permissionsProvider;
  }

  @Override
  public Navigator get() {
    return provideInstance(
        contextProvider,
        analyticsManagerProvider,
        billingManagerProvider,
        notificationManagerProvider,
        permissionsProvider);
  }

  public static Navigator provideInstance(
      Provider<Context> contextProvider,
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<PermissionManager> permissionsProvider) {
    return new Navigator(
        contextProvider.get(),
        analyticsManagerProvider.get(),
        billingManagerProvider.get(),
        notificationManagerProvider.get(),
        permissionsProvider.get());
  }

  public static Navigator_Factory create(
      Provider<Context> contextProvider,
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<PermissionManager> permissionsProvider) {
    return new Navigator_Factory(
        contextProvider,
        analyticsManagerProvider,
        billingManagerProvider,
        notificationManagerProvider,
        permissionsProvider);
  }

  public static Navigator newNavigator(
      Context context,
      AnalyticsManager analyticsManager,
      BillingManager billingManager,
      NotificationManager notificationManager,
      PermissionManager permissions) {
    return new Navigator(
        context, analyticsManager, billingManager, notificationManager, permissions);
  }
}
