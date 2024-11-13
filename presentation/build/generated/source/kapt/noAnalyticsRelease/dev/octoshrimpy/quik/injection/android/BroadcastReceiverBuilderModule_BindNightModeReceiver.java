package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.NightModeReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindNightModeReceiver.NightModeReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindNightModeReceiver {
  private BroadcastReceiverBuilderModule_BindNightModeReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(NightModeReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      NightModeReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface NightModeReceiverSubcomponent extends AndroidInjector<NightModeReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NightModeReceiver> {}
  }
}
