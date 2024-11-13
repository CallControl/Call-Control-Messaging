package dev.octoshrimpy.quik.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.mapper.CursorToContactGroupMember;
import dev.octoshrimpy.quik.mapper.CursorToContactGroupMemberImpl;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCursorToContactGroupMemberFactory
    implements Factory<CursorToContactGroupMember> {
  private final AppModule module;

  private final Provider<CursorToContactGroupMemberImpl> mapperProvider;

  public AppModule_ProvideCursorToContactGroupMemberFactory(
      AppModule module, Provider<CursorToContactGroupMemberImpl> mapperProvider) {
    this.module = module;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CursorToContactGroupMember get() {
    return provideInstance(module, mapperProvider);
  }

  public static CursorToContactGroupMember provideInstance(
      AppModule module, Provider<CursorToContactGroupMemberImpl> mapperProvider) {
    return proxyProvideCursorToContactGroupMember(module, mapperProvider.get());
  }

  public static AppModule_ProvideCursorToContactGroupMemberFactory create(
      AppModule module, Provider<CursorToContactGroupMemberImpl> mapperProvider) {
    return new AppModule_ProvideCursorToContactGroupMemberFactory(module, mapperProvider);
  }

  public static CursorToContactGroupMember proxyProvideCursorToContactGroupMember(
      AppModule instance, CursorToContactGroupMemberImpl mapper) {
    return Preconditions.checkNotNull(
        instance.provideCursorToContactGroupMember(mapper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
