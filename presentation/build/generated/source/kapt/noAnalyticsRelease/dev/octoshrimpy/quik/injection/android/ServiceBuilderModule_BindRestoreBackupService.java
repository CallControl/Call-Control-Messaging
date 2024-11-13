package dev.octoshrimpy.quik.injection.android;

import android.app.Service;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ServiceKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.backup.RestoreBackupService;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ServiceBuilderModule_BindRestoreBackupService {
  private ServiceBuilderModule_BindRestoreBackupService() {}

  @Binds
  @IntoMap
  @ServiceKey(RestoreBackupService.class)
  abstract AndroidInjector.Factory<? extends Service> bindAndroidInjectorFactory(
      RestoreBackupServiceSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface RestoreBackupServiceSubcomponent extends AndroidInjector<RestoreBackupService> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RestoreBackupService> {}
  }
}
