package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.SendScheduledMessageReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
          .SendScheduledMessageReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver {
  private BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(SendScheduledMessageReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      SendScheduledMessageReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SendScheduledMessageReceiverSubcomponent
      extends AndroidInjector<SendScheduledMessageReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SendScheduledMessageReceiver> {}
  }
}