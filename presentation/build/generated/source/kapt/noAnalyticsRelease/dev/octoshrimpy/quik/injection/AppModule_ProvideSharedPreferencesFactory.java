package dev.octoshrimpy.quik.injection;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideSharedPreferencesFactory(
      AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module, contextProvider);
  }

  public static SharedPreferences provideInstance(
      AppModule module, Provider<Context> contextProvider) {
    return proxyProvideSharedPreferences(module, contextProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      AppModule module, Provider<Context> contextProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(module, contextProvider);
  }

  public static SharedPreferences proxyProvideSharedPreferences(
      AppModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideSharedPreferences(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
