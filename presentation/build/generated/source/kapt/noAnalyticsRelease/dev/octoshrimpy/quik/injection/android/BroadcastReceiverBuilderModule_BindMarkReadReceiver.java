package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MarkReadReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMarkReadReceiver {
  private BroadcastReceiverBuilderModule_BindMarkReadReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MarkReadReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MarkReadReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MarkReadReceiverSubcomponent extends AndroidInjector<MarkReadReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MarkReadReceiver> {}
  }
}
