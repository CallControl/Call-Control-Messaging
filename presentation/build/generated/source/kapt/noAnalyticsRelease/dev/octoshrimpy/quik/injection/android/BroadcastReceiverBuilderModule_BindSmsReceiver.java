package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.SmsReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindSmsReceiver {
  private BroadcastReceiverBuilderModule_BindSmsReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(SmsReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      SmsReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SmsReceiverSubcomponent extends AndroidInjector<SmsReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SmsReceiver> {}
  }
}
