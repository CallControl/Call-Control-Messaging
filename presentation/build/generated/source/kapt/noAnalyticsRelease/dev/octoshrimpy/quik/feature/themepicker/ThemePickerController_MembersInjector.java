package dev.octoshrimpy.quik.feature.themepicker;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThemePickerController_MembersInjector
    implements MembersInjector<ThemePickerController> {
  private final Provider<ThemePickerPresenter> presenterProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<ThemeAdapter> themeAdapterProvider;

  private final Provider<ThemePagerAdapter> themePagerAdapterProvider;

  public ThemePickerController_MembersInjector(
      Provider<ThemePickerPresenter> presenterProvider,
      Provider<Colors> colorsProvider,
      Provider<ThemeAdapter> themeAdapterProvider,
      Provider<ThemePagerAdapter> themePagerAdapterProvider) {
    this.presenterProvider = presenterProvider;
    this.colorsProvider = colorsProvider;
    this.themeAdapterProvider = themeAdapterProvider;
    this.themePagerAdapterProvider = themePagerAdapterProvider;
  }

  public static MembersInjector<ThemePickerController> create(
      Provider<ThemePickerPresenter> presenterProvider,
      Provider<Colors> colorsProvider,
      Provider<ThemeAdapter> themeAdapterProvider,
      Provider<ThemePagerAdapter> themePagerAdapterProvider) {
    return new ThemePickerController_MembersInjector(
        presenterProvider, colorsProvider, themeAdapterProvider, themePagerAdapterProvider);
  }

  @Override
  public void injectMembers(ThemePickerController instance) {
    injectPresenter(instance, presenterProvider.get());
    injectColors(instance, colorsProvider.get());
    injectThemeAdapter(instance, themeAdapterProvider.get());
    injectThemePagerAdapter(instance, themePagerAdapterProvider.get());
  }

  public static void injectPresenter(
      ThemePickerController instance, ThemePickerPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectColors(ThemePickerController instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectThemeAdapter(ThemePickerController instance, ThemeAdapter themeAdapter) {
    instance.themeAdapter = themeAdapter;
  }

  public static void injectThemePagerAdapter(
      ThemePickerController instance, ThemePagerAdapter themePagerAdapter) {
    instance.themePagerAdapter = themePagerAdapter;
  }
}
