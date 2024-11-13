package dev.octoshrimpy.quik.injection;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences2.RxSharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRxPreferencesFactory implements Factory<RxSharedPreferences> {
  private final AppModule module;

  private final Provider<SharedPreferences> preferencesProvider;

  public AppModule_ProvideRxPreferencesFactory(
      AppModule module, Provider<SharedPreferences> preferencesProvider) {
    this.module = module;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public RxSharedPreferences get() {
    return provideInstance(module, preferencesProvider);
  }

  public static RxSharedPreferences provideInstance(
      AppModule module, Provider<SharedPreferences> preferencesProvider) {
    return proxyProvideRxPreferences(module, preferencesProvider.get());
  }

  public static AppModule_ProvideRxPreferencesFactory create(
      AppModule module, Provider<SharedPreferences> preferencesProvider) {
    return new AppModule_ProvideRxPreferencesFactory(module, preferencesProvider);
  }

  public static RxSharedPreferences proxyProvideRxPreferences(
      AppModule instance, SharedPreferences preferences) {
    return Preconditions.checkNotNull(
        instance.provideRxPreferences(preferences),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
