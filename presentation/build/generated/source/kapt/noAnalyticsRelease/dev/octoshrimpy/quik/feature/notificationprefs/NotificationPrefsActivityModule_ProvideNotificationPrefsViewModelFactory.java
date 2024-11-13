package dev.octoshrimpy.quik.feature.notificationprefs;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory
    implements Factory<ViewModel> {
  private final NotificationPrefsActivityModule module;

  private final Provider<NotificationPrefsViewModel> viewModelProvider;

  public NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory(
      NotificationPrefsActivityModule module,
      Provider<NotificationPrefsViewModel> viewModelProvider) {
    this.module = module;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModel get() {
    return provideInstance(module, viewModelProvider);
  }

  public static ViewModel provideInstance(
      NotificationPrefsActivityModule module,
      Provider<NotificationPrefsViewModel> viewModelProvider) {
    return proxyProvideNotificationPrefsViewModel(module, viewModelProvider.get());
  }

  public static NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory create(
      NotificationPrefsActivityModule module,
      Provider<NotificationPrefsViewModel> viewModelProvider) {
    return new NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory(
        module, viewModelProvider);
  }

  public static ViewModel proxyProvideNotificationPrefsViewModel(
      NotificationPrefsActivityModule instance, NotificationPrefsViewModel viewModel) {
    return Preconditions.checkNotNull(
        instance.provideNotificationPrefsViewModel(viewModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
