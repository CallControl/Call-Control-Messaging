package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.repository.ContactRepository;
import dev.octoshrimpy.quik.repository.ContactRepositoryImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContactRepositoryFactory implements Factory<ContactRepository> {
  private final AppModule module;

  private final Provider<ContactRepositoryImpl> repositoryProvider;

  public AppModule_ProvideContactRepositoryFactory(
      AppModule module, Provider<ContactRepositoryImpl> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ContactRepository get() {
    return provideInstance(module, repositoryProvider);
  }

  public static ContactRepository provideInstance(
      AppModule module, Provider<ContactRepositoryImpl> repositoryProvider) {
    return proxyProvideContactRepository(module, repositoryProvider.get());
  }

  public static AppModule_ProvideContactRepositoryFactory create(
      AppModule module, Provider<ContactRepositoryImpl> repositoryProvider) {
    return new AppModule_ProvideContactRepositoryFactory(module, repositoryProvider);
  }

  public static ContactRepository proxyProvideContactRepository(
      AppModule instance, ContactRepositoryImpl repository) {
    return Preconditions.checkNotNull(
        instance.provideContactRepository(repository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
