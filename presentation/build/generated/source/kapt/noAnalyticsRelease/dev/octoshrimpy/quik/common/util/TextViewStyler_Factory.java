package dev.octoshrimpy.quik.common.util;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TextViewStyler_Factory implements Factory<TextViewStyler> {
  private final Provider<Preferences> prefsProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<FontProvider> fontProvider;

  public TextViewStyler_Factory(
      Provider<Preferences> prefsProvider,
      Provider<Colors> colorsProvider,
      Provider<FontProvider> fontProvider) {
    this.prefsProvider = prefsProvider;
    this.colorsProvider = colorsProvider;
    this.fontProvider = fontProvider;
  }

  @Override
  public TextViewStyler get() {
    return provideInstance(prefsProvider, colorsProvider, fontProvider);
  }

  public static TextViewStyler provideInstance(
      Provider<Preferences> prefsProvider,
      Provider<Colors> colorsProvider,
      Provider<FontProvider> fontProvider) {
    return new TextViewStyler(prefsProvider.get(), colorsProvider.get(), fontProvider.get());
  }

  public static TextViewStyler_Factory create(
      Provider<Preferences> prefsProvider,
      Provider<Colors> colorsProvider,
      Provider<FontProvider> fontProvider) {
    return new TextViewStyler_Factory(prefsProvider, colorsProvider, fontProvider);
  }

  public static TextViewStyler newTextViewStyler(
      Preferences prefs, Colors colors, FontProvider fontProvider) {
    return new TextViewStyler(prefs, colors, fontProvider);
  }
}
