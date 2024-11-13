package dev.octoshrimpy.quik.injection.android;

import android.app.Service;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ServiceKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.service.HeadlessSmsSendService;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ServiceBuilderModule_BindHeadlessSmsSendService.HeadlessSmsSendServiceSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ServiceBuilderModule_BindHeadlessSmsSendService {
  private ServiceBuilderModule_BindHeadlessSmsSendService() {}

  @Binds
  @IntoMap
  @ServiceKey(HeadlessSmsSendService.class)
  abstract AndroidInjector.Factory<? extends Service> bindAndroidInjectorFactory(
      HeadlessSmsSendServiceSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface HeadlessSmsSendServiceSubcomponent
      extends AndroidInjector<HeadlessSmsSendService> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HeadlessSmsSendService> {}
  }
}
