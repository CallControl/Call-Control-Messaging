package dev.octoshrimpy.quik.feature.themepicker;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.manager.WidgetManager;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThemePickerPresenter_Factory implements Factory<ThemePickerPresenter> {
  private final Provider<Preferences> prefsProvider;

  private final Provider<Long> recipientIdProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<WidgetManager> widgetManagerProvider;

  public ThemePickerPresenter_Factory(
      Provider<Preferences> prefsProvider,
      Provider<Long> recipientIdProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Colors> colorsProvider,
      Provider<Navigator> navigatorProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    this.prefsProvider = prefsProvider;
    this.recipientIdProvider = recipientIdProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.colorsProvider = colorsProvider;
    this.navigatorProvider = navigatorProvider;
    this.widgetManagerProvider = widgetManagerProvider;
  }

  @Override
  public ThemePickerPresenter get() {
    return provideInstance(
        prefsProvider,
        recipientIdProvider,
        billingManagerProvider,
        colorsProvider,
        navigatorProvider,
        widgetManagerProvider);
  }

  public static ThemePickerPresenter provideInstance(
      Provider<Preferences> prefsProvider,
      Provider<Long> recipientIdProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Colors> colorsProvider,
      Provider<Navigator> navigatorProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    return new ThemePickerPresenter(
        prefsProvider.get(),
        recipientIdProvider.get(),
        billingManagerProvider.get(),
        colorsProvider.get(),
        navigatorProvider.get(),
        widgetManagerProvider.get());
  }

  public static ThemePickerPresenter_Factory create(
      Provider<Preferences> prefsProvider,
      Provider<Long> recipientIdProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<Colors> colorsProvider,
      Provider<Navigator> navigatorProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    return new ThemePickerPresenter_Factory(
        prefsProvider,
        recipientIdProvider,
        billingManagerProvider,
        colorsProvider,
        navigatorProvider,
        widgetManagerProvider);
  }

  public static ThemePickerPresenter newThemePickerPresenter(
      Preferences prefs,
      long recipientId,
      BillingManager billingManager,
      Colors colors,
      Navigator navigator,
      WidgetManager widgetManager) {
    return new ThemePickerPresenter(
        prefs, recipientId, billingManager, colors, navigator, widgetManager);
  }
}
