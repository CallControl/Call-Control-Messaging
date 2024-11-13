package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MmsSentReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMmsSentReceiver {
  private BroadcastReceiverBuilderModule_BindMmsSentReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MmsSentReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MmsSentReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MmsSentReceiverSubcomponent extends AndroidInjector<MmsSentReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MmsSentReceiver> {}
  }
}
