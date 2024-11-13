package dev.octoshrimpy.quik.feature.plus;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.FontProvider;
import dev.octoshrimpy.quik.feature.plus.experiment.UpgradeButtonExperiment;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlusActivity_MembersInjector implements MembersInjector<PlusActivity> {
  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<FontProvider> fontProvider;

  private final Provider<UpgradeButtonExperiment> upgradeButtonExperimentProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PlusActivity_MembersInjector(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<FontProvider> fontProvider,
      Provider<UpgradeButtonExperiment> upgradeButtonExperimentProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.fontProvider = fontProvider;
    this.upgradeButtonExperimentProvider = upgradeButtonExperimentProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PlusActivity> create(
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<FontProvider> fontProvider,
      Provider<UpgradeButtonExperiment> upgradeButtonExperimentProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PlusActivity_MembersInjector(
        colorsProvider,
        conversationRepoProvider,
        messageRepoProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        fontProvider,
        upgradeButtonExperimentProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PlusActivity instance) {
    QkThemedActivity_MembersInjector.injectColors(instance, colorsProvider.get());
    QkThemedActivity_MembersInjector.injectConversationRepo(
        instance, conversationRepoProvider.get());
    QkThemedActivity_MembersInjector.injectMessageRepo(instance, messageRepoProvider.get());
    QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    QkThemedActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectFontProvider(instance, fontProvider.get());
    injectUpgradeButtonExperiment(instance, upgradeButtonExperimentProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectFontProvider(PlusActivity instance, FontProvider fontProvider) {
    instance.fontProvider = fontProvider;
  }

  public static void injectUpgradeButtonExperiment(
      PlusActivity instance, UpgradeButtonExperiment upgradeButtonExperiment) {
    instance.upgradeButtonExperiment = upgradeButtonExperiment;
  }

  public static void injectViewModelFactory(
      PlusActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
