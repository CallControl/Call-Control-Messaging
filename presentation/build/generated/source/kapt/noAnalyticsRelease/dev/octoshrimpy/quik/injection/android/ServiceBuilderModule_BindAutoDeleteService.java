package dev.octoshrimpy.quik.injection.android;

import android.app.Service;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ServiceKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.service.AutoDeleteService;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ServiceBuilderModule_BindAutoDeleteService {
  private ServiceBuilderModule_BindAutoDeleteService() {}

  @Binds
  @IntoMap
  @ServiceKey(AutoDeleteService.class)
  abstract AndroidInjector.Factory<? extends Service> bindAndroidInjectorFactory(
      AutoDeleteServiceSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface AutoDeleteServiceSubcomponent extends AndroidInjector<AutoDeleteService> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AutoDeleteService> {}
  }
}
