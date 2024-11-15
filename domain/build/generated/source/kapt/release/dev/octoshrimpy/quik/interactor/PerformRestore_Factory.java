package dev.octoshrimpy.quik.interactor;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.BackupRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PerformRestore_Factory implements Factory<PerformRestore> {
  private final Provider<BackupRepository> backupRepoProvider;

  public PerformRestore_Factory(Provider<BackupRepository> backupRepoProvider) {
    this.backupRepoProvider = backupRepoProvider;
  }

  @Override
  public PerformRestore get() {
    return provideInstance(backupRepoProvider);
  }

  public static PerformRestore provideInstance(Provider<BackupRepository> backupRepoProvider) {
    return new PerformRestore(backupRepoProvider.get());
  }

  public static PerformRestore_Factory create(Provider<BackupRepository> backupRepoProvider) {
    return new PerformRestore_Factory(backupRepoProvider);
  }

  public static PerformRestore newPerformRestore(BackupRepository backupRepo) {
    return new PerformRestore(backupRepo);
  }
}
