package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.BlockThreadReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindBlockThreadReceiver.BlockThreadReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindBlockThreadReceiver {
  private BroadcastReceiverBuilderModule_BindBlockThreadReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(BlockThreadReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      BlockThreadReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface BlockThreadReceiverSubcomponent extends AndroidInjector<BlockThreadReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BlockThreadReceiver> {}
  }
}
