package dev.octoshrimpy.quik.interactor;

import com.f2prateek.rx.preferences2.RxSharedPreferences;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.NightModeManager;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MigratePreferences_Factory implements Factory<MigratePreferences> {
  private final Provider<NightModeManager> nightModeManagerProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<RxSharedPreferences> rxPrefsProvider;

  public MigratePreferences_Factory(
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<RxSharedPreferences> rxPrefsProvider) {
    this.nightModeManagerProvider = nightModeManagerProvider;
    this.prefsProvider = prefsProvider;
    this.rxPrefsProvider = rxPrefsProvider;
  }

  @Override
  public MigratePreferences get() {
    return provideInstance(nightModeManagerProvider, prefsProvider, rxPrefsProvider);
  }

  public static MigratePreferences provideInstance(
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<RxSharedPreferences> rxPrefsProvider) {
    return new MigratePreferences(
        nightModeManagerProvider.get(), prefsProvider.get(), rxPrefsProvider.get());
  }

  public static MigratePreferences_Factory create(
      Provider<NightModeManager> nightModeManagerProvider,
      Provider<Preferences> prefsProvider,
      Provider<RxSharedPreferences> rxPrefsProvider) {
    return new MigratePreferences_Factory(nightModeManagerProvider, prefsProvider, rxPrefsProvider);
  }

  public static MigratePreferences newMigratePreferences(
      NightModeManager nightModeManager, Preferences prefs, RxSharedPreferences rxPrefs) {
    return new MigratePreferences(nightModeManager, prefs, rxPrefs);
  }
}
