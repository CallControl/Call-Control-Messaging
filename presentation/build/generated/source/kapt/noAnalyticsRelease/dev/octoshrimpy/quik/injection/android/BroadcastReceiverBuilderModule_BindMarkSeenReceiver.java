package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MarkSeenReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMarkSeenReceiver {
  private BroadcastReceiverBuilderModule_BindMarkSeenReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MarkSeenReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MarkSeenReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MarkSeenReceiverSubcomponent extends AndroidInjector<MarkSeenReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MarkSeenReceiver> {}
  }
}
