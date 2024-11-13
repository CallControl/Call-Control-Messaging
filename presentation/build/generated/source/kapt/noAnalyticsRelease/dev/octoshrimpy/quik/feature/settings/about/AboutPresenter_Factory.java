package dev.octoshrimpy.quik.feature.settings.about;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AboutPresenter_Factory implements Factory<AboutPresenter> {
  private final Provider<Navigator> navigatorProvider;

  public AboutPresenter_Factory(Provider<Navigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public AboutPresenter get() {
    return provideInstance(navigatorProvider);
  }

  public static AboutPresenter provideInstance(Provider<Navigator> navigatorProvider) {
    return new AboutPresenter(navigatorProvider.get());
  }

  public static AboutPresenter_Factory create(Provider<Navigator> navigatorProvider) {
    return new AboutPresenter_Factory(navigatorProvider);
  }

  public static AboutPresenter newAboutPresenter(Navigator navigator) {
    return new AboutPresenter(navigator);
  }
}
