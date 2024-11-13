package dev.octoshrimpy.quik.injection.android;

import android.content.BroadcastReceiver;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.BroadcastReceiverKey;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.widget.WidgetProvider;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class BroadcastReceiverBuilderModule_BindWidgetProvider {
  private BroadcastReceiverBuilderModule_BindWidgetProvider() {}

  @Binds
  @IntoMap
  @BroadcastReceiverKey(WidgetProvider.class)
  abstract AndroidInjector.Factory<? extends BroadcastReceiver> bindAndroidInjectorFactory(
      WidgetProviderSubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface WidgetProviderSubcomponent extends AndroidInjector<WidgetProvider> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<WidgetProvider> {}
  }
}
