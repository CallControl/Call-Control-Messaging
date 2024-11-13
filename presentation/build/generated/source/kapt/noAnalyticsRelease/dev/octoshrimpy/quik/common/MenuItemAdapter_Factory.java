package dev.octoshrimpy.quik.common;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MenuItemAdapter_Factory implements Factory<MenuItemAdapter> {
  private final Provider<Context> contextProvider;

  private final Provider<Colors> colorsProvider;

  public MenuItemAdapter_Factory(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    this.contextProvider = contextProvider;
    this.colorsProvider = colorsProvider;
  }

  @Override
  public MenuItemAdapter get() {
    return provideInstance(contextProvider, colorsProvider);
  }

  public static MenuItemAdapter provideInstance(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    return new MenuItemAdapter(contextProvider.get(), colorsProvider.get());
  }

  public static MenuItemAdapter_Factory create(
      Provider<Context> contextProvider, Provider<Colors> colorsProvider) {
    return new MenuItemAdapter_Factory(contextProvider, colorsProvider);
  }

  public static MenuItemAdapter newMenuItemAdapter(Context context, Colors colors) {
    return new MenuItemAdapter(context, colors);
  }
}
