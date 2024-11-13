package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.compose.ComposeActivity;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindComposeActivity {
  private ActivityBuilderModule_BindComposeActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ComposeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ComposeActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ComposeActivityModule.class)
  @ActivityScope
  public interface ComposeActivitySubcomponent extends AndroidInjector<ComposeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ComposeActivity> {}
  }
}
