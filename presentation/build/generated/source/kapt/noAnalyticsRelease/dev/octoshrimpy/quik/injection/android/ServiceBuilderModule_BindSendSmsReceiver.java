package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.SendSmsReceiver;
import javax.annotation.processing.Generated;

@Module(subcomponents = ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ServiceBuilderModule_BindSendSmsReceiver {
  private ServiceBuilderModule_BindSendSmsReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(SendSmsReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      SendSmsReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SendSmsReceiverSubcomponent extends AndroidInjector<SendSmsReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SendSmsReceiver> {}
  }
}
