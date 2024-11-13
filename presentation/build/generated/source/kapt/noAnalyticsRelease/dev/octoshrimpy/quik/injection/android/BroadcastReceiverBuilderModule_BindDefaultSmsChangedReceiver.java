package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import dev.octoshrimpy.quik.receiver.DefaultSmsChangedReceiver;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
          .DefaultSmsChangedReceiverSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver {
  private BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(DefaultSmsChangedReceiver.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      DefaultSmsChangedReceiverSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface DefaultSmsChangedReceiverSubcomponent
      extends AndroidInjector<DefaultSmsChangedReceiver> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DefaultSmsChangedReceiver> {}
  }
}
