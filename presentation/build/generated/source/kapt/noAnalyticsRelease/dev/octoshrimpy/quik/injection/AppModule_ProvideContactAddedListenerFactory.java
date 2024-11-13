package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.listener.ContactAddedListener;
import dev.octoshrimpy.quik.listener.ContactAddedListenerImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContactAddedListenerFactory
    implements Factory<ContactAddedListener> {
  private final AppModule module;

  private final Provider<ContactAddedListenerImpl> listenerProvider;

  public AppModule_ProvideContactAddedListenerFactory(
      AppModule module, Provider<ContactAddedListenerImpl> listenerProvider) {
    this.module = module;
    this.listenerProvider = listenerProvider;
  }

  @Override
  public ContactAddedListener get() {
    return provideInstance(module, listenerProvider);
  }

  public static ContactAddedListener provideInstance(
      AppModule module, Provider<ContactAddedListenerImpl> listenerProvider) {
    return proxyProvideContactAddedListener(module, listenerProvider.get());
  }

  public static AppModule_ProvideContactAddedListenerFactory create(
      AppModule module, Provider<ContactAddedListenerImpl> listenerProvider) {
    return new AppModule_ProvideContactAddedListenerFactory(module, listenerProvider);
  }

  public static ContactAddedListener proxyProvideContactAddedListener(
      AppModule instance, ContactAddedListenerImpl listener) {
    return Preconditions.checkNotNull(
        instance.provideContactAddedListener(listener),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
