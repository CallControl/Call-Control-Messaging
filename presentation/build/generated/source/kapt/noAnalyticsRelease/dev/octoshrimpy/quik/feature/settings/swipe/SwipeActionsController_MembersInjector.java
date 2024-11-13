package dev.octoshrimpy.quik.feature.settings.swipe;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.QkDialog;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SwipeActionsController_MembersInjector
    implements MembersInjector<SwipeActionsController> {
  private final Provider<SwipeActionsPresenter> presenterProvider;

  private final Provider<QkDialog> actionsDialogProvider;

  private final Provider<Colors> colorsProvider;

  public SwipeActionsController_MembersInjector(
      Provider<SwipeActionsPresenter> presenterProvider,
      Provider<QkDialog> actionsDialogProvider,
      Provider<Colors> colorsProvider) {
    this.presenterProvider = presenterProvider;
    this.actionsDialogProvider = actionsDialogProvider;
    this.colorsProvider = colorsProvider;
  }

  public static MembersInjector<SwipeActionsController> create(
      Provider<SwipeActionsPresenter> presenterProvider,
      Provider<QkDialog> actionsDialogProvider,
      Provider<Colors> colorsProvider) {
    return new SwipeActionsController_MembersInjector(
        presenterProvider, actionsDialogProvider, colorsProvider);
  }

  @Override
  public void injectMembers(SwipeActionsController instance) {
    injectPresenter(instance, presenterProvider.get());
    injectActionsDialog(instance, actionsDialogProvider.get());
    injectColors(instance, colorsProvider.get());
  }

  public static void injectPresenter(
      SwipeActionsController instance, SwipeActionsPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectActionsDialog(SwipeActionsController instance, QkDialog actionsDialog) {
    instance.actionsDialog = actionsDialog;
  }

  public static void injectColors(SwipeActionsController instance, Colors colors) {
    instance.colors = colors;
  }
}
