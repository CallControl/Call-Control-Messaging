package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MmsReceivedReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindMmsReceivedReceiver.MmsReceivedReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMmsReceivedReceiver {
  private BroadcastReceiverBuilderModule_BindMmsReceivedReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MmsReceivedReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MmsReceivedReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MmsReceivedReceiverSubcomponent extends AndroidInjector<MmsReceivedReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MmsReceivedReceiver> {}
  }
}
