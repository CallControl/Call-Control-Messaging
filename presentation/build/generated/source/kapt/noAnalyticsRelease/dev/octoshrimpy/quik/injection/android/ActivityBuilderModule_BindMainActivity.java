package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.main.MainActivity;
import dev.octoshrimpy.quik.feature.main.MainActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindMainActivity {
  private ActivityBuilderModule_BindMainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MainActivityModule.class)
  @ActivityScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
