package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivity;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivityModule;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindContactsActivity {
  private ActivityBuilderModule_BindContactsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ContactsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ContactsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ContactsActivityModule.class)
  @ActivityScope
  public interface ContactsActivitySubcomponent extends AndroidInjector<ContactsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ContactsActivity> {}
  }
}
