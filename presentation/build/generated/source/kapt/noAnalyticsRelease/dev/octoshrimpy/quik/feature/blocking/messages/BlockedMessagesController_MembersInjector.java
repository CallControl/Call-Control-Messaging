package dev.octoshrimpy.quik.feature.blocking.messages;

import android.content.Context;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.feature.blocking.BlockingDialog;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockedMessagesController_MembersInjector
    implements MembersInjector<BlockedMessagesController> {
  private final Provider<BlockedMessagesAdapter> blockedMessagesAdapterProvider;

  private final Provider<BlockingDialog> blockingDialogProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<Context> contextProvider;

  private final Provider<BlockedMessagesPresenter> presenterProvider;

  public BlockedMessagesController_MembersInjector(
      Provider<BlockedMessagesAdapter> blockedMessagesAdapterProvider,
      Provider<BlockingDialog> blockingDialogProvider,
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<BlockedMessagesPresenter> presenterProvider) {
    this.blockedMessagesAdapterProvider = blockedMessagesAdapterProvider;
    this.blockingDialogProvider = blockingDialogProvider;
    this.colorsProvider = colorsProvider;
    this.contextProvider = contextProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<BlockedMessagesController> create(
      Provider<BlockedMessagesAdapter> blockedMessagesAdapterProvider,
      Provider<BlockingDialog> blockingDialogProvider,
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<BlockedMessagesPresenter> presenterProvider) {
    return new BlockedMessagesController_MembersInjector(
        blockedMessagesAdapterProvider,
        blockingDialogProvider,
        colorsProvider,
        contextProvider,
        presenterProvider);
  }

  @Override
  public void injectMembers(BlockedMessagesController instance) {
    injectBlockedMessagesAdapter(instance, blockedMessagesAdapterProvider.get());
    injectBlockingDialog(instance, blockingDialogProvider.get());
    injectColors(instance, colorsProvider.get());
    injectContext(instance, contextProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectBlockedMessagesAdapter(
      BlockedMessagesController instance, BlockedMessagesAdapter blockedMessagesAdapter) {
    instance.blockedMessagesAdapter = blockedMessagesAdapter;
  }

  public static void injectBlockingDialog(
      BlockedMessagesController instance, BlockingDialog blockingDialog) {
    instance.blockingDialog = blockingDialog;
  }

  public static void injectColors(BlockedMessagesController instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectContext(BlockedMessagesController instance, Context context) {
    instance.context = context;
  }

  public static void injectPresenter(
      BlockedMessagesController instance, BlockedMessagesPresenter presenter) {
    instance.presenter = presenter;
  }
}
