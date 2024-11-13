package dev.octoshrimpy.quik.feature.compose.editing;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailedChipView_MembersInjector implements MembersInjector<DetailedChipView> {
  private final Provider<Colors> colorsProvider;

  public DetailedChipView_MembersInjector(Provider<Colors> colorsProvider) {
    this.colorsProvider = colorsProvider;
  }

  public static MembersInjector<DetailedChipView> create(Provider<Colors> colorsProvider) {
    return new DetailedChipView_MembersInjector(colorsProvider);
  }

  @Override
  public void injectMembers(DetailedChipView instance) {
    injectColors(instance, colorsProvider.get());
  }

  public static void injectColors(DetailedChipView instance, Colors colors) {
    instance.colors = colors;
  }
}
