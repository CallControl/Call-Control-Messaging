package dev.octoshrimpy.quik.feature.contacts;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsActivityModule_ProvideIsSharingFactory implements Factory<Boolean> {
  private final ContactsActivityModule module;

  private final Provider<ContactsActivity> activityProvider;

  public ContactsActivityModule_ProvideIsSharingFactory(
      ContactsActivityModule module, Provider<ContactsActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Boolean get() {
    return provideInstance(module, activityProvider);
  }

  public static Boolean provideInstance(
      ContactsActivityModule module, Provider<ContactsActivity> activityProvider) {
    return proxyProvideIsSharing(module, activityProvider.get());
  }

  public static ContactsActivityModule_ProvideIsSharingFactory create(
      ContactsActivityModule module, Provider<ContactsActivity> activityProvider) {
    return new ContactsActivityModule_ProvideIsSharingFactory(module, activityProvider);
  }

  public static boolean proxyProvideIsSharing(
      ContactsActivityModule instance, ContactsActivity activity) {
    return instance.provideIsSharing(activity);
  }
}
