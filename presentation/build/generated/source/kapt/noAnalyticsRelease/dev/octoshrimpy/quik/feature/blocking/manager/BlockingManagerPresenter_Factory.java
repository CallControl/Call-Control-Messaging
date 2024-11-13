package dev.octoshrimpy.quik.feature.blocking.manager;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient;
import dev.octoshrimpy.quik.blocking.CallControlBlockingClient;
import dev.octoshrimpy.quik.blocking.QksmsBlockingClient;
import dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingManagerPresenter_Factory implements Factory<BlockingManagerPresenter> {
  private final Provider<AnalyticsManager> analyticsProvider;

  private final Provider<CallBlockerBlockingClient> callBlockerProvider;

  private final Provider<CallControlBlockingClient> callControlProvider;

  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<QksmsBlockingClient> qksmsProvider;

  private final Provider<ShouldIAnswerBlockingClient> shouldIAnswerProvider;

  public BlockingManagerPresenter_Factory(
      Provider<AnalyticsManager> analyticsProvider,
      Provider<CallBlockerBlockingClient> callBlockerProvider,
      Provider<CallControlBlockingClient> callControlProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<Preferences> prefsProvider,
      Provider<QksmsBlockingClient> qksmsProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerProvider) {
    this.analyticsProvider = analyticsProvider;
    this.callBlockerProvider = callBlockerProvider;
    this.callControlProvider = callControlProvider;
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.navigatorProvider = navigatorProvider;
    this.prefsProvider = prefsProvider;
    this.qksmsProvider = qksmsProvider;
    this.shouldIAnswerProvider = shouldIAnswerProvider;
  }

  @Override
  public BlockingManagerPresenter get() {
    return provideInstance(
        analyticsProvider,
        callBlockerProvider,
        callControlProvider,
        contextProvider,
        conversationRepoProvider,
        navigatorProvider,
        prefsProvider,
        qksmsProvider,
        shouldIAnswerProvider);
  }

  public static BlockingManagerPresenter provideInstance(
      Provider<AnalyticsManager> analyticsProvider,
      Provider<CallBlockerBlockingClient> callBlockerProvider,
      Provider<CallControlBlockingClient> callControlProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<Preferences> prefsProvider,
      Provider<QksmsBlockingClient> qksmsProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerProvider) {
    return new BlockingManagerPresenter(
        analyticsProvider.get(),
        callBlockerProvider.get(),
        callControlProvider.get(),
        contextProvider.get(),
        conversationRepoProvider.get(),
        navigatorProvider.get(),
        prefsProvider.get(),
        qksmsProvider.get(),
        shouldIAnswerProvider.get());
  }

  public static BlockingManagerPresenter_Factory create(
      Provider<AnalyticsManager> analyticsProvider,
      Provider<CallBlockerBlockingClient> callBlockerProvider,
      Provider<CallControlBlockingClient> callControlProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<Preferences> prefsProvider,
      Provider<QksmsBlockingClient> qksmsProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerProvider) {
    return new BlockingManagerPresenter_Factory(
        analyticsProvider,
        callBlockerProvider,
        callControlProvider,
        contextProvider,
        conversationRepoProvider,
        navigatorProvider,
        prefsProvider,
        qksmsProvider,
        shouldIAnswerProvider);
  }

  public static BlockingManagerPresenter newBlockingManagerPresenter(
      AnalyticsManager analytics,
      CallBlockerBlockingClient callBlocker,
      CallControlBlockingClient callControl,
      Context context,
      ConversationRepository conversationRepo,
      Navigator navigator,
      Preferences prefs,
      QksmsBlockingClient qksms,
      ShouldIAnswerBlockingClient shouldIAnswer) {
    return new BlockingManagerPresenter(
        analytics,
        callBlocker,
        callControl,
        context,
        conversationRepo,
        navigator,
        prefs,
        qksms,
        shouldIAnswer);
  }
}
