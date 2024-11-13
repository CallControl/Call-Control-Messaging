package dev.octoshrimpy.quik.common.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkSwitch_MembersInjector implements MembersInjector<QkSwitch> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Preferences> prefsProvider;

  public QkSwitch_MembersInjector(
      Provider<Colors> colorsProvider, Provider<Preferences> prefsProvider) {
    this.colorsProvider = colorsProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<QkSwitch> create(
      Provider<Colors> colorsProvider, Provider<Preferences> prefsProvider) {
    return new QkSwitch_MembersInjector(colorsProvider, prefsProvider);
  }

  @Override
  public void injectMembers(QkSwitch instance) {
    injectColors(instance, colorsProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  public static void injectColors(QkSwitch instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectPrefs(QkSwitch instance, Preferences prefs) {
    instance.prefs = prefs;
  }
}
