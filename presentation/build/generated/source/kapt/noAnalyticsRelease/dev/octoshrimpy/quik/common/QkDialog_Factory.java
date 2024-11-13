package dev.octoshrimpy.quik.common;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkDialog_Factory implements Factory<QkDialog> {
  private final Provider<Context> contextProvider;

  private final Provider<MenuItemAdapter> adapterProvider;

  public QkDialog_Factory(
      Provider<Context> contextProvider, Provider<MenuItemAdapter> adapterProvider) {
    this.contextProvider = contextProvider;
    this.adapterProvider = adapterProvider;
  }

  @Override
  public QkDialog get() {
    return provideInstance(contextProvider, adapterProvider);
  }

  public static QkDialog provideInstance(
      Provider<Context> contextProvider, Provider<MenuItemAdapter> adapterProvider) {
    return new QkDialog(contextProvider.get(), adapterProvider.get());
  }

  public static QkDialog_Factory create(
      Provider<Context> contextProvider, Provider<MenuItemAdapter> adapterProvider) {
    return new QkDialog_Factory(contextProvider, adapterProvider);
  }

  public static QkDialog newQkDialog(Context context, MenuItemAdapter adapter) {
    return new QkDialog(context, adapter);
  }
}
