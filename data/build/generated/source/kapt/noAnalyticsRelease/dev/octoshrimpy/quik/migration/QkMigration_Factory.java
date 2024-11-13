package dev.octoshrimpy.quik.migration;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.QksmsBlockingClient;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkMigration_Factory implements Factory<QkMigration> {
  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<QksmsBlockingClient> qksmsBlockingClientProvider;

  public QkMigration_Factory(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider) {
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.prefsProvider = prefsProvider;
    this.qksmsBlockingClientProvider = qksmsBlockingClientProvider;
  }

  @Override
  public QkMigration get() {
    return provideInstance(
        contextProvider, conversationRepoProvider, prefsProvider, qksmsBlockingClientProvider);
  }

  public static QkMigration provideInstance(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider) {
    return new QkMigration(
        contextProvider.get(),
        conversationRepoProvider.get(),
        prefsProvider.get(),
        qksmsBlockingClientProvider.get());
  }

  public static QkMigration_Factory create(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Preferences> prefsProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider) {
    return new QkMigration_Factory(
        contextProvider, conversationRepoProvider, prefsProvider, qksmsBlockingClientProvider);
  }

  public static QkMigration newQkMigration(
      Context context,
      ConversationRepository conversationRepo,
      Preferences prefs,
      QksmsBlockingClient qksmsBlockingClient) {
    return new QkMigration(context, conversationRepo, prefs, qksmsBlockingClient);
  }
}
