package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MmsUpdatedReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver.MmsUpdatedReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver {
  private BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MmsUpdatedReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MmsUpdatedReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MmsUpdatedReceiverSubcomponent extends AndroidInjector<MmsUpdatedReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MmsUpdatedReceiver> {}
  }
}
