package dev.octoshrimpy.quik.feature.main;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchAdapter_Factory implements Factory<SearchAdapter> {
  private final Provider<Colors> colorsProvider;

  private final Provider<Context> contextProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<Navigator> navigatorProvider;

  public SearchAdapter_Factory(
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider) {
    this.colorsProvider = colorsProvider;
    this.contextProvider = contextProvider;
    this.dateFormatterProvider = dateFormatterProvider;
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public SearchAdapter get() {
    return provideInstance(
        colorsProvider, contextProvider, dateFormatterProvider, navigatorProvider);
  }

  public static SearchAdapter provideInstance(
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider) {
    return new SearchAdapter(
        colorsProvider.get(),
        contextProvider.get(),
        dateFormatterProvider.get(),
        navigatorProvider.get());
  }

  public static SearchAdapter_Factory create(
      Provider<Colors> colorsProvider,
      Provider<Context> contextProvider,
      Provider<DateFormatter> dateFormatterProvider,
      Provider<Navigator> navigatorProvider) {
    return new SearchAdapter_Factory(
        colorsProvider, contextProvider, dateFormatterProvider, navigatorProvider);
  }

  public static SearchAdapter newSearchAdapter(
      Colors colors, Context context, DateFormatter dateFormatter, Navigator navigator) {
    return new SearchAdapter(colors, context, dateFormatter, navigator);
  }
}
