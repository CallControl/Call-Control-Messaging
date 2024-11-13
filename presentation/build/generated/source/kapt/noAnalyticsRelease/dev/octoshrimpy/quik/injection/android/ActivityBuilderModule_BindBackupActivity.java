package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.backup.BackupActivity;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindBackupActivity {
  private ActivityBuilderModule_BindBackupActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(BackupActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      BackupActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface BackupActivitySubcomponent extends AndroidInjector<BackupActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BackupActivity> {}
  }
}
