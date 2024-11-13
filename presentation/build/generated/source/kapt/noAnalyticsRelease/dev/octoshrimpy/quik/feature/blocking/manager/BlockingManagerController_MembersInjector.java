package dev.octoshrimpy.quik.feature.blocking.manager;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingManagerController_MembersInjector
    implements MembersInjector<BlockingManagerController> {
  private final Provider<Colors> colorsProvider;

  private final Provider<BlockingManagerPresenter> presenterProvider;

  public BlockingManagerController_MembersInjector(
      Provider<Colors> colorsProvider, Provider<BlockingManagerPresenter> presenterProvider) {
    this.colorsProvider = colorsProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<BlockingManagerController> create(
      Provider<Colors> colorsProvider, Provider<BlockingManagerPresenter> presenterProvider) {
    return new BlockingManagerController_MembersInjector(colorsProvider, presenterProvider);
  }

  @Override
  public void injectMembers(BlockingManagerController instance) {
    injectColors(instance, colorsProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectColors(BlockingManagerController instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectPresenter(
      BlockingManagerController instance, BlockingManagerPresenter presenter) {
    instance.presenter = presenter;
  }
}
