package dev.octoshrimpy.quik.feature.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WidgetProvider_MembersInjector implements MembersInjector<WidgetProvider> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Preferences> prefsProvider;

  public WidgetProvider_MembersInjector(
      Provider<Colors> colorsProvider, Provider<Preferences> prefsProvider) {
    this.colorsProvider = colorsProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<WidgetProvider> create(
      Provider<Colors> colorsProvider, Provider<Preferences> prefsProvider) {
    return new WidgetProvider_MembersInjector(colorsProvider, prefsProvider);
  }

  @Override
  public void injectMembers(WidgetProvider instance) {
    injectColors(instance, colorsProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  public static void injectColors(WidgetProvider instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectPrefs(WidgetProvider instance, Preferences prefs) {
    instance.prefs = prefs;
  }
}
