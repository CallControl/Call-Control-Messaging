package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.BootReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindBootReceiver {
  private BroadcastReceiverBuilderModule_BindBootReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(BootReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      BootReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface BootReceiverSubcomponent extends AndroidInjector<BootReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BootReceiver> {}
  }
}
