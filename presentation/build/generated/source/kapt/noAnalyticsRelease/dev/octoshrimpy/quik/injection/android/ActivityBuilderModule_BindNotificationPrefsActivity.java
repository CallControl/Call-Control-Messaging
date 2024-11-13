package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivity;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityBuilderModule_BindNotificationPrefsActivity.NotificationPrefsActivitySubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindNotificationPrefsActivity {
  private ActivityBuilderModule_BindNotificationPrefsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(NotificationPrefsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      NotificationPrefsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = NotificationPrefsActivityModule.class)
  @ActivityScope
  public interface NotificationPrefsActivitySubcomponent
      extends AndroidInjector<NotificationPrefsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NotificationPrefsActivity> {}
  }
}
