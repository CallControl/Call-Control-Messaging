package dev.octoshrimpy.quik.common.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RadioPreferenceView_MembersInjector
    implements MembersInjector<RadioPreferenceView> {
  private final Provider<Colors> colorsProvider;

  public RadioPreferenceView_MembersInjector(Provider<Colors> colorsProvider) {
    this.colorsProvider = colorsProvider;
  }

  public static MembersInjector<RadioPreferenceView> create(Provider<Colors> colorsProvider) {
    return new RadioPreferenceView_MembersInjector(colorsProvider);
  }

  @Override
  public void injectMembers(RadioPreferenceView instance) {
    injectColors(instance, colorsProvider.get());
  }

  public static void injectColors(RadioPreferenceView instance, Colors colors) {
    instance.colors = colors;
  }
}
