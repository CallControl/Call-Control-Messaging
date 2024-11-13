package dev.octoshrimpy.quik.feature.main;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.feature.blocking.BlockingDialog;
import dev.octoshrimpy.quik.feature.conversations.ConversationItemTouchCallback;
import dev.octoshrimpy.quik.feature.conversations.ConversationsAdapter;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<BlockingDialog> blockingDialogProvider;

  private final Provider<CompositeDisposable> disposablesProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<ConversationsAdapter> conversationsAdapterProvider;

  private final Provider<DrawerBadgesExperiment> drawerBadgesExperimentProvider;

  private final Provider<SearchAdapter> searchAdapterProvider;

  private final Provider<ConversationItemTouchCallback> itemTouchCallbackProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public MainActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<BlockingDialog> blockingDialogProvider,
      Provider<CompositeDisposable> disposablesProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ConversationsAdapter> conversationsAdapterProvider,
      Provider<DrawerBadgesExperiment> drawerBadgesExperimentProvider,
      Provider<SearchAdapter> searchAdapterProvider,
      Provider<ConversationItemTouchCallback> itemTouchCallbackProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.blockingDialogProvider = blockingDialogProvider;
    this.disposablesProvider = disposablesProvider;
    this.navigatorProvider = navigatorProvider;
    this.conversationsAdapterProvider = conversationsAdapterProvider;
    this.drawerBadgesExperimentProvider = drawerBadgesExperimentProvider;
    this.searchAdapterProvider = searchAdapterProvider;
    this.itemTouchCallbackProvider = itemTouchCallbackProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<BlockingDialog> blockingDialogProvider,
      Provider<CompositeDisposable> disposablesProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ConversationsAdapter> conversationsAdapterProvider,
      Provider<DrawerBadgesExperiment> drawerBadgesExperimentProvider,
      Provider<SearchAdapter> searchAdapterProvider,
      Provider<ConversationItemTouchCallback> itemTouchCallbackProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new MainActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        blockingDialogProvider,
        disposablesProvider,
        navigatorProvider,
        conversationsAdapterProvider,
        drawerBadgesExperimentProvider,
        searchAdapterProvider,
        itemTouchCallbackProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectBlockingDialog(instance, blockingDialogProvider.get());
    injectDisposables(instance, disposablesProvider.get());
    injectNavigator(instance, navigatorProvider.get());
    injectConversationsAdapter(instance, conversationsAdapterProvider.get());
    injectDrawerBadgesExperiment(instance, drawerBadgesExperimentProvider.get());
    injectSearchAdapter(instance, searchAdapterProvider.get());
    injectItemTouchCallback(instance, itemTouchCallbackProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectBlockingDialog(MainActivity instance, BlockingDialog blockingDialog) {
    instance.blockingDialog = blockingDialog;
  }

  public static void injectDisposables(MainActivity instance, CompositeDisposable disposables) {
    instance.disposables = disposables;
  }

  public static void injectNavigator(MainActivity instance, Navigator navigator) {
    instance.navigator = navigator;
  }

  public static void injectConversationsAdapter(
      MainActivity instance, ConversationsAdapter conversationsAdapter) {
    instance.conversationsAdapter = conversationsAdapter;
  }

  public static void injectDrawerBadgesExperiment(
      MainActivity instance, DrawerBadgesExperiment drawerBadgesExperiment) {
    instance.drawerBadgesExperiment = drawerBadgesExperiment;
  }

  public static void injectSearchAdapter(MainActivity instance, SearchAdapter searchAdapter) {
    instance.searchAdapter = searchAdapter;
  }

  public static void injectItemTouchCallback(
      MainActivity instance, ConversationItemTouchCallback itemTouchCallback) {
    instance.itemTouchCallback = itemTouchCallback;
  }

  public static void injectViewModelFactory(
      MainActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
