package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.RemoteMessagingReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver.RemoteMessagingReceiverSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver {
  private BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(RemoteMessagingReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      RemoteMessagingReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface RemoteMessagingReceiverSubcomponent
      extends AndroidInjector<RemoteMessagingReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RemoteMessagingReceiver> {}
  }
}
