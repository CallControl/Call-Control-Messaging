package dev.octoshrimpy.quik.feature.settings.about;

import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AboutController_MembersInjector implements MembersInjector<AboutController> {
  private final Provider<AboutPresenter> presenterProvider;

  public AboutController_MembersInjector(Provider<AboutPresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<AboutController> create(
      Provider<AboutPresenter> presenterProvider) {
    return new AboutController_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(AboutController instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(AboutController instance, AboutPresenter presenter) {
    instance.presenter = presenter;
  }
}
