package dev.octoshrimpy.quik.injection;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContentResolverFactory implements Factory<ContentResolver> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideContentResolverFactory(
      AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ContentResolver get() {
    return provideInstance(module, contextProvider);
  }

  public static ContentResolver provideInstance(
      AppModule module, Provider<Context> contextProvider) {
    return proxyProvideContentResolver(module, contextProvider.get());
  }

  public static AppModule_ProvideContentResolverFactory create(
      AppModule module, Provider<Context> contextProvider) {
    return new AppModule_ProvideContentResolverFactory(module, contextProvider);
  }

  public static ContentResolver proxyProvideContentResolver(AppModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideContentResolver(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
