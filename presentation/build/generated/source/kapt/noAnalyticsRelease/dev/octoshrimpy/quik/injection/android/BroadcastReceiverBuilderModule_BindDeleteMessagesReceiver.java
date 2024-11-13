package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.DeleteMessagesReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver.DeleteMessagesReceiverSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver {
  private BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(DeleteMessagesReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      DeleteMessagesReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface DeleteMessagesReceiverSubcomponent
      extends AndroidInjector<DeleteMessagesReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeleteMessagesReceiver> {}
  }
}
