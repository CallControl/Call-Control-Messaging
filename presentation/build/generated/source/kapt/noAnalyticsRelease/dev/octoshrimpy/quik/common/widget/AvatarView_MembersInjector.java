package dev.octoshrimpy.quik.common.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AvatarView_MembersInjector implements MembersInjector<AvatarView> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Navigator> navigatorProvider;

  public AvatarView_MembersInjector(
      Provider<Colors> colorsProvider, Provider<Navigator> navigatorProvider) {
    this.colorsProvider = colorsProvider;
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<AvatarView> create(
      Provider<Colors> colorsProvider, Provider<Navigator> navigatorProvider) {
    return new AvatarView_MembersInjector(colorsProvider, navigatorProvider);
  }

  @Override
  public void injectMembers(AvatarView instance) {
    injectColors(instance, colorsProvider.get());
    injectNavigator(instance, navigatorProvider.get());
  }

  public static void injectColors(AvatarView instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectNavigator(AvatarView instance, Navigator navigator) {
    instance.navigator = navigator;
  }
}
