package dev.octoshrimpy.quik.injection.android;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoActivity;
import dev.octoshrimpy.quik.injection.scope.ActivityScope;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityBuilderModule_BindConversationInfoActivity.ConversationInfoActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_BindConversationInfoActivity {
  private ActivityBuilderModule_BindConversationInfoActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ConversationInfoActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ConversationInfoActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface ConversationInfoActivitySubcomponent
      extends AndroidInjector<ConversationInfoActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ConversationInfoActivity> {}
  }
}
