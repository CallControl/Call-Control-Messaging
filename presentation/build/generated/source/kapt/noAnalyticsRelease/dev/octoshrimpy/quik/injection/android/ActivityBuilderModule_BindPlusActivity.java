package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.plus.PlusActivity;
import dev.octoshrimpy.quik.feature.plus.PlusActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindPlusActivity {
  private ActivityBuilderModule_BindPlusActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(PlusActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      PlusActivitySubcomponent.Builder builder);

  @Subcomponent(modules = PlusActivityModule.class)
  @ActivityScope
  public interface PlusActivitySubcomponent extends AndroidInjector<PlusActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlusActivity> {}
  }
}
