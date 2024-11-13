package dev.octoshrimpy.quik.feature.contacts;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsActivityModule_ProvideContactsViewModelFactory
    implements Factory<ViewModel> {
  private final ContactsActivityModule module;

  private final Provider<ContactsViewModel> viewModelProvider;

  public ContactsActivityModule_ProvideContactsViewModelFactory(
      ContactsActivityModule module, Provider<ContactsViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      ContactsActivityModule module, Provider<ContactsViewModel> viewModelProvider) {
    return proxyProvideContactsViewModel(module, viewModelProvider.get());
  }

  public static ContactsActivityModule_ProvideContactsViewModelFactory create(
      ContactsActivityModule module, Provider<ContactsViewModel> viewModelProvider) {
    return new ContactsActivityModule_ProvideContactsViewModelFactory(module, viewModelProvider);
  }

  public static ViewModel proxyProvideContactsViewModel(
      ContactsActivityModule instance, ContactsViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideContactsViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
