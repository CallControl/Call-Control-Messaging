package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivity;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindQkReplyActivity {
  private ActivityBuilderModule_BindQkReplyActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(QkReplyActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      QkReplyActivitySubcomponent.Builder builder);

  @Subcomponent(modules = QkReplyActivityModule.class)
  @ActivityScope
  public interface QkReplyActivitySubcomponent extends AndroidInjector<QkReplyActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<QkReplyActivity> {}
  }
}
