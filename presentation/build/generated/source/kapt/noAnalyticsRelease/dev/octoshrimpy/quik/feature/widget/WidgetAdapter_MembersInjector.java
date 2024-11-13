package dev.octoshrimpy.quik.feature.widget;

import android.content.Context;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WidgetAdapter_MembersInjector implements MembersInjector<WidgetAdapter> {
  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<Preferences> prefsProvider;

  public WidgetAdapter_MembersInjector(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Preferences> prefsProvider) {
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<WidgetAdapter> create(
      Provider<Context> contextProvider,
      Provider<Colors> colorsProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Preferences> prefsProvider) {
    return new WidgetAdapter_MembersInjector(
        contextProvider,
        colorsProvider,
        conversationRepoProvider,
        dateFormatterProvider,
        prefsProvider);
  }

  @Override
  public void injectMembers(WidgetAdapter instance) {
    injectContext(instance, contextProvider.get());
    injectColors(instance, colorsProvider.get());
    injectConversationRepo(instance, conversationRepoProvider.get());
    injectDateFormatter(instance, dateFormatterProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  public static void injectContext(WidgetAdapter instance, Context context) {
    instance.context = context;
  }

  public static void injectColors(WidgetAdapter instance, Colors colors) {
    instance.colors = colors;
  }

  public static void injectConversationRepo(
      WidgetAdapter instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }

  public static void injectDateFormatter(WidgetAdapter instance, DateFormatter dateFormatter) {
    instance.dateFormatter = dateFormatter;
  }

  public static void injectPrefs(WidgetAdapter instance, Preferences prefs) {
    instance.prefs = prefs;
  }
}
