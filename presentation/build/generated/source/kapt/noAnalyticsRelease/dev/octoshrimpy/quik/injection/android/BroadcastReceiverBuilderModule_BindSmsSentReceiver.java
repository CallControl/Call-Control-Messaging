package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.SmsSentReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindSmsSentReceiver {
  private BroadcastReceiverBuilderModule_BindSmsSentReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(SmsSentReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      SmsSentReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SmsSentReceiverSubcomponent extends AndroidInjector<SmsSentReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SmsSentReceiver> {}
  }
}
