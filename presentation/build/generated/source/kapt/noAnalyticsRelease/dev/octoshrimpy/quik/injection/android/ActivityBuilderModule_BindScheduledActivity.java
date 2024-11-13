package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledActivity;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindScheduledActivity {
  private ActivityBuilderModule_BindScheduledActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ScheduledActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ScheduledActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ScheduledActivityModule.class)
  @ActivityScope
  public interface ScheduledActivitySubcomponent extends AndroidInjector<ScheduledActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduledActivity> {}
  }
}
