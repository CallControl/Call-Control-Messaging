package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.blocking.BlockingActivity;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindBlockingActivity {
  private ActivityBuilderModule_BindBlockingActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(BlockingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      BlockingActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface BlockingActivitySubcomponent extends AndroidInjector<BlockingActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BlockingActivity> {}
  }
}
