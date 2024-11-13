package dev.octoshrimpy.quik.feature.notificationprefs;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationPrefsViewModel_Factory
    implements Factory<NotificationPrefsViewModel> {
  private final Provider<Long> threadIdProvider;

  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<Preferences> prefsProvider;

  public NotificationPrefsViewModel_Factory(
      Provider<Long> threadIdProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<Preferences> prefsProvider) {
    this.threadIdProvider = threadIdProvider;
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.navigatorProvider = navigatorProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public NotificationPrefsViewModel get() {
    return provideInstance(
        threadIdProvider,
        contextProvider,
        conversationRepoProvider,
        navigatorProvider,
        prefsProvider);
  }

  public static NotificationPrefsViewModel provideInstance(
      Provider<Long> threadIdProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<Preferences> prefsProvider) {
    return new NotificationPrefsViewModel(
        threadIdProvider.get(),
        contextProvider.get(),
        conversationRepoProvider.get(),
        navigatorProvider.get(),
        prefsProvider.get());
  }

  public static NotificationPrefsViewModel_Factory create(
      Provider<Long> threadIdProvider,
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<Preferences> prefsProvider) {
    return new NotificationPrefsViewModel_Factory(
        threadIdProvider,
        contextProvider,
        conversationRepoProvider,
        navigatorProvider,
        prefsProvider);
  }

  public static NotificationPrefsViewModel newNotificationPrefsViewModel(
      long threadId,
      Context context,
      ConversationRepository conversationRepo,
      Navigator navigator,
      Preferences prefs) {
    return new NotificationPrefsViewModel(threadId, context, conversationRepo, navigator, prefs);
  }
}
