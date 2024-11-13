package dev.octoshrimpy.quik.feature.gallery;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GalleryActivity_MembersInjector implements MembersInjector<GalleryActivity> {
  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<GalleryPagerAdapter> pagerAdapterProvider;

  public GalleryActivity_MembersInjector(
      Provider<DateFormatter> dateFormatterProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<GalleryPagerAdapter> pagerAdapterProvider) {
    this.dateFormatterProvider = dateFormatterProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.pagerAdapterProvider = pagerAdapterProvider;
  }

  public static MembersInjector<GalleryActivity> create(
      Provider<DateFormatter> dateFormatterProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<GalleryPagerAdapter> pagerAdapterProvider) {
    return new GalleryActivity_MembersInjector(
        dateFormatterProvider, viewModelFactoryProvider, pagerAdapterProvider);
  }

  @Override
  public void injectMembers(GalleryActivity instance) {
    injectDateFormatter(instance, dateFormatterProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectPagerAdapter(instance, pagerAdapterProvider.get());
  }

  public static void injectDateFormatter(GalleryActivity instance, DateFormatter dateFormatter) {
    instance.dateFormatter = dateFormatter;
  }

  public static void injectViewModelFactory(
      GalleryActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectPagerAdapter(
      GalleryActivity instance, GalleryPagerAdapter pagerAdapter) {
    instance.pagerAdapter = pagerAdapter;
  }
}
