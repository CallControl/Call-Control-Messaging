package dev.octoshrimpy.quik.feature.main;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityModule_ProvideCompositeDiposableLifecycleFactory
    implements Factory<CompositeDisposable> {
  private final MainActivityModule module;

  public MainActivityModule_ProvideCompositeDiposableLifecycleFactory(MainActivityModule module) {
    this.module = module;
  }

  @Override
  public CompositeDisposable get() {
    return provideInstance(module);
  }

  public static CompositeDisposable provideInstance(MainActivityModule module) {
    return proxyProvideCompositeDiposableLifecycle(module);
  }

  public static MainActivityModule_ProvideCompositeDiposableLifecycleFactory create(
      MainActivityModule module) {
    return new MainActivityModule_ProvideCompositeDiposableLifecycleFactory(module);
  }

  public static CompositeDisposable proxyProvideCompositeDiposableLifecycle(
      MainActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideCompositeDiposableLifecycle(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
