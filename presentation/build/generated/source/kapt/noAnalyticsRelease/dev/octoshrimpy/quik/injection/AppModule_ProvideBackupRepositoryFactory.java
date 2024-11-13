package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.BackupRepository;
import dev.octoshrimpy.quik.repository.BackupRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideBackupRepositoryFactory implements Factory<BackupRepository> {
  private final AppModule module;

  private final Provider<BackupRepositoryImpl> repositoryProvider;

  public AppModule_ProvideBackupRepositoryFactory(
      AppModule module, Provider<BackupRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BackupRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static BackupRepository provideInstance(
      AppModule module, Provider<BackupRepositoryImpl> repositoryProvider) {
    return proxyProvideBackupRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideBackupRepositoryFactory create(
      AppModule module, Provider<BackupRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideBackupRepositoryFactory(module, repositoryProvider);
  }

  public static BackupRepository proxyProvideBackupRepository(
      AppModule instance, BackupRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideBackupRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
