package dev.octoshrimpy.quik.common;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dev.octoshrimpy.quik.common.util.FileLoggingTree;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.manager.ReferralManager;
import dev.octoshrimpy.quik.migration.QkMigration;
import dev.octoshrimpy.quik.migration.QkRealmMigration;
import dev.octoshrimpy.quik.util.NightModeManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QKApplication_MembersInjector implements MembersInjector<QKApplication> {
  private final Provider<AnalyticsManager> analyticsManagerProvider;

  private final Provider<QkMigration> qkMigrationProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingActivityInjectorProvider;

  private final Provider<DispatchingAndroidInjector<BroadcastReceiver>>
      dispatchingBroadcastReceiverInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Service>> dispatchingServiceInjectorProvider;

  private final Provider<FileLoggingTree> fileLoggingTreeProvider;

  private final Provider<NightModeManager> nightModeManagerProvider;

  private final Provider<QkRealmMigration> realmMigrationProvider;

  private final Provider<ReferralManager> referralManagerProvider;

  public QKApplication_MembersInjector(
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<QkMigration> qkMigrationProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<DispatchingAndroidInjector<Activity>> dispatchingActivityInjectorProvider,
      Provider<DispatchingAndroidInjector<BroadcastReceiver>>
          dispatchingBroadcastReceiverInjectorProvider,
      Provider<DispatchingAndroidInjector<Service>> dispatchingServiceInjectorProvider,
      Provider<FileLoggingTree> fileLoggingTreeProvider,
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<QkRealmMigration> realmMigrationProvider,
      Provider<ReferralManager> referralManagerProvider) {
    this.analyticsManagerProvider = analyticsManagerProvider;
    this.qkMigrationProvider = qkMigrationProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.dispatchingActivityInjectorProvider = dispatchingActivityInjectorProvider;
    this.dispatchingBroadcastReceiverInjectorProvider =
        dispatchingBroadcastReceiverInjectorProvider;
    this.dispatchingServiceInjectorProvider = dispatchingServiceInjectorProvider;
    this.fileLoggingTreeProvider = fileLoggingTreeProvider;
    this.nightModeManagerProvider = nightModeManagerProvider;
    this.realmMigrationProvider = realmMigrationProvider;
    this.referralManagerProvider = referralManagerProvider;
  }

  public static MembersInjector<QKApplication> create(
      Provider<AnalyticsManager> analyticsManagerProvider,
      Provider<QkMigration> qkMigrationProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<DispatchingAndroidInjector<Activity>> dispatchingActivityInjectorProvider,
      Provider<DispatchingAndroidInjector<BroadcastReceiver>>
          dispatchingBroadcastReceiverInjectorProvider,
      Provider<DispatchingAndroidInjector<Service>> dispatchingServiceInjectorProvider,
      Provider<FileLoggingTree> fileLoggingTreeProvider,
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<QkRealmMigration> realmMigrationProvider,
      Provider<ReferralManager> referralManagerProvider) {
    return new QKApplication_MembersInjector(
        analyticsManagerProvider,
        qkMigrationProvider,
        billingManagerProvider,
        dispatchingActivityInjectorProvider,
        dispatchingBroadcastReceiverInjectorProvider,
        dispatchingServiceInjectorProvider,
        fileLoggingTreeProvider,
        nightModeManagerProvider,
        realmMigrationProvider,
        referralManagerProvider);
  }

  @Override
  public void injectMembers(QKApplication instance) {
    injectAnalyticsManager(instance, analyticsManagerProvider.get());
    injectQkMigration(instance, qkMigrationProvider.get());
    injectBillingManager(instance, billingManagerProvider.get());
    injectDispatchingActivityInjector(instance, dispatchingActivityInjectorProvider.get());
    injectDispatchingBroadcastReceiverInjector(
        instance, dispatchingBroadcastReceiverInjectorProvider.get());
    injectDispatchingServiceInjector(instance, dispatchingServiceInjectorProvider.get());
    injectFileLoggingTree(instance, fileLoggingTreeProvider.get());
    injectNightModeManager(instance, nightModeManagerProvider.get());
    injectRealmMigration(instance, realmMigrationProvider.get());
    injectReferralManager(instance, referralManagerProvider.get());
  }

  public static void injectAnalyticsManager(
      QKApplication instance, AnalyticsManager analyticsManager) {
    instance.analyticsManager = analyticsManager;
  }

  public static void injectQkMigration(QKApplication instance, QkMigration qkMigration) {
    instance.qkMigration = qkMigration;
  }

  public static void injectBillingManager(QKApplication instance, BillingManager billingManager) {
    instance.billingManager = billingManager;
  }

  public static void injectDispatchingActivityInjector(
      QKApplication instance, DispatchingAndroidInjector<Activity> dispatchingActivityInjector) {
    instance.dispatchingActivityInjector = dispatchingActivityInjector;
  }

  public static void injectDispatchingBroadcastReceiverInjector(
      QKApplication instance,
      DispatchingAndroidInjector<BroadcastReceiver> dispatchingBroadcastReceiverInjector) {
    instance.dispatchingBroadcastReceiverInjector = dispatchingBroadcastReceiverInjector;
  }

  public static void injectDispatchingServiceInjector(
      QKApplication instance, DispatchingAndroidInjector<Service> dispatchingServiceInjector) {
    instance.dispatchingServiceInjector = dispatchingServiceInjector;
  }

  public static void injectFileLoggingTree(
      QKApplication instance, FileLoggingTree fileLoggingTree) {
    instance.fileLoggingTree = fileLoggingTree;
  }

  public static void injectNightModeManager(
      QKApplication instance, NightModeManager nightModeManager) {
    instance.nightModeManager = nightModeManager;
  }

  public static void injectRealmMigration(QKApplication instance, QkRealmMigration realmMigration) {
    instance.realmMigration = realmMigration;
  }

  public static void injectReferralManager(
      QKApplication instance, ReferralManager referralManager) {
    instance.referralManager = referralManager;
  }
}
