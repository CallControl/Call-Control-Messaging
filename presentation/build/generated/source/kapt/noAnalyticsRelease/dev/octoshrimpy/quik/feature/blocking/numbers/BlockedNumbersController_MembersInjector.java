package dev.octoshrimpy.quik.feature.blocking.numbers;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockedNumbersController_MembersInjector
    implements MembersInjector<BlockedNumbersController> {
  private final Provider<BlockedNumbersPresenter> presenterProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public BlockedNumbersController_MembersInjector(
      Provider<BlockedNumbersPresenter> presenterProvider,
      Provider<Colors> colorsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.presenterProvider = presenterProvider;
    this.colorsProvider = colorsProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  public static MembersInjector<BlockedNumbersController> create(
      Provider<BlockedNumbersPresenter> presenterProvider,
      Provider<Colors> colorsProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new BlockedNumbersController_MembersInjector(
        presenterProvider, colorsProvider, phoneNumberUtilsProvider);
  }

  @Override
  public void injectMembers(BlockedNumbersController instance) {
    injectPresenter(instance, presenterProvider.get());
    injectColors(instance, colorsProvider.get());
    injectPhoneNumberUtils(instance, phoneNumberUtilsProvider.get());
  }

  public static void injectPresenter(
      BlockedNumbersController instance, BlockedNumbersPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectColors(BlockedNumbersController instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectPhoneNumberUtils(
      BlockedNumbersController instance, PhoneNumberUtils phoneNumberUtils) {
    instance.phoneNumberUtils = phoneNumberUtils;
  }
}
