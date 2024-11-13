package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.settings.SettingsActivity;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindSettingsActivity {
  private ActivityBuilderModule_BindSettingsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SettingsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SettingsActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SettingsActivitySubcomponent extends AndroidInjector<SettingsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SettingsActivity> {}
  }
}
