package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.SmsDeliveredReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver.SmsDeliveredReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver {
  private BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(SmsDeliveredReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      SmsDeliveredReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SmsDeliveredReceiverSubcomponent extends AndroidInjector<SmsDeliveredReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SmsDeliveredReceiver> {}
  }
}
