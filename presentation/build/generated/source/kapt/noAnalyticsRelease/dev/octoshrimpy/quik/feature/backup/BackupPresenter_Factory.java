package dev.octoshrimpy.quik.feature.backup;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.interactor.PerformBackup;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.repository.BackupRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BackupPresenter_Factory implements Factory<BackupPresenter> {
  private final Provider<BackupRepository> backupRepoProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<PerformBackup> performBackupProvider;

  public BackupPresenter_Factory(
      Provider<BackupRepository> backupRepoProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PerformBackup> performBackupProvider) {
    this.backupRepoProvider = backupRepoProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.contextProvider = contextProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.navigatorProvider = navigatorProvider;
    this.performBackupProvider = performBackupProvider;
  }

  @Override
  public BackupPresenter get() {
    return provideInstance(
        backupRepoProvider,
        billingManagerProvider,
        contextProvider,
        dateFormatterProvider,
        navigatorProvider,
        performBackupProvider);
  }

  public static BackupPresenter provideInstance(
      Provider<BackupRepository> backupRepoProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PerformBackup> performBackupProvider) {
    return new BackupPresenter(
        backupRepoProvider.get(),
        billingManagerProvider.get(),
        contextProvider.get(),
        dateFormatterProvider.get(),
        navigatorProvider.get(),
        performBackupProvider.get());
  }

  public static BackupPresenter_Factory create(
      Provider<BackupRepository> backupRepoProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PerformBackup> performBackupProvider) {
    return new BackupPresenter_Factory(
        backupRepoProvider,
        billingManagerProvider,
        contextProvider,
        dateFormatterProvider,
        navigatorProvider,
        performBackupProvider);
  }

  public static BackupPresenter newBackupPresenter(
      BackupRepository backupRepo,
      BillingManager billingManager,
      Context context,
      DateFormatter dateFormatter,
      Navigator navigator,
      PerformBackup performBackup) {
    return new BackupPresenter(
        backupRepo, billingManager, context, dateFormatter, navigator, performBackup);
  }
}
