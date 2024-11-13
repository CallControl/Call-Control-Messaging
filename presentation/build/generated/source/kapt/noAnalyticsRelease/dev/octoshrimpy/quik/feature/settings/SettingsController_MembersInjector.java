package dev.octoshrimpy.quik.feature.settings;

import android.content.Context;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.QkDialog;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettingsController_MembersInjector
    implements MembersInjector<SettingsController> {
  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<QkDialog>
      mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider;

  private final Provider<SettingsPresenter> presenterProvider;

  public SettingsController_MembersInjector(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<QkDialog> mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider,
      Provider<SettingsPresenter> presenterProvider) {
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
    this.mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider =
        mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SettingsController> create(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<QkDialog> mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider,
      Provider<SettingsPresenter> presenterProvider) {
    return new SettingsController_MembersInjector(
        contextProvider,
        colorsProvider,
        mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider,
        presenterProvider);
  }

  @Override
  public void injectMembers(SettingsController instance) {
    injectContext(instance, contextProvider.get());
    injectColors(instance, colorsProvider.get());
    injectNightModeDialog(
        instance, mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider.get());
    injectTextSizeDialog(
        instance, mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider.get());
    injectSendDelayDialog(
        instance, mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider.get());
    injectMmsSizeDialog(
        instance, mmsSizeDialogAndNightModeDialogAndSendDelayDialogAndTextSizeDialogProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectContext(SettingsController instance, Context context) {
    instance.context = context;
  }

  public static void injectColors(SettingsController instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectNightModeDialog(SettingsController instance, QkDialog nightModeDialog) {
    instance.nightModeDialog = nightModeDialog;
  }

  public static void injectTextSizeDialog(SettingsController instance, QkDialog textSizeDialog) {
    instance.textSizeDialog = textSizeDialog;
  }

  public static void injectSendDelayDialog(SettingsController instance, QkDialog sendDelayDialog) {
    instance.sendDelayDialog = sendDelayDialog;
  }

  public static void injectMmsSizeDialog(SettingsController instance, QkDialog mmsSizeDialog) {
    instance.mmsSizeDialog = mmsSizeDialog;
  }

  public static void injectPresenter(SettingsController instance, SettingsPresenter presenter) {
    instance.presenter = presenter;
  }
}
