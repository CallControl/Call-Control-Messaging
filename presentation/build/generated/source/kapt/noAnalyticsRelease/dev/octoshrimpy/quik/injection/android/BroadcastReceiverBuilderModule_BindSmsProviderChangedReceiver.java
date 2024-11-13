package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.SmsProviderChangedReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
          .SmsProviderChangedReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver {
  private BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(SmsProviderChangedReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      SmsProviderChangedReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SmsProviderChangedReceiverSubcomponent
      extends AndroidInjector<SmsProviderChangedReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SmsProviderChangedReceiver> {}
  }
}
