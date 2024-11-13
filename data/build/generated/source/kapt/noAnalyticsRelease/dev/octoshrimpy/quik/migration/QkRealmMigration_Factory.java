package dev.octoshrimpy.quik.migration;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.mapper.CursorToContactImpl;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkRealmMigration_Factory implements Factory<QkRealmMigration> {
  private final Provider<CursorToContactImpl> cursorToContactProvider;

  private final Provider<Preferences> prefsProvider;

  public QkRealmMigration_Factory(
      Provider<CursorToContactImpl> cursorToContactProvider, Provider<Preferences> prefsProvider) {
    this.cursorToContactProvider = cursorToContactProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public QkRealmMigration get() {
    return provideInstance(cursorToContactProvider, prefsProvider);
  }

  public static QkRealmMigration provideInstance(
      Provider<CursorToContactImpl> cursorToContactProvider, Provider<Preferences> prefsProvider) {
    return new QkRealmMigration(cursorToContactProvider.get(), prefsProvider.get());
  }

  public static QkRealmMigration_Factory create(
      Provider<CursorToContactImpl> cursorToContactProvider, Provider<Preferences> prefsProvider) {
    return new QkRealmMigration_Factory(cursorToContactProvider, prefsProvider);
  }

  public static QkRealmMigration newQkRealmMigration(
      CursorToContactImpl cursorToContact, Preferences prefs) {
    return new QkRealmMigration(cursorToContact, prefs);
  }
}
