package dev.octoshrimpy.quik.repository;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactRepositoryImpl_Factory implements Factory<ContactRepositoryImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<Preferences> prefsProvider;

  public ContactRepositoryImpl_Factory(
      Provider<Context> contextProvider, Provider<Preferences> prefsProvider) {
    this.contextProvider = contextProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public ContactRepositoryImpl get() {
    return provideInstance(contextProvider, prefsProvider);
  }

  public static ContactRepositoryImpl provideInstance(
      Provider<Context> contextProvider, Provider<Preferences> prefsProvider) {
    return new ContactRepositoryImpl(contextProvider.get(), prefsProvider.get());
  }

  public static ContactRepositoryImpl_Factory create(
      Provider<Context> contextProvider, Provider<Preferences> prefsProvider) {
    return new ContactRepositoryImpl_Factory(contextProvider, prefsProvider);
  }

  public static ContactRepositoryImpl newContactRepositoryImpl(Context context, Preferences prefs) {
    return new ContactRepositoryImpl(context, prefs);
  }
}
