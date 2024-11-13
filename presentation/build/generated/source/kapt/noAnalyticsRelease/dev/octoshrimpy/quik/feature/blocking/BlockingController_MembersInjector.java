package dev.octoshrimpy.quik.feature.blocking;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingController_MembersInjector
    implements MembersInjector<BlockingController> {
  private final Provider<Colors> colorsProvider;

  private final Provider<BlockingPresenter> presenterProvider;

  public BlockingController_MembersInjector(
      Provider<Colors> colorsProvider, Provider<BlockingPresenter> presenterProvider) {
    this.colorsProvider = colorsProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<BlockingController> create(
      Provider<Colors> colorsProvider, Provider<BlockingPresenter> presenterProvider) {
    return new BlockingController_MembersInjector(colorsProvider, presenterProvider);
  }

  @Override
  public void injectMembers(BlockingController instance) {
    injectColors(instance, colorsProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectColors(BlockingController instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectPresenter(BlockingController instance, BlockingPresenter presenter) {
    instance.presenter = presenter;
  }
}
