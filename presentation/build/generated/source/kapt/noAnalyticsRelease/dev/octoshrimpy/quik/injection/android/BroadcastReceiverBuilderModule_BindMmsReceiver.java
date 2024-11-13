package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MmsReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMmsReceiver {
  private BroadcastReceiverBuilderModule_BindMmsReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MmsReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MmsReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MmsReceiverSubcomponent extends AndroidInjector<MmsReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MmsReceiver> {}
  }
}
