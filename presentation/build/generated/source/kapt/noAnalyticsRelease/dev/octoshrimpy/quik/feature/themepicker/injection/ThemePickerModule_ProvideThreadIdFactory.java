package dev.octoshrimpy.quik.feature.themepicker.injection;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThemePickerModule_ProvideThreadIdFactory implements Factory<Long> {
  private final ThemePickerModule module;

  public ThemePickerModule_ProvideThreadIdFactory(ThemePickerModule module) {
    this.module = module;
  }

  @Override
  public Long get() {
    return provideInstance(module);
  }

  public static Long provideInstance(ThemePickerModule module) {
    return proxyProvideThreadId(module);
  }

  public static ThemePickerModule_ProvideThreadIdFactory create(ThemePickerModule module) {
    return new ThemePickerModule_ProvideThreadIdFactory(module);
  }

  public static long proxyProvideThreadId(ThemePickerModule instance) {
    return instance.provideThreadId();
  }
}
