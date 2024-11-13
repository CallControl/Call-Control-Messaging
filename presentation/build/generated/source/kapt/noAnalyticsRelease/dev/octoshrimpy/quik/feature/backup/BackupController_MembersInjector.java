package dev.octoshrimpy.quik.feature.backup;

import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BackupController_MembersInjector implements MembersInjector<BackupController> {
  private final Provider<BackupPresenter> presenterProvider;

  public BackupController_MembersInjector(Provider<BackupPresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<BackupController> create(
      Provider<BackupPresenter> presenterProvider) {
    return new BackupController_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(BackupController instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(BackupController instance, BackupPresenter presenter) {
    instance.presenter = presenter;
  }
}
