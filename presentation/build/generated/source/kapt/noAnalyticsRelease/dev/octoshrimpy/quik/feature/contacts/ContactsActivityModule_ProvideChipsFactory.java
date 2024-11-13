package dev.octoshrimpy.quik.feature.contacts;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.HashMap;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsActivityModule_ProvideChipsFactory
    implements Factory<HashMap<String, String>> {
  private final ContactsActivityModule module;

  private final Provider<ContactsActivity> activityProvider;

  public ContactsActivityModule_ProvideChipsFactory(
      ContactsActivityModule module, Provider<ContactsActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public HashMap<String, String> get() {
    return provideInstance(module, activityProvider);
  }

  public static HashMap<String, String> provideInstance(
      ContactsActivityModule module, Provider<ContactsActivity> activityProvider) {
    return proxyProvideChips(module, activityProvider.get());
  }

  public static ContactsActivityModule_ProvideChipsFactory create(
      ContactsActivityModule module, Provider<ContactsActivity> activityProvider) {
    return new ContactsActivityModule_ProvideChipsFactory(module, activityProvider);
  }

  public static HashMap<String, String> proxyProvideChips(
      ContactsActivityModule instance, ContactsActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideChips(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
