package dev.octoshrimpy.quik.mapper;

import com.f2prateek.rx.preferences2.RxSharedPreferences;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RatingManagerImpl_Factory implements Factory<RatingManagerImpl> {
  private final Provider<RxSharedPreferences> rxPrefsProvider;

  private final Provider<AnalyticsManager> analyticsManagerProvider;

  public RatingManagerImpl_Factory(
      Provider<RxSharedPreferences> rxPrefsProvider,
      Provider<AnalyticsManager> analyticsManagerProvider) {
    this.rxPrefsProvider = rxPrefsProvider;
    this.analyticsManagerProvider = analyticsManagerProvider;
  }

  @Override
  public RatingManagerImpl get() {
    return provideInstance(rxPrefsProvider, analyticsManagerProvider);
  }

  public static RatingManagerImpl provideInstance(
      Provider<RxSharedPreferences> rxPrefsProvider,
      Provider<AnalyticsManager> analyticsManagerProvider) {
    return new RatingManagerImpl(rxPrefsProvider.get(), analyticsManagerProvider.get());
  }

  public static RatingManagerImpl_Factory create(
      Provider<RxSharedPreferences> rxPrefsProvider,
      Provider<AnalyticsManager> analyticsManagerProvider) {
    return new RatingManagerImpl_Factory(rxPrefsProvider, analyticsManagerProvider);
  }

  public static RatingManagerImpl newRatingManagerImpl(
      RxSharedPreferences rxPrefs, AnalyticsManager analyticsManager) {
    return new RatingManagerImpl(rxPrefs, analyticsManager);
  }
}
