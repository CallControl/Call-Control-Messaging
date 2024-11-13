package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivity;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindGalleryActivity {
  private ActivityBuilderModule_BindGalleryActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(GalleryActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      GalleryActivitySubcomponent.Builder builder);

  @Subcomponent(modules = GalleryActivityModule.class)
  @ActivityScope
  public interface GalleryActivitySubcomponent extends AndroidInjector<GalleryActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GalleryActivity> {}
  }
}
