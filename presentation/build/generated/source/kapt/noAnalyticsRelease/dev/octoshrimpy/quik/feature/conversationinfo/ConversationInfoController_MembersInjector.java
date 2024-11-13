package dev.octoshrimpy.quik.feature.conversationinfo;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.feature.blocking.BlockingDialog;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationInfoController_MembersInjector
    implements MembersInjector<ConversationInfoController> {
  private final Provider<ConversationInfoPresenter> presenterProvider;

  private final Provider<BlockingDialog> blockingDialogProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<ConversationInfoAdapter> adapterProvider;

  public ConversationInfoController_MembersInjector(
      Provider<ConversationInfoPresenter> presenterProvider,
      Provider<BlockingDialog> blockingDialogProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ConversationInfoAdapter> adapterProvider) {
    this.presenterProvider = presenterProvider;
    this.blockingDialogProvider = blockingDialogProvider;
    this.navigatorProvider = navigatorProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<ConversationInfoController> create(
      Provider<ConversationInfoPresenter> presenterProvider,
      Provider<BlockingDialog> blockingDialogProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ConversationInfoAdapter> adapterProvider) {
    return new ConversationInfoController_MembersInjector(
        presenterProvider, blockingDialogProvider, navigatorProvider, adapterProvider);
  }

  @Override
  public void injectMembers(ConversationInfoController instance) {
    injectPresenter(instance, presenterProvider.get());
    injectBlockingDialog(instance, blockingDialogProvider.get());
    injectNavigator(instance, navigatorProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectPresenter(
      ConversationInfoController instance, ConversationInfoPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectBlockingDialog(
      ConversationInfoController instance, BlockingDialog blockingDialog) {
    instance.blockingDialog = blockingDialog;
  }

  public static void injectNavigator(ConversationInfoController instance, Navigator navigator) {
    instance.navigator = navigator;
  }

  public static void injectAdapter(
      ConversationInfoController instance, ConversationInfoAdapter adapter) {
    instance.adapter = adapter;
  }
}
