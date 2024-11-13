package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.MarkArchivedReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindMarkArchivedReceiver.MarkArchivedReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindMarkArchivedReceiver {
  private BroadcastReceiverBuilderModule_BindMarkArchivedReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(MarkArchivedReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      MarkArchivedReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MarkArchivedReceiverSubcomponent extends AndroidInjector<MarkArchivedReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MarkArchivedReceiver> {}
  }
}
