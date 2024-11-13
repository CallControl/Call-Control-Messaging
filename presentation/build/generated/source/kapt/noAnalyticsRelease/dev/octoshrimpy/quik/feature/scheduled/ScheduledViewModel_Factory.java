package dev.octoshrimpy.quik.feature.scheduled;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.interactor.SendScheduledMessage;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.repository.ScheduledMessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScheduledViewModel_Factory implements Factory<ScheduledViewModel> {
  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<ScheduledMessageRepository> scheduledMessageRepoProvider;

  private final Provider<SendScheduledMessage> sendScheduledMessageProvider;

  public ScheduledViewModel_Factory(
      Provider<BillingManager> billingManagerProvider,
      Provider<Context> contextProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    this.billingManagerProvider = billingManagerProvider;
    this.contextProvider = contextProvider;
    this.navigatorProvider = navigatorProvider;
    this.scheduledMessageRepoProvider = scheduledMessageRepoProvider;
    this.sendScheduledMessageProvider = sendScheduledMessageProvider;
  }

  @Override
  public ScheduledViewModel get() {
    return provideInstance(
        billingManagerProvider,
        contextProvider,
        navigatorProvider,
        scheduledMessageRepoProvider,
        sendScheduledMessageProvider);
  }

  public static ScheduledViewModel provideInstance(
      Provider<BillingManager> billingManagerProvider,
      Provider<Context> contextProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    return new ScheduledViewModel(
        billingManagerProvider.get(),
        contextProvider.get(),
        navigatorProvider.get(),
        scheduledMessageRepoProvider.get(),
        sendScheduledMessageProvider.get());
  }

  public static ScheduledViewModel_Factory create(
      Provider<BillingManager> billingManagerProvider,
      Provider<Context> contextProvider,
      Provider<Navigator> navigatorProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    return new ScheduledViewModel_Factory(
        billingManagerProvider,
        contextProvider,
        navigatorProvider,
        scheduledMessageRepoProvider,
        sendScheduledMessageProvider);
  }

  public static ScheduledViewModel newScheduledViewModel(
      BillingManager billingManager,
      Context context,
      Navigator navigator,
      ScheduledMessageRepository scheduledMessageRepo,
      SendScheduledMessage sendScheduledMessage) {
    return new ScheduledViewModel(
        billingManager, context, navigator, scheduledMessageRepo, sendScheduledMessage);
  }
}
