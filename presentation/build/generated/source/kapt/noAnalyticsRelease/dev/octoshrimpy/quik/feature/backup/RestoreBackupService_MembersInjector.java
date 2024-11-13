package dev.octoshrimpy.quik.feature.backup;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.manager.NotificationManager;
import dev.octoshrimpy.quik.repository.BackupRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestoreBackupService_MembersInjector
    implements MembersInjector<RestoreBackupService> {
  private final Provider<BackupRepository> backupRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  public RestoreBackupService_MembersInjector(
      Provider<BackupRepository> backupRepoProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    this.backupRepoProvider = backupRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
  }

  public static MembersInjector<RestoreBackupService> create(
      Provider<BackupRepository> backupRepoProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    return new RestoreBackupService_MembersInjector(
        backupRepoProvider, notificationManagerProvider);
  }

  @Override
  public void injectMembers(RestoreBackupService instance) {
    injectBackupRepo(instance, backupRepoProvider.get());
    injectNotificationManager(instance, notificationManagerProvider.get());
  }

  public static void injectBackupRepo(RestoreBackupService instance, BackupRepository backupRepo) {
    instance.backupRepo = backupRepo;
  }

  public static void injectNotificationManager(
      RestoreBackupService instance, NotificationManager notificationManager) {
    instance.notificationManager = notificationManager;
  }
}
