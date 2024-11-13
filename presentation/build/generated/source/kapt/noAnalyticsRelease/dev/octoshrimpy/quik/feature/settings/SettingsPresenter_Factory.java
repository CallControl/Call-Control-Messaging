package dev.octoshrimpy.quik.feature.settings;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.interactor.DeleteOldMessages;
import dev.octoshrimpy.quik.interactor.SyncMessages;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.repository.SyncRepository;
import dev.octoshrimpy.quik.util.NightModeManager;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettingsPresenter_Factory implements Factory<SettingsPresenter> {
  private final Provider<Colors> colorsProvider;

  private final Provider<SyncRepository> syncRepoProvider;

  private final Provider<AnalyticsManager> analyticsProvider;

  private final Provider<Context> contextProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<DeleteOldMessages> deleteOldMessagesProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<NightModeManager> nightModeManagerProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<SyncMessages> syncMessagesProvider;

  public SettingsPresenter_Factory(
      Provider<Colors> colorsProvider,
      Provider<SyncRepository> syncRepoProvider,
      Provider<AnalyticsManager> analyticsProvider,
      Provider<Context> contextProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<DeleteOldMessages> deleteOldMessagesProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncMessages> syncMessagesProvider) {
    this.colorsProvider = colorsProvider;
    this.syncRepoProvider = syncRepoProvider;
    this.analyticsProvider = analyticsProvider;
    this.contextProvider = contextProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.deleteOldMessagesProvider = deleteOldMessagesProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.navigatorProvider = navigatorProvider;
    this.nightModeManagerProvider = nightModeManagerProvider;
    this.prefsProvider = prefsProvider;
    this.syncMessagesProvider = syncMessagesProvider;
  }

  @Override
  public SettingsPresenter get() {
    return provideInstance(
        colorsProvider,
        syncRepoProvider,
        analyticsProvider,
        contextProvider,
        billingManagerProvider,
        dateFormatterProvider,
        deleteOldMessagesProvider,
        messageRepoProvider,
        navigatorProvider,
        nightModeManagerProvider,
        prefsProvider,
        syncMessagesProvider);
  }

  public static SettingsPresenter provideInstance(
      Provider<Colors> colorsProvider,
      Provider<SyncRepository> syncRepoProvider,
      Provider<AnalyticsManager> analyticsProvider,
      Provider<Context> contextProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<DeleteOldMessages> deleteOldMessagesProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncMessages> syncMessagesProvider) {
    return new SettingsPresenter(
        colorsProvider.get(),
        syncRepoProvider.get(),
        analyticsProvider.get(),
        contextProvider.get(),
        billingManagerProvider.get(),
        dateFormatterProvider.get(),
        deleteOldMessagesProvider.get(),
        messageRepoProvider.get(),
        navigatorProvider.get(),
        nightModeManagerProvider.get(),
        prefsProvider.get(),
        syncMessagesProvider.get());
  }

  public static SettingsPresenter_Factory create(
      Provider<Colors> colorsProvider,
      Provider<SyncRepository> syncRepoProvider,
      Provider<AnalyticsManager> analyticsProvider,
      Provider<Context> contextProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<DeleteOldMessages> deleteOldMessagesProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncMessages> syncMessagesProvider) {
    return new SettingsPresenter_Factory(
        colorsProvider,
        syncRepoProvider,
        analyticsProvider,
        contextProvider,
        billingManagerProvider,
        dateFormatterProvider,
        deleteOldMessagesProvider,
        messageRepoProvider,
        navigatorProvider,
        nightModeManagerProvider,
        prefsProvider,
        syncMessagesProvider);
  }

  public static SettingsPresenter newSettingsPresenter(
      Colors colors,
      SyncRepository syncRepo,
      AnalyticsManager analytics,
      Context context,
      BillingManager billingManager,
      DateFormatter dateFormatter,
      DeleteOldMessages deleteOldMessages,
      MessageRepository messageRepo,
      Navigator navigator,
      NightModeManager nightModeManager,
      Preferences prefs,
      SyncMessages syncMessages) {
    return new SettingsPresenter(
        colors,
        syncRepo,
        analytics,
        context,
        billingManager,
        dateFormatter,
        deleteOldMessages,
        messageRepo,
        navigator,
        nightModeManager,
        prefs,
        syncMessages);
  }
}
