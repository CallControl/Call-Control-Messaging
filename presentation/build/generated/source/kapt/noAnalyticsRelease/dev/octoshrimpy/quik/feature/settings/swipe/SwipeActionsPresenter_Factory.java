package dev.octoshrimpy.quik.feature.settings.swipe;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SwipeActionsPresenter_Factory implements Factory<SwipeActionsPresenter> {
  private final Provider<Context> contextProvider;

  private final Provider<Preferences> prefsProvider;

  public SwipeActionsPresenter_Factory(
      Provider<Context> contextProvider, Provider<Preferences> prefsProvider) {
    this.contextProvider = contextProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public SwipeActionsPresenter get() {
    return provideInstance(contextProvider, prefsProvider);
  }

  public static SwipeActionsPresenter provideInstance(
      Provider<Context> contextProvider, Provider<Preferences> prefsProvider) {
    return new SwipeActionsPresenter(contextProvider.get(), prefsProvider.get());
  }

  public static SwipeActionsPresenter_Factory create(
      Provider<Context> contextProvider, Provider<Preferences> prefsProvider) {
    return new SwipeActionsPresenter_Factory(contextProvider, prefsProvider);
  }

  public static SwipeActionsPresenter newSwipeActionsPresenter(Context context, Preferences prefs) {
    return new SwipeActionsPresenter(context, prefs);
  }
}
