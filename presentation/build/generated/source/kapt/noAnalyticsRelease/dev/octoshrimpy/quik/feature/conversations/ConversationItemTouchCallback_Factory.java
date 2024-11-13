package dev.octoshrimpy.quik.feature.conversations;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.util.Preferences;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationItemTouchCallback_Factory
    implements Factory<ConversationItemTouchCallback> {
  private final Provider<Colors> colorsProvider;

  private final Provider<CompositeDisposable> disposablesProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<Context> contextProvider;

  public ConversationItemTouchCallback_Factory(
      Provider<Colors> colorsProvider,
      Provider<CompositeDisposable> disposablesProvider,
      Provider<Preferences> prefsProvider,
      Provider<Context> contextProvider) {
    this.colorsProvider = colorsProvider;
    this.disposablesProvider = disposablesProvider;
    this.prefsProvider = prefsProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConversationItemTouchCallback get() {
    return provideInstance(colorsProvider, disposablesProvider, prefsProvider, contextProvider);
  }

  public static ConversationItemTouchCallback provideInstance(
      Provider<Colors> colorsProvider,
      Provider<CompositeDisposable> disposablesProvider,
      Provider<Preferences> prefsProvider,
      Provider<Context> contextProvider) {
    return new ConversationItemTouchCallback(
        colorsProvider.get(),
        disposablesProvider.get(),
        prefsProvider.get(),
        contextProvider.get());
  }

  public static ConversationItemTouchCallback_Factory create(
      Provider<Colors> colorsProvider,
      Provider<CompositeDisposable> disposablesProvider,
      Provider<Preferences> prefsProvider,
      Provider<Context> contextProvider) {
    return new ConversationItemTouchCallback_Factory(
        colorsProvider, disposablesProvider, prefsProvider, contextProvider);
  }

  public static ConversationItemTouchCallback newConversationItemTouchCallback(
      Colors colors, CompositeDisposable disposables, Preferences prefs, Context context) {
    return new ConversationItemTouchCallback(colors, disposables, prefs, context);
  }
}
